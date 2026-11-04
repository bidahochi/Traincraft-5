package train.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.network.PacketSleeperCar;

/** Presents the bunk menu and the sleep fade for a server-approved session. */
public final class GuiSleeperCar extends GuiScreen
{
    private static final int FADE_TICKS = 40;
    // The client thread assigns IDs across menus so a late reply cannot affect a reopened menu.
    private static int nextRequestId;

    private final AbstractPassengerCar car;
    private GuiButton sleepButton;
    private int requestId;
    private ScreenState state = ScreenState.MENU;
    private int fadeTicks;
    private String messageKey = "";

    private enum ScreenState
    {
        MENU, REQUESTED, SLEEPING
    }

    /** Opens a bunk menu tied to the car the local player is riding. */
    public GuiSleeperCar(AbstractPassengerCar car)
    {
        this.car = car;
    }

    /** Restores the button's current action when Minecraft initializes or resizes the screen. */
    @Override
    public void initGui()
    {
        int buttonWidth = 120;
        int buttonLeft = (width - buttonWidth) / 2;
        int buttonTop = height / 2 + 8;
        String buttonLabel = I18n.format(state == ScreenState.SLEEPING ? "tc.sleeper.wake" : "tc.sleeper.sleep");
        sleepButton = new GuiButton(0, buttonLeft, buttonTop, buttonWidth, 20, buttonLabel);
        sleepButton.enabled = state != ScreenState.REQUESTED;
        buttonList.add(sleepButton);
    }

    /** Requests sleep or closes the approved sleep screen to wake up. */
    @Override
    protected void actionPerformed(GuiButton button)
    {
        if (state == ScreenState.SLEEPING)
        {
            mc.displayGuiScreen(null);
        }
        else if (state == ScreenState.MENU)
        {
            nextRequestId++;
            requestId = nextRequestId;
            state = ScreenState.REQUESTED;
            sleepButton.enabled = false;
            messageKey = "";
            sendRequest(true);
        }
    }

    /** Applies a server result only to the matching car and the still-active menu request. */
    public void applyState(int carId, int responseId, PacketSleeperCar.Status status)
    {
        if (car.getEntityId() != carId || requestId != responseId || state == ScreenState.MENU)
        {
            return;
        }
        switch (status)
        {
            case SLEEPING:
                state = ScreenState.SLEEPING;
                fadeTicks = 0;
                sleepButton.displayString = I18n.format("tc.sleeper.wake");
                sleepButton.enabled = true;
                break;
            case AWAKE:
                state = ScreenState.MENU;
                mc.displayGuiScreen(null);
                break;
            case DAYTIME:
                state = ScreenState.MENU;
                messageKey = "tc.sleeper.daytime";
                sleepButton.enabled = true;
                break;
            case UNAVAILABLE:
            default:
                state = ScreenState.MENU;
                messageKey = "tc.sleeper.unavailable";
                sleepButton.enabled = true;
                break;
        }
    }

    /** Advances the visual fade and closes the menu when the player leaves the car. */
    @Override
    public void updateScreen()
    {
        EntityPlayer player = mc.thePlayer;
        if (player == null || player.isEntityAlive() == false || mc.theWorld != car.worldObj
                || player.ridingEntity != car || car.isDead)
        {
            mc.displayGuiScreen(null);
        }
        else if (state == ScreenState.SLEEPING && fadeTicks < FADE_TICKS)
        {
            fadeTicks++;
        }
    }

    /** Draws the menu or darkens the riding view as the sleep fade advances. */
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        boolean sleeping = state == ScreenState.SLEEPING;
        if (sleeping)
        {
            float fadeProgress = Math.min(1.0F, (fadeTicks + partialTicks) / FADE_TICKS);
            int alpha = (int) (255 * fadeProgress);
            int alphaShift = 24;
            int blackWithAlpha = (alpha << alphaShift);
            drawGradientRect(0, 0, width, height, blackWithAlpha, blackWithAlpha);
        }
        else
        {
            drawDefaultBackground();
        }
        int centerX = width / 2;
        int titleY = height / 2 - 30;
        String title = I18n.format(sleeping ? "tc.sleeper.sleeping" : "tc.sleeper.title");
        drawCenteredString(fontRendererObj, title, centerX, titleY, 0xFFFFFF);
        if (messageKey.isEmpty() == false)
        {
            int messageY = height / 2 - 12;
            drawCenteredString(fontRendererObj, I18n.format(messageKey), centerX, messageY, 0xFFAAAA);
        }
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    /** Cancels a pending or active request when the player closes the menu. */
    @Override
    public void onGuiClosed()
    {
        if (state != ScreenState.MENU && mc.getNetHandler() != null)
        {
            sendRequest(false);
        }
    }

    /** Keeps the integrated server ticking so the train and sleep timer can advance. */
    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    private void sendRequest(boolean sleep)
    {
        Traincraft.modChannel.sendToServer(new PacketSleeperCar.Request(car.getEntityId(), requestId, sleep));
    }
}
