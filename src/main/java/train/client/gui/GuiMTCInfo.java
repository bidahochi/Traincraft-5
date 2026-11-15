package train.client.gui;


//import com.jcirmodelsquad.tcjcir.features.eti.GuiETI;
import com.jcirmodelsquad.tcjcir.features.eti.GuiETI;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import train.common.api.Locomotive;
import train.common.core.network.PacketDestination;
import train.common.core.network.PacketUpdateTrainID;

public class GuiMTCInfo extends GuiScreen {
    Locomotive theLocomotive;
    private GuiTCTextField trainLevel;
    private GuiTCTextField trainID;
    private GuiTCTextField destination;
    private GuiButton enhancedTrainInformation;
    public int xSize = 305;
    public int ySize = 274;
    public int guiLeft;
    public int guiTop;
    public GuiMTCInfo(Entity entity) {

        if (entity instanceof Locomotive) {
            theLocomotive = (Locomotive)entity;
        }
    }

    @Override
    public void initGui()
    {
        if (theLocomotive == null || theLocomotive.isActiveDriver(mc.thePlayer) == false
                || theLocomotive.isProtectedControlAuthorized(mc.thePlayer) == false)
        {
            mc.displayGuiScreen(null);
            return;
        }
        this.guiLeft = (this.width - this.xSize) / 2;
        this.guiTop = (this.height - this.ySize) / 2;
        trainLevel = new GuiTCTextField(fontRendererObj, this.width/2 -5, this.height/2 - 1, 15,15);
        destination = new GuiTCTextField(fontRendererObj, this.width/2 -5, this.height/2 + 20, 80,15);
        trainID = new GuiTCTextField(fontRendererObj, this.width/2 -5, this.height/2 - 20, 80,15);
        enhancedTrainInformation = new GuiButton(0, guiLeft + 90, guiTop + 180, 150, 20, "Enhanced Train Information" );
        trainLevel.setMaxStringLength(1);
        trainLevel.setText(String.valueOf(theLocomotive.trainLevel));
        trainID.setMaxStringLength(6);
        destination.setMaxStringLength(500);
        trainID.setText(theLocomotive.getDataWatcher().getWatchableObjectString(5));

        destination.setText(theLocomotive.getDataWatcher().getWatchableObjectString(3));

        this.buttonList.add(enhancedTrainInformation);

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, "Minecraft Train Control Setup", this.width / 2, 40, 0xFFFFFFFF);
        this.drawString( this.fontRendererObj,"Train Level: ", this.width/2 -70, this.height/2 + 3,  0xFFFFFFFF);
        this.drawString( this.fontRendererObj,"Train ID: ", this.width/2 -70, this.height/2 - 17,  0xFFFFFFFF);
        this.drawString( this.fontRendererObj,"Destination: ", this.width/2 -70, this.height/2 + 23,  0xFFFFFFFF);
        trainLevel.drawTextBox();
        trainID.drawTextBox();
        destination.drawTextBox();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiETI(theLocomotive));
        }
    }
    @Override
    public void updateScreen()
    {
        if (theLocomotive == null || theLocomotive.isActiveDriver(mc.thePlayer) == false
                || theLocomotive.isProtectedControlAuthorized(mc.thePlayer) == false)
        {
            mc.displayGuiScreen(null);
            return;
        }
        super.updateScreen();
        if (trainLevel.isFocused()) {
            trainLevel.updateCursorCounter();
        }
        if (trainID.isFocused()) {
            trainID.updateCursorCounter();
        }
        if (destination.isFocused()) {
            destination.updateCursorCounter();
        }



    }
    @Override
    protected void keyTyped(char par1, int par2)
    {
        if (theLocomotive == null || theLocomotive.isActiveDriver(mc.thePlayer) == false
                || theLocomotive.isProtectedControlAuthorized(mc.thePlayer) == false)
        {
            mc.displayGuiScreen(null);
            return;
        }

        if (trainLevel.isFocused()  && par2 == Keyboard.KEY_1 || par2 == Keyboard.KEY_2 || par2 == Keyboard.KEY_3 || par2 == Keyboard.KEY_4 || par2 == Keyboard.KEY_5 || par2 == Keyboard.KEY_6 ||par2 == Keyboard.KEY_7 || par2 == Keyboard.KEY_8 || par2 == Keyboard.KEY_9 || par2 == Keyboard.KEY_0  || par2 == Keyboard.KEY_BACK) {
            trainLevel.textboxKeyTyped(par1, par2);
        }
        if (trainID.isFocused()) {
            trainID.textboxKeyTyped(par1, par2);
        }
        if (destination.isFocused()) {
            destination.textboxKeyTyped(par1, par2);
        }

        if (par2 == 1)
        {
            if (destination.isFocused() == false || trainID.isFocused() == false || trainLevel.isFocused() == false)
            {
                mc.thePlayer.closeScreen();
                if (isInteger(trainLevel.getText()))
                {
                    theLocomotive.trainLevel = Integer.parseInt(trainLevel.getText());
                }
                if (!trainLevel.getText().equals("")) {
                    //Traincraft.mtlChannel.sendToServer(new PacketMTCLevelUpdate(theLocomotive.getEntityId(), Integer.parseInt(trainLevel.getText())));
                }

                theLocomotive.trainID = trainID.getText();
                Traincraft.updateTrainIDChannel.sendToServer(new PacketUpdateTrainID(theLocomotive.getEntityId(), trainID.getText()));
                theLocomotive.destination = destination.getText();
                Traincraft.updateDestinationChannel.sendToServer(new PacketDestination(theLocomotive.getEntityId(), destination.getText()));
                mc.thePlayer.closeScreen();
            }
        }

    }

    @Override
    protected void mouseClicked(int par1, int par2, int par3) {
        trainLevel.mouseClicked(par1, par2, par3);
        trainID.mouseClicked(par1, par2, par3);
        destination.mouseClicked(par1, par2, par3);
        super.mouseClicked(par1, par2, par3);
    }
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
