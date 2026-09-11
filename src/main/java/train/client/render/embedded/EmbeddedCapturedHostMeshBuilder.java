package train.client.render.embedded;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import train.common.library.track.TrackHostConstants;
import train.common.items.TCRailTypes;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.common.tile.TileTCRailGag;
import train.client.render.embedded.EmbeddedHostFace.CuboidBounds;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;
import train.client.render.embedded.EmbeddedHostGeometry.ClipResult;
import train.client.render.embedded.EmbeddedHostGeometry.LineXZ;
import train.client.render.embedded.EmbeddedHostGeometry.PointXZ;
import train.client.render.embedded.EmbeddedHostGeometry.SegmentXZ;
import train.client.render.embedded.EmbeddedSwitchTerrainProfiles.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static train.client.render.embedded.EmbeddedHostRenderController.*;
import static train.client.render.embedded.EmbeddedHostLightingPreparer.*;
import static train.client.render.embedded.EmbeddedSlopeHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedSwitchHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedTrenchProfileRules.*;

/**
 * Builds captured host shapes and the straight, diagonal, and curved trench geometry cut into them.
 *
 * <p>Every face retains its captured material and owner-relative cell offset. Axis-aligned shapes are clipped in local
 * block coordinates; custom quads must preserve outward winding and the same boundary-coverage rules as cuboid faces.</p>
 *
 * <p>Prefer tuning a profile or sampling rule before changing generic neighbor culling, which is shared by full blocks,
 * slabs, stairs, switches, and slopes.</p>
 */
final class EmbeddedCapturedHostMeshBuilder
{
	private EmbeddedCapturedHostMeshBuilder()
	{
	}

	/**
	 * Recreates captured component cuboids, or a full-width fallback when no explicit shapes were captured.
	 * The fallback top follows the effective track surface so slab- and stair-mounted rails remain aligned.
	 *
	 * @param railTile visible rail supplying the effective surface height
	 * @param block captured block used to derive the minimum occupied height
	 * @param hostBlock captured state and optional component shapes
	 * @return ordered local shapes used for face generation
	 */
	static List<HostShape> getHostShapes(TileTCRail railTile, Block block,
			TileTCRailHostData.CapturedHostBlock hostBlock)
	{
		List<HostShape> shapes = new ArrayList<HostShape>();
		if (hostBlock.shapes.isEmpty() == false)
		{
			for (TileTCRailHostData.CapturedHostShape shape : hostBlock.shapes)
			{
				shapes.add(new HostShape(shape.minX, shape.minY, shape.minZ,
						shape.maxX, shape.maxY, shape.maxZ, true));
			}
			return shapes;
		}
		double minY = getHostMinY(block, hostBlock.metadata);
		double surfaceHeight = railTile.getTrackSurfaceYOffset();
		double raisedTop = surfaceHeight < TrackHostConstants.FULL_BLOCK_SURFACE_HEIGHT
				? surfaceHeight : railTile.getTrackHostSurfaceRenderYOffset() + RENDER_EPSILON;
		shapes.add(new HostShape(0.0D, minY, 0.0D, 1.0D, raisedTop, 1.0D, true));
		return shapes;
	}

	/**
	 * Finds the lowest Y at which the captured host fills the complete cell and can carry the shared trench profile.
	 * An upper-half stair has a full-width upper cuboid beginning at one-half block, while its lower step remains a
	 * separate shape beneath the trench body.
	 *
	 * @param railTile visible rail tile supplying the captured surface height
	 * @param block captured host block type
	 * @param hostBlock captured host state and exact component cuboids
	 * @return lowest local Y occupied across the complete host-cell width
	 */
	static double getTrenchProfileMinY(TileTCRail railTile, Block block,
			TileTCRailHostData.CapturedHostBlock hostBlock)
	{
		double surfaceHeight = railTile.getTrackSurfaceYOffset();
		for (TileTCRailHostData.CapturedHostShape shape : hostBlock.shapes)
		{
			if (shape.minX <= GEOMETRY_EPSILON && shape.minZ <= GEOMETRY_EPSILON
					&& shape.maxX >= 1.0D - GEOMETRY_EPSILON
					&& shape.maxZ >= 1.0D - GEOMETRY_EPSILON
					&& shape.maxY >= surfaceHeight - GEOMETRY_EPSILON)
			{
				return shape.minY;
			}
		}
		return getHostMinY(block, hostBlock.metadata);
	}

	/**
	 * Adds captured stair components lying beneath the full-width portion used by the trench generator.
	 *
	 * @param cache cache receiving generated stair faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host state and exact component cuboids
	 * @param block captured host block type
	 * @param profileMinY lowest local Y occupied by the shared trench body
	 */
	static void addCapturedShapesBelowTrench(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double profileMinY)
	{
		for (TileTCRailHostData.CapturedHostShape shape : hostBlock.shapes)
		{
			if (shape.minY < profileMinY - GEOMETRY_EPSILON
					&& shape.maxY <= profileMinY + GEOMETRY_EPSILON)
			{
				addCuboidFaces(cache, railTile, hostKeys, hostBlock, block,
						new HostShape(shape.minX, shape.minY, shape.minZ,
								shape.maxX, shape.maxY, shape.maxZ, true));
			}
		}
	}

	/**
	 * Returns the captured host's lowest rendered Y coordinate within its block.
	 *
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @return lowest local Y coordinate in blocks
	 */
	static double getHostMinY(Block block, int metadata)
	{
		if (block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) != 0)
		{
			return 0.5D;
		}
		return 0.0D;
	}

	/**
	 * Returns the captured host's highest rendered Y coordinate within its block.
	 *
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @return highest local Y coordinate in blocks
	 */
	static double getHostMaxY(Block block, int metadata)
	{
		if (block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0)
		{
			return 0.5D;
		}
		return 1.0D;
	}

	/**
	 * Samples one host cell's selected trench profile and emits its tops, bottoms, walls, and exposed sides.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible rail tile selecting and locating the profile
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @param curveAngleMask visible curve intervals, or {@code null} for a non-curved profile
	 * @param modelSwitchTop validated reusable model-switch top, or {@code null} for the uncached path
	 * @param minY lowest full-width host height beneath the generated trench
	 */
	static void addSampledProfileFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, int metadata, AngleMask curveAngleMask, EmbeddedModelSwitchTopCache.Template modelSwitchTop,
			double minY)
	{
		/*
		 * Builds the per-host-cell trench profile. The height grid is shared support data, while
		 * visible top/wall geometry may be replaced by smoother shape-specific helpers below.
		 */
		double raisedTop = getRaisedProfileTop(railTile);
		double pocketTop = raisedTop - TRENCH_POCKET_DROP;
		if (raisedTop <= minY)
		{
			return;
		}

		boolean diagonalProfile = usesDiagonalTrenchProfile(railTile);
		if (TCRailTypes.RailTypes.STRAIGHT.equals(railTile.getRailType())
				|| (TCRailTypes.RailTypes.SLOPE.equals(railTile.getRailType()) && diagonalProfile == false))
		{
			// Straight pockets are axis-aligned, so continuous bands are cheaper and avoid per-strip UV seams.
			addStraightBandProfileFaces(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop, pocketTop);
			return;
		}
		Profile modelProfile = getModelTerrainProfile(railTile);
		if (modelProfile != null)
		{
			TileTCRail linkedStraightRail = isSwitchProfile(railTile)
					? getLinkedStraightRail(railTile, hostBlock) : null;
			EmbeddedModelSwitchTopCache.Section section = modelSwitchTop != null
					? modelSwitchTop.getSection(TileTCRailHostData.key(
						hostBlock.offsetX, hostBlock.offsetY, hostBlock.offsetZ)) : null;
			if (section != null)
			{
				addCachedModelSwitchProfileFaces(cache, railTile, hostKeys, hostBlock, block, minY,
						raisedTop, pocketTop, section);
			}
			else
			{
				addSmoothModelSwitchProfileFaces(cache, railTile, hostKeys, hostBlock, block, minY,
						raisedTop, pocketTop, modelProfile, linkedStraightRail);
			}
			return;
		}

		int gridSize = getProfileGridSize(railTile);
		double[][] heights = new double[gridSize][gridSize];
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				double localX = (xIndex + 0.5D) / gridSize;
				double localZ = (zIndex + 0.5D) / gridSize;
				heights[xIndex][zIndex] = isPocketSample(railTile, hostBlock, localX, localZ) ? pocketTop : raisedTop;
			}
		}

		if (diagonalProfile)
		{
			addDiagonalTopOverlayFaces(cache, railTile, hostBlock, block, metadata, raisedTop, pocketTop);
			addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY, false);
			addDiagonalExternalSideFaces(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop);
			addDiagonalPocketWallFaces(cache, railTile, hostBlock, block, metadata, raisedTop, pocketTop);
		}
		else if (isSwitchProfile(railTile))
		{
			addSwitchProfileFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY,
					raisedTop, pocketTop, curveAngleMask);
		}
		else if (usesCurvedOverlayProfile(railTile))
		{
			addCurvedTopOverlayFaces(cache, railTile, hostBlock, block, metadata, raisedTop, pocketTop, curveAngleMask);
			addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY, false);
			addCurvedExternalSideFaces(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop, pocketTop, curveAngleMask);
			addCurvedPocketWallFaces(cache, railTile, hostKeys, hostBlock, block, metadata, raisedTop, pocketTop, curveAngleMask);
		}
		else
		{
			addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY, true);
			addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY, false);
			addProfileWallFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY);
		}
	}

	/**
	 * Selects model-derived or established fallback geometry for one switch host cell.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible switch tile selecting and locating the profile
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param heights sampled local surface heights for the fallback profile
	 * @param gridSize number of samples along each host-cell axis
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param curveAngleMask visible curve intervals used by the fallback profile
	 */
	static void addSwitchProfileFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double[][] heights, int gridSize,
			double minY, double raisedTop, double pocketTop, AngleMask curveAngleMask)
	{
		/*
		 * Switches overlap a straight route with a diverging route. The sampled grid is useful for the
		 * combined top surface, but drawing every sampled height transition creates jagged black wall
		 * strips between route samples. Instead, keep merged top/bottom faces and add only rail-pocket
		 * walls for the known straight and curved route edges.
		 */
		addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY, true);
		addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY, false);
		addCurvedExternalSideFaces(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop, pocketTop, curveAngleMask);
		addSwitchStraightPocketWalls(cache, railTile, hostBlock, block, raisedTop, pocketTop);
		if (shouldUseCurvedSwitchProfile(railTile))
		{
			addCurvedPocketWallFaces(cache, railTile, hostKeys, hostBlock, block, hostBlock.metadata, raisedTop, pocketTop, curveAngleMask);
		}
	}

	/**
	 * Adds authored straight-corridor walls that remain exact through parallel switch profiles.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible switch tile supplying facing and owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 */
	static void addSwitchStraightPocketWalls(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double raisedTop, double pocketTop)
	{
		// These are the two rail pockets for the straight route that every switch variant shares.
		addStraightPocketWalls(cache, railTile, hostBlock, block, raisedTop, pocketTop,
				isStraightAlongZ(railTile.getFacing()));
	}

	/**
	 * Adds the two continuous trench walls beside a straight rail pair.
	 *
	 * @param cache cache receiving generated faces
	 * @param ownerRail authoritative rail supplying facing and owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param alongZ whether the straight length axis is local Z
	 */
	static void addStraightPocketWalls(EmbeddedHostRenderCache cache, TileTCRail ownerRail,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double raisedTop, double pocketTop,
			boolean alongZ)
	{
		double leftPocketMin = Math.max(0.0D, STRAIGHT_RAIL_LEFT - STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH);
		double leftPocketMax = Math.min(1.0D, STRAIGHT_RAIL_LEFT + RAIL_POCKET_HALF_WIDTH);
		double rightPocketMin = Math.max(0.0D, STRAIGHT_RAIL_RIGHT - RAIL_POCKET_HALF_WIDTH);
		double rightPocketMax = Math.min(1.0D, STRAIGHT_RAIL_RIGHT + STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH);
		addStraightPocketWall(cache, ownerRail, hostBlock, block, pocketTop, raisedTop, leftPocketMin, true, alongZ);
		addStraightPocketWall(cache, ownerRail, hostBlock, block, pocketTop, raisedTop, leftPocketMax, false, alongZ);
		addStraightPocketWall(cache, ownerRail, hostBlock, block, pocketTop, raisedTop, rightPocketMin, true, alongZ);
		addStraightPocketWall(cache, ownerRail, hostBlock, block, pocketTop, raisedTop, rightPocketMax, false, alongZ);
	}

	/**
	 * Emits continuous straight cross-track bands instead of a grid of visibly repeated texture strips.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible rail tile supplying facing and owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 */
	static void addStraightBandProfileFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double minY, double raisedTop, double pocketTop)
	{
		/*
		 * A straight embedded profile is five cross-track bands:
		 * shoulder, rail pocket, center median, rail pocket, shoulder.
		 * The lowered pocket bands leave room for the rail model; the raised
		 * bands render as host material around it.
		 */
		boolean alongZ = railTile.getFacing() == 0 || railTile.getFacing() == 2 || railTile.getFacing() > 3;
		double leftPocketMin = Math.max(0.0D, STRAIGHT_RAIL_LEFT - STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH);
		double leftPocketMax = Math.min(1.0D, STRAIGHT_RAIL_LEFT + RAIL_POCKET_HALF_WIDTH);
		double rightPocketMin = Math.max(0.0D, STRAIGHT_RAIL_RIGHT - RAIL_POCKET_HALF_WIDTH);
		double rightPocketMax = Math.min(1.0D, STRAIGHT_RAIL_RIGHT + STRAIGHT_RAIL_OUTSIDE_HALF_WIDTH);

		addStraightProfileBand(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop, 0.0D, leftPocketMin, alongZ);
		addStraightProfileBand(cache, railTile, hostKeys, hostBlock, block, minY, pocketTop, leftPocketMin, leftPocketMax, alongZ);
		addStraightProfileBand(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop, leftPocketMax, rightPocketMin, alongZ);
		addStraightProfileBand(cache, railTile, hostKeys, hostBlock, block, minY, pocketTop, rightPocketMin, rightPocketMax, alongZ);
		addStraightProfileBand(cache, railTile, hostKeys, hostBlock, block, minY, raisedTop, rightPocketMax, 1.0D, alongZ);

		HostShape bottomShape = new HostShape(0.0D, minY, 0.0D, 1.0D, minY + RENDER_EPSILON, 1.0D, true);
		addFace(cache, railTile, hostKeys, hostBlock, block, bottomShape,
				BLOCK_SIDE_BOTTOM, 0, -1, 0, SHADE_BOTTOM_FACE);

		addStraightPocketWall(cache, railTile, hostBlock, block, pocketTop, raisedTop, leftPocketMin, true, alongZ);
		addStraightPocketWall(cache, railTile, hostBlock, block, pocketTop, raisedTop, leftPocketMax, false, alongZ);
		addStraightPocketWall(cache, railTile, hostBlock, block, pocketTop, raisedTop, rightPocketMin, true, alongZ);
		addStraightPocketWall(cache, railTile, hostBlock, block, pocketTop, raisedTop, rightPocketMax, false, alongZ);
	}

	/**
	 * Adds one raised or lowered straight band with its required top, bottom, and outside faces.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param topY band-top local Y coordinate, in blocks
	 * @param minCross lower cross-track boundary within the host cell, in blocks
	 * @param maxCross upper cross-track boundary within the host cell, in blocks
	 * @param alongZ whether the band length axis is local Z
	 */
	static void addStraightProfileBand(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double minY, double topY,
			double minCross, double maxCross, boolean alongZ)
	{
		if (topY <= minY || maxCross <= minCross)
		{
			return;
		}
		HostShape shape = alongZ
				? new HostShape(minCross, minY, 0.0D, maxCross, topY, 1.0D, true)
				: new HostShape(0.0D, minY, minCross, 1.0D, topY, maxCross, true);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_TOP, 0, 1, 0, SHADE_TOP_FACE);
		// Only render real outside/end faces here; trench walls are added separately so adjacent bands do not fight.
		if (alongZ)
		{
			addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
					BLOCK_SIDE_NORTH, 0, -1, SHADE_Z_FACE);
			addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
					BLOCK_SIDE_SOUTH, 0, 1, SHADE_Z_FACE);
			if (minCross <= GEOMETRY_EPSILON)
			{
				addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
						BLOCK_SIDE_WEST, -1, 0, SHADE_X_FACE);
			}
			if (maxCross >= 1.0D - GEOMETRY_EPSILON)
			{
				addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
						BLOCK_SIDE_EAST, 1, 0, SHADE_X_FACE);
			}
		}
		else
		{
			addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
					BLOCK_SIDE_WEST, -1, 0, SHADE_X_FACE);
			addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
					BLOCK_SIDE_EAST, 1, 0, SHADE_X_FACE);
			if (minCross <= GEOMETRY_EPSILON)
			{
				addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
						BLOCK_SIDE_NORTH, 0, -1, SHADE_Z_FACE);
			}
			if (maxCross >= 1.0D - GEOMETRY_EPSILON)
			{
				addStraightBandSideFace(cache, railTile, hostKeys, hostBlock, block, shape,
						BLOCK_SIDE_SOUTH, 0, 1, SHADE_Z_FACE);
			}
		}
	}

	/**
	 * Adds one external side of a straight profile band when the neighboring shape does not cover it.
	 *
	 * @param cache cache receiving the side face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param shape tile-local band bounds
	 * @param side Minecraft block-side index
	 * @param normalX outward owner-grid X offset to the neighboring cell
	 * @param normalZ outward owner-grid Z offset to the neighboring cell
	 * @param shade vanilla directional shade multiplier
	 */
	static void addStraightBandSideFace(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, HostShape shape, int side, int normalX, int normalZ, float shade)
	{
		// Custom side quads keep one stable side projection across the whole band, which matters for asymmetric textures.
		addCustomVerticalFace(cache, railTile, hostKeys, hostBlock, block, shape,
				side, side, normalX, normalZ, shade, true);
	}

	/**
	 * Adds one vertical wall at a straight rail pocket boundary.
	 *
	 * @param cache cache receiving the wall face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lower local wall Y coordinate, in blocks
	 * @param maxY upper local wall Y coordinate, in blocks
	 * @param cross cross-track wall coordinate within the host cell, in blocks
	 * @param pocketPositiveSide whether the pocket lies on the positive side of {@code cross}
	 * @param alongZ whether the wall length axis is local Z
	 */
	static void addStraightPocketWall(EmbeddedHostRenderCache cache, TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, double minY, double maxY, double cross, boolean pocketPositiveSide, boolean alongZ)
	{
		int side;
		HostShape shape;
		int normalX = 0;
		int normalZ = 0;
		if (alongZ)
		{
			side = pocketPositiveSide ? BLOCK_SIDE_EAST : BLOCK_SIDE_WEST;
			shape = new HostShape(cross, minY, 0.0D, cross, maxY, 1.0D, false);
			normalX = pocketPositiveSide ? 1 : -1;
		}
		else
		{
			side = pocketPositiveSide ? BLOCK_SIDE_SOUTH : BLOCK_SIDE_NORTH;
			shape = new HostShape(0.0D, minY, cross, 1.0D, maxY, cross, false);
			normalZ = pocketPositiveSide ? 1 : -1;
		}
		addInternalProfileWallFace(cache, railTile, hostBlock, block, shape,
				side, normalX, normalZ, getSideShade(side));
	}

	/**
	 * Returns vanilla's directional shade multiplier for a Minecraft block side.
	 *
	 * @param side Minecraft block-side index
	 * @return directional brightness multiplier from zero to one
	 */
	static float getSideShade(int side)
	{
		return side == BLOCK_SIDE_NORTH || side == BLOCK_SIDE_SOUTH ? SHADE_Z_FACE : SHADE_X_FACE;
	}

	/**
	 * Merges sampled top or underside cells into the largest compatible horizontal rectangles.
	 * Top faces merge only equal-height samples; underside faces merge every occupied sample because
	 * they share the captured host's minimum Y coordinate.
	 *
	 * @param cache cache receiving generated horizontal faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param heights sampled local surface heights indexed by X and Z
	 * @param gridSize number of sampled cells along each host-cell axis
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param topFace whether to emit raised top faces instead of the shared underside
	 */
	static void addMergedHorizontalFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double[][] heights,
			int gridSize, double minY, boolean topFace)
	{
		addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, heights, gridSize, minY,
				topFace, null);
	}

	/**
	 * Runs the existing rectangle merger and either emits faces or captures its exact top output.
	 *
	 * @param cache cache receiving generated faces, or {@code null} while capturing
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param heights sampled local surface heights indexed by X and Z
	 * @param gridSize number of sampled cells along each host-cell axis
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param topFace whether to emit raised top faces instead of the shared underside
	 * @param collector optional reusable-top collector
	 */
	static void addMergedHorizontalFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double[][] heights,
			int gridSize, double minY, boolean topFace, ModelSwitchTopCollector collector)
	{
		boolean[][] consumed = new boolean[gridSize][gridSize];
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				if (consumed[xIndex][zIndex] || heights[xIndex][zIndex] <= minY)
				{
					continue;
				}
				double height = heights[xIndex][zIndex];
				int maxXIndex = xIndex + 1;
				while (maxXIndex < gridSize && consumed[maxXIndex][zIndex] == false
						&& canMergeHorizontalSample(heights[maxXIndex][zIndex], height, minY, topFace))
				{
					maxXIndex++;
				}
				int maxZIndex = zIndex + 1;
				boolean expand = true;
				while (expand && maxZIndex < gridSize)
				{
					for (int mergedXIndex = xIndex; mergedXIndex < maxXIndex; mergedXIndex++)
					{
						if (consumed[mergedXIndex][maxZIndex]
								|| canMergeHorizontalSample(heights[mergedXIndex][maxZIndex], height, minY, topFace) == false)
						{
							expand = false;
							break;
						}
					}
					if (expand)
					{
						maxZIndex++;
					}
				}
				for (int mergedXIndex = xIndex; mergedXIndex < maxXIndex; mergedXIndex++)
				{
					for (int mergedZIndex = zIndex; mergedZIndex < maxZIndex; mergedZIndex++)
					{
						consumed[mergedXIndex][mergedZIndex] = true;
					}
				}
				double maxY = topFace ? height : minY + RENDER_EPSILON;
				double minX = xIndex / (double)gridSize;
				double minZ = zIndex / (double)gridSize;
				double maxX = maxXIndex / (double)gridSize;
				double maxZ = maxZIndex / (double)gridSize;
				if (collector != null && topFace)
				{
					collector.addRectangle(minX, minZ, maxX, maxZ, maxY);
					continue;
				}
				HostShape shape = new HostShape(
						minX,
						minY,
						minZ,
						maxX,
						maxY,
						maxZ,
						true);
				int side = topFace ? BLOCK_SIDE_TOP : BLOCK_SIDE_BOTTOM;
				int normalY = topFace ? 1 : -1;
				float shade = topFace ? SHADE_TOP_FACE : SHADE_BOTTOM_FACE;
				addFace(cache, railTile, hostKeys, hostBlock, block, shape, side, 0, normalY, 0, shade);
			}
		}
	}

	/**
	 * Returns whether one sampled cell can join the current horizontal rectangle.
	 *
	 * @param sampleHeight candidate cell's local surface Y coordinate, in blocks
	 * @param referenceHeight first cell's local surface Y coordinate, in blocks
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param topFace whether equality is required for a visible top surface
	 * @return whether the candidate is occupied and compatible with the requested face direction
	 */
	static boolean canMergeHorizontalSample(double sampleHeight, double referenceHeight,
			double minY, boolean topFace)
	{
		return topFace ? sameHeight(sampleHeight, referenceHeight) : sampleHeight > minY;
	}

	/**
	 * Adds height-transition walls between neighboring sampled profile cells.
	 *
	 * @param cache cache receiving generated wall faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param heights sampled local surface heights
	 * @param gridSize number of samples along each host-cell axis
	 * @param minY lowest rendered local Y coordinate, in blocks
	 */
	static void addProfileWallFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, double[][] heights, int gridSize, double minY)
	{
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				double height = heights[xIndex][zIndex];
				if (height <= minY)
				{
					continue;
				}
				double minX = xIndex / (double) gridSize;
				double maxX = (xIndex + 1) / (double) gridSize;
				double minZ = zIndex / (double) gridSize;
				double maxZ = (zIndex + 1) / (double) gridSize;
				HostShape cellShape = new HostShape(minX, minY, minZ, maxX, height, maxZ, true);
				addSampledSideFace(cache, railTile, hostKeys, hostBlock, block, cellShape, heights, gridSize, xIndex, zIndex, -1, 0, 4, minY, height);
				addSampledSideFace(cache, railTile, hostKeys, hostBlock, block, cellShape, heights, gridSize, xIndex, zIndex, 1, 0, 5, minY, height);
				addSampledSideFace(cache, railTile, hostKeys, hostBlock, block, cellShape, heights, gridSize, xIndex, zIndex, 0, -1, 2, minY, height);
				addSampledSideFace(cache, railTile, hostKeys, hostBlock, block, cellShape, heights, gridSize, xIndex, zIndex, 0, 1, 3, minY, height);
			}
		}
	}

	/**
	 * Returns whether two generated heights are close enough to share one surface.
	 *
	 * @param firstHeight first local Y coordinate, in blocks
	 * @param secondHeight second local Y coordinate, in blocks
	 * @return whether the difference is within the geometry tolerance
	 */
	static boolean sameHeight(double firstHeight, double secondHeight)
	{
		return Math.abs(firstHeight - secondHeight) <= GEOMETRY_EPSILON;
	}

	/**
	 * Adds curved-profile exterior sides while leaving smooth interior walls to the overlay path.
	 *
	 * @param cache cache receiving generated side faces
	 * @param railTile visible rail tile supplying curve and owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param angleMask visible curve intervals
	 */
	static void addCurvedExternalSideFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, double minY, double raisedTop, double pocketTop, AngleMask angleMask)
	{
		HostShape shape = new HostShape(0.0D, minY, 0.0D, 1.0D, raisedTop, 1.0D, false);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_NORTH, 0, 0, -1, SHADE_Z_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_SOUTH, 0, 0, 1, SHADE_Z_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_WEST, -1, 0, 0, SHADE_X_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_EAST, 1, 0, 0, SHADE_X_FACE);
	}

	/**
	 * Merges a run of equal sampled edge heights into one exposed host side face.
	 *
	 * @param cache cache receiving the generated side face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param cellShape local bounds of the sampled run
	 * @param heights sampled local surface heights
	 * @param gridSize number of samples along each host-cell axis
	 * @param xIndex first sample index along local X
	 * @param zIndex first sample index along local Z
	 * @param neighborOffsetX X offset to the sample outside the face
	 * @param neighborOffsetZ Z offset to the sample outside the face
	 * @param side Minecraft block-side index
	 * @param hostMinY lowest rendered local Y coordinate, in blocks
	 * @param height upper local Y coordinate of the side run, in blocks
	 */
	static void addSampledSideFace(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, HostShape cellShape, double[][] heights, int gridSize, int xIndex, int zIndex,
			int neighborOffsetX, int neighborOffsetZ, int side, double hostMinY, double height)
	{
		/*
		 * The sampled path is still used for switch/slope support faces and other
		 * non-straight fallback geometry. It compares neighboring sampled heights
		 * before deciding whether a wall exists, which is why these faces bypass
		 * the generic binary cuboid cull after this method has clipped them.
		 */
		int neighborX = xIndex + neighborOffsetX;
		int neighborZ = zIndex + neighborOffsetZ;
		boolean internalProfileWall = neighborX >= 0 && neighborX < gridSize && neighborZ >= 0 && neighborZ < gridSize;
		double neighborHeight = hostMinY;
		if (internalProfileWall)
		{
			neighborHeight = heights[neighborX][neighborZ];
		}
		else
		{
			String neighborKey = TileTCRailHostData.key(hostBlock.offsetX + neighborOffsetX, hostBlock.offsetY,
					hostBlock.offsetZ + neighborOffsetZ);
			int neighborWorldX = railTile.xCoord + hostBlock.offsetX + neighborOffsetX;
			int neighborWorldY = railTile.yCoord + hostBlock.offsetY;
			int neighborWorldZ = railTile.zCoord + hostBlock.offsetZ + neighborOffsetZ;
			TileTCRailHostData.CapturedHostBlock neighborHostBlock = getCapturedHostBlockAtWorld(railTile, neighborWorldX, neighborWorldY, neighborWorldZ);
			if (neighborHostBlock != null)
			{
				Block neighborBlock = Block.getBlockById(neighborHostBlock.blockId);
				double neighborMinY = neighborBlock != null ? getHostMinY(neighborBlock, neighborHostBlock.metadata) : 0.0D;
				if (neighborMinY <= hostMinY + FACE_HEIGHT_EPSILON)
				{
					return;
				}
				height = Math.min(height, neighborMinY);
				neighborHeight = hostMinY;
			}
			else if (hostKeys.contains(neighborKey)
					|| isOccludedByNeighbor(railTile, hostBlock, neighborOffsetX, 0, neighborOffsetZ))
			{
				return;
			}
		}
		if (height - neighborHeight <= FACE_HEIGHT_EPSILON)
		{
			return;
		}

		HostShape wallShape = new HostShape(cellShape.minX, Math.max(hostMinY, neighborHeight), cellShape.minZ,
				cellShape.maxX, height, cellShape.maxZ, false);
		switch (side)
		{
			case BLOCK_SIDE_NORTH:
				wallShape = new HostShape(cellShape.minX, Math.max(hostMinY, neighborHeight), cellShape.minZ,
						cellShape.maxX, height, cellShape.minZ, false);
				break;
			case BLOCK_SIDE_SOUTH:
				wallShape = new HostShape(cellShape.minX, Math.max(hostMinY, neighborHeight), cellShape.maxZ,
						cellShape.maxX, height, cellShape.maxZ, false);
				break;
			case BLOCK_SIDE_WEST:
				wallShape = new HostShape(cellShape.minX, Math.max(hostMinY, neighborHeight), cellShape.minZ,
						cellShape.minX, height, cellShape.maxZ, false);
				break;
			case BLOCK_SIDE_EAST:
				wallShape = new HostShape(cellShape.maxX, Math.max(hostMinY, neighborHeight), cellShape.minZ,
						cellShape.maxX, height, cellShape.maxZ, false);
				break;
			default:
				break;
		}
		if (internalProfileWall)
		{
			addInternalProfileWallFace(cache, railTile, hostBlock, block, wallShape, side,
					neighborOffsetX, neighborOffsetZ, getSideShade(side));
		}
		else
		{
			addFace(cache, railTile, hostKeys, hostBlock, block, wallShape, side,
					neighborOffsetX, 0, neighborOffsetZ, getSideShade(side), false);
		}
	}

	/**
	 * Adds one internal wall between raised host terrain and a lowered sampled pocket.
	 *
	 * @param cache cache receiving the generated wall
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param shape local wall bounds
	 * @param side Minecraft block-side index
	 * @param normalX wall normal X component
	 * @param normalZ wall normal Z component
	 * @param shade vanilla directional shade multiplier
	 */
	static void addInternalProfileWallFace(EmbeddedHostRenderCache cache, TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, HostShape shape, int side, int normalX, int normalZ, float shade)
	{
		addCustomVerticalFace(cache, railTile, null, hostBlock, block, shape,
				side, side, normalX, normalZ, shade, false);
	}

	/**
	 * Adds a custom vertical quad with stable side texture projection and optional exterior culling.
	 *
	 * @param cache cache receiving the generated face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param shape local wall bounds
	 * @param side Minecraft block-side index controlling geometry, winding, and lighting
	 * @param textureSide Minecraft block-side index whose captured icon is projected onto the wall
	 * @param normalX outward owner-grid X offset or custom wall normal component
	 * @param normalZ outward owner-grid Z offset or custom wall normal component
	 * @param shade vanilla directional shade multiplier
	 * @param cullExternalFace whether a covered cell-boundary face may be omitted
	 */
	static void addCustomVerticalFace(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, HostShape shape,
			int side, int textureSide, int normalX, int normalZ, float shade, boolean cullExternalFace)
	{
		/*
		 * This emits axis-aligned vertical faces using explicit side numbers.
		 * X faces project U from local Z; Z faces project U from local X in
		 * getCustomSideU(...). That mirrors vanilla cube orientation closely
		 * enough for logs, bricks, slabs, and full-picture custom textures.
		 */
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, textureSide);
		if (icon == null)
		{
			return;
		}
		if (cullExternalFace && isExternalBlockFace(shape, side))
		{
			if (isExternalFaceCovered(railTile, hostBlock, shape, side, normalX, 0, normalZ))
			{
				return;
			}
		}
		switch (side)
		{
			case BLOCK_SIDE_NORTH:
				cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon, side, normalX, 0, normalZ, shade,
						new QuadVertices(
						shape.minX, shape.maxY, shape.minZ,
						shape.maxX, shape.maxY, shape.minZ,
						shape.maxX, shape.minY, shape.minZ,
						shape.minX, shape.minY, shape.minZ)));
				break;
			case BLOCK_SIDE_SOUTH:
				cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon, side, normalX, 0, normalZ, shade,
						new QuadVertices(
						shape.maxX, shape.maxY, shape.maxZ,
						shape.minX, shape.maxY, shape.maxZ,
						shape.minX, shape.minY, shape.maxZ,
						shape.maxX, shape.minY, shape.maxZ)));
				break;
			case BLOCK_SIDE_WEST:
				cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon, side, normalX, 0, normalZ, shade,
						new QuadVertices(
						shape.minX, shape.maxY, shape.maxZ,
						shape.minX, shape.maxY, shape.minZ,
						shape.minX, shape.minY, shape.minZ,
						shape.minX, shape.minY, shape.maxZ)));
				break;
			case BLOCK_SIDE_EAST:
				cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon, side, normalX, 0, normalZ, shade,
						new QuadVertices(
						shape.maxX, shape.maxY, shape.minZ,
						shape.maxX, shape.maxY, shape.maxZ,
						shape.maxX, shape.minY, shape.maxZ,
						shape.maxX, shape.minY, shape.minZ)));
				break;
			default:
				break;
		}
	}

	/**
	 * Returns the X component of one Minecraft block side's outward normal.
	 *
	 * @param side Minecraft block-side index
	 * @return outward X component: minus one, zero, or one
	 */
	static int getSideNormalX(int side)
	{
		if (side == BLOCK_SIDE_WEST)
		{
			return -1;
		}
		return side == BLOCK_SIDE_EAST ? 1 : 0;
	}

	/**
	 * Returns the Z component of one Minecraft block side's outward normal.
	 *
	 * @param side Minecraft block-side index
	 * @return outward Z component: minus one, zero, or one
	 */
	static int getSideNormalZ(int side)
	{
		if (side == BLOCK_SIDE_NORTH)
		{
			return -1;
		}
		return side == BLOCK_SIDE_SOUTH ? 1 : 0;
	}

	/**
	 * Adds exterior host sides for a diagonal trench using its exact clipped boundaries.
	 *
	 * @param cache cache receiving generated side faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 */
	static void addDiagonalExternalSideFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, double minY, double raisedTop)
	{
		if (raisedTop <= minY)
		{
			return;
		}
		HostShape shape = new HostShape(0.0D, minY, 0.0D, 1.0D, raisedTop, 1.0D, false);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_NORTH, 0, 0, -1, SHADE_Z_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_SOUTH, 0, 0, 1, SHADE_Z_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_WEST, -1, 0, 0, SHADE_X_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_EAST, 1, 0, 0, SHADE_X_FACE);
	}

	/**
	 * Clips smooth diagonal raised bands to one host cell and emits their top faces.
	 *
	 * @param cache cache receiving generated top faces
	 * @param railTile visible rail tile supplying facing and owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 */
	static void addDiagonalTopOverlayFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, int metadata, double raisedTop, double pocketTop)
	{
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_TOP);
		if (icon == null)
		{
			return;
		}
		LineXZ line = getDiagonalLine(railTile.getFacing(), hostBlock);
		double lowPocketMin = -DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH;
		double lowPocketMax = -DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH;
		double highPocketMin = DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH;
		double highPocketMax = DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH;

		addRaisedDiagonalTopBand(cache, hostBlock, block, icon, line, Double.NEGATIVE_INFINITY, lowPocketMin, raisedTop + FACE_HEIGHT_EPSILON);
		addRaisedDiagonalTopBand(cache, hostBlock, block, icon, line, lowPocketMin, lowPocketMax, pocketTop + FACE_HEIGHT_EPSILON);
		addRaisedDiagonalTopBand(cache, hostBlock, block, icon, line, lowPocketMax, highPocketMin, raisedTop + FACE_HEIGHT_EPSILON);
		addRaisedDiagonalTopBand(cache, hostBlock, block, icon, line, highPocketMin, highPocketMax, pocketTop + FACE_HEIGHT_EPSILON);
		addRaisedDiagonalTopBand(cache, hostBlock, block, icon, line, highPocketMax, Double.POSITIVE_INFINITY, raisedTop + FACE_HEIGHT_EPSILON);
	}

	/**
	 * Adds continuous diagonal pocket walls along the four rail-clearance boundaries.
	 *
	 * @param cache cache receiving generated wall faces
	 * @param railTile visible rail tile supplying facing and owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 */
	static void addDiagonalPocketWallFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, int metadata, double raisedTop, double pocketTop)
	{
		// Diagonal pocket walls are not axis-aligned, so they use segment-distance UVs rather than side projection.
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH);
		if (icon == null)
		{
			return;
		}
		LineXZ line = getDiagonalLine(railTile.getFacing(), hostBlock);
		double[] edgeCoordinates = new double[] {
				-DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH,
				-DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH
		};
		for (double edgeCoordinate : edgeCoordinates)
		{
			SegmentXZ segment = EmbeddedHostGeometry.getLineSegmentInUnitSquare(line, edgeCoordinate);
			if (segment == null)
			{
				continue;
			}
			cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon,
					OBLIQUE_WALL_FACE, 0, 1, 0, SHADE_OBLIQUE_WALL, new QuadVertices(
					segment.start.x, raisedTop, segment.start.z,
					segment.end.x, raisedTop, segment.end.z,
					segment.end.x, pocketTop, segment.end.z,
					segment.start.x, pocketTop, segment.start.z)));
		}
	}

	/**
	 * Returns the facing-adjusted diagonal line equation in one host cell's local coordinate space.
	 *
	 * @param facing Traincraft diagonal facing
	 * @param hostBlock captured host cell supplying its visible-tile-relative offset
	 * @return diagonal line equation expressed in local host-cell coordinates
	 */
	static LineXZ getDiagonalLine(int facing, TileTCRailHostData.CapturedHostBlock hostBlock)
	{
		switch (facing)
		{
			case 4:
				return new LineXZ(1.0D, 1.0D, hostBlock.offsetX + hostBlock.offsetZ - 1.0D);
			case 5:
				return new LineXZ(-1.0D, 1.0D, hostBlock.offsetZ - hostBlock.offsetX);
			case 6:
				return new LineXZ(-1.0D, -1.0D, 1.0D - hostBlock.offsetX - hostBlock.offsetZ);
			case 7:
			default:
				return new LineXZ(1.0D, -1.0D, hostBlock.offsetX - hostBlock.offsetZ);
		}
	}

	/**
	 * Clips one interval between parallel diagonal lines and triangulates its raised top.
	 *
	 * @param cache cache receiving generated top faces
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param icon captured host top texture
	 * @param line facing-adjusted diagonal line equation
	 * @param minLine lower signed line-coordinate boundary, in blocks
	 * @param maxLine upper signed line-coordinate boundary, in blocks
	 * @param surfaceY local Y coordinate of the generated top, in blocks
	 */
	static void addRaisedDiagonalTopBand(EmbeddedHostRenderCache cache, TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			LineXZ line, double minLine, double maxLine, double surfaceY)
	{
		PointXZ[] polygon = new PointXZ[] {
				new PointXZ(0.0D, 0.0D),
				new PointXZ(1.0D, 0.0D),
				new PointXZ(1.0D, 1.0D),
				new PointXZ(0.0D, 1.0D)
		};
		int count = polygon.length;
		if (Double.isInfinite(minLine) == false)
		{
			ClipResult clipped = EmbeddedHostGeometry.clipPolygonByLine(polygon, count, line, minLine, true);
			polygon = clipped.getPoints();
			count = clipped.getCount();
		}
		if (count < 3)
		{
			return;
		}
		if (Double.isInfinite(maxLine) == false)
		{
			ClipResult clipped = EmbeddedHostGeometry.clipPolygonByLine(polygon, count, line, maxLine, false);
			polygon = clipped.getPoints();
			count = clipped.getCount();
		}
		if (count < 3)
		{
			return;
		}
		addTopPolygonFan(cache, hostBlock, block, icon, polygon, count, surfaceY);
	}

	/**
	 * Builds smooth circular top bands for a curved track and clips them to one host cell.
	 *
	 * @param cache cache receiving generated top faces
	 * @param railTile visible rail tile supplying curve and owner coordinates
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param angleMask visible curve intervals
	 */
	static void addCurvedTopOverlayFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, int metadata, double raisedTop, double pocketTop, AngleMask angleMask)
	{
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_TOP);
		if (icon == null)
		{
			return;
		}
		double centerX = railTile.cx - (railTile.xCoord + hostBlock.offsetX);
		double centerZ = railTile.cz - (railTile.zCoord + hostBlock.offsetZ);
		double maxRadius = getMaxRadiusToUnitSquare(centerX, centerZ) + 0.01D;
		double innerPocketCenter = Math.max(0.0D, railTile.r - RAIL_OFFSET_FROM_CENTER);
		double outerPocketCenter = getCurveOuterRailPocketCenter(railTile);
		double pocketHalfWidth = getCurveRailPocketHalfWidth(railTile);
		double outerRailInsideHalfWidth = getCurveOuterRailInsideHalfWidth(railTile);
		double outerRailOutsideHalfWidth = getCurveOuterRailOutsideHalfWidth(railTile);
		double innerPocketMin = Math.max(0.0D, innerPocketCenter - pocketHalfWidth);
		double innerPocketMax = innerPocketCenter + pocketHalfWidth;
		double outerPocketMin = Math.max(0.0D, outerPocketCenter - outerRailInsideHalfWidth);
		double outerPocketMax = outerPocketCenter + outerRailOutsideHalfWidth;

		addCurvedTopBand(cache, hostBlock, block, icon, centerX, centerZ, 0.0D, innerPocketMin, raisedTop + FACE_HEIGHT_EPSILON, angleMask);
		addCurvedTopBand(cache, hostBlock, block, icon, centerX, centerZ, innerPocketMin, innerPocketMax, pocketTop + FACE_HEIGHT_EPSILON, angleMask);
		addCurvedTopBand(cache, hostBlock, block, icon, centerX, centerZ, innerPocketMax, outerPocketMin, raisedTop + FACE_HEIGHT_EPSILON, angleMask);
		addCurvedTopBand(cache, hostBlock, block, icon, centerX, centerZ, outerPocketMin, outerPocketMax, pocketTop + FACE_HEIGHT_EPSILON, angleMask);
		addCurvedTopBand(cache, hostBlock, block, icon, centerX, centerZ, outerPocketMax, maxRadius, raisedTop + FACE_HEIGHT_EPSILON, angleMask);
	}

	/**
	 * Adds smooth circular walls along every visible curved rail-pocket boundary.
	 *
	 * @param cache cache receiving generated wall faces
	 * @param railTile visible rail tile supplying curve and owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param metadata captured host block metadata
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param angleMask visible curve intervals
	 */
	static void addCurvedPocketWallFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, int metadata, double raisedTop, double pocketTop, AngleMask angleMask)
	{
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH);
		if (icon == null)
		{
			return;
		}
		double centerX = railTile.cx - (railTile.xCoord + hostBlock.offsetX);
		double centerZ = railTile.cz - (railTile.zCoord + hostBlock.offsetZ);
		double innerPocketCenter = Math.max(0.0D, railTile.r - RAIL_OFFSET_FROM_CENTER);
		double outerPocketCenter = getCurveOuterRailPocketCenter(railTile);
		double pocketHalfWidth = getCurveRailPocketHalfWidth(railTile);
		double outerRailInsideHalfWidth = getCurveOuterRailInsideHalfWidth(railTile);
		double outerRailOutsideHalfWidth = getCurveOuterRailOutsideHalfWidth(railTile);
		addCurvedRadiusWall(cache, railTile, hostKeys, hostBlock, block, icon, centerX, centerZ, Math.max(0.0D, innerPocketCenter - pocketHalfWidth), raisedTop, pocketTop, angleMask);
		addCurvedRadiusWall(cache, railTile, hostKeys, hostBlock, block, icon, centerX, centerZ, innerPocketCenter + pocketHalfWidth, raisedTop, pocketTop, angleMask);
		addCurvedRadiusWall(cache, railTile, hostKeys, hostBlock, block, icon, centerX, centerZ, Math.max(0.0D, outerPocketCenter - outerRailInsideHalfWidth), raisedTop, pocketTop, angleMask);
		addCurvedRadiusWall(cache, railTile, hostKeys, hostBlock, block, icon, centerX, centerZ, outerPocketCenter + outerRailOutsideHalfWidth, raisedTop, pocketTop, angleMask);
	}

	/**
	 * Tessellates one annular top band over an allowed angular interval.
	 *
	 * @param cache cache receiving generated top faces
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param icon captured host top texture
	 * @param centerX curve-center X coordinate relative to the host cell, in blocks
	 * @param centerZ curve-center Z coordinate relative to the host cell, in blocks
	 * @param minRadius inner band radius, in blocks
	 * @param maxRadius outer band radius, in blocks
	 * @param surfaceY local Y coordinate of the generated top, in blocks
	 * @param angleMask visible curve intervals
	 */
	static void addCurvedTopBand(EmbeddedHostRenderCache cache, TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double centerX, double centerZ, double minRadius, double maxRadius, double surfaceY, AngleMask angleMask)
	{
		if (maxRadius <= minRadius + GEOMETRY_EPSILON)
		{
			return;
		}
		int segments = CURVE_PROFILE_SEGMENTS;
		for (int segment = 0; segment < segments; segment++)
		{
			double angle0 = segment * Math.PI * 2.0D / segments;
			double angle1 = (segment + 1) * Math.PI * 2.0D / segments;
			if (angleMask != null && angleMask.isAllowed((angle0 + angle1) * 0.5D) == false)
			{
				continue;
			}
			PointXZ[] polygon = new PointXZ[] {
					pointOnCircle(centerX, centerZ, minRadius, angle0),
					pointOnCircle(centerX, centerZ, maxRadius, angle0),
					pointOnCircle(centerX, centerZ, maxRadius, angle1),
					pointOnCircle(centerX, centerZ, minRadius, angle1)
			};
			addClippedTopPolygon(cache, hostBlock, block, icon, polygon, polygon.length, surfaceY);
		}
	}

	/**
	 * Tessellates and clips a vertical wall following one circular radius.
	 *
	 * @param cache cache receiving generated wall faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param icon captured host side texture
	 * @param centerX curve-center X coordinate relative to the host cell, in blocks
	 * @param centerZ curve-center Z coordinate relative to the host cell, in blocks
	 * @param radius wall radius, in blocks
	 * @param raisedTop upper local wall Y coordinate, in blocks
	 * @param pocketTop lower local wall Y coordinate, in blocks
	 * @param angleMask visible curve intervals
	 */
	static void addCurvedRadiusWall(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double centerX, double centerZ, double radius, double raisedTop, double pocketTop, AngleMask angleMask)
	{
		if (radius <= GEOMETRY_EPSILON)
		{
			return;
		}
		int segments = CURVE_PROFILE_SEGMENTS;
		for (int segment = 0; segment < segments; segment++)
		{
			double angle0 = segment * Math.PI * 2.0D / segments;
			double angle1 = (segment + 1) * Math.PI * 2.0D / segments;
			if (angleMask != null && angleMask.isAllowed((angle0 + angle1) * 0.5D) == false)
			{
				continue;
			}
			PointXZ segmentStart = pointOnCircle(centerX, centerZ, radius, angle0);
			PointXZ segmentEnd = pointOnCircle(centerX, centerZ, radius, angle1);
			SegmentXZ clippedSegment = EmbeddedHostGeometry.clipLineSegmentToUnitSquare(segmentStart, segmentEnd);
			if (clippedSegment == null)
			{
				continue;
			}
			segmentStart = clippedSegment.start;
			segmentEnd = clippedSegment.end;
			if (Math.abs(segmentStart.x - segmentEnd.x) < GEOMETRY_EPSILON
					&& Math.abs(segmentStart.z - segmentEnd.z) < GEOMETRY_EPSILON)
			{
				continue;
			}
			if (isUnitBoundarySegment(segmentStart, segmentEnd))
			{
				// A curved wall clipped exactly to a host-cell edge is an exterior cap, so use a real block side.
				addBoundaryPocketCap(cache, railTile, hostKeys, hostBlock, block,
						segmentStart, segmentEnd, raisedTop, pocketTop);
				continue;
			}
			cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon,
					OBLIQUE_WALL_FACE, 0, 1, 0, SHADE_OBLIQUE_WALL, new QuadVertices(
					segmentStart.x, raisedTop, segmentStart.z,
					segmentEnd.x, raisedTop, segmentEnd.z,
					segmentEnd.x, pocketTop, segmentEnd.z,
					segmentStart.x, pocketTop, segmentStart.z)));
		}
	}

	/**
	 * Returns whether both endpoints lie on the same edge of the local host-cell square.
	 *
	 * @param segmentStart first endpoint in local host-cell X/Z coordinates
	 * @param segmentEnd second endpoint in local host-cell X/Z coordinates
	 * @return whether the segment lies on one cell boundary
	 */
	static boolean isUnitBoundarySegment(PointXZ segmentStart, PointXZ segmentEnd)
	{
		return bothNear(segmentStart.x, segmentEnd.x, 0.0D)
				|| bothNear(segmentStart.x, segmentEnd.x, 1.0D)
				|| bothNear(segmentStart.z, segmentEnd.z, 0.0D)
				|| bothNear(segmentStart.z, segmentEnd.z, 1.0D);
	}

	/**
	 * Converts a clipped pocket wall on a cell edge into a cullable Minecraft side face.
	 *
	 * @param cache cache receiving the generated side face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param segmentStart first wall endpoint in local host-cell X/Z coordinates
	 * @param segmentEnd second wall endpoint in local host-cell X/Z coordinates
	 * @param raisedTop upper local wall Y coordinate, in blocks
	 * @param pocketTop lower local wall Y coordinate, in blocks
	 */
	static void addBoundaryPocketCap(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, PointXZ segmentStart, PointXZ segmentEnd, double raisedTop, double pocketTop)
	{
		int side = getBoundarySide(segmentStart, segmentEnd);
		if (side < 0)
		{
			return;
		}
		int normalX = getSideNormalX(side);
		int normalZ = getSideNormalZ(side);
		HostShape capShape = new HostShape(Math.min(segmentStart.x, segmentEnd.x), pocketTop,
				Math.min(segmentStart.z, segmentEnd.z), Math.max(segmentStart.x, segmentEnd.x), raisedTop,
				Math.max(segmentStart.z, segmentEnd.z), false);
		if (isExternalFaceCovered(railTile, hostBlock, capShape, side, normalX, 0, normalZ))
		{
			return;
		}
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, side);
		if (icon == null)
		{
			return;
		}
		cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon,
				side, normalX, 0, normalZ, getSideShade(side), new QuadVertices(
				segmentStart.x, raisedTop, segmentStart.z,
				segmentEnd.x, raisedTop, segmentEnd.z,
				segmentEnd.x, pocketTop, segmentEnd.z,
				segmentStart.x, pocketTop, segmentStart.z)));
	}

	/**
	 * Returns the Minecraft side index shared by two unit-square boundary points, or minus one.
	 *
	 * @param segmentStart first endpoint in local host-cell X/Z coordinates
	 * @param segmentEnd second endpoint in local host-cell X/Z coordinates
	 * @return shared Minecraft block-side index, or minus one when the segment is not on an edge
	 */
	static int getBoundarySide(PointXZ segmentStart, PointXZ segmentEnd)
	{
		if (bothNear(segmentStart.z, segmentEnd.z, 0.0D))
		{
			return 2;
		}
		if (bothNear(segmentStart.z, segmentEnd.z, 1.0D))
		{
			return 3;
		}
		if (bothNear(segmentStart.x, segmentEnd.x, 0.0D))
		{
			return 4;
		}
		if (bothNear(segmentStart.x, segmentEnd.x, 1.0D))
		{
			return 5;
		}
		return -1;
	}

	/**
	 * Returns whether two coordinates both lie within geometry tolerance of a target boundary.
	 *
	 * @param firstCoordinate first local coordinate, in blocks
	 * @param secondCoordinate second local coordinate, in blocks
	 * @param target expected boundary coordinate, in blocks
	 * @return whether both coordinates are within the geometry tolerance
	 */
	static boolean bothNear(double firstCoordinate, double secondCoordinate, double target)
	{
		return Math.abs(firstCoordinate - target) <= GEOMETRY_EPSILON
				&& Math.abs(secondCoordinate - target) <= GEOMETRY_EPSILON;
	}

	/**
	 * Builds the angular ranges actually occupied by the visible curved model sections.
	 *
	 * @param railTile visible rail tile supplying model endpoints and curve center
	 * @return allowed curve-angle ranges in radians, or {@code null} when endpoints are unavailable
	 */
	static AngleMask buildCurveAngleMask(TileTCRail railTile)
	{
		// Limit circular turn geometry to the angular range covered by captured host cells.
		AngleMask mask = new AngleMask();
		for (TileTCRailHostData.CapturedHostBlock hostBlock : railTile.getTrackHostRenderBlocks().values())
		{
			double minX = railTile.xCoord + hostBlock.offsetX - railTile.cx;
			double maxX = minX + 1.0D;
			double minZ = railTile.zCoord + hostBlock.offsetZ - railTile.cz;
			double maxZ = minZ + 1.0D;
			if (minX <= 0.0D && maxX >= 0.0D && minZ <= 0.0D && maxZ >= 0.0D)
			{
				mask.allowAll();
				return mask;
			}
			double[] angles = new double[] {
					normalizeAngle(Math.atan2(minZ, minX)),
					normalizeAngle(Math.atan2(minZ, maxX)),
					normalizeAngle(Math.atan2(maxZ, maxX)),
					normalizeAngle(Math.atan2(maxZ, minX)),
					normalizeAngle(Math.atan2((minZ + maxZ) * 0.5D, (minX + maxX) * 0.5D))
			};
			addSmallestCoveringAngleInterval(mask, angles, CURVE_ANGLE_MASK_PADDING);
		}
		return mask;
	}

	/**
	 * Adds the shortest circular interval covering the supplied angles, including seam-safe padding.
	 *
	 * @param mask angle mask receiving the interval
	 * @param angles curve angles in radians
	 * @param padding extra angle added at both interval ends, in radians
	 */
	static void addSmallestCoveringAngleInterval(AngleMask mask, double[] angles, double padding)
	{
		for (int angleIndex = 1; angleIndex < angles.length; angleIndex++)
		{
			double angle = angles[angleIndex];
			int previousIndex = angleIndex - 1;
			while (previousIndex >= 0 && angles[previousIndex] > angle)
			{
				angles[previousIndex + 1] = angles[previousIndex];
				previousIndex--;
			}
			angles[previousIndex + 1] = angle;
		}

		int largestGapIndex = 0;
		double largestGap = -1.0D;
		for (int angleIndex = 0; angleIndex < angles.length; angleIndex++)
		{
			double nextAngle = angles[(angleIndex + 1) % angles.length];
			double gap = angleIndex == angles.length - 1
					? nextAngle + Math.PI * 2.0D - angles[angleIndex] : nextAngle - angles[angleIndex];
			if (gap > largestGap)
			{
				largestGap = gap;
				largestGapIndex = angleIndex;
			}
		}

		double start = angles[(largestGapIndex + 1) % angles.length] - padding;
		double end = angles[largestGapIndex] + padding;
		if (end < start)
		{
			end += Math.PI * 2.0D;
		}
		mask.addInterval(start, end);
	}

	/**
	 * Normalizes an angle in radians into the zero-to-two-pi range.
	 *
	 * @param angle input angle in radians
	 * @return equivalent angle from zero, inclusive, to two pi, exclusive
	 */
	static double normalizeAngle(double angle)
	{
		double twoPi = Math.PI * 2.0D;
		angle = angle % twoPi;
		return angle < 0.0D ? angle + twoPi : angle;
	}

	/**
	 * Returns the farthest corner distance from a center to the local unit square.
	 *
	 * @param centerX center X coordinate relative to the host cell, in blocks
	 * @param centerZ center Z coordinate relative to the host cell, in blocks
	 * @return farthest corner distance, in blocks
	 */
	static double getMaxRadiusToUnitSquare(double centerX, double centerZ)
	{
		double max = 0.0D;
		max = Math.max(max, distance(centerX, centerZ, 0.0D, 0.0D));
		max = Math.max(max, distance(centerX, centerZ, 1.0D, 0.0D));
		max = Math.max(max, distance(centerX, centerZ, 1.0D, 1.0D));
		max = Math.max(max, distance(centerX, centerZ, 0.0D, 1.0D));
		return max;
	}

	/**
	 * Returns planar distance between two local X/Z positions, in blocks.
	 *
	 * @param firstX first local X coordinate, in blocks
	 * @param firstZ first local Z coordinate, in blocks
	 * @param secondX second local X coordinate, in blocks
	 * @param secondZ second local Z coordinate, in blocks
	 * @return planar distance, in blocks
	 */
	static double distance(double firstX, double firstZ, double secondX, double secondZ)
	{
		double differenceX = secondX - firstX;
		double differenceZ = secondZ - firstZ;
		return Math.sqrt(differenceX * differenceX + differenceZ * differenceZ);
	}

	/**
	 * Converts a center, radius, and radian angle into one local X/Z point.
	 *
	 * @param centerX circle-center X coordinate relative to the host cell, in blocks
	 * @param centerZ circle-center Z coordinate relative to the host cell, in blocks
	 * @param radius circle radius, in blocks
	 * @param angle angle around the circle, in radians
	 * @return point in local host-cell X/Z coordinates
	 */
	static PointXZ pointOnCircle(double centerX, double centerZ, double radius, double angle)
	{
		return new PointXZ(
				centerX + Math.cos(angle) * radius,
				centerZ + Math.sin(angle) * radius);
	}

	/**
	 * Clips a top polygon to the host cell and emits it as a fan of custom quads.
	 *
	 * @param cache cache receiving generated top faces
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param icon captured host top texture
	 * @param polygon polygon points in local host-cell X/Z coordinates
	 * @param count number of valid points in {@code polygon}
	 * @param surfaceY local Y coordinate of the generated top, in blocks
	 */
	static void addClippedTopPolygon(EmbeddedHostRenderCache cache, TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			PointXZ[] polygon, int count, double surfaceY)
	{
		addClippedTopPolygon(cache, hostBlock, block, icon, polygon, count, surfaceY, null);
	}

	/**
	 * Clips one top polygon and either emits or captures the existing fan output.
	 *
	 * @param cache cache receiving generated faces, or {@code null} while capturing
	 * @param hostBlock captured host cell being rendered, or {@code null} while capturing
	 * @param block captured host block type, or {@code null} while capturing
	 * @param icon captured host top texture, or {@code null} while capturing
	 * @param polygon polygon points in local host-cell X/Z coordinates
	 * @param count number of valid points in {@code polygon}
	 * @param surfaceY local Y coordinate of the generated top, in blocks
	 * @param collector optional reusable-top collector
	 */
	static void addClippedTopPolygon(EmbeddedHostRenderCache cache, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, IIcon icon, PointXZ[] polygon, int count, double surfaceY,
			ModelSwitchTopCollector collector)
	{
		ClipResult clipped = EmbeddedHostGeometry.clipPolygonToUnitSquare(polygon, count);
		addTopPolygonFan(cache, hostBlock, block, icon, clipped.getPoints(), clipped.getCount(), surfaceY, collector);
	}

	/**
	 * Emits a local X/Z polygon as a fan of custom top quads without applying additional clipping.
	 *
	 * @param cache cache receiving generated top faces
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param icon captured host top texture
	 * @param polygon polygon points in local host-cell X/Z coordinates
	 * @param count number of valid points in {@code polygon}
	 * @param surfaceY local Y coordinate of the generated top, in blocks
	 */
	static void addTopPolygonFan(EmbeddedHostRenderCache cache, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, IIcon icon, PointXZ[] polygon, int count, double surfaceY)
	{
		addTopPolygonFan(cache, hostBlock, block, icon, polygon, count, surfaceY, null);
	}

	/**
	 * Emits or captures the exact polygon fan generated by the existing top-face algorithm.
	 *
	 * @param cache cache receiving generated faces, or {@code null} while capturing
	 * @param hostBlock captured host cell being rendered, or {@code null} while capturing
	 * @param block captured host block type, or {@code null} while capturing
	 * @param icon captured host top texture, or {@code null} while capturing
	 * @param polygon polygon points in local host-cell X/Z coordinates
	 * @param count number of valid points in {@code polygon}
	 * @param surfaceY local Y coordinate of the generated top, in blocks
	 * @param collector optional reusable-top collector
	 */
	static void addTopPolygonFan(EmbeddedHostRenderCache cache, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, IIcon icon, PointXZ[] polygon, int count, double surfaceY,
			ModelSwitchTopCollector collector)
	{
		if (count < 3)
		{
			return;
		}
		for (int polygonIndex = 1; polygonIndex < count - 1; polygonIndex++)
		{
			QuadVertices vertices = new QuadVertices(
					polygon[0].x, surfaceY, polygon[0].z,
					polygon[polygonIndex].x, surfaceY, polygon[polygonIndex].z,
					polygon[polygonIndex + 1].x, surfaceY, polygon[polygonIndex + 1].z,
					polygon[0].x, surfaceY, polygon[0].z);
			if (collector != null)
			{
				collector.addQuad(vertices);
			}
			else
			{
				cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon,
						CUSTOM_TOP_FACE, 0, 1, 0, 1.0F, vertices));
			}
		}
	}

	/**
	 * Adds all visible sides of one axis-aligned host shape.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param shape local cuboid bounds and bottom-face policy
	 */
	static void addCuboidFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, HostShape shape)
	{
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_TOP, 0, 1, 0, SHADE_TOP_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape,
				BLOCK_SIDE_BOTTOM, 0, -1, 0, SHADE_BOTTOM_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_NORTH, 0, 0, -1, SHADE_Z_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_SOUTH, 0, 0, 1, SHADE_Z_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_WEST, -1, 0, 0, SHADE_X_FACE);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, BLOCK_SIDE_EAST, 1, 0, 0, SHADE_X_FACE);
	}

	/**
	 * Adds one cuboid face with normal exterior culling enabled.
	 *
	 * @param cache cache receiving the generated face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param shape local cuboid bounds and bottom-face policy
	 * @param side Minecraft block-side index
	 * @param normalX outward owner-grid X offset
	 * @param normalY outward owner-grid Y offset
	 * @param normalZ outward owner-grid Z offset
	 * @param shade vanilla directional shade multiplier
	 */
	static void addFace(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, HostShape shape, int side, int normalX, int normalY, int normalZ, float shade)
	{
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, side, normalX, normalY, normalZ, shade, true);
	}

	/**
	 * Adds one cuboid face after optional neighbor coverage and bottom visibility checks.
	 *
	 * @param cache cache receiving the generated face
	 * @param railTile visible rail tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param shape local cuboid bounds and bottom-face policy
	 * @param side Minecraft block-side index
	 * @param normalX outward owner-grid X offset
	 * @param normalY outward owner-grid Y offset
	 * @param normalZ outward owner-grid Z offset
	 * @param shade vanilla directional shade multiplier
	 * @param cullExternalFace whether a covered cell-boundary face may be omitted
	 */
	static void addFace(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock,
			Block block, HostShape shape, int side, int normalX, int normalY, int normalZ, float shade, boolean cullExternalFace)
	{
		if (side == BLOCK_SIDE_BOTTOM && shape.renderBottom == false)
		{
			return;
		}
		if (cullExternalFace && isExternalBlockFace(shape, side))
		{
			if (isExternalFaceCovered(railTile, hostBlock, shape, side, normalX, normalY, normalZ))
			{
				return;
			}
		}
		IIcon icon = getCapturedHostIcon(railTile, hostBlock, block, side);
		if (icon != null)
		{
			cache.mesh.addFace(EmbeddedHostFace.cuboid(hostBlock, block, icon,
					side, normalX, normalY, normalZ, shade,
					new CuboidBounds(shape.minX, shape.minY, shape.minZ, shape.maxX, shape.maxY, shape.maxZ)));
		}
	}

	/**
	 * Returns whether the selected shape face lies on its host block's outer boundary.
	 *
	 * @param shape local cuboid bounds
	 * @param side Minecraft block-side index
	 * @return whether the face lies on the zero-to-one host-cell boundary
	 */
	static boolean isExternalBlockFace(HostShape shape, int side)
	{
		switch (side)
		{
			case BLOCK_SIDE_BOTTOM:
				return shape.minY <= 0.0D;
			case BLOCK_SIDE_TOP:
				return shape.maxY >= 1.0D;
			case BLOCK_SIDE_NORTH:
				return shape.minZ <= 0.0D;
			case BLOCK_SIDE_SOUTH:
				return shape.maxZ >= 1.0D;
			case BLOCK_SIDE_WEST:
				return shape.minX <= 0.0D;
			case BLOCK_SIDE_EAST:
				return shape.maxX >= 1.0D;
			default:
				return false;
		}
	}

	/**
	 * Resolves one side icon as if the captured block still occupied the rail coordinate.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param hostBlock captured host cell supplying its visible-tile-relative offset and metadata
	 * @param block captured host block type
	 * @param side Minecraft block-side index
	 * @return captured host texture for the requested side
	 */
	static IIcon getCapturedHostIcon(TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock, Block block, int side)
	{
		return EmbeddedHostMaterialAccess.getIcon(railTile, hostBlock, block, side);
	}

	/**
	 * Returns whether an opaque world or captured host neighbor covers the complete adjacent side.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param hostBlock captured host cell being tested
	 * @param normalX owner-grid X offset to the neighboring cell
	 * @param normalY owner-grid Y offset to the neighboring cell
	 * @param normalZ owner-grid Z offset to the neighboring cell
	 * @return whether the complete adjacent side is hidden
	 */
	static boolean isOccludedByNeighbor(TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock, int normalX, int normalY, int normalZ)
	{
		return isNeighborCovered(railTile, hostBlock, null, BLOCK_SIDE_TOP, normalX, normalY, normalZ);
	}

	/**
	 * Tests shape-aware coverage so slabs do not hide exposed lower portions of neighboring full blocks.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param hostBlock captured host cell being tested
	 * @param shape local bounds of the queried face
	 * @param side Minecraft block-side index
	 * @param normalX owner-grid X offset to the neighboring cell
	 * @param normalY owner-grid Y offset to the neighboring cell
	 * @param normalZ owner-grid Z offset to the neighboring cell
	 * @return whether the adjacent world or captured shape covers the queried face
	 */
	static boolean isExternalFaceCovered(TileTCRail railTile, TileTCRailHostData.CapturedHostBlock hostBlock, HostShape shape,
			int side, int normalX, int normalY, int normalZ)
	{
		return isNeighborCovered(railTile, hostBlock, shape, side, normalX, normalY, normalZ);
	}

	/**
	 * Resolves one neighboring world coordinate and applies complete-cell or shape-aware coverage.
	 * A {@code null} queried shape requests whole-cell occlusion; a non-null shape compares the
	 * captured neighbor's vertical extent with the specific face being considered.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param hostBlock captured host cell whose neighbor is being tested
	 * @param shape local bounds of the queried face, or {@code null} for complete-cell occlusion
	 * @param side Minecraft block-side index used for shape-aware coverage
	 * @param normalX owner-grid X offset to the neighboring cell
	 * @param normalY owner-grid Y offset to the neighboring cell
	 * @param normalZ owner-grid Z offset to the neighboring cell
	 * @return whether captured host data or an opaque world block covers the adjacent side
	 */
	static boolean isNeighborCovered(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, HostShape shape,
			int side, int normalX, int normalY, int normalZ)
	{
		if (railTile.getWorldObj() == null)
		{
			return false;
		}
		int worldX = railTile.xCoord + hostBlock.offsetX + normalX;
		int worldY = railTile.yCoord + hostBlock.offsetY + normalY;
		int worldZ = railTile.zCoord + hostBlock.offsetZ + normalZ;
		TileTCRailHostData.CapturedHostBlock capturedNeighbor =
				getCapturedHostBlockAtWorld(railTile, worldX, worldY, worldZ);
		if (capturedNeighbor != null)
		{
			if (shape != null && usesRisingEmbeddedHalfHeightSurface(railTile)
					&& (side == BLOCK_SIDE_NORTH || side == BLOCK_SIDE_SOUTH
					|| side == BLOCK_SIDE_WEST || side == BLOCK_SIDE_EAST))
			{
				/*
				 * Only a captured cell belonging to this mesh continues the same ramp and fully covers the boundary.
				 * A separately owned neighboring track still ends at its level host height, so the raised part of this
				 * slope wall must remain in the mesh. Depth testing hides the portion actually covered by that neighbor.
				 */
				return isCapturedNeighborPartOfRenderedFootprint(
						railTile, hostBlock, normalX, normalY, normalZ);
			}
			if (shape != null)
			{
				return capturedHostCoversFace(capturedNeighbor, shape, side);
			}
			Block capturedBlock = Block.getBlockById(capturedNeighbor.blockId);
			return capturedBlock != null
					&& getHostMinY(capturedBlock, capturedNeighbor.metadata) <= FACE_HEIGHT_EPSILON;
		}
		/*
		 * A level neighboring world block can hide only the original zero-to-one portion of a rising host side.
		 * Keep the single sloped side quad so its part above that neighbor remains visible; depth testing hides the
		 * covered lower portion. Captured footprint neighbors are still culled by the branch above.
		 */
		if (shape != null && usesRisingEmbeddedHalfHeightSurface(railTile)
				&& (side == BLOCK_SIDE_NORTH || side == BLOCK_SIDE_SOUTH
				|| side == BLOCK_SIDE_WEST || side == BLOCK_SIDE_EAST))
		{
			return false;
		}
		Block block = railTile.getWorldObj().getBlock(worldX, worldY, worldZ);
		return block != null
				&& block.isAir(railTile.getWorldObj(), worldX, worldY, worldZ) == false && block.isOpaqueCube();
	}

	/**
	 * Returns whether a captured neighboring cell belongs to the visible rail's own rendered footprint.
	 * Captured data from a separately owned adjacent track must not suppress a rising exterior slope wall.
	 *
	 * @param railTile visible rail whose captured footprint is being rendered
	 * @param hostBlock current captured host cell
	 * @param normalX neighboring cell X offset
	 * @param normalY neighboring cell Y offset
	 * @param normalZ neighboring cell Z offset
	 * @return whether the neighbor key belongs to the same rendered footprint
	 */
	static boolean isCapturedNeighborPartOfRenderedFootprint(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, int normalX, int normalY, int normalZ)
	{
		if (railTile == null || hostBlock == null)
		{
			return false;
		}
		String neighborKey = TileTCRailHostData.key(
				hostBlock.offsetX + normalX, hostBlock.offsetY + normalY, hostBlock.offsetZ + normalZ);
		return railTile.getTrackHostRenderBlocks().containsKey(neighborKey);
	}

	/**
	 * Returns whether a captured neighbor's vertical extent covers the queried shape face.
	 *
	 * @param capturedNeighbor captured host data at the adjacent world coordinate
	 * @param shape local bounds of the queried face
	 * @param side Minecraft block-side index
	 * @return whether the neighboring captured shape covers the queried face
	 */
	static boolean capturedHostCoversFace(TileTCRailHostData.CapturedHostBlock capturedNeighbor, HostShape shape, int side)
	{
		if (capturedNeighbor.shapes.isEmpty() == false)
		{
			for (TileTCRailHostData.CapturedHostShape neighborShape : capturedNeighbor.shapes)
			{
				if (capturedShapeCoversFace(neighborShape, shape, side))
				{
					return true;
				}
			}
			return false;
		}
		Block capturedBlock = Block.getBlockById(capturedNeighbor.blockId);
		if (capturedBlock == null)
		{
			return false;
		}
		double neighborMinY = getHostMinY(capturedBlock, capturedNeighbor.metadata);
		double neighborMaxY = getHostMaxY(capturedBlock, capturedNeighbor.metadata);
		switch (side)
		{
			case BLOCK_SIDE_BOTTOM:
				return neighborMaxY >= 1.0D - FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_TOP:
				return neighborMinY <= FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_NORTH:
			case BLOCK_SIDE_SOUTH:
			case BLOCK_SIDE_WEST:
			case BLOCK_SIDE_EAST:
				return neighborMinY <= shape.minY + FACE_HEIGHT_EPSILON && neighborMaxY >= shape.maxY - FACE_HEIGHT_EPSILON;
			default:
				return false;
		}
	}

	/** Returns whether one exact adjacent cuboid completely covers the queried boundary rectangle. */
	static boolean capturedShapeCoversFace(TileTCRailHostData.CapturedHostShape neighbor,
			HostShape shape, int side)
	{
		switch (side)
		{
			case BLOCK_SIDE_BOTTOM:
				return neighbor.maxY >= 1.0D - FACE_HEIGHT_EPSILON
						&& neighbor.minX <= shape.minX + FACE_HEIGHT_EPSILON
						&& neighbor.maxX >= shape.maxX - FACE_HEIGHT_EPSILON
						&& neighbor.minZ <= shape.minZ + FACE_HEIGHT_EPSILON
						&& neighbor.maxZ >= shape.maxZ - FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_TOP:
				return neighbor.minY <= FACE_HEIGHT_EPSILON
						&& neighbor.minX <= shape.minX + FACE_HEIGHT_EPSILON
						&& neighbor.maxX >= shape.maxX - FACE_HEIGHT_EPSILON
						&& neighbor.minZ <= shape.minZ + FACE_HEIGHT_EPSILON
						&& neighbor.maxZ >= shape.maxZ - FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_NORTH:
				return neighbor.maxZ >= 1.0D - FACE_HEIGHT_EPSILON
						&& neighbor.minX <= shape.minX + FACE_HEIGHT_EPSILON
						&& neighbor.maxX >= shape.maxX - FACE_HEIGHT_EPSILON
						&& neighbor.minY <= shape.minY + FACE_HEIGHT_EPSILON
						&& neighbor.maxY >= shape.maxY - FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_SOUTH:
				return neighbor.minZ <= FACE_HEIGHT_EPSILON
						&& neighbor.minX <= shape.minX + FACE_HEIGHT_EPSILON
						&& neighbor.maxX >= shape.maxX - FACE_HEIGHT_EPSILON
						&& neighbor.minY <= shape.minY + FACE_HEIGHT_EPSILON
						&& neighbor.maxY >= shape.maxY - FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_WEST:
				return neighbor.maxX >= 1.0D - FACE_HEIGHT_EPSILON
						&& neighbor.minZ <= shape.minZ + FACE_HEIGHT_EPSILON
						&& neighbor.maxZ >= shape.maxZ - FACE_HEIGHT_EPSILON
						&& neighbor.minY <= shape.minY + FACE_HEIGHT_EPSILON
						&& neighbor.maxY >= shape.maxY - FACE_HEIGHT_EPSILON;
			case BLOCK_SIDE_EAST:
				return neighbor.minX <= FACE_HEIGHT_EPSILON
						&& neighbor.minZ <= shape.minZ + FACE_HEIGHT_EPSILON
						&& neighbor.maxZ >= shape.maxZ - FACE_HEIGHT_EPSILON
						&& neighbor.minY <= shape.minY + FACE_HEIGHT_EPSILON
						&& neighbor.maxY >= shape.maxY - FACE_HEIGHT_EPSILON;
			default:
				return false;
		}
	}

	/**
	 * Resolves captured host data through parent, gag, and linked-rail ownership at a world coordinate.
	 *
	 * @param railTile visible rail tile supplying the world and ownership context
	 * @param worldX queried world block X coordinate
	 * @param worldY queried world block Y coordinate
	 * @param worldZ queried world block Z coordinate
	 * @return captured host cell at that coordinate, or {@code null} when none owns it
	 */
	static TileTCRailHostData.CapturedHostBlock getCapturedHostBlockAtWorld(TileTCRail railTile, int worldX, int worldY, int worldZ)
	{
		TileTCRailHostData.CapturedHostBlock localHostBlock = railTile.getCapturedHostBlockAtWorld(worldX, worldY, worldZ);
		if (localHostBlock != null || railTile.getWorldObj() == null)
		{
			return localHostBlock;
		}
		TileEntity tileEntity = railTile.getWorldObj().getTileEntity(worldX, worldY, worldZ);
		if (tileEntity instanceof TileTCRail)
		{
			TileTCRail neighborRail = ((TileTCRail) tileEntity).getGreatestParent(railTile.getWorldObj());
			return neighborRail != null ? neighborRail.getCapturedHostBlockAtWorld(worldX, worldY, worldZ) : null;
		}
		if (tileEntity instanceof TileTCRailGag)
		{
			TileTCRailGag gag = (TileTCRailGag) tileEntity;
			TileEntity originTile = railTile.getWorldObj().getTileEntity(gag.originX, gag.originY, gag.originZ);
			if (originTile instanceof TileTCRail)
			{
				TileTCRail neighborRail = ((TileTCRail) originTile).getGreatestParent(railTile.getWorldObj());
				return neighborRail != null ? neighborRail.getCapturedHostBlockAtWorld(worldX, worldY, worldZ) : null;
			}
		}
		return null;
	}

	/**
	 * One axis-aligned captured-host component in local zero-to-one block coordinates.
	 * Degenerate dimensions intentionally represent boundary faces generated for neighboring coverage.
	 */
	static final class HostShape
	{
		private final double minX;
		private final double minY;
		private final double minZ;
		private final double maxX;
		private final double maxY;
		private final double maxZ;
		private final boolean renderBottom;

		/**
		 * Creates one local host shape and records whether its underside can be exposed.
		 *
		 * @param minX minimum X coordinate within the host cell, in blocks
		 * @param minY minimum Y coordinate within the host cell, in blocks
		 * @param minZ minimum Z coordinate within the host cell, in blocks
		 * @param maxX maximum X coordinate within the host cell, in blocks
		 * @param maxY maximum Y coordinate within the host cell, in blocks
		 * @param maxZ maximum Z coordinate within the host cell, in blocks
		 * @param renderBottom whether an exposed underside face may be emitted
		 */
		HostShape(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, boolean renderBottom)
		{
			this.minX = minX;
			this.minY = minY;
			this.minZ = minZ;
			this.maxX = maxX;
			this.maxY = maxY;
			this.maxZ = maxZ;
			this.renderBottom = renderBottom;
		}
	}
	/**
	 * Discrete angular visibility mask for curved trench sections.
	 * Binning stabilizes curve coverage at block boundaries while padding prevents cracks between authored segments.
	 */
	static final class AngleMask
	{
		private final boolean[] allowedBins = new boolean[CURVE_ANGLE_MASK_BINS];
		private boolean allowAll;
		private boolean hasAny;

		/** Marks every curve angle as visible when no restricted model interval is required. */
		private void allowAll()
		{
			this.allowAll = true;
			this.hasAny = true;
		}

		/**
		 * Adds a radian interval, wrapping it across the zero-angle seam when necessary.
		 *
		 * @param start interval start angle, in radians
		 * @param end interval end angle, in radians
		 */
		private void addInterval(double start, double end)
		{
			double twoPi = Math.PI * 2.0D;
			while (start < 0.0D)
			{
				start += twoPi;
				end += twoPi;
			}
			while (start >= twoPi)
			{
				start -= twoPi;
				end -= twoPi;
			}
			if (end - start >= twoPi)
			{
				allowAll();
				return;
			}
			markInterval(start, Math.min(end, twoPi));
			if (end > twoPi)
			{
				markInterval(0.0D, end - twoPi);
			}
		}

		/**
		 * Marks all half-degree bins touched by one normalized radian interval.
		 *
		 * @param start normalized interval start angle, in radians
		 * @param end normalized interval end angle, in radians
		 */
		private void markInterval(double start, double end)
		{
			int startIndex = Math.max(0, (int)Math.floor(start / (Math.PI * 2.0D) * CURVE_ANGLE_MASK_BINS));
			int endIndex = Math.min(CURVE_ANGLE_MASK_BINS - 1, (int)Math.ceil(end / (Math.PI * 2.0D) * CURVE_ANGLE_MASK_BINS));
			for (int angleBinIndex = startIndex; angleBinIndex <= endIndex; angleBinIndex++)
			{
				this.allowedBins[angleBinIndex] = true;
				this.hasAny = true;
			}
		}

		/**
		 * Returns whether a normalized curve angle belongs to the visible model interval.
		 *
		 * @param angle curve angle in radians
		 * @return whether the curve angle belongs to a visible model interval
		 */
		private boolean isAllowed(double angle)
		{
			if (this.allowAll || this.hasAny == false)
			{
				return true;
			}
			int index = (int)Math.floor(normalizeAngle(angle) / (Math.PI * 2.0D) * CURVE_ANGLE_MASK_BINS);
			index = Math.max(0, Math.min(CURVE_ANGLE_MASK_BINS - 1, index));
			return this.allowedBins[index];
		}
	}

}
