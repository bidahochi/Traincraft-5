package train.client.render.lighting;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.vector.Matrix4f;
import train.common.Traincraft;

/**
 * Draws nearby vehicles from each light's viewpoint to determine which parts of its beam they block.
 * The result is a shadow map: a small image stored on the graphics card, called a texture, whose
 * entries record the nearest vehicle surface. The entries hold depth values instead of colors.
 * Smaller depth values mean nearer surfaces in the light's view; they are not distances in blocks.
 * The beam shader, the graphics-card program that draws the cone, reads this map to hide beam pixels
 * behind those surfaces. Vehicle shapes and their positions are supplied by
 * {@link RollingStockLightOcclusion}, which records them while the vehicles are drawn normally.
 *
 * <p>Every three-element geometry array uses {@code [0] = x}, {@code [1] = y}, and
 * {@code [2] = z}.
 */
final class RollingStockShadowRenderer
{
    private static final int SHADOW_SIZE = 256;
    private static final float NEAR_DISTANCE = 0.03F;
    /**
     * Tolerance for rounding differences when comparing a cone pixel with the stored surface depth.
     * Too much tolerance lets light extend behind a blocker. This uses depth values, not block distances.
     * Keep the comparison in BeamProjectionShader consistent with isShadowed when changing this rule.
     */
    static final float DEPTH_BIAS = 0.0015F;
    private static final float MINIMUM_NEAR_HALF_WIDTH = 0.0001F;
    private static final float VERTICAL_HALF_WIDTH_SCALE = 0.6F;
    private static final float RADIANS_TO_DEGREES = (float)(180.0D / Math.PI);
    private static final float MINIMUM_UP_VECTOR_LENGTH = 1.0E-5F;
    private static final FloatBuffer MATRIX_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer POSE_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final Matrix4f PROJECTION = new Matrix4f();
    private static final Matrix4f LIGHT_VIEW = new Matrix4f();
    private static final Matrix4f EYE_TO_SHADOW = new Matrix4f();
    /**
     * Reused {@code [x, y, z]} arrays describing the light and enclosing boxes in camera coordinates:
     * positions and directions after conversion to the player's viewpoint, before conversion to the
     * light's viewpoint. They must use the same coordinates as the saved vehicle positions.
     */
    private static final float[] ORIGIN = new float[3];
    private static final float[] DIRECTION = new float[3];
    private static final float[] UP = new float[3];
    private static final float[] BOUNDS_MINIMUM = new float[3];
    private static final float[] BOUNDS_MAXIMUM = new float[3];

    /**
     * Reusable offscreen drawing target (framebuffer) and its depth texture. Reuse their storage, but
     * clear the texture for every prepared light; selecting the target does not erase its contents.
     */
    private static int framebuffer;
    private static int depthTexture;
    private static boolean availableForCurrentLight;
    private static boolean failed;
    private static boolean loggedFailure;
    /** OpenGL graphics session that owns the resource identifiers; they are not valid in another session. */
    private static ContextCapabilities allocatedContext;

    private RollingStockShadowRenderer() {}

    /**
     * Marks the shadow map unavailable without erasing its contents. Each prepared light clears the
     * map in {@link #render}; clearing only once per frame would still leave one headlight's shadows
     * in another headlight's map.
     */
    static void beginFrame()
    {
        availableForCurrentLight = false;
    }

    /**
     * Builds a shadow map when the box check finds another vehicle that may overlap this beam.
     *
     * <p>Mark the map unavailable before any early return so the shader cannot use a previous light's
     * map. A successfully prepared map may contain no blockers and must still be freshly cleared.
     * Enclosing boxes can overlap the beam even when the vehicle's actual surfaces do not.
     * Returning false means no current map is available, not that the cone should disappear.
     * A caught drawing failure disables further attempts until {@link #clear} resets that failure.
     * Use the map for this light before calling prepare for another light.
     *
     * @return whether a shadow texture was prepared for this submission
     */
    static boolean prepare(LightEffectSubmission submission)
    {
        availableForCurrentLight = false;
        if (OpenGlHelper.shadersSupported == false || failed)
        {
            return false;
        }
        List<RollingStockLightOcclusion.Entry> entries = RollingStockLightOcclusion.entries();
        if (entries.isEmpty())
        {
            return false;
        }
        float nominalLength = FixedFunctionBeamGeometry.effectiveLength(
                                  submission.definition.beamLength(),
                                  submission.beamScale,
                                  submission.fixtureReach);
        float visibleLength = submission.impactResolution.visibleLength(nominalLength, true);
        float beamWidth = FixedFunctionBeamGeometry.effectiveWidth(
                              submission.definition.beamWidth(),
                              submission.beamScale,
                              submission.fixtureReach);
        if (visibleLength <= NEAR_DISTANCE || beamWidth <= 0.0F)
        {
            return false;
        }
        submission.eyePoint(submission.x, submission.y, submission.z, ORIGIN);
        submission.eyeDirection(submission.dx, submission.dy, submission.dz, DIRECTION);
        submission.eyeDirection(submission.upX, submission.upY, submission.upZ, UP);
        makeOrthogonalUp(DIRECTION, UP);
        float[] origin = ORIGIN;
        float[] direction = DIRECTION;
        BeamImpact impact = submission.impactResolution.impact;
        // The center ray is the straight line through the beam's middle. If it hits a vehicle,
        // the cone already ends at that surface, so this map need not draw that vehicle again.
        int terminatingStockOwnerId =
            impact != null && impact.target == BeamImpact.Target.ROLLING_STOCK
            ? impact.targetOwnerId
            : Integer.MIN_VALUE;
        if (hasCandidate(
                    entries,
                    submission.ownerId,
                    terminatingStockOwnerId,
                    origin,
                    direction,
                    visibleLength,
                    beamWidth)
                == false)
        {
            return false;
        }
        try
        {
            ensure();
            render(
                entries,
                submission.ownerId,
                terminatingStockOwnerId,
                origin,
                direction,
                UP,
                visibleLength,
                beamWidth);
            availableForCurrentLight = true;
            return true;
        }
        catch (IllegalStateException | OpenGLException failure)
        {
            // Keep exact beam endpoints, but skip these shadows that hide only part of a cone.
            // This failure does not select the alternative fixed-function beam renderer, which
            // cannot read shadow maps and instead also stops beams at enclosing vehicle boxes.
            failed = true;
            availableForCurrentLight = false;
            if (loggedFailure == false)
            {
                loggedFailure = true;
                Traincraft.tcLog.warn(
                    "Rolling-stock light-space shadows are unavailable; cone geometry remains unchanged.",
                    failure);
            }
            releaseTarget();
            return false;
        }
    }

    /** Reports whether the texture and coordinate conversion are ready for the current light. */
    static boolean available()
    {
        return availableForCurrentLight && depthTexture != 0;
    }

    /** Returns the graphics-card texture identifier; use it only when {@link #available} is true. */
    static int texture()
    {
        return depthTexture;
    }

    /**
     * Returns the matrix that converts player-camera coordinates to the current light's shadow view.
     * Use it with the texture from the same successful {@link #prepare} call. This buffer is reused;
     * read or upload its contents before requesting another matrix or preparing another light.
     */
    static FloatBuffer matrixBuffer()
    {
        MATRIX_BUFFER.clear();
        EYE_TO_SHADOW.store(MATRIX_BUFFER);
        MATRIX_BUFFER.flip();
        return MATRIX_BUFFER;
    }

    /** Stops using the current light's map without erasing or deleting the reusable graphics resources. */
    static void clearCurrent()
    {
        availableForCurrentLight = false;
    }

    /**
     * Returns whether a cone pixel is farther from the light than the stored surface, allowing for
     * rounding differences. Both arguments must be depth values from the same light's view.
     */
    static boolean isShadowed(float fragmentDepth, float storedDepth)
    {
        return fragmentDepth > storedDepth + DEPTH_BIAS;
    }

    /**
     * Releases resources and resets the failure flag so shadow rendering can be attempted again.
     * Resources from a different graphics session are forgotten rather than deleted in the new one,
     * where the same numeric identifiers could refer to unrelated resources.
     */
    static void clear()
    {
        ContextCapabilities current = currentContext();
        if (allocatedContext == null || allocatedContext == current)
        {
            releaseTarget();
        }
        else
        {
            framebuffer = 0;
            depthTexture = 0;
        }
        allocatedContext = null;
        failed = false;
        loggedFailure = false;
        availableForCurrentLight = false;
    }

    /**
     * Checks whether any nearby vehicle might block this beam. Skip the emitting vehicle and the
     * vehicle where the beam already ends.
     */
    private static boolean hasCandidate(
        List<RollingStockLightOcclusion.Entry> entries,
        int ownerId,
        int terminatingStockOwnerId,
        float[] origin,
        float[] direction,
        float length,
        float beamWidth)
    {
        for (RollingStockLightOcclusion.Entry entry : entries)
        {
            if (entry.ownerId == ownerId
                    || entry.ownerId == terminatingStockOwnerId
                    || isCandidate(entry, origin, direction, length, beamWidth) == false)
            {
                continue;
            }
            return true;
        }
        return false;
    }

    /**
     * Uses a box enclosing the vehicle for a quick overlap check. Convert its corners into camera
     * coordinates, enclose them in a new box, expand that box by the beam width, and check the beam's
     * center line against it. A positive result means the vehicle needs closer inspection; it does
     * not prove that any of its surfaces block the beam. Use this same check when selecting vehicles
     * and when drawing their shadows so those two stages agree.
     * When changing this check, allow extra vehicles rather than missing a surface that could block
     * the beam. Verify camera rotations and empty candidates with BeamRenderStateTest.
     */
    private static boolean isCandidate(
        RollingStockLightOcclusion.Entry entry,
        float[] origin,
        float[] direction,
        float length,
        float beamWidth)
    {
        if (entry.bounds == null)
        {
            return false;
        }
        for (int axis = 0; axis < 3; axis++)
        {
            BOUNDS_MINIMUM[axis] = Float.POSITIVE_INFINITY;
            BOUNDS_MAXIMUM[axis] = Float.NEGATIVE_INFINITY;
        }
        for (int corner = 0; corner < 8; corner++)
        {
            float x = (corner & 1) == 0
                      ? entry.bounds.minimumX : entry.bounds.maximumX;
            float y = (corner & 2) == 0
                      ? entry.bounds.minimumY : entry.bounds.maximumY;
            float z = (corner & 4) == 0
                      ? entry.bounds.minimumZ : entry.bounds.maximumZ;
            float eyeX = transformX(entry.eyeFromStock, x, y, z);
            float eyeY = transformY(entry.eyeFromStock, x, y, z);
            float eyeZ = transformZ(entry.eyeFromStock, x, y, z);
            BOUNDS_MINIMUM[0] = Math.min(BOUNDS_MINIMUM[0], eyeX);
            BOUNDS_MINIMUM[1] = Math.min(BOUNDS_MINIMUM[1], eyeY);
            BOUNDS_MINIMUM[2] = Math.min(BOUNDS_MINIMUM[2], eyeZ);
            BOUNDS_MAXIMUM[0] = Math.max(BOUNDS_MAXIMUM[0], eyeX);
            BOUNDS_MAXIMUM[1] = Math.max(BOUNDS_MAXIMUM[1], eyeY);
            BOUNDS_MAXIMUM[2] = Math.max(BOUNDS_MAXIMUM[2], eyeZ);
        }
        for (int axis = 0; axis < 3; axis++)
        {
            BOUNDS_MINIMUM[axis] -= beamWidth;
            BOUNDS_MAXIMUM[axis] += beamWidth;
        }
        return BeamImpactResolver.intersectAxisAlignedBounds(
                   origin, direction, BOUNDS_MINIMUM, BOUNDS_MAXIMUM, length)
               != Float.POSITIVE_INFINITY;
    }

    /**
     * Allocates a drawing target and depth texture if the current graphics session does not have them.
     * This creates storage; {@link #render} must still clear it before each light uses it.
     */
    private static void ensure()
    {
        ContextCapabilities current = GLContext.getCapabilities();
        if (allocatedContext != null && allocatedContext != current)
        {
            framebuffer = 0;
            depthTexture = 0;
        }
        if (framebuffer != 0)
        {
            return;
        }
        framebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
        depthTexture = GL11.glGenTextures();
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        try
        {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexImage2D(
                GL11.GL_TEXTURE_2D,
                0,
                GL11.GL_DEPTH_COMPONENT,
                SHADOW_SIZE,
                SHADOW_SIZE,
                0,
                GL11.GL_DEPTH_COMPONENT,
                GL11.GL_FLOAT,
                (ByteBuffer) null);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
            EXTFramebufferObject.glFramebufferTexture2DEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT,
                GL11.GL_TEXTURE_2D,
                depthTexture,
                0);
            GL11.glDrawBuffer(GL11.GL_NONE);
            GL11.glReadBuffer(GL11.GL_NONE);
            int status = EXTFramebufferObject.glCheckFramebufferStatusEXT(
                             EXTFramebufferObject.GL_FRAMEBUFFER_EXT);
            if (status != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT)
            {
                throw new IllegalStateException(
                    "Incomplete rolling-stock shadow framebuffer: 0x"
                    + Integer.toHexString(status));
            }
        }
        finally
        {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
        allocatedContext = current;
    }

    /**
     * Clears the shadow map and draws the selected vehicles from the current light's viewpoint.
     *
     * <p>Enable depth writes and disable the scissor rectangle before clearing, even if no vehicle
     * surfaces will be drawn. Keep those settings for the entire shadow pass. The saved OpenGL
     * attributes restore the caller's settings afterward, including disabled depth writes for
     * transparent cones. Leaving depth writes enabled there could make one cone hide another.
     *
     * <p>OpenGL settings are shared with the rest of the renderer. Preserve the save/restore pairs
     * when changing this method, and restore settings in {@code finally} even when drawing fails.
     * The saved attributes cover settings such as depth writes and the scissor rectangle. The drawing
     * target, shader program, coordinate matrices, and active texture unit (the selected texture slot)
     * also have explicit restoration below.
     *
     * @param entries saved vehicle shapes and positions from the normal vehicle drawing step
     * @param ownerId identifier of the vehicle emitting the light, excluded from its own shadows
     * @param terminatingStockOwnerId identifier of the vehicle where the cone already ends, also excluded
     * @param origin light position in the same camera coordinates as the saved vehicle positions
     * @param direction direction the light points in camera coordinates, with length one
     * @param up direction considered upward in the light's view, perpendicular to its direction
     * @param length distance to the far end of the light's view
     * @param width horizontal distance from the center to one edge at that far end (half the full width)
     */
    private static void render(
        List<RollingStockLightOcclusion.Entry> entries,
        int ownerId,
        int terminatingStockOwnerId,
        float[] origin,
        float[] direction,
        float[] up,
        float length,
        float width)
    {
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        // Set the width and reach of the view drawn from the light. Keep its horizontal and vertical
        // dimensions consistent with the actual cone in LightEffectRenderBatch when changing them.
        float nearWidth = Math.max(MINIMUM_NEAR_HALF_WIDTH, width * NEAR_DISTANCE / length);
        GL11.glFrustum(
            -nearWidth,
            nearWidth,
            -nearWidth * VERTICAL_HALF_WIDTH_SCALE,
            nearWidth * VERTICAL_HALF_WIDTH_SCALE,
            NEAR_DISTANCE,
            length);
        captureCurrentMatrix(PROJECTION);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GLU.gluLookAt(
            origin[0], origin[1], origin[2],
            origin[0] + direction[0],
            origin[1] + direction[1],
            origin[2] + direction[2],
            up[0], up[1], up[2]);
        captureCurrentMatrix(LIGHT_VIEW);
        Matrix4f.mul(PROJECTION, LIGHT_VIEW, EYE_TO_SHADOW);
        try
        {
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
            GL11.glViewport(0, 0, SHADOW_SIZE, SHADOW_SIZE);
            // glClear obeys the depth write mask and scissor test, which restricts changes to a
            // rectangle. Allow writes across the entire map before clearing, even if no surfaces
            // will be drawn. Depth 1.0 means no blocker within this light's view. Preserve this order
            // and check BeamRenderStateTest after changes to clearing or saved graphics settings.
            GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glClearDepth(1.0D);
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            OpenGlHelper.func_153161_d(0);
            GL11.glColorMask(false, false, false, false);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            // Keep the nearest surface at each position. Farther surfaces cannot replace nearer
            // ones, so drawing alone cannot remove old blockers; the full clear above is required.
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_LIGHTING);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            for (RollingStockLightOcclusion.Entry entry : entries)
            {
                if (entry.ownerId == ownerId
                        || entry.ownerId == terminatingStockOwnerId
                        || isCandidate(entry, origin, direction, length, width) == false)
                {
                    continue;
                }
                for (RollingStockLightOcclusion.PartPose part : entry.parts)
                {
                    drawPart(part);
                }
            }
        }
        finally
        {
            OpenGlHelper.func_153161_d(previousProgram);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(previousMatrixMode);
            GL11.glPopAttrib();
            OpenGlHelper.setActiveTexture(previousActiveTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }

    /**
     * Draws a vehicle part using the position, rotation, and scale saved when the vehicle was rendered.
     * Apply rotations in the same order as the original drawing so the shadow matches the visible
     * vehicle. The view set up by {@link #render} then draws this positioned part from the light.
     */
    private static void drawPart(RollingStockLightOcclusion.PartPose pose)
    {
        GL11.glPushMatrix();
        POSE_BUFFER.clear();
        POSE_BUFFER.put(pose.parentPose).flip();
        GL11.glMultMatrix(POSE_BUFFER);
        GL11.glTranslatef(
            pose.rotationPointX * pose.scale,
            pose.rotationPointY * pose.scale,
            pose.rotationPointZ * pose.scale);
        if (pose.rotationOrder)
        {
            if (pose.rotateAngleZ != 0.0F)
            {
            GL11.glRotatef(pose.rotateAngleZ * RADIANS_TO_DEGREES, 0.0F, 0.0F, 1.0F);
            }
            if (pose.rotateAngleY != 0.0F)
            {
            GL11.glRotatef(pose.rotateAngleY * RADIANS_TO_DEGREES, 0.0F, 1.0F, 0.0F);
            }
        }
        else
        {
            if (pose.rotateAngleY != 0.0F)
            {
            GL11.glRotatef(pose.rotateAngleY * RADIANS_TO_DEGREES, 0.0F, 1.0F, 0.0F);
            }
            if (pose.rotateAngleZ != 0.0F)
            {
            GL11.glRotatef(pose.rotateAngleZ * RADIANS_TO_DEGREES, 0.0F, 0.0F, 1.0F);
            }
        }
        if (pose.rotateAngleX != 0.0F)
        {
            GL11.glRotatef(pose.rotateAngleX * RADIANS_TO_DEGREES, 1.0F, 0.0F, 0.0F);
        }
        pose.part.renderDepthGeometry(pose.scale);
        GL11.glPopMatrix();
    }

    private static void captureCurrentMatrix(Matrix4f destination)
    {
        MATRIX_BUFFER.clear();
        GL11.glGetFloat(
            GL11.glGetInteger(GL11.GL_MATRIX_MODE) == GL11.GL_PROJECTION
            ? GL11.GL_PROJECTION_MATRIX
            : GL11.GL_MODELVIEW_MATRIX,
            MATRIX_BUFFER);
        MATRIX_BUFFER.rewind();
        destination.load(MATRIX_BUFFER);
    }

    private static float transformX(float[] pose, float x, float y, float z)
    {
        return pose[0] * x + pose[4] * y + pose[8] * z + pose[12];
    }

    private static float transformY(float[] pose, float x, float y, float z)
    {
        return pose[1] * x + pose[5] * y + pose[9] * z + pose[13];
    }

    private static float transformZ(float[] pose, float x, float y, float z)
    {
        return pose[2] * x + pose[6] * y + pose[10] * z + pose[14];
    }

    private static float length(float x, float y, float z)
    {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Adjusts the light's up direction to be perpendicular to the beam and have length one. This keeps
     * the light's view correctly oriented. If the supplied up direction runs along the beam, this method
     * chooses a different direction first. The supplied beam direction must already have length one.
     */
    private static void makeOrthogonalUp(float[] direction, float[] up)
    {
        float projection = direction[0] * up[0]
                           + direction[1] * up[1]
                           + direction[2] * up[2];
        up[0] -= direction[0] * projection;
        up[1] -= direction[1] * projection;
        up[2] -= direction[2] * projection;
        float upLength = length(up[0], up[1], up[2]);
        if (upLength <= MINIMUM_UP_VECTOR_LENGTH)
        {
            if (Math.abs(direction[1]) < 0.95F)
            {
                up[0] = 0.0F;
                up[1] = 1.0F;
                up[2] = 0.0F;
            }
            else
            {
                up[0] = 1.0F;
                up[1] = 0.0F;
                up[2] = 0.0F;
            }
            projection = direction[0] * up[0]
                         + direction[1] * up[1]
                         + direction[2] * up[2];
            up[0] -= direction[0] * projection;
            up[1] -= direction[1] * projection;
            up[2] -= direction[2] * projection;
            upLength = length(up[0], up[1], up[2]);
        }
        up[0] /= upLength;
        up[1] /= upLength;
        up[2] /= upLength;
    }

    private static ContextCapabilities currentContext()
    {
        try
        {
            return GLContext.getCapabilities();
        }
        catch (IllegalStateException noContext)
        {
            return null;
        }
    }

    private static void releaseTarget()
    {
        if (depthTexture != 0)
        {
            GL11.glDeleteTextures(depthTexture);
        }
        if (framebuffer != 0)
        {
            EXTFramebufferObject.glDeleteFramebuffersEXT(framebuffer);
        }
        depthTexture = 0;
        framebuffer = 0;
    }
}
