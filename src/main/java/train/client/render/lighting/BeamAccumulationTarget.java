package train.client.render.lighting;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

/** Full-resolution RGBA8 color target with a depth attachment. */
final class BeamAccumulationTarget
{
    private static final int GL_DEPTH_COMPONENT24 = 0x81A6;

    private int framebuffer;
    private int colorTexture;
    private int depthRenderbuffer;
    private int width;
    private int height;

    boolean matches(int requestedWidth, int requestedHeight)
    {
        return framebuffer != 0 && width == requestedWidth && height == requestedHeight;
    }

    void allocate(int requestedWidth, int requestedHeight)
    {
        release();
        if (requestedWidth <= 0 || requestedHeight <= 0)
        {
            throw new IllegalArgumentException(
                "Invalid beam framebuffer size " + requestedWidth + "x" + requestedHeight);
        }
        width = requestedWidth;
        height = requestedHeight;
        framebuffer = EXTFramebufferObject.glGenFramebuffersEXT();
        colorTexture = GL11.glGenTextures();
        depthRenderbuffer = EXTFramebufferObject.glGenRenderbuffersEXT();
        if (framebuffer == 0 || colorTexture == 0 || depthRenderbuffer == 0)
        {
            release();
            throw new IllegalStateException("OpenGL did not allocate beam framebuffer objects");
        }

        int previousFramebuffer =
            GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        boolean allocationComplete = false;
        try
        {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, colorTexture);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
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
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
            EXTFramebufferObject.glFramebufferTexture2DEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                EXTFramebufferObject.GL_COLOR_ATTACHMENT0_EXT,
                GL11.GL_TEXTURE_2D,
                colorTexture,
                0);
            EXTFramebufferObject.glBindRenderbufferEXT(
                EXTFramebufferObject.GL_RENDERBUFFER_EXT, depthRenderbuffer);
            EXTFramebufferObject.glRenderbufferStorageEXT(
                EXTFramebufferObject.GL_RENDERBUFFER_EXT, GL_DEPTH_COMPONENT24, width, height);
            EXTFramebufferObject.glFramebufferRenderbufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT,
                EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT,
                EXTFramebufferObject.GL_RENDERBUFFER_EXT,
                depthRenderbuffer);
            int status =
                EXTFramebufferObject.glCheckFramebufferStatusEXT(
                    EXTFramebufferObject.GL_FRAMEBUFFER_EXT);
            if (status != EXTFramebufferObject.GL_FRAMEBUFFER_COMPLETE_EXT)
            {
                throw new IllegalStateException(
                    "Incomplete RGBA8 beam framebuffer: 0x" + Integer.toHexString(status));
            }
            allocationComplete = true;
        }
        finally
        {
            if (allocationComplete == false)
            {
                release();
            }
            EXTFramebufferObject.glBindRenderbufferEXT(EXTFramebufferObject.GL_RENDERBUFFER_EXT, 0);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
            EXTFramebufferObject.glBindFramebufferEXT(
                EXTFramebufferObject.GL_FRAMEBUFFER_EXT, previousFramebuffer);
        }
    }

    void bind()
    {
        EXTFramebufferObject.glBindFramebufferEXT(
            EXTFramebufferObject.GL_FRAMEBUFFER_EXT, framebuffer);
        GL11.glViewport(0, 0, width, height);
    }

    /**
     * The completed scene depth is copied immediately after this clear, so clearing the
     * full-resolution depth attachment here only duplicates a costly bandwidth pass.
     */
    void clearColor()
    {
        GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GL11.glColorMask(true, true, true, true);
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
    }

    int framebuffer()
    {
        return framebuffer;
    }

    int colorTexture()
    {
        return colorTexture;
    }

    int width()
    {
        return width;
    }

    int height()
    {
        return height;
    }

    void release()
    {
        if (depthRenderbuffer != 0)
        {
            EXTFramebufferObject.glDeleteRenderbuffersEXT(depthRenderbuffer);
        }
        if (colorTexture != 0)
        {
            GL11.glDeleteTextures(colorTexture);
        }
        if (framebuffer != 0)
        {
            EXTFramebufferObject.glDeleteFramebuffersEXT(framebuffer);
        }
        framebuffer = 0;
        colorTexture = 0;
        depthRenderbuffer = 0;
        width = 0;
        height = 0;
    }

    /** Drops names from a destroyed context without deleting names in its replacement. */
    void abandon()
    {
        framebuffer = 0;
        colorTexture = 0;
        depthRenderbuffer = 0;
        width = 0;
        height = 0;
    }
}
