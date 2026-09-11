package train.common.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.blocks.BlockSwitchStand;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.TrackPlacementType;
import train.common.tile.TileSwitchStand;
import train.common.tile.TileTCRail;

import java.util.ArrayList;
import java.util.List;

/** Places ordinary switch stands and their automatically selected true-embedded host variants. */
public final class ItemBlockSwitchStand extends ItemBlock
{
	private final BlockSwitchStand switchStandBlock;

	/**
	 * Creates the shared item wrapper for one existing switch-stand block.
	 *
	 * @param block switch-stand block represented by this item
	 */
	public ItemBlockSwitchStand(Block block)
	{
		super(block);
		if ((block instanceof BlockSwitchStand) == false)
		{
			throw new IllegalArgumentException("Switch stand items require a switch stand block");
		}
		switchStandBlock = (BlockSwitchStand)block;
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world,
			int x, int y, int z, int side, float hitX, float hitY, float hitZ)
	{
		if (switchStandBlock.supportsTrueEmbeddedHostReplacement() == false)
		{
			return super.onItemUse(stack, player, world, x, y, z, side, hitX, hitY, hitZ);
		}
		TileSwitchStand.EmbeddedHostType hostType = getEmbeddedHostType(world, x, y, z, side);
		if (hostType == null || hasAdjacentTrueEmbeddedSwitchControl(world, x, y, z) == false)
		{
			return super.onItemUse(stack, player, world, x, y, z, side, hitX, hitY, hitZ);
		}
		if (stack.stackSize == 0 || player.canPlayerEdit(x, y, z, side, stack) == false
				|| world.isAirBlock(x, y + 1, z) == false)
		{
			return false;
		}

		Block capturedBlock = world.getBlock(x, y, z);
		int capturedMetadata = world.getBlockMetadata(x, y, z);
		if (capturedBlock.hasTileEntity(capturedMetadata))
		{
			return false;
		}
		List<AxisAlignedBB> capturedShapes = captureCollisionShapes(world, x, y, z, capturedBlock);
		int placedMetadata = field_150939_a.onBlockPlaced(world, x, y, z, side,
				hitX, hitY, hitZ, getMetadata(stack.getItemDamage()));

		if (world.setBlock(x, y, z, field_150939_a, placedMetadata, 2) == false)
		{
			return false;
		}
		TileEntity placedTile = world.getTileEntity(x, y, z);
		if ((placedTile instanceof TileSwitchStand) == false)
		{
			world.setBlock(x, y, z, capturedBlock, capturedMetadata,
					TrackHostConstants.NOTIFY_NEIGHBORS_AND_CLIENTS);
			return false;
		}

		TileSwitchStand switchStand = (TileSwitchStand)placedTile;
		switchStand.setEmbeddedHost(hostType, capturedBlock, capturedMetadata, capturedShapes);
		field_150939_a.onBlockPlacedBy(world, x, y, z, player, stack);
		field_150939_a.onPostBlockPlaced(world, x, y, z, placedMetadata);
		world.markBlockForUpdate(x, y, z);
		world.notifyBlocksOfNeighborChange(x, y, z, field_150939_a);
		world.playSoundEffect(x + 0.5D, y + 0.5D, z + 0.5D,
				field_150939_a.stepSound.func_150496_b(),
				(field_150939_a.stepSound.getVolume() + 1.0F) / 2.0F,
				field_150939_a.stepSound.getPitch() * 0.8F);
		stack.stackSize--;
		return true;
	}

	/** Resolves the supported host kind selected by the clicked upper face. */
	private static TileSwitchStand.EmbeddedHostType getEmbeddedHostType(
			World world, int x, int y, int z, int side)
	{
		if (world == null || side != ForgeDirection.UP.ordinal())
		{
			return null;
		}
		Block block = world.getBlock(x, y, z);
		int metadata = world.getBlockMetadata(x, y, z);
		if (block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0)
		{
			return TileSwitchStand.EmbeddedHostType.SLAB;
		}
		if (block instanceof BlockStairs && World.doesBlockHaveSolidTopSurface(world, x, y, z))
		{
			return TileSwitchStand.EmbeddedHostType.STAIR;
		}
		return block.isOpaqueCube() && World.doesBlockHaveSolidTopSurface(world, x, y, z)
				? TileSwitchStand.EmbeddedHostType.FULL : null;
	}

	/** Returns whether a designated true-embedded switch control occupies a horizontal neighbor cell. */
	private static boolean hasAdjacentTrueEmbeddedSwitchControl(World world, int x, int y, int z)
	{
		for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS)
		{
			if (direction.offsetY != 0
					|| Math.abs(direction.offsetX) + Math.abs(direction.offsetZ) != 1)
			{
				continue;
			}
			TileEntity tile = world.getTileEntity(
					x + direction.offsetX, y, z + direction.offsetZ);
			if (tile instanceof TileTCRail)
			{
				TileTCRail rail = (TileTCRail)tile;
				if (rail.getTrackType() != null
						&& rail.getTrackType().getPlacementType() == TrackPlacementType.REPLACE_TARGET
						&& (TCRailTypes.isSwitchTrack(rail) || rail.canTypeBeModifiedBySwitch))
				{
					return true;
				}
			}
		}
		return false;
	}

	/** Captures the host's resolved collision components before replacing it. */
	private static List<AxisAlignedBB> captureCollisionShapes(
			World world, int x, int y, int z, Block block)
	{
		List<AxisAlignedBB> worldShapes = new ArrayList<AxisAlignedBB>();
		AxisAlignedBB cell = AxisAlignedBB.getBoundingBox(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D);
		block.addCollisionBoxesToList(world, x, y, z, cell, worldShapes, (Entity)null);
		List<AxisAlignedBB> localShapes = new ArrayList<AxisAlignedBB>(worldShapes.size());
		for (AxisAlignedBB shape : worldShapes)
		{
			localShapes.add(AxisAlignedBB.getBoundingBox(shape.minX - x, shape.minY - y, shape.minZ - z,
					shape.maxX - x, shape.maxY - y, shape.maxZ - z));
		}
		return localShapes;
	}
}
