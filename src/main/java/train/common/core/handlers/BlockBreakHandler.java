package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.world.BlockEvent;
import train.common.blocks.BlockSwitchStand;
import train.common.blocks.BlockTrainDetector;
import train.common.entity.TrustedPlayer;
import train.common.items.ItemPadlock;
import train.common.items.ItemWrench;
import train.common.library.ILockable;
import train.common.library.track.TrackCellResolver;
import train.common.track.attachment.TrackAttachmentOperations;


/** Applies attachment-aware and ownership-aware rules when a player finishes mining a block. */
public class BlockBreakHandler
{
	/**
	 * Converts a completed native block-mining action into attachment removal before the rail block is harvested.
	 * LOWEST priority lets protection integrations cancel the break first.
	 */
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public void onTrackAttachmentBreak(BlockEvent.BreakEvent breakEvent)
	{
		if (breakEvent.isCanceled() || breakEvent.getPlayer() == null
				|| TrackCellResolver.isTraincraftRailBlock(breakEvent.block) == false
				|| TrackAttachmentOperations.isPlayerAimingAtAttachment(breakEvent.world,
						breakEvent.x, breakEvent.y, breakEvent.z, breakEvent.getPlayer()) == false)
		{
			return;
		}
		breakEvent.setCanceled(true);
		TrackAttachmentOperations.removeTargeted(breakEvent.world, breakEvent.x, breakEvent.y, breakEvent.z,
				breakEvent.getPlayer());
	}

	/** Prevents unauthorized players from breaking locked switch stands and train detectors. */
	@SubscribeEvent
	public void onBlockBreakEvent(BlockEvent.BreakEvent breakEvent)
	{
		boolean isDirectlyLockable = breakEvent.block instanceof BlockSwitchStand
				|| breakEvent.block instanceof BlockTrainDetector;
		boolean isBelowSwitchStand = breakEvent.world.getBlock(
				breakEvent.x, breakEvent.y + 1, breakEvent.z) instanceof BlockSwitchStand;
		if (isDirectlyLockable == false && isBelowSwitchStand == false)
		{
			return;
		}

		ILockable lockable = null;
		if (isDirectlyLockable)
		{
			lockable = (ILockable)breakEvent.world.getTileEntity(
					breakEvent.x, breakEvent.y, breakEvent.z);
		}
		else if (isBelowSwitchStand)
		{
			lockable = (ILockable)breakEvent.world.getTileEntity(
					breakEvent.x, breakEvent.y + 1, breakEvent.z);
		}

		if (lockable == null || lockable.isLocked() == false)
		{
			return;
		}

		String playerName = breakEvent.getPlayer().getDisplayName();
		boolean isOwner = playerName.equalsIgnoreCase(lockable.getOwner());
		boolean isTrusted = TrustedPlayer.isPlayerTrustedToBreak(playerName, lockable.getTrustedList());
		if (isOwner || isTrusted)
		{
			return;
		}

		boolean hasHeldItem = breakEvent.getPlayer().inventory.getCurrentItem() != null;
		boolean hasPadlock = hasHeldItem
				&& breakEvent.getPlayer().inventory.getCurrentItem().getItem() instanceof ItemPadlock;
		boolean hasWrench = hasHeldItem
				&& breakEvent.getPlayer().inventory.getCurrentItem().getItem() instanceof ItemWrench;
		boolean hasOperatorPadlockOverride = breakEvent.getPlayer().canCommandSenderUseCommand(2, "")
				&& hasPadlock;
		if (hasOperatorPadlockOverride || hasWrench)
		{
			breakEvent.getPlayer().addChatMessage(new ChatComponentText(
					"Broke block owned by " + lockable.getOwner() + " with operator permission."));
			return;
		}

		breakEvent.setCanceled(true);
		breakEvent.getPlayer().addChatMessage(new ChatComponentText(
				"This block is locked by " + lockable.getOwner() + "!"));
	}
}
