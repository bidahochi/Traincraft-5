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
 * Renders foreign rolling-stock candidates into a reusable light-space depth map for one fixture.
 *
 * <p>Captured model geometry is replayed from the light position only when transformed stock bounds
 * overlap that cone. The emitting owner is excluded from this cross-stock map, while the
 * screen-space ownership mask prevents false rejection where the owner is visible. A center-ray
 * terminating vehicle is also excluded because the cone is already shortened to that surface.
 * The eye-to-shadow transform and texture remain valid only for the
 * current fixture. OpenGL resources belong to the creating context. Failure disables this
 * optional partial-cone shadowing. Exact center-hit truncation still applies. Edge-only overlap
 * remains unshadowed while the GLSL path stays active; conservative boundary truncation is used
 * only by the fixed-function path.
 * Every three-element geometry array uses {@code [0] = x}, {@code [1] = y}, and
 * {@code [2] = z}.
 */
final class RollingStockShadowRenderer
{
    private static final int SHADOW_SIZE = 256;
    private static final float NEAR_DISTANCE = 0.03F;
    /** Prevents equal-depth shadow texels from rejecting their own receiving surface. */
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
    /** Reusable {@code [x, y, z]} light origin, direction, up, and bounds vectors. */
    private static final float[] ORIGIN = new float[3];
    private static final float[] DIRECTION = new float[3];
    private static final float[] UP = new float[3];
    private static final float[] BOUNDS_MINIMUM = new float[3];
    private static final float[] BOUNDS_MAXIMUM = new float[3];

    private static int framebuffer;
    private static int depthTexture;
    private static boolean availableForCurrentLight;
    private static boolean failed;
    private static boolean loggedFailure;
    private static ContextCapabilities allocatedContext;

    private RollingStockShadowRenderer() {}

    /** Clears per-fixture availability before rendering this frame's beams. */
    static void beginFrame()
    {
        availableForCurrentLight = false;
    }

    /**
     * Builds a light-space depth map when a foreign-stock broad-phase candidate exists.
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

    static boolean available()
    {
        return availableForCurrentLight && depthTexture != 0;
    }

    static int texture()
    {
        return depthTexture;
    }

    static FloatBuffer matrixBuffer()
    {
        MATRIX_BUFFER.clear();
        EYE_TO_SHADOW.store(MATRIX_BUFFER);
        MATRIX_BUFFER.flip();
        return MATRIX_BUFFER;
    }

    static void clearCurrent()
    {
        availableForCurrentLight = false;
    }

    static boolean isShadowed(float fragmentDepth, float storedDepth)
    {
        return fragmentDepth > storedDepth + DEPTH_BIAS;
    }

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

    /** Reports whether any captured foreign stock intersects the beam's conservative broad phase. */
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

    /** Conservative whole-stock beam test shared by discovery and shadow drawing. */
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

    /** Renders candidate foreign-stock triangles into the current beam's light-space depth target. */
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
            GL11.glClearDepth(1.0D);
            GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
            OpenGlHelper.func_153161_d(0);
            GL11.glColorMask(false, false, false, false);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
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

    /** Draws one captured part's exact triangles using its final eye-space transform. */
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

    /** Orthogonalizes and normalizes the light-space up vector against the beam direction. */
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
