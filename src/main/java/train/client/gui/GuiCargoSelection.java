package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketCargoSelection;
import train.common.library.GuiIDs;
import train.common.library.register.ITrainRecord;

import java.awt.*;
import java.util.Collections;

/**
 * @author 02skaplan
 * <p>GUI for Cargo Selection</p>
 * <p>Allows players to select different models & textures for cargo in freight cars.</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiCargoSelection extends GuiAbstractPaintbrush
{
    private final RollingStockGuiPreview modelPreview =
            new RollingStockGuiPreview(0, 400, RollingStockGuiPreview.CargoSizing.FULL_LOAD);
    private final Rectangle previewBounds = new Rectangle();
    private float yaw = 0;
    private final ITrainRecord fakeTrain;
    private final AbstractTrains[] renderEntities = new AbstractTrains[RESULTS_PER_PAGE];
    private GuiButtonPaintbrushMenu playPauseButton;
    private GuiButtonPaintbrushMenu lightControlButton;
    private GuiButtonPaintbrushMenu renderModelsButton;
    private boolean renderModels = !ConfigHandler.DISABLE_PAINTBRUSH_GUI_MODELS;
    private boolean disableLighting = true;
    private boolean doRotation = !ConfigHandler.DISABLE_PAINTBRUSH_GUI_ANIMATION;
    /**
     * Used to vary the amount of cargo stored in a display entity to give illusion of loading animation.
     */
    private int renderIteration = 0;

    /**
     * @author 02skaplan
     */
    public GuiCargoSelection(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        super(editingPlayer, rollingStock);
        fakeTrain = Traincraft.traincraftRegistry.getCurrentTrain(rollingStock.getCartItem().getItem());
        for (int i = 0; i < RESULTS_PER_PAGE; i++)
            renderEntities[i] = Traincraft.traincraftRegistry.getEntity(fakeTrain.getEntityClass(), Minecraft.getMinecraft().theWorld);
        /* Need to re-run these even after calling super because cargo uses selectedOption for current page
         and super() uses selectedOption - 1. */
        currentPage = getSelectedCargoOptionIndex() / RESULTS_PER_PAGE;
        hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
        optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
    }

    @Override
    protected void updateButtons() {
        super.updateButtons();
        this.playPauseButton.showButton = renderModels;
        this.playPauseButton.visible = renderModels;
        this.playPauseButton.setType(doRotation ? GuiButtonPaintbrushMenu.Type.PLAY : GuiButtonPaintbrushMenu.Type.PAUSE, playPauseButton.getTexture());
        this.lightControlButton.showButton = renderModels;
        this.lightControlButton.visible = renderModels;
        this.lightControlButton.setType(disableLighting ? GuiButtonPaintbrushMenu.Type.LIGHTSON : GuiButtonPaintbrushMenu.Type.LIGHTSOFF, lightControlButton.getTexture());
        this.renderModelsButton.visible = true;
        this.renderModelsButton.showButton = true;
        this.renderModelsButton.setType(renderModels ? GuiButtonPaintbrushMenu.Type.STOPRENDER : GuiButtonPaintbrushMenu.Type.PLAY, renderModelsButton.getTexture());
        int selectedCargoOptionIndex = getSelectedCargoOptionIndex();
        if (currentPage == (selectedCargoOptionIndex / RESULTS_PER_PAGE)) { // If overlay is on current page, set the selected overlay to active and the rest to inactive.
            int numberOfActiveOverlayInGUI = selectedCargoOptionIndex % RESULTS_PER_PAGE; // Which button corresponds to the active overlay...
            for (int i = 3; i < 11; i++) {
                if (buttonList.get(i) instanceof GuiButtonPaintbrushMenu) {
                    if (i - 3 == numberOfActiveOverlayInGUI) {
                        ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.ACTIVE);
                    } else {
                        ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.INACTIVE);
                    }
                }
            }
        } else { // If selected overlay is not on current page, set all buttons to inactive.
            for (int i = 3; i < 11; i++) {
                if (buttonList.get(i) instanceof GuiButtonPaintbrushMenu) {
                    ((GuiButtonPaintbrushMenu) buttonList.get(i)).setType(GuiButtonPaintbrushMenu.Type.SELECTIONBOX, GuiButtonPaintbrushMenu.Texture.INACTIVE);
                }
            }
        }
        for (int i = 0; i < optionsOnCurrentPage; i++) { // Update render entities.
            renderEntities[i].setColor(rollingStock.getColor());
            renderEntities[i].getCargoManager().setSelectedCargo(getCargoSelectionForOptionIndex(i + RESULTS_PER_PAGE * currentPage));
        }
    }

    /**
     * Draws auto-fitted cargo choices in their selection cells, preserving lower framing and light controls.
     * Freight fill animation changes only the temporary preview entities; fitting reserves their full loads.
     */
    @Override
    public void drawInBackground()
    {
        if (renderModels == false)
        {
            return;
        }
        renderIteration++;
        final int framesPerCargoStep = 10;
        if (renderIteration == framesPerCargoStep)
        {
            renderIteration = 0;
            if (renderEntities[0] instanceof Freight)
            {
                for (AbstractTrains renderEntity : renderEntities)
                {
                    Freight freight = (Freight) renderEntity;
                    int nextCargoAmount = freight.getAmmountOfCargo() + 1;
                    if (freight.getAmmountOfCargo() == freight.getSizeInventory() - 1)
                    {
                        nextCargoAmount = 1;
                    }
                    freight.getDataWatcher().updateObject(
                            Freight.CARGO_AMOUNT_DATA_WATCHER_INDEX, nextCargoAmount);
                }
            }
        }
        final int previewColumns = 4;
        final float legacyOriginOffsetPixels = 50.0F;
        for (int index = 0; index < optionsOnCurrentPage; index++)
        {
            GuiButtonPaintbrushMenu selectionButton = (GuiButtonPaintbrushMenu) buttonList.get(index + 3);
            previewBounds.setBounds(selectionButton.xPosition, selectionButton.yPosition,
                    selectionButton.width, selectionButton.height);
            int previewRow = index / previewColumns;
            float preferredCenterGuiY = selectionButton.yPosition + legacyOriginOffsetPixels + previewRow;
            modelPreview.render(renderEntities[index], fakeTrain, previewBounds,
                    yaw, 0, preferredCenterGuiY, disableLighting);
        }
        if (doRotation)
        {
            yaw += 0.5F;
        }
    }

    /** Releases the cargo menu's target and cached fits before the parent GUI closes. */
    @Override
    public void onGuiClosed()
    {
        modelPreview.close();
        super.onGuiClosed();
    }

    @Override
    public void drawInForeground(int mouseX, int mouseY) {
        // Render texture names in lieu of models...
        if (!renderModels) {
            float offsetX = GUI_ANCHOR_X + 13;
            float offsetY = GUI_ANCHOR_Y + 44;
            final int fontColor = new Color(0, 0, 0).getRGB();
            String optionName;
            for (int i = 0; i < optionsOnCurrentPage; i++) {
                int cargoNumber = getCargoSelectionForOptionIndex(i + RESULTS_PER_PAGE * currentPage);
                if (cargoNumber == 0) {
                    optionName = StatCollector.translateToLocal("paintbrushmenu.No Cargo.name");

                } else {
                    optionName = rollingStock.getCargoManager().getCargoSpecificationList()[cargoNumber - 1][0].textureName;
                }
                fontRendererObj.drawSplitString(optionName, (int) ((offsetX + 14) - (0.5 * fontRendererObj.splitStringWidth(optionName, 82))), (int) offsetY, 82, fontColor);
                offsetX += 94;
                if (offsetX > GUI_ANCHOR_X + 322) {
                    offsetX = GUI_ANCHOR_X + 13;
                    offsetY += 92;
                }
            }
        }

        // Draw button tooltips.
        GuiButtonPaintbrushMenu loopButton;
        for (int i = 0; i < optionsOnCurrentPage; i++) {
            loopButton = ((GuiButtonPaintbrushMenu) buttonList.get(i + 3));
            if (mouseX > loopButton.xPosition && mouseX < loopButton.xPosition + loopButton.width && mouseY > loopButton.yPosition && mouseY < loopButton.yPosition + loopButton.height)
                if (getCargoSelectionForOptionIndex(i + RESULTS_PER_PAGE * currentPage) == 0) {
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("paintbrushmenu.No Cargo.name")), mouseX, mouseY, fontRendererObj);
                } else {
                    int cargoNumber = getCargoSelectionForOptionIndex(i + RESULTS_PER_PAGE * currentPage);
                    drawHoveringText(Collections.singletonList(rollingStock.getCargoManager().getCargoSpecificationList()[cargoNumber - 1][0].textureName), mouseX, mouseY, fontRendererObj);
                }
        }
        if (playPauseButton.getTexture() == GuiButtonPaintbrushMenu.Texture.ACTIVE) {
            if (doRotation)
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
    }

    @Override
    public void selectAndSendUpdatePacket(int choice) {
        int cargoNumber = getCargoSelectionForOptionIndex((currentPage * RESULTS_PER_PAGE) + (choice - 3));
        // Send an update packet to the server of cargo change.
        // We don't actually change the texture on the client yet; we let the server know we changed it.
        // After the server recognizes that we changed it, it will send an update packet out to all clients.
        rollingStock.getCargoManager().setSelectedCargo(cargoNumber);
        Traincraft.cargoSelectionChannel.sendToServer(new PacketCargoSelection(cargoNumber, rollingStock.getEntityId(), rollingStock.dimension));
    }

    @Override
    public void closeButtonAction() {
        editingPlayer.openGui(Traincraft.instance, GuiIDs.PAINTBRUSH, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, (int) editingPlayer.posZ);
    }

    @Override
    public int getTotalOptions() {
        int unselectedOption = rollingStock.getCargoManager().isUnselectedSlotEnabled() ? 1 : 0;
        return rollingStock.getCargoManager().getCargoSpecificationList().length + unselectedOption;
    }

    @Override
    public int getSelectedOption() {
        return getSelectedCargoOptionIndex();
    }

    private int getSelectedCargoOptionIndex() {
        int selectedCargo = rollingStock.getCargoManager().getSelectedCargo();
        return rollingStock.getCargoManager().isUnselectedSlotEnabled() ? selectedCargo : Math.max(0, selectedCargo - 1);
    }

    private int getCargoSelectionForOptionIndex(int optionIndex) {
        return rollingStock.getCargoManager().isUnselectedSlotEnabled() ? optionIndex : optionIndex + 1;
    }

    @Override
    public void addExtraButtons() {
        // Overwrite the arrows in the abstract menu with arrows higher up on the screen.
        this.buttonList.set(0, this.arrowUp = new GuiButtonPaintbrushMenu(0, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 37, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWUP));
        this.buttonList.set(1, this.arrowDown = new GuiButtonPaintbrushMenu(1, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 79, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWDOWN));
        this.buttonList.add(this.playPauseButton = new GuiButtonPaintbrushMenu(12, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonPaintbrushMenu.Type.PLAY));
        this.buttonList.add(this.lightControlButton = new GuiButtonPaintbrushMenu(13, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 77, 22, 22, GuiButtonPaintbrushMenu.Type.LIGHTSOFF));
        this.buttonList.add(this.renderModelsButton = new GuiButtonPaintbrushMenu(14, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 53, 22, 22, GuiButtonPaintbrushMenu.Type.STOPRENDER));
    }

    @Override
    public void handleExtraButtons(int buttonID) {
        switch (buttonID) {
            case 12:
                doRotation = !doRotation;
                updateButtons();
                break;
            case 13:
                disableLighting = !disableLighting;
                updateButtons();
                break;
            case 14:
                renderModels = !renderModels;
                updateButtons();
                break;
        }
    }
}
