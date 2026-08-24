package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import train.common.containers.ContainerWorkbenchCart;
import train.common.library.Info;

public class GuiCraftingCart extends GuiContainer {
	private static final int BASE_GUI_HEIGHT = 166;
	private final RollingStockLightControlPanel lightControls;

	public GuiCraftingCart(
		InventoryPlayer inventoryPlayer, World world, Entity rollingStock) {
		super(new ContainerWorkbenchCart(inventoryPlayer, world));
		lightControls = RollingStockLightControlPanel.create(rollingStock);
		if (lightControls != null) {
			ySize = RollingStockLightControlPanel.EXPANDED_GUI_HEIGHT;
		}
	}

	@Override
	public void initGui() {
		ySize = lightControls != null
			? RollingStockLightControlPanel.EXPANDED_GUI_HEIGHT
			: BASE_GUI_HEIGHT;
		super.initGui();
		if (lightControls != null) {
			guiTop += RollingStockLightControlPanel.GUI_VERTICAL_OFFSET;
		}
		buttonList.clear();
		if (lightControls != null) {
			lightControls.init(
				buttonList, guiLeft, guiTop + RollingStockLightControlPanel.GUI_Y);
		}
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
		if (lightControls != null) {
			lightControls.update();
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		if (lightControls != null) {
			lightControls.actionPerformed(button);
		}
	}

	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.crafting"), 28, 6, 4210752);
		this.fontRendererObj.drawString(
			StatCollector.translateToLocal("container.inventory"),
			8, BASE_GUI_HEIGHT - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(
		float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "crafting_table.png"));
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, BASE_GUI_HEIGHT);
		if (lightControls != null) {
			lightControls.draw(mc, zLevel);
		}
	}
}
