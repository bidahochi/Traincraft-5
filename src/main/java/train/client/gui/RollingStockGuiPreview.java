package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import train.client.render.RenderRollingStock;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.Freight;
import train.common.entity.CargoManager;
import train.common.library.register.ITrainRecord;

import java.awt.Rectangle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * Client-thread owner of one GUI's rolling-stock measurements and graphics resources.
 * Visible pixels determine a stable scale across a full turn and the configured tilt range.
 * Fits distinguish livery, cargo selection, and inventory fill. Cargo choosers can reserve
 * the fullest freight load so animation does not resize the preview. Changes to the record, panel,
 * or resources invalidate measurements. The owning GUI must close this renderer when dismissed.
 */
@SideOnly(Side.CLIENT)
public final class RollingStockGuiPreview
{
    /** Chooses whether a preview fits its current freight fill or reserves the complete loading animation. */
    public enum CargoSizing
    {
        /** Fits the actual load state displayed by paintbrush and crafting previews. */
        CURRENT_LOAD,
        /** Reserves the largest inventory fill while cargo selection previews animate their loads. */
        FULL_LOAD
    }

    private static final int CAPTURE_SIZE_PIXELS = 256;
    private static final int FIT_PADDING_PIXELS = 3;
    private static final float DEFAULT_GUI_SCALE = 8.0F;
    private static final int MAX_CAPTURE_ATTEMPTS = 6;
    private static final int MAX_CACHED_FITS = 128;

    /** Client-render-thread generation; no GUI or entity references are retained globally. */
    private static long resourceGeneration;

    private final float maximumTiltDegrees;
    private final float previewDepth;
    private final CargoSizing cargoSizing;
    private final List<MeasuredFit> fits = new ArrayList<MeasuredFit>();
    private long observedResourceGeneration = resourceGeneration;
    private ITrainRecord activeRecord;
    private int measuredWidthPixels;
    private int measuredHeightPixels;
    private Framebuffer framebuffer;
    private ByteBuffer pixels;
    private boolean captureFailed;

    private static final class MeasuredFit
    {
        private final int color;
        private final int cargoSelection;
        private final int cargoAmount;
        private final RollingStockPreviewFit fit;

        private MeasuredFit(int color, int cargoSelection, int cargoAmount, RollingStockPreviewFit fit)
        {
            this.color = color;
            this.cargoSelection = cargoSelection;
            this.cargoAmount = cargoAmount;
            this.fit = fit;
        }
    }

    /**
     * Creates a GUI-owned renderer without allocating graphics objects.
     *
     * @param maximumTiltDegrees largest absolute X-axis tilt, clamped to 0 through 90 degrees;
     *         non-finite values become zero
     * @param previewDepth depth in the GUI's projection; non-finite values use the standard preview depth
     * @param cargoSizing current displayed fill or the animation's full load; null uses current fill
     */
    public RollingStockGuiPreview(float maximumTiltDegrees, float previewDepth, CargoSizing cargoSizing)
    {
        this.maximumTiltDegrees = Float.isFinite(maximumTiltDegrees)
                ? Math.min(90, Math.max(0, maximumTiltDegrees)) : 0;
        this.previewDepth = Float.isFinite(previewDepth) ? previewDepth : 400.0F;
        this.cargoSizing = cargoSizing == null ? CargoSizing.CURRENT_LOAD : cargoSizing;
    }

    /**
     * Marks open GUI measurements stale after client-thread resource reload.
     * Each renderer releases its target on the next draw, or when its owning GUI closes.
     */
    public static void invalidateResources()
    {
        resourceGeneration++;
    }

    /**
     * Draws temporary rolling stock within an absolute rectangle of scaled GUI pixels.
     * Yaw and tilt are degrees, with tilt applied about X after yaw. The preferred center
     * uses absolute GUI Y; downward bias stops at the fitted bottom padding. Full brightness
     * is a per-draw choice so cargo lighting controls continue to work. Empty or unsupported
     * previews do no capture work. Renderer flags, lightmap coordinates, matrices, and draw
     * attributes are restored when drawing finishes or fails.
     */
    public void render(AbstractTrains rollingStock, ITrainRecord record, Rectangle bounds,
            float yawDegrees, float tiltDegrees, float preferredCenterGuiY, boolean fullBright)
    {
        if (rollingStock == null || record == null || bounds == null
                || bounds.width <= FIT_PADDING_PIXELS * 2 || bounds.height <= FIT_PADDING_PIXELS * 2
                || Minecraft.getMinecraft().theWorld == null)
        {
            return;
        }
        Render renderer = RenderManager.instance.getEntityRenderObject(rollingStock);
        if (renderer == null)
        {
            return;
        }
        if (observedResourceGeneration != resourceGeneration)
        {
            close();
        }
        if (activeRecord != record || measuredWidthPixels != bounds.width || measuredHeightPixels != bounds.height)
        {
            fits.clear();
            captureFailed = false;
            activeRecord = record;
            measuredWidthPixels = bounds.width;
            measuredHeightPixels = bounds.height;
        }
        int color = rollingStock.getColor();
        CargoManager cargoManager = rollingStock.getCargoManager();
        int cargoSelection = cargoManager == null ? 0 : cargoManager.getSelectedCargo();
        int cargoAmount = 0;
        if (rollingStock instanceof Freight)
        {
            Freight freight = (Freight) rollingStock;
            cargoAmount = cargoSizing == CargoSizing.FULL_LOAD
                    ? freight.getSizeInventory() : freight.getAmmountOfCargo();
        }
        RollingStockPreviewFit fit = null;
        for (int index = 0; index < fits.size(); index++)
        {
            MeasuredFit measured = fits.get(index);
            if (measured.color == color && measured.cargoSelection == cargoSelection
                    && measured.cargoAmount == cargoAmount)
            {
                fit = measured.fit;
                break;
            }
        }
        if (fit == null)
        {
            fit = measure(rollingStock, record, renderer, bounds.width, bounds.height);
            if (fits.size() >= MAX_CACHED_FITS)
            {
                fits.remove(0);
            }
            fits.add(new MeasuredFit(color, cargoSelection, cargoAmount, fit));
        }

        float centerGuiX = bounds.x + bounds.width * 0.5F;
        float centerGuiY = bounds.y + bounds.height * 0.5F;
        float requestedLoweringPixels = preferredCenterGuiY - centerGuiY;
        float modelGuiX = centerGuiX + fit.getHorizontalOffsetPixels(yawDegrees);
        float verticalOffsetPixels = fit.getVerticalOffsetPixels(yawDegrees, tiltDegrees, requestedLoweringPixels);
        float modelGuiY = centerGuiY + verticalOffsetPixels;
        float previousLightX = OpenGlHelper.lastBrightnessX;
        float previousLightY = OpenGlHelper.lastBrightnessY;
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousModelviewDepth = GL11.glGetInteger(GL11.GL_MODELVIEW_STACK_DEPTH);
        int previousProjectionDepth = GL11.glGetInteger(GL11.GL_PROJECTION_STACK_DEPTH);
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_DEPTH_BUFFER_BIT | GL11.GL_COLOR_BUFFER_BIT
                | GL11.GL_LIGHTING_BIT | GL11.GL_TEXTURE_BIT | GL11.GL_CURRENT_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        RenderRollingStock.setRenderModeGUI(true);
        RenderRollingStock.setRenderGUIFullBright(fullBright);
        try
        {
            GL11.glColor4f(1, 1, 1, 1);
            if (fullBright == false)
            {
                RenderHelper.enableGUIStandardItemLighting();
            }
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
            GL11.glTranslatef(modelGuiX, modelGuiY, previewDepth);
            drawModel(renderer, rollingStock, fit.getScale(), yawDegrees, tiltDegrees);
        }
        finally
        {
            RenderRollingStock.setRenderModeGUI(false);
            RenderRollingStock.setRenderGUIFullBright(false);
            restoreMatrixStacks(previousModelviewDepth, previousProjectionDepth, previousMatrixMode);
            GL11.glPopAttrib();
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, previousLightX, previousLightY);
            OpenGlHelper.setActiveTexture(previousActiveTexture);
        }
    }

    /**
     * Measures four perpendicular views in a reusable offscreen render target.
     * If any view is empty or clipped, the next attempt halves the capture scale.
     * Missing framebuffer support or exhausted attempts use a safe common fallback scale.
     *
     * This optional graphics probe deliberately catches RuntimeException at its boundary:
     * target creation and driver access can fail independently of ordinary GUI drawing.
     * Cleanup restores the caller's target, matrices, attributes, texture unit, and
     * lightmap coordinates before returning the common fallback. A failed probe is
     * disabled for this menu, so errors are not logged repeatedly. Ordinary model
     * rendering still runs separately and propagates its own failures.
     */
    private RollingStockPreviewFit measure(AbstractTrains rollingStock, ITrainRecord record, Render renderer,
            int previewWidthPixels, int previewHeightPixels)
    {
        RollingStockPreviewFit fallback = RollingStockPreviewFit.fallback(DEFAULT_GUI_SCALE);
        if (captureFailed || (OpenGlHelper.isFramebufferEnabled() == false))
        {
            return fallback;
        }

        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousRenderbuffer = GL11.glGetInteger(EXTFramebufferObject.GL_RENDERBUFFER_BINDING_EXT);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousModelviewDepth = GL11.glGetInteger(GL11.GL_MODELVIEW_STACK_DEPTH);
        int previousProjectionDepth = GL11.glGetInteger(GL11.GL_PROJECTION_STACK_DEPTH);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        float previousLightX = OpenGlHelper.lastBrightnessX;
        float previousLightY = OpenGlHelper.lastBrightnessY;
        Freight freight = null;
        if (cargoSizing == CargoSizing.FULL_LOAD && rollingStock instanceof Freight)
        {
            freight = (Freight) rollingStock;
        }
        int previousCargoAmount = freight == null ? 0 : freight.getAmmountOfCargo();
        final double captureDepthRange = 1000.0;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushClientAttrib(GL11.GL_CLIENT_PIXEL_STORE_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho(0, CAPTURE_SIZE_PIXELS, CAPTURE_SIZE_PIXELS, 0, -captureDepthRange, captureDepthRange);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        // Reserve the largest animated freight load, then restore the temporary entity before drawing it.
        try
        {
            if (freight != null)
            {
                int fullCargoAmount = freight.getSizeInventory();
                freight.getDataWatcher().updateObject(Freight.CARGO_AMOUNT_DATA_WATCHER_INDEX, fullCargoAmount);
            }
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            if (framebuffer == null)
            {
                framebuffer = new Framebuffer(CAPTURE_SIZE_PIXELS, CAPTURE_SIZE_PIXELS, true);
                final int channelsPerPixel = 4;
                int captureBufferBytes = CAPTURE_SIZE_PIXELS * CAPTURE_SIZE_PIXELS * channelsPerPixel;
                pixels = BufferUtils.createByteBuffer(captureBufferBytes);
            }
            framebuffer.bindFramebuffer(true);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glClearDepth(1.0);
            GL11.glDepthMask(true);
            GL11.glColorMask(true, true, true, true);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            final float alphaDiscardThreshold = 0.01F;
            GL11.glAlphaFunc(GL11.GL_GREATER, alphaDiscardThreshold);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glPixelStorei(GL11.GL_PACK_ALIGNMENT, 1);
            GL11.glPixelStorei(GL11.GL_PACK_ROW_LENGTH, 0);
            GL11.glPixelStorei(GL11.GL_PACK_SKIP_ROWS, 0);
            GL11.glPixelStorei(GL11.GL_PACK_SKIP_PIXELS, 0);
            RenderRollingStock.setRenderModeGUI(true);
            RenderRollingStock.setRenderGUIFullBright(true);

            float captureScale = DEFAULT_GUI_SCALE;
            final int viewCount = 4;
            final int viewYawStepDegrees = 90;
            final float retryScaleMultiplier = 0.5F;
            float captureCenterPixels = CAPTURE_SIZE_PIXELS * 0.5F;
            for (int attempt = 0; attempt < MAX_CAPTURE_ATTEMPTS; attempt++, captureScale *= retryScaleMultiplier)
            {
                Rectangle[] views = new Rectangle[viewCount];
                boolean complete = true;
                for (int view = 0; view < views.length; view++)
                {
                    GL11.glClearColor(0, 0, 0, 0);
                    GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
                    GL11.glLoadIdentity();
                    GL11.glTranslatef(captureCenterPixels, captureCenterPixels, 0);
                    GL11.glColor4f(1, 1, 1, 1);
                    float viewYawDegrees = view * viewYawStepDegrees;
                    drawModel(renderer, rollingStock, captureScale, viewYawDegrees, 0);
                    pixels.clear();
                    GL11.glReadPixels(0, 0, CAPTURE_SIZE_PIXELS, CAPTURE_SIZE_PIXELS,
                            GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, pixels);
                    views[view] = RollingStockPreviewFit.visibleBounds(pixels,
                            CAPTURE_SIZE_PIXELS, CAPTURE_SIZE_PIXELS);
                    boolean viewComplete = RollingStockPreviewFit.isComplete(views[view], CAPTURE_SIZE_PIXELS);
                    complete = complete && viewComplete;
                }
                if (complete)
                {
                    return RollingStockPreviewFit.fromViews(views, CAPTURE_SIZE_PIXELS, captureScale,
                            previewWidthPixels, previewHeightPixels, FIT_PADDING_PIXELS, maximumTiltDegrees);
                }
            }
            return fallback;
        }
        catch (RuntimeException failure)
        {
            captureFailed = true;
            String stockType = record.getEntityClass().getName();
            Traincraft.tcLog.warn("Could not auto-fit rolling-stock preview for " + stockType
                    + "; using the common fallback scale.", failure);
            return fallback;
        }
        finally
        {
            if (freight != null)
            {
                freight.getDataWatcher().updateObject(
                        Freight.CARGO_AMOUNT_DATA_WATCHER_INDEX, previousCargoAmount);
            }
            RenderRollingStock.setRenderModeGUI(false);
            RenderRollingStock.setRenderGUIFullBright(false);
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            OpenGlHelper.func_153176_h(OpenGlHelper.field_153199_f, previousRenderbuffer);
            restoreMatrixStacks(previousModelviewDepth, previousProjectionDepth, previousMatrixMode);
            GL11.glPopClientAttrib();
            GL11.glPopAttrib();
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, previousLightX, previousLightY);
            OpenGlHelper.setActiveTexture(previousActiveTexture);
        }
    }

    /** Draws model geometry at its origin, excluding world shadows, fire, and F3+B hitboxes from GUI bounds. */
    private static void drawModel(Render renderer, AbstractTrains rollingStock, float scale,
            float yawDegrees, float tiltDegrees)
    {
        final float guiAxisFlipDegrees = 180.0F;
        GL11.glScalef(-scale, scale, scale);
        GL11.glRotatef(guiAxisFlipDegrees, 0, 0, 1);
        GL11.glRotatef(tiltDegrees, 1, 0, 0);
        GL11.glRotatef(yawDegrees, 0, 1, 0);
        renderer.doRender(rollingStock, 0, 0, 0, 0, 0);
    }

    /**
     * Unwinds preview-owned projection and modelview matrices, including extra pushes left by a failed model.
     * The saved depths describe the caller's stacks before the preview starts; the saved mode is restored last.
     * Model renderers must not pop matrices owned by their caller.
     */
    public static void restoreMatrixStacks(int modelviewDepth, int projectionDepth, int matrixMode)
    {
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        int currentDepth = GL11.glGetInteger(GL11.GL_MODELVIEW_STACK_DEPTH);
        while (currentDepth > modelviewDepth)
        {
            GL11.glPopMatrix();
            currentDepth--;
        }
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        currentDepth = GL11.glGetInteger(GL11.GL_PROJECTION_STACK_DEPTH);
        while (currentDepth > projectionDepth)
        {
            GL11.glPopMatrix();
            currentDepth--;
        }
        GL11.glMatrixMode(matrixMode);
    }

    /**
     * Releases an owned target while preserving unrelated framebuffer, renderbuffer, and texture bindings.
     * Bindings to the released objects become zero. Null and already-released targets do no work.
     * Requires the target's client OpenGL context. Minecraft 1.7's deleteFramebuffer method skips
     * deletion when the framebuffer setting is disabled, so cleanup uses the underlying helpers.
     */
    public static void releaseFramebuffer(Framebuffer target)
    {
        if (target == null)
        {
            return;
        }
        if (target.framebufferObject < 0 && target.framebufferTexture < 0 && target.depthBuffer < 0)
        {
            return;
        }
        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousRenderbuffer = GL11.glGetInteger(EXTFramebufferObject.GL_RENDERBUFFER_BINDING_EXT);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int previousTexture = GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
        if (previousFramebuffer == target.framebufferObject)
        {
            previousFramebuffer = 0;
        }
        if (previousRenderbuffer == target.depthBuffer)
        {
            previousRenderbuffer = 0;
        }
        if (previousTexture == target.framebufferTexture)
        {
            previousTexture = 0;
        }
        try
        {
            if (target.depthBuffer >= 0)
            {
                OpenGlHelper.func_153184_g(target.depthBuffer);
                target.depthBuffer = -1;
            }
            if (target.framebufferTexture >= 0)
            {
                TextureUtil.deleteTexture(target.framebufferTexture);
                target.framebufferTexture = -1;
            }
            if (target.framebufferObject >= 0)
            {
                OpenGlHelper.func_153174_h(target.framebufferObject);
                target.framebufferObject = -1;
            }
        }
        finally
        {
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            OpenGlHelper.func_153176_h(OpenGlHelper.field_153199_f, previousRenderbuffer);
            OpenGlHelper.setActiveTexture(previousActiveTexture);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, previousTexture);
        }
    }

    /** Releases this GUI's graphics target and measurements on the client thread; safe to call more than once. */
    public void close()
    {
        releaseFramebuffer(framebuffer);
        framebuffer = null;
        pixels = null;
        fits.clear();
        activeRecord = null;
        captureFailed = false;
        observedResourceGeneration = resourceGeneration;
    }
}
