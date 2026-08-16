package train.client.render.lighting;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendMinmax;
import org.lwjgl.opengl.EXTFramebufferBlit;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.vector.Matrix4f;
import train.common.Traincraft;

/**
 * Optional screen-space surface illumination backend for rolling-stock headlights.
 * It copies scene depth, reconstructs world positions from the captured camera matrices,
 * and additively composites eligible light volumes. OpenGL objects belong to the context
 * that created them; context changes abandon names without deleting through the new context.
 * Allocation or shader failures disable the backend for the current viewport and callers
 * retain the ordinary beam/glow fallback. The backend is intentionally disabled while its
 * rolling-stock occlusion path is being revised.
 */
final class ClientDynamicHeadlightRenderer
{
    /** Surface illumination is temporarily disabled while its occlusion path is revised. */
    private static final boolean ENABLED = false;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final String VERTEX_SOURCE =
        "#version 120\n"
        + "varying vec2 tcScreenUv;\n"
        + "void main() {\n"
        + "    gl_Position = ftransform();\n"
        + "    tcScreenUv = gl_MultiTexCoord0.xy;\n"
        + "}\n";
    private static final String FRAGMENT_SOURCE =
        "#version 120\n"
        + "uniform sampler2D tcSceneDepth;\n"
        + "uniform sampler2D tcStockMask;\n"
        + "uniform int tcHasStockMask;\n"
        + "uniform mat4 tcInverseProjection;\n"
        + "uniform mat4 tcCapturedEyeToWorld;\n"
        + "uniform vec3 tcSourceWorld;\n"
        + "uniform vec3 tcSourceDirectionWorld;\n"
        + "uniform vec3 tcSourceColor;\n"
        + "uniform float tcSourceLevel;\n"
        + "uniform float tcSourceRadius;\n"
        + "uniform float tcSourceForwardReach;\n"
        + "uniform float tcDaylight;\n"
        + "varying vec2 tcScreenUv;\n"
        + "void main() {\n"
        + "    vec4 stockMask = tcHasStockMask != 0"
        + " ? texture2D(tcStockMask, tcScreenUv) : vec4(0.0);\n"
        + "    float depth = texture2D(tcSceneDepth, tcScreenUv).r;\n"
        + "    if (depth >= 0.999999) discard;\n"
        + "    vec4 clip = vec4(tcScreenUv * 2.0 - 1.0, depth * 2.0 - 1.0, 1.0);\n"
        + "    vec4 eye = tcInverseProjection * clip;\n"
        + "    if (abs(eye.w) < 0.000001) discard;\n"
        + "    vec3 eyePosition = eye.xyz / eye.w;\n"
        + "    vec4 world = tcCapturedEyeToWorld * vec4(eyePosition, 1.0);\n"
        + "    vec3 worldPosition = world.xyz / world.w;\n"
        + "    vec3 offset = worldPosition - tcSourceWorld;\n"
        + "    float rawAlongSource = dot(offset, tcSourceDirectionWorld);\n"
        + "    if (rawAlongSource < -0.001) discard;\n"
        + "    float alongSource = clamp(rawAlongSource,"
        + " 0.0, tcSourceForwardReach);\n"
        + "    vec3 sourceOffset = offset - tcSourceDirectionWorld * alongSource;\n"
        + "    float sourceDistance = length(sourceOffset);\n"
        + "    float radius = tcSourceRadius;\n"
        + "    if (radius <= 0.0 || sourceDistance >= radius) discard;\n"
        + "    float falloff = 1.0 - clamp(sourceDistance / radius, 0.0, 1.0);\n"
        + "    falloff *= falloff;\n"
        + "    float darkness = 1.0 - clamp(tcSourceLevel / 15.0, 0.0, 1.0);\n"
        + "    float brightness = (1.0 - darkness) / (darkness * 3.0 + 1.0);\n"
        + "    float influence = brightness * falloff * 0.45"
        + " * (1.0 - clamp(tcDaylight, 0.0, 1.0));\n"
        + "    if (stockMask.a > 0.5) discard;\n"
        + "    gl_FragColor = vec4(influence * tcSourceColor, influence);\n"
        + "}\n";

    private static final DynamicHeadlightTarget TARGET = new DynamicHeadlightTarget();
    private static final FloatBuffer PROJECTION_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer INVERSE_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer VIEW_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer EYE_TO_WORLD_BUFFER = BufferUtils.createFloatBuffer(16);
    private static final FloatBuffer SOURCE_BUFFER = BufferUtils.createFloatBuffer(3);
    private static final FloatBuffer VALUE_BUFFER = BufferUtils.createFloatBuffer(1);
    // LWJGL 2 requires room for sixteen values for vector glGetInteger calls,
    // including GL_VIEWPORT even though that query returns only four values.
    private static final IntBuffer VIEWPORT_BUFFER = BufferUtils.createIntBuffer(16);
    private static final float[] CAPTURED_PROJECTION = new float[16];
    private static final float[] CAPTURED_WORLD_VIEW = new float[16];
    private static final int[] SOURCE_SCISSOR = new int[4];
    private static int[] SOURCE_SURVIVORS = new int[16];
    private static final Matrix4f PROJECTION = new Matrix4f();
    private static final Matrix4f INVERSE_PROJECTION = new Matrix4f();
    private static final Matrix4f CAPTURED_VIEW = new Matrix4f();
    private static final Matrix4f CAPTURED_EYE_TO_WORLD = new Matrix4f();

    private static int program;
    private static int vertexShader;
    private static int fragmentShader;
    private static int depthUniform;
    private static int stockMaskUniform;
    private static int hasStockMaskUniform;
    private static int inverseProjectionUniform;
    private static int capturedEyeToWorldUniform;
    private static int sourceWorldUniform;
    private static int sourceDirectionWorldUniform;
    private static int sourceColorUniform;
    private static int sourceLevelUniform;
    private static int sourceRadiusUniform;
    private static int sourceForwardReachUniform;
    private static int daylightUniform;
    private static int width;
    private static int height;
    private static boolean attempted;
    private static boolean failed;
    private static int failedWidth;
    private static int failedHeight;
    private static boolean loggedBackend;
    private static boolean loggedFailure;
    private static ContextCapabilities allocatedContext;
    private static float currentSourceEyeX;
    private static float currentSourceEyeY;
    private static float currentSourceEyeZ;
    private static float currentDirectionEyeX;
    private static float currentDirectionEyeY;
    private static float currentDirectionEyeZ;
    private static float currentSourceWorldX;
    private static float currentSourceWorldY;
    private static float currentSourceWorldZ;
    private static float currentDirectionWorldX;
    private static float currentDirectionWorldY;
    private static float currentDirectionWorldZ;
    private static float currentSourceForwardReach;

    private ClientDynamicHeadlightRenderer() {}

    /** Attempts the screen-space pass and returns true only when it handled the submissions. */
    static boolean render(List<LightEffectSubmission> submissions)
    {
        if (ENABLED == false || containsEligibleSource(submissions) == false)
        {
            return false;
        }
        ContextCapabilities currentContext = GLContext.getCapabilities();
        if (allocatedContext != null && allocatedContext != currentContext)
        {
            abandonObjects();
        }
        if (supported(currentContext) == false)
        {
            return false;
        }

        captureViewport();
        int targetWidth = VIEWPORT_BUFFER.get(2);
        int targetHeight = VIEWPORT_BUFFER.get(3);
        if (failed && (targetWidth != failedWidth || targetHeight != failedHeight))
        {
            failed = false;
            attempted = false;
        }
        if (failed)
        {
            return false;
        }
        try
        {
            ensure(targetWidth, targetHeight, currentContext);
            renderSources(submissions);
            if (loggedBackend == false)
            {
                loggedBackend = true;
                Traincraft.tcLog.info(
                    "Rendering client headlight surface illumination without world blocks.");
            }
            return true;
        }
        catch (IllegalStateException | OpenGLException failureValue)
        {
            failed = true;
            failedWidth = targetWidth;
            failedHeight = targetHeight;
            if (loggedFailure == false)
            {
                loggedFailure = true;
                Traincraft.tcLog.warn(
                    "Disabling dynamic headlight surface illumination until display or "
                    + "resource recreation; other lighting effects remain active.",
                    failureValue);
            }
            releaseObjects();
            return false;
        }
    }

    private static boolean containsEligibleSource(List<LightEffectSubmission> submissions)
    {
        for (LightEffectSubmission submission : submissions)
        {
            if (isDynamicSurfaceSource(submission))
            {
                return true;
            }
        }
        return false;
    }

    static boolean isDynamicSurfaceSource(LightEffectSubmission submission)
    {
        return submission.definition.clientProjectorEligible()
               && LightEffectRenderBatch.hasVisibleBeam(submission);
    }

    private static boolean supported(ContextCapabilities capabilities)
    {
        return OpenGlHelper.shadersSupported
               && OpenGlHelper.isFramebufferEnabled()
               && capabilities.GL_EXT_framebuffer_blit
               && (capabilities.OpenGL14 || capabilities.GL_ARB_depth_texture);
    }

    private static void captureViewport()
    {
        VIEWPORT_BUFFER.clear();
        GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT_BUFFER);
    }

    private static void ensure(
        int requestedWidth,
        int requestedHeight,
        ContextCapabilities currentContext)
    {
        if (attempted == false)
        {
            compileAndLink();
            attempted = true;
        }
        if (TARGET.matches(requestedWidth, requestedHeight) == false)
        {
            TARGET.release();
            TARGET.allocate(requestedWidth, requestedHeight);
            width = requestedWidth;
            height = requestedHeight;
        }
        allocatedContext = currentContext;
    }

    private static void renderSources(List<LightEffectSubmission> submissions)
    {
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        int previousDefaultTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        int previousLightmapTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);

        captureMatrices();
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho(-1.0D, 1.0D, -1.0D, 1.0D, -1.0D, 1.0D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        try
        {
            copyDepth(previousFramebuffer);
            accumulateSources(submissions);
            composite(previousFramebuffer);
        }
        finally
        {
            restoreDefaultBlendEquation();
            OpenGlHelper.func_153161_d(previousProgram);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(previousMatrixMode);
            GL11.glPopAttrib();
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousLightmapTexture);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousDefaultTexture);
            OpenGlHelper.setActiveTexture(previousActiveTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
            GL11.glViewport(
                VIEWPORT_BUFFER.get(0),
                VIEWPORT_BUFFER.get(1),
                VIEWPORT_BUFFER.get(2),
                VIEWPORT_BUFFER.get(3));
        }
    }

    private static void captureMatrices()
    {
        PROJECTION_BUFFER.clear();
        if (LightEffectRenderBatch.copyCapturedProjection(CAPTURED_PROJECTION))
        {
            PROJECTION_BUFFER.put(CAPTURED_PROJECTION);
        }
        else
        {
            GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, PROJECTION_BUFFER);
        }
        PROJECTION_BUFFER.rewind();
        PROJECTION.load(PROJECTION_BUFFER);
        if (Matrix4f.invert(PROJECTION, INVERSE_PROJECTION) == null)
        {
            throw new IllegalStateException("The active projection matrix is not invertible");
        }
        INVERSE_BUFFER.clear();
        INVERSE_PROJECTION.store(INVERSE_BUFFER);
        INVERSE_BUFFER.flip();
        prepareCapturedWorldTransform();
    }

    private static void prepareCapturedWorldTransform()
    {
        if (LightEffectRenderBatch.copyCapturedWorldView(CAPTURED_WORLD_VIEW) == false)
        {
            CAPTURED_VIEW.setIdentity();
            CAPTURED_EYE_TO_WORLD.setIdentity();
        }
        else
        {
            VIEW_BUFFER.clear();
            VIEW_BUFFER.put(CAPTURED_WORLD_VIEW).flip();
            CAPTURED_VIEW.load(VIEW_BUFFER);
            if (Matrix4f.invert(CAPTURED_VIEW, CAPTURED_EYE_TO_WORLD) == null)
            {
                throw new IllegalStateException("The captured world-view matrix is not invertible");
            }
        }
        EYE_TO_WORLD_BUFFER.clear();
        CAPTURED_EYE_TO_WORLD.store(EYE_TO_WORLD_BUFFER);
        EYE_TO_WORLD_BUFFER.flip();
    }

    private static void copyDepth(int sourceFramebuffer)
    {
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, sourceFramebuffer);
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, TARGET.depthFramebuffer());
        EXTFramebufferBlit.glBlitFramebufferEXT(
            VIEWPORT_BUFFER.get(0),
            VIEWPORT_BUFFER.get(1),
            VIEWPORT_BUFFER.get(0) + width,
            VIEWPORT_BUFFER.get(1) + height,
            0,
            0,
            width,
            height,
            GL11.GL_DEPTH_BUFFER_BIT,
            GL11.GL_NEAREST);
    }

    private static void accumulateSources(List<LightEffectSubmission> submissions)
    {
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT, TARGET.lightFramebuffer());
        GL11.glViewport(0, 0, width, height);
        GL11.glColorMask(true, true, true, true);
        GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glDisable(GL11.GL_FOG);
        GL11.glDisable(GL11.GL_CULL_FACE);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        boolean hasStockMask = RollingStockDepthMask.available(width, height);
        GL11.glBindTexture(
            GL11.GL_TEXTURE_2D,
            hasStockMask ? RollingStockDepthMask.texture() : 0);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, TARGET.depthTexture());
        GL11.glEnable(GL11.GL_BLEND);
        restoreDefaultBlendEquation();
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);

        OpenGlHelper.func_153161_d(program);
        OpenGlHelper.func_153163_f(depthUniform, 0);
        OpenGlHelper.func_153163_f(stockMaskUniform, 1);
        OpenGlHelper.func_153163_f(hasStockMaskUniform, hasStockMask ? 1 : 0);
        INVERSE_BUFFER.rewind();
        OpenGlHelper.func_153160_c(inverseProjectionUniform, false, INVERSE_BUFFER);
        EYE_TO_WORLD_BUFFER.rewind();
        OpenGlHelper.func_153160_c(
            capturedEyeToWorldUniform,
            false,
            EYE_TO_WORLD_BUFFER);
        World world = Minecraft.getMinecraft().theWorld;
        float temporalBrightness = world == null ? 0.0F : world.getSunBrightness(1.0F);
        int survivorCount = collectSourceSurvivors(submissions);
        for (int survivor = 0; survivor < survivorCount; survivor++)
        {
            LightEffectSubmission submission = submissions.get(SOURCE_SURVIVORS[survivor]);
            prepareSource(submission);
            float radius = sourceRadius(submission);
            if (applySourceScissor(radius, currentSourceForwardReach) == false)
            {
                continue;
            }
            uploadSourceUniforms(submission, radius, temporalBrightness);
            drawScreenQuad();
        }
        GL11.glDisable(GL11.GL_SCISSOR_TEST);
    }

    static int collectSourceSurvivors(List<LightEffectSubmission> submissions)
    {
        ensureSourceSurvivorCapacity(submissions.size());
        int survivorCount = 0;
        for (int sourceIndex = 0; sourceIndex < submissions.size(); sourceIndex++)
        {
            LightEffectSubmission source = submissions.get(sourceIndex);
            if (isDynamicSurfaceSource(source) == false)
            {
                continue;
            }
            int matchingSurvivor = -1;
            for (int survivor = 0; survivor < survivorCount; survivor++)
            {
                LightEffectSubmission existing = submissions.get(SOURCE_SURVIVORS[survivor]);
                if (sameSourceGroup(source, existing))
                {
                    matchingSurvivor = survivor;
                    break;
                }
            }
            if (matchingSurvivor < 0)
            {
                SOURCE_SURVIVORS[survivorCount++] = sourceIndex;
                continue;
            }
            LightEffectSubmission existing =
                submissions.get(SOURCE_SURVIVORS[matchingSurvivor]);
            if (sourceRadius(source) > sourceRadius(existing))
            {
                SOURCE_SURVIVORS[matchingSurvivor] = sourceIndex;
            }
        }
        return survivorCount;
    }

    private static void ensureSourceSurvivorCapacity(int required)
    {
        if (SOURCE_SURVIVORS.length >= required)
        {
            return;
        }
        int capacity = SOURCE_SURVIVORS.length;
        while (capacity < required)
        {
            capacity <<= 1;
        }
        SOURCE_SURVIVORS = new int[capacity];
    }

    private static boolean sameSourceGroup(
        LightEffectSubmission first, LightEffectSubmission second)
    {
        if (first.ownerId != second.ownerId
                || first.definition.channel() != second.definition.channel()
                || first.definition.color() != second.definition.color())
        {
            return false;
        }
        float directionDot = normalizedDirectionDot(first, second);
        if (directionDot < 0.98F)
        {
            return false;
        }
        float firstX = transformedPoint(first, first.x, first.y, first.z, 0);
        float firstY = transformedPoint(first, first.x, first.y, first.z, 1);
        float firstZ = transformedPoint(first, first.x, first.y, first.z, 2);
        float secondX = transformedPoint(second, second.x, second.y, second.z, 0);
        float secondY = transformedPoint(second, second.x, second.y, second.z, 1);
        float secondZ = transformedPoint(second, second.x, second.y, second.z, 2);
        float dx = firstX - secondX;
        float dy = firstY - secondY;
        float dz = firstZ - secondZ;
        return dx * dx + dy * dy + dz * dz <= 9.0F;
    }

    private static float transformedPoint(
        LightEffectSubmission submission, float x, float y, float z, int component)
    {
        float[] pose = submission.cameraRelativePose;
        return pose[component] * x
               + pose[4 + component] * y
               + pose[8 + component] * z
               + pose[12 + component];
    }

    private static float normalizedDirectionDot(
        LightEffectSubmission first, LightEffectSubmission second)
    {
        float firstX = transformedDirection(first, first.dx, first.dy, first.dz, 0);
        float firstY = transformedDirection(first, first.dx, first.dy, first.dz, 1);
        float firstZ = transformedDirection(first, first.dx, first.dy, first.dz, 2);
        float secondX = transformedDirection(second, second.dx, second.dy, second.dz, 0);
        float secondY = transformedDirection(second, second.dx, second.dy, second.dz, 1);
        float secondZ = transformedDirection(second, second.dx, second.dy, second.dz, 2);
        float firstLength = (float) Math.sqrt(
                                firstX * firstX + firstY * firstY + firstZ * firstZ);
        float secondLength = (float) Math.sqrt(
                                 secondX * secondX + secondY * secondY + secondZ * secondZ);
        if (firstLength <= 1.0E-5F || secondLength <= 1.0E-5F)
        {
            return -1.0F;
        }
        return (firstX * secondX + firstY * secondY + firstZ * secondZ)
               / (firstLength * secondLength);
    }

    private static float transformedDirection(
        LightEffectSubmission submission, float x, float y, float z, int component)
    {
        float[] pose = submission.cameraRelativePose;
        return pose[component] * x + pose[4 + component] * y + pose[8 + component] * z;
    }

    private static void prepareSource(LightEffectSubmission submission)
    {
        float[] pose = submission.cameraRelativePose;
        float lensEyeX = pose[0] * submission.x
                         + pose[4] * submission.y
                         + pose[8] * submission.z
                         + pose[12];
        float lensEyeY = pose[1] * submission.x
                         + pose[5] * submission.y
                         + pose[9] * submission.z
                         + pose[13];
        float lensEyeZ = pose[2] * submission.x
                         + pose[6] * submission.y
                         + pose[10] * submission.z
                         + pose[14];

        float eyeDirectionX = pose[0] * submission.dx
                              + pose[4] * submission.dy
                              + pose[8] * submission.dz;
        float eyeDirectionY = pose[1] * submission.dx
                              + pose[5] * submission.dy
                              + pose[9] * submission.dz;
        float eyeDirectionZ = pose[2] * submission.dx
                              + pose[6] * submission.dy
                              + pose[10] * submission.dz;
        float directionLength = (float) Math.sqrt(
                                    eyeDirectionX * eyeDirectionX
                                    + eyeDirectionY * eyeDirectionY
                                    + eyeDirectionZ * eyeDirectionZ);
        if (directionLength <= 1.0E-5F)
        {
            eyeDirectionX = 0.0F;
            eyeDirectionY = 0.0F;
            eyeDirectionZ = -1.0F;
        }
        else
        {
            eyeDirectionX /= directionLength;
            eyeDirectionY /= directionLength;
            eyeDirectionZ /= directionLength;
        }

        float forwardOffset = DynamicHeadlightMath.sourceForwardOffset(
                                  submission.definition.beamLength(),
                                  submission.beamScale,
                                  submission.fixtureReach);
        float effectiveLength = FixedFunctionBeamGeometry.effectiveLength(
                                    submission.definition.beamLength(),
                                    submission.beamScale,
                                    submission.fixtureReach);
        currentSourceEyeX = lensEyeX + eyeDirectionX * forwardOffset;
        currentSourceEyeY = lensEyeY + eyeDirectionY * forwardOffset;
        currentSourceEyeZ = lensEyeZ + eyeDirectionZ * forwardOffset;
        currentDirectionEyeX = eyeDirectionX;
        currentDirectionEyeY = eyeDirectionY;
        currentDirectionEyeZ = eyeDirectionZ;
        currentSourceWorldX = transformPointX(
                                  CAPTURED_EYE_TO_WORLD,
                                  currentSourceEyeX,
                                  currentSourceEyeY,
                                  currentSourceEyeZ);
        currentSourceWorldY = transformPointY(
                                  CAPTURED_EYE_TO_WORLD,
                                  currentSourceEyeX,
                                  currentSourceEyeY,
                                  currentSourceEyeZ);
        currentSourceWorldZ = transformPointZ(
                                  CAPTURED_EYE_TO_WORLD,
                                  currentSourceEyeX,
                                  currentSourceEyeY,
                                  currentSourceEyeZ);
        currentDirectionWorldX = transformDirectionX(
                                     CAPTURED_EYE_TO_WORLD,
                                     currentDirectionEyeX,
                                     currentDirectionEyeY,
                                     currentDirectionEyeZ);
        currentDirectionWorldY = transformDirectionY(
                                     CAPTURED_EYE_TO_WORLD,
                                     currentDirectionEyeX,
                                     currentDirectionEyeY,
                                     currentDirectionEyeZ);
        currentDirectionWorldZ = transformDirectionZ(
                                     CAPTURED_EYE_TO_WORLD,
                                     currentDirectionEyeX,
                                     currentDirectionEyeY,
                                     currentDirectionEyeZ);
        float worldDirectionLength = (float) Math.sqrt(
                                         currentDirectionWorldX * currentDirectionWorldX
                                         + currentDirectionWorldY * currentDirectionWorldY
                                         + currentDirectionWorldZ * currentDirectionWorldZ);
        if (worldDirectionLength > 1.0E-5F)
        {
            currentDirectionWorldX /= worldDirectionLength;
            currentDirectionWorldY /= worldDirectionLength;
            currentDirectionWorldZ /= worldDirectionLength;
        }
        currentSourceForwardReach = Math.max(0.0F, effectiveLength - forwardOffset);
    }

    private static float transformPointX(Matrix4f matrix, float x, float y, float z)
    {
        return matrix.m00 * x + matrix.m10 * y + matrix.m20 * z + matrix.m30;
    }

    private static float transformPointY(Matrix4f matrix, float x, float y, float z)
    {
        return matrix.m01 * x + matrix.m11 * y + matrix.m21 * z + matrix.m31;
    }

    private static float transformPointZ(Matrix4f matrix, float x, float y, float z)
    {
        return matrix.m02 * x + matrix.m12 * y + matrix.m22 * z + matrix.m32;
    }

    private static float transformDirectionX(Matrix4f matrix, float x, float y, float z)
    {
        return matrix.m00 * x + matrix.m10 * y + matrix.m20 * z;
    }

    private static float transformDirectionY(Matrix4f matrix, float x, float y, float z)
    {
        return matrix.m01 * x + matrix.m11 * y + matrix.m21 * z;
    }

    private static float transformDirectionZ(Matrix4f matrix, float x, float y, float z)
    {
        return matrix.m02 * x + matrix.m12 * y + matrix.m22 * z;
    }

    private static void uploadSourceUniforms(
        LightEffectSubmission submission, float radius, float temporalBrightness)
    {
        SOURCE_BUFFER.clear();
        SOURCE_BUFFER.put(currentSourceWorldX);
        SOURCE_BUFFER.put(currentSourceWorldY);
        SOURCE_BUFFER.put(currentSourceWorldZ);
        SOURCE_BUFFER.flip();
        OpenGlHelper.func_153191_c(sourceWorldUniform, SOURCE_BUFFER);

        SOURCE_BUFFER.clear();
        SOURCE_BUFFER.put(currentDirectionWorldX);
        SOURCE_BUFFER.put(currentDirectionWorldY);
        SOURCE_BUFFER.put(currentDirectionWorldZ);
        SOURCE_BUFFER.flip();
        OpenGlHelper.func_153191_c(sourceDirectionWorldUniform, SOURCE_BUFFER);

        int color = submission.definition.color();
        SOURCE_BUFFER.clear();
        SOURCE_BUFFER.put(((color >> 16) & 255) / 255.0F);
        SOURCE_BUFFER.put(((color >> 8) & 255) / 255.0F);
        SOURCE_BUFFER.put((color & 255) / 255.0F);
        SOURCE_BUFFER.flip();
        OpenGlHelper.func_153191_c(sourceColorUniform, SOURCE_BUFFER);

        setFloat(sourceLevelUniform, sourceLevel(submission));
        setFloat(sourceRadiusUniform, radius);
        setFloat(sourceForwardReachUniform, currentSourceForwardReach);
        float daylight = AdaptiveLightVisibility.targetDaylight(15, temporalBrightness);
        setFloat(daylightUniform, daylight);
    }

    private static int sourceLevel(LightEffectSubmission submission)
    {
        return submission.intensity >= 0.75F
               ? ClientDynamicHeadlightManager.BRIGHT_LEVEL
               : ClientDynamicHeadlightManager.DIM_LEVEL;
    }

    private static float sourceRadius(LightEffectSubmission submission)
    {
        return DynamicHeadlightMath.radius(
                   submission.definition.beamLength(),
                   submission.beamScale,
                   submission.fixtureReach);
    }

    private static boolean applySourceScissor(float radius, float forwardReach)
    {
        float halfReach = forwardReach * 0.5F;
        float boundsCenterX = currentSourceEyeX + currentDirectionEyeX * halfReach;
        float boundsCenterY = currentSourceEyeY + currentDirectionEyeY * halfReach;
        float boundsCenterZ = currentSourceEyeZ + currentDirectionEyeZ * halfReach;
        float boundsRadius = radius + halfReach;
        if (boundsCenterZ - boundsRadius >= 0.0F)
        {
            return false;
        }
        if (boundsCenterZ + boundsRadius >= -1.0E-3F)
        {
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            return true;
        }
        if (projectSourceBounds(
                    PROJECTION,
                    boundsCenterX,
                    boundsCenterY,
                    boundsCenterZ,
                    boundsRadius,
                    width,
                    height,
                    SOURCE_SCISSOR)
                == false)
        {
            return false;
        }
        GL11.glEnable(GL11.GL_SCISSOR_TEST);
        GL11.glScissor(
            SOURCE_SCISSOR[0],
            SOURCE_SCISSOR[1],
            SOURCE_SCISSOR[2] - SOURCE_SCISSOR[0],
            SOURCE_SCISSOR[3] - SOURCE_SCISSOR[1]);
        return true;
    }

    static boolean projectSourceBounds(
        Matrix4f projection,
        float centerX,
        float centerY,
        float centerZ,
        float radius,
        int targetWidth,
        int targetHeight,
        int[] destination)
    {
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        for (int corner = 0; corner < 8; corner++)
        {
            float x = centerX + ((corner & 1) == 0 ? -radius : radius);
            float y = centerY + ((corner & 2) == 0 ? -radius : radius);
            float z = centerZ + ((corner & 4) == 0 ? -radius : radius);
            float clipX = projection.m00 * x
                          + projection.m10 * y
                          + projection.m20 * z
                          + projection.m30;
            float clipY = projection.m01 * x
                          + projection.m11 * y
                          + projection.m21 * z
                          + projection.m31;
            float clipW = projection.m03 * x
                          + projection.m13 * y
                          + projection.m23 * z
                          + projection.m33;
            if (clipW <= 1.0E-5F)
            {
                destination[0] = 0;
                destination[1] = 0;
                destination[2] = targetWidth;
                destination[3] = targetHeight;
                return true;
            }
            float projectedX = clipX / clipW;
            float projectedY = clipY / clipW;
            minimumX = Math.min(minimumX, projectedX);
            minimumY = Math.min(minimumY, projectedY);
            maximumX = Math.max(maximumX, projectedX);
            maximumY = Math.max(maximumY, projectedY);
        }
        if (maximumX < -1.0F || minimumX > 1.0F || maximumY < -1.0F || minimumY > 1.0F)
        {
            return false;
        }
        destination[0] = Math.max(
                             0,
                             (int) Math.floor((Math.max(-1.0F, minimumX) + 1.0F) * 0.5F * targetWidth)
                             - 2);
        destination[1] = Math.max(
                             0,
                             (int) Math.floor((Math.max(-1.0F, minimumY) + 1.0F) * 0.5F * targetHeight)
                             - 2);
        destination[2] = Math.min(
                             targetWidth,
                             (int) Math.ceil((Math.min(1.0F, maximumX) + 1.0F) * 0.5F * targetWidth)
                             + 2);
        destination[3] = Math.min(
                             targetHeight,
                             (int) Math.ceil((Math.min(1.0F, maximumY) + 1.0F) * 0.5F * targetHeight)
                             + 2);
        return destination[2] > destination[0] && destination[3] > destination[1];
    }

    private static void setFloat(int uniform, float value)
    {
        VALUE_BUFFER.clear();
        VALUE_BUFFER.put(value).flip();
        OpenGlHelper.func_153168_a(uniform, VALUE_BUFFER);
    }

    private static void composite(int destinationFramebuffer)
    {
        restoreDefaultBlendEquation();
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT, destinationFramebuffer);
        GL11.glViewport(
            VIEWPORT_BUFFER.get(0),
            VIEWPORT_BUFFER.get(1),
            width,
            height);
        OpenGlHelper.func_153161_d(0);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, TARGET.lightTexture());
        GL11.glEnable(GL11.GL_BLEND);
        // A restrained authored-color contribution remains visible on nearly
        // black night terrain. Source placement and the forward mask keep the
        // contribution off the owning stock.
        GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glColorMask(true, true, true, false);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        drawScreenQuad();
    }

    private static void drawScreenQuad()
    {
        GL11.glBegin(GL11.GL_QUADS);
        GL11.glTexCoord2f(0.0F, 0.0F);
        GL11.glVertex2f(-1.0F, -1.0F);
        GL11.glTexCoord2f(1.0F, 0.0F);
        GL11.glVertex2f(1.0F, -1.0F);
        GL11.glTexCoord2f(1.0F, 1.0F);
        GL11.glVertex2f(1.0F, 1.0F);
        GL11.glTexCoord2f(0.0F, 1.0F);
        GL11.glVertex2f(-1.0F, 1.0F);
        GL11.glEnd();
    }

    private static void restoreDefaultBlendEquation()
    {
        if (GLContext.getCapabilities().OpenGL14)
        {
            GL14.glBlendEquation(GL14.GL_FUNC_ADD);
        }
        else
        {
            if (GLContext.getCapabilities().GL_EXT_blend_minmax)
            {
                EXTBlendMinmax.glBlendEquationEXT(EXTBlendMinmax.GL_FUNC_ADD_EXT);
            }
        }
    }

    private static void compileAndLink()
    {
        vertexShader = compile(GL20.GL_VERTEX_SHADER, VERTEX_SOURCE, "vertex");
        fragmentShader = compile(GL20.GL_FRAGMENT_SHADER, FRAGMENT_SOURCE, "fragment");
        program = OpenGlHelper.func_153183_d();
        if (program == 0)
        {
            throw new IllegalStateException("OpenGL returned dynamic-light program 0");
        }
        OpenGlHelper.func_153178_b(program, vertexShader);
        OpenGlHelper.func_153178_b(program, fragmentShader);
        OpenGlHelper.func_153179_f(program);
        if (OpenGlHelper.func_153175_a(program, GL20.GL_LINK_STATUS) == GL11.GL_FALSE)
        {
            throw new IllegalStateException(
                "Dynamic-light shader link failed: "
                + OpenGlHelper.func_153166_e(program, 8192));
        }
        depthUniform = requiredUniform("tcSceneDepth");
        stockMaskUniform = requiredUniform("tcStockMask");
        hasStockMaskUniform = requiredUniform("tcHasStockMask");
        inverseProjectionUniform = requiredUniform("tcInverseProjection");
        capturedEyeToWorldUniform = requiredUniform("tcCapturedEyeToWorld");
        sourceWorldUniform = requiredUniform("tcSourceWorld");
        sourceDirectionWorldUniform = requiredUniform("tcSourceDirectionWorld");
        sourceColorUniform = requiredUniform("tcSourceColor");
        sourceLevelUniform = requiredUniform("tcSourceLevel");
        sourceRadiusUniform = requiredUniform("tcSourceRadius");
        sourceForwardReachUniform = requiredUniform("tcSourceForwardReach");
        daylightUniform = requiredUniform("tcDaylight");
    }

    private static int compile(int type, String source, String stage)
    {
        int shader = OpenGlHelper.func_153195_b(type);
        if (shader == 0)
        {
            throw new IllegalStateException(
                "OpenGL returned dynamic-light " + stage + " shader 0");
        }
        byte[] encoded = source.getBytes(UTF_8);
        ByteBuffer buffer = BufferUtils.createByteBuffer(encoded.length);
        buffer.put(encoded).flip();
        OpenGlHelper.func_153169_a(shader, buffer);
        OpenGlHelper.func_153170_c(shader);
        if (OpenGlHelper.func_153157_c(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE)
        {
            String log = OpenGlHelper.func_153158_d(shader, 8192);
            OpenGlHelper.func_153180_a(shader);
            throw new IllegalStateException(
                "Dynamic-light " + stage + " shader compile failed: " + log);
        }
        return shader;
    }

    private static int requiredUniform(String name)
    {
        int location = OpenGlHelper.func_153194_a(program, name);
        if (location < 0)
        {
            throw new IllegalStateException("Missing dynamic-light shader uniform " + name);
        }
        return location;
    }

    static void clear()
    {
        ContextCapabilities currentContext = currentContextOrNull();
        if (allocatedContext == null || allocatedContext == currentContext)
        {
            releaseObjects();
        }
        else
        {
            abandonObjects();
        }
        attempted = false;
        failed = false;
        failedWidth = 0;
        failedHeight = 0;
        loggedBackend = false;
        loggedFailure = false;
        allocatedContext = null;
    }

    private static ContextCapabilities currentContextOrNull()
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

    private static void releaseObjects()
    {
        TARGET.release();
        if (program != 0)
        {
            OpenGlHelper.func_153187_e(program);
        }
        if (vertexShader != 0)
        {
            OpenGlHelper.func_153180_a(vertexShader);
        }
        if (fragmentShader != 0)
        {
            OpenGlHelper.func_153180_a(fragmentShader);
        }
        resetObjectNames();
    }

    private static void abandonObjects()
    {
        TARGET.abandon();
        resetObjectNames();
        attempted = false;
        failed = false;
        loggedBackend = false;
        loggedFailure = false;
        allocatedContext = null;
    }

    private static void resetObjectNames()
    {
        program = 0;
        vertexShader = 0;
        fragmentShader = 0;
        depthUniform = -1;
        stockMaskUniform = -1;
        hasStockMaskUniform = -1;
        inverseProjectionUniform = -1;
        capturedEyeToWorldUniform = -1;
        sourceWorldUniform = -1;
        sourceDirectionWorldUniform = -1;
        sourceColorUniform = -1;
        sourceLevelUniform = -1;
        sourceRadiusUniform = -1;
        sourceForwardReachUniform = -1;
        daylightUniform = -1;
        width = 0;
        height = 0;
    }
}
