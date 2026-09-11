package train.client.gui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import train.common.core.network.ITCPacket.PacketScrollingItemBlockSelect;
import train.common.items.BallastTypes;
import train.common.items.ItemTCRail;
import train.common.items.RailVariants;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;

/** Maintains a cached previous/current/next selector for the held scrollable track. */
public final class HeldTrackSelectionOverlay
{
	private ITrackDefinition lastTrack;

	/**
	 * Refreshes the persistent selector only when the held track definition changes.
	 *
	 * @param event client tick event
	 */
	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event)
	{
		if (event.phase != TickEvent.Phase.END)
		{
			return;
		}

		Minecraft minecraft = Minecraft.getMinecraft();
		if (minecraft.thePlayer == null)
		{
			clearSelection();
			return;
		}

		ItemStack heldStack = minecraft.thePlayer.getHeldItem();
		if (heldStack == null || heldStack.getItem() instanceof ItemTCRail == false)
		{
			clearSelection();
			return;
		}

		ITrackDefinition current = ((ItemTCRail)heldStack.getItem()).getTrackType(heldStack);
		if (current == lastTrack)
		{
			return;
		}
		lastTrack = current;

		if (isScrollable(current) == false)
		{
			ActionBarOverlay.clearPersistent();
			return;
		}

		ITrackDefinition previous = PacketScrollingItemBlockSelect.getScrolledTrack(current, false);
		ITrackDefinition next = PacketScrollingItemBlockSelect.getScrolledTrack(current, true);
		if (previous == current && next == current)
		{
			ActionBarOverlay.clearPersistent();
			return;
		}

		ActionBarOverlay.showPersistent(buildCarousel(previous, current, next));
	}

	/** Clears the cached held-track identity and persistent action-bar text. */
	private void clearSelection()
	{
		if (lastTrack == null)
		{
			return;
		}
		lastTrack = null;
		ActionBarOverlay.clearPersistent();
	}

	/**
	 * Returns whether the server permits scroll selection for this definition.
	 *
	 * @param track held track definition
	 * @return whether the track participates in a scroll family
	 */
	private boolean isScrollable(ITrackDefinition track)
	{
		if (track == null)
		{
			return false;
		}
		return track.getBallastType() == null || track.getBallastType() == BallastTypes.DYNAMIC;
	}

	/**
	 * Builds a compact carousel with the selected entry emphasized.
	 *
	 * @param previous previous selection or the current definition at the lower bound
	 * @param current selected definition
	 * @param next next selection or the current definition at the upper bound
	 * @return formatted action-bar text
	 */
	private String buildCarousel(ITrackDefinition previous, ITrackDefinition current, ITrackDefinition next)
	{
		if (previous == next && previous != current)
		{
			return buildTwoChoiceSelector(previous, current);
		}

		StringBuilder builder = new StringBuilder(96);
		if (previous != current)
		{
			builder.append(EnumChatFormatting.DARK_GRAY).append("\u2039 ")
					.append(EnumChatFormatting.GRAY).append(getCompactLabel(previous))
					.append(EnumChatFormatting.DARK_GRAY).append("  \u2022  ");
		}

		builder.append(EnumChatFormatting.YELLOW).append(EnumChatFormatting.BOLD)
				.append(getCompactLabel(current)).append(EnumChatFormatting.RESET);

		if (next != current)
		{
			builder.append(EnumChatFormatting.DARK_GRAY).append("  \u2022  ")
					.append(EnumChatFormatting.GRAY).append(getCompactLabel(next))
					.append(EnumChatFormatting.DARK_GRAY).append(" \u203a");
		}
		return builder.toString();
	}

	/**
	 * Builds a stable two-option selector without showing the same alternative on both sides.
	 *
	 * @param alternative only definition adjacent to the current selection
	 * @param current selected definition
	 * @return formatted two-option action-bar text
	 */
	private String buildTwoChoiceSelector(ITrackDefinition alternative, ITrackDefinition current)
	{
		boolean currentFirst = current.getPlacementType() == TrackPlacementType.SURFACE;
		ITrackDefinition first = currentFirst ? current : alternative;
		ITrackDefinition second = currentFirst ? alternative : current;
		StringBuilder builder = new StringBuilder(64);
		appendChoice(builder, first, first == current);
		builder.append(EnumChatFormatting.DARK_GRAY).append("  \u2022  ");
		appendChoice(builder, second, second == current);
		return builder.toString();
	}

	/**
	 * Appends one selected or unselected choice with isolated formatting.
	 *
	 * @param builder destination text builder
	 * @param track displayed definition
	 * @param selected whether the choice is currently selected
	 */
	private void appendChoice(StringBuilder builder, ITrackDefinition track, boolean selected)
	{
		if (selected)
		{
			builder.append(EnumChatFormatting.YELLOW).append(EnumChatFormatting.BOLD);
		}
		else
		{
			builder.append(EnumChatFormatting.GRAY);
		}
		builder.append(getCompactLabel(track)).append(EnumChatFormatting.RESET);
	}

	/**
	 * Produces a short label that distinguishes shape and placement without repeating the rail-family name.
	 *
	 * @param track definition being displayed
	 * @return compact selection label
	 */
	private String getCompactLabel(ITrackDefinition track)
	{
		if (track.getCoreTrack().isEmbeddedTransitionSlope())
		{
			return "1x3 Transition";
		}

		String footprint = ItemTCRail.getTooltip(track);
		int detailSeparator = footprint.indexOf(',');
		if (detailSeparator >= 0)
		{
			footprint = footprint.substring(0, detailSeparator);
		}

		String label = null;
		if (track.getCoreTrack().isHalfHeightSlope())
		{
			label = footprint + " Half-Height Slope";
		}
		else if (track.getRailType() != null)
		{
			switch (track.getRailType())
			{
				case SLOPE:
				case CURVED_SLOPE:
					label = footprint + " Slope";
					break;
				case STRAIGHT:
				case DIAGONAL:
					label = footprint + " Straight";
					break;
				default:
					break;
			}
		}

		if (label == null && RailVariants.EMBEDDED.equals(track.getVariant()))
		{
			label = track.getPlacementType() == TrackPlacementType.REPLACE_TARGET
					? "Embedded" : "Sleeperless";
		}
		else if (label == null)
		{
			label = heldItemName(track);
		}

		if (track.getPlacementType() == TrackPlacementType.REPLACE_TARGET
				&& label.equals("Embedded") == false)
		{
			label += " Embedded";
		}
		return label;
	}

	/**
	 * Resolves the localized item name used when a track lacks a compact shape classification.
	 *
	 * @param track definition whose item supplies the name
	 * @return localized item name
	 */
	private String heldItemName(ITrackDefinition track)
	{
		if (track.getItem() == null || track.getItem().item == null)
		{
			return track.getLabel();
		}
		return new ItemStack(track.getItem().item).getDisplayName();
	}
}
