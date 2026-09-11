package train.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.api.AbstractTrains;
import train.common.api.EntityBogie;
import train.common.items.TCRailTypes;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.TrackCellResolver;
import train.common.library.track.TrackPlacementType;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.common.tile.TileTCRailGag;

import java.util.List;

/** Shared captured-host shape behavior for host-replacing parent and gag blocks. */
public final class TrackHostBlockSupport
{
	private static final int FULL_BLOCK_LIGHT_OPACITY = 255;
	private static final int PARTIAL_HOST_LIGHT_OPACITY = 0;
	private static final float FULL_HOST_AMBIENT_LIGHT = 0.2F;
	private static final float SLAB_HOST_AMBIENT_LIGHT = 1.0F;
	private static final boolean FULL_HOST_CAN_BLOCK_GRASS = false;

	/** Creates no instances; track-host block behavior is exposed through static helpers. */
	private TrackHostBlockSupport()
	{
	}

	/**
	 * Selects the light opacity represented by the captured host at one host-replacing track cell.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return partial opacity for a captured non-opaque single slab, or full opacity for every other host shape
	 */
	public static int getLightOpacity(IBlockAccess world, int x, int y, int z)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = findHostBlock(world, x, y, z);
		return getLightOpacity(hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null);
	}

	/**
	 * Selects captured-host light opacity from its block shape.
	 *
	 * @param block captured host block, or {@code null} when none is available
	 * @return partial opacity for either slab half, or full opacity otherwise
	 */
	public static int getLightOpacity(Block block)
	{
		return (block instanceof BlockSlab && block.isOpaqueCube() == false) || block instanceof BlockStairs
				? PARTIAL_HOST_LIGHT_OPACITY : FULL_BLOCK_LIGHT_OPACITY;
	}

	/**
	 * Selects the collision-box minimum Y represented by the captured host at one host-replacing track cell.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return one-half block for a captured top slab, or zero for every other host shape
	 */
	public static float getCollisionMinY(IBlockAccess world, int x, int y, int z)
	{
		return getCollisionMinY(isTopSlabHost(world, x, y, z));
	}

	/**
	 * Selects the collision-box maximum Y represented by the captured host.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return the captured host maximum, extended by the authored ramp height for a raised-host slope cell
	 */
	public static float getCollisionMaxY(IBlockAccess world, int x, int y, int z)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = findHostBlock(world, x, y, z);
		float hostMaximum = getHostCollisionMaxY(hostBlock);
		TileTCRail parent = TrackCellResolver.resolveParent(world, x, y, z);
		if (usesRaisedHostSlopeCollision(parent))
		{
			return getRaisedSlopeCollisionMaxY(hostMaximum, true, getSlopeCellHeight(world, x, y, z));
		}
		return hostMaximum == TrackHostConstants.HALF_BLOCK_HEIGHT
				&& isSlabMountedRailCell(world, x, y, z)
				? hostMaximum + TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT : hostMaximum;
	}

	/**
	 * Returns the captured host's maximum collision height without adding the represented rail.
	 *
	 * @param world block-access view containing the host-replacing rail cell
	 * @param x rail-cell X coordinate
	 * @param y rail-cell Y coordinate
	 * @param z rail-cell Z coordinate
	 * @return captured host maximum in local block coordinates
	 */
	public static float getHostCollisionMaxY(IBlockAccess world, int x, int y, int z)
	{
		return getHostCollisionMaxY(findHostBlock(world, x, y, z));
	}

	private static float getHostCollisionMaxY(TileTCRailHostData.CapturedHostBlock hostBlock)
	{
		return getCollisionMaxY(hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null,
				hostBlock != null ? hostBlock.metadata : 0);
	}

	/**
	 * Composes a raised-host slope cell's captured host with the original rising slope collision.
	 * The result may exceed one block at the high end because a slope beginning on a bottom slab
	 * connects to a bottom slab in the block coordinate above it.
	 *
	 * @param hostMaximum maximum local Y occupied by the captured host
	 * @param raisedHostSlope whether the owning rail raises its captured host with the authored slope
	 * @param slopeCellHeight original local slope collision height for this parent or gag cell
	 * @return combined local collision maximum, or the unchanged host maximum for other tracks
	 */
	public static float getRaisedSlopeCollisionMaxY(float hostMaximum, boolean raisedHostSlope,
			float slopeCellHeight)
	{
		return raisedHostSlope ? hostMaximum + Math.max(0.0F, slopeCellHeight) : hostMaximum;
	}

	/**
	 * Selects the captured host's collision maximum from block type and metadata.
	 *
	 * @param block captured host block, or {@code null} when none is available
	 * @param metadata captured host metadata
	 * @return one-half block for a bottom slab, or one block otherwise
	 */
	public static float getCollisionMaxY(Block block, int metadata)
	{
		return block instanceof BlockSlab && block.isOpaqueCube() == false && isTopSlab(block, metadata) == false
				? TrackHostConstants.HALF_BLOCK_HEIGHT : 1.0F;
	}

	/**
	 * Returns whether the captured host occupies a complete block volume.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return whether the captured host occupies a full opaque cube, including an opaque double slab
	 */
	public static boolean isFullHost(IBlockAccess world, int x, int y, int z)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = findHostBlock(world, x, y, z);
		Block block = hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null;
		return block != null && (block instanceof BlockStairs) == false
				&& ((block instanceof BlockSlab) == false || block.isOpaqueCube());
	}

	/**
	 * Returns whether a captured host preserves a complete boundary face after replacement.
	 *
	 * @param world block-access view containing the host-replacing rail cell
	 * @param x rail-cell X coordinate
	 * @param y rail-cell Y coordinate
	 * @param z rail-cell Z coordinate
	 * @param side boundary face being queried
	 * @return whether the represented host completely fills that boundary face
	 */
	public static boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = findHostBlock(world, x, y, z);
		Block block = hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null;
		if (block instanceof BlockStairs)
		{
			return side == ForgeDirection.UP;
		}
		return block != null && ((block instanceof BlockSlab) == false || block.isOpaqueCube());
	}

	/**
	 * Adds every exact captured-host cuboid at one rail cell. Cuboid hosts return {@code false} so callers retain
	 * their established single-box path; non-cuboid hosts such as stairs are handled here.
	 *
	 * @param world world containing the host-replacing rail cell
	 * @param x rail-cell X coordinate
	 * @param y rail-cell Y coordinate
	 * @param z rail-cell Z coordinate
	 * @param collisionMask entity collision query bounds
	 * @param collisions list receiving intersecting host boxes
	 * @return whether exact captured shapes replaced the caller's ordinary collision path
	 */
	public static boolean addCapturedHostCollisionBoxes(World world, int x, int y, int z,
			AxisAlignedBB collisionMask, List collisions)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = findHostBlock(world, x, y, z);
		if (hostBlock == null || hostBlock.shapes.isEmpty())
		{
			return false;
		}
		for (TileTCRailHostData.CapturedHostShape shape : hostBlock.shapes)
		{
			AxisAlignedBB bounds = AxisAlignedBB.getBoundingBox(x + shape.minX, y + shape.minY, z + shape.minZ,
					x + shape.maxX, y + shape.maxY, z + shape.maxZ);
			if (collisionMask.intersectsWith(bounds))
			{
				collisions.add(bounds);
			}
		}
		TileTCRail parent = TrackCellResolver.resolveParent(world, x, y, z);
		if (usesRaisedHostSlopeCollision(parent) == false
				&& getHostCollisionMaxY(hostBlock) == TrackHostConstants.HALF_BLOCK_HEIGHT
				&& isSlabMountedRailCell(world, x, y, z))
		{
			double hostMaximum = getHostCollisionMaxY(hostBlock);
			AxisAlignedBB railBounds = AxisAlignedBB.getBoundingBox(x, y + hostMaximum, z,
					x + 1.0D, y + hostMaximum + TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT, z + 1.0D);
			if (collisionMask.intersectsWith(railBounds))
			{
				collisions.add(railBounds);
			}
		}
		float raisedMaximum = getRaisedSlopeCollisionMaxY(1.0F,
				usesRaisedHostSlopeCollision(parent), getSlopeCellHeight(world, x, y, z));
		if (raisedMaximum > 1.0F)
		{
			AxisAlignedBB raisedBounds = AxisAlignedBB.getBoundingBox(x, y + 1.0D, z,
					x + 1.0D, y + raisedMaximum, z + 1.0D);
			if (collisionMask.intersectsWith(raisedBounds))
			{
				collisions.add(raisedBounds);
			}
		}
		return true;
	}

	/**
	 * Returns whether a rail cell should expose its underlying track or host collision to an entity. True-embedded
	 * placement replaces terrain at rail height, so exposing that captured host to Traincraft rolling stock makes it
	 * collide with its own path. Other entities retain the represented host collision.
	 *
	 * @param world world containing the rail cell
	 * @param x rail-cell X coordinate
	 * @param y rail-cell Y coordinate
	 * @param z rail-cell Z coordinate
	 * @param entity entity requesting collision boxes
	 * @return {@code false} only for Traincraft rolling stock traversing true-embedded track
	 */
	public static boolean shouldAddTrackBaseCollision(World world, int x, int y, int z, Entity entity)
	{
		if ((entity instanceof AbstractTrains) == false && (entity instanceof EntityBogie) == false)
		{
			return true;
		}
		TileTCRail rail = TrackCellResolver.resolveParent(world, x, y, z);
		return rail == null || rail.getTrackType() == null
				|| rail.getTrackType().getPlacementType() != TrackPlacementType.REPLACE_TARGET;
	}

	private static boolean isSlabMountedRailCell(IBlockAccess world, int x, int y, int z)
	{
		Block block = world.getBlock(x, y, z);
		return block instanceof BlockTCRailSlabMounted
				|| block instanceof BlockTCRailGagSlabMounted;
	}

	/**
	 * Returns whether captured host data exists at one host-replacing coordinate.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return whether a captured host exists at the coordinate
	 */
	public static boolean hasHost(IBlockAccess world, int x, int y, int z)
	{
		return findHostBlock(world, x, y, z) != null;
	}


	/**
	 * Classifies a captured host block and metadata pair as a top-half slab.
	 *
	 * @param block captured host block type, or {@code null} when its registry entry is unavailable
	 * @param metadata captured host block metadata
	 * @return whether the block is a slab whose top-half metadata bit is set
	 */
	public static boolean isTopSlab(Block block, int metadata)
	{
		return block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) != 0;
	}

	/**
	 * Maps captured single-slab classification to the light opacity used by a host-replacing rail block.
	 *
	 * @param singleSlabHost whether the captured host is a non-opaque top- or bottom-half slab
	 * @return partial opacity for a single slab, or full-block opacity otherwise
	 */
	public static int getLightOpacity(boolean singleSlabHost)
	{
		return singleSlabHost ? PARTIAL_HOST_LIGHT_OPACITY : FULL_BLOCK_LIGHT_OPACITY;
	}

	/**
	 * Maps top-slab classification to the lower edge of the host-replacing collision box.
	 *
	 * @param topSlabHost whether the captured host is a top-half slab
	 * @return one-half block for a top slab, or zero otherwise
	 */
	public static float getCollisionMinY(boolean topSlabHost)
	{
		return topSlabHost ? TrackHostConstants.HALF_BLOCK_HEIGHT : 0.0F;
	}

	/**
	 * Returns the full-terrain ambient-light multiplier exposed to neighboring vanilla block renders.
	 *
	 * @return the ambient-light multiplier used by ordinary opaque blocks
	 */
	public static float getNeighborAmbientOcclusionLightValue()
	{
		return FULL_HOST_AMBIENT_LIGHT;
	}

	/**
	 * Returns the non-opaque slab ambient-light multiplier exposed to neighboring vanilla block renders.
	 *
	 * @return the ambient-light multiplier used by an ordinary single slab
	 */
	public static float getSlabNeighborAmbientOcclusionLightValue()
	{
		return SLAB_HOST_AMBIENT_LIGHT;
	}

	/**
	 * Returns the opaque-terrain corner-sampling flag used by vanilla ambient occlusion.
	 * Despite Minecraft's method name, ordinary opaque blocks return {@code false}; returning
	 * {@code true} makes vanilla sample a potentially unlit diagonal and can blacken adjacent faces.
	 *
	 * @return the vanilla flag used by ordinary opaque terrain blocks
	 */
	public static boolean getCanBlockGrass()
	{
		return FULL_HOST_CAN_BLOCK_GRASS;
	}

	/**
	 * Resolves and classifies the captured host stored for one host-replacing parent or gag coordinate.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return whether the captured host at the coordinate is a top-half slab
	 */
	private static boolean isTopSlabHost(IBlockAccess world, int x, int y, int z)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = findHostBlock(world, x, y, z);
		if (hostBlock == null)
		{
			return false;
		}
		return isTopSlab(Block.getBlockById(hostBlock.blockId), hostBlock.metadata);
	}

	/**
	 * Returns whether a resolved parent needs its captured host and authored slope collision combined.
	 *
	 * @param parent resolved authoritative rail parent, or {@code null} when resolution failed
	 * @return whether the parent is slab-mounted slope or a true-embedded half-height slope
	 */
	private static boolean usesRaisedHostSlopeCollision(TileTCRail parent)
	{
		if (parent == null || (TCRailTypes.isSlopeTrack(parent) || TCRailTypes.isCurvedSlopeTrack(parent)) == false)
		{
			return false;
		}
		return parent.isIntactHostMountedTrack() || parent.isReplaceTargetTrack()
				&& parent.getCoreType() != null && parent.getCoreType().isHalfHeightSlope();
	}

	/**
	 * Reads the original slope collision height assigned by the placement routine to one rail cell.
	 *
	 * @param world block-access view containing the parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return the gag's authored ramp height, the parent rail-base height, or zero for an unknown cell
	 */
	private static float getSlopeCellHeight(IBlockAccess world, int x, int y, int z)
	{
		TileEntity tile = world != null ? world.getTileEntity(x, y, z) : null;
		if (tile instanceof TileTCRailGag)
		{
			return ((TileTCRailGag)tile).bbHeight;
		}
		if (tile instanceof TileTCRail)
		{
			return TrackHostConstants.DEFAULT_RAIL_BASE_HEIGHT;
		}
		return 0.0F;
	}

	/**
	 * Resolves the authoritative parent and retrieves its captured host at a world coordinate.
	 *
	 * @param world block-access view containing the host-replacing parent or gag cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return captured host data at the coordinate, or {@code null} when no parent or host is available
	 */
	private static TileTCRailHostData.CapturedHostBlock findHostBlock(IBlockAccess world, int x, int y, int z)
	{
		TileTCRail parent = TrackCellResolver.resolveParent(world, x, y, z);
		return parent != null ? parent.getCapturedHostBlockAtWorld(x, y, z) : null;
	}
}
