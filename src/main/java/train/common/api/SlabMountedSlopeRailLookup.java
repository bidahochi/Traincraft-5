package train.common.api;

import net.minecraft.world.IBlockAccess;
import train.common.items.TCRailTypes;
import train.common.library.track.TrackCellResolver;
import train.common.tile.TileTCRail;

/** Resolves the extra-low rail cell occupied beneath the raised end of a slab-mounted slope. */
public final class SlabMountedSlopeRailLookup
{
	/** Creates no instances; slab-mounted slope lookup is static. */
	private SlabMountedSlopeRailLookup()
	{
	}

	/**
	 * Returns whether one coordinate belongs to a slab-mounted straight or curved slope.
	 *
	 * @param world block-access view containing the possible slope cell
	 * @param x queried world block X coordinate
	 * @param y queried world block Y coordinate
	 * @param z queried world block Z coordinate
	 * @return whether the coordinate resolves to a slab-mounted slope parent
	 */
	public static boolean isSlabMountedSlopeCell(IBlockAccess world, int x, int y, int z)
	{
		return isSlabMountedSlope(TrackCellResolver.resolveParent(world, x, y, z));
	}

	/**
	 * Returns whether the resolved rail parent is a slab-mounted straight or curved slope eligible for the extra-low
	 * rail-cell lookup.
	 *
	 * @param rail resolved rail parent, or {@code null} when no rail was found
	 * @return whether the rail is a slab-mounted straight or curved slope
	 */
	public static boolean isSlabMountedSlope(TileTCRail rail)
	{
		return rail != null && rail.isSlabMountedTrack()
				&& (TCRailTypes.isSlopeTrack(rail) || TCRailTypes.isCurvedSlopeTrack(rail));
	}
}
