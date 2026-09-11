package train.common.library.track;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import train.common.library.BlockIDs;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;

import java.util.HashSet;
import java.util.Set;

/** Central rail identity and parent-resolution service. */
public final class TrackCellResolver
{
    /** Creates no instances; all rail-resolution operations are static. */
    private TrackCellResolver()
    {
    }

	/**
	 * Returns whether one world coordinate contains a vanilla or Traincraft rail cell.
	 *
	 * @param blockAccess block-access view containing the queried cell
	 * @param x queried X coordinate
	 * @param y queried Y coordinate
	 * @param z queried Z coordinate
	 * @return whether the coordinate contains a supported rail block
	 */
	public static boolean isRailBlockAt(IBlockAccess blockAccess, int x, int y, int z)
	{
		return blockAccess != null && isRailBlock(blockAccess.getBlock(x, y, z));
	}

    /**
     * Resolves the greatest parent rail for one world coordinate.
     *
     * @param world world containing the queried cell
     * @param x queried X coordinate
     * @param y queried Y coordinate
     * @param z queried Z coordinate
     * @return resolved parent rail, or {@code null} when the cell is not a rail
     */
    public static TileTCRail resolveParent(World world, int x, int y, int z)
    {
        return world != null ? resolveParent(world, world.getTileEntity(x, y, z)) : null;
    }

    /**
     * Resolves the greatest parent rail through a read-only block-access view.
     *
     * @param blockAccess block-access view containing the queried cell
     * @param x queried X coordinate
     * @param y queried Y coordinate
     * @param z queried Z coordinate
     * @return resolved parent rail, or {@code null} when the cell is not a rail
     */
    public static TileTCRail resolveParent(IBlockAccess blockAccess, int x, int y, int z)
    {
        if (blockAccess == null)
        {
            return null;
        }
        TileEntity tileEntity = blockAccess.getTileEntity(x, y, z);
        if (tileEntity instanceof TileTCRail)
        {
            return resolveGreatestParent((TileTCRail) tileEntity);
        }
        if (tileEntity instanceof TileTCRailGag)
        {
            TileTCRailGag gag = (TileTCRailGag) tileEntity;
            TileEntity origin = blockAccess.getTileEntity(gag.originX, gag.originY, gag.originZ);
            return origin instanceof TileTCRail ? resolveGreatestParent((TileTCRail) origin) : null;
        }
        return null;
    }

    /**
     * Resolves the greatest parent rail from a loaded parent or gag tile.
     *
     * @param world world containing the supplied tile
     * @param tileEntity parent or gag tile to resolve
     * @return resolved parent rail, or {@code null} for an unsupported tile
     */
    public static TileTCRail resolveParent(World world, TileEntity tileEntity)
    {
        if (world == null || tileEntity == null)
        {
            return null;
        }
        if (tileEntity instanceof TileTCRail)
        {
            return resolveGreatestParent(world, (TileTCRail)tileEntity);
        }
        if (tileEntity instanceof TileTCRailGag)
        {
            TileTCRailGag gag = (TileTCRailGag) tileEntity;
            TileEntity origin = world.getTileEntity(gag.originX, gag.originY, gag.originZ);
            if (origin instanceof TileTCRail)
            {
                return resolveGreatestParent(world, (TileTCRail)origin);
            }
        }
        return null;
    }

    /**
     * Finds the owner needed while removing a track, loading only chunks named by saved rail and gag coordinates.
     * Normal rendering must not load chunks, but removal must reach the one tile that owns the captured host blocks.
     *
     * @param world world containing the removed rail cluster
     * @param tileEntity removed parent or gag tile
     * @return resolved captured-host owner, or {@code null} when resolution fails
     */
    public static TileTCRail resolveParentForRemoval(World world, TileEntity tileEntity)
    {
        if (world == null || tileEntity == null)
        {
            return null;
        }
        if (world.isRemote)
        {
            return resolveParent(world, tileEntity);
        }
        return resolveParentForRemoval(world, tileEntity, new HashSet<String>());
    }

    /**
     * Resolves a removal owner while preventing cycles in linked rail data.
     *
     * @param world world containing the rail cluster
     * @param tileEntity current parent or gag tile
     * @param visited coordinate keys already followed
     * @return resolved owner rail, or {@code null} when resolution fails
     */
    private static TileTCRail resolveParentForRemoval(World world, TileEntity tileEntity, Set<String> visited)
    {
		if (tileEntity == null)
		{
			return null;
		}
        String coordinate = tileEntity.xCoord + "," + tileEntity.yCoord + "," + tileEntity.zCoord;
        if (visited.add(coordinate) == false)
        {
            return tileEntity instanceof TileTCRail ? (TileTCRail) tileEntity : null;
        }
        if (tileEntity instanceof TileTCRailGag)
        {
            TileTCRailGag gag = (TileTCRailGag) tileEntity;
            return resolveLoadedParentForRemoval(world, gag.originX, gag.originY, gag.originZ, visited);
        }
        if (tileEntity instanceof TileTCRail)
        {
            TileTCRail rail = (TileTCRail) tileEntity;
            if (rail.isLinkedToRail == false)
            {
                return rail;
            }
            TileTCRail parent = resolveLoadedParentForRemoval(world, rail.linkedX, rail.linkedY, rail.linkedZ, visited);
            return parent != null ? parent : rail;
        }
        return null;
    }

    /**
     * Loads one saved linked coordinate and continues removal-owner resolution.
     *
     * @param world world containing the linked coordinate
     * @param x linked X coordinate
     * @param y linked Y coordinate
     * @param z linked Z coordinate
     * @param visited coordinate keys already followed
     * @return resolved owner rail, or {@code null} when the linked tile is unavailable
     */
    private static TileTCRail resolveLoadedParentForRemoval(World world, int x, int y, int z, Set<String> visited)
    {
        world.getChunkFromBlockCoords(x, z);
        return resolveParentForRemoval(world, world.getTileEntity(x, y, z), visited);
    }

    /**
     * Resolves a parent rail's greatest linked parent without requiring a world lookup when detached.
     *
     * @param rail loaded parent rail
     * @return greatest linked parent, or the supplied rail when it has no world
     */
    private static TileTCRail resolveGreatestParent(TileTCRail rail)
    {
        World world = rail.getWorldObj();
        return world != null ? resolveGreatestParent(world, rail) : rail;
    }

	/**
	 * Follows linked parent and gag coordinates without loading chunks and stops safely at malformed cycles.
	 *
	 * @param world world containing the linked rail tiles
	 * @param rail starting parent rail
	 * @return greatest loaded parent, or the last valid rail when linkage is incomplete or cyclic
	 */
	public static TileTCRail resolveGreatestParent(World world, TileTCRail rail)
	{
		return world == null || rail == null ? rail
				: resolveGreatestParent(world, rail, new HashSet<String>());
	}

	private static TileTCRail resolveGreatestParent(World world, TileTCRail rail, Set<String> visited)
	{
		String coordinate = rail.xCoord + "," + rail.yCoord + "," + rail.zCoord;
		if (rail.isLinkedToRail == false || visited.add(coordinate) == false)
		{
			return rail;
		}
		TileEntity linkedTile = world.getTileEntity(rail.linkedX, rail.linkedY, rail.linkedZ);
		if (linkedTile instanceof TileTCRail)
		{
			return resolveGreatestParent(world, (TileTCRail)linkedTile, visited);
		}
		if (linkedTile instanceof TileTCRailGag)
		{
			TileTCRailGag gag = (TileTCRailGag)linkedTile;
			TileEntity origin = world.getTileEntity(gag.originX, gag.originY, gag.originZ);
			if (origin instanceof TileTCRail)
			{
				return resolveGreatestParent(world, (TileTCRail)origin, visited);
			}
		}
		return rail;
	}

    /**
     * Returns whether a block is a vanilla rail or any Traincraft rail cell.
     *
     * @param block block to classify
     * @return whether the block is a supported rail cell
     */
    public static boolean isRailBlock(Block block)
    {
        return block instanceof BlockRailBase || isTraincraftRailBlock(block);
    }

    /**
     * Returns whether a block is any ordinary or host-replacing Traincraft parent/gag rail cell.
     *
     * @param block block being classified, or {@code null}
     * @return whether the block belongs to the Traincraft rail-cell family
     */
    public static boolean isTraincraftRailBlock(Block block)
    {
        return block != null && (block == BlockIDs.tcRail.block
                || block == BlockIDs.tcRailGag.block
                || block == BlockIDs.tcRailEmbedded.block
                || block == BlockIDs.tcRailGagEmbedded.block
                || block == BlockIDs.tcRailSlabMounted.block
                || block == BlockIDs.tcRailGagSlabMounted.block
                || block == BlockIDs.tcRailStairMounted.block
                || block == BlockIDs.tcRailGagStairMounted.block);
    }

    /**
     * Returns whether a block is an ordinary, full-host, slab-mounted, or stair-mounted gag cell.
     *
     * @param block block being classified, or {@code null}
     * @return whether the block is a Traincraft gag cell
     */
    public static boolean isTraincraftGagBlock(Block block)
    {
        return block != null && (block == BlockIDs.tcRailGag.block
                || block == BlockIDs.tcRailGagEmbedded.block
                || block == BlockIDs.tcRailGagSlabMounted.block
                || block == BlockIDs.tcRailGagStairMounted.block);
    }

    /**
     * Returns whether a block is one of the hidden host-replacing rail cells.
     *
     * @param block block being classified, or {@code null}
     * @return whether the block belongs to a true-embedded, slab-mounted, or stair-mounted parent/gag pair
     */
    public static boolean isHostReplacingRailBlock(Block block)
    {
        return block != null && (block == BlockIDs.tcRailEmbedded.block
                || block == BlockIDs.tcRailGagEmbedded.block
                || block == BlockIDs.tcRailSlabMounted.block
                || block == BlockIDs.tcRailGagSlabMounted.block
                || block == BlockIDs.tcRailStairMounted.block
                || block == BlockIDs.tcRailGagStairMounted.block);
    }
}
