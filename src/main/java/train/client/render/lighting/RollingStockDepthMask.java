package train.client.render.lighting;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.GLContext;
import train.common.Traincraft;

/**
 * Builds frame-scoped screen-space owner and nearest-depth masks from rolling-stock rendering.
 *
 * <p>The renderer snapshots scene depth before and after each vehicle, then accumulates only pixels
 * whose depth moved closer. A depth attachment on the mask framebuffer ensures that the nearest
 * overlapping vehicle owns each pixel. The beam shader rejects a foreign owner only when this
 * stored vehicle depth is also closer than the beam fragment; an owner id alone is insufficient.
 * Resources belong to the render thread and active OpenGL context. Failure leaves both masks
 * unavailable so the normal scene-depth path can continue without suppressing an entire cone.
 */
public final class RollingStockDepthMask
{
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    /** Minimum scene-depth change accepted as newly rendered rolling-stock geometry. */
    static final float CAPTURE_DEPTH_EPSILON = 5.0E-7F;
    /** Separates a nearer stock surface from a beam fragment at effectively equal depth. */
    static final float BEAM_DEPTH_BIAS = 1.0E-6F;
    private static final int SHADER_LOG_CHARACTER_LIMIT = 8192;
    private static final String VERTEX_SOURCE =
        "#version 120\n"
        + "varying vec2 tcUv;\n"
        + "void main() {\n"
        + "    gl_Position = ftransform();\n"
        + "    tcUv = gl_MultiTexCoord0.xy;\n"
        + "}\n";
    private static final String FRAGMENT_SOURCE =
        "#version 120\n"
        + "uniform sampler2D tcBeforeDepth;\n"
        + "uniform sampler2D tcAfterDepth;\n"
        + "uniform vec3 tcOwnerCode;\n"
        + "varying vec2 tcUv;\n"
        + "void main() {\n"
        + "    float beforeDepth = texture2D(tcBeforeDepth, tcUv).r;\n"
        + "    float afterDepth = texture2D(tcAfterDepth, tcUv).r;\n"
        + "    if (afterDepth >= beforeDepth - " + CAPTURE_DEPTH_EPSILON + ") discard;\n"
        + "    gl_FragColor = vec4(tcOwnerCode, 1.0);\n"
        + "    gl_FragDepth = afterDepth;\n"
        + "}\n";
    private static final IntBuffer VIEWPORT = BufferUtils.createIntBuffer(16);
    /** OpenGL viewport: {@code [0] = x}, {@code [1] = y}, {@code [2] = width}, {@code [3] = height}. */
    private static final int[] CAPTURED_VIEWPORT = new int[4];
    /** Active model rectangle: {@code [0] = x}, {@code [1] = y}, {@code [2] = width}, {@code [3] = height}. */
    private static final int[] MODEL_RECTANGLE = new int[4];

    private static int beforeDepthTexture;
    private static int afterDepthTexture;
    private static int maskTexture;
    private static int maskDepthTexture;
    private static int maskFramebuffer;
    private static int program;
    private static int vertexShader;
    private static int fragmentShader;
    private static int beforeDepthUniform;
    private static int afterDepthUniform;
    private static int ownerCodeUniform;
    private static int width;
    private static int height;
    private static int sourceFramebuffer;
    private static boolean frameStarted;
    private static boolean modelActive;
    private static boolean attempted;
    private static boolean failed;
    private static boolean loggedFailure;
    private static int activeOwnerId;
    private static ContextCapabilities allocatedContext;

    private RollingStockDepthMask() {}

    /**
     * Captures scene depth immediately before one demanded rolling-stock model renders.
     *
     * @param ownerId entity id encoded into pixels changed by the matching model render
     */
    public static void beginModel(int ownerId)
    {
        if (OpenGlHelper.shadersSupported == false || OpenGlHelper.isFramebufferEnabled() == false)
        {
            return;
        }
        ContextCapabilities context = GLContext.getCapabilities();
        if (allocatedContext != null && allocatedContext != context)
        {
            abandon();
        }
        captureViewport();
        int requestedWidth = VIEWPORT.get(2);
        int requestedHeight = VIEWPORT.get(3);
        if (requestedWidth <= 0 || requestedHeight <= 0 || failed)
        {
            return;
        }
        try
        {
            ensure(requestedWidth, requestedHeight, context);
            sourceFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
            activeOwnerId = ownerId;
            if (RollingStockLightOcclusion.activeScreenRectangle(
                        requestedWidth, requestedHeight, MODEL_RECTANGLE)
                    == false)
            {
                return;
            }
            if (frameStarted == false)
            {
                clearMask();
                frameStarted = true;
            }
            copyDepth(beforeDepthTexture);
            modelActive = true;
        }
        catch (IllegalStateException | OpenGLException failure)
        {
            disable(failure);
        }
    }

    /** Accumulates pixels changed since the matching {@link #beginModel(int)} call. */
    public static void endModel()
    {
        if (modelActive == false)
        {
            return;
        }
        modelActive = false;
        try
        {
            copyDepth(afterDepthTexture);
            accumulateDifference();
        }
        catch (IllegalStateException | OpenGLException failure)
        {
            disable(failure);
        }
    }

    static boolean available(int requestedWidth, int requestedHeight)
    {
        return frameStarted
               && failed == false
               && maskTexture != 0
               && maskDepthTexture != 0
               && width == requestedWidth
               && height == requestedHeight;
    }

    static int texture()
    {
        return maskTexture;
    }

    static int depthTexture()
    {
        return maskDepthTexture;
    }

    static boolean depthMovedCloser(float beforeDepth, float afterDepth)
    {
        return afterDepth < beforeDepth - CAPTURE_DEPTH_EPSILON;
    }

    /** Pure counterpart of the beam-shader foreign-stock depth rejection. */
    static boolean foreignStockOccludes(
        int beamOwnerId, int stockOwnerId, float stockDepth, float beamDepth, boolean occupied)
    {
        return occupied
               && encodedOwner(beamOwnerId) != encodedOwner(stockOwnerId)
               && stockDepth + BEAM_DEPTH_BIAS < beamDepth;
    }

    static void finishFrame()
    {
        modelActive = false;
        frameStarted = false;
    }

    static void clear()
    {
        ContextCapabilities current = currentContext();
        if (allocatedContext == null || allocatedContext == current)
        {
            release();
        }
        else
        {
            abandon();
        }
        attempted = false;
        failed = false;
        loggedFailure = false;
    }

    /** Captures the current OpenGL viewport used to size and align mask resources. */
    private static void captureViewport()
    {
        VIEWPORT.clear();
        if (LightEffectRenderBatch.copyCapturedViewport(CAPTURED_VIEWPORT))
        {
            VIEWPORT.put(CAPTURED_VIEWPORT);
            VIEWPORT.rewind();
        }
        else
        {
            GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT);
        }
    }

    /** Creates or resizes context-owned mask programs, textures, and framebuffer targets. */
    private static void ensure(
        int requestedWidth, int requestedHeight, ContextCapabilities context)
    {
        if (attempted == false)
        {
            compileAndLink();
            attempted = true;
        }
        if (maskFramebuffer != 0 && width == requestedWidth && height == requestedHeight)
        {
            return;
        }
        releaseTargets();
        width = requestedWidth;
        height = requestedHeight;
        beforeDepthTexture = allocateDepthTexture();
        afterDepthTexture = allocateDepthTexture();
        maskTexture = allocateColorTexture();
        maskDepthTexture = allocateDepthTexture();
        maskFramebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        try
        {
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, maskFramebuffer);
            EXTFramebufferObject.glFramebufferTexture2DEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT,
                GL11.GL_TEXTURE_2D,
                maskTexture,
                0);
            EXTFramebufferObject.glFramebufferTexture2DEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT,
                GL11.GL_TEXTURE_2D,
                maskDepthTexture,
                0);
            int status = EXTFramebufferObject.glCheckFramebufferStatusEXT(
                             EXTFramebufferObject.GL_FRAMEBUFFER_EXT);
            if (status != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT)
            {
                throw new IllegalStateException(
                    "Incomplete rolling-stock mask framebuffer: 0x"
                    + Integer.toHexString(status));
            }
        }
        finally
        {
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
        allocatedContext = context;
    }

    private static int allocateDepthTexture()
    {
        int texture = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
        configureTexture();
        GL11.glTexImage2D(
            GL11.GL_TEXTURE_2D,
            0,
            GL11.GL_DEPTH_COMPONENT,
            width,
            height,
            0,
            GL11.GL_DEPTH_COMPONENT,
            GL11.GL_FLOAT,
            (ByteBuffer) null);
        return texture;
    }

    private static int allocateColorTexture()
    {
        int texture = GL11.glGenTextures();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
        configureTexture();
        GL11.glTexImage2D(
            GL11.GL_TEXTURE_2D,
            0,
            GL11.GL_RGBA8,
            width,
            height,
            0,
            GL11.GL_RGBA,
            GL11.GL_UNSIGNED_BYTE,
            (ByteBuffer) null);
        return texture;
    }

    private static void configureTexture()
    {
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
    }

    private static void copyDepth(int texture)
    {
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        try
        {
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, sourceFramebuffer);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
            GL11.glCopyTexSubImage2D(
                GL11.GL_TEXTURE_2D,
                0,
                MODEL_RECTANGLE[0],
                MODEL_RECTANGLE[1],
                VIEWPORT.get(0) + MODEL_RECTANGLE[0],
                VIEWPORT.get(1) + MODEL_RECTANGLE[1],
                MODEL_RECTANGLE[2],
                MODEL_RECTANGLE[3]);
        }
        finally
        {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }

    /** Clears accumulated owner and nearest-depth values for the current frame. */
    private static void clearMask()
    {
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        GL11.glPushAttrib(
            GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT | GL11.GL_VIEWPORT_BIT);
        try
        {
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, maskFramebuffer);
            GL11.glViewport(0, 0, width, height);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(true);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClearDepth(1.0D);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        }
        finally
        {
            GL11.glPopAttrib();
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }

    /** Accumulates newly rendered stock pixels where captured depth differs from scene depth. */
    private static void accumulateDifference()
    {
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        try
        {
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, maskFramebuffer);
            GL11.glViewport(0, 0, width, height);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LESS);
            GL11.glDepthMask(true);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glEnable(GL11.GL_SCISSOR_TEST);
            GL11.glScissor(
                MODEL_RECTANGLE[0],
                MODEL_RECTANGLE[1],
                MODEL_RECTANGLE[2],
                MODEL_RECTANGLE[3]);
            OpenGlHelper.func_153161_d(program);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, beforeDepthTexture);
            OpenGlHelper.func_153163_f(beforeDepthUniform, 0);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, afterDepthTexture);
            OpenGlHelper.func_153163_f(afterDepthUniform, 1);
            int ownerCode = encodedOwner(activeOwnerId);
            GL20.glUniform3f(
                ownerCodeUniform,
                ((ownerCode >> 16) & 255) / 255.0F,
                ((ownerCode >> 8) & 255) / 255.0F,
                (ownerCode & 255) / 255.0F);
            drawQuad();
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

    private static void drawQuad()
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

    /** Compiles and links the stock-mask accumulation and sampling shader programs. */
    private static void compileAndLink()
    {
        vertexShader = compile(GL20.GL_VERTEX_SHADER, VERTEX_SOURCE, "vertex");
        fragmentShader = compile(GL20.GL_FRAGMENT_SHADER, FRAGMENT_SOURCE, "fragment");
        program = OpenGlHelper.func_153183_d();
        OpenGlHelper.func_153178_b(program, vertexShader);
        OpenGlHelper.func_153178_b(program, fragmentShader);
        OpenGlHelper.func_153179_f(program);
        if (OpenGlHelper.func_153175_a(program, GL20.GL_LINK_STATUS) == GL11.GL_FALSE)
        {
            throw new IllegalStateException(
                "Rolling-stock mask shader link failed: "
                + OpenGlHelper.func_153166_e(program, SHADER_LOG_CHARACTER_LIMIT));
        }
        beforeDepthUniform = requiredUniform("tcBeforeDepth");
        afterDepthUniform = requiredUniform("tcAfterDepth");
        ownerCodeUniform = requiredUniform("tcOwnerCode");
    }

    /** Compiles one shader stage and returns its OpenGL object name. */
    private static int compile(int type, String source, String stage)
    {
        int shader = OpenGlHelper.func_153195_b(type);
        byte[] encoded = source.getBytes(UTF_8);
        ByteBuffer buffer = BufferUtils.createByteBuffer(encoded.length);
        buffer.put(encoded).flip();
        OpenGlHelper.func_153169_a(shader, buffer);
        OpenGlHelper.func_153170_c(shader);
        if (OpenGlHelper.func_153157_c(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE)
        {
            String log = OpenGlHelper.func_153158_d(shader, SHADER_LOG_CHARACTER_LIMIT);
            OpenGlHelper.func_153180_a(shader);
            throw new IllegalStateException(
                "Rolling-stock mask " + stage + " shader compile failed: " + log);
        }
        return shader;
    }

    private static int requiredUniform(String name)
    {
        int location = OpenGlHelper.func_153194_a(program, name);
        if (location < 0)
        {
            throw new IllegalStateException("Missing rolling-stock mask uniform " + name);
        }
        return location;
    }

    private static void disable(Throwable failure)
    {
        failed = true;
        modelActive = false;
        frameStarted = false;
        if (loggedFailure == false)
        {
            loggedFailure = true;
            Traincraft.tcLog.warn(
                "Rolling-stock lighting mask is unavailable; unshortened direct cones remain active.",
                failure);
        }
        releaseTargets();
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

    private static void release()
    {
        releaseTargets();
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
        abandonPrograms();
    }

    /** Deletes framebuffer and texture targets owned by the current OpenGL context. */
    private static void releaseTargets()
    {
        if (beforeDepthTexture != 0)
        {
            GL11.glDeleteTextures(beforeDepthTexture);
        }
        if (afterDepthTexture != 0)
        {
            GL11.glDeleteTextures(afterDepthTexture);
        }
        if (maskTexture != 0)
        {
            GL11.glDeleteTextures(maskTexture);
        }
        if (maskDepthTexture != 0)
        {
            GL11.glDeleteTextures(maskDepthTexture);
        }
        if (maskFramebuffer != 0)
        {
            EXTFramebufferObject.glDeleteFramebuffersEXT(maskFramebuffer);
        }
        beforeDepthTexture = 0;
        afterDepthTexture = 0;
        maskTexture = 0;
        maskDepthTexture = 0;
        maskFramebuffer = 0;
        width = 0;
        height = 0;
        frameStarted = false;
    }

    /** Forgets all context-owned state when OpenGL object deletion is no longer safe. */
    private static void abandon()
    {
        beforeDepthTexture = 0;
        afterDepthTexture = 0;
        maskTexture = 0;
        maskDepthTexture = 0;
        maskFramebuffer = 0;
        width = 0;
        height = 0;
        abandonPrograms();
        attempted = false;
        failed = false;
        frameStarted = false;
        modelActive = false;
        allocatedContext = null;
    }

    /** Clears shader object names without issuing deletion calls against a replaced context. */
    private static void abandonPrograms()
    {
        program = 0;
        vertexShader = 0;
        fragmentShader = 0;
        beforeDepthUniform = -1;
        afterDepthUniform = -1;
        ownerCodeUniform = -1;
    }

    static int encodedOwner(int ownerId)
    {
        int encoded = (ownerId + 1) & 0x00FFFFFF;
        return encoded == 0 ? 1 : encoded;
    }
}
