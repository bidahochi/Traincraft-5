package train.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.path.TrackPathGeometry;
import train.common.library.track.path.TrackPathSample;
import train.common.tile.TileTCRail;
import train.common.track.attachment.ITrackAttachmentItem;
import train.common.track.attachment.ITrackAttachmentSource;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentOperations;
import train.common.track.attachment.TrackAttachmentPlacement;
import train.common.track.attachment.TrackEndAttachmentPlacementResolver;
import train.common.track.attachment.TrackAttachmentType;
import train.common.track.attachment.TrackAttachmentTypes;

import java.util.List;

/**
 * Installs a buffer on an existing Traincraft track cell and otherwise retains ordinary standalone block placement.
 */
public class ItemBlockTrackBuffer extends ItemBlock implements ITrackAttachmentItem
{
	private static final int NO_TRACK_CELL = Integer.MIN_VALUE;

	/**
	 * Creates the item form of one registered standalone buffer block.
	 *
	 * @param block fallback block and exact item identity used by this buffer
	 */
	public ItemBlockTrackBuffer(Block block)
	{
		super(block);
		if (block instanceof ITrackAttachmentSource == false)
		{
			throw new IllegalArgumentException("Track attachment item requires an attachment source block");
		}
	}

	/**
	 * Installs buffer hardware when the selected cell belongs to a track, or delegates to normal block placement.
	 * Installation is server-authoritative and consumes one item outside creative mode.
	 */
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int cellX, int cellY, int cellZ,
			int selectedSide, float hitX, float hitY, float hitZ)
	{
		int trackCellY = resolveTrackCellY(world, cellX, cellY, cellZ);
		if (trackCellY == NO_TRACK_CELL)
		{
			return super.onItemUse(stack, player, world, cellX, cellY, cellZ,
					selectedSide, hitX, hitY, hitZ);
		}

		return installOnTrackCell(stack, player, world, cellX, trackCellY, cellZ,
				selectedSide, hitX, hitZ);
	}

	/**
	 * Handles a confirmed rail-cell interaction without relying on ItemBlock's legacy placement handoff.
	 * The interaction is consumed even when the cell already has a buffer, preventing standalone placement over track.
	 *
	 * @param stack held buffer stack
	 * @param player player installing the buffer
	 * @param world world containing the selected track
	 * @param cellX track-cell X coordinate
	 * @param cellY track-cell Y coordinate
	 * @param cellZ track-cell Z coordinate
	 * @param selectedSide selected block face
	 * @param hitX selected X position within the cell
	 * @param hitZ selected Z position within the cell
	 * @return {@code true} when the coordinate belongs to a Traincraft rail cell
	 */
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
		if (owner == null)
		{
			return false;
		}
		TrackAttachment attachment = createTrackAttachment(owner, cellX, cellY, cellZ, hitX, hitZ);
		if (attachment == null)
		{
			return true;
		}
		if (world.isRemote == false)
		{
			boolean installed = owner.addAttachment(attachment);
			if (installed && player.capabilities.isCreativeMode == false)
			{
				stack.stackSize--;
			}
			if (installed)
			{
				player.swingItem();
			}
		}
		return true;
	}

	/** {@inheritDoc} */
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
		return owner == null ? null : createTrackAttachment(owner, cellX, trackCellY, cellZ, hitX, hitZ);
	}

	/** Returns the selected rail Y coordinate, including a rail immediately above the selected support block. */
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

	/** Creates the immutable candidate after the authoritative render owner has been resolved. */
	private TrackAttachment createTrackAttachment(TileTCRail owner,
			int cellX, int cellY, int cellZ, float hitX, float hitZ)
	{
		TrackPathSample pathSample = TrackPathGeometry.sampleAttachmentPath(owner, cellX, cellZ);
		if (pathSample == null)
		{
			return null;
		}
		ITrackAttachmentSource source = (ITrackAttachmentSource)field_150939_a;
		TrackAttachmentType attachmentType = TrackAttachmentTypes.byId(source.getTrackAttachmentTypeId());
		TrackAttachmentPlacement placement = TrackEndAttachmentPlacementResolver.resolve(
				owner, pathSample, cellX + hitX, cellZ + hitZ);
		return new TrackAttachment(attachmentType, placement,
				cellX - owner.xCoord, cellY - owner.yCoord, cellZ - owner.zCoord);
	}

	/** Adds concise installation and removal instructions to the item tooltip. */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced)
	{
		super.addInformation(stack, player, tooltip, advanced);
		tooltip.add(EnumChatFormatting.GRAY + "Right-click track to install.");
		tooltip.add(EnumChatFormatting.GRAY + "Mine the buffer to remove it.");
	}
}
