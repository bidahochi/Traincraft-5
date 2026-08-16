package train.client.render.lighting;

import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.EXTBlendMinmax;
import org.lwjgl.opengl.EXTFramebufferBlit;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GLContext;
import train.common.Traincraft;

/**
 * Optional framebuffer compositor that combines overlapping same-color beams with
 * {@code GL_MAX} opacity before blending once into the main framebuffer. Color buckets and
 * targets are reused across frames on the render thread. Unsupported hardware or allocation
 * failure returns false so {@link LightEffectRenderBatch} can draw the direct fallback.
 */
final class MaxOpacityLightCompositor
{
    private static final boolean ENABLED =
        "false".equalsIgnoreCase(System.getProperty("traincraft.lighting.glmax", "true")) == false;
    private static final ReusableColorBuckets<LightEffectSubmission> COLOR_BUCKETS =
        new ReusableColorBuckets<LightEffectSubmission>();

    private static final BeamAccumulationTarget EFFECTS = new BeamAccumulationTarget();
    private static int width;
    private static int height;
    private static boolean failed;
    private static int failedWidth;
    private static int failedHeight;
    private static boolean loggedBackend;
    private static ContextCapabilities allocatedContext;

    private MaxOpacityLightCompositor() {}

    static boolean render(List<LightEffectSubmission> submissions)
    {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (ENABLED == false || supported() == false || submissions.isEmpty())
        {
            return false;
        }
        ContextCapabilities currentContext = GLContext.getCapabilities();
        if (allocatedContext != null && allocatedContext != currentContext)
        {
            EFFECTS.abandon();
            width = 0;
            height = 0;
            failed = false;
            loggedBackend = false;
            allocatedContext = null;
        }
        COLOR_BUCKETS.clear();
        for (LightEffectSubmission submission : submissions)
        {
            if (LightEffectRenderBatch.hasVisibleBeam(submission))
            {
                COLOR_BUCKETS.add(submission.definition.color(), submission);
            }
        }
        if (COLOR_BUCKETS.size() == 0)
        {
            return false;
        }

        Framebuffer main = minecraft.getFramebuffer();
        if (main == null || main.framebufferObject < 0)
        {
            return false;
        }
        int targetWidth = main.framebufferWidth;
        int targetHeight = main.framebufferHeight;
        if (failed && (targetWidth != failedWidth || targetHeight != failedHeight))
        {
            failed = false;
        }
        if (failed)
        {
            return false;
        }
        try
        {
            ensure(targetWidth, targetHeight);
            copyDepth(
                main.framebufferObject,
                EFFECTS.framebuffer(),
                targetWidth,
                targetHeight);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, main.framebufferObject);
            for (int index = 0; index < COLOR_BUCKETS.size(); index++)
            {
                renderColorBucket(main, COLOR_BUCKETS.values(index));
            }
            if (loggedBackend == false)
            {
                loggedBackend = true;
                Traincraft.tcLog.info(
                    "Merging Traincraft light beams in a full-resolution RGBA8 GL_MAX target.");
            }
            return true;
        }
        catch (IllegalStateException | OpenGLException failure)
        {
            failed = true;
            failedWidth = targetWidth;
            failedHeight = targetHeight;
            Traincraft.tcLog.warn(
                "Disabling the GL_MAX beam compositor until resources reload; direct beams remain active.",
                failure);
            releaseFramebuffer();
            return false;
        }
        finally
        {
            COLOR_BUCKETS.clear();
        }
    }

    private static void renderColorBucket(
        Framebuffer main, List<LightEffectSubmission> submissions)
    {
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
        int shadowTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        OpenGlHelper.setActiveTexture(activeTexture);
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        try
        {
            OpenGlHelper.func_153161_d(0);
            EFFECTS.bind();
            EFFECTS.clearColor();
            EFFECTS.bind();
            LightEffectRenderBatch.setupEffectState();
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
            setBlendEquationMax();
            for (LightEffectSubmission submission : submissions)
            {
                LightEffectRenderBatch.drawBeamSubmission(submission, true);
            }
        }
        finally
        {
            OpenGlHelper.func_153161_d(previousProgram);
            restoreDefaultBlendEquation();
            GL11.glPopMatrix();
            GL11.glMatrixMode(matrixMode);
            GL11.glPopAttrib();
            OpenGlHelper.setActiveTexture(GL13.GL_TEXTURE2);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, shadowTexture);
            OpenGlHelper.setActiveTexture(activeTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
        composite(main.framebufferObject, previousFramebuffer);
    }

    private static boolean supported()
    {
        ContextCapabilities capabilities = GLContext.getCapabilities();
        return OpenGlHelper.isFramebufferEnabled()
               && capabilities.GL_EXT_framebuffer_blit
               && (capabilities.OpenGL14 || capabilities.GL_EXT_blend_minmax);
    }

    private static void ensure(int requestedWidth, int requestedHeight)
    {
        if (EFFECTS.matches(requestedWidth, requestedHeight))
        {
            return;
        }
        releaseFramebuffer();
        width = requestedWidth;
        height = requestedHeight;
        EFFECTS.allocate(width, height);
        allocatedContext = GLContext.getCapabilities();
    }

    private static void copyDepth(int source, int target, int copyWidth, int copyHeight)
    {
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferBlit.GL_READ_FRAMEBUFFER_EXT, source);
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferBlit.GL_DRAW_FRAMEBUFFER_EXT, target);
        EXTFramebufferBlit.glBlitFramebufferEXT(
            0,
            0,
            copyWidth,
            copyHeight,
            0,
            0,
            copyWidth,
            copyHeight,
            GL11.GL_DEPTH_BUFFER_BIT,
            GL11.GL_NEAREST);
    }

    private static void composite(int mainFramebuffer, int restoreFramebuffer)
    {
        int activeTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int matrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousProgram = GL11.glGetInteger(GL20.GL_CURRENT_PROGRAM);
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
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, mainFramebuffer);
            GL11.glViewport(0, 0, width, height);
            OpenGlHelper.func_153161_d(0);
            restoreDefaultBlendEquation();
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDepthMask(false);
            GL11.glDisable(GL11.GL_LIGHTING);
            // Minecraft 1.7 normally leaves a ~0.1 fixed-function alpha test
            // active. Applying it to the completed RGBA8 beam layer clips the
            // faint end of the continuous fade into a hard rectangular panel.
            // No alpha-test stage belongs in this composite pass.
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, EFFECTS.colorTexture());
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
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
        }
        finally
        {
            OpenGlHelper.func_153161_d(previousProgram);
            GL11.glPopMatrix();
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glPopMatrix();
            GL11.glMatrixMode(matrixMode);
            GL11.glPopAttrib();
            OpenGlHelper.setActiveTexture(activeTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, restoreFramebuffer);
        }
    }

    private static void setBlendEquationMax()
    {
        if (GLContext.getCapabilities().OpenGL14)
        {
            GL14.glBlendEquation(GL14.GL_MAX);
        }
        else
        {
            EXTBlendMinmax.glBlendEquationEXT(EXTBlendMinmax.GL_MAX_EXT);
        }
    }

    static void restoreDefaultBlendEquation()
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

    private static void releaseFramebuffer()
    {
        ContextCapabilities currentContext;
        try
        {
            currentContext = GLContext.getCapabilities();
        }
        catch (IllegalStateException noContext)
        {
            currentContext = null;
        }
        if (allocatedContext == null || allocatedContext == currentContext)
        {
            EFFECTS.release();
        }
        else
        {
            EFFECTS.abandon();
        }
        width = 0;
        height = 0;
        allocatedContext = null;
    }

    static void clear()
    {
        releaseFramebuffer();
        COLOR_BUCKETS.release();
        failed = false;
        failedWidth = 0;
        failedHeight = 0;
        loggedBackend = false;
    }
}
