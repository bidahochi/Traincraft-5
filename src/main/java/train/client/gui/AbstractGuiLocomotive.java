package train.client.gui;

import com.google.gson.JsonObject;
import com.jcirmodelsquad.tcjcir.features.autotrain.IAT2Compatible;
import java.util.Collections;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.client.gui.specialbuttons.TransportLockGuiHandler;
import train.common.Traincraft;
import train.common.api.*;
import train.common.api.locomotive.AbstractBoilerLocomotive;
import train.common.core.network.*;
import train.common.library.Info;

public abstract class AbstractGuiLocomotive extends GuiContainer {


	private String texture = Info.guiPrefix + "customButton.png";
	private int textureX = 0;
	private int textureY = 46;
	private int textureSizeX = 40;
	private int textureSizeY = 13;
	private int buttonPosX = 0;
	private int buttonPosY = 0;
	private GuiButton buttonLock;

	protected final Locomotive loco;

	protected AbstractGuiLocomotive(net.minecraft.inventory.Container container, Locomotive locomotive) {
		super(container);
		this.loco = locomotive;
        if (locomotive instanceof DieselTrain)
        {
            this.ySize = 199;
        }
    }

    /** Sends the inverse of the synchronized named-circuit state; the server remains authoritative. */
    private void sendChannel(byte control, RollingStockLightChannel channel)
    {
        boolean enabled = loco.isLightChannelEnabled(channel) == false;
        Traincraft.rollingStockLightsChannel.sendToServer(
            new PacketRollingStockLightState(
                loco.getEntityId(), control, (byte)(enabled ? 1 : 0)));
    }

    /** Returns the display state derived from the synchronized watcher, not client prediction. */
    private String channelLabel(RollingStockLightChannel channel)
    {
        return loco.isLightChannelEnabled(channel) ? "On" : "Off";
	}

	@Override
	public void initGui() {
		super.initGui();
		buttonList.clear();
		//region ParkingBrake
		if (loco.getParkingBrakeFromPacket() == false)
		{
			if (loco instanceof AbstractBoilerLocomotive) // steam locomotive brake off
		{
				textureX = 41;
				textureY = 13;
				textureSizeX = 40;
				textureSizeY = 13;
			}
			else // diesel and electric locomotive brake off
            {
				textureX = 126;
				textureY = 13;
				textureSizeX = 43;
				textureSizeY = 13;
			}
			buttonPosX = 43;
			buttonPosY = -13;
			buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX - 12, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));//Brake: Off
		}
		else
		{
			if (loco instanceof AbstractBoilerLocomotive) // steam locomotive brake on
            {
				textureX = 0;
				textureY = 13;
				textureSizeX = 40;
				textureSizeY = 13;
			}
			else // diesel and electric locomotive brake on
            {
				textureX = 82;
				textureY = 13;
				textureSizeX = 43;
				textureSizeY = 13;
			}
			buttonPosX = 0;
			buttonPosY = -13;
			buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));//Brake: On
		}
		//endregion ParkingBrake

		//region TrainLocked
		int var1 = (this.width - xSize) / 2;
		int var2 = (this.height - ySize) / 2;
		GuiButton lockButton = TransportLockGuiHandler.createLockButton(
				loco,
				(EntityPlayer)loco.riddenByEntity,
				var1,
				var2,
				108,
				-10,
				67
		);

		if (lockButton != null) {
			this.buttonList.add(lockButton);
			this.buttonLock = lockButton;
		}

		//endregion TrainLocked

		//region Start/Stop Engine
		if (!(loco instanceof AbstractBoilerLocomotive)) {
			if (loco.isLocoTurnedOn()) {
				this.buttonList.add(this.buttonLock = new GuiButton(4, var1 + 108, var2 - 22, 67, 12, "Stop Engine"));
			}
			else {
				this.buttonList.add(this.buttonLock = new GuiButton(4, var1 + 108, var2 - 22, 67, 12, "Start Engine"));
			}
		}
		//endregion Start/Stop Engine

		//region Drop Fire
		if (loco instanceof SteamTrain) {
			this.buttonList.add(this.buttonLock = new GuiButton(9, var1 + 108, var2 - 22, 67, 12, "Drop Fire"));
		}
		//endregion Drop Fire

		if (loco instanceof IAT2Compatible) {
			this.buttonList.add(this.buttonLock = new GuiButton(5, var1 + 108, var2 - 34, 67, 12, "AutoTrain-2"));
		}

		//region guiTCTextFieldTrainNote
		loco.guiTCTextFieldTrainNote = new GuiTCTextField(fontRendererObj, width/2 - 85, var2 - 39, 170,15);
		loco.guiTCTextFieldTrainNote.setText(loco.getTrainNote());
		//endregion guiTCTextFieldTrainNote
		if (loco instanceof DieselTrain)
		{
            addDieselLightControls( var1, var2);
		}
		else
		{
			buttonList.add( new GuiButton(6, var1 + 108, var2 + 166, 67, 12,
                    "Front: " + loco.getFrontHeadlightLevel().name()));
            buttonList.add(
                new GuiButton(
                    10,
                    var1 + 176,
                    var2 + 166,
                    67,
                    12,
                    "Rear: " + loco.getRearHeadlightLevel().name()));
            buttonList.add(
                new GuiButton(
                    11,
                    var1 + 176,
                    var2 + 178,
                    67,
                    12,
                    "Aux: " + channelLabel(RollingStockLightChannel.AUX)));
            buttonList.add(
                new GuiButton(
                    12,
                    var1 + 176,
                    var2 + 190,
                    67,
                    12,
                    "Gyra: " + channelLabel(RollingStockLightChannel.GYRA)));
		}

		//region Beacon On/Off
		if ((loco instanceof DieselTrain) == false
                &&loco.isLightChannelEnabled(RollingStockLightChannel.BEACON))
		{
			buttonList.add(this.buttonLock = new GuiButton(7, var1 + 41, var2 + 166, 67, 12, "Beacon: On"));
		}
		else
		{
            if ((loco instanceof DieselTrain) == false)
		{
			buttonList.add(this.buttonLock = new GuiButton(7, var1 + 41, var2 + 166, 67, 12, "Beacon: Off"));
		}
        }
		//endregion Beacon On/Off

		//region DitchLights On/Off
		if ((loco instanceof DieselTrain) == false
                &&loco.isLightChannelEnabled(RollingStockLightChannel.DITCH))
		{
			buttonList.add(this.buttonLock = new GuiButton(8, var1 + 90, var2 + 178, 85, 12, "Ditch Lights: On"));
		}
		else
		{
            if ((loco instanceof DieselTrain) == false)
		{
			buttonList.add(this.buttonLock = new GuiButton(8, var1 + 90, var2 + 178, 85, 12, "Ditch Lights: Off"));
		}
        }
		//endregion DitchLights On/Off
	}

    /** Adds transparent hit regions over the lighting controls painted into the diesel panel. */
    private void addDieselLightControls(int x, int y)
    {
        buttonList.add(new GuiPanelHitButton(13, x + 8, y + 164, 12, 25, "Front lights: Off"));
        buttonList.add(new GuiPanelHitButton(14, x + 20, y + 164, 15, 25, "Front lights: Dim"));
        buttonList.add(new GuiPanelHitButton(15, x + 35, y + 164, 12, 25, "Front lights: Bright"));
        buttonList.add(new GuiPanelHitButton(16, x + 47, y + 164, 12, 25, "Rear lights: Off"));
        buttonList.add(new GuiPanelHitButton(17, x + 59, y + 164, 15, 25, "Rear lights: Dim"));
        buttonList.add(new GuiPanelHitButton(18, x + 74, y + 164, 12, 25, "Rear lights: Bright"));
        buttonList.add(new GuiPanelHitButton(11, x + 86, y + 168, 12, 22, "Aux lights"));
        buttonList.add(new GuiPanelHitButton(7, x + 102, y + 168, 12, 22, "Beacon"));
        buttonList.add(new GuiPanelHitButton(12, x + 118, y + 168, 12, 22, "Gyralite"));
        buttonList.add(new GuiPanelHitButton(8, x + 134, y + 168, 12, 22, "Ditch lights"));
	}

	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
		switch (guibutton.id) //uses first button function parameter of above button declarations
		{
			case 2:
				if ((!loco.parkingBrake) && loco.getSpeed() < 10) {
					Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, loco.getEntityId()));
					loco.parkingBrake=true;
					loco.isBraking=true;
					guibutton.displayString = "Brake: On";
					this.initGui();
				}
				else
                { if (loco.getSpeed() < 10) {
					Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(false, loco.getEntityId()));
					loco.parkingBrake=false;
					loco.isBraking=false;
					guibutton.displayString = "Brake: Off";
					this.initGui();
				}
                }
			break;
			case 3:
				TransportLockGuiHandler.handleLockButton(this, guibutton, (EntityPlayer)loco.riddenByEntity, loco, isShiftKeyDown());
			break;
			case 4:
				if (loco.isLocoTurnedOn())
				{
					if(loco.getSpeed() <= 1){
						Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(false));
						loco.isLocoTurnedOn = false;
						guibutton.displayString = "Start Engine";
						/**
                         * We implemented Auto ParkingBrake since Brutal tried to did it in the
                         * Locomotive API when you turn off the damn Train
						 */
						Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, loco.getEntityId()));
						loco.parkingBrake = true;
						loco.isBraking = true;
						this.initGui();
					}else{
						((EntityPlayer)loco.riddenByEntity).addChatMessage(new ChatComponentText("Stop before turning it Off!"));
					}
				}
				else {
					Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(true));
					loco.isLocoTurnedOn = true;
					guibutton.displayString = "Stop Engine";
				}
			break;
			case 5:
				if (loco.isLocoTurnedOn()) {
					if(loco.getSpeed() <= 1){
						Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(false));
						loco.isLocoTurnedOn = false;
						guibutton.displayString = "Start Engine";
						/**
                         * We implemented Auto ParkingBrake since Brutal tried to did it in the
                         * Locomotive API when you turn off the damn Train
						 */
						Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, loco.getEntityId()));
						loco.parkingBrake = true;
						loco.isBraking = true;
						this.initGui();
					}else{
						((EntityPlayer)loco.riddenByEntity).addChatMessage(new ChatComponentText("Stop before turning it Off!"));
					}
				}
				else {
					Traincraft.ignitionChannel.sendToServer(new PacketSetLocoTurnedOn(true));
					loco.isLocoTurnedOn = true;
					guibutton.displayString = "Stop Engine";
				}
			break;
			case 6: // Front Off/Dim/Bright
                RollingStockHeadlightLevel front =loco.getFrontHeadlightLevel().next();
					Traincraft.rollingStockLightsChannel.sendToServer(new PacketRollingStockLightState( loco.getEntityId(),
                        PacketRollingStockLightState.FRONT,
                        (byte) front.ordinal()));
			break;
			case 7: // Beacon
                sendChannel (PacketRollingStockLightState.BEACON, RollingStockLightChannel.BEACON);
			break;
			case 8: // DitchLights
                sendChannel (PacketRollingStockLightState.DITCH, RollingStockLightChannel.DITCH);
                break;
            case 10: // Rear Off/Dim/Bright
                RollingStockHeadlightLevel rear =loco.getRearHeadlightLevel().next();
					Traincraft.rollingStockLightsChannel.sendToServer(new PacketRollingStockLightState( loco.getEntityId(),
                        PacketRollingStockLightState.REAR,
                        (byte) rear.ordinal()));
                break;
            case 11: // Aux
                sendChannel(PacketRollingStockLightState.AUX, RollingStockLightChannel.AUX);
                break;
            case 12: // Gyra
                sendChannel(PacketRollingStockLightState.GYRA, RollingStockLightChannel.GYRA);
                break;
            case 13:
            case 14:
            case 15:
                RollingStockHeadlightLevel selectedFront =
                    RollingStockHeadlightLevel.fromOrdinal(
					guibutton.id - 13);
					Traincraft.rollingStockLightsChannel.sendToServer(new PacketRollingStockLightState( loco.getEntityId(),
                        PacketRollingStockLightState.FRONT,
                        (byte) selectedFront.ordinal()));
                break;
            case 16:
            case 17:
            case 18:
                RollingStockHeadlightLevel selectedRear =
                    RollingStockHeadlightLevel.fromOrdinal(
					guibutton.id - 16);
                Traincraft.rollingStockLightsChannel.sendToServer(
                    new PacketRollingStockLightState(
                        loco.getEntityId(),
                        PacketRollingStockLightState.REAR,
                        (byte) selectedRear.ordinal()));
   			break;
			case 9: //drop fire
				Traincraft.ignitionChannel.sendToServer(new PacketDropFire(loco.getEntityId()));
				loco.fuelTrain=0;
   			break;
		}
	}

	@Override
	protected void drawCreativeTabHoveringText(String str, int t, int g) {

		//int liqui = (dieselInventory.getLiquidAmount() * 50) / dieselInventory.getTankCapacity();
		String state = "";
		if (loco.getTrainLockedFromPacket()) {
			if (loco.getTransportOwner().equalsIgnoreCase(((EntityPlayer) loco.riddenByEntity).getDisplayName()))
            {
				state = "Locked";
            }
			else
            { if (loco.isPlayerTrusted(((EntityPlayer) loco.riddenByEntity).getDisplayName()))
                {
				if (loco.isPlayerTrustedToBreak(((EntityPlayer) loco.riddenByEntity).getDisplayName()))
                    {
					state = "Trusted Access+";
                    }
				else
                    {
					state = "Trusted Access";
		}
                }
            }
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
		fontRendererObj.drawStringWithShadow("the GUI, change speed, destroy it.", startX, startY + 20, -1);
		fontRendererObj.drawStringWithShadow("Current state: " + state, startX, startY + 30, -1);
		fontRendererObj.drawStringWithShadow("Owner: " + loco.getTransportOwner().trim(), startX,
				startY + 40, -1);
	}

	public boolean intersectsWith(int mouseX, int mouseY) {
		//System.out.println(mouseX+" "+mouseY);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		return (mouseX >= j + 124 && mouseX <= j + 174 && mouseY >= k - 10 && mouseY <= k);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glDisable(GL11.GL_DEPTH_TEST);

		fontRendererObj.drawString(loco.getInventoryName(), 39, 7, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 41, 5, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 39, 5, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 41, 7, 0x000000);

		fontRendererObj.drawString(loco.getInventoryName(), 39, 6, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 41, 6, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 40, 7, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 40, 5, 0x000000);
		fontRendererObj.drawString(loco.getInventoryName(), 40, 6, 0xd3a900);

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_DEPTH_TEST);

		if (intersectsWith(i, j)) {
			drawCreativeTabHoveringText("When a locomotive is locked,", i, j);
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float par3)   // determines and renders the water level for steam locomotives and fuel
{
        // level for diesel locomotives
		super.drawScreen(mouseX, mouseY,par3);
		if(loco instanceof AbstractBoilerLocomotive)
		{
			int j = (width - xSize) / 2;
			int k = (height - ySize) / 2;
			if (mouseX>j+143 && mouseX<j+161 && mouseY>k+18 && mouseY<k+68)
			{
				drawHoveringText(Collections.singletonList("Water: " + (((AbstractBoilerLocomotive) loco).getWaterAmount()) + "mb / " + (((AbstractBoilerLocomotive) loco).getCartTankCapacity()) +"mb"),
						mouseX, mouseY, fontRendererObj);
			}
		}
		else
        { if(loco instanceof DieselTrain){
			int j = (width - xSize) / 2;
			int k = (height - ySize) / 2;
			if (mouseX>j+143 && mouseX<j+161 && mouseY>k+18 && mouseY<k+68)
			{
				if (((DieselTrain) loco).getDiesel()!=0){
					drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("fluid.tc:"+((DieselTrain) loco).getLiquidName()) + " " +
									((DieselTrain) loco).getDiesel() +"mb / " + (((DieselTrain) loco).getCartTankCapacity()) + "mb"),
							mouseX, mouseY, fontRendererObj);
				}
				else
				{
					drawHoveringText(Collections.singletonList("Fuel: " +
									"0mb / " + (((DieselTrain) loco).getCartTankCapacity()) + "mb"),
							mouseX, mouseY, fontRendererObj);
				}
			}
		}
        }
		loco.guiTCTextFieldTrainNote.drawTextBox();
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
        // Lighting controls are server-authoritative. Refresh the existing text buttons
        // from DataWatcher state instead of preserving a client-side prediction.
        if ((loco instanceof DieselTrain) == false)
        {
            for (Object value : buttonList)
            {
                if ((value instanceof GuiButton) == false)
                {
                    continue;
                }
                GuiButton button = (GuiButton) value;
                switch (button.id)
                {
                    case 6:
                        button.displayString = "Front: " + loco.getFrontHeadlightLevel().name();
                        break;
                    case 10:
                        button.displayString = "Rear: " + loco.getRearHeadlightLevel().name();
                        break;
                    case 11:
                        button.displayString = "Aux: " + channelLabel(RollingStockLightChannel.AUX);
                        break;
                    case 12:
                        button.displayString =
                            "Gyra: " + channelLabel(RollingStockLightChannel.GYRA);
                        break;
                    case 7:
                        button.displayString =
                            "Beacon: " + channelLabel(RollingStockLightChannel.BEACON);
                        break;
                    case 8:
                        button.displayString =
                            "Ditch Lights: " + channelLabel(RollingStockLightChannel.DITCH);
                        break;
                    default:
                        break;
                }
            }
        }
		if (loco.guiTCTextFieldTrainNote.isFocused()) {
			loco.guiTCTextFieldTrainNote.updateCursorCounter();
		}
	}

	@Override
	protected void keyTyped(char par1, int par2) {


		if (loco.guiTCTextFieldTrainNote.isFocused()) {
			loco.guiTCTextFieldTrainNote.textboxKeyTyped(par1, par2);
		} else
        { if (par1 == 1 || (par2 == this.mc.gameSettings.keyBindInventory.getKeyCode() || par2 == Keyboard.KEY_ESCAPE)){
			Traincraft.lockChannel.sendToServer(new PacketAddNote(loco.getEntityId(), loco.guiTCTextFieldTrainNote.getText()));
			mc.thePlayer.closeScreen();
		} else {
			super.keyTyped(par1, par2);
		}
	}
    }

	@Override
	protected void mouseClicked(int par1, int par2, int par3) {
		loco.guiTCTextFieldTrainNote.mouseClicked(par1, par2, par3);
		super.mouseClicked(par1, par2, par3);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int t, int g)   // renders locomotive inventory GUI background and fluids and locomotive
 {
        // performance information
		String i = getGuiTexture();

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, i));
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;
		drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

		drawLocomotiveContents(j, k, i);
        if (loco instanceof DieselTrain)
        {
            drawDieselLightControls(j, k);
        }
		drawPerformanceInformation();
	}

    /** Draws lever positions from synchronized front/rear levels and named-circuit flags. */
    private void drawDieselLightControls(int left, int top)
    {
        drawDialLever(
            left + 21,
            top
            + 172
            + (loco.getFrontHeadlightLevel() == RollingStockHeadlightLevel.OFF ? 1 : 0),
            dialAngle(loco.getFrontHeadlightLevel()));
        drawDialLever(
            left + 60,
            top
            + 172
            + (loco.getRearHeadlightLevel() == RollingStockHeadlightLevel.OFF ? 1 : 0),
            dialAngle(loco.getRearHeadlightLevel()));
        drawFlickHandle(left + 89, top, loco.isLightChannelEnabled(RollingStockLightChannel.AUX));
        drawFlickHandle(
            left + 105, top, loco.isLightChannelEnabled(RollingStockLightChannel.BEACON));
        drawFlickHandle(left + 121, top, loco.isLightChannelEnabled(RollingStockLightChannel.GYRA));
        drawFlickHandle(
            left + 137, top, loco.isLightChannelEnabled(RollingStockLightChannel.DITCH));
    }

    /** Maps OFF/DIM/BRIGHT to the authored panel lever angles in degrees. */
    private static float dialAngle(RollingStockHeadlightLevel level)
    {
        return level == RollingStockHeadlightLevel.OFF
               ? -90.0F
               : level == RollingStockHeadlightLevel.DIM ? 0.0F : 90.0F;
    }

    /** Draws one rotated dial lever while preserving the surrounding matrix transform. */
    private void drawDialLever(int x, int y, float angle)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef(x + 4.0F, y + 10.0F, 0.0F);
        GL11.glRotatef(angle, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(-(x + 4.0F), -(y + 10.0F), 0.0F);
        drawTexturedModalRect(x, y, 0, 210, 8, 20);
        GL11.glPopMatrix();
    }

    /** Draws a two-position switch handle over the panel artwork. */
    private void drawFlickHandle(int x, int top, boolean enabled)
    {
        drawTexturedModalRect(x, top + (enabled ? 174 : 180), 10, 223, 6, 7);
    }

    private static final class GuiPanelHitButton extends GuiButton
    {
        private GuiPanelHitButton(int id, int x, int y, int width, int height, String label)
        {
            super(id, x, y, width, height, label);
        }

        @Override
        public void drawButton(net.minecraft.client.Minecraft minecraft, int mouseX, int mouseY)
        {
            // The modern diesel atlas supplies the visuals; this widget is only its hit area.
        }
    }

	protected abstract String getGuiTexture();

	protected abstract void drawLocomotiveContents(int left, int top, String guiTexture);

	protected void drawPerformanceInformation() {
		JsonObject guiDetails = Traincraft.jsonParser.parse(loco.guiDetailsDW()).getAsJsonObject();

		fontRendererObj.drawStringWithShadow("Carts pulled: " + guiDetails. get("cartsPulled"), 1, 10, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Mass pulled: " + guiDetails.get("massPulled"), 1, 20, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Speed reduction: " + guiDetails.get("slowDown") + " km/h", 1, 30, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Accel reduction: " + guiDetails.get("accelSlowDown"), 1, 40, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Brake reduction: " + guiDetails.get("brakeSlowDown"), 1, 50, 0xFFFFFF);


		fontRendererObj.drawStringWithShadow("Fuel consumption: " + ((loco.getFuelConsumption() *0.2)+"").substring(0,Math.min(((loco.getFuelConsumption() *0.2)+"").length(),4))+ " mB/s", 1,
				60, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Fuel: " + loco.getFuel(), 1, 70, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Power: " + loco.transportMetricHorsePower() + " Mhp", 1, 80, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("State: " + loco.getState(), 1, 90, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Heat level: " + loco.getOverheatLevel(), 1, 100, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Maximum Speed: " + (loco.getCustomSpeedGUI()) + " km/h", 1, 110, 0xFFFFFF);
		fontRendererObj.drawStringWithShadow("Destination: " + (loco.getDestinationGUI()), 1, 120, 0xFFFFFF);
	}

	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

}
