package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.library.track.TrackCellResolver;
import train.common.tile.TileTCRail;
import train.common.track.attachment.ITrackAttachmentItem;
import train.common.track.attachment.RoadCrossingAttachmentResolver;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentOperations;
import train.common.track.attachment.TrackAttachmentType;
import train.common.track.attachment.TrackAttachmentTypes;

import java.util.List;

/** Installs one road-crossing surface on a supported existing track cell. */
public final class ItemRoadCrossingAttachment extends ItemPart implements ITrackAttachmentItem
{
	/** Black-asphalt crossing attachment identity. */
	public static final String BLACK_TYPE_ID = "tc:road_crossing_black";
	/** Clean-asphalt crossing attachment identity. */
	public static final String CLEAN_TYPE_ID = "tc:road_crossing_clean";
	/** Light-gray-asphalt crossing attachment identity. */
	public static final String LIGHT_GRAY_TYPE_ID = "tc:road_crossing_light_gray";
	/** Host-material crossing attachment identity. */
	public static final String DYNAMIC_TYPE_ID = "tc:road_crossing_dynamic";
	private static final int NO_TRACK_CELL = Integer.MIN_VALUE;

	private final String attachmentTypeId;

	/**
	 * Creates one inventory appearance backed by a stable attachment type.
	 *
	 * @param iconName item texture name beneath the track item directory
	 * @param attachmentTypeId stable attachment type installed by this item
	 */
	public ItemRoadCrossingAttachment(String iconName, String attachmentTypeId)
	{
		super(iconName);
		this.attachmentTypeId = attachmentTypeId;
		overridePath("tracks");
	}

	/** Attempts attachment installation without providing standalone block placement. */
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
			int cellX, int cellY, int cellZ, int selectedSide, float hitX, float hitY, float hitZ)
	{
		int trackCellY = resolveTrackCellY(world, cellX, cellY, cellZ);
		return trackCellY != NO_TRACK_CELL && installOnTrackCell(stack, player, world,
				cellX, trackCellY, cellZ, selectedSide, hitX, hitZ);
	}

	/** Installs the road surface when the selected rail cell has registered crossing geometry. */
	@Override
	public boolean installOnTrackCell(ItemStack stack, EntityPlayer player, World world,
			int cellX, int cellY, int cellZ, int selectedSide, float hitX, float hitZ)
	{
		if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(cellX, cellY, cellZ)) == false)
		{
			return false;
		}
		if (player == null || player.canPlayerEdit(cellX, cellY, cellZ, selectedSide, stack) == false)
		{
			return false;
		}
		TileTCRail owner = TrackAttachmentOperations.resolveRenderOwner(world, cellX, cellY, cellZ);
		TrackAttachment attachment = createAttachment(owner, cellX, cellY, cellZ);
		if (attachment == null)
		{
			return true;
		}
		if (world.isRemote == false && owner.addAttachment(attachment))
		{
			if (player.capabilities.isCreativeMode == false)
			{
				stack.stackSize--;
			}
			player.swingItem();
		}
		return true;
	}

	/** Resolves the exact candidate used by the client preview without changing world state. */
	@Override
	public TrackAttachment resolveTrackAttachment(ItemStack stack, World world,
			int cellX, int cellY, int cellZ, int selectedSide, float hitX, float hitZ)
	{
		int trackCellY = resolveTrackCellY(world, cellX, cellY, cellZ);
		if (trackCellY == NO_TRACK_CELL)
		{
			return null;
		}
		TileTCRail owner = TrackAttachmentOperations.resolveRenderOwner(world, cellX, trackCellY, cellZ);
		return createAttachment(owner, cellX, trackCellY, cellZ);
	}

	private TrackAttachment createAttachment(TileTCRail owner, int cellX, int cellY, int cellZ)
	{
		RoadCrossingAttachmentResolver.Resolution resolution =
				RoadCrossingAttachmentResolver.INSTANCE.resolve(owner, cellX, cellZ);
		if (owner == null || resolution == null)
		{
			return null;
		}
		TrackAttachmentType attachmentType = TrackAttachmentTypes.byId(attachmentTypeId);
		return new TrackAttachment(attachmentType, resolution.getPlacement(),
				cellX - owner.xCoord, cellY - owner.yCoord, cellZ - owner.zCoord);
	}

	private int resolveTrackCellY(World world, int cellX, int cellY, int cellZ)
	{
		if (TrackCellResolver.isTraincraftRailBlock(world.getBlock(cellX, cellY, cellZ)))
		{
			return cellY;
		}
		int cellAboveY = cellY + 1;
		return TrackCellResolver.isTraincraftRailBlock(world.getBlock(cellX, cellAboveY, cellZ))
				? cellAboveY : NO_TRACK_CELL;
	}

	/** Adds concise installation and removal guidance. */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced)
	{
		super.addInformation(stack, player, tooltip, advanced);
		tooltip.add(EnumChatFormatting.GRAY + "Right-click a straight track to install.");
		tooltip.add(EnumChatFormatting.GRAY + "Mine the crossing surface to remove it.");
	}
}
