package train.common.core.network.ITCPacket;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import train.common.items.BallastTypes;
import train.common.items.ItemTCRail;
import train.common.items.RailVariants;
import train.common.items.TCRailTypes;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.EnumTracks;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackPlacementType;

import java.io.IOException;
import java.util.*;

public class PacketScrollingItemBlockSelect implements ITCPacket
{
    private int slot = 0;
    private boolean posNeg = false;

    public PacketScrollingItemBlockSelect() {}

    public PacketScrollingItemBlockSelect(int slot, boolean posNeg) {
        this.slot = slot;
        this.posNeg = posNeg;
    }


    private static final List<EnumCoreTrack> CORE_1X3_GROUP =
            Arrays.asList(
                    EnumCoreTrack.CORE_MEDIUM_STRAIGHT,
                    EnumCoreTrack.CORE_3_SLOPE,
                    EnumCoreTrack.CORE_3_HALF_HEIGHT_SLOPE
            );

    private static final List<EnumCoreTrack> CORE_1X6_GROUP =
            Arrays.asList(
                    EnumCoreTrack.CORE_LONG_STRAIGHT,
                    EnumCoreTrack.CORE_6_SLOPE,
                    EnumCoreTrack.CORE_6_HALF_HEIGHT_SLOPE
            );

    private static final List<EnumCoreTrack> CORE_1X12_GROUP =
            Arrays.asList(
                    EnumCoreTrack.CORE_VERY_LONG_STRAIGHT,
                    EnumCoreTrack.CORE_12_SLOPE
            );

    /**
     * Moves one position within a scrollable straight or slope shape family while
     * preserving the track piece's physical footprint length.
     *
     * @param current currently selected core shape
     * @param forward whether to move toward the slope end of the family
     * @return adjacent core, or {@code current} at an unsupported or clamped end
     */
	public static EnumCoreTrack shift(EnumCoreTrack current, boolean forward)
	{
		if (current == null)
		{
			return null;
		}

		List<EnumCoreTrack> group;
		switch (current)
		{
			case CORE_MEDIUM_STRAIGHT:
			case CORE_3_SLOPE:
			case CORE_3_HALF_HEIGHT_SLOPE:
				group = CORE_1X3_GROUP;
				break;
			case CORE_LONG_STRAIGHT:
			case CORE_6_SLOPE:
			case CORE_6_HALF_HEIGHT_SLOPE:
				group = CORE_1X6_GROUP;
				break;
			case CORE_VERY_LONG_STRAIGHT:
			case CORE_12_SLOPE:
				group = CORE_1X12_GROUP;
				break;
			default:
				return current;
		}

		int index = group.indexOf(current);
		int newIndex = index + (forward ? 1 : -1);
		if (newIndex < 0)
		{
			newIndex = 0;
		}
		if (newIndex >= group.size())
		{
			newIndex = group.size() - 1;
		}
		return group.get(newIndex);
	}




    /**
     * Applies one server-authoritative shape, resource-variant, or placement-variant scroll.
     *
     * @param entityPlayer player whose selected inventory slot is being changed
     * @param bbis packet input containing the slot and scroll direction
     * @throws IOException when the packet input cannot be read
     */
    @Override
    public void processData(EntityPlayer entityPlayer, ByteBufInputStream bbis) throws IOException
    {
        int slot = bbis.readInt();
        ItemStack itemStack = entityPlayer.inventory.getStackInSlot(slot);
        boolean incIncrease = bbis.readBoolean();

        if (itemStack != null && itemStack.getItem() instanceof ItemTCRail)
        {
            ItemTCRail itemTCRail = (ItemTCRail)itemStack.getItem();

            ITrackDefinition currentTrack = itemTCRail.getTrackType(itemStack);
            if (currentTrack.getBallastType() != null
                    && currentTrack.getBallastType() != BallastTypes.DYNAMIC)
            {
                return;
            }

            ITrackDefinition newTrack = getScrolledTrack(currentTrack, incIncrease);

            if (newTrack != null)
            {
				ItemStack replacement = new ItemStack(newTrack.getItem().item, itemStack.stackSize);
				if (itemStack.hasTagCompound())
				{
					replacement.setTagCompound((net.minecraft.nbt.NBTTagCompound)itemStack.getTagCompound().copy());
				}
				((ItemTCRail)replacement.getItem()).setTrackType(replacement, newTrack);
				entityPlayer.inventory.setInventorySlotContents(slot, replacement);
            }
        }
    }

    /**
	 * Selects the adjacent resource or shape definition in a scrollable family. Sleeperless non-slope tracks retain
	 * their true-embedded forms, the 1x3 true-embedded straight continues into its transition slope, and sleeperless
	 * half-height slopes continue into their host-replacing counterparts. Slab-mounted placement is selected
	 * automatically from the targeted support block and is not part of this scroll family. Full-height slopes keep
	 * the existing straight/slope behavior and are not converted by the embedded selector.
     *
     * @param current currently selected track definition
     * @param forward whether to move toward the ordinary slope end of the family
     * @return adjacent definition, or {@code current} when the selected end cannot move farther
     */
    public static ITrackDefinition getScrolledTrack(ITrackDefinition current, boolean forward)
    {
        if (current == null)
        {
            return null;
        }

        RailVariants variant = current.getVariant();
        TrackPlacementType placementType = current.getPlacementType();
        boolean slope = TCRailTypes.RailTypes.SLOPE.equals(current.getRailType())
                || TCRailTypes.RailTypes.CURVED_SLOPE.equals(current.getRailType());

        if (current.getCoreTrack().isEmbeddedTransitionSlope())
        {
            ITrackDefinition embeddedStraight = EnumTracks.GetTrackByLabel("TRUE_EMBEDDED_MEDIUM_STRAIGHT");
            return forward && embeddedStraight != null ? embeddedStraight : current;
        }
        if (placementType == TrackPlacementType.REPLACE_TARGET
                && slope && current.getCoreTrack().isHalfHeightSlope())
        {
            ITrackDefinition sleeperless = getTrackForCore(
                    EnumTracks.GetTracksByGroup(variant, TrackPlacementType.SURFACE), current.getCoreTrack());
            return forward || sleeperless == null ? current : sleeperless;
        }
        if (placementType == TrackPlacementType.REPLACE_TARGET
                && slope == false && current.getCoreTrack() == EnumCoreTrack.CORE_MEDIUM_STRAIGHT)
        {
			ITrackDefinition transition = EnumTracks.GetTrackByLabel("TRUE_EMBEDDED_TRANSITION_SLOPE");
			return forward || transition == null ? EnumTracks.EMBEDDED_MEDIUM_STRAIGHT : transition;
        }
        if (placementType == TrackPlacementType.REPLACE_TARGET && slope == false)
        {
            ITrackDefinition sleeperless = getTrackForCore(
                    EnumTracks.GetTracksByGroup(variant, TrackPlacementType.SURFACE), current.getCoreTrack());
            return sleeperless != null ? sleeperless : current;
        }

        HashMap<EnumCoreTrack, HashMap<String, ITrackDefinition>> tracks =
				EnumTracks.GetTracksByGroup(variant, placementType);
        EnumCoreTrack shiftedCore = shift(current.getCoreTrack(), forward);
        if (shiftedCore != current.getCoreTrack())
        {
            ITrackDefinition shifted = getTrackForCore(tracks, shiftedCore);
            if (shifted != null)
            {
                return shifted;
            }
        }

        if (slope && forward && current.getCoreTrack().isHalfHeightSlope()
                && RailVariants.EMBEDDED.equals(variant)
                && placementType == TrackPlacementType.SURFACE)
        {
            ITrackDefinition trueEmbedded = getTrackForCore(
                    EnumTracks.GetTracksByGroup(variant, TrackPlacementType.REPLACE_TARGET),
                    current.getCoreTrack());
            if (trueEmbedded != null)
            {
                return trueEmbedded;
            }
        }

        if (slope == false && RailVariants.EMBEDDED.equals(variant)
                && placementType == TrackPlacementType.SURFACE)
        {
            ITrackDefinition trueEmbedded = getTrackForCore(
                    EnumTracks.GetTracksByGroup(variant, TrackPlacementType.REPLACE_TARGET),
                    current.getCoreTrack());
            if (trueEmbedded != null)
            {
                return trueEmbedded;
            }
        }
        return current;
    }

    /**
     * Resolves the preferred unballasted or dynamic definition for one core.
     *
     * @param tracks definitions grouped by core and ballast name
     * @param coreTrack core shape to resolve
     * @return matching definition, or {@code null} when that core is absent
     */
    private static ITrackDefinition getTrackForCore(
            Map<EnumCoreTrack, ? extends Map<String, ITrackDefinition>> tracks, EnumCoreTrack coreTrack)
    {
        if (tracks == null || coreTrack == null)
        {
            return null;
        }
        Map<String, ITrackDefinition> definitions = tracks.get(coreTrack);
        if (definitions == null)
        {
            return null;
        }
        ITrackDefinition unballasted = definitions.get("");
        return unballasted != null ? unballasted : definitions.get(BallastTypes.DYNAMIC.name());
    }

    @Override
    public void appendData(ByteBuf buffer) throws IOException {
        buffer.writeInt(slot);
        buffer.writeBoolean(posNeg);
    }
}
