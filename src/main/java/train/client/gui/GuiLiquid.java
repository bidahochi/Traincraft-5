package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.client.core.helpers.FluidRenderHelper;
import train.client.gui.specialbuttons.TransportLockGuiHandler;
import train.common.Traincraft;
import train.common.api.LiquidTank;
import train.common.core.network.PacketAddNote;
import train.common.inventory.InventoryLiquid;
import train.common.library.Info;

public class GuiLiquid extends GuiContainer {
	private static final int BASE_GUI_HEIGHT = 166;

	private final LiquidTank liquid;
	private final EntityPlayer player;
	private GuiTCTextField trainNote;
	private final RollingStockLightControlPanel lightControls;

	public GuiLiquid(EntityPlayer player, InventoryPlayer inventoryPlayer, Entity rollingStock) {
		super(new InventoryLiquid(inventoryPlayer, (LiquidTank) rollingStock));
		liquid = (LiquidTank) rollingStock;
		this.player = player;
		lightControls = RollingStockLightControlPanel.create(rollingStock);
		if (lightControls != null) {
			ySize = RollingStockLightControlPanel.EXPANDED_GUI_HEIGHT;
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
		super.drawScreen(mouseX, mouseY, partialTicks);

		if (intersectsWith(mouseX, mouseY)) {
			if (liquid.getLiquidName()!= null && !liquid.getLiquidName().equals("")) {
				drawCreativeTabHoveringText(
					StatCollector.translateToLocal(liquid.getLiquidName())
					+ ": " + liquid.getAmount() + "mb/" + liquid.getCapacity() + "mb",
					mouseX, mouseY);
			} else {
				drawCreativeTabHoveringText( "0mb/" + liquid.getCapacity() + "mb", mouseX, mouseY);
			}
		}
		trainNote.drawTextBox();


	}
	@Override
	public void updateScreen() {
		super.updateScreen();
		if (lightControls != null) {
			lightControls.update();
		}
		if (trainNote.isFocused()) {
			trainNote.updateCursorCounter();
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
		GuiButton lockButton = TransportLockGuiHandler.createLockButton(
				liquid,
				player,
				guiLeft,
				guiTop,
				124,
				-10,
				51
		);

		if (lockButton != null)
		{
			this.buttonList.add(lockButton);
		}
		if (lightControls != null) {
			lightControls.init(
				buttonList, guiLeft, guiTop + RollingStockLightControlPanel.GUI_Y);
		}

		trainNote = new GuiTCTextField(fontRendererObj, width / 2 - 85, guiTop - 27, 170, 15);
		trainNote.setText(liquid.getTrainNote());

	}
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		if (lightControls != null && lightControls.actionPerformed(guibutton)) {
			return;
		}
		switch (guibutton.id)
		{
			case 3:
				TransportLockGuiHandler.handleLockButton(this, guibutton, player, liquid, isShiftKeyDown());
			break;
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(liquid.getCommandSenderName(), 65, 1, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 65, 3, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 63, 1, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 63, 3, 0x000000);

		fontRendererObj.drawString(liquid.getCommandSenderName(), 65, 2, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 63, 2, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 64, 1, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 64, 3, 0x000000);
		fontRendererObj.drawString(liquid.getCommandSenderName(), 64, 2, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		if (intersectsWithLockButton(i, j)) {
			drawCreativeTabHoveringTextLockButton("When a tank cart is locked,", i, j);
		}
	}

	@Override
	protected void keyTyped(char par1, int par2) {


		if (trainNote.isFocused()) {
			trainNote.textboxKeyTyped(par1, par2);
		} else if (par1 == 1 || (par2 == this.mc.gameSettings.keyBindInventory.getKeyCode() || par2 == Keyboard.KEY_ESCAPE)){
			Traincraft.lockChannel.sendToServer(new PacketAddNote(liquid.getEntityId(), trainNote.getText()));
			mc.thePlayer.closeScreen();
		} else {
			super.keyTyped(par1, par2);
		}





	}


	protected void drawCreativeTabHoveringTextLockButton(String str, int t, int g) {

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if(liquid.getTrainLockedFromPacket()){
			if (liquid.getTransportOwner().equalsIgnoreCase(player.getDisplayName()))
				state = "Locked";
			else if (liquid.isPlayerTrusted(player.getDisplayName()))
				if (liquid.isPlayerTrustedToBreak(player.getDisplayName()))
					state = "Trusted Access+";
				else
					state = "Trusted Access";
		} else {
			state = "Unlocked";
		}
		
		int textWidth = fontRendererObj.getStringWidth("the GUI, change speed, destroy it.");
		int startX = 90;
		int startY = 5;

		int i4 = 0xf0100010;
		drawGradientRect(startX - 3, startY - 4, startX + textWidth + 3, startY + 52, i4, i4);
		drawGradientRect(startX - 4, startY - 3, startX + textWidth + 4, startY + 51, i4, i4);
		int colour1 = 0x505000ff;
		int colour2 = (colour1 & 0xfefefe) >> 1 | colour1 & 0xff000000;
		drawGradientRect(startX - 3, startY - 3, startX + textWidth + 3, startY + 51, colour1, colour2);
		drawGradientRect(startX - 2, startY - 2, startX + textWidth + 2, startY + 50, i4, i4);
		fontRendererObj.drawStringWithShadow(str, startX, startY, -1);
		fontRendererObj.drawStringWithShadow("only its owner can open", startX, startY + 10, -1);
		fontRendererObj.drawStringWithShadow("the GUI and destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: "+state, startX, startY+30, -1);
		fontRendererObj.drawStringWithShadow("Owner: "+(liquid).getTransportOwner().trim(), startX, startY+40, -1);
	}
	public boolean intersectsWithLockButton(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		return (mouseX >= guiLeft + 124 && mouseX <= guiLeft + 174
			&& mouseY >= guiTop - 10 && mouseY <= guiTop);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(
		float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "gui_liquid.png"));
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, BASE_GUI_HEIGHT);
		if (lightControls != null) {
			lightControls.draw(mc, zLevel);
		}


		int liquidHeight = (liquid.getAmount() * 50) / liquid.getCapacity();

		Fluid theLiquid = FluidRegistry.getFluid(liquid.getLiquidItemID());
		/** Don't render anything if the cart is empty */
		if (theLiquid != null) {
			/** Protection against missing rendering icon, to avoid NPE */
			if (theLiquid.getIcon() == null)
				return;
			/** Get the texture sheet of the liquid */
			//mc.renderEngine.func_110577_a(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "empty.png"));
			mc.renderEngine.bindTexture(FluidRenderHelper.getFluidSheet(theLiquid));
			//func_110628_a(FluidRenderHelper.getFluidSheet(new FluidStack(theLiquid,1)));
			/** Drawing 16*16 icons side by side, extending them gives bad results */
			for (int column = 0; column < 66 / 16; column++) {
				for (int row = 0; row <= liquidHeight / 16; row++) {
					//System.out.println(ItemIDs.bogie.item.getIconFromDamage(0));
					drawTexturedModelRectFromIcon(
						guiLeft + 58 + column * 16, guiTop + 52 - row * 16,
						FluidRenderHelper.getFluidTexture(theLiquid, false), 16, 16);
				}
			}
			/** Bind again to render a black overlay. The icon is rendered in 16*16 square and therefore not adapted to a 50 pixels high tank */
			mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation,Info.guiPrefix + "gui_liquid.png"));
			/** Drawing black overlay over the liquid */
			drawTexturedModalRect(
				guiLeft + 58, guiTop + 1, 4, 168, 64, 50 - liquidHeight + 15);
		}
		/** Drawing the red scale over the liquid */
		drawTexturedModalRect(guiLeft + 58, guiTop + 17, 72, 167, 64, 50);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		return (mouseX >= guiLeft + 57 && mouseX <= guiLeft + 123
			&& mouseY >= guiTop + 16 && mouseY <= guiTop + 68);
	}

	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) {
		trainNote.mouseClicked(mouseX, mouseY, mouseButton);
		super.mouseClicked(mouseX, mouseY, mouseButton);
	}
}
