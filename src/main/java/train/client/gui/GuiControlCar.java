package train.client.gui;

import com.google.gson.JsonObject;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import train.client.gui.specialbuttons.TransportLockGuiHandler;
import train.common.Traincraft;
import train.common.api.*;
import train.common.core.network.*;
import train.common.inventory.InventoryControlCar;
import train.common.library.Info;

public class GuiControlCar extends GuiContainer
{
    private String texture = Info.guiPrefix + "customButton.png";
    private int textureX = 0;
    private int textureY = 46;
    private int textureSizeX = 40;
    private int textureSizeY = 13;
    private int buttonPosX = 0;
    private int buttonPosY = 0;
    private GuiButton buttonLock;

    private AbstractControlCar controlCar;
    private Locomotive locomotiveUnderControl;

    public GuiControlCar(InventoryPlayer inventoryplayer, Entity entityminecart)
    {
        super(new InventoryControlCar(inventoryplayer,  (AbstractControlCar)entityminecart));
        controlCar = (AbstractControlCar) entityminecart;
        locomotiveUnderControl = (Locomotive) Minecraft.getMinecraft().theWorld.getEntityByID(controlCar.getLocomotiveBeingControlledEntityID());

    }

    @Override
    public void initGui() {
        super.initGui();
        buttonList.clear();

        //region ParkingBrake
        if (locomotiveUnderControl != null)
        {
            if (!locomotiveUnderControl.getParkingBrakeDW())
            {
                if (locomotiveUnderControl instanceof SteamTrain) {
                    textureX = 41;
                    textureY = 13;
                    textureSizeX = 40;
                    textureSizeY = 13;
                }
                else {
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
                if (locomotiveUnderControl instanceof SteamTrain) {
                    textureX = 0;
                    textureY = 13;
                    textureSizeX = 40;
                    textureSizeY = 13;
                }
                else {
                    textureX = 82;
                    textureY = 13;
                    textureSizeX = 43;
                    textureSizeY = 13;
                }
                buttonPosX = 0;
                buttonPosY = -13;
                buttonList.add(new GuiCustomButton(2, ((width - xSize) / 2) + buttonPosX, ((height - ySize) / 2) + buttonPosY, textureSizeX, textureSizeY, "", texture, textureX, textureY));//Brake: On
            }
        }
        //endregion ParkingBrake

        //region TrainLocked
        int var1 = (this.width - xSize) / 2;
        int var2 = (this.height - ySize) / 2;
        GuiButton lockButton = TransportLockGuiHandler.createLockButton(
                controlCar,
                (EntityPlayer)controlCar.riddenByEntity,
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

        //region guiTCTextFieldTrainNote
        controlCar.guiTCTextFieldTrainNote = new GuiTCTextField(fontRendererObj, width/2 - 85, var2 - 39, 170,15);
        controlCar.guiTCTextFieldTrainNote.setText(controlCar.getTrainNote());
        //endregion guiTCTextFieldTrainNote
            buttonList.add( new GuiButton(6, var1 + 108, var2 + 166, 67, 12,
                "Front: " + controlCar.getFrontHeadlightLevel().name()));
            buttonList.add( new GuiButton(
                10, var1 + 176, var2 + 166, 67, 12,
                "Rear: " + controlCar.getRearHeadlightLevel().name()));
            buttonList.add( new GuiButton(7, var1 + 41, var2 + 166, 67, 12,
                "Beacon: " + channelLabel(RollingStockLightChannel.BEACON)));
            buttonList.add( new GuiButton(
                8, var1 + 90, var2 + 178,
                85,
                12,
                "Ditch Lights: " + channelLabel(RollingStockLightChannel.DITCH)));
        buttonList.add(
            new GuiButton(
                11,
                var1 + 176,
                var2 + 178, 67, 12,
                "Aux: " + channelLabel(RollingStockLightChannel.AUX)));
            buttonList.add( new GuiButton(
                12, var1 + 176, var2 + 190,
                67, 12,
                "Gyra: " + channelLabel(RollingStockLightChannel.GYRA)));
    }

    @Override
    protected void actionPerformed(GuiButton guibutton)
    {
        switch (guibutton.id)
        {
            case 2:
                if ((!locomotiveUnderControl.parkingBrake) && locomotiveUnderControl.getSpeed() < 10) {
                    Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(true, locomotiveUnderControl.getEntityId()));
                    locomotiveUnderControl.parkingBrake=true;
                    locomotiveUnderControl.isBraking=true;
                    guibutton.displayString = "Brake: On";
                    this.initGui();
                }
                else
                { if (locomotiveUnderControl.getSpeed() < 10) {
                    Traincraft.brakeChannel.sendToServer(new PacketParkingBrake(false, locomotiveUnderControl.getEntityId()));
                    locomotiveUnderControl.parkingBrake=false;
                    locomotiveUnderControl.isBraking=false;
                    guibutton.displayString = "Brake: Off";
                    this.initGui();
                }
                }
            break;

            case 3: // Lock Control Car
                TransportLockGuiHandler.handleLockButton(this, guibutton, (EntityPlayer)controlCar.riddenByEntity, controlCar, isShiftKeyDown());
            break;

            case 6:
                sendHeadlight (
                    PacketRollingStockLightState.FRONT, controlCar.getFrontHeadlightLevel().next());
            break;
            case 7:
                sendChannel (PacketRollingStockLightState.BEACON, RollingStockLightChannel.BEACON);
            break;
            case 8:
                sendChannel (PacketRollingStockLightState.DITCH, RollingStockLightChannel.DITCH);
                break;
            case 10:
                sendHeadlight(
                    PacketRollingStockLightState.REAR, controlCar.getRearHeadlightLevel().next());
                break;
            case 11:
                sendChannel(PacketRollingStockLightState.AUX, RollingStockLightChannel.AUX);
                break;
            case 12:
                sendChannel(PacketRollingStockLightState.GYRA, RollingStockLightChannel.GYRA);
            break;
                }
                }

    /** Requests an explicit directional level; display state updates from server synchronization. */
    private void sendHeadlight(byte control, RollingStockHeadlightLevel level)
                {
        Traincraft.rollingStockLightsChannel.sendToServer(
            new PacketRollingStockLightState(
                controlCar.getEntityId(), control, (byte) level.ordinal()));
                }

    /** Requests the inverse named-circuit state without mutating the client entity locally. */
    private void sendChannel(byte control, RollingStockLightChannel channel)
                {
        boolean enabled = controlCar.isLightChannelEnabled(channel) == false;
        Traincraft.rollingStockLightsChannel.sendToServer(
            new PacketRollingStockLightState(
                controlCar.getEntityId(), control, (byte)(enabled ? 1 : 0)));
        }

    /** Returns the label state from the synchronized watcher. */
    private String channelLabel(RollingStockLightChannel channel)
    {
        return controlCar.isLightChannelEnabled(channel) ? "On" : "Off";
    }

    @Override
    protected void drawCreativeTabHoveringText(String str, int t, int g) {

        String state = "";
        if (controlCar.getTrainLockedFromPacket()) {
            if (controlCar.getTransportOwner().equalsIgnoreCase(((EntityPlayer) controlCar.riddenByEntity).getDisplayName()))
            {
                state = "Locked";
            }
            else
            { if (controlCar.isPlayerTrusted(((EntityPlayer) controlCar.riddenByEntity).getDisplayName()))
                {
                if (controlCar.isPlayerTrustedToBreak(((EntityPlayer) controlCar.riddenByEntity).getDisplayName()))
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
        fontRendererObj.drawStringWithShadow("Owner: " + controlCar.getTransportOwner().trim(), startX,
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

        fontRendererObj.drawString(controlCar.getInventoryName(), 39, 7, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 41, 5, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 39, 5, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 41, 7, 0x000000);

        fontRendererObj.drawString(controlCar.getInventoryName(), 39, 6, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 41, 6, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 40, 7, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 40, 5, 0x000000);
        fontRendererObj.drawString(controlCar.getInventoryName(), 40, 6, 0xd3a900);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_DEPTH_TEST);

        if (intersectsWith(i, j)) {
            drawCreativeTabHoveringText("When a locomotive is locked,", i, j);
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3)
    {
        super.drawScreen(mouseX, mouseY,par3);
        controlCar.guiTCTextFieldTrainNote.drawTextBox();
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
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
                    button.displayString = "Front: " + controlCar.getFrontHeadlightLevel().name();
                    break;
                case 10:
                    button.displayString = "Rear: " + controlCar.getRearHeadlightLevel().name();
                    break;
                case 7:
                    button.displayString =
                        "Beacon: " + channelLabel(RollingStockLightChannel.BEACON);
                    break;
                case 8:
                    button.displayString =
                        "Ditch Lights: " + channelLabel(RollingStockLightChannel.DITCH);
                    break;
                case 11:
                    button.displayString = "Aux: " + channelLabel(RollingStockLightChannel.AUX);
                    break;
                case 12:
                    button.displayString = "Gyra: " + channelLabel(RollingStockLightChannel.GYRA);
                    break;
                default:
                    break;
            }
        }
        if (controlCar.guiTCTextFieldTrainNote.isFocused()) {
            controlCar.guiTCTextFieldTrainNote.updateCursorCounter();
        }
    }

    @Override
    protected void keyTyped(char par1, int par2)
    {
        if (controlCar.guiTCTextFieldTrainNote.isFocused()) {
            controlCar.guiTCTextFieldTrainNote.textboxKeyTyped(par1, par2);
        } else
        { if (par1 == 1 || (par2 == this.mc.gameSettings.keyBindInventory.getKeyCode() || par2 == Keyboard.KEY_ESCAPE)){
            Traincraft.lockChannel.sendToServer(new PacketAddNote(controlCar.getEntityId(), controlCar.guiTCTextFieldTrainNote.getText()));
            mc.thePlayer.closeScreen();
        } else {
            super.keyTyped(par1, par2);
        }
    }
    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        controlCar.guiTCTextFieldTrainNote.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float f, int t, int g) {
        String controlCarGUIFilePath = Info.guiPrefix + "gui_loco.png";

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, controlCarGUIFilePath));
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);

        for (int i1 = controlCar.numCargoSlots; i1 < 5; i1++) {
            drawTexturedModalRect(j + 79 + 18 * i1, k + 17, 190, 0, 18, 18);
        }
        for (int j1 = controlCar.numCargoSlots1; j1 < 5; j1++) {
            drawTexturedModalRect(j + 79 + 18 * j1, k + 35, 190, 0, 18, 18);
        }
        for (int k1 = controlCar.numCargoSlots2; k1 < 5; k1++) {
            drawTexturedModalRect(j + 79 + 18 * k1, k + 53, 190, 0, 18, 18);
        }

        if (locomotiveUnderControl != null)
        {
            JsonObject guiDetails = Traincraft.jsonParser.parse(locomotiveUnderControl.guiDetailsDW()).getAsJsonObject();
            fontRendererObj.drawStringWithShadow("Carts pulled: " + guiDetails. get("cartsPulled"), 1, 10, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Mass pulled: " + guiDetails.get("massPulled"), 1, 20, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Speed reduction: " + guiDetails.get("slowDown") + " km/h", 1, 30, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Accel reduction: " + guiDetails.get("accelSlowDown"), 1, 40, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Brake reduction: " + guiDetails.get("brakeSlowDown"), 1, 50, 0xFFFFFF);


            fontRendererObj.drawStringWithShadow("Fuel consumption: " + ((locomotiveUnderControl.getFuelConsumption() *0.2)+"").substring(0,Math.min(((locomotiveUnderControl.getFuelConsumption() *0.2)+"").length(),4))+ " mB/s", 1,
                    60, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Fuel: " + locomotiveUnderControl.getFuel(), 1, 70, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Power: " + locomotiveUnderControl.transportMetricHorsePower() + " Mhp", 1, 80, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("State: " + locomotiveUnderControl.getState(), 1, 90, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Heat level: " + locomotiveUnderControl.getOverheatLevel(), 1, 100, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Maximum Speed: " + (locomotiveUnderControl.getCustomSpeedGUI()) + " km/h", 1, 110, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Destination: " + (locomotiveUnderControl.getDestinationGUI()), 1, 120, 0xFFFFFF);
            fontRendererObj.drawStringWithShadow("Primary Loco: " + (locomotiveUnderControl.getInventoryName() + " [" + locomotiveUnderControl.getTrainNote() + "]"), 1, 130, 0xFFFFFF);

        }
    }
}
