package train.client.render.lighting;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

/** Reusable depth-copy and single-channel-compatible RGBA8 illumination targets. */
final class DynamicHeadlightTarget
{
    private static final int GL_DEPTH_COMPONENT24 = 0x81A6;

    private int depthFramebuffer;
    private int depthTexture;
    private int lightFramebuffer;
    private int lightTexture;
    private int width;
    private int height;

    boolean matches(int requestedWidth, int requestedHeight)
    {
        return depthFramebuffer != 0
               && lightFramebuffer != 0
               && width == requestedWidth
               && height == requestedHeight;
    }

    void allocate(int requestedWidth, int requestedHeight)
    {
        release();
        if (requestedWidth <= 0 || requestedHeight <= 0)
        {
            throw new IllegalArgumentException(
                "Invalid dynamic-light target size "
                + requestedWidth
                + "x"
                + requestedHeight);
        }
        width = requestedWidth;
        height = requestedHeight;
        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        boolean allocationComplete = false;
        try
        {
            allocateDepthTarget();
            allocateLightTarget();
            allocationComplete = true;
        }
        finally
        {
            if (allocationComplete == false)
            {
                release();
            }
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }

    private void allocateDepthTarget()
    {
        depthFramebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
        depthTexture = GL11.glGenTextures();
        if (depthFramebuffer == 0 || depthTexture == 0)
        {
            throw new IllegalStateException("OpenGL did not allocate the dynamic-light depth target");
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, depthTexture);
        configureTexture();
        GL11.glTexImage2D(
            GL11.GL_TEXTURE_2D,
            0,
            GL_DEPTH_COMPONENT24,
            width,
            height,
            0,
            GL11.GL_DEPTH_COMPONENT,
            GL11.GL_UNSIGNED_INT,
            (ByteBuffer) null);
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT, depthFramebuffer);
        EXTFramebufferObject.glFramebufferTexture2DEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
            EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT,
            GL11.GL_TEXTURE_2D,
            depthTexture,
            0);
        GL11.glDrawBuffer(GL11.GL_NONE);
        GL11.glReadBuffer(GL11.GL_NONE);
        requireComplete("depth");
    }

    private void allocateLightTarget()
    {
        lightFramebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
        lightTexture = GL11.glGenTextures();
        if (lightFramebuffer == 0 || lightTexture == 0)
        {
            throw new IllegalStateException("OpenGL did not allocate the dynamic-light color target");
        }
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, lightTexture);
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
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT, lightFramebuffer);
        EXTFramebufferObject.glFramebufferTexture2DEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
            EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT,
            GL11.GL_TEXTURE_2D,
            lightTexture,
            0);
        GL11.glDrawBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);
        GL11.glReadBuffer(EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT);
        requireComplete("color");
    }

    private static void configureTexture()
    {
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
    }

    private static void requireComplete(String name)
    {
        int status = EXTFramebufferObject.glCheckFramebufferStatusEXT(
                         EXTFramebufferObject.GL_FRAMEBUFFER_EXT);
        if (status != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT)
        {
            throw new IllegalStateException(
                "Incomplete dynamic-light "
                + name
                + " framebuffer: 0x"
                + Integer.toHexString(status));
        }
    }

    int depthFramebuffer()
    {
        return depthFramebuffer;
    }

    int depthTexture()
    {
        return depthTexture;
    }

    int lightFramebuffer()
    {
        return lightFramebuffer;
    }

    int lightTexture()
    {
        return lightTexture;
    }

    void release()
    {
        if (depthTexture != 0)
        {
            GL11.glDeleteTextures(depthTexture);
        }
        if (lightTexture != 0)
        {
            GL11.glDeleteTextures(lightTexture);
        }
        if (depthFramebuffer != 0)
        {
            EXTFramebufferObject.glDeleteFramebuffersEXT(depthFramebuffer);
        }
        if (lightFramebuffer != 0)
        {
            EXTFramebufferObject.glDeleteFramebuffersEXT(lightFramebuffer);
        }
        abandon();
    }

    void abandon()
    {
        depthFramebuffer = 0;
        depthTexture = 0;
        lightFramebuffer = 0;
        lightTexture = 0;
        width = 0;
        height = 0;
    }
}
