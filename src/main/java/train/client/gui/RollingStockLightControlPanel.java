package train.client.gui;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import train.client.render.lighting.ClientRollingStockLighting;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightControls;
import train.common.api.RollingStockHeadlightLevel;
import train.common.api.RollingStockLightChannel;
import train.common.core.network.PacketRollingStockLightState;
import train.common.library.Info;

/**
 * Reusable diesel-style lighting section embedded in compatible rolling-stock GUIs.
 *
 * <p>The authored 147x70 image is a compact sprite sheet rather than Minecraft's conventional
 * 256x256 GUI atlas. Its first 29 rows contain the panel, while lower rows contain movable dial
 * and toggle handles. This class therefore emits normalized texture coordinates from the real
 * dimensions and owns invisible hit regions matching the original diesel controls.
 */
final class RollingStockLightControlPanel extends Gui
{
    static final int WIDTH = 147;
    static final int HEIGHT = 29;
    /** Top of the embedded section relative to the host inventory GUI. */
    static final int GUI_Y = 160;
    /** Host GUI height that leaves room for both its inventory and this section. */
    static final int EXPANDED_GUI_HEIGHT = 199;
    /** Downward centering adjustment that keeps the note field clear of the top edge. */
    static final int GUI_VERTICAL_OFFSET = 6;

    private static final ResourceLocation CONTROLS = new ResourceLocation(
        Info.resourceLocation, Info.guiPrefix + "generic_light_controls.png");
    private static final int TEXTURE_HEIGHT = 70;
    private static final int FRONT_OFF = 13;
    private static final int FRONT_DIM = 14;
    private static final int FRONT_BRIGHT = 15;
    private static final int REAR_OFF = 16;
    private static final int REAR_DIM = 17;
    private static final int REAR_BRIGHT = 18;
    private static final int AUX_BUTTON = 11;
    private static final int BEACON_BUTTON = 7;
    private static final int GYRA_BUTTON = 12;
    private static final int DITCH_BUTTON = 8;
    private static final int CAPABILITY_REFRESH_TICKS = 10;

    // Hit rectangles match the switches painted into generic_light_controls.png.
    private static final int HEADLIGHT_BUTTON_Y = 4;
    private static final int HEADLIGHT_BUTTON_HEIGHT = 25;
    private static final int STANDARD_HEADLIGHT_BUTTON_WIDTH = 12;
    private static final int HEADLIGHT_DIM_WIDTH = 15;
    private static final int FRONT_OFF_X = 8;
    private static final int FRONT_DIM_X = 20;
    private static final int FRONT_BRIGHT_X = 35;
    private static final int REAR_OFF_X = 47;
    private static final int REAR_DIM_X = 59;
    private static final int REAR_BRIGHT_X = 74;
    private static final int CIRCUIT_BUTTON_Y = 8;
    private static final int CIRCUIT_BUTTON_WIDTH = 12;
    private static final int CIRCUIT_BUTTON_HEIGHT = 22;
    private static final int AUX_BUTTON_X = 86;
    private static final int BEACON_BUTTON_X = 102;
    private static final int GYRA_BUTTON_X = 118;
    private static final int DITCH_BUTTON_X = 134;

    // Atlas regions and handle anchors use the texture's authored pixel coordinates.
    private static final int HEADLIGHT_PANEL_WIDTH = 85;
    private static final int AUX_PANEL_X = 85;
    private static final int BEACON_PANEL_X = 101;
    private static final int GYRA_PANEL_X = 117;
    private static final int DITCH_PANEL_X = 133;
    private static final int STANDARD_CIRCUIT_PANEL_WIDTH = 16;
    private static final int DITCH_PANEL_WIDTH = 14;
    private static final int FRONT_DIAL_X = 21;
    private static final int REAR_DIAL_X = 60;
    private static final int DIAL_Y = 12;
    private static final int AUX_HANDLE_X = 89;
    private static final int BEACON_HANDLE_X = 105;
    private static final int GYRA_HANDLE_X = 121;
    private static final int DITCH_HANDLE_X = 137;
    private static final int ENABLED_HANDLE_Y = 14;
    private static final int DISABLED_HANDLE_Y = 20;
    private static final int HANDLE_TEXTURE_X = 10;
    private static final int HANDLE_TEXTURE_Y = 63;
    private static final int HANDLE_WIDTH = 6;
    private static final int HANDLE_HEIGHT = 7;
    private static final int DIAL_TEXTURE_X = 0;
    private static final int DIAL_TEXTURE_Y = 50;
    private static final int DIAL_WIDTH = 8;
    private static final int DIAL_HEIGHT = 20;
    private static final float DIAL_PIVOT_X = 4.0F;
    private static final float DIAL_PIVOT_Y = 10.0F;
    private static final float DIAL_TURN_DEGREES = 90.0F;

    private final EntityRollingStock stock;
    private final IRollingStockLightControls lightControls;
    private final List<GuiButton> panelButtons = new ArrayList<GuiButton>();
    /** Minecraft 1.7 exposes GuiScreen.buttonList as a raw list. */
    @SuppressWarnings("rawtypes")
    private List hostButtons;
    private EnumSet<RollingStockLightChannel> circuits;
    private int panelLeft;
    private int panelTop;
    private int ticksSinceCapabilityRefresh;

    /** Creates a panel bound to one stock entity's mutable synchronized light controls. */
    private RollingStockLightControlPanel(
        EntityRollingStock stock, IRollingStockLightControls lightControls)
    {
        this.stock = stock;
        this.lightControls = lightControls;
    }

    /**
     * Creates a control section only for stock that owns independently adjustable light state.
     *
     * <p>Read-only light-state providers, including tenders, do not implement the mutable controls
     * interface and therefore retain their existing GUI without a second set of switches.
     */
    static RollingStockLightControlPanel create(Entity entity)
    {
        return entity instanceof EntityRollingStock
            && entity instanceof IRollingStockLightControls
            ? new RollingStockLightControlPanel(
                (EntityRollingStock) entity, (IRollingStockLightControls) entity)
            : null;
    }

    /** Attaches the section to a host GUI after that GUI has calculated its screen origin. */
    @SuppressWarnings("rawtypes")
    void init(List buttons, int panelLeft, int panelTop)
    {
        this.hostButtons = buttons;
        this.panelLeft = panelLeft;
        this.panelTop = panelTop;
        rebuildButtons();
    }

    /** Replaces only this panel's hit regions when late model metadata changes capabilities. */
    @SuppressWarnings("unchecked")
    /** Rebuilds this panel's invisible hit regions from the currently available circuits. */
    private void rebuildButtons()
    {
        if (hostButtons == null)
        {
            return;
        }
        hostButtons.removeAll(panelButtons);
        panelButtons.clear();
        circuits = ClientRollingStockLighting.availableControlCircuits(stock);

        addButton(
            FRONT_OFF,
            panelLeft + FRONT_OFF_X,
            panelTop + HEADLIGHT_BUTTON_Y,
            STANDARD_HEADLIGHT_BUTTON_WIDTH,
            HEADLIGHT_BUTTON_HEIGHT,
            "Front lights: Off");
        addButton(
            FRONT_DIM,
            panelLeft + FRONT_DIM_X,
            panelTop + HEADLIGHT_BUTTON_Y,
            HEADLIGHT_DIM_WIDTH,
            HEADLIGHT_BUTTON_HEIGHT,
            "Front lights: Dim");
        addButton(
            FRONT_BRIGHT,
            panelLeft + FRONT_BRIGHT_X,
            panelTop + HEADLIGHT_BUTTON_Y,
            STANDARD_HEADLIGHT_BUTTON_WIDTH,
            HEADLIGHT_BUTTON_HEIGHT,
            "Front lights: Bright");
        addButton(
            REAR_OFF,
            panelLeft + REAR_OFF_X,
            panelTop + HEADLIGHT_BUTTON_Y,
            STANDARD_HEADLIGHT_BUTTON_WIDTH,
            HEADLIGHT_BUTTON_HEIGHT,
            "Rear lights: Off");
        addButton(
            REAR_DIM,
            panelLeft + REAR_DIM_X,
            panelTop + HEADLIGHT_BUTTON_Y,
            HEADLIGHT_DIM_WIDTH,
            HEADLIGHT_BUTTON_HEIGHT,
            "Rear lights: Dim");
        addButton(
            REAR_BRIGHT,
            panelLeft + REAR_BRIGHT_X,
            panelTop + HEADLIGHT_BUTTON_Y,
            STANDARD_HEADLIGHT_BUTTON_WIDTH,
            HEADLIGHT_BUTTON_HEIGHT,
            "Rear lights: Bright");
        addCircuitButton(
            RollingStockLightChannel.AUX, AUX_BUTTON, panelLeft + AUX_BUTTON_X, "Aux lights");
        addCircuitButton(
            RollingStockLightChannel.BEACON,
            BEACON_BUTTON,
            panelLeft + BEACON_BUTTON_X,
            "Beacon");
        addCircuitButton(
            RollingStockLightChannel.GYRA,
            GYRA_BUTTON,
            panelLeft + GYRA_BUTTON_X,
            "Gyralite");
        addCircuitButton(
            RollingStockLightChannel.DITCH,
            DITCH_BUTTON,
            panelLeft + DITCH_BUTTON_X,
            "Ditch lights");
        hostButtons.addAll(panelButtons);
    }

    /** Registers one transparent hit region with the host GUI and panel-owned button list. */
    private void addButton(int id, int x, int y, int width, int height, String description)
    {
        panelButtons.add(new PanelHitButton(id, x, y, width, height, description));
    }

    /** Adds a binary circuit hit region only when resolved metadata exposes that circuit. */
    private void addCircuitButton(
        RollingStockLightChannel channel, int id, int x, String description)
    {
        if (circuits.contains(channel))
        {
            addButton(
                id,
                x,
                panelTop + CIRCUIT_BUTTON_Y,
                CIRCUIT_BUTTON_WIDTH,
                CIRCUIT_BUTTON_HEIGHT,
                description);
        }
    }

    /** Refreshes optional circuit capabilities twice per second while the GUI remains open. */
    void update()
    {
        ticksSinceCapabilityRefresh++;
        if (ticksSinceCapabilityRefresh % CAPABILITY_REFRESH_TICKS == 0)
        {
            EnumSet<RollingStockLightChannel> resolved =
                ClientRollingStockLighting.availableControlCircuits(stock);
            if (resolved.equals(circuits) == false)
            {
                rebuildButtons();
            }
        }
    }

    /**
     * Handles a host GUI button event when it belongs to this section.
     *
     * @return {@code true} when the event was consumed
     */
    boolean actionPerformed(GuiButton button)
    {
        if (panelButtons.contains(button) == false)
        {
            return false;
        }
        if (button.id >= FRONT_OFF && button.id <= FRONT_BRIGHT)
        {
            send(PacketRollingStockLightState.FRONT, (byte) (button.id - FRONT_OFF));
            return true;
        }
        if (button.id >= REAR_OFF && button.id <= REAR_BRIGHT)
        {
            send(PacketRollingStockLightState.REAR, (byte) (button.id - REAR_OFF));
            return true;
        }
        RollingStockLightChannel channel = channelFor(button.id);
        send(
            controlFor(channel),
            (byte) (lightControls.isLightChannelEnabled(channel) ? 0 : 1));
        return true;
    }

    /** Sends one light-control change through the shared validated rolling-stock packet. */
    private void send(byte control, byte value)
    {
        Traincraft.rollingStockLightsChannel.sendToServer(
            new PacketRollingStockLightState(stock.getEntityId(), control, value));
    }

    /** Draws the authored panel pieces and movable handles for the current synchronized state. */
    void draw(Minecraft minecraft, float zLevel)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        minecraft.renderEngine.bindTexture(CONTROLS);

        // Front/rear artwork is always available. Optional segments and their hit regions are
        // omitted until resolved model/profile metadata confirms that circuit exists.
        drawTextureRegion(panelLeft, panelTop, 0, 0, HEADLIGHT_PANEL_WIDTH, HEIGHT, zLevel);
        drawCircuitPanel(
            RollingStockLightChannel.AUX,
            AUX_PANEL_X,
            STANDARD_CIRCUIT_PANEL_WIDTH,
            zLevel);
        drawCircuitPanel(
            RollingStockLightChannel.BEACON,
            BEACON_PANEL_X,
            STANDARD_CIRCUIT_PANEL_WIDTH,
            zLevel);
        drawCircuitPanel(
            RollingStockLightChannel.GYRA,
            GYRA_PANEL_X,
            STANDARD_CIRCUIT_PANEL_WIDTH,
            zLevel);
        drawCircuitPanel(
            RollingStockLightChannel.DITCH, DITCH_PANEL_X, DITCH_PANEL_WIDTH, zLevel);
        drawDialLever(
            panelLeft + FRONT_DIAL_X,
            panelTop + DIAL_Y
                + (lightControls.getFrontHeadlightLevel()
                   == RollingStockHeadlightLevel.OFF ? 1 : 0),
            dialAngle(lightControls.getFrontHeadlightLevel()), zLevel);
        drawDialLever(
            panelLeft + REAR_DIAL_X,
            panelTop + DIAL_Y
                + (lightControls.getRearHeadlightLevel()
                   == RollingStockHeadlightLevel.OFF ? 1 : 0),
            dialAngle(lightControls.getRearHeadlightLevel()), zLevel);
        drawCircuitHandle(RollingStockLightChannel.AUX, panelLeft + AUX_HANDLE_X, zLevel);
        drawCircuitHandle(
            RollingStockLightChannel.BEACON, panelLeft + BEACON_HANDLE_X, zLevel);
        drawCircuitHandle(RollingStockLightChannel.GYRA, panelLeft + GYRA_HANDLE_X, zLevel);
        drawCircuitHandle(
            RollingStockLightChannel.DITCH, panelLeft + DITCH_HANDLE_X, zLevel);
        GL11.glDisable(GL11.GL_BLEND);
    }

    /** Draws one optional circuit segment when its capability is available. */
    private void drawCircuitPanel(
        RollingStockLightChannel channel, int sourceX, int width, float zLevel)
    {
        if (circuits.contains(channel))
        {
            drawTextureRegion(
                panelLeft + sourceX, panelTop, sourceX, 0, width, HEIGHT, zLevel);
        }
    }

    /** Draws the movable handle for one binary circuit switch. */
    private void drawCircuitHandle(
        RollingStockLightChannel channel, int x, float zLevel)
    {
        if (circuits.contains(channel))
        {
            drawTextureRegion(
                x,
                panelTop
                + (lightControls.isLightChannelEnabled(channel)
                   ? ENABLED_HANDLE_Y
                   : DISABLED_HANDLE_Y),
                HANDLE_TEXTURE_X,
                HANDLE_TEXTURE_Y,
                HANDLE_WIDTH,
                HANDLE_HEIGHT,
                zLevel);
        }
    }

    /** Maps an OFF, DIM, or BRIGHT headlight level to the authored selector angle. */
    private static float dialAngle(RollingStockHeadlightLevel level)
    {
        return level == RollingStockHeadlightLevel.OFF
             ? -DIAL_TURN_DEGREES
             : level == RollingStockHeadlightLevel.DIM ? 0.0F : DIAL_TURN_DEGREES;
    }

    /** Draws one headlight selector lever around its authored pivot. */
    private void drawDialLever(int x, int y, float angle, float zLevel)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef(x + DIAL_PIVOT_X, y + DIAL_PIVOT_Y, 0.0F);
        GL11.glRotatef(angle, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(-(x + DIAL_PIVOT_X), -(y + DIAL_PIVOT_Y), 0.0F);
        drawTextureRegion(
            x, y, DIAL_TEXTURE_X, DIAL_TEXTURE_Y, DIAL_WIDTH, DIAL_HEIGHT, zLevel);
        GL11.glPopMatrix();
    }

    /**
     * Draws a region from the texture's true 147x70 dimensions.
     *
     * <p>{@link Gui#drawTexturedModalRect} assumes a 256x256 atlas and would sample the wrong pixels,
     * so this method emits normalized coordinates directly.
     */
    private static void drawTextureRegion(
        int x, int y, int u, int v, int width, int height, float zLevel)
    {
        float inverseWidth = 1.0F / WIDTH;
        float inverseHeight = 1.0F / TEXTURE_HEIGHT;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV(
            x, y + height, zLevel, u * inverseWidth, (v + height) * inverseHeight);
        tessellator.addVertexWithUV(
            x + width, y + height, zLevel,
            (u + width) * inverseWidth, (v + height) * inverseHeight);
        tessellator.addVertexWithUV(
            x + width, y, zLevel, (u + width) * inverseWidth, v * inverseHeight);
        tessellator.addVertexWithUV(x, y, zLevel, u * inverseWidth, v * inverseHeight);
        tessellator.draw();
    }

    /** Maps a panel button identifier to its optional light circuit. */
    private static RollingStockLightChannel channelFor(int buttonId)
    {
        switch (buttonId)
        {
            case AUX_BUTTON:
                return RollingStockLightChannel.AUX;
            case BEACON_BUTTON:
                return RollingStockLightChannel.BEACON;
            case GYRA_BUTTON:
                return RollingStockLightChannel.GYRA;
            case DITCH_BUTTON:
                return RollingStockLightChannel.DITCH;
            default:
                throw new IllegalArgumentException("Unknown lighting button: " + buttonId);
        }
    }

    /** Maps an optional light circuit to its stable packet control identifier. */
    private static byte controlFor(RollingStockLightChannel channel)
    {
        switch (channel)
        {
            case AUX:
                return PacketRollingStockLightState.AUX;
            case DITCH:
                return PacketRollingStockLightState.DITCH;
            case BEACON:
                return PacketRollingStockLightState.BEACON;
            case GYRA:
                return PacketRollingStockLightState.GYRA;
            default:
                throw new IllegalArgumentException("Unsupported lighting circuit: " + channel);
        }
    }

    private static final class PanelHitButton extends GuiButton
    {
        /** Creates a transparent hit region carrying its control description. */
        private PanelHitButton(int id, int x, int y, int width, int height, String description)
        {
            super(id, x, y, width, height, description);
        }

        @Override
        public void drawButton(Minecraft minecraft, int mouseX, int mouseY)
        {
            // The panel texture provides all control visuals.
        }
    }
}
