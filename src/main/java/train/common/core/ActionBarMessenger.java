package train.common.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.Traincraft;
import train.common.core.network.PacketActionBarMessage;

/** Sends short interaction feedback to a player's action-bar overlay. */
public final class ActionBarMessenger
{
	public static final int DEFAULT_DURATION_TICKS = 60;

	private ActionBarMessenger()
	{
	}

	/**
	 * Displays a message to one server-side player for the default duration.
	 *
	 * @param player receiving player
	 * @param message message text, including any Minecraft formatting codes
	 */
	public static void display(EntityPlayer player, String message)
	{
		display(player, message, DEFAULT_DURATION_TICKS);
	}

	/**
	 * Displays a message to one server-side player.
	 *
	 * @param player receiving player
	 * @param message message text, including any Minecraft formatting codes
	 * @param durationTicks display duration in client ticks
	 */
	public static void display(EntityPlayer player, String message, int durationTicks)
	{
		if (player instanceof EntityPlayerMP == false || message == null || message.isEmpty())
		{
			return;
		}

		int safeDuration = Math.max(1, Math.min(65535, durationTicks));
		Traincraft.modChannel.sendTo(
				new PacketActionBarMessage(message, safeDuration), (EntityPlayerMP)player);
	}
}
