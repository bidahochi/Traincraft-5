package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import train.client.render.RenderRollingStock;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketPaintbrushColor;
import train.common.core.network.PacketTextureOverlayConfig;
import train.common.library.*;
import train.common.library.register.ITrainRecord;
import train.common.overlaytexture.OverlayTextureManager;

import java.awt.*;
import java.util.Collections;

/**
 * @author 02skaplan
 * <p>GUI for Paintbrush</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiPaintbrushMenu extends GuiScreen {
    private final EntityPlayer editingPlayer;
    private final EntityRollingStock rollingStock;
    private float roll = 0.0f;
    private float yaw = 0.0f;
    private boolean rollDown;
    final private int MENU_TEXTURE_WIDTH = 206;
    final private int MENU_TEXTURE_HEIGHT = 200;
    final private int RESULTS_PER_PAGE = 8;
    /**
     * X-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_X;
    /**
     * X-coordinate of top center of GUI.
     */
    private int GUI_ANCHOR_MID_X;
    /**
     * Y-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_Y;
    private boolean hasNextPage;

    private GuiButtonPaintbrushMenu arrowUp;
    private GuiButtonPaintbrushMenu arrowDown;
    private GuiButtonPaintbrushMenu textureOne;
    private GuiButtonPaintbrushMenu textureTwo;
    private GuiButtonPaintbrushMenu textureThree;
    private GuiButtonPaintbrushMenu textureFour;
    private GuiButtonPaintbrushMenu textureFive;
    private GuiButtonPaintbrushMenu textureSix;
    private GuiButtonPaintbrushMenu textureSeven;
    private GuiButtonPaintbrushMenu textureEight;
    private GuiButtonPaintbrushOverlayController overlayControllerNone;
    private GuiButtonPaintbrushOverlayController overlayControllerDynamic;
    private GuiButtonPaintbrushOverlayController overlayControllerFixed;
    private GuiButtonPaintbrushMenu closeMenuButton;
    private GuiButtonPaintbrushMenu playPauseButton;
    private GuiButtonPaintbrushMenu lightControlButton;
    private GuiButtonPaintbrushMenu renderModelsButton;
    private GuiButtonPaintbrushCargoController loadCargoButton;
    private boolean renderModels;
    private boolean disableLighting = true;
    private int optionsOnCurrentPage;
    private final int totalOptions;
    private int currentPage = 0;
    private final ITrainRecord fakeTrain;
    private final AbstractTrains renderEntity;
    private boolean doAnimation;

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    public GuiPaintbrushMenu(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        this.editingPlayer = editingPlayer;
        this.rollingStock = rollingStock;
        fakeTrain = Traincraft.traincraftRegistry.getCurrentTrain(rollingStock.getCartItem().getItem());
        totalOptions = fakeTrain.getColors().length;
        for (int i = 0; i < totalOptions; i++) { // Set page to the page with the currently selected texture.
            if (fakeTrain.getColors()[i] == rollingStock.getColor()) {
                currentPage = i / RESULTS_PER_PAGE;
                break;
            }
        }
        renderEntity = Traincraft.traincraftRegistry.getEntity(fakeTrain.getEntityClass(), Minecraft.getMinecraft().theWorld);
        optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
        hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
        doAnimation = !ConfigHandler.DISABLE_PAINTBRUSH_GUI_ANIMATION;
        renderModels = !ConfigHandler.DISABLE_PAINTBRUSH_GUI_MODELS;
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        if (rollingStock.getCargoManager() == null) {
            GUI_ANCHOR_MID_X = (this.width) / 2;
        } else {
            GUI_ANCHOR_MID_X = (this.width) / 2 + 15;
        }
        GUI_ANCHOR_Y = (this.height) / 2 - ((MENU_TEXTURE_HEIGHT) / 2) - (38 / 2);
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - MENU_TEXTURE_WIDTH;
        this.buttonList.clear();
        this.buttonList.add(this.arrowUp = new GuiButtonPaintbrushMenu(0, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 37, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWUP));
        this.buttonList.add(this.arrowDown = new GuiButtonPaintbrushMenu(1, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 79, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWDOWN));
        this.buttonList.add(this.renderModelsButton = new GuiButtonPaintbrushMenu(2, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 53, 22, 22, GuiButtonPaintbrushMenu.Type.STOPRENDER));

        this.buttonList.add(this.textureOne = new GuiButtonPaintbrushMenu(3, GUI_ANCHOR_X + 10, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureTwo = new GuiButtonPaintbrushMenu(4, GUI_ANCHOR_X + 104, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureThree = new GuiButtonPaintbrushMenu(5, GUI_ANCHOR_X + 198, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureFour = new GuiButtonPaintbrushMenu(6, GUI_ANCHOR_X + 292, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureFive = new GuiButtonPaintbrushMenu(7, GUI_ANCHOR_X + 10, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureSix = new GuiButtonPaintbrushMenu(8, GUI_ANCHOR_X + 104, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureSeven = new GuiButtonPaintbrushMenu(9, GUI_ANCHOR_X + 198, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.textureEight = new GuiButtonPaintbrushMenu(10, GUI_ANCHOR_X + 292, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonPaintbrushMenu.Type.SELECTIONBOX));
        this.buttonList.add(this.overlayControllerNone = new GuiButtonPaintbrushOverlayController(11, GUI_ANCHOR_X + 121, GUI_ANCHOR_Y + 202, 29, 29, GuiButtonPaintbrushOverlayController.Type.NONE));
        this.buttonList.add(this.overlayControllerDynamic = new GuiButtonPaintbrushOverlayController(12, GUI_ANCHOR_X + 179, GUI_ANCHOR_Y + 202, 56, 29, GuiButtonPaintbrushOverlayController.Type.DYNAMIC));
        this.buttonList.add(this.overlayControllerFixed = new GuiButtonPaintbrushOverlayController(13, GUI_ANCHOR_X + 264, GUI_ANCHOR_Y + 202, 29, 29, GuiButtonPaintbrushOverlayController.Type.FIXED));
        this.buttonList.add(this.closeMenuButton = new GuiButtonPaintbrushMenu(14, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + 10, 22, 22, GuiButtonPaintbrushMenu.Type.CLOSE));
        this.buttonList.add(this.playPauseButton = new GuiButtonPaintbrushMenu(15, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonPaintbrushMenu.Type.PLAY));
        this.buttonList.add(this.lightControlButton = new GuiButtonPaintbrushMenu(16, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 77, 22, 22, GuiButtonPaintbrushMenu.Type.LIGHTSOFF));
        this.buttonList.add(this.loadCargoButton = new GuiButtonPaintbrushCargoController(17, GUI_ANCHOR_X - 27, (int) (GUI_ANCHOR_Y + ((MENU_TEXTURE_HEIGHT * 0.5) - (29 * 0.5))), 29, 29, GuiButtonPaintbrushCargoController.Type.LOAD));
        this.updateButtons();
    }

    private void updateButtons() {
        this.arrowUp.visible = (currentPage != 0);
        this.arrowUp.showButton = (currentPage != 0);
        this.arrowDown.visible = hasNextPage;
        this.arrowDown.showButton = hasNextPage;
        this.textureOne.showButton = true;
        this.textureOne.visible = true;
        this.textureTwo.showButton = optionsOnCurrentPage > 1;
        this.textureTwo.visible = optionsOnCurrentPage > 1;
        this.textureThree.showButton = optionsOnCurrentPage > 2;
        this.textureThree.visible = optionsOnCurrentPage > 2;
        this.textureFour.showButton = optionsOnCurrentPage > 3;
        this.textureFour.visible = optionsOnCurrentPage > 3;
        this.textureFive.showButton = optionsOnCurrentPage > 4;
        this.textureFive.visible = optionsOnCurrentPage > 4;
        this.textureSix.showButton = optionsOnCurrentPage > 5;
        this.textureSix.visible = optionsOnCurrentPage > 5;
        this.textureSeven.showButton = optionsOnCurrentPage > 6;
        this.textureSeven.visible = optionsOnCurrentPage > 6;
        this.textureEight.showButton = optionsOnCurrentPage > 7;
        this.textureEight.visible = optionsOnCurrentPage > 7;
        this.closeMenuButton.visible = true;
        this.closeMenuButton.showButton = true;
        this.playPauseButton.visible = renderModels;
        this.playPauseButton.showButton = renderModels;
        this.playPauseButton.setType(doAnimation ? GuiButtonPaintbrushMenu.Type.PLAY : GuiButtonPaintbrushMenu.Type.PAUSE, playPauseButton.getTexture());
        this.lightControlButton.showButton = renderModels;
        this.lightControlButton.visible = renderModels;
        this.lightControlButton.setType(disableLighting ? GuiButtonPaintbrushMenu.Type.LIGHTSON : GuiButtonPaintbrushMenu.Type.LIGHTSOFF, lightControlButton.getTexture());

        this.renderModelsButton.visible = true;
        this.renderModelsButton.showButton = true;
        this.renderModelsButton.setType(renderModels ? GuiButtonPaintbrushMenu.Type.STOPRENDER : GuiButtonPaintbrushMenu.Type.PLAY, renderModelsButton.getTexture());
        boolean acceptsCargo = rollingStock.getCargoManager() != null;
        this.loadCargoButton.visible = acceptsCargo;
        this.loadCargoButton.showButton = acceptsCargo;
        if (acceptsCargo) {
            this.loadCargoButton.setType(GuiButtonPaintbrushCargoController.Type.LOAD, GuiButtonPaintbrushCargoController.Texture.UNSELECTED);
        }

        // Overlay Texture Buttons
        if (rollingStock.acceptsOverlayTextures()) {
            this.overlayControllerNone.visible = rollingStock.acceptsOverlayTextures();
            this.overlayControllerNone.showButton = rollingStock.acceptsOverlayTextures();
            this.overlayControllerDynamic.visible = true;
            this.overlayControllerDynamic.showButton = true;
            this.overlayControllerFixed.visible = true;
            this.overlayControllerFixed.showButton = true;
            this.overlayControllerDynamic.setType(GuiButtonPaintbrushOverlayController.Type.DYNAMIC, GuiButtonPaintbrushOverlayController.Texture.UNAVAILABLE);
            this.overlayControllerFixed.setType(GuiButtonPaintbrushOverlayController.Type.FIXED, GuiButtonPaintbrushOverlayController.Texture.UNAVAILABLE);
            OverlayTextureManager.Type type = rollingStock.getOverlayTextureContainer().getType();
            OverlayTextureManager.Type validTypesForTexture = rollingStock.getOverlayTextureContainer().textureHasOverlayTypes(rollingStock.acceptedColors.indexOf(rollingStock.getColor()));
            if (type == OverlayTextureManager.Type.NONE)
                this.overlayControllerNone.setType(GuiButtonPaintbrushOverlayController.Type.NONE, GuiButtonPaintbrushOverlayController.Texture.SELECTED);
            else
                this.overlayControllerNone.setType(GuiButtonPaintbrushOverlayController.Type.NONE, GuiButtonPaintbrushOverlayController.Texture.UNSELECTED);
            if (validTypesForTexture == OverlayTextureManager.Type.DYNAMIC || validTypesForTexture == OverlayTextureManager.Type.BOTH) {
                if (type == OverlayTextureManager.Type.DYNAMIC)
                    this.overlayControllerDynamic.setType(GuiButtonPaintbrushOverlayController.Type.DYNAMIC, GuiButtonPaintbrushOverlayController.Texture.SELECTED);
                else {
                    this.overlayControllerDynamic.setType(GuiButtonPaintbrushOverlayController.Type.DYNAMIC, GuiButtonPaintbrushOverlayController.Texture.UNSELECTED);
                }
            }
            if (validTypesForTexture == OverlayTextureManager.Type.FIXED || validTypesForTexture == OverlayTextureManager.Type.BOTH) {
                if (type == OverlayTextureManager.Type.FIXED)
                    this.overlayControllerFixed.setType(GuiButtonPaintbrushOverlayController.Type.FIXED, GuiButtonPaintbrushOverlayController.Texture.SELECTED);
                else {
                    this.overlayControllerFixed.setType(GuiButtonPaintbrushOverlayController.Type.FIXED, GuiButtonPaintbrushOverlayController.Texture.UNSELECTED);
                }
            }
        } else {
            this.overlayControllerNone.visible = false;
            this.overlayControllerNone.showButton = false;
            this.overlayControllerDynamic.visible = false;
            this.overlayControllerDynamic.showButton = false;
            this.overlayControllerFixed.visible = false;
            this.overlayControllerFixed.showButton = false;
        }

    }

    ResourceLocation rightMenuTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_right.png");
    ResourceLocation leftMenuTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_left.png");
    ResourceLocation overlayBarTexture = new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_overlay_controller.png");
    @Override
    public void drawScreen(int mouseX, int mouseY, float par3) {
        RenderHelper.disableStandardItemLighting();
        // Draw background.
        mc.renderEngine.bindTexture(rightMenuTexture);
        this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        mc.renderEngine.bindTexture(leftMenuTexture);
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);

        // Draw overlay controller buttons if overlay is allowed at all and on this specific texture.
        if (rollingStock.acceptsOverlayTextures()) {
            mc.renderEngine.bindTexture(overlayBarTexture);
            this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 2, 0, 0, 206, 38);
            this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 2, 0, 38, 206, 38);
        }

        // Draw cargo controller bar if cargo controller is enabled...
        if (rollingStock.getCargoManager() != null) {
            mc.renderEngine.bindTexture(leftMenuTexture);
            this.drawTexturedModalRect(GUI_ANCHOR_X - 32, GUI_ANCHOR_Y, 0, 0, (int) (MENU_TEXTURE_WIDTH * 0.5), MENU_TEXTURE_HEIGHT);
        }

        int loopRenderColor;
        if (renderModels) {
            // Rolling stock pieces with more than one bogie need offset based on bogie position to render properly.
            float bogieOffset = (float) Math.abs(fakeTrain.getBogieLocoPosition()) * 0.5f;
            float offsetX = GUI_ANCHOR_X;
            float offsetY = GUI_ANCHOR_Y + 12;
            // Display the model with each texture.
            RenderRollingStock.setRenderModeGUI(true); // VERY IMPORTANT CALL! Forces renderer to render in full bright.
            RenderRollingStock.setRenderGUIFullBright(disableLighting);
            for (int i = 0; i < optionsOnCurrentPage; i++) {
                loopRenderColor = fakeTrain.getColors()[i + RESULTS_PER_PAGE * currentPage];
                renderEntity.setColor(loopRenderColor);
                // Set the button to active or inactive depending on whether the texture is active.
                ((GuiButtonPaintbrushMenu) this.buttonList.get(i + 3)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, (loopRenderColor == rollingStock.getColor()) ? GuiButtonPaintbrushMenu.Texture.ACTIVE : GuiButtonPaintbrushMenu.Texture.INACTIVE);
                GL11.glColor4f(1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glTranslated(offsetX + 50, offsetY + 50, 400);
                GL11.glScalef(-fakeTrain.getGuiRenderScale(), fakeTrain.getGuiRenderScale(), fakeTrain.getGuiRenderScale());
                GL11.glRotatef(180, 0, 0, 1);
                GL11.glRotatef(yaw, 0, 1, 0);
                RenderManager.instance.renderEntityWithPosYaw(renderEntity, bogieOffset, 0, 0, 0, 0);
                GL11.glPopMatrix();

                offsetX += 95;
                if (offsetX > GUI_ANCHOR_X + 292) {
                    offsetX = GUI_ANCHOR_X;
                    offsetY += 92;
                }
            }
            RenderRollingStock.setRenderModeGUI(false);

            // Handle rotation of entity(s) in GUI.
            if (doAnimation) {
                yaw += 0.5F;
                if (rollDown) {
                    roll -= 0.05F;
                    if (roll < -5) {
                        rollDown = false;
                        roll = -5;
                    }
                } else {
                    roll += 0.05F;
                    if (roll > 15) {
                        rollDown = true;
                        roll = 15;
                    }
                }
            }
        }

        super.drawScreen(mouseX, mouseY, par3);

        if (!renderModels) {
            float offsetX = GUI_ANCHOR_X + 13;
            float offsetY = GUI_ANCHOR_Y + 44;
            String colorName;
            final int fontColor = new Color(0, 0, 0).getRGB();
            for (int i = 0; i < optionsOnCurrentPage; i++) {
                loopRenderColor = i + RESULTS_PER_PAGE * currentPage;
                ((GuiButtonPaintbrushMenu) this.buttonList.get(i + 3)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, (fakeTrain.getColors()[i + RESULTS_PER_PAGE * currentPage] == rollingStock.getColor()) ? GuiButtonPaintbrushMenu.Texture.ACTIVE : GuiButtonPaintbrushMenu.Texture.INACTIVE);
                if (rollingStock.textureDescriptionMapContainsKey(loopRenderColor))
                    colorName = rollingStock.textureDescriptionGet(loopRenderColor);
                else
                    colorName = AbstractTrains.getColorAsString(fakeTrain.getColors()[loopRenderColor]);
                fontRendererObj.drawSplitString(colorName, (int) ((offsetX + 14) - (0.5 * fontRendererObj.splitStringWidth(colorName, 82))), (int) offsetY, 82, fontColor);

                offsetX += 94;
                if (offsetX > GUI_ANCHOR_X + 322) {
                    offsetX = GUI_ANCHOR_X + 13;
                    offsetY += 92;
                }

            }
        }

        // Draw Hovering Tooltips
        // I split this up to hopefully reduce the amount of statements it has to process.
        if (mouseX > closeMenuButton.xPosition - 5) { // If mouse is on the right-hand side after the textures.
            if (closeMenuButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Close Menu.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowUp.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE && arrowUp.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Previous Page.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowDown.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE && arrowDown.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Next Page.name")), mouseX, mouseY, fontRendererObj);
            else if (playPauseButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
                if (doAnimation)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Pause.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Play.name")), mouseX, mouseY, fontRendererObj);
            } else if (lightControlButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
                if (!disableLighting)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Lights On.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Lights Off.name")), mouseX, mouseY, fontRendererObj);
            } else if (renderModelsButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
                if (renderModels)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Hide Models.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Show Models.name")), mouseX, mouseY, fontRendererObj);
            }
        }  else if (mouseY > overlayControllerDynamic.yPosition) { // If mouse is somewhere on the overlay controller bar...
            if (overlayControllerNone.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.None.name")), mouseX, mouseY, fontRendererObj);
            else if (overlayControllerDynamic.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Dynamic Overlay.name")), mouseX, mouseY, fontRendererObj);
            else if (overlayControllerFixed.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Fixed Overlay.name")), mouseX, mouseY, fontRendererObj);
        } else if (mouseX < GUI_ANCHOR_X + 10) { // If mouse is somewhere on the cargo controller bar...
            if (loadCargoButton.getHoveringStatus())
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.Load Cargo.name")), mouseX, mouseY, fontRendererObj);
        } else { // If the mouse is anywhere else on the screen...
            if (renderModels) {
                // Draw texture descriptions if they exist...
                if (!rollingStock.isTextureDescriptionMapEmpty()) {
                    GuiButtonPaintbrushMenu loopButton;
                    for (int i = 0; i < optionsOnCurrentPage; i++) {
                        loopRenderColor = i + RESULTS_PER_PAGE * currentPage;
                        loopButton = ((GuiButtonPaintbrushMenu) buttonList.get(i + 3));
                        if (mouseX > loopButton.xPosition && mouseX < loopButton.xPosition + loopButton.width && mouseY > loopButton.yPosition && mouseY < loopButton.yPosition + loopButton.height)
                            if (rollingStock.textureDescriptionMapContainsKey(loopRenderColor))
                                drawHoveringText(Collections.singletonList(rollingStock.textureDescriptionGet(loopRenderColor)), mouseX, mouseY, fontRendererObj);
                    }
                }
            }
        }
        RenderHelper.enableStandardItemLighting();
    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            // Select Color
            switch (clickedButton.id) {
                case 0:
                case 1: // Page up or down button.
                    if (clickedButton.id == 0) { // If page up...
                        currentPage--;
                    } else { // If page down...
                        currentPage++;
                    }
                    optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
                    hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
                    updateButtons();
                    break;
                case 2:
                    renderModels = !renderModels;
                    updateButtons();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10: // Color selection button.
                    int newColor = fakeTrain.getColors()[(currentPage * RESULTS_PER_PAGE) + (clickedButton.id - 3)];
                    Traincraft.paintbrushColorChannel.sendToServer(new PacketPaintbrushColor(newColor, rollingStock.getEntityId()));
                    if (rollingStock.acceptsOverlayTextures())
                        rollingStock.getOverlayTextureContainer().setTypeAndMarkForUpdate(rollingStock.getOverlayTextureContainer().getType());
                    /* We must update the color locally in addition to sending the packet —
                    *  even though the packet, once received and redistributed by the server, will force an update,
                    * we need an update immediately for menu feedback. */
                    rollingStock.setColor(newColor);
                    // Check if the new texture can have an overlay. If not, remove it.
                    OverlayTextureManager.Type validTypesForTexture = rollingStock.getOverlayTextureContainer().textureHasOverlayTypes(rollingStock.acceptedColors.indexOf(rollingStock.getColor()));
                    if (validTypesForTexture != rollingStock.getOverlayTextureContainer().getType() & validTypesForTexture != OverlayTextureManager.Type.BOTH)
                        clearOverlay();
                    updateButtons();
                    break;
                case 11: // Clear overlay button.
                    clearOverlay();
                    updateButtons();
                    break;
                case 12: // Open dynamic overlay menu button.
                    if (rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.DYNAMIC || rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.BOTH) {
                        this.mc.thePlayer.closeScreen();
                        editingPlayer.openGui(Traincraft.instance, GuiIDs.DYNAMIC_OVERLAY, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
                    }
                    break;
                case 13: // Open fixed overlay menu button.
                    if (rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.FIXED || rollingStock.getOverlayTextureContainer().getAcceptedType() == OverlayTextureManager.Type.BOTH) {
                        this.mc.thePlayer.closeScreen();
                        editingPlayer.openGui(Traincraft.instance, GuiIDs.FIXED_OVERLAY, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
                    }
                    break;
                case 14:
                    this.mc.thePlayer.closeScreen();
                    break;
                case 15:
                    doAnimation = !doAnimation;
                    updateButtons();
                    break;
                case 16:
                    disableLighting = !disableLighting;
                    updateButtons();
                    break;
                case 17: // Load Cargo
                    this.mc.thePlayer.closeScreen();
                    editingPlayer.openGui(Traincraft.instance, GuiIDs.CARGO_MENU, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
                    break;
            }
        }
    }

    /**
     * @author 02skaplan
     */
    private void clearOverlay() {
        if (rollingStock.acceptsOverlayTextures() && rollingStock.getOverlayTextureContainer().getType() != OverlayTextureManager.Type.NONE) {
            rollingStock.getOverlayTextureContainer().setTypeAndMarkForUpdate(OverlayTextureManager.Type.NONE); // This is redundant because the packet will force this to update, but we need it for instant feedback in the menu.
            rollingStock.getOverlayTextureContainer().getOverlayConfigTag().setInteger("type", OverlayTextureManager.Type.NONE.ordinal());
            Traincraft.overlayTextureChannel.sendToServer(new PacketTextureOverlayConfig(OverlayTextureManager.Type.NONE, rollingStock.getEntityId(), Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId, rollingStock.getOverlayTextureContainer().getOverlayConfigTag()));
        }
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    protected void keyTyped(char eventChar, int eventKey) {
        if (eventKey == 1 || eventChar == 'e') { // If ESC...
            this.mc.thePlayer.closeScreen();
        } else {
            switch (eventChar) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8': {
                    if (Character.getNumericValue(eventChar) <= optionsOnCurrentPage) {
                        editingPlayer.playSound("random.click", 1f, 1f);
                        int newColor = fakeTrain.getColors()[(currentPage * RESULTS_PER_PAGE) + (Character.getNumericValue(eventChar) - 1)];
                        //rollingStock.setColor(newColor);
                        Traincraft.paintbrushColorChannel.sendToServer(new PacketPaintbrushColor(newColor, rollingStock.getEntityId()));
                    }
                }
            }
        }
    }

    @Override
    public void handleMouseInput() {
        int mouseEvent = Mouse.getEventDWheel();
        if (mouseEvent != 0) {
            if (mouseEvent > 0) { // Scroll up.
                if (currentPage != 0) {
                    currentPage--;
                }
            } else { // Scroll down.
                if (hasNextPage) {
                    currentPage++;
                }
            }
            optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
            hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
            updateButtons();
        }
        super.handleMouseInput();
    }

}