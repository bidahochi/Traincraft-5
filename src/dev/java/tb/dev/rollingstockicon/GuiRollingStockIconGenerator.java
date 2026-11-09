package tb.dev.rollingstockicon;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.client.gui.GuiShadedButton;
import train.common.Traincraft;
import train.common.items.ItemAbstractRollingStock;
import train.common.library.register.ITrainRecord;

import java.awt.image.BufferedImage;
import java.util.Collections;

/**
 * Dev-only tuning UI for generated rollingstock item icons.
 *
 * The preview shows the generated 2D image, not a live rotating model. Tuning buttons update the
 * capture settings, Save writes JSON, and Generate writes both JSON and the transparent PNG.
 */
public class GuiRollingStockIconGenerator extends GuiContainer {
	// Button IDs are kept away from row IDs so action buttons cannot collide with +/- controls.
	private static final int BUTTON_SAVE = 100;
	private static final int BUTTON_GENERATE = 101;
	private static final int BUTTON_RESET = 102;
	private static final int BUTTON_LOAD = 103;
	private static final int BUTTON_FIT_FULL = 104;
	private static final int BUTTON_FIT_LEFT = 105;
	private static final int BUTTON_FIT_RIGHT = 106;
	private static final int BUTTON_GENERATE_64 = 107;
	private static final int BUTTON_GENERATE_32 = 108;
	private static final String GENERATE_128_TOOLTIP = "Writes a 128x128 PNG.";
	private static final String GENERATE_64_TOOLTIP = "Writes a smaller 64x64 PNG.";
	private static final String GENERATE_32_TOOLTIP = "Writes a compact 32x32 PNG.";

	// Each setting row owns a minus and plus button. Row 6 is the preview background, row 7 is cargo selection.
	private static final int SETTING_ROW_COUNT = 8;
	private static final int NUMERIC_SETTING_COUNT = 6;
	private static final int SETTING_BUTTONS_PER_ROW = 2;
	private static final int PREVIEW_BG_ROW = 6;
	private static final int PREVIEW_BG_MINUS_BUTTON = PREVIEW_BG_ROW * SETTING_BUTTONS_PER_ROW;
	private static final int PREVIEW_BG_PLUS_BUTTON = PREVIEW_BG_MINUS_BUTTON + 1;
	private static final int CARGO_ROW = 7;
	private static final int CARGO_MINUS_BUTTON = CARGO_ROW * SETTING_BUTTONS_PER_ROW;
	private static final int CARGO_PLUS_BUTTON = CARGO_MINUS_BUTTON + 1;

	// Pixel layout for the dev table. These values only affect this debug GUI surface.
	private static final int PANEL_WIDTH = 340;
	private static final int PANEL_HEIGHT = 372;
	private static final int CONTROL_X = 80;
	private static final int ACTION_X = 16;
	private static final int CONTROL_Y = 26;
	private static final int CONTROL_ROW_HEIGHT = 18;
	private static final int EMPTY_MESSAGE_X = 16;
	private static final int EMPTY_MESSAGE_Y = 84;
	private static final int STATUS_Y = 170;
	private static final int BUTTON_Y = 184;
	private static final int FIT_BUTTON_Y = 206;
	private static final int SMALL_BUTTON_WIDTH = 18;
	private static final int SMALL_BUTTON_HEIGHT = 14;
	private static final int ACTION_BUTTON_HEIGHT = 18;
	private static final int ACTION_BUTTON_WIDTH = 58;
	private static final int ACTION_BUTTON_GAP = 4;
	private static final int GENERATE_BUTTON_WIDTH = 62;
	private static final int FIT_BUTTON_WIDTH = 58;
	private static final int RESET_MARGIN = 12;
	private static final int RESET_X = PANEL_WIDTH - ACTION_BUTTON_WIDTH - RESET_MARGIN;
	private static final int RESET_Y = PANEL_HEIGHT - ACTION_BUTTON_HEIGHT - RESET_MARGIN;
	private static final int MINUS_X = CONTROL_X + 72;
	private static final int VALUE_X = CONTROL_X + 96;
	private static final int VALUE_FIELD_WIDTH = 58;
	private static final int VALUE_FIELD_HEIGHT = 14;
	private static final int PLUS_X = CONTROL_X + 160;
	private static final int PREVIEW_X = 270;
	private static final int GENERATE_BUTTON_X = PREVIEW_X - 2;
	private static final int PREVIEW_Y = 28;
	private static final int PREVIEW_64_Y = 116;
	private static final int PREVIEW_32_Y = 204;
	private static final int PREVIEW_SIZE = 56;
	private static final int PREVIEW_PANEL_PADDING = 4;
	private static final int PREVIEW_PANEL_SIZE = PREVIEW_SIZE + PREVIEW_PANEL_PADDING * 2;
	private static final int INVENTORY_SLOT_STRIDE = 18;
	private static final int INVENTORY_PANEL_PADDING = 4;
	private static final int INVENTORY_PANEL_X = ContainerRollingStockIconGenerator.PLAYER_INV_X - INVENTORY_PANEL_PADDING;
	private static final int INVENTORY_PANEL_Y = ContainerRollingStockIconGenerator.PLAYER_INV_Y - INVENTORY_PANEL_PADDING;
	private static final int INVENTORY_PANEL_WIDTH = INVENTORY_SLOT_STRIDE * 9 + INVENTORY_PANEL_PADDING * 2;
	private static final int INVENTORY_PANEL_HEIGHT = ContainerRollingStockIconGenerator.HOTBAR_Y - ContainerRollingStockIconGenerator.PLAYER_INV_Y + INVENTORY_SLOT_STRIDE + INVENTORY_PANEL_PADDING * 2;
	private static final int SLOT_BACKGROUND_PADDING = 2;
	private static final int SLOT_BACKGROUND_SIZE = 20;
	private static final int DEFAULT_AUTO_FIT_PADDING = 8;
	private static final int SIDE_AUTO_FIT_SCALE_PADDING = 4;
	private static final int SIDE_AUTO_FIT_EDGE_PADDING = 8;
	private static final int[] PREVIEW_BACKGROUND_COLORS = {
			0xFF303030, 0xFF606060, 0xFF909090, 0xFFC0C0C0, 0xFFE8E8E8, 0xFF202840
	};

	private final TileRollingStockIconGenerator tile;
	private GeneratedRollingStockIconRenderer.CaptureSettings settings;
	private ResourceLocation previewTexture;
	private ResourceLocation preview64Texture;
	private ResourceLocation preview32Texture;
	private BufferedImage previewBaseImage;
	private boolean previewBaseImageIncludesOffset;
	private GuiTextField[] valueFields = new GuiTextField[NUMERIC_SETTING_COUNT];
	private int previewBackgroundIndex;
	private String currentKey = "";
	private String status = "";

	public GuiRollingStockIconGenerator(InventoryPlayer inventory, TileRollingStockIconGenerator tile) {
		super(new ContainerRollingStockIconGenerator(inventory, tile));
		this.tile = tile;
		xSize = PANEL_WIDTH;
		ySize = PANEL_HEIGHT;
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		for (int i = 0; i < SETTING_ROW_COUNT; i++) {
			int y = guiTop + CONTROL_Y + i * CONTROL_ROW_HEIGHT - 4;
			buttonList.add(new GuiShadedButton(i * SETTING_BUTTONS_PER_ROW, guiLeft + MINUS_X, y, SMALL_BUTTON_WIDTH, SMALL_BUTTON_HEIGHT, "-"));
			buttonList.add(new GuiShadedButton(i * SETTING_BUTTONS_PER_ROW + 1, guiLeft + PLUS_X, y, SMALL_BUTTON_WIDTH, SMALL_BUTTON_HEIGHT, "+"));
		}
		int saveX = ACTION_X + ACTION_BUTTON_WIDTH + ACTION_BUTTON_GAP;
		buttonList.add(new GuiShadedButton(BUTTON_LOAD, guiLeft + ACTION_X, guiTop + BUTTON_Y, ACTION_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Load"));
		buttonList.add(new GuiShadedButton(BUTTON_SAVE, guiLeft + saveX, guiTop + BUTTON_Y, ACTION_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Save"));
		buttonList.add(new GuiShadedButton(BUTTON_FIT_FULL, guiLeft + ACTION_X, guiTop + FIT_BUTTON_Y, FIT_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Fit All"));
		buttonList.add(new GuiShadedButton(BUTTON_FIT_LEFT, guiLeft + ACTION_X + FIT_BUTTON_WIDTH + ACTION_BUTTON_GAP, guiTop + FIT_BUTTON_Y, FIT_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Fit Left"));
		buttonList.add(new GuiShadedButton(BUTTON_FIT_RIGHT, guiLeft + ACTION_X + (FIT_BUTTON_WIDTH + ACTION_BUTTON_GAP) * 2, guiTop + FIT_BUTTON_Y, FIT_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Fit Right"));
		buttonList.add(new GuiShadedButton(BUTTON_GENERATE, guiLeft + GENERATE_BUTTON_X, guiTop + PREVIEW_Y + PREVIEW_SIZE + 4, GENERATE_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Gen 128"));
		buttonList.add(new GuiShadedButton(BUTTON_GENERATE_64, guiLeft + GENERATE_BUTTON_X, guiTop + PREVIEW_64_Y + PREVIEW_SIZE + 4, GENERATE_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Gen 64"));
		buttonList.add(new GuiShadedButton(BUTTON_GENERATE_32, guiLeft + GENERATE_BUTTON_X, guiTop + PREVIEW_32_Y + PREVIEW_SIZE + 4, GENERATE_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Gen 32"));
		buttonList.add(new GuiShadedButton(BUTTON_RESET, guiLeft + RESET_X, guiTop + RESET_Y, ACTION_BUTTON_WIDTH, ACTION_BUTTON_HEIGHT, "Reset", GuiShadedButton.Style.DANGER));
		initValueFields();
		syncCurrentStack(false);
		syncValueFields();
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
		for (GuiTextField field : valueFields) {
			if (field != null && field.isFocused()) {
				field.updateCursorCounter();
			}
		}
		syncCurrentStack(false);
	}

	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
		clearPreviewTexture();
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		/*
		 * Button routing is deliberately centralized here. The table has no server packet flow:
		 * all generation happens in the dev client, and Generate is the only action that writes
		 * PNG output back into source resources.
		 */
		if (button.id == PREVIEW_BG_MINUS_BUTTON || button.id == PREVIEW_BG_PLUS_BUTTON) {
			adjustPreviewBackground(button.id == PREVIEW_BG_PLUS_BUTTON ? 1 : -1);
			return;
		}

		ItemStack stack = getRollingStockStack();
		if (stack == null) {
			status = "Insert rollingstock.";
			return;
		}

		ITrainRecord record = Traincraft.traincraftRegistry.getCurrentTrain(stack.getItem());
		if (record == null) {
			status = "No train record.";
			return;
		}

		int color = GeneratedRollingStockIconRenderer.getRenderColor(stack, record);
		if (button.id == CARGO_MINUS_BUTTON || button.id == CARGO_PLUS_BUTTON) {
			if (settings == null) {
				settings = getAutoFitDefaultSettings(stack);
			}
			adjustCargoSelection(stack, button.id == CARGO_PLUS_BUTTON ? 1 : -1);
			return;
		}

		if (button.id == BUTTON_LOAD) {
			if (!RollingStockIconDevData.hasSettings(record, color)) {
				settings = getAutoFitDefaultSettings(stack);
				refreshGeneratedPreview(stack, record, color);
				syncValueFields();
				status = "Loaded auto-fit defaults.";
				return;
			}

			settings = RollingStockIconDevData.loadOrDefault(stack, record, color);
			refreshGeneratedPreview(stack, record, color);
			syncValueFields();
			status = "Loaded " + RollingStockIconDevData.getIconId(record, color);
			return;
		}
		if (button.id == BUTTON_RESET) {
			settings = getAutoFitDefaultSettings(stack);
			refreshPreview(stack);
			syncValueFields();
			status = "Auto-fit defaults restored.";
			return;
		}
		if (settings == null) {
			settings = getAutoFitDefaultSettings(stack);
			syncValueFields();
			status = "Loaded auto-fit defaults.";
			return;
		}
		if (button.id == BUTTON_FIT_FULL || button.id == BUTTON_FIT_LEFT || button.id == BUTTON_FIT_RIGHT) {
			applyAutoFit(stack, button.id);
			return;
		}
		if (button.id == BUTTON_SAVE) {
			status = RollingStockIconDevData.saveSettings(stack, record, color, settings) ? "Saved JSON." : "Save failed.";
			return;
		}
		if (button.id == BUTTON_GENERATE) {
			generateIcon(stack, record, color, 128);
			return;
		}
		if (button.id == BUTTON_GENERATE_64) {
			generateIcon(stack, record, color, 64);
			return;
		}
		if (button.id == BUTTON_GENERATE_32) {
			generateIcon(stack, record, color, 32);
			return;
		}
		int index = button.id / SETTING_BUTTONS_PER_ROW;
		boolean increase = button.id % 2 == 1;
		adjustSetting(index, increase ? 1.0F : -1.0F, isCtrlKeyDown());
		if (index == 3 || index == 4) {
			if (previewBaseImageIncludesOffset) {
				refreshPreview(stack);
			} else {
				refreshOffsetPreview();
			}
		} else {
			refreshPreview(stack);
		}
		syncValueFields();
	}

	private void generateIcon(ItemStack stack, ITrainRecord record, int color, int outputSize) {
		GeneratedRollingStockIconRenderer.CaptureResult result = GeneratedRollingStockIconRenderer.captureIcon(stack, settings);
		BufferedImage outputImage = result == null ? null : GeneratedRollingStockIconRenderer.resizeIcon(result.image, outputSize);
		boolean savedDevIcon = outputImage != null && RollingStockIconDevData.saveIcon(record, color, outputImage);
		boolean savedSourceIcon = outputImage != null && RollingStockIconDevData.saveIconToResourceSource(record, outputImage);
		boolean savedSettings = RollingStockIconDevData.saveSettings(stack, record, color, settings);
		if (savedSourceIcon) {
			mc.refreshResources();
		}
		if (result != null) {
			previewBaseImage = outputImage;
			previewBaseImageIncludesOffset = true;
			setPreview(outputImage);
			result.deleteFramebuffer();
		}
		status = savedDevIcon && savedSourceIcon && savedSettings ? "Generated " + outputSize + "x" + outputSize + " PNG + JSON. Reloaded resources." : "Generate failed.";
	}

	private void drawGenerateButtonTooltip(int mouseX, int mouseY) {
		for (Object object : buttonList) {
			if (!(object instanceof GuiButton)) {
				continue;
			}

			GuiButton button = (GuiButton) object;
			if ((button.id == BUTTON_GENERATE || button.id == BUTTON_GENERATE_64 || button.id == BUTTON_GENERATE_32) && isMouseOverButton(button, mouseX, mouseY)) {
				resetGuiGlState();
				drawHoveringText(Collections.singletonList(getGenerateTooltip(button.id)), mouseX, mouseY, fontRendererObj);
				return;
			}
		}
	}

	private String getGenerateTooltip(int buttonId) {
		if (buttonId == BUTTON_GENERATE_32) {
			return GENERATE_32_TOOLTIP;
		}
		if (buttonId == BUTTON_GENERATE_64) {
			return GENERATE_64_TOOLTIP;
		}
		return GENERATE_128_TOOLTIP;
	}

	private boolean isMouseOverButton(GuiButton button, int mouseX, int mouseY) {
		return button.enabled
				&& button.visible
				&& mouseX >= button.xPosition
				&& mouseY >= button.yPosition
				&& mouseX < button.xPosition + button.width
				&& mouseY < button.yPosition + button.height;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		if (settings != null) {
			resetGuiGlState();
			for (GuiTextField field : valueFields) {
				if (field != null) {
					field.drawTextBox();
				}
			}
		}
		drawGenerateButtonTooltip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		// Draw the table chrome first, then the dynamic preview texture and its exact cutoff border.
		drawDefaultBackground();
		drawRect(guiLeft, guiTop, guiLeft + xSize, guiTop + ySize, 0xCC202020);
		drawRect(guiLeft + ContainerRollingStockIconGenerator.INPUT_SLOT_X - SLOT_BACKGROUND_PADDING, guiTop + ContainerRollingStockIconGenerator.INPUT_SLOT_Y - SLOT_BACKGROUND_PADDING, guiLeft + ContainerRollingStockIconGenerator.INPUT_SLOT_X - SLOT_BACKGROUND_PADDING + SLOT_BACKGROUND_SIZE, guiTop + ContainerRollingStockIconGenerator.INPUT_SLOT_Y - SLOT_BACKGROUND_PADDING + SLOT_BACKGROUND_SIZE, 0xFF303030);
		drawRect(guiLeft + PREVIEW_X - PREVIEW_PANEL_PADDING, guiTop + PREVIEW_Y - PREVIEW_PANEL_PADDING, guiLeft + PREVIEW_X - PREVIEW_PANEL_PADDING + PREVIEW_PANEL_SIZE, guiTop + PREVIEW_Y - PREVIEW_PANEL_PADDING + PREVIEW_PANEL_SIZE, PREVIEW_BACKGROUND_COLORS[previewBackgroundIndex]);
		drawRect(guiLeft + PREVIEW_X - PREVIEW_PANEL_PADDING, guiTop + PREVIEW_64_Y - PREVIEW_PANEL_PADDING, guiLeft + PREVIEW_X - PREVIEW_PANEL_PADDING + PREVIEW_PANEL_SIZE, guiTop + PREVIEW_64_Y - PREVIEW_PANEL_PADDING + PREVIEW_PANEL_SIZE, PREVIEW_BACKGROUND_COLORS[previewBackgroundIndex]);
		drawRect(guiLeft + PREVIEW_X - PREVIEW_PANEL_PADDING, guiTop + PREVIEW_32_Y - PREVIEW_PANEL_PADDING, guiLeft + PREVIEW_X - PREVIEW_PANEL_PADDING + PREVIEW_PANEL_SIZE, guiTop + PREVIEW_32_Y - PREVIEW_PANEL_PADDING + PREVIEW_PANEL_SIZE, PREVIEW_BACKGROUND_COLORS[previewBackgroundIndex]);
		drawRect(guiLeft + INVENTORY_PANEL_X, guiTop + INVENTORY_PANEL_Y, guiLeft + INVENTORY_PANEL_X + INVENTORY_PANEL_WIDTH, guiTop + INVENTORY_PANEL_Y + INVENTORY_PANEL_HEIGHT, 0x802A2A2A);
		if (previewTexture != null) {
			drawBoundPreviewTexture(previewTexture, guiLeft + PREVIEW_X, guiTop + PREVIEW_Y, PREVIEW_SIZE, PREVIEW_SIZE);
		}
		if (preview64Texture != null) {
			drawBoundPreviewTexture(preview64Texture, guiLeft + PREVIEW_X, guiTop + PREVIEW_64_Y, PREVIEW_SIZE, PREVIEW_SIZE);
		}
		if (preview32Texture != null) {
			drawBoundPreviewTexture(preview32Texture, guiLeft + PREVIEW_X, guiTop + PREVIEW_32_Y, PREVIEW_SIZE, PREVIEW_SIZE);
		}
		resetGuiGlState();
		drawPreviewBorder(guiLeft + PREVIEW_X, guiTop + PREVIEW_Y, PREVIEW_SIZE);
		drawPreviewBorder(guiLeft + PREVIEW_X, guiTop + PREVIEW_64_Y, PREVIEW_SIZE);
		drawPreviewBorder(guiLeft + PREVIEW_X, guiTop + PREVIEW_32_Y, PREVIEW_SIZE);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		resetGuiGlState();
		fontRendererObj.drawString("Rollingstock Icon Generator", 8, 6, 0xFFFFFF);
		fontRendererObj.drawString("Item", 16, 62, 0xAAAAAA);
		if (settings != null) {
			drawSetting(0, "Yaw", settings.yaw);
			drawSetting(1, "Pitch", settings.pitch);
			drawSetting(2, "Scale", settings.scale);
			drawSetting(3, "Screen X", settings.screenX);
			drawSetting(4, "Screen Y", settings.screenY);
			drawSetting(5, "Model Off", settings.modelOffset);
			drawTextSetting(6, "Preview BG", getPreviewBackgroundName());
			drawTextSetting(7, "Cargo", getCargoSelectionName(getRollingStockStack()));
		} else if (getRollingStockStack() != null) {
			if (status.length() == 0) {
				fontRendererObj.drawString("Values loaded. Preview on edit.", CONTROL_X, STATUS_Y, 0xCCCCCC);
			}
		} else {
			fontRendererObj.drawString("Insert rollingstock here.", EMPTY_MESSAGE_X, EMPTY_MESSAGE_Y, 0xCCCCCC);
		}
		fontRendererObj.drawString(status, CONTROL_X, STATUS_Y, 0xDDDDDD);
	}

	private void drawSetting(int index, String label, float value) {
		int y = CONTROL_Y + index * CONTROL_ROW_HEIGHT;
		fontRendererObj.drawString(label, CONTROL_X, y, 0xCCCCCC);
	}

	private void drawTextSetting(int index, String label, String value) {
		int y = CONTROL_Y + index * CONTROL_ROW_HEIGHT;
		fontRendererObj.drawString(label, CONTROL_X, y, 0xCCCCCC);
		fontRendererObj.drawString(value, VALUE_X, y, 0xFFFFFF);
	}

	private String getPreviewBackgroundName() {
		switch (previewBackgroundIndex) {
			case 0:
				return "Dark";
			case 1:
				return "Gray";
			case 2:
				return "Mid";
			case 3:
				return "Light";
			case 4:
				return "White";
			case 5:
				return "Blue";
			default:
				return "";
		}
	}

	private void adjustPreviewBackground(int direction) {
		previewBackgroundIndex = (previewBackgroundIndex + direction + PREVIEW_BACKGROUND_COLORS.length) % PREVIEW_BACKGROUND_COLORS.length;
		status = "Preview background updated.";
	}

	private void adjustCargoSelection(ItemStack stack, int direction) {
		int cargoOptions = GeneratedRollingStockIconRenderer.getCargoOptionCount(stack);
		if (cargoOptions <= 0) {
			settings.cargoSelection = GeneratedRollingStockIconRenderer.CARGO_SELECTION_DEFAULT;
			status = "No cargo options.";
			refreshPreview(stack);
			return;
		}

		int minSelection = GeneratedRollingStockIconRenderer.CARGO_SELECTION_DEFAULT;
		int maxSelection = cargoOptions;
		settings.cargoSelection += direction;
		if (settings.cargoSelection > maxSelection) {
			settings.cargoSelection = minSelection;
		} else if (settings.cargoSelection < minSelection) {
			settings.cargoSelection = maxSelection;
		}
		refreshPreview(stack);
		status = "Cargo: " + getCargoSelectionName(stack);
	}

	private String getCargoSelectionName(ItemStack stack) {
		if (settings == null) {
			return "";
		}
		if (settings.cargoSelection == GeneratedRollingStockIconRenderer.CARGO_SELECTION_DEFAULT) {
			return "Default";
		}
		if (settings.cargoSelection == GeneratedRollingStockIconRenderer.CARGO_SELECTION_NONE) {
			return "None";
		}
		int cargoOptions = GeneratedRollingStockIconRenderer.getCargoOptionCount(stack);
		if (cargoOptions > 0) {
			return settings.cargoSelection + "/" + cargoOptions;
		}
		return Integer.toString(settings.cargoSelection);
	}

	private void applyAutoFit(ItemStack stack, int buttonId) {
		/*
		 * Fit buttons always start from the default scale, not the current manual scale. This keeps
		 * repeated clicks stable and avoids compounding tiny differences from previous captures.
		 */
		GeneratedRollingStockIconRenderer.AutoFitMode mode = getAutoFitMode(buttonId);
		GeneratedRollingStockIconRenderer.CaptureSettings referenceSettings = getAutoFitReferenceSettings();
		settings = GeneratedRollingStockIconRenderer.autoFitIcon(stack, referenceSettings, mode, getAutoFitScalePadding(mode), getAutoFitPositionPadding(mode), true);
		refreshPreview(stack);
		syncValueFields();
		status = "Auto fit: " + getAutoFitLabel(mode);
	}

    /** Starts each fit from the common scale while retaining the selected orientation and cargo. */
    private GeneratedRollingStockIconRenderer.CaptureSettings getAutoFitReferenceSettings()
    {
        GeneratedRollingStockIconRenderer.CaptureSettings referenceSettings = settings.copy();
        referenceSettings.scale = GeneratedRollingStockIconRenderer.getDefaultSettings().scale;
        referenceSettings.screenX = 0.0F;
        referenceSettings.screenY = 0.0F;
        return referenceSettings;
    }

	private int getAutoFitScalePadding(GeneratedRollingStockIconRenderer.AutoFitMode mode) {
		return mode == GeneratedRollingStockIconRenderer.AutoFitMode.FULL ? DEFAULT_AUTO_FIT_PADDING : SIDE_AUTO_FIT_SCALE_PADDING;
	}

	private int getAutoFitPositionPadding(GeneratedRollingStockIconRenderer.AutoFitMode mode) {
		return mode == GeneratedRollingStockIconRenderer.AutoFitMode.FULL ? DEFAULT_AUTO_FIT_PADDING : SIDE_AUTO_FIT_EDGE_PADDING;
	}

	private GeneratedRollingStockIconRenderer.AutoFitMode getAutoFitMode(int buttonId) {
		if (buttonId == BUTTON_FIT_LEFT) {
			return GeneratedRollingStockIconRenderer.AutoFitMode.LEFT;
		}
		if (buttonId == BUTTON_FIT_RIGHT) {
			return GeneratedRollingStockIconRenderer.AutoFitMode.RIGHT;
		}
		return GeneratedRollingStockIconRenderer.AutoFitMode.FULL;
	}

	private String getAutoFitLabel(GeneratedRollingStockIconRenderer.AutoFitMode mode) {
		switch (mode) {
			case LEFT:
				return "left side";
			case RIGHT:
				return "right side";
			default:
				return "whole stock";
		}
	}

	private void adjustSetting(int index, float direction, boolean fineStep) {
		switch (index) {
			case 0:
				settings.yaw += 5.0F * direction;
				break;
			case 1:
				settings.pitch += 5.0F * direction;
				break;
			case 2:
				settings.scale = Math.max(0.05F, settings.scale + 0.25F * direction);
				break;
			case 3:
				settings.screenX += (fineStep ? 0.1F : 1.0F) * direction;
				break;
			case 4:
				settings.screenY += (fineStep ? 0.1F : 1.0F) * direction;
				break;
			case 5:
				settings.modelOffset = Math.max(0.0F, settings.modelOffset + 0.05F * direction);
				break;
			default:
				break;
		}
		status = "Preview updated.";
	}

	private void initValueFields() {
		// Text fields provide precise decimal entry; +/- buttons remain for fast rough tuning.
		for (int index = 0; index < NUMERIC_SETTING_COUNT; index++) {
			int y = guiTop + CONTROL_Y + index * CONTROL_ROW_HEIGHT - 3;
			GuiTextField field = new GuiTextField(fontRendererObj, guiLeft + VALUE_X - 2, y, VALUE_FIELD_WIDTH, VALUE_FIELD_HEIGHT);
			field.setMaxStringLength(12);
			valueFields[index] = field;
		}
	}

	private void syncValueFields() {
		if (settings == null) {
			return;
		}
		setFieldText(0, settings.yaw);
		setFieldText(1, settings.pitch);
		setFieldText(2, settings.scale);
		setFieldText(3, settings.screenX);
		setFieldText(4, settings.screenY);
		setFieldText(5, settings.modelOffset);
	}

	private void setFieldText(int index, float value) {
		if (valueFields[index] != null && !valueFields[index].isFocused()) {
			valueFields[index].setText(formatSettingValue(value));
		}
	}

	private String formatSettingValue(float value) {
		return String.format("%.4f", value);
	}

	@Override
	protected void keyTyped(char typedChar, int keyCode) {
		if (keyCode == Keyboard.KEY_ESCAPE) {
			super.keyTyped(typedChar, keyCode);
			return;
		}
		if (settings != null && isAnyValueFieldFocused()) {
			if (keyCode == Keyboard.KEY_RETURN || keyCode == Keyboard.KEY_NUMPADENTER) {
				applyFocusedValueField();
				return;
			}
			if (isAllowedNumericKey(typedChar, keyCode)) {
				for (GuiTextField field : valueFields) {
					if (field != null && field.isFocused()) {
						field.textboxKeyTyped(typedChar, keyCode);
						return;
					}
				}
			}
			return;
		}
		super.keyTyped(typedChar, keyCode);
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		if (settings != null && isAnyValueFieldFocused()) {
			applyFocusedValueField();
		}
		super.mouseClicked(mouseX, mouseY, mouseButton);
		if (settings != null) {
			for (GuiTextField field : valueFields) {
				if (field != null) {
					field.mouseClicked(mouseX, mouseY, mouseButton);
				}
			}
		}
	}

	private boolean isAnyValueFieldFocused() {
		for (GuiTextField field : valueFields) {
			if (field != null && field.isFocused()) {
				return true;
			}
		}
		return false;
	}

	private boolean isAllowedNumericKey(char typedChar, int keyCode) {
		return Character.isDigit(typedChar)
				|| typedChar == '.'
				|| typedChar == '-'
				|| keyCode == Keyboard.KEY_BACK
				|| keyCode == Keyboard.KEY_DELETE
				|| keyCode == Keyboard.KEY_LEFT
				|| keyCode == Keyboard.KEY_RIGHT
				|| keyCode == Keyboard.KEY_HOME
				|| keyCode == Keyboard.KEY_END;
	}

	private void applyFocusedValueField() {
		for (int index = 0; index < valueFields.length; index++) {
			GuiTextField field = valueFields[index];
			if (field != null && field.isFocused()) {
				applyValueField(index, field);
				return;
			}
		}
	}

	private void applyValueField(int index, GuiTextField field) {
		ItemStack stack = getRollingStockStack();
		if (stack == null || settings == null) {
			return;
		}
		try {
			float value = Float.parseFloat(field.getText());
			switch (index) {
				case 0:
					settings.yaw = value;
					break;
				case 1:
					settings.pitch = value;
					break;
				case 2:
					settings.scale = Math.max(0.05F, value);
					break;
				case 3:
					settings.screenX = value;
					break;
				case 4:
					settings.screenY = value;
					break;
				case 5:
					settings.modelOffset = Math.max(0.0F, value);
					break;
				default:
					return;
			}
			if (index == 3 || index == 4) {
				if (previewBaseImageIncludesOffset) {
					refreshPreview(stack);
				} else {
					refreshOffsetPreview();
				}
			} else {
				refreshPreview(stack);
			}
			field.setText(formatSettingValue(getSettingValue(index)));
			status = "Preview updated.";
		} catch (NumberFormatException ignored) {
			field.setText(formatSettingValue(getSettingValue(index)));
			status = "Invalid number.";
		}
	}

	private float getSettingValue(int index) {
		switch (index) {
			case 0:
				return settings.yaw;
			case 1:
				return settings.pitch;
			case 2:
				return settings.scale;
			case 3:
				return settings.screenX;
			case 4:
				return settings.screenY;
			case 5:
				return settings.modelOffset;
			default:
				return 0.0F;
		}
	}

	private void syncCurrentStack(boolean force) {
		/*
		 * Stack changes are the only time values auto-load. Resizing/reinitializing the GUI calls
		 * this with force=false so in-progress manual values are not lost.
		 */
		ItemStack stack = getRollingStockStack();
		if (stack == null) {
			if (!currentKey.equals("")) {
				currentKey = "";
				settings = null;
				clearPreviewTexture();
				previewBaseImage = null;
				previewBaseImageIncludesOffset = false;
				status = "";
			}
			return;
		}

		ITrainRecord record = Traincraft.traincraftRegistry.getCurrentTrain(stack.getItem());
		if (record == null) {
			currentKey = "";
			settings = null;
			clearPreviewTexture();
			previewBaseImage = null;
			previewBaseImageIncludesOffset = false;
			status = "No train record.";
			return;
		}

		int color = GeneratedRollingStockIconRenderer.getRenderColor(stack, record);
		String key = record.getInternalName() + "#" + color;
		if (!force && key.equals(currentKey)) {
			return;
		}

		currentKey = key;
		settings = RollingStockIconDevData.hasSettings(record, color)
				? RollingStockIconDevData.loadOrDefault(stack, record, color)
				: getAutoFitDefaultSettings(stack);
		refreshGeneratedPreview(stack, record, color);
		syncValueFields();
		status = RollingStockIconDevData.hasSettings(record, color) ? "Loaded saved JSON." : "Loaded auto-fit defaults.";
	}

    /** Fits the complete model when the selected stock has no saved capture settings. */
    private GeneratedRollingStockIconRenderer.CaptureSettings getAutoFitDefaultSettings(ItemStack stack)
    {
        return GeneratedRollingStockIconRenderer.autoFitIcon(
                stack,
                GeneratedRollingStockIconRenderer.getDefaultSettings(),
                GeneratedRollingStockIconRenderer.AutoFitMode.FULL,
                DEFAULT_AUTO_FIT_PADDING,
                true);
    }

	private ItemStack getRollingStockStack() {
		ItemStack stack = tile.getStackInSlot(0);
		return stack != null && stack.getItem() instanceof ItemAbstractRollingStock ? stack : null;
	}

	private void refreshPreview(ItemStack stack) {
		/*
		 * Preview uses the same generated 2D image pipeline as Generate. For screen X/Y edits we
		 * reuse the oversized base image when possible, so those controls only move the image and
		 * do not change the model capture itself.
		 */
		GeneratedRollingStockIconRenderer.CaptureSettings captureSettings = settings.copy();
		captureSettings.screenX = 0.0F;
		captureSettings.screenY = 0.0F;
		boolean autoFrameFront = settings.screenX == 0.0F && settings.screenY == 0.0F;
		GeneratedRollingStockIconRenderer.CaptureResult result = GeneratedRollingStockIconRenderer.captureIcon(stack, captureSettings, autoFrameFront);
		if (result != null) {
			previewBaseImage = result.baseImage != null ? result.baseImage : result.image;
			previewBaseImageIncludesOffset = false;
			refreshOffsetPreview();
			result.deleteFramebuffer();
		}
	}

	private void refreshGeneratedPreview(ItemStack stack, ITrainRecord record, int color) {
		BufferedImage generatedIcon = RollingStockIconDevData.loadIcon(record, color);
		if (generatedIcon != null) {
			previewBaseImage = generatedIcon;
			previewBaseImageIncludesOffset = true;
			setPreview(generatedIcon);
			return;
		}

		refreshPreview(stack);
	}

	private void refreshOffsetPreview() {
		if (previewBaseImage != null) {
			setPreview(GeneratedRollingStockIconRenderer.applyScreenOffset(previewBaseImage, settings.screenX, settings.screenY));
		}
	}

	private void setPreview(GeneratedRollingStockIconRenderer.CaptureResult result) {
		if (result.image != null) {
			previewBaseImage = result.baseImage != null ? result.baseImage : result.image;
			previewBaseImageIncludesOffset = false;
			setPreview(result.image);
		}
	}

	private void setPreview(BufferedImage image) {
		clearPreviewTexture();
		previewTexture = mc.getTextureManager().getDynamicTextureLocation("rollingstock_icon_preview", new DynamicTexture(image));
		BufferedImage preview64 = GeneratedRollingStockIconRenderer.resizeIcon(image, 64);
		if (preview64 != null) {
			preview64Texture = mc.getTextureManager().getDynamicTextureLocation("rollingstock_icon_preview_64", new DynamicTexture(preview64));
		}
		BufferedImage preview32 = GeneratedRollingStockIconRenderer.resizeIcon(image, 32);
		if (preview32 != null) {
			preview32Texture = mc.getTextureManager().getDynamicTextureLocation("rollingstock_icon_preview_32", new DynamicTexture(preview32));
		}
	}

	private void clearPreviewTexture() {
		if (previewTexture != null) {
			mc.getTextureManager().deleteTexture(previewTexture);
			previewTexture = null;
		}
		if (preview64Texture != null) {
			mc.getTextureManager().deleteTexture(preview64Texture);
			preview64Texture = null;
		}
		if (preview32Texture != null) {
			mc.getTextureManager().deleteTexture(preview32Texture);
			preview32Texture = null;
		}
	}

	private void drawBoundPreviewTexture(ResourceLocation texture, int x, int y, int size, int height) {
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		GL11.glPushMatrix();
		try {
			resetGuiGlState();
			mc.getTextureManager().bindTexture(texture);
			drawPreviewTexture(x, y, size, height);
		} finally {
			GL11.glPopMatrix();
			GL11.glPopAttrib();
			resetGuiGlState();
		}
	}

	private void resetGuiGlState() {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		GL11.glDisable(GL11.GL_ALPHA_TEST);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	}

	private void drawPreviewTexture(int x, int y, int size, int height) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glTexCoord2f(0.0F, 1.0F);
		GL11.glVertex3f(x, y + height, zLevel);
		GL11.glTexCoord2f(1.0F, 1.0F);
		GL11.glVertex3f(x + size, y + height, zLevel);
		GL11.glTexCoord2f(1.0F, 0.0F);
		GL11.glVertex3f(x + size, y, zLevel);
		GL11.glTexCoord2f(0.0F, 0.0F);
		GL11.glVertex3f(x, y, zLevel);
		GL11.glEnd();
	}

	private void drawPreviewBorder(int x, int y, int size) {
		drawRect(x - 1, y - 1, x + size + 1, y, 0xFFE0E0E0);
		drawRect(x - 1, y + size, x + size + 1, y + size + 1, 0xFFE0E0E0);
		drawRect(x - 1, y, x, y + size, 0xFFE0E0E0);
		drawRect(x + size, y, x + size + 1, y + size, 0xFFE0E0E0);
	}

}
