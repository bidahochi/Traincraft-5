package train.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketTextureOverlayConfig;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.overlaytexture.OTSpecification;
import train.common.overlaytexture.OTSpecificationDynamic;
import train.common.overlaytexture.OTSpecificationFixed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

/**
 * @author 02skaplan
 * <p>Overlay Menu</p>
 * <p>Shows a list of dynamic and fixed overlays for a specific texture of a piece of stock.</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiOverlayMenu extends GuiScreen {
    private final EntityPlayer editingPlayer;
    final protected int MENU_TEXTURE_WIDTH = 206;
    final protected int MENU_TEXTURE_HEIGHT = 200;
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
    private GuiButtonLockMenu closeButton;
    private GuiButtonPaintbrushMenu arrowUp;
    private GuiButtonPaintbrushMenu arrowDown;
    public final int MAX_OVERLAYS_ON_PAGE;
    private int currentPage;
    private int overlaysOnCurrentPage;
    private final EntityRollingStock rollingStock;
    private final int textureIndex;
    private final int NUMBER_OF_STATIC_BUTTONS = 3;

    private final ArrayList<OverlayGroup> overlayGroupsList = new ArrayList<>();

    private static class OverlayGroup {
        public OverlayGroup(OTSpecification overlay, String name) {
            this.name = name;
            putOverlayToGroup(overlay);
        }
        public void putOverlayToGroup(OTSpecification overlay) {
            if (overlay instanceof OTSpecificationDynamic)
                dynamicSpec = ((OTSpecificationDynamic) overlay);
            else if (overlay instanceof OTSpecificationFixed)
                fixedSpec = ((OTSpecificationFixed) overlay);
        }
        public boolean isActive() {
            return (this.dynamicSpec != null && this.dynamicSpec.isActive()) || (this.fixedSpec != null && this.fixedSpec.isActive());
        }
        public void setActive(boolean active) {
            if (this.dynamicSpec != null && this.dynamicSpec.isActive())
                this.dynamicSpec.setActive(active);
            if (this.fixedSpec != null && this.fixedSpec.isActive())
                this.fixedSpec.setActive(active);
        }
        public OTSpecificationDynamic dynamicSpec = null;
        public OTSpecificationFixed fixedSpec = null;
        final public String name;
    }

    /**
     * @author 02skaplan
     */
    public GuiOverlayMenu(EntityPlayer editingPlayer, EntityRollingStock rollingStock) {
        this.editingPlayer = editingPlayer;
        this.rollingStock = rollingStock;
        textureIndex = rollingStock.acceptedColors.indexOf(rollingStock.getColor());
        ArrayList<OTSpecification> overlays = rollingStock.getOverlayTextureContainer().getAcceptedOverlaysForTexture(textureIndex);
        MAX_OVERLAYS_ON_PAGE = 4;
        currentPage = 0;

        final TreeMap<String, OverlayGroup> overlayGroupsMap = new TreeMap<>();

        // Initialize overlay groups (group overlays with the same name together).
        for (OTSpecification overlaySpec : overlays) {
            if (!overlayGroupsMap.containsKey(overlaySpec.getOverlayName())) {
                OverlayGroup group = new OverlayGroup(overlaySpec, overlaySpec.getOverlayName());
                // Add the group to both the map and list. This allows us O(log n) lookup time by key and also efficient iteration.
                // Since we are just storing references, not much memory is wasted here.
                overlayGroupsMap.put(overlaySpec.getOverlayName(), group);
                overlayGroupsList.add(group);
            } else {
                overlayGroupsMap.get(overlaySpec.getOverlayName()).putOverlayToGroup(overlaySpec);
            }
        }
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        GUI_ANCHOR_MID_X = (this.width) / 2;
        GUI_ANCHOR_Y = (this.height) / 2 - (MENU_TEXTURE_HEIGHT / 2);
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - MENU_TEXTURE_WIDTH;
        this.buttonList.clear();
        this.buttonList.add(this.closeButton = new GuiButtonLockMenu(1, GUI_ANCHOR_MID_X + MENU_TEXTURE_WIDTH - 25, GUI_ANCHOR_Y + 5, 17, 17, GuiButtonLockMenu.Type.CLOSE));
        this.buttonList.add(this.arrowUp = new GuiButtonPaintbrushMenu(2, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 59, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWUP));
        this.buttonList.add(this.arrowDown = new GuiButtonPaintbrushMenu(3, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 103, 12, 38, GuiButtonPaintbrushMenu.Type.ARROWDOWN));

        // Add buttons for dynamic, fixed, and clear overlays.
        int buttonIndex = NUMBER_OF_STATIC_BUTTONS;
        for (int i = 0; i < MAX_OVERLAYS_ON_PAGE; i++) {
            int buttonYOffset = GUI_ANCHOR_Y + 35 + (10 + 29) * i;
            this.buttonList.add(new GuiButtonPaintbrushOverlayController(++buttonIndex, GUI_ANCHOR_X + 254, buttonYOffset, 29, 29, GuiButtonPaintbrushOverlayController.Type.NONE));
            this.buttonList.add(new GuiButtonPaintbrushOverlayController(++buttonIndex, GUI_ANCHOR_X + 290, buttonYOffset, 56, 29, GuiButtonPaintbrushOverlayController.Type.DYNAMIC));
            this.buttonList.add(new GuiButtonPaintbrushOverlayController(++buttonIndex, GUI_ANCHOR_X + 354, buttonYOffset, 29, 29, GuiButtonPaintbrushOverlayController.Type.FIXED));
        }
        this.updateButtons();
    }

    protected void updateButtons() {
        overlaysOnCurrentPage = Math.min(MAX_OVERLAYS_ON_PAGE, overlayGroupsList.size() - currentPage * MAX_OVERLAYS_ON_PAGE);
        this.closeButton.showButton = true;
        this.closeButton.visible = true;
        this.arrowUp.showButton = currentPage != 0;
        this.arrowUp.visible = this.arrowUp.showButton;
        this.arrowDown.showButton = overlayGroupsList.size() - (currentPage + 1) * MAX_OVERLAYS_ON_PAGE > 0;
        this.arrowDown.visible = this.arrowDown.showButton;
        // Set visibility for dynamic, fixed, and clear overlays.
        int buttonIndex = NUMBER_OF_STATIC_BUTTONS - 1;

        // For each possible entry on the current page…
        for (int i = 0; i < MAX_OVERLAYS_ON_PAGE; i++) {
            // Get the appropriate overlay group.
            OverlayGroup overlayGroup = null;
            int overlayGroupIndex = i + MAX_OVERLAYS_ON_PAGE * currentPage;
            if (overlayGroupIndex < overlayGroupsList.size()) {
                overlayGroup = overlayGroupsList.get(overlayGroupIndex);
            }

            // Set up its clear button.
            GuiButtonPaintbrushOverlayController button = ((GuiButtonPaintbrushOverlayController) this.buttonList.get(++buttonIndex));
            button.showButton = i < overlaysOnCurrentPage; //TODO this will not work
            button.visible = i < overlaysOnCurrentPage;
            if (overlayGroupIndex < overlayGroupsList.size()) {
                button.setType(GuiButtonPaintbrushOverlayController.Type.NONE, overlayGroup.isActive() ? GuiButtonPaintbrushOverlayController.Texture.UNSELECTED : GuiButtonPaintbrushOverlayController.Texture.SELECTED);
            }

            // Set up its dynamic overlay button.
            button = ((GuiButtonPaintbrushOverlayController) this.buttonList.get(++buttonIndex));
            button.showButton = i < overlaysOnCurrentPage;
            button.visible = i < overlaysOnCurrentPage;
            if (overlayGroupIndex < overlayGroupsList.size()) {
                GuiButtonPaintbrushOverlayController.Texture buttonTexture;
                if (overlayGroup.dynamicSpec != null) {
                    buttonTexture = overlayGroup.dynamicSpec.isActive() ? GuiButtonPaintbrushOverlayController.Texture.SELECTED : GuiButtonPaintbrushOverlayController.Texture.UNSELECTED;
                } else {
                    buttonTexture = GuiButtonPaintbrushOverlayController.Texture.UNAVAILABLE;
                    button.enabled = false;
                }
                button.setType(GuiButtonPaintbrushOverlayController.Type.DYNAMIC, buttonTexture);
            }

            // Set up its fixed overlay button.
            button = ((GuiButtonPaintbrushOverlayController) this.buttonList.get(++buttonIndex));
            button.showButton = i < overlaysOnCurrentPage;
            button.visible = i < overlaysOnCurrentPage;
            if (overlayGroupIndex < overlayGroupsList.size()) {
                GuiButtonPaintbrushOverlayController.Texture buttonTexture;
                if (overlayGroup.fixedSpec != null) {
                    buttonTexture = overlayGroup.fixedSpec.isActive() ? GuiButtonPaintbrushOverlayController.Texture.SELECTED : GuiButtonPaintbrushOverlayController.Texture.UNSELECTED;
                } else {
                    buttonTexture = GuiButtonPaintbrushOverlayController.Texture.UNAVAILABLE;
                    button.enabled = false;
                }
                button.setType(GuiButtonPaintbrushOverlayController.Type.FIXED, buttonTexture);
            }
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3) {
        GL11.glColor3f(1, 1, 1);
        // Draw background.
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_right.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_paintbrush_menu_left.png"));
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        super.drawScreen(mouseX, mouseY, par3);
        String titleText = StatCollector.translateToLocal("overlaymenu.Overlays.name");
        fontRendererObj.drawString(titleText, GUI_ANCHOR_MID_X - (fontRendererObj.getStringWidth(titleText) / 2), GUI_ANCHOR_Y + 12, -16777216);

        OverlayGroup overlayGroup;
        for (int i = 0; i < overlaysOnCurrentPage; i++) {
            int yOffset = GUI_ANCHOR_Y + 35 + (10 + 29) * i;
            overlayGroup = overlayGroupsList.get(i + currentPage * MAX_OVERLAYS_ON_PAGE);
            // Draw text box for each overlay.
            GL11.glColor3f(1, 1, 1);
            mc.renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.guiPrefix + "gui_overlaymenu.png"));
            this.drawTexturedModalRect(GUI_ANCHOR_X + 10, yOffset, 0, 0, 239, 29);
            fontRendererObj.drawString(overlayGroup.name, ((239 / 2) - (fontRendererObj.getStringWidth(overlayGroup.name) / 2) + (GUI_ANCHOR_X + 10)), yOffset + 9, -16777216);
        }

        // Draw tooltip text.
        if (closeButton.getTexture() == GuiButtonLockMenu.Texture.ACTIVE)
            drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("lockmenu.Save and Close.name")), mouseX, mouseY, fontRendererObj);
    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            switch (clickedButton.id) {
                case 1: // Close
                    this.mc.thePlayer.closeScreen();
                    break;
                case 2: // Up Arrow
                    if (this.arrowUp.visible) {
                        currentPage--;
                        updateButtons();
                    }
                    break;
                case 3: // Down Arrow
                    if (this.arrowDown.visible) {
                        currentPage++;
                        updateButtons();
                    }
                    break;
                default:
                    int overlayGroupNum = ((clickedButton.id - (NUMBER_OF_STATIC_BUTTONS + 1)) / 3) + (currentPage * MAX_OVERLAYS_ON_PAGE);
                    OverlayGroup overlayGroup = overlayGroupsList.get(overlayGroupNum);
                    switch ((clickedButton.id - NUMBER_OF_STATIC_BUTTONS) % 3) {
                        case 1:  // Clear button for overlayGroupNum…
                            if (overlayGroup.isActive()) {
                                overlayGroup.setActive(false);
                                Traincraft.overlayTextureChannel.sendToServer(new PacketTextureOverlayConfig(rollingStock.getEntityId(), Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId, rollingStock.getOverlayTextureContainer().getOverlayConfigTag()));
                                updateButtons();
                            }
                            break;
                        case 2: // Dynamic button for overlayGroupNum…
                            if (overlayGroup.fixedSpec != null && overlayGroup.fixedSpec.isActive())
                                overlayGroup.fixedSpec.setActive(false);
                            editingPlayer.openGui(Traincraft.instance, GuiIDs.DYNAMIC_OVERLAY, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, rollingStock.getOverlayTextureContainer().getAllOverlays().indexOf(overlayGroup.dynamicSpec));
                            break;
                        case 0: // Appliqué button for overlayGroupNum…
                            if (overlayGroup.dynamicSpec != null && overlayGroup.dynamicSpec.isActive())
                                overlayGroup.dynamicSpec.setActive(false);
                            editingPlayer.openGui(Traincraft.instance, GuiIDs.FIXED_OVERLAY, editingPlayer.getEntityWorld(), rollingStock.getEntityId(), -1, rollingStock.getOverlayTextureContainer().getAllOverlays().indexOf(overlayGroup.fixedSpec));
                            break;
                    }
            }
        }
    }
    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    public void mouseClicked(int x, int y, int par3) {
        super.mouseClicked(x, y, par3);
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
                if (arrowDown.visible) {
                    currentPage++;
                }
            }
            updateButtons();
        }
        super.handleMouseInput();
    }

    @Override
    protected void keyTyped(char eventChar, int eventKey) {
        if (eventKey == 1) { // If ESC...
            this.mc.thePlayer.closeScreen();
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

}