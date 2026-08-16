package train.client.render;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
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
import org.lwjgl.opengl.GLContext;
import train.common.Traincraft;

/** GLSL 1.20 adapter for the position-color beam fade. */
final class LegacyBeamShader {
    private static final boolean ENABLED =
            "false".equalsIgnoreCase(System.getProperty("traincraft.lighting.shader", "true")) == false;
    private static final boolean DIAGNOSTICS =
            "true".equalsIgnoreCase(System.getProperty("traincraft.lighting.diagnostics", "false"));
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final String VERTEX_SOURCE =
            "#version 120\n"
                    + "uniform mat4 tcEyeToStockShadow;\n"
                    + "varying float tcBeamFraction;\n"
                    + "varying vec4 tcStockShadowPosition;\n"
                    + "void main() {\n"
                    + "    gl_Position = ftransform();\n"
                    + "    tcStockShadowPosition = tcEyeToStockShadow"
                    + " * (gl_ModelViewMatrix * gl_Vertex);\n"
                    + "    tcBeamFraction = gl_MultiTexCoord0.x;\n"
                    + "}\n";
    private static final String FRAGMENT_SOURCE =
            "#version 120\n"
                    + "uniform vec3 tcBeamColor;\n"
                    + "uniform float tcBeamOpacity;\n"
                    + "uniform int tcPremultiplied;\n"
                    + "uniform sampler2D tcStockMask;\n"
                    + "uniform vec2 tcInverseViewport;\n"
                    + "uniform vec2 tcViewportOrigin;\n"
                    + "uniform vec3 tcBeamOwnerCode;\n"
                    + "uniform int tcHasStockMask;\n"
                    + "uniform sampler2D tcStockShadowDepth;\n"
                    + "uniform int tcHasStockShadow;\n"
                    + "varying float tcBeamFraction;\n"
                    + "varying vec4 tcStockShadowPosition;\n"
                    + "void main() {\n"
                    + "    if (tcHasStockMask != 0) {\n"
                    + "        vec2 maskUv = (gl_FragCoord.xy - tcViewportOrigin)"
                    + " * tcInverseViewport;\n"
                    + "        vec4 stock = texture2D(tcStockMask, maskUv);\n"
                    + "        vec3 ownerDifference = abs(stock.rgb - tcBeamOwnerCode);\n"
                    + "        if (stock.a > 0.5"
                    + " && max(ownerDifference.r, max(ownerDifference.g, ownerDifference.b))"
                    + " > (0.5 / 255.0)) discard;\n"
                    + "    }\n"
                    + "    if (tcHasStockShadow != 0 && tcStockShadowPosition.w > 0.0) {\n"
                    + "        vec3 shadow = tcStockShadowPosition.xyz / tcStockShadowPosition.w;\n"
                    + "        vec2 shadowUv = shadow.xy * 0.5 + 0.5;\n"
                    + "        float shadowDepth = shadow.z * 0.5 + 0.5;\n"
                    + "        if (shadowUv.x >= 0.0 && shadowUv.x <= 1.0"
                    + " && shadowUv.y >= 0.0 && shadowUv.y <= 1.0"
                    + " && shadowDepth > texture2D(tcStockShadowDepth, shadowUv).r + 0.0015) discard;\n"
                    + "    }\n"
                    + "    float fade = 1.0 - clamp(tcBeamFraction, 0.0, 1.0);\n"
                    + "    float alpha = (90.0 / 255.0)"
                    + " * clamp(tcBeamOpacity, 0.0, 1.0) * fade;\n"
                    + "    vec3 rgb = tcPremultiplied != 0"
                    + " ? tcBeamColor * alpha : tcBeamColor * fade;\n"
                    + "    gl_FragColor = vec4(rgb, alpha);\n"
                    + "}\n";

    private static final FloatBuffer COLOR = BufferUtils.createFloatBuffer(3);
    private static final FloatBuffer OPACITY = BufferUtils.createFloatBuffer(1);
    private static final IntBuffer VIEWPORT = BufferUtils.createIntBuffer(16);
    private static int program;
    private static int vertexShader;
    private static int fragmentShader;
    private static int colorUniform;
    private static int opacityUniform;
    private static int premultipliedUniform;
    private static int stockMaskUniform;
    private static int inverseViewportUniform;
    private static int viewportOriginUniform;
    private static int beamOwnerCodeUniform;
    private static int hasStockMaskUniform;
    private static int eyeToStockShadowUniform;
    private static int stockShadowDepthUniform;
    private static int hasStockShadowUniform;
    private static boolean attempted;
    private static boolean failed;
    private static boolean loggedBackend;
    private static boolean loggedFailure;
    private static boolean loggedDiagnostics;
    private static ContextCapabilities compiledContext;

    private LegacyBeamShader() {}

    static boolean available() {
        ContextCapabilities currentContext = GLContext.getCapabilities();
        if (compiledContext != null && compiledContext != currentContext) {
            abandonObjects();
            attempted = false;
            failed = false;
            loggedBackend = false;
            loggedFailure = false;
            loggedDiagnostics = false;
        }
        if (ENABLED == false || OpenGlHelper.shadersSupported == false || failed) {
            return false;
        }
        if (attempted == false) {
            attempted = true;
            try {
                compileAndLink();
                compiledContext = currentContext;
            } catch (Throwable failure) {
                failed = true;
                deleteObjects();
                if (loggedFailure == false) {
                    loggedFailure = true;
                    Traincraft.tcLog.warn(
                            "Traincraft beam shader failed; using the tessellated fixed-function fallback.",
                            failure);
                }
            }
        }
        if (program != 0 && loggedBackend == false) {
            loggedBackend = true;
            Traincraft.tcLog.info(
                    "Rendering Traincraft semantic light beams with the GLSL 1.20 fade backend.");
        }
        if (program != 0 && DIAGNOSTICS && loggedDiagnostics == false) {
            loggedDiagnostics = true;
            runReadbackDiagnostics();
        }
        return program != 0;
    }

    static void bind(int color, float opacity, boolean premultiplied, int ownerId) {
        OpenGlHelper.func_153161_d(program);
        COLOR.clear();
        COLOR.put(((color >> 16) & 255) / 255.0F);
        COLOR.put(((color >> 8) & 255) / 255.0F);
        COLOR.put((color & 255) / 255.0F);
        COLOR.flip();
        OpenGlHelper.func_153191_c(colorUniform, COLOR);
        OPACITY.clear();
        OPACITY.put(Math.max(0.0F, Math.min(1.0F, opacity))).flip();
        OpenGlHelper.func_153168_a(opacityUniform, OPACITY);
        OpenGlHelper.func_153163_f(premultipliedUniform, premultiplied ? 1 : 0);
        VIEWPORT.clear();
        GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT);
        int viewportWidth = VIEWPORT.get(2);
        int viewportHeight = VIEWPORT.get(3);
        boolean hasMask = RollingStockDepthMask.available(viewportWidth, viewportHeight);
        OpenGlHelper.func_153163_f(hasStockMaskUniform, hasMask ? 1 : 0);
        GL20.glUniform2f(
                inverseViewportUniform,
                viewportWidth > 0 ? 1.0F / viewportWidth : 0.0F,
                viewportHeight > 0 ? 1.0F / viewportHeight : 0.0F);
        GL20.glUniform2f(viewportOriginUniform, VIEWPORT.get(0), VIEWPORT.get(1));
        int ownerCode = RollingStockDepthMask.encodedOwner(ownerId);
        GL20.glUniform3f(
                beamOwnerCodeUniform,
                ((ownerCode >> 16) & 255) / 255.0F,
                ((ownerCode >> 8) & 255) / 255.0F,
                (ownerCode & 255) / 255.0F);
        OpenGlHelper.func_153163_f(stockMaskUniform, 1);
        if (hasMask) {
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, RollingStockDepthMask.texture());
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        }
        boolean hasShadow = RollingStockShadowRenderer.available();
        OpenGlHelper.func_153163_f(hasStockShadowUniform, hasShadow ? 1 : 0);
        OpenGlHelper.func_153163_f(stockShadowDepthUniform, 2);
        RollingStockShadowRenderer.matrixBuffer().rewind();
        OpenGlHelper.func_153160_c(
                eyeToStockShadowUniform,
                false,
                RollingStockShadowRenderer.matrixBuffer());
        if (hasShadow) {
            OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, RollingStockShadowRenderer.texture());
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
        }
    }

    static void restore(int previousProgram) {
        OpenGlHelper.func_153161_d(previousProgram);
    }

    static void clear() {
        ContextCapabilities currentContext = currentContextOrNull();
        if (compiledContext == null || compiledContext == currentContext) {
            deleteObjects();
        } else {
            abandonObjects();
        }
        attempted = false;
        failed = false;
        loggedBackend = false;
        loggedFailure = false;
        loggedDiagnostics = false;
        compiledContext = null;
    }

    private static ContextCapabilities currentContextOrNull() {
        try {
            return GLContext.getCapabilities();
        } catch (IllegalStateException noContext) {
            return null;
        }
    }

    private static void compileAndLink() {
        vertexShader = compile(GL20.GL_VERTEX_SHADER, VERTEX_SOURCE, "vertex");
        fragmentShader = compile(GL20.GL_FRAGMENT_SHADER, FRAGMENT_SOURCE, "fragment");
        program = OpenGlHelper.func_153183_d();
        if (program == 0) {
            throw new IllegalStateException("OpenGL returned program 0");
        }
        OpenGlHelper.func_153178_b(program, vertexShader);
        OpenGlHelper.func_153178_b(program, fragmentShader);
        OpenGlHelper.func_153179_f(program);
        if (OpenGlHelper.func_153175_a(program, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
            throw new IllegalStateException(
                    "Beam shader link failed: " + OpenGlHelper.func_153166_e(program, 8192));
        }
        colorUniform = requiredUniform("tcBeamColor");
        opacityUniform = requiredUniform("tcBeamOpacity");
        premultipliedUniform = requiredUniform("tcPremultiplied");
        stockMaskUniform = requiredUniform("tcStockMask");
        inverseViewportUniform = requiredUniform("tcInverseViewport");
        viewportOriginUniform = requiredUniform("tcViewportOrigin");
        beamOwnerCodeUniform = requiredUniform("tcBeamOwnerCode");
        hasStockMaskUniform = requiredUniform("tcHasStockMask");
        eyeToStockShadowUniform = requiredUniform("tcEyeToStockShadow");
        stockShadowDepthUniform = requiredUniform("tcStockShadowDepth");
        hasStockShadowUniform = requiredUniform("tcHasStockShadow");
    }

    private static int compile(int type, String source, String stage) {
        int shader = OpenGlHelper.func_153195_b(type);
        if (shader == 0) {
            throw new IllegalStateException("OpenGL returned shader 0 for " + stage);
        }
        byte[] encoded = source.getBytes(UTF_8);
        ByteBuffer buffer = BufferUtils.createByteBuffer(encoded.length);
        buffer.put(encoded).flip();
        OpenGlHelper.func_153169_a(shader, buffer);
        OpenGlHelper.func_153170_c(shader);
        if (OpenGlHelper.func_153157_c(shader, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
            String log = OpenGlHelper.func_153158_d(shader, 8192);
            OpenGlHelper.func_153180_a(shader);
            throw new IllegalStateException("Beam " + stage + " shader compile failed: " + log);
        }
        return shader;
    }

    private static int requiredUniform(String name) {
        int location = OpenGlHelper.func_153194_a(program, name);
        if (location < 0) {
            throw new IllegalStateException("Missing beam shader uniform " + name);
        }
        return location;
    }

    private static void deleteObjects() {
        if (program != 0) OpenGlHelper.func_153187_e(program);
        if (vertexShader != 0) OpenGlHelper.func_153180_a(vertexShader);
        if (fragmentShader != 0) OpenGlHelper.func_153180_a(fragmentShader);
        program = 0;
        vertexShader = 0;
        fragmentShader = 0;
        colorUniform = -1;
        opacityUniform = -1;
        premultipliedUniform = -1;
        stockMaskUniform = -1;
        inverseViewportUniform = -1;
        viewportOriginUniform = -1;
        beamOwnerCodeUniform = -1;
        hasStockMaskUniform = -1;
        eyeToStockShadowUniform = -1;
        stockShadowDepthUniform = -1;
        hasStockShadowUniform = -1;
    }

    private static void abandonObjects() {
        program = 0;
        vertexShader = 0;
        fragmentShader = 0;
        colorUniform = -1;
        opacityUniform = -1;
        premultipliedUniform = -1;
        stockMaskUniform = -1;
        inverseViewportUniform = -1;
        viewportOriginUniform = -1;
        beamOwnerCodeUniform = -1;
        hasStockMaskUniform = -1;
        eyeToStockShadowUniform = -1;
        stockShadowDepthUniform = -1;
        hasStockShadowUniform = -1;
        compiledContext = null;
    }


    private static void runReadbackDiagnostics() {
        int previousFramebuffer =
                GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int framebuffer = 0;
        int texture = 0;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        try {
            framebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
            texture = GL11.glGenTextures();
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, texture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexImage2D(
                    GL11.GL_TEXTURE_2D,
                    0,
                    GL11.GL_RGBA8,
                    4,
                    1,
                    0,
                    GL11.GL_RGBA,
                    GL11.GL_UNSIGNED_BYTE,
                    (ByteBuffer) null);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
            EXTFramebufferObject.glFramebufferTexture2DEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                    EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT,
                    GL11.GL_TEXTURE_2D,
                    texture,
                    0);
            int status =
                    EXTFramebufferObject.glCheckFramebufferStatusEXT(
                            EXTFramebufferObject.GL_FRAMEBUFFER_EXT);
            if (status != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT) {
                throw new IllegalStateException(
                        "Diagnostic framebuffer status 0x" + Integer.toHexString(status));
            }
            GL11.glViewport(0, 0, 4, 1);
            GL11.glDisable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glColorMask(true, true, true, true);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            bind(0xFFFFFF, 1.0F, true, -1);
            float[] fractions = {0.0F, 0.5F, 0.95F, 1.0F};
            GL11.glBegin(GL11.GL_QUADS);
            for (int index = 0; index < fractions.length; index++) {
                float x0 = -1.0F + index * 0.5F;
                float x1 = x0 + 0.5F;
                GL11.glTexCoord1f(fractions[index]);
                GL11.glVertex2f(x0, -1.0F);
                GL11.glVertex2f(x1, -1.0F);
                GL11.glVertex2f(x1, 1.0F);
                GL11.glVertex2f(x0, 1.0F);
            }
            GL11.glEnd();
            ByteBuffer pixels = BufferUtils.createByteBuffer(16);
            GL11.glReadPixels(0, 0, 4, 1, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, pixels);
            StringBuilder result = new StringBuilder();
            for (int index = 0; index < 4; index++) {
                if (index > 0) result.append(", ");
                int offset = index * 4;
                result.append('[')
                        .append(pixels.get(offset) & 255)
                        .append(',')
                        .append(pixels.get(offset + 1) & 255)
                        .append(',')
                        .append(pixels.get(offset + 2) & 255)
                        .append(',')
                        .append(pixels.get(offset + 3) & 255)
                        .append(']');
            }
            Traincraft.tcLog.info(
                    "Beam shader GPU RGBA samples (source, midpoint, near-end, endpoint): {}",
                    result.toString());
        } catch (Throwable failure) {
            Traincraft.tcLog.warn(
                    "Beam shader diagnostics could not complete; normal rendering is unchanged.",
                    failure);
        } finally {
            OpenGlHelper.func_153161_d(previousProgram);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(matrixMode);
            GL11.glPopAttrib();
            if (texture != 0) GL11.glDeleteTextures(texture);
            if (framebuffer != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT(framebuffer);
            }
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }
}
