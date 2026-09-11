package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import train.common.items.TCRailTypes;
import train.common.library.track.EnumCoreTrack;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.common.tile.TileTCRailGag;

/**
 * Holds the shared measurements and classification rules used to shape embedded-rail trenches.
 *
 * <p>This class answers geometry questions but never creates vertices. Keeping these measurements
 * together prevents straight, diagonal, curve, and switch builders from drifting apart.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedTrenchProfileRules
{
	private static final int PROFILE_GRID_SIZE = 16;
	private static final int LARGE_PROFILE_GRID_SIZE = 8;
	private static final int DETAILED_SWITCH_PROFILE_GRID_SIZE = 32;
	private static final int DIAGONAL_PROFILE_GRID_SIZE = 32;
	private static final int LARGE_DIAGONAL_PROFILE_GRID_SIZE = 16;
	private static final int LARGE_PROFILE_HOST_BLOCK_THRESHOLD = 24;
	/** Rail-center offset measured from the visible track models, in blocks. */
	public static final double RAIL_OFFSET_FROM_CENTER = 0.309D;
	/** Default pocket half-width on the side facing the space between rails, in blocks. */
	public static final double RAIL_POCKET_HALF_WIDTH = 0.052D;
	/** Straight-rail pocket half-width on the outside of the track, in blocks. */
	public static final double STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH = 0.050D;
	private static final double CURVE_RAIL_POCKET_HALF_WIDTH = 0.043D;
	private static final double CURVE_OUTER_RAIL_OUTSIDE_HALF_WIDTH = 0.058D;
	private static final double CURVE_OUTER_RAIL_INSIDE_HALF_WIDTH = 0.043D;
	/** Host-local center of the left straight rail, in blocks. */
	public static final double STRAIGHT_RAIL_LEFT = 0.170D;
	/** Host-local center of the right straight rail, in blocks. */
	public static final double STRAIGHT_RAIL_RIGHT = 0.830D;
	/** Signed line-coordinate offset of each diagonal rail, in blocks. */
	public static final double DIAGONAL_RAIL_LINE_OFFSET = 0.470D;
	/** Diagonal pocket half-width on the side between the rails, in blocks. */
	public static final double DIAGONAL_RAIL_LINE_HALF_WIDTH = 0.072D;
	/** Diagonal pocket half-width on the outside of the track, in blocks. */
	public static final double DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH = 0.070D;

	/** Creates no instances; trench-profile rules are static. */
	private EmbeddedTrenchProfileRules()
	{
	}

	/**
	 * Returns whether the track needs generated trench geometry instead of its captured host's plain shape.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether procedural trench geometry is required
	 */
	public static boolean usesSampledTrenchProfile(TileTCRail railTile)
	{
		if (railTile.isReplaceTargetTrack() == false)
		{
			return false;
		}
		if (railTile.isIntactHostMountedTrack())
		{
			return false;
		}
		if (getModelTerrainProfile(railTile) != null)
		{
			return true;
		}
		TCRailTypes.RailTypes railType = railTile.getRailType();
		return TCRailTypes.RailTypes.STRAIGHT.equals(railType)
				|| TCRailTypes.RailTypes.DIAGONAL.equals(railType)
				|| TCRailTypes.RailTypes.SLOPE.equals(railType)
				|| isSwitchProfile(railTile)
				|| (railTile.r > 0.0D && (TCRailTypes.RailTypes.TURN.equals(railType)
				|| TCRailTypes.RailTypes.DIAGONALTURN.equals(railType)));
	}

	/**
	 * Returns whether the visible track belongs to any supported switch family.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether the rail uses a switch profile
	 */
	public static boolean isSwitchProfile(TileTCRail railTile)
	{
		return TCRailTypes.RailTypes.SWITCH.equals(railTile.getRailType());
	}

	/**
	 * Returns the cached model-following track profile, or {@code null} for its established fallback path.
	 *
	 * @param railTile visible rail tile whose core selects the profile
	 * @return model-derived profile, or {@code null} when none is registered
	 */
	public static EmbeddedSwitchTerrainProfiles.Profile getModelTerrainProfile(TileTCRail railTile)
	{
		if (railTile == null)
		{
			return null;
		}
		return EmbeddedSwitchTerrainProfiles.get(railTile.getCoreType());
	}

	/**
	 * Returns whether the track is one of the parallel-switch layouts with authored straight corridors.
	 *
	 * @param railTile visible switch tile being classified
	 * @return whether the switch belongs to the parallel family
	 */
	public static boolean isParallelSwitchProfile(TileTCRail railTile)
	{
		switch (railTile.getCoreType())
		{
			case CORE_4x11_PARALLEL_SWITCH_L:
			case CORE_4x11_PARALLEL_SWITCH:
			case CORE_4x11_PARALLEL_SWITCH_R:
			case CORE_4x17_PARALLEL_SWITCH:
			case CORE_4x17_PARALLEL_SWITCH_L:
			case CORE_4x17_PARALLEL_SWITCH_R:
				return true;
			default:
				return false;
		}
	}

	/**
	 * Returns whether the legacy switch fallback should follow curved rails rather than a straight-only pocket.
	 *
	 * @param railTile visible switch tile being classified
	 * @return whether the curved fallback route is required
	 */
	public static boolean shouldUseCurvedSwitchProfile(TileTCRail railTile)
	{
		return isSwitchProfile(railTile) && railTile.r > 0.0D && isParallelSwitchProfile(railTile) == false;
	}

	/**
	 * Chooses samples per host block. Model-derived and parallel-switch profiles use 32 samples. Diagonal profiles use
	 * 32 samples for large footprints and 16 otherwise; remaining profiles use 16 samples for large footprints and 8
	 * otherwise.
	 *
	 * @param railTile visible rail tile supplying shape and host-count inputs
	 * @return samples per host-block axis
	 */
	public static int getProfileGridSize(TileTCRail railTile)
	{
		if (getModelTerrainProfile(railTile) != null || isParallelSwitchProfile(railTile))
		{
			return DETAILED_SWITCH_PROFILE_GRID_SIZE;
		}
		int hostBlockCount = railTile.getTrackHostRenderBlocks().size();
		if (usesDiagonalTrenchProfile(railTile))
		{
			return hostBlockCount > LARGE_PROFILE_HOST_BLOCK_THRESHOLD
					? LARGE_DIAGONAL_PROFILE_GRID_SIZE : DIAGONAL_PROFILE_GRID_SIZE;
		}
		return hostBlockCount > LARGE_PROFILE_HOST_BLOCK_THRESHOLD
				? LARGE_PROFILE_GRID_SIZE : PROFILE_GRID_SIZE;
	}

	/**
	 * Returns whether smooth circular top and wall overlays replace sampled visible edges.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether circular overlays are active
	 */
	public static boolean usesCurvedOverlayProfile(TileTCRail railTile)
	{
		TCRailTypes.RailTypes railType = railTile.getRailType();
		return railTile.r > 0.0D && (TCRailTypes.RailTypes.TURN.equals(railType)
				|| TCRailTypes.RailTypes.DIAGONALTURN.equals(railType));
	}

	/**
	 * Returns the uncut captured-host or support surface height in local block units.
	 *
	 * @param railTile visible rail tile supplying surface height
	 * @return raised local Y coordinate in block units
	 */
	public static double getRaisedProfileTop(TileTCRail railTile)
	{
		return railTile.getTrackSurfaceYOffset();
	}

	/**
	 * Returns whether one local sample belongs inside a lowered rail pocket for the selected profile.
	 *
	 * @param railTile visible rail tile selecting the trench profile
	 * @param hostBlock captured host cell containing the sample
	 * @param localX sample X coordinate within the host cell, from zero to one
	 * @param localZ sample Z coordinate within the host cell, from zero to one
	 * @return whether the sample belongs to a lowered pocket
	 */
	public static boolean isPocketSample(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, double localX, double localZ)
	{
		TCRailTypes.RailTypes railType = railTile.getRailType();
		if (usesDiagonalTrenchProfile(railTile))
		{
			double sampleX = hostBlock.offsetX + localX;
			double sampleZ = hostBlock.offsetZ + localZ;
			double lineCoordinate = getDiagonalModelLineCoordinate(railTile.getFacing(), sampleX, sampleZ);
			return getDiagonalPocketClearance(lineCoordinate) >= 0.0D;
		}
		if (TCRailTypes.RailTypes.STRAIGHT.equals(railType) || TCRailTypes.RailTypes.SLOPE.equals(railType))
		{
			return isStraightPocketSample(railTile.getFacing(), localX, localZ);
		}
		if (TCRailTypes.RailTypes.SWITCH.equals(railType))
		{
			EmbeddedSwitchTerrainProfiles.Profile modelProfile = getModelTerrainProfile(railTile);
			if (modelProfile != null)
			{
				double worldOffsetX = hostBlock.offsetX + localX - 0.5D;
				double worldOffsetZ = hostBlock.offsetZ + localZ - 0.5D;
				return modelProfile.containsWorld(railTile.getFacing(), worldOffsetX, worldOffsetZ);
			}
			return isStraightPocketSample(railTile.getFacing(), localX, localZ)
					|| isCurvedPocketSample(railTile, hostBlock, localX, localZ);
		}
		return railTile.r > 0.0D && isCurvedPocketSample(railTile, hostBlock, localX, localZ);
	}

	/**
	 * Finds the linked visible straight whose corridor must be preserved through a compound switch.
	 *
	 * @param ownerRail authoritative rail supplying the world and host-map origin
	 * @param hostBlock owner-relative captured host coordinate to inspect
	 * @return linked straight rail, or {@code null} when the coordinate has none
	 */
	public static TileTCRail getLinkedStraightRail(TileTCRail ownerRail,
			TileTCRailHostData.CapturedHostBlock hostBlock)
	{
		World world = ownerRail.getWorldObj();
		if (world == null)
		{
			return null;
		}
		TileEntity localTile = world.getTileEntity(ownerRail.xCoord + hostBlock.offsetX,
				ownerRail.yCoord + hostBlock.offsetY, ownerRail.zCoord + hostBlock.offsetZ);
		if (localTile instanceof TileTCRailGag)
		{
			TileTCRailGag gag = (TileTCRailGag)localTile;
			localTile = world.getTileEntity(gag.originX, gag.originY, gag.originZ);
		}
		if ((localTile instanceof TileTCRail) == false || localTile == ownerRail)
		{
			return null;
		}
		TileTCRail localRail = (TileTCRail)localTile;
		return TCRailTypes.RailTypes.STRAIGHT.equals(localRail.getRailType()) ? localRail : null;
	}

	/**
	 * Returns signed clearance from the two straight rail pockets at a zero-to-one cross coordinate.
	 *
	 * @param crossCoordinate local coordinate across the straight track, from zero to one
	 * @return positive clearance inside a pocket and negative clearance outside it, in blocks
	 */
	public static double getStraightPocketClearance(double crossCoordinate)
	{
		double leftHalfWidth = crossCoordinate < STRAIGHT_RAIL_LEFT
				? STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH : RAIL_POCKET_HALF_WIDTH;
		double rightHalfWidth = crossCoordinate > STRAIGHT_RAIL_RIGHT
				? STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH : RAIL_POCKET_HALF_WIDTH;
		return Math.max(leftHalfWidth - Math.abs(crossCoordinate - STRAIGHT_RAIL_LEFT),
				rightHalfWidth - Math.abs(crossCoordinate - STRAIGHT_RAIL_RIGHT));
	}

	/**
	 * Returns signed clearance from the two diagonal rail lines in diagonal-line coordinates.
	 *
	 * @param lineCoordinate signed coordinate across the diagonal track
	 * @return positive clearance inside a pocket and negative clearance outside it, in blocks
	 */
	public static double getDiagonalPocketClearance(double lineCoordinate)
	{
		double lowRailCenter = -DIAGONAL_RAIL_LINE_OFFSET;
		double lowHalfWidth = lineCoordinate < lowRailCenter
				? DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH : DIAGONAL_RAIL_LINE_HALF_WIDTH;
		double highRailCenter = DIAGONAL_RAIL_LINE_OFFSET;
		double highHalfWidth = lineCoordinate > highRailCenter
				? DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH : DIAGONAL_RAIL_LINE_HALF_WIDTH;
		return Math.max(lowHalfWidth - Math.abs(lineCoordinate - lowRailCenter),
				highHalfWidth - Math.abs(lineCoordinate - highRailCenter));
	}

	/**
	 * Returns whether the visible tile needs diagonal line equations for its trench.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether diagonal trench geometry is required
	 */
	public static boolean usesDiagonalTrenchProfile(TileTCRail railTile)
	{
		return usesDiagonalTrenchProfile(railTile.getCoreType(), railTile.getRailType());
	}

	/**
	 * Chooses the visible trench path independently from the movement category. Diagonal transition and half-height
	 * slopes remain slopes for movement, but their visible models follow diagonal straight corridors.
	 *
	 * @param coreTrack exact visible track core
	 * @param railType broad movement and rendering category
	 * @return whether diagonal trench geometry is required
	 */
	public static boolean usesDiagonalTrenchProfile(EnumCoreTrack coreTrack, TCRailTypes.RailTypes railType)
	{
		return TCRailTypes.RailTypes.DIAGONAL.equals(railType)
				|| EnumCoreTrack.CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE.equals(coreTrack)
				|| EnumCoreTrack.CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE.equals(coreTrack)
				|| EnumCoreTrack.CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE.equals(coreTrack)
				|| EnumCoreTrack.CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE.equals(coreTrack);
	}

	/**
	 * Returns whether the facing places a straight corridor along the local Z axis.
	 *
	 * @param facing Traincraft track facing
	 * @return whether the straight length axis is local Z
	 */
	public static boolean isStraightAlongZ(int facing)
	{
		return facing == 0 || facing == 2 || facing > 3;
	}

	/**
	 * Converts a local sample into the signed diagonal-line coordinate for one facing.
	 *
	 * @param facing Traincraft diagonal facing
	 * @param sampleX X coordinate relative to the visible rail tile
	 * @param sampleZ Z coordinate relative to the visible rail tile
	 * @return signed coordinate across the diagonal rail pair
	 */
	public static double getDiagonalModelLineCoordinate(int facing, double sampleX, double sampleZ)
	{
		switch (facing)
		{
			case 4:
				return sampleX + sampleZ - 1.0D;
			case 5:
				return sampleZ - sampleX;
			case 6:
				return 1.0D - sampleX - sampleZ;
			case 7:
			default:
				return sampleX - sampleZ;
		}
	}

	/**
	 * Returns one curved rail pocket's inward half-width in blocks.
	 *
	 * @param railTile visible rail tile selecting the curved profile
	 * @return distance from the rail center to the inner trench edge, in blocks
	 */
	public static double getCurveRailPocketHalfWidth(TileTCRail railTile)
	{
		return usesCurvedOverlayProfile(railTile) ? CURVE_RAIL_POCKET_HALF_WIDTH : RAIL_POCKET_HALF_WIDTH;
	}

	/**
	 * Returns the outer curved rail's radius from the track center, in blocks.
	 *
	 * @param railTile visible rail tile supplying the track radius
	 * @return radius from the curve center to the outer rail center, in blocks
	 */
	public static double getCurveOuterRailPocketCenter(TileTCRail railTile)
	{
		return railTile.r + RAIL_OFFSET_FROM_CENTER;
	}

	/**
	 * Returns the outer curved rail's terrain-side clearance in blocks.
	 *
	 * @param railTile visible rail tile selecting the curved profile
	 * @return distance from the outer rail center to the terrain-side trench edge, in blocks
	 */
	public static double getCurveOuterRailOutsideHalfWidth(TileTCRail railTile)
	{
		return usesCurvedOverlayProfile(railTile)
				? CURVE_OUTER_RAIL_OUTSIDE_HALF_WIDTH : getCurveRailPocketHalfWidth(railTile);
	}

	/**
	 * Returns the outer curved rail's center-side clearance in blocks.
	 *
	 * @param railTile visible rail tile selecting the curved profile
	 * @return distance from the outer rail center to the center-side trench edge, in blocks
	 */
	public static double getCurveOuterRailInsideHalfWidth(TileTCRail railTile)
	{
		return usesCurvedOverlayProfile(railTile)
				? CURVE_OUTER_RAIL_INSIDE_HALF_WIDTH : getCurveRailPocketHalfWidth(railTile);
	}

	/**
	 * Tests both straight rail corridors after selecting the facing's cross-track coordinate.
	 *
	 * @param facing Traincraft track facing
	 * @param localX sample X coordinate within the host cell, from zero to one
	 * @param localZ sample Z coordinate within the host cell, from zero to one
	 * @return whether the sample lies inside either straight rail pocket
	 */
	private static boolean isStraightPocketSample(int facing, double localX, double localZ)
	{
		double crossCoordinate = isStraightAlongZ(facing) ? localX : localZ;
		return getStraightPocketClearance(crossCoordinate) >= 0.0D;
	}

	/**
	 * Tests inner and outer circular rail pockets using the visible track's center and radius.
	 *
	 * @param railTile visible rail tile supplying the curve center and radius
	 * @param hostBlock captured host cell containing the sample
	 * @param localX sample X coordinate within the host cell, from zero to one
	 * @param localZ sample Z coordinate within the host cell, from zero to one
	 * @return whether the sample lies inside either curved rail pocket
	 */
	private static boolean isCurvedPocketSample(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, double localX, double localZ)
	{
		if (railTile.r <= 0.0D)
		{
			return false;
		}
		double worldX = railTile.xCoord + hostBlock.offsetX + localX;
		double worldZ = railTile.zCoord + hostBlock.offsetZ + localZ;
		double radius = Math.sqrt((worldX - railTile.cx) * (worldX - railTile.cx)
				+ (worldZ - railTile.cz) * (worldZ - railTile.cz));
		if (usesCurvedOverlayProfile(railTile))
		{
			double innerPocketCenter = Math.max(0.0D, railTile.r - RAIL_OFFSET_FROM_CENTER);
			double outerPocketCenter = getCurveOuterRailPocketCenter(railTile);
			double pocketHalfWidth = getCurveRailPocketHalfWidth(railTile);
			double innerPocketMin = Math.max(0.0D, innerPocketCenter - pocketHalfWidth);
			double innerPocketMax = innerPocketCenter + pocketHalfWidth;
			double outerPocketMin = Math.max(0.0D,
					outerPocketCenter - getCurveOuterRailInsideHalfWidth(railTile));
			double outerPocketMax = outerPocketCenter + getCurveOuterRailOutsideHalfWidth(railTile);
			return (radius >= innerPocketMin && radius <= innerPocketMax)
					|| (radius >= outerPocketMin && radius <= outerPocketMax);
		}
		double radiusDistance = Math.abs(radius - railTile.r);
		return Math.abs(radiusDistance - RAIL_OFFSET_FROM_CENTER) <= getCurveRailPocketHalfWidth(railTile);
	}
}
