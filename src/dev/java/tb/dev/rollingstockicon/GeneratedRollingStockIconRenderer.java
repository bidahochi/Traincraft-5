package tb.dev.rollingstockicon;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.EXTFramebufferObject;
import train.client.gui.RollingStockGuiPreview;
import train.client.render.RenderRollingStock;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.entity.CargoManager;
import train.common.library.register.ITrainRecord;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

/**
 * Dev-only capture helper that turns a rollingstock model into a flat icon image.
 *
 * The capture path renders the model once into an offscreen framebuffer, reads the pixels into a
 * BufferedImage, then crops a final 128x128 item icon from a slightly larger 2D canvas. Keeping
 * that larger canvas lets the dev table move the finished image without re-rendering or clipping
 * the model differently. This class intentionally lives in {@code src/dev}: production jars should
 * use generated PNG assets, not live model/framebuffer capture.
 */
public class GeneratedRollingStockIconRenderer {
	private GeneratedRollingStockIconRenderer() {
	}

	// Final item icon size and the hidden margin used by the dev table's screen X/Y controls.
	private static final int ICON_SIZE = 128;
	private static final int ICON_OVERSCAN = 32;
	private static final int ICON_CANVAS_SIZE = ICON_SIZE + ICON_OVERSCAN * 2;
	private static final int ICON_CROP_LEFT = ICON_OVERSCAN;
	private static final int ICON_CROP_RIGHT = ICON_OVERSCAN + ICON_SIZE;
	private static final int AUTO_FRAME_FRONT_PADDING = 6;
	private static final int VISIBLE_ALPHA_THRESHOLD = 8;
	// One visible capture pixel can require enlargement across the complete icon after presets are retired.
	private static final float MAX_AUTO_FIT_SCALE_UP = ICON_SIZE;
	private static final int AUTO_FIT_EDGE_RETRY_COUNT = 4;
	private static final int AUTO_FIT_WORKING_EDGE_PADDING = 1;
	private static final float AUTO_FIT_EDGE_SHRINK = 0.9F;
	private static final int ICON_CAPTURE_ENTITY_ID = 1;
	// Discard only nearly-invisible texels. This prevents transparent railing pixels from
	// writing depth while preserving anti-aliased/thin model details in generated icons.
	private static final float CAPTURE_ALPHA_DISCARD_THRESHOLD = 0.01F;

	// Offscreen framebuffer size and orthographic view. These scale together so the apparent
	// model size stays stable while long stock has more X/Y capture room before pixels are read.
	private static final int CAPTURE_SIZE = 512;
	private static final int CAPTURE_VIEW_SIZE = 448;

	// The capture baseline is independent of retired per-train GUI scale presets.
	private static final float DEFAULT_BASE_ICON_SCALE = 8.0F;
	private static final float DEFAULT_SCALE_MULTIPLIER = 2.0F;
	private static final double CAPTURE_NEAR_PLANE = -1000.0D;
	private static final double CAPTURE_FAR_PLANE = 1000.0D;
	private static final float CAPTURE_CENTER_X = 0.5F;
	private static final float CAPTURE_CENTER_Y = 0.58F;
	private static final float CAPTURE_MODEL_Z = 400.0F;
	private static final float FLIP_ICON_Z_ROTATION = 180.0F;

	// Defaults mirrored by the dev table when a stock has no saved JSON tuning yet.
	public static final float DEFAULT_ICON_YAW = 135.0F;
	public static final float DEFAULT_ICON_PITCH = 30.0F;
	public static final float DEFAULT_ICON_BOGIE_OFFSET_MULTIPLIER = 0.2F;
	public static final float DEFAULT_ICON_SCREEN_X_OFFSET = 0.0F;
	public static final float DEFAULT_ICON_SCREEN_Y_OFFSET = 0.0F;
	public static final int CARGO_SELECTION_DEFAULT = -1;
	public static final int CARGO_SELECTION_NONE = 0;

	/*
	 * Identity and defaults
	 *
	 * The dev table needs stable names for JSON/PNG output and a predictable starting point for
	 * new stock. Scale starts at twice the common capture baseline, then the first-load
	 * auto-fit pass tightens it to the actual visible pixels.
	 */
	public static int getRenderColor(ItemStack stack, ITrainRecord record) {
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("trainColor")) {
			return stack.getTagCompound().getInteger("trainColor");
		}

		int[] colors = record.getColors();
		return colors != null && colors.length > 0 ? colors[0] : -1;
	}

	/** Returns a stable capture baseline before pixel-based auto-fit or saved manual tuning is applied. */
    public static CaptureSettings getDefaultSettings()
    {
        float scale = DEFAULT_BASE_ICON_SCALE * DEFAULT_SCALE_MULTIPLIER;
        return new CaptureSettings(DEFAULT_ICON_YAW, DEFAULT_ICON_PITCH, scale,
                DEFAULT_ICON_SCREEN_X_OFFSET, DEFAULT_ICON_SCREEN_Y_OFFSET, DEFAULT_ICON_BOGIE_OFFSET_MULTIPLIER);
    }

	public static int getCargoOptionCount(ItemStack stack) {
		if (stack == null) {
			return 0;
		}

		ITrainRecord record = Traincraft.traincraftRegistry.getCurrentTrain(stack.getItem());
		if (record == null) {
			return 0;
		}

		AbstractTrains train = getTemporaryTrain(record);
		CargoManager cargoManager = train == null ? null : train.getCargoManager();
		return cargoManager == null ? 0 : cargoManager.getCargoSpecificationList().length;
	}

	public static String getIconBaseName(ITrainRecord record) {
		String itemResourceName = getItemResourceName(record);
		if (itemResourceName != null && itemResourceName.length() > 0) {
			return sanitizeFileName(itemResourceName);
		}

		return sanitizeFileName(record == null ? null : record.getInternalName());
	}

	public static String getItemResourceName(ITrainRecord record) {
		if (record == null || record.getItem() == null) {
			return "";
		}

		String itemResourceName = Item.itemRegistry.getNameForObject(record.getItem());
		return itemResourceName == null ? "" : itemResourceName;
	}

	/*
	 * Capture pipeline
	 *
	 * This is the only place that asks Minecraft/OpenGL to render a rollingstock model. The result
	 * is immediately read back into BufferedImages so the GUI preview and file writer can use the
	 * same pixels without keeping a live 3D renderer around.
	 */
	public static CaptureResult captureIcon(ItemStack stack, CaptureSettings settings) {
		return captureIcon(stack, settings, true);
	}

	public static CaptureResult captureIcon(ItemStack stack, CaptureSettings settings, boolean autoFrameFront) {
		if (stack == null) {
			return null;
		}

		ITrainRecord record = Traincraft.traincraftRegistry.getCurrentTrain(stack.getItem());
		if (record == null) {
			return null;
		}

		return captureIcon(record, getRenderColor(stack, record), settings, autoFrameFront, stack);
	}

	public static CaptureResult captureIcon(ITrainRecord record, int color, CaptureSettings settings) {
		return captureIcon(record, color, settings, true);
	}

	public static CaptureResult captureIcon(ITrainRecord record, int color, CaptureSettings settings, boolean autoFrameFront) {
		return captureIcon(record, color, settings, autoFrameFront, null);
	}

    /**
     * Captures only model geometry and restores the caller's render target and graphics state afterward.
     * Invalid optional settings, missing renderers, and recoverable graphics failures return null.
     * Runtime failures are reported with the stock identity; serious VM errors propagate after cleanup.
     * The caller owns a successful result's framebuffer and must release it through CaptureResult.
     */
    private static CaptureResult captureIcon(ITrainRecord record, int color, CaptureSettings settings,
            boolean autoFrameFront, ItemStack stack)
    {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (record == null || settings == null || minecraft.theWorld == null
                || (OpenGlHelper.isFramebufferEnabled() == false))
        {
            return null;
        }
        if ((Float.isFinite(settings.scale) == false) || settings.scale <= 0
                || (Float.isFinite(settings.yaw) == false) || (Float.isFinite(settings.pitch) == false)
                || (Float.isFinite(settings.screenX) == false) || (Float.isFinite(settings.screenY) == false)
                || (Float.isFinite(settings.modelOffset) == false))
        {
            return null;
        }
        AbstractTrains train = getTemporaryTrain(record);
        if (train == null)
        {
            return null;
        }
        Render renderer = RenderManager.instance.getEntityRenderObject(train);
        if (renderer == null)
        {
            return null;
        }
        if (color != -1)
        {
            train.setColor(color);
        }
        train.trainType = record.getTrainType();
        train.trainName = getItemDisplayName(record.getItem());
        prepareTrainForIconCapture(train);
        applyCargoSelectionForIconCapture(train, stack, settings);

        int previousFramebuffer = GL11.glGetInteger(EXTFramebufferObject.GL_FRAMEBUFFER_BINDING_EXT);
        int previousRenderbuffer = GL11.glGetInteger(EXTFramebufferObject.GL_RENDERBUFFER_BINDING_EXT);
        int previousActiveTexture = GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
        int previousMatrixMode = GL11.glGetInteger(GL11.GL_MATRIX_MODE);
        int previousModelviewDepth = GL11.glGetInteger(GL11.GL_MODELVIEW_STACK_DEPTH);
        int previousProjectionDepth = GL11.glGetInteger(GL11.GL_PROJECTION_STACK_DEPTH);
        float previousLightX = OpenGlHelper.lastBrightnessX;
        float previousLightY = OpenGlHelper.lastBrightnessY;
        Framebuffer framebuffer = null;
        boolean retained = false;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glPushClientAttrib(GL11.GL_CLIENT_PIXEL_STORE_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        try
        {
            OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
            framebuffer = new Framebuffer(CAPTURE_SIZE, CAPTURE_SIZE, true);
            framebuffer.setFramebufferColor(0, 0, 0, 0);
            framebuffer.bindFramebuffer(true);
            GL11.glViewport(0, 0, CAPTURE_SIZE, CAPTURE_SIZE);
            GL11.glDisable(GL11.GL_SCISSOR_TEST);
            GL11.glDisable(GL11.GL_STENCIL_TEST);
            GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            GL11.glDepthFunc(GL11.GL_LEQUAL);
            GL11.glDepthMask(true);
            GL11.glColorMask(true, true, true, true);
            GL11.glClearDepth(1.0);
            GL11.glClearColor(0, 0, 0, 0);
            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glAlphaFunc(GL11.GL_GREATER, CAPTURE_ALPHA_DISCARD_THRESHOLD);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glPixelStorei(GL11.GL_PACK_ALIGNMENT, 1);
            GL11.glPixelStorei(GL11.GL_PACK_ROW_LENGTH, 0);
            GL11.glPixelStorei(GL11.GL_PACK_SKIP_ROWS, 0);
            GL11.glPixelStorei(GL11.GL_PACK_SKIP_PIXELS, 0);
            GL11.glColor4f(1, 1, 1, 1);
            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glLoadIdentity();
            GL11.glOrtho(0, CAPTURE_VIEW_SIZE, CAPTURE_VIEW_SIZE, 0, CAPTURE_NEAR_PLANE, CAPTURE_FAR_PLANE);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glLoadIdentity();
            float centerViewX = CAPTURE_VIEW_SIZE * CAPTURE_CENTER_X;
            float centerViewY = CAPTURE_VIEW_SIZE * CAPTURE_CENTER_Y;
            GL11.glTranslatef(centerViewX, centerViewY, CAPTURE_MODEL_Z);
            float scale = settings.scale;
            GL11.glScalef(-scale, scale, scale);
            GL11.glRotatef(FLIP_ICON_Z_ROTATION, 0, 0, 1);
            GL11.glRotatef(settings.pitch, 1, 0, 0);
            GL11.glRotatef(settings.yaw, 0, 1, 0);
            RenderHelper.enableGUIStandardItemLighting();
            RenderRollingStock.setRenderModeGUI(true);
            RenderRollingStock.setRenderGUIFullBright(true);
            double modelOffsetX = Math.abs(record.getBogieLocoPosition()) * settings.modelOffset;
            renderer.doRender(train, modelOffsetX, 0, 0, 0, 0);

            BufferedImage baseImage = readFramebufferBaseImage(shouldAutoFrameFront(settings, autoFrameFront));
            BufferedImage image = applyScreenOffset(baseImage, settings.screenX, settings.screenY);
            CaptureResult result = CaptureResult.fromFramebuffer(framebuffer, image, baseImage);
            retained = true;
            return result;
        }
        catch (RuntimeException failure)
        {
            Traincraft.tcLog.warn("Icon capture failed for " + record.getInternalName()
                    + "; keeping the previous capture settings.", failure);
            return null;
        }
        finally
        {
            if (retained == false && framebuffer != null)
            {
                RollingStockGuiPreview.releaseFramebuffer(framebuffer);
            }
            RenderRollingStock.setRenderModeGUI(false);
            RenderRollingStock.setRenderGUIFullBright(false);
            OpenGlHelper.func_153171_g(OpenGlHelper.field_153198_e, previousFramebuffer);
            OpenGlHelper.func_153176_h(OpenGlHelper.field_153199_f, previousRenderbuffer);
            RollingStockGuiPreview.restoreMatrixStacks(
                    previousModelviewDepth, previousProjectionDepth, previousMatrixMode);
            GL11.glPopClientAttrib();
            GL11.glPopAttrib();
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, previousLightX, previousLightY);
            OpenGlHelper.setActiveTexture(previousActiveTexture);
        }
    }

	private static AbstractTrains getTemporaryTrain(ITrainRecord record) {
		Minecraft minecraft = Minecraft.getMinecraft();
		return minecraft.theWorld == null ? null : Traincraft.traincraftRegistry.getEntity(record.getEntityClass(), minecraft.theWorld);
	}

	private static void applyCargoSelectionForIconCapture(AbstractTrains train, ItemStack stack, CaptureSettings settings) {
		CargoManager cargoManager = train.getCargoManager();
		if (cargoManager == null) {
			return;
		}

		/*
		 * Real placed entities apply CargoManager default overrides during spawn setup.
		 * Icon capture uses a temporary unspawned entity, so mirror that visible default here.
		 * Manual table settings win first, then stack NBT, then the entity default override.
		 */
		if (settings != null && settings.cargoSelection != CARGO_SELECTION_DEFAULT) {
			setCargoSelectionIfValid(cargoManager, settings.cargoSelection);
			return;
		}

		if (stack != null && stack.hasTagCompound() && stack.getTagCompound().hasKey("cargoSelection")) {
			setCargoSelectionIfValid(cargoManager, stack.getTagCompound().getInteger("cargoSelection"));
			return;
		}

		if (cargoManager.GetDefaultOverride() != -1) {
			setCargoSelectionIfValid(cargoManager, cargoManager.GetDefaultOverride());
		}
	}

	private static void setCargoSelectionIfValid(CargoManager cargoManager, int selectedCargo) {
		if (selectedCargo >= 0 && selectedCargo < cargoManager.getCargoSpecificationList().length + 1) {
			cargoManager.setSelectedCargo(selectedCargo);
		}
	}


	private static boolean shouldAutoFrameFront(CaptureSettings settings, boolean autoFrameFront) {
		return autoFrameFront && settings != null && settings.screenX == 0.0F && settings.screenY == 0.0F;
	}

	private static void prepareTrainForIconCapture(AbstractTrains train) {
		/*
		 * RenderRollingStock applies a tiny offset derived from entity id. A fresh temporary
		 * entity normally gets a different id each capture, which makes reset/auto-fit bounds
		 * drift by a few pixels. Pin the capture-only entity state so repeated snapshots match.
		 */
		train.setEntityId(ICON_CAPTURE_ENTITY_ID);
		train.ticksExisted = 0;
		train.prevRotationYaw = 0.0F;
		train.rotationYaw = 0.0F;
		train.prevRotationPitch = 0.0F;
		train.rotationPitch = 0.0F;
		train.lastTickPosX = 0.0D;
		train.lastTickPosY = 0.0D;
		train.lastTickPosZ = 0.0D;
		train.setPosition(0.0D, 0.0D, 0.0D);
		train.motionX = 0.0D;
		train.motionY = 0.0D;
		train.motionZ = 0.0D;

		if (train instanceof EntityRollingStock) {
			EntityRollingStock rollingStock = (EntityRollingStock) train;
			rollingStock.rotationYawClientReal = 0.0F;
			rollingStock.anglePitchClient = 0.0D;
			rollingStock.oldClientYaw = 0.0F;
		}
	}

	/**
	 * Dev-table helper for the "Fit" buttons. It measures the current rendered pixels, changes
	 * scale for the selected target region, then derives Screen X/Y from that same target bounds.
	 */
	public static CaptureSettings autoFitIcon(ItemStack stack, CaptureSettings settings, AutoFitMode mode, int padding, boolean allowScaleUp) {
		return autoFitIcon(stack, settings, mode, padding, padding, allowScaleUp);
	}

    /**
     * Fits the requested icon region from an unclipped measurement, then applies its screen placement.
     * Small models may grow from the common baseline; large models are measured at a smaller scale first.
     * When enlargement is disabled, the resulting scale never exceeds the caller's original setting.
     * Capture failure or absent visible pixels retains the caller's settings without changing saved JSON.
     */
    public static CaptureSettings autoFitIcon(ItemStack stack, CaptureSettings settings, AutoFitMode mode,
            int scalePadding, int positionPadding, boolean allowScaleUp)
    {
        CaptureSettings measuredSettings = settings.copy();
        measuredSettings.screenX = 0.0F;
        measuredSettings.screenY = 0.0F;
        CaptureResult result = captureUnclippedForAutoFit(stack, measuredSettings);
        if (result == null)
        {
            return settings;
        }
        CaptureSettings fittedSettings = settings.copy();
        try
        {
            BufferedImage measuredImage = result.baseImage != null ? result.baseImage : result.image;
            Rectangle targetBounds = getAutoFitTargetBounds(measuredImage, mode);
            if (targetBounds == null)
            {
                return settings;
            }
            int maxContentSize = Math.max(1, ICON_SIZE - Math.max(0, scalePadding) * 2);
            float horizontalRatio = (float) maxContentSize / targetBounds.width;
            float verticalRatio = (float) maxContentSize / targetBounds.height;
            float fitRatio = Math.min(horizontalRatio, verticalRatio);
            fitRatio = clamp(fitRatio, 0.01F, MAX_AUTO_FIT_SCALE_UP);
            float fittedScale = Math.max(0.05F, measuredSettings.scale * fitRatio);
            if (allowScaleUp == false)
            {
                if (fittedScale >= settings.scale)
                {
                    return settings;
                }
            }
            fittedSettings.scale = fittedScale;
        }
        finally
        {
            result.deleteFramebuffer();
        }
        return autoPositionIcon(stack, fittedSettings, mode, positionPadding);
    }

    /**
     * Shrinks a capture until its complete model is visible before deriving an icon scale.
     * Updates only the supplied settings copy's scale. The caller owns the returned framebuffer;
     * rejected attempts are released here. Returns null when capture fails or no complete view is found.
     */
    private static CaptureResult captureUnclippedForAutoFit(ItemStack stack, CaptureSettings measuredSettings)
    {
        final int maximumAttempts = 8;
        final float retryScaleMultiplier = 0.5F;
        for (int attempt = 0; attempt < maximumAttempts; attempt++)
        {
            CaptureResult result = captureIcon(stack, measuredSettings, false);
            if (result == null)
            {
                return null;
            }
            boolean retained = false;
            try
            {
                BufferedImage image = result.baseImage != null ? result.baseImage : result.image;
                Rectangle bounds = getVisibleBounds(image);
                if (bounds != null && (touchesWorkingCanvasEdge(bounds, image) == false))
                {
                    retained = true;
                    return result;
                }
            }
            finally
            {
                if (retained == false)
                {
                    result.deleteFramebuffer();
                }
            }
            measuredSettings.scale *= retryScaleMultiplier;
        }
        return null;
    }

	private static CaptureSettings autoPositionIcon(ItemStack stack, CaptureSettings settings, AutoFitMode mode, int padding) {
		CaptureSettings measuredSettings = settings.copy();
		measuredSettings.screenX = 0.0F;
		measuredSettings.screenY = 0.0F;

		for (int attempt = 0; attempt <= AUTO_FIT_EDGE_RETRY_COUNT; attempt++) {
			CaptureResult result = captureIcon(stack, measuredSettings, false);
			if (result == null) {
				return settings;
			}

			try {
				BufferedImage image = result.baseImage != null ? result.baseImage : result.image;
				Rectangle visibleBounds = getVisibleBounds(image);
				Rectangle targetBounds = getAutoFitTargetBounds(image, mode);
				if (targetBounds == null || visibleBounds == null) {
					return settings;
				}

				if (touchesWorkingCanvasEdge(visibleBounds, image) && attempt < AUTO_FIT_EDGE_RETRY_COUNT) {
					measuredSettings.scale = Math.max(0.05F, measuredSettings.scale * AUTO_FIT_EDGE_SHRINK);
					continue;
				}

				CaptureSettings positionedSettings = measuredSettings.copy();
				positionedSettings.screenX = getScreenOffsetForMode(targetBounds, mode, padding);
				positionedSettings.screenY = getScreenOffsetForCenter(targetBounds.getCenterY());
				return positionedSettings;
			} finally {
				result.deleteFramebuffer();
			}
		}

		return settings;
	}

	private static Rectangle getAutoFitTargetBounds(BufferedImage image, AutoFitMode mode) {
		Rectangle visibleBounds = getVisibleBounds(image);
		if (visibleBounds == null || mode == AutoFitMode.FULL) {
			return visibleBounds;
		}

		int halfWidth = Math.max(1, visibleBounds.width / 2);
		if (mode == AutoFitMode.LEFT) {
			return new Rectangle(visibleBounds.x, visibleBounds.y, halfWidth, visibleBounds.height);
		}

		int rightX = visibleBounds.x + visibleBounds.width - halfWidth;
		return new Rectangle(rightX, visibleBounds.y, halfWidth, visibleBounds.height);
	}

	private static float getScreenOffsetForCenter(double targetCenter) {
		return (float) (ICON_OVERSCAN + ICON_SIZE * 0.5D - targetCenter);
	}

	private static boolean touchesWorkingCanvasEdge(Rectangle bounds, BufferedImage image) {
		return bounds.x <= AUTO_FIT_WORKING_EDGE_PADDING
				|| bounds.y <= AUTO_FIT_WORKING_EDGE_PADDING
				|| bounds.x + bounds.width >= image.getWidth() - AUTO_FIT_WORKING_EDGE_PADDING
				|| bounds.y + bounds.height >= image.getHeight() - AUTO_FIT_WORKING_EDGE_PADDING;
	}

	private static float getScreenOffsetForMode(Rectangle targetBounds, AutoFitMode mode, int padding) {
		int safePadding = Math.max(0, padding);
		if (mode == AutoFitMode.LEFT) {
			return ICON_OVERSCAN + safePadding - targetBounds.x;
		}
		if (mode == AutoFitMode.RIGHT) {
			return ICON_OVERSCAN + ICON_SIZE - safePadding - (targetBounds.x + targetBounds.width);
		}
		return getScreenOffsetForCenter(targetBounds.getCenterX());
	}

	private static float clamp(float value, float min, float max) {
		return Math.max(min, Math.min(max, value));
	}

	public enum AutoFitMode {
		FULL,
		LEFT,
		RIGHT
	}


	private static String getItemDisplayName(Item item) {
		return item == null ? "" : item.getUnlocalizedName();
	}

	/*
	 * Pixel processing
	 *
	 * The framebuffer is captured at 512x512, downsampled to a 192x192 working canvas, and finally
	 * cropped to 128x128 after screen X/Y are applied. That hidden 32px margin is why moving the
	 * icon in the table does not immediately clip pixels that were near the preview border.
	 */
	private static BufferedImage readFramebufferBaseImage(boolean autoFrameFront) {
		ByteBuffer pixels = ByteBuffer.allocateDirect(CAPTURE_SIZE * CAPTURE_SIZE * 4);
		GL11.glReadPixels(0, 0, CAPTURE_SIZE, CAPTURE_SIZE, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, pixels);
		BufferedImage capture = new BufferedImage(CAPTURE_SIZE, CAPTURE_SIZE, BufferedImage.TYPE_INT_ARGB);

		for (int y = 0; y < CAPTURE_SIZE; y++) {
			for (int x = 0; x < CAPTURE_SIZE; x++) {
				int index = (x + y * CAPTURE_SIZE) * 4;
				int red = pixels.get(index) & 255;
				int green = pixels.get(index + 1) & 255;
				int blue = pixels.get(index + 2) & 255;
				int alpha = pixels.get(index + 3) & 255;
				capture.setRGB(x, CAPTURE_SIZE - y - 1, alpha << 24 | red << 16 | green << 8 | blue);
			}
		}

		// Keep an oversized 2D canvas so screen X/Y can reveal nearby pixels instead of moving an already-clipped icon.
		BufferedImage centeredIcon = scaleImage(capture, ICON_CANVAS_SIZE, ICON_CANVAS_SIZE);
		return autoFrameFront ? autoFrameFrontEdge(centeredIcon) : centeredIcon;
	}

	private static BufferedImage scaleImage(BufferedImage source, int targetWidth, int targetHeight) {
		BufferedImage current = source;
		int width = source.getWidth();
		int height = source.getHeight();

		while (width / 2 >= targetWidth && height / 2 >= targetHeight) {
			width /= 2;
			height /= 2;
			current = drawScaledImage(current, width, height);
		}

		return width == targetWidth && height == targetHeight ? current : drawScaledImage(current, targetWidth, targetHeight);
	}

	private static BufferedImage drawScaledImage(BufferedImage source, int width, int height) {
		BufferedImage scaled = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = scaled.createGraphics();
		try {
			graphics.setComposite(AlphaComposite.Src);
			graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
			graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
			graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			graphics.drawImage(source, 0, 0, width, height, null);
		} finally {
			graphics.dispose();
		}
		return scaled;
	}

	/**
	 * The chosen yaw presents the front of most rollingstock on the right side of the icon.
	 * Start by keeping that right/front edge in the default crop, then let Screen X provide
	 * manual fine tuning from the dev table.
	 */
	private static BufferedImage autoFrameFrontEdge(BufferedImage centeredIcon) {
		Rectangle visibleBounds = getVisibleBounds(centeredIcon);
		if (visibleBounds == null) {
			return centeredIcon;
		}

		int maxFrontPixel = ICON_CROP_RIGHT - AUTO_FRAME_FRONT_PADDING;
		int shiftLeft = Math.max(0, visibleBounds.x + visibleBounds.width - maxFrontPixel);
		if (shiftLeft == 0) {
			return centeredIcon;
		}

		BufferedImage framedIcon = new BufferedImage(ICON_CANVAS_SIZE, ICON_CANVAS_SIZE, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = framedIcon.createGraphics();
		try {
			graphics.drawImage(centeredIcon, -shiftLeft, 0, null);
		} finally {
			graphics.dispose();
		}
		return framedIcon;
	}

	private static Rectangle getVisibleBounds(BufferedImage image) {
		if (image == null) {
			return null;
		}

		int minX = image.getWidth();
		int minY = image.getHeight();
		int maxX = -1;
		int maxY = -1;

		for (int y = 0; y < image.getHeight(); y++) {
			for (int x = 0; x < image.getWidth(); x++) {
				int alpha = (image.getRGB(x, y) >>> 24) & 255;
				if (alpha > VISIBLE_ALPHA_THRESHOLD) {
					minX = Math.min(minX, x);
					minY = Math.min(minY, y);
					maxX = Math.max(maxX, x);
					maxY = Math.max(maxY, y);
				}
			}
		}

		return maxX >= minX ? new Rectangle(minX, minY, maxX - minX + 1, maxY - minY + 1) : null;
	}

	public static BufferedImage applyScreenOffset(BufferedImage centeredIcon, float screenX, float screenY) {
		if (centeredIcon == null) {
			return null;
		}

		BufferedImage shiftedIcon = new BufferedImage(ICON_SIZE, ICON_SIZE, BufferedImage.TYPE_INT_ARGB);
		Graphics2D shiftedGraphics = shiftedIcon.createGraphics();
		try {
			float x = (ICON_SIZE - centeredIcon.getWidth()) * 0.5F + screenX;
			float y = (ICON_SIZE - centeredIcon.getHeight()) * 0.5F + screenY;
			shiftedGraphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			shiftedGraphics.drawImage(centeredIcon, AffineTransform.getTranslateInstance(x, y), null);
		} finally {
			shiftedGraphics.dispose();
		}

		return shiftedIcon;
	}

	public static BufferedImage resizeIcon(BufferedImage icon, int size) {
		if (icon == null || size <= 0) {
			return null;
		}
		return icon.getWidth() == size && icon.getHeight() == size ? icon : scaleImage(icon, size, size);
	}

	public static String sanitizeFileName(String value) {
		if (value == null || value.length() == 0) {
			return "unknown";
		}
		return value.replaceAll("[^A-Za-z0-9._-]", "_");
	}

	/*
	 * Data objects shared by the GUI and JSON helper. Keep these boring and serializable: the
	 * stored values are the whole contract for regenerating the same icon later.
	 */
	public static class CaptureSettings {
		public float yaw;
		public float pitch;
		public float scale;
		public float screenX;
		public float screenY;
		public float modelOffset;
		// DEFAULT uses stack/default cargo state; NONE forces an empty cargo render; 1..N selects a cargo option.
		public int cargoSelection;

		public CaptureSettings(float yaw, float pitch, float scale, float screenX, float screenY, float modelOffset) {
			this(yaw, pitch, scale, screenX, screenY, modelOffset, CARGO_SELECTION_DEFAULT);
		}

		public CaptureSettings(float yaw, float pitch, float scale, float screenX, float screenY, float modelOffset, int cargoSelection) {
			this.yaw = yaw;
			this.pitch = pitch;
			this.scale = scale;
			this.screenX = screenX;
			this.screenY = screenY;
			this.modelOffset = modelOffset;
			this.cargoSelection = cargoSelection;
		}

		public CaptureSettings(float yaw, float pitch, float scale, float scaleMultiplier, float screenX, float screenY, float modelOffset) {
			// Backward compatibility for old dev JSON written before scale and multiplier were collapsed.
			this(yaw, pitch, scale * scaleMultiplier, screenX, screenY, modelOffset);
		}

		public CaptureSettings copy() {
			return new CaptureSettings(yaw, pitch, scale, screenX, screenY, modelOffset, cargoSelection);
		}
	}

	public static class CaptureResult {
		public final Framebuffer framebuffer;
		public final BufferedImage image;
		public final BufferedImage baseImage;

		private CaptureResult(Framebuffer framebuffer, BufferedImage image, BufferedImage baseImage) {
			this.framebuffer = framebuffer;
			this.image = image;
			this.baseImage = baseImage;
		}

		private static CaptureResult fromFramebuffer(Framebuffer framebuffer, BufferedImage image, BufferedImage baseImage) {
			return new CaptureResult(framebuffer, image, baseImage);
		}

        /** Releases the owned capture target while preserving the caller's unrelated graphics bindings. */
        public void deleteFramebuffer()
        {
            RollingStockGuiPreview.releaseFramebuffer(framebuffer);
        }
	}
}
