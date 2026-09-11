package train.client.render.embedded;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;
import train.client.render.embedded.EmbeddedHostGeometry.PointXZ;
import train.client.render.embedded.EmbeddedSwitchTerrainProfiles.Profile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static train.client.render.embedded.EmbeddedCapturedHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedHostRenderController.*;
import static train.client.render.embedded.EmbeddedHostLightingPreparer.*;
import static train.client.render.embedded.EmbeddedTrenchProfileRules.*;

/**
 * Builds model-derived switch tops, trench walls, and exterior switch-host faces.
 *
 * <p>Active and inactive rail models are sampled together, so terrain covers every route without changing shape when
 * the switch toggles. The clearance field becomes homogeneous top cells, clipped polygons, trench walls, and exterior
 * faces in that order. Preserve that order to avoid overlap and seams along mixed cells.</p>
 */
final class EmbeddedSwitchHostMeshBuilder
{
	private EmbeddedSwitchHostMeshBuilder()
	{
	}

	/**
	 * Converts one model-derived clearance section into host faces.
	 * Negative clearance retains terrain; non-negative clearance selects the lowered track pocket.
	 *
	 * @param cache destination receiving faces in deterministic render order
	 * @param railTile visible switch owner supplying orientation and linked routes
	 * @param hostKeys complete owner-relative captured-host footprint
	 * @param hostBlock captured cell being tessellated
	 * @param block captured material block
	 * @param minY lowest solid height available to the profile
	 * @param raisedTop uncut host surface height
	 * @param pocketTop lowered trench-floor height
	 * @param profile immutable active-and-inactive route profile
	 * @param linkedStraightRail compound-switch straight route, or {@code null}
	 */
	static void addSmoothModelSwitchProfileFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double minY,
			double raisedTop, double pocketTop, Profile profile, TileTCRail linkedStraightRail)
	{
		int gridSize = MODEL_SWITCH_MESH_GRID_SIZE;
		double[][] clearanceSamples = new double[gridSize + 1][gridSize + 1];
		for (int xIndex = 0; xIndex <= gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex <= gridSize; zIndex++)
			{
				clearanceSamples[xIndex][zIndex] = getModelSwitchClearance(railTile, hostBlock, profile,
						linkedStraightRail, xIndex / (double)gridSize, zIndex / (double)gridSize);
			}
		}

		double[][] homogeneousHeights = new double[gridSize][gridSize];
		boolean[][] mixed = new boolean[gridSize][gridSize];
		double[][] centerSamples = new double[gridSize][gridSize];
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				double first = clearanceSamples[xIndex][zIndex];
				double center = getModelSwitchClearance(railTile, hostBlock, profile, linkedStraightRail,
						(xIndex + 0.5D) / gridSize, (zIndex + 0.5D) / gridSize);
				centerSamples[xIndex][zIndex] = center;
				boolean inside = first >= 0.0D;
				boolean uniform = (clearanceSamples[xIndex + 1][zIndex] >= 0.0D) == inside
						&& (clearanceSamples[xIndex + 1][zIndex + 1] >= 0.0D) == inside
						&& (clearanceSamples[xIndex][zIndex + 1] >= 0.0D) == inside && (center >= 0.0D) == inside;
				mixed[xIndex][zIndex] = uniform == false;
				homogeneousHeights[xIndex][zIndex] = uniform ? (inside ? pocketTop : raisedTop) : minY;
			}
		}

		addMergedHorizontalFaces(cache, railTile, hostKeys, hostBlock, block, homogeneousHeights, gridSize, minY, true);
		IIcon topIcon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_TOP);
		IIcon wallIcon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH);
		if (topIcon != null)
		{
			for (int xIndex = 0; xIndex < gridSize; xIndex++)
			{
				for (int zIndex = 0; zIndex < gridSize; zIndex++)
				{
					if (mixed[xIndex][zIndex])
					{
						addSmoothModelSwitchCell(cache, hostBlock, block, topIcon,
								xIndex, zIndex, gridSize, raisedTop, pocketTop,
								clearanceSamples[xIndex][zIndex], clearanceSamples[xIndex + 1][zIndex],
								clearanceSamples[xIndex + 1][zIndex + 1], clearanceSamples[xIndex][zIndex + 1],
								centerSamples[xIndex][zIndex], null);
					}
				}
			}
		}
		if (topIcon != null && wallIcon != null)
		{
			for (List<PointXZ> contour : EmbeddedSwitchContour.extract(clearanceSamples, centerSamples, gridSize))
			{
				for (int pointIndex = 1; pointIndex < contour.size(); pointIndex++)
				{
					addSmoothModelSwitchWall(cache, railTile, hostKeys, hostBlock, block, wallIcon,
							contour.get(pointIndex - 1), contour.get(pointIndex), raisedTop, pocketTop);
				}
			}
		}

		HostShape bottom = new HostShape(0.0D, minY, 0.0D, 1.0D, minY + RENDER_EPSILON, 1.0D, true);
		addFace(cache, railTile, hostKeys, hostBlock, block, bottom,
				BLOCK_SIDE_BOTTOM, 0, -1, 0, SHADE_BOTTOM_FACE);
		addSmoothModelSwitchExternalSideFaces(cache, railTile, hostKeys, hostBlock, block, minY,
				raisedTop, pocketTop, clearanceSamples, gridSize);
	}

	/**
	 * Returns a validated reusable top template, building one with the normal top-face emitters on a cache miss.
	 *
	 * @param railTile visible model-switch tile
	 * @param renderBlocks owner-relative captured host cells
	 * @param profile fixed active-and-inactive switch clearance profile
	 * @return validated template, or {@code null} to use the uncached builder
	 */
	static EmbeddedModelSwitchTopCache.Template getOrBuildModelSwitchTopTemplate(TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks, Profile profile)
	{
		if (isSwitchProfile(railTile) == false || renderBlocks.isEmpty())
		{
			return null;
		}
		List<TileTCRailHostData.CapturedHostBlock> orderedHosts =
				new ArrayList<TileTCRailHostData.CapturedHostBlock>(renderBlocks.values());
		Collections.sort(orderedHosts, new Comparator<TileTCRailHostData.CapturedHostBlock>()
		{
			/**
			 * Orders host cells by X, then Y, then Z without considering captured material.
			 *
			 * @param first first captured host
			 * @param second second captured host
			 * @return negative, zero, or positive according to coordinate order
			 */
			@Override
			public int compare(TileTCRailHostData.CapturedHostBlock first,
					TileTCRailHostData.CapturedHostBlock second)
			{
				if (first.offsetX != second.offsetX)
				{
					return first.offsetX < second.offsetX ? -1 : 1;
				}
				if (first.offsetY != second.offsetY)
				{
					return first.offsetY < second.offsetY ? -1 : 1;
				}
				return first.offsetZ == second.offsetZ ? 0 : (first.offsetZ < second.offsetZ ? -1 : 1);
			}
		});

		double raisedTop = getRaisedProfileTop(railTile);
		double pocketTop = raisedTop - TRENCH_POCKET_DROP;
		EmbeddedModelSwitchTopCache.Key key = buildModelSwitchTopKey(railTile, orderedHosts, raisedTop);
		EmbeddedModelSwitchTopCache.Template template = EmbeddedModelSwitchTopCache.get(key);
		if (template != null)
		{
			return template;
		}

		Map<String, EmbeddedModelSwitchTopCache.Section> sections =
				new HashMap<String, EmbeddedModelSwitchTopCache.Section>();
		for (TileTCRailHostData.CapturedHostBlock hostBlock : orderedHosts)
		{
			TileTCRail linkedStraightRail = getLinkedStraightRail(railTile, hostBlock);
			EmbeddedModelSwitchTopCache.Section section = buildModelSwitchTopSection(
					railTile, hostBlock, profile, linkedStraightRail, raisedTop, pocketTop);
			sections.put(TileTCRailHostData.key(hostBlock.offsetX, hostBlock.offsetY, hostBlock.offsetZ), section);
		}
		template = new EmbeddedModelSwitchTopCache.Template(
				sections, orderedHosts.size(), raisedTop, pocketTop);
		return EmbeddedModelSwitchTopCache.putIfValid(key, template);
	}

	/**
	 * Builds the canonical topology-only cache key, including per-cell linked-corridor orientation.
	 *
	 * @param railTile visible model-switch tile
	 * @param orderedHosts host cells sorted by owner-relative coordinates
	 * @param raisedTop resolved numeric surface height
	 * @return complete material-independent template key
	 */
	static EmbeddedModelSwitchTopCache.Key buildModelSwitchTopKey(TileTCRail railTile,
			List<TileTCRailHostData.CapturedHostBlock> orderedHosts, double raisedTop)
	{
		StringBuilder key = new StringBuilder();
		key.append(railTile.getTrackType().getCoreTrack()).append('|')
				.append(railTile.getTrackType().getLabel()).append('|')
				.append(railTile.getFacing()).append('|')
				.append(Double.doubleToLongBits(raisedTop));
		for (TileTCRailHostData.CapturedHostBlock hostBlock : orderedHosts)
		{
			TileTCRail linked = getLinkedStraightRail(railTile, hostBlock);
			key.append(';').append(hostBlock.offsetX).append(',').append(hostBlock.offsetY).append(',')
					.append(hostBlock.offsetZ).append(':')
					.append(linked == null ? '-' : (isStraightAlongZ(linked.getFacing()) ? 'Z' : 'X'));
		}
		return new EmbeddedModelSwitchTopCache.Key(key.toString());
	}

	/**
	 * Samples one host and captures the output of the rectangle and polygon-fan emitters.
	 *
	 * @param railTile visible model-switch tile
	 * @param hostBlock captured host section
	 * @param profile fixed switch clearance profile
	 * @param linkedStraightRail linked straight corridor for this host, or {@code null}
	 * @param raisedTop resolved numeric surface height
	 * @param pocketTop resolved numeric pocket height
	 * @return completed reusable host section
	 */
	static EmbeddedModelSwitchTopCache.Section buildModelSwitchTopSection(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Profile profile,
			TileTCRail linkedStraightRail, double raisedTop, double pocketTop)
	{
		int gridSize = MODEL_SWITCH_MESH_GRID_SIZE;
		double[][] clearanceSamples = new double[gridSize + 1][gridSize + 1];
		for (int xIndex = 0; xIndex <= gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex <= gridSize; zIndex++)
			{
				clearanceSamples[xIndex][zIndex] = getModelSwitchClearance(railTile, hostBlock, profile,
						linkedStraightRail, xIndex / (double)gridSize, zIndex / (double)gridSize);
			}
		}
		double[][] homogeneousHeights = new double[gridSize][gridSize];
		boolean[][] mixed = new boolean[gridSize][gridSize];
		double[][] centerSamples = new double[gridSize][gridSize];
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				double first = clearanceSamples[xIndex][zIndex];
				double center = getModelSwitchClearance(railTile, hostBlock, profile, linkedStraightRail,
						(xIndex + 0.5D) / gridSize, (zIndex + 0.5D) / gridSize);
				centerSamples[xIndex][zIndex] = center;
				boolean inside = first >= 0.0D;
				boolean uniform = (clearanceSamples[xIndex + 1][zIndex] >= 0.0D) == inside
						&& (clearanceSamples[xIndex + 1][zIndex + 1] >= 0.0D) == inside
						&& (clearanceSamples[xIndex][zIndex + 1] >= 0.0D) == inside
						&& (center >= 0.0D) == inside;
				mixed[xIndex][zIndex] = uniform == false;
				homogeneousHeights[xIndex][zIndex] = uniform ? (inside ? pocketTop : raisedTop) : 0.0D;
			}
		}

		List<List<PointXZ>> contours = EmbeddedSwitchContour.extract(clearanceSamples, centerSamples, gridSize);
		EmbeddedModelSwitchTopCache.Section section =
				new EmbeddedModelSwitchTopCache.Section(clearanceSamples, contours);
		ModelSwitchTopCollector collector = new ModelSwitchTopCollector(section);
		addMergedHorizontalFaces(null, railTile, Collections.<String>emptySet(), hostBlock, null,
				homogeneousHeights, gridSize, 0.0D, true, collector);
		for (int xIndex = 0; xIndex < gridSize; xIndex++)
		{
			for (int zIndex = 0; zIndex < gridSize; zIndex++)
			{
				if (mixed[xIndex][zIndex])
				{
					addSmoothModelSwitchCell(null, null, null, null, xIndex, zIndex, gridSize,
							raisedTop, pocketTop, clearanceSamples[xIndex][zIndex],
							clearanceSamples[xIndex + 1][zIndex], clearanceSamples[xIndex + 1][zIndex + 1],
							clearanceSamples[xIndex][zIndex + 1], centerSamples[xIndex][zIndex], collector);
				}
			}
		}
		return section;
	}

	/**
	 * Binds cached tops to this placement, then emits walls, sides, and underside normally.
	 *
	 * @param cache placement cache receiving faces
	 * @param railTile visible model-switch tile
	 * @param hostKeys owner-relative captured host keys
	 * @param hostBlock captured host section
	 * @param block captured block material
	 * @param minY placement-specific host base height
	 * @param raisedTop numeric uncut top height
	 * @param pocketTop numeric pocket height
	 * @param section validated reusable top section
	 */
	static void addCachedModelSwitchProfileFaces(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, double minY,
			double raisedTop, double pocketTop, EmbeddedModelSwitchTopCache.Section section)
	{
		for (EmbeddedModelSwitchTopCache.TopRectangle rectangle : section.getRectangles())
		{
			HostShape shape = new HostShape(rectangle.getMinimumX(), minY, rectangle.getMinimumZ(),
					rectangle.getMaximumX(), rectangle.getY(), rectangle.getMaximumZ(), true);
			addFace(cache, railTile, hostKeys, hostBlock, block, shape,
					BLOCK_SIDE_TOP, 0, 1, 0, SHADE_TOP_FACE);
		}
		IIcon topIcon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_TOP);
		IIcon wallIcon = getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH);
		if (topIcon != null)
		{
			for (QuadVertices vertices : section.getQuads())
			{
				cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, topIcon,
						CUSTOM_TOP_FACE, 0, 1, 0, SHADE_TOP_FACE, vertices));
			}
		}
		if (topIcon != null && wallIcon != null)
		{
			for (List<PointXZ> contour : section.getContours())
			{
				for (int pointIndex = 1; pointIndex < contour.size(); pointIndex++)
				{
					addSmoothModelSwitchWall(cache, railTile, hostKeys, hostBlock, block, wallIcon,
							contour.get(pointIndex - 1), contour.get(pointIndex), raisedTop, pocketTop);
				}
			}
		}
		HostShape bottom = new HostShape(0.0D, minY, 0.0D, 1.0D, minY + RENDER_EPSILON, 1.0D, true);
		addFace(cache, railTile, hostKeys, hostBlock, block, bottom,
				BLOCK_SIDE_BOTTOM, 0, -1, 0, SHADE_BOTTOM_FACE);
		addSmoothModelSwitchExternalSideFaces(cache, railTile, hostKeys, hostBlock, block, minY,
				raisedTop, pocketTop, section.copyClearanceSamples(), MODEL_SWITCH_MESH_GRID_SIZE);
	}

	/**
	 * Emits switch host sides from the same continuous clearance samples used by
	 * the top surface. A full-height exterior cuboid would cover the visible
	 * notch whenever a rail pocket reaches the edge of a captured host block.
	 *
	 * @param cache cache receiving generated side faces
	 * @param railTile visible switch tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param clearanceSamples signed clearance sampled across the host-cell grid, in blocks
	 * @param gridSize number of samples along each host-cell axis
	 */
	static void addSmoothModelSwitchExternalSideFaces(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock, Block block,
			double minY, double raisedTop, double pocketTop, double[][] clearanceSamples, int gridSize)
	{
		addSmoothModelSwitchExternalSide(cache, railTile, hostKeys, hostBlock, block, minY,
				raisedTop, pocketTop, clearanceSamples, gridSize, BLOCK_SIDE_NORTH);
		addSmoothModelSwitchExternalSide(cache, railTile, hostKeys, hostBlock, block, minY,
				raisedTop, pocketTop, clearanceSamples, gridSize, BLOCK_SIDE_SOUTH);
		addSmoothModelSwitchExternalSide(cache, railTile, hostKeys, hostBlock, block, minY,
				raisedTop, pocketTop, clearanceSamples, gridSize, BLOCK_SIDE_WEST);
		addSmoothModelSwitchExternalSide(cache, railTile, hostKeys, hostBlock, block, minY,
				raisedTop, pocketTop, clearanceSamples, gridSize, BLOCK_SIDE_EAST);
	}

	/**
	 * Converts one sampled switch boundary into continuous exposed-side runs.
	 *
	 * @param cache cache receiving generated side faces
	 * @param railTile visible switch tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param clearanceSamples signed clearance sampled across the host-cell grid, in blocks
	 * @param gridSize number of samples along each host-cell axis
	 * @param side Minecraft block-side index
	 */
	static void addSmoothModelSwitchExternalSide(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock, Block block,
			double minY, double raisedTop, double pocketTop, double[][] clearanceSamples, int gridSize,
			int side)
	{
		double runStart = 0.0D;
		double previousClearance = getBoundaryClearance(clearanceSamples, gridSize, side, 0);
		boolean pocket = previousClearance >= 0.0D;
		for (int index = 1; index <= gridSize; index++)
		{
			double clearance = getBoundaryClearance(clearanceSamples, gridSize, side, index);
			boolean nextPocket = clearance >= 0.0D;
			if (nextPocket != pocket)
			{
				double denominator = previousClearance - clearance;
				double intervalProgress = Math.abs(denominator) <= GEOMETRY_EPSILON
						? 0.5D
						: previousClearance / denominator;
				double crossing = (index - 1.0D + clampUnit(intervalProgress)) / gridSize;
				addSmoothModelSwitchExternalSideRun(cache, railTile, hostKeys, hostBlock, block,
						minY, pocket ? pocketTop : raisedTop, side, runStart, crossing);
				runStart = crossing;
				pocket = nextPocket;
			}
			previousClearance = clearance;
		}
		addSmoothModelSwitchExternalSideRun(cache, railTile, hostKeys, hostBlock, block,
				minY, pocket ? pocketTop : raisedTop, side, runStart, 1.0D);
	}

	/**
	 * Reads interpolated switch clearance at one sample along a host-cell boundary.
	 *
	 * @param clearanceSamples signed clearance sampled across the host-cell grid, in blocks
	 * @param gridSize number of samples along each host-cell axis
	 * @param side Minecraft block-side index
	 * @param index sample index along the selected boundary
	 * @return signed clearance in blocks, positive inside the trench
	 */
	static double getBoundaryClearance(double[][] clearanceSamples, int gridSize, int side,
			int index)
	{
		switch (side)
		{
			case BLOCK_SIDE_NORTH:
				return clearanceSamples[index][0];
			case BLOCK_SIDE_SOUTH:
				return clearanceSamples[index][gridSize];
			case BLOCK_SIDE_WEST:
				return clearanceSamples[0][index];
			case BLOCK_SIDE_EAST:
				return clearanceSamples[gridSize][index];
			default:
				return Double.NEGATIVE_INFINITY;
		}
	}

	/**
	 * Emits one continuous raised or pocket-height segment along an exposed switch cell side.
	 *
	 * @param cache cache receiving the generated side face
	 * @param railTile visible switch tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param minY lowest rendered local Y coordinate, in blocks
	 * @param topY upper local side Y coordinate, in blocks
	 * @param side Minecraft block-side index
	 * @param start starting boundary fraction from zero to one
	 * @param end ending boundary fraction from zero to one
	 */
	static void addSmoothModelSwitchExternalSideRun(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Set<String> hostKeys, TileTCRailHostData.CapturedHostBlock hostBlock, Block block,
			double minY, double topY, int side, double start, double end)
	{
		if (end - start <= GEOMETRY_EPSILON || topY - minY <= FACE_HEIGHT_EPSILON)
		{
			return;
		}
		HostShape shape;
		switch (side)
		{
			case BLOCK_SIDE_NORTH:
				shape = new HostShape(start, minY, 0.0D, end, topY, 0.0D, false);
				break;
			case BLOCK_SIDE_SOUTH:
				shape = new HostShape(start, minY, 1.0D, end, topY, 1.0D, false);
				break;
			case BLOCK_SIDE_WEST:
				shape = new HostShape(0.0D, minY, start, 0.0D, topY, end, false);
				break;
			case BLOCK_SIDE_EAST:
				shape = new HostShape(1.0D, minY, start, 1.0D, topY, end, false);
				break;
			default:
				return;
		}
		int normalX = getSideNormalX(side);
		int normalZ = getSideNormalZ(side);
		addFace(cache, railTile, hostKeys, hostBlock, block, shape, side, normalX, 0, normalZ,
				getSideShade(side));
	}

	/**
	 * Splits one sampled switch grid cell into triangles so its zero crossing remains smooth.
	 *
	 * @param cache cache receiving generated faces
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param topIcon captured host top texture
	 * @param cellXIndex grid-cell X index
	 * @param cellZIndex grid-cell Z index
	 * @param gridSize number of cells along each host-cell axis
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param clearance00 signed clearance at the minimum-X, minimum-Z corner, in blocks
	 * @param clearance10 signed clearance at the maximum-X, minimum-Z corner, in blocks
	 * @param clearance11 signed clearance at the maximum-X, maximum-Z corner, in blocks
	 * @param clearance01 signed clearance at the minimum-X, maximum-Z corner, in blocks
	 * @param clearanceCenter signed clearance at the cell center, in blocks
	 * @param collector optional reusable-top collector
	 */
	static void addSmoothModelSwitchCell(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon topIcon,
			int cellXIndex, int cellZIndex, int gridSize, double raisedTop, double pocketTop,
			double clearance00, double clearance10, double clearance11, double clearance01,
			double clearanceCenter, ModelSwitchTopCollector collector)
	{
		double minX = cellXIndex / (double)gridSize;
		double maxX = (cellXIndex + 1.0D) / gridSize;
		double minZ = cellZIndex / (double)gridSize;
		double maxZ = (cellZIndex + 1.0D) / gridSize;
		PointXZ minimumCorner = new PointXZ(minX, minZ);
		PointXZ maximumXCorner = new PointXZ(maxX, minZ);
		PointXZ maximumCorner = new PointXZ(maxX, maxZ);
		PointXZ maximumZCorner = new PointXZ(minX, maxZ);
		boolean pocket00 = clearance00 >= 0.0D;
		boolean pocket10 = clearance10 >= 0.0D;
		boolean pocket11 = clearance11 >= 0.0D;
		boolean pocket01 = clearance01 >= 0.0D;
		boolean checker = pocket00 == pocket11 && pocket10 == pocket01 && pocket00 != pocket10;
		boolean diagonal00To11 = checker ? (clearanceCenter >= 0.0D) == pocket00
				: ((cellXIndex + cellZIndex) & 1) == 0;
		if (diagonal00To11)
		{
			addSmoothModelSwitchTriangle(cache, hostBlock, block, topIcon,
					new PointXZ[] { minimumCorner, maximumXCorner, maximumCorner },
					new double[] { clearance00, clearance10, clearance11 }, raisedTop, pocketTop, collector);
			addSmoothModelSwitchTriangle(cache, hostBlock, block, topIcon,
					new PointXZ[] { minimumCorner, maximumCorner, maximumZCorner },
					new double[] { clearance00, clearance11, clearance01 }, raisedTop, pocketTop, collector);
		}
		else
		{
			addSmoothModelSwitchTriangle(cache, hostBlock, block, topIcon,
					new PointXZ[] { minimumCorner, maximumXCorner, maximumZCorner },
					new double[] { clearance00, clearance10, clearance01 }, raisedTop, pocketTop, collector);
			addSmoothModelSwitchTriangle(cache, hostBlock, block, topIcon,
					new PointXZ[] { maximumXCorner, maximumCorner, maximumZCorner },
					new double[] { clearance10, clearance11, clearance01 }, raisedTop, pocketTop, collector);
		}
	}

	/**
	 * Clips one switch triangle into raised and pocket regions. Boundary walls are emitted later from
	 * stitched contours so adjacent collinear triangle crossings share one quad.
	 *
	 * @param cache cache receiving generated faces
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param topIcon captured host top texture
	 * @param triangle three points in local host-cell X/Z coordinates
	 * @param clearance signed clearance at each triangle point, in blocks
	 * @param raisedTop uncut local surface Y coordinate, in blocks
	 * @param pocketTop lowered trench-floor Y coordinate, in blocks
	 * @param collector optional reusable-top collector
	 */
	static void addSmoothModelSwitchTriangle(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon topIcon,
			PointXZ[] triangle, double[] clearance, double raisedTop, double pocketTop,
			ModelSwitchTopCollector collector)
	{
		int pocketCount = 0;
		for (double sample : clearance)
		{
			if (sample >= 0.0D)
			{
				pocketCount++;
			}
		}
		if (pocketCount == 0 || pocketCount == 3)
		{
			addClippedTopPolygon(cache, hostBlock, block, topIcon, triangle, triangle.length,
					pocketCount == 3 ? pocketTop : raisedTop, collector);
			return;
		}

		PointXZ[] pocketPolygon = clipTriangleRegion(triangle, clearance, true);
		PointXZ[] raisedPolygon = clipTriangleRegion(triangle, clearance, false);
		addClippedTopPolygon(cache, hostBlock, block, topIcon, pocketPolygon, pocketPolygon.length,
				pocketTop, collector);
		addClippedTopPolygon(cache, hostBlock, block, topIcon, raisedPolygon, raisedPolygon.length,
				raisedTop, collector);

	}

	/**
	 * Clips a triangle to either side of the signed zero-clearance boundary.
	 *
	 * @param triangle three points in local host-cell X/Z coordinates
	 * @param clearance signed clearance at each triangle point, in blocks
	 * @param wantedPocket whether to retain the positive-clearance pocket side
	 * @return clipped polygon points in local host-cell X/Z coordinates
	 */
	static PointXZ[] clipTriangleRegion(PointXZ[] triangle, double[] clearance, boolean wantedPocket)
	{
		List<PointXZ> clippedPoints = new ArrayList<PointXZ>(4);
		for (int triangleIndex = 0; triangleIndex < triangle.length; triangleIndex++)
		{
			int nextIndex = (triangleIndex + 1) % triangle.length;
			boolean currentPocket = clearance[triangleIndex] >= 0.0D;
			boolean nextPocket = clearance[nextIndex] >= 0.0D;
			if (currentPocket == wantedPocket)
			{
				clippedPoints.add(triangle[triangleIndex]);
			}
			if (currentPocket != nextPocket)
			{
				clippedPoints.add(clearanceIntersection(triangle[triangleIndex], triangle[nextIndex],
						clearance[triangleIndex], clearance[nextIndex]));
			}
		}
		return clippedPoints.toArray(new PointXZ[clippedPoints.size()]);
	}

	/**
	 * Interpolates the point where an edge's signed switch clearance crosses zero.
	 *
	 * @param first first edge point in local host-cell X/Z coordinates
	 * @param second second edge point in local host-cell X/Z coordinates
	 * @param firstClearance signed clearance at {@code first}, in blocks
	 * @param secondClearance signed clearance at {@code second}, in blocks
	 * @return interpolated zero-clearance point
	 */
	static PointXZ clearanceIntersection(PointXZ first, PointXZ second, double firstClearance, double secondClearance)
	{
		double denominator = firstClearance - secondClearance;
		double progress = Math.abs(denominator) <= GEOMETRY_EPSILON ? 0.5D : firstClearance / denominator;
		progress = Math.max(0.0D, Math.min(1.0D, progress));
		return new PointXZ(first.x + (second.x - first.x) * progress,
				first.z + (second.z - first.z) * progress);
	}

	/**
	 * Adds one wall segment along a model-derived switch pocket boundary.
	 *
	 * @param cache cache receiving the generated wall face
	 * @param railTile visible switch tile supplying owner coordinates
	 * @param hostKeys owner-relative coordinates of all captured host cells
	 * @param hostBlock captured host cell being rendered
	 * @param block captured host block type
	 * @param icon captured host side texture
	 * @param start first wall endpoint in local host-cell X/Z coordinates
	 * @param end second wall endpoint in local host-cell X/Z coordinates
	 * @param raisedTop upper local wall Y coordinate, in blocks
	 * @param pocketTop lower local wall Y coordinate, in blocks
	 */
	static void addSmoothModelSwitchWall(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			PointXZ start, PointXZ end, double raisedTop, double pocketTop)
	{
		if (isUnitBoundarySegment(start, end))
		{
			// The profiled exterior side owns this boundary and leaves the pocket notch open.
			return;
		}
		if (icon == null || distance(start.x, start.z, end.x, end.z) <= GEOMETRY_EPSILON)
		{
			return;
		}
		cache.mesh.addFace(EmbeddedHostFace.quad(hostBlock, block, icon,
				OBLIQUE_WALL_FACE, 0, 1, 0, SHADE_OBLIQUE_WALL, new QuadVertices(
				start.x, raisedTop, start.z, end.x, raisedTop, end.z,
				end.x, pocketTop, end.z, start.x, pocketTop, start.z)));
	}

	/**
	 * Returns combined signed clearance from the switch profile and any authoritative linked straight corridor.
	 *
	 * @param railTile visible switch tile supplying facing and owner coordinates
	 * @param hostBlock captured host cell containing the sample
	 * @param profile fixed active-and-inactive switch clearance profile
	 * @param linkedStraightRail authoritative linked straight corridor, or {@code null}
	 * @param localX sample X coordinate within the host cell, from zero to one
	 * @param localZ sample Z coordinate within the host cell, from zero to one
	 * @return signed clearance in blocks, positive inside the combined trench
	 */
	static double getModelSwitchClearance(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Profile profile, TileTCRail linkedStraightRail,
			double localX, double localZ)
	{
		double worldOffsetX = hostBlock.offsetX + localX - 0.5D;
		double worldOffsetZ = hostBlock.offsetZ + localZ - 0.5D;
		double clearance = profile.clearanceWorld(railTile.getFacing(), worldOffsetX, worldOffsetZ);
		if (linkedStraightRail != null)
		{
			boolean alongZ = isStraightAlongZ(linkedStraightRail.getFacing());
			double cross = alongZ ? localX : localZ;
			clearance = Math.max(clearance, getStraightPocketClearance(cross));
		}
		return clearance;
	}

	/**
	 * Captures material-independent top rectangles and custom quads for one switch-host section.
	 * The collector writes copied descriptors into the bounded model-top cache; it never retains tessellator state.
	 */
	static final class ModelSwitchTopCollector
	{
		private final EmbeddedModelSwitchTopCache.Section section;

		/**
		 * Creates a collector for one host section.
		 *
		 * @param section section receiving exact top descriptors
		 */
		private ModelSwitchTopCollector(EmbeddedModelSwitchTopCache.Section section)
		{
			this.section = section;
		}

		/**
		 * Records one exact merged top rectangle.
		 *
		 * @param minX minimum local X
		 * @param minZ minimum local Z
		 * @param maxX maximum local X
		 * @param maxZ maximum local Z
		 * @param y final numeric top height
		 */
		void addRectangle(double minX, double minZ, double maxX, double maxZ, double y)
		{
			section.addRectangle(new EmbeddedModelSwitchTopCache.TopRectangle(minX, minZ, maxX, maxZ, y));
		}

		/**
		 * Records one exact polygon-fan quad.
		 *
		 * @param vertices final numeric vertices and winding
		 */
		void addQuad(QuadVertices vertices)
		{
			section.addQuad(vertices);
		}
	}


}
