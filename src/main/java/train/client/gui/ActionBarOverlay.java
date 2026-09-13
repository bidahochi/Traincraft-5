package train.client.gui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

/** Renders transient feedback or persistent contextual guidance above the hotbar. */
public final class ActionBarOverlay
{
	private static final long MILLIS_PER_TICK = 50L;
	private static final int FADE_TICKS = 20;

	private static String transientMessage = "";
	private static String persistentMessage = "";
	private static long expiresAtMillis;

	/**
	 * Replaces the current action-bar message and restarts its display timer.
	 *
	 * @param text message to display, including any Minecraft formatting codes
	 * @param durationTicks requested display duration in client ticks
	 */
	public static void show(String text, int durationTicks)
	{
		if (text == null || text.isEmpty() || durationTicks <= 0)
		{
			transientMessage = "";
			expiresAtMillis = 0L;
			return;
		}

		long now = System.currentTimeMillis();
		transientMessage = text;
		expiresAtMillis = now + durationTicks * MILLIS_PER_TICK;
	}

	/**
	 * Sets contextual text that remains visible until explicitly replaced or cleared.
	 * Transient feedback temporarily takes priority over this text.
	 *
	 * @param text persistent contextual message
	 */
	public static void showPersistent(String text)
	{
		persistentMessage = text != null ? text : "";
	}

	/** Clears the contextual message without affecting active transient feedback. */
	public static void clearPersistent()
	{
		persistentMessage = "";
	}

	/**
	 * Draws the active message after the vanilla hotbar has rendered.
	 *
	 * @param event Forge overlay event
	 */
	@SubscribeEvent
	public void onRenderOverlay(RenderGameOverlayEvent.Post event)
	{
		if (event.type != RenderGameOverlayEvent.ElementType.HOTBAR)
		{
			return;
		}

		long now = System.currentTimeMillis();
		boolean transientActive = transientMessage.isEmpty() == false && now < expiresAtMillis;
		String activeMessage = transientActive ? transientMessage : persistentMessage;

		Minecraft minecraft = Minecraft.getMinecraft();
		if (minecraft.thePlayer == null || activeMessage.isEmpty())
		{
			return;
		}

		int alpha = 255;
		if (transientActive)
		{
			long remainingMillis = expiresAtMillis - now;
			long fadeMillis = FADE_TICKS * MILLIS_PER_TICK;
			if (remainingMillis < fadeMillis)
			{
				alpha = (int)(255L * remainingMillis / fadeMillis);
			}
		}
		if (alpha < 4)
		{
			return;
		}

		ScaledResolution resolution = new ScaledResolution(
				minecraft, minecraft.displayWidth, minecraft.displayHeight);
		FontRenderer fontRenderer = minecraft.fontRenderer;
		int x = (resolution.getScaledWidth() - fontRenderer.getStringWidth(activeMessage)) / 2;
		int y = resolution.getScaledHeight() - 68;
		fontRenderer.drawStringWithShadow(activeMessage, x, y, 0xFFFFFF | alpha << 24);
	}
}
