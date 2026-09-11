package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import train.common.library.track.EnumCoreTrack;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.client.render.embedded.EmbeddedHostFace.CuboidBounds;
import train.client.render.embedded.EmbeddedHostFace.QuadTextureCoordinates;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;
import train.client.render.embedded.EmbeddedHostGeometry.PointXZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static train.client.render.embedded.EmbeddedDisplayListPolicy.*;
import static train.client.render.embedded.EmbeddedCapturedHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedHostRenderController.*;
import static train.client.render.embedded.EmbeddedHostLightingPreparer.*;
import static train.client.render.embedded.EmbeddedSlopeRenderPolicy.*;
import static train.client.render.embedded.EmbeddedTrenchProfileRules.*;

/**
 * Builds and reuses generated slope-host topology without owning frame rendering or cache lifetime.
 *
 * <p>Topology is shared only when geometry, facing, footprint, host heights, and exposed-neighbor state match. Rebinding
 * changes material and appearance data without changing vertex order; an incomplete rebind falls back to a full build.</p>
 *
 * <p>Warping is the final geometry step. Corresponding top, wall, and underside vertices must move together or cracks
 * and incorrect lighting normals will appear at cell boundaries.</p>
 */
@SideOnly(Side.CLIENT)
final class EmbeddedSlopeHostMeshBuilder
{
	private EmbeddedSlopeHostMeshBuilder()
	{
	}

	/**
	 * Finalizes one newly generated or globally rebound tile mesh by optionally sharing its immutable slope topology,
	 * classifying virtual walls, and calculating placement-local material lighting.
	 *
	 * @param cache tile-local cache containing a complete face mesh
	 * @param railTile visible rail tile supplying captured neighbors, tint, and lighting
	 * @param slopeTopologyKey material-independent cache key, or {@code null} when no topology should be stored
	 * @return the same cache after all geometry and appearance preparation is complete
	 */
	static EmbeddedHostRenderCache prepareCompletedCache(EmbeddedHostRenderCache cache, TileTCRail railTile, String slopeTopologyKey)
	{
		if (slopeTopologyKey != null && cache.mesh.getFaces().isEmpty() == false)
		{
			List<SlopeMeshTopologyCache.Face> topologyFaces =
					new ArrayList<SlopeMeshTopologyCache.Face>(cache.mesh.getFaces().size());
			for (EmbeddedHostFace face : cache.mesh.getFaces())
			{
				topologyFaces.add(new SlopeMeshTopologyCache.Face(face, getTopologyTextureSide(railTile, face)));
			}
			SlopeMeshTopologyCache.putIfAbsent(
					slopeTopologyKey, new SlopeMeshTopologyCache.Template(topologyFaces));
		}
		prepareFaceLightingContext(cache, railTile);
		prepareCachedEntryLighting(cache, railTile);
		return cache;
	}

	/**
	 * Recreates fresh placement-owned faces from shared immutable slope topology. The method resolves every block and
	 * icon before changing the destination cache, so an unsupported material cleanly falls back to normal construction.
	 *
	 * @param cache empty tile-local cache receiving rebound faces and culling bounds
	 * @param railTile visible rail tile used to resolve contextual captured-block icons
	 * @param renderBlocks captured or synthetic host cells for this placement
	 * @param topology shared material-independent slope faces
	 * @return whether every topology face was rebound successfully
	 */
	static boolean bindSlopeTopology(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks,
			SlopeMeshTopologyCache.Template topology)
	{
		List<EmbeddedHostFace> boundFaces = new ArrayList<EmbeddedHostFace>(topology.getFaces().size());
		for (SlopeMeshTopologyCache.Face topologyFace : topology.getFaces())
		{
			TileTCRailHostData.CapturedHostBlock hostBlock = renderBlocks.get(topologyFace.getHostKey());
			if (hostBlock == null)
			{
				return false;
			}
			Block block = Block.getBlockById(hostBlock.blockId);
			IIcon icon = block != null
					? getCapturedHostIcon(railTile, hostBlock, block, topologyFace.getTextureSide()) : null;
			if (block == null || icon == null)
			{
				return false;
			}
			boundFaces.add(topologyFace.bind(hostBlock, block, icon));
		}
		for (TileTCRailHostData.CapturedHostBlock hostBlock : renderBlocks.values())
		{
			cache.mesh.includeHost(hostBlock);
		}
		cache.mesh.addFaces(boundFaces);
		return true;
	}

	/**
	 * Selects the captured icon side represented by one generated face so a shared topology can later bind a different
	 * material without retaining the source placement's icon. Every generated half-height ballast face uses the top icon,
	 * including cardinal and diagonal exterior walls, so all lengths preserve the configured top-face side treatment after
	 * topology reuse. Embedded trench walls continue using the side texture selected by their existing generators.
	 *
	 * @param railTile visible rail tile identifying regular diagonal ballast geometry
	 * @param face completed generated face whose source icon side is required
	 * @return Minecraft block-side index used to resolve the face icon
	 */
	static int getTopologyTextureSide(TileTCRail railTile, EmbeddedHostFace face)
	{
		if (face.getSide() == CUSTOM_TOP_FACE || usesGeneratedHalfHeightBallast(railTile))
		{
			return BLOCK_SIDE_TOP;
		}
		if (face.getSide() == OBLIQUE_WALL_FACE)
		{
			return BLOCK_SIDE_NORTH;
		}
		return face.getSide();
	}

	/**
	 * Builds a canonical key for slope geometry while excluding block IDs, metadata texture variants, tint, and light.
	 * Equivalent slopes therefore share topology across materials, while footprint height, slope parameters, orientation,
	 * switch state, and neighboring coverage still produce distinct safe entries.
	 *
	 * @param railTile visible slope tile supplying geometry and placement state
	 * @param renderBlocks captured or synthetic host cells forming the rendered footprint
	 * @return canonical material-independent slope topology key
	 */
	static String getSlopeTopologyKey(TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks)
	{
		StringBuilder key = new StringBuilder(128 + renderBlocks.size() * 48);
		EnumCoreTrack core = railTile.getCoreType();
		key.append("slope-topology-v7|");
		if (usesContinuousTrueEmbeddedDiagonalHalfHeightSlope(railTile))
		{
			key.append("continuous-diagonal-host|");
		}
		key.append(core != null ? core.name() : "NONE").append('|').append(railTile.getFacing())
				.append('|').append(railTile.isReplaceTargetTrack()).append('|').append(railTile.isIntactHostMountedTrack())
				.append('|').append(getHostTerrainSwitchState(railTile))
				.append('|').append(Double.doubleToLongBits(railTile.slopeHeight))
				.append('|').append(Double.doubleToLongBits(railTile.slopeLength))
				.append('|').append(Double.doubleToLongBits(railTile.slopeAngle))
				.append('|').append(Double.doubleToLongBits(railTile.getTrackSurfaceYOffset()))
				.append('|').append(Double.doubleToLongBits(railTile.getTrackHostSurfaceRenderYOffset()));

		List<String> sortedHostKeys = new ArrayList<String>(renderBlocks.keySet());
		Collections.sort(sortedHostKeys);
		for (String hostKey : sortedHostKeys)
		{
			TileTCRailHostData.CapturedHostBlock hostBlock = renderBlocks.get(hostKey);
			Block block = Block.getBlockById(hostBlock.blockId);
			key.append(';').append(hostBlock.offsetX).append(',').append(hostBlock.offsetY).append(',')
					.append(hostBlock.offsetZ);
			for (TileTCRailHostData.CapturedHostShape shape : hostBlock.shapes)
			{
				key.append(':').append(Double.doubleToLongBits(shape.minX)).append(',')
						.append(Double.doubleToLongBits(shape.minY)).append(',')
						.append(Double.doubleToLongBits(shape.minZ)).append(',')
						.append(Double.doubleToLongBits(shape.maxX)).append(',')
						.append(Double.doubleToLongBits(shape.maxY)).append(',')
						.append(Double.doubleToLongBits(shape.maxZ));
			}
			if (block == null)
			{
				key.append(",missing");
				continue;
			}
			key.append(',').append(Double.doubleToLongBits(getHostMinY(block, hostBlock.metadata)))
					.append(',').append(Double.doubleToLongBits(getHostMaxY(block, hostBlock.metadata)));
			if (usesUncutRegularHalfHeightBallast(railTile) == false)
			{
				appendSlopeNeighborTopology(key, railTile, hostBlock, -1, 0, 0);
				appendSlopeNeighborTopology(key, railTile, hostBlock, 1, 0, 0);
				appendSlopeNeighborTopology(key, railTile, hostBlock, 0, -1, 0);
				appendSlopeNeighborTopology(key, railTile, hostBlock, 0, 1, 0);
				appendSlopeNeighborTopology(key, railTile, hostBlock, 0, 0, -1);
				appendSlopeNeighborTopology(key, railTile, hostBlock, 0, 0, 1);
			}
		}
		return key.toString();
	}

	/**
	 * Appends the geometry-relevant state of one adjacent cell without recording its material identity. Captured slab
	 * extents are retained because they can clip a slope wall; ordinary world neighbors collapse to covered or open.
	 *
	 * @param key canonical key receiving the adjacent-cell state
	 * @param railTile visible slope tile supplying world coordinates and captured-host ownership
	 * @param hostBlock current host cell whose neighbor is inspected
	 * @param normalX neighboring cell X offset
	 * @param normalY neighboring cell Y offset
	 * @param normalZ neighboring cell Z offset
	 */
	static void appendSlopeNeighborTopology(StringBuilder key, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, int normalX, int normalY, int normalZ)
	{
		if (railTile.getWorldObj() == null)
		{
			key.append("/open");
			return;
		}
		int worldX = railTile.xCoord + hostBlock.offsetX + normalX;
		int worldY = railTile.yCoord + hostBlock.offsetY + normalY;
		int worldZ = railTile.zCoord + hostBlock.offsetZ + normalZ;
		TileTCRailHostData.CapturedHostBlock capturedNeighbor =
				getCapturedHostBlockAtWorld(railTile, worldX, worldY, worldZ);
		if (capturedNeighbor != null)
		{
			Block capturedBlock = Block.getBlockById(capturedNeighbor.blockId);
			if (capturedBlock == null)
			{
				key.append("/captured-missing");
				return;
			}
			key.append("/captured:").append(Double.doubleToLongBits(
					getHostMinY(capturedBlock, capturedNeighbor.metadata))).append(':').append(Double.doubleToLongBits(
					getHostMaxY(capturedBlock, capturedNeighbor.metadata))).append(':').append(
					isCapturedNeighborPartOfRenderedFootprint(railTile, hostBlock, normalX, normalY, normalZ));
			return;
		}
		Block worldBlock = railTile.getWorldObj().getBlock(worldX, worldY, worldZ);
		boolean covered = worldBlock != null
				&& worldBlock.isAir(railTile.getWorldObj(), worldX, worldY, worldZ) == false
				&& worldBlock.isOpaqueCube();
		key.append(covered ? "/covered" : "/open");
	}

	/**
	 * Returns captured embedded hosts or the synthetic ballast cells used by a regular cardinal or diagonal
	 * half-height slope.
	 *
	 * @param railTile visible rail tile supplying captured or selected ballast material
	 * @return owner-relative host cells used to build the rendered mesh
	 */
	static Map<String, TileTCRailHostData.CapturedHostBlock> getHostBlocksForRendering(TileTCRail railTile)
	{
		if (usesUncutRegularHalfHeightBallast(railTile) == false)
		{
			return railTile.getTrackHostRenderBlocks();
		}
		return getSyntheticHalfHeightBallastBlocks(railTile);
	}

	/**
	 * Creates the material-bearing synthetic cells used to draw one generated half-height ballast wedge.
	 *
	 * @param railTile visible rail tile supplying core length, facing, material, metadata, and tint
	 * @return owner-relative synthetic ballast cells covering the complete slope run
	 */
	static Map<String, TileTCRailHostData.CapturedHostBlock> getSyntheticHalfHeightBallastBlocks(
			TileTCRail railTile)
	{
		Map<String, TileTCRailHostData.CapturedHostBlock> cells =
				new HashMap<String, TileTCRailHostData.CapturedHostBlock>();
		int slopeLength = getHalfHeightSlopeLength(railTile.getCoreType());
		for (int index = 0; index < slopeLength; index++)
		{
			int offsetX = 0;
			int offsetZ = 0;
			if (isDiagonalHalfHeightSlopeCore(railTile.getCoreType()))
			{
				offsetX = railTile.getFacing() == 4 || railTile.getFacing() == 5 ? -index : index;
				offsetZ = railTile.getFacing() == 5 || railTile.getFacing() == 6 ? -index : index;
			}
			else switch (railTile.getFacing())
			{
				case 0:
					offsetZ = index;
					break;
				case 1:
					offsetX = -index;
					break;
				case 2:
					offsetZ = -index;
					break;
				default:
					offsetX = index;
					break;
			}
			TileTCRailHostData.CapturedHostBlock cell =
					new TileTCRailHostData.CapturedHostBlock(offsetX, 0, offsetZ,
						railTile.getBallastMaterial(), railTile.ballastMetadata, railTile.ballastColour);
			cells.put(TileTCRailHostData.key(offsetX, 0, offsetZ), cell);
		}
		return cells;
	}

	/**
	 * Appends a complete generated cardinal or diagonal half-height ballast wedge to an existing host mesh.
	 * A positive base offset places the wedge on top of a captured slab without altering its authored half-block rise.
	 *
	 * @param target cache receiving the generated ballast faces and culling bounds
	 * @param railTile visible rail tile supplying slope direction, length, material, and world context
	 * @param ballastBlocks synthetic material-bearing cells covering the slope run
	 * @param baseY local height of the wedge's low edge, in blocks
	 */
	static void addGeneratedHalfHeightBallast(EmbeddedHostRenderCache target, TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> ballastBlocks, double baseY)
	{
		EmbeddedHostRenderCache generated = new EmbeddedHostRenderCache(0, false, 0L);
		Set<String> ballastKeys = new HashSet<String>(ballastBlocks.keySet());
		for (TileTCRailHostData.CapturedHostBlock hostBlock : ballastBlocks.values())
		{
			target.mesh.includeHost(hostBlock);
		}
		if (isDiagonalHalfHeightSlopeCore(railTile.getCoreType()))
		{
			addUncutDiagonalHalfHeightSlope(generated, railTile, ballastBlocks);
		}
		else
		{
			for (TileTCRailHostData.CapturedHostBlock hostBlock : ballastBlocks.values())
			{
				Block block = Block.getBlockById(hostBlock.blockId);
				if (block != null)
				{
					addUncutHalfHeightSlopeCell(generated, railTile, ballastKeys, hostBlock, block);
				}
			}
			warpUncutHalfHeightSlopeFaces(generated.mesh, railTile);
		}
		if (Math.abs(baseY) > GEOMETRY_EPSILON)
		{
			translateMeshVertically(generated.mesh, baseY);
		}
		target.mesh.addFaces(generated.mesh.getFaces());
	}

	/**
	 * Moves every custom quad in a generated ballast mesh upward without changing its UVs, normals, or winding.
	 *
	 * @param mesh generated half-height ballast mesh to translate in place
	 * @param offsetY vertical translation in blocks
	 */
	static void translateMeshVertically(EmbeddedHostMesh mesh, double offsetY)
	{
		List<EmbeddedHostFace> faces = mesh.getFaces();
		for (int index = 0; index < faces.size(); index++)
		{
			EmbeddedHostFace source = faces.get(index);
			if (source.isQuad() == false)
			{
				continue;
			}
			QuadVertices vertices = source.getQuadVertices();
			QuadVertices translatedVertices = new QuadVertices(
					vertices.firstX, vertices.firstY + offsetY, vertices.firstZ,
					vertices.secondX, vertices.secondY + offsetY, vertices.secondZ,
					vertices.thirdX, vertices.thirdY + offsetY, vertices.thirdZ,
					vertices.fourthX, vertices.fourthY + offsetY, vertices.fourthZ);
			TileTCRailHostData.CapturedHostBlock hostBlock =
					new TileTCRailHostData.CapturedHostBlock(source.getOffsetX(), source.getOffsetY(),
							source.getOffsetZ(), Block.getIdFromBlock(source.getBlock()), source.getMetadata(),
							source.getColour());
			EmbeddedHostFace translated = source.getQuadTextureCoordinates() != null
					? EmbeddedHostFace.texturedQuad(hostBlock, source.getBlock(), source.getIcon(), source.getSide(),
							source.getNormalX(), source.getNormalY(), source.getNormalZ(), source.getDirectionalShade(),
							translatedVertices, source.getQuadTextureCoordinates())
					: EmbeddedHostFace.quad(hostBlock, source.getBlock(), source.getIcon(), source.getSide(),
							source.getNormalX(), source.getNormalY(), source.getNormalZ(), source.getDirectionalShade(),
							translatedVertices);
			translated.setTopAnchoredSideTexture(source.isTopAnchoredSideTexture());
			translated.setVirtualTrenchWall(source.isVirtualTrenchWall());
			mesh.setFace(index, translated);
		}
	}

	/**
	 * Builds the regular diagonal half-height ballast as the same rotated wedge used by the authored OBJ. The strip is
	 * exactly square-root-of-two blocks wide, extends to the nominal 3/6/9-block endpoint, and rises by half a block.
	 *
	 * @param cache cache receiving generated top, side, and high-end faces
	 * @param railTile visible rail tile supplying facing, length, material, and tint
	 * @param renderBlocks synthetic diagonal footprint cells supplying the selected ballast material
	 */
	static void addUncutDiagonalHalfHeightSlope(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = renderBlocks.get(
				TileTCRailHostData.key(0, 0, 0));
		if (hostBlock == null)
		{
			return;
		}
		Block block = Block.getBlockById(hostBlock.blockId);
		IIcon icon = block != null ? getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_TOP) : null;
		int blockLength = getHalfHeightSlopeLength(railTile.getCoreType());
		if (block == null || icon == null || blockLength <= 0)
		{
			return;
		}

		double physicalLength = blockLength * DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH;
		double topTextureLength = getDiagonalHalfHeightTopTextureLength(blockLength);
		double texturePhase = getDiagonalHalfHeightTopTexturePhase(blockLength);
		List<Double> lengthBoundaries = getTextureRepeatBoundaries(
				physicalLength, topTextureLength, texturePhase);
		List<Double> widthBoundaries = getTextureRepeatBoundaries(
				DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH, DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH, 0.0D);
		for (int lengthIndex = 0; lengthIndex < lengthBoundaries.size() - 1; lengthIndex++)
		{
			double startDistance = lengthBoundaries.get(lengthIndex);
			double endDistance = lengthBoundaries.get(lengthIndex + 1);
			for (int widthIndex = 0; widthIndex < widthBoundaries.size() - 1; widthIndex++)
			{
				addDiagonalHalfHeightTopFace(cache, railTile, hostBlock, block, icon, physicalLength,
						topTextureLength,
						startDistance, endDistance, widthBoundaries.get(widthIndex),
						widthBoundaries.get(widthIndex + 1), texturePhase);
			}
		}
		List<Double> sideLengthBoundaries = getTextureRepeatBoundaries(
				physicalLength, physicalLength, texturePhase);
		for (int lengthIndex = 0; lengthIndex < sideLengthBoundaries.size() - 1; lengthIndex++)
		{
			double startDistance = sideLengthBoundaries.get(lengthIndex);
			double endDistance = sideLengthBoundaries.get(lengthIndex + 1);
			addDiagonalHalfHeightSideFace(cache, railTile, hostBlock, block, icon, physicalLength,
					startDistance, endDistance, 0.0D, false, texturePhase);
			addDiagonalHalfHeightSideFace(cache, railTile, hostBlock, block, icon, physicalLength,
					startDistance, endDistance, DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH, true, texturePhase);
		}
		IIcon sideIcon = icon;
		if (sideIcon != null)
		{
			addDiagonalHalfHeightTerminalLanding(cache, railTile, hostBlock, block, icon, sideIcon,
					physicalLength, topTextureLength, texturePhase,
					getDiagonalHalfHeightBallastY(railTile, physicalLength, physicalLength),
					0.0D, 0.0D, false);
		}
	}

	/**
	 * Builds the complete true-embedded diagonal half-height host as one continuous authored-width strip. The method uses
	 * the regular diagonal slope's dimensions and UV progression, lowers only the two established rail pockets, and splits
	 * faces at host-cell boundaries so captured materials and lighting remain placement-specific.
	 *
	 * @param cache cache receiving continuous top, pocket-wall, exterior-side, and raised-end faces
	 * @param railTile visible true-embedded diagonal slope supplying its facing, length, rise, and surface height
	 * @param renderBlocks captured host cells supplying block type, metadata, tint, and lighting ownership
	 */
	static void addContinuousTrueEmbeddedDiagonalHalfHeightSlope(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks)
	{
		int blockLength = getHalfHeightSlopeLength(railTile.getCoreType());
		if (blockLength <= 0 || renderBlocks.isEmpty())
		{
			return;
		}
		for (TileTCRailHostData.CapturedHostBlock hostBlock : renderBlocks.values())
		{
			cache.mesh.includeHost(hostBlock);
		}

		double physicalLength = blockLength * DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH;
		double textureLength = getDiagonalHalfHeightTopTextureLength(blockLength);
		double texturePhase = getDiagonalHalfHeightTopTexturePhase(blockLength);
		double baseTopY = getRaisedProfileTop(railTile) + FACE_HEIGHT_EPSILON;
		List<Double> lengthBoundaries = getContinuousDiagonalLengthBoundaries(
				physicalLength, textureLength, texturePhase, blockLength);
		List<Double> widthBoundaries = getContinuousDiagonalTrenchBoundaries();

		for (int lengthIndex = 0; lengthIndex < lengthBoundaries.size() - 1; lengthIndex++)
		{
			double startDistance = lengthBoundaries.get(lengthIndex);
			double endDistance = lengthBoundaries.get(lengthIndex + 1);
			TileTCRailHostData.CapturedHostBlock hostBlock = getContinuousDiagonalHost(
					railTile, renderBlocks, (startDistance + endDistance) * 0.5D, blockLength);
			Block block = hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null;
			IIcon topIcon = block != null ? getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_TOP) : null;
			IIcon sideIcon = block != null ? getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH) : null;
			if (hostBlock == null || block == null || topIcon == null || sideIcon == null)
			{
				continue;
			}
			for (int widthIndex = 0; widthIndex < widthBoundaries.size() - 1; widthIndex++)
			{
				double startWidth = widthBoundaries.get(widthIndex);
				double endWidth = widthBoundaries.get(widthIndex + 1);
				double lineCoordinate = 1.0D - Math.sqrt(2.0D) * (startWidth + endWidth) * 0.5D;
				double topOffset = isContinuousDiagonalPocket(lineCoordinate) ? -TRENCH_POCKET_DROP : 0.0D;
				addContinuousDiagonalTopFace(cache, railTile, hostBlock, block, topIcon, physicalLength,
						textureLength, startDistance, endDistance, startWidth, endWidth, texturePhase,
						baseTopY + topOffset);
			}
			double bottomY = getHostMinY(block, hostBlock.metadata);
			addContinuousDiagonalSideFace(cache, railTile, hostBlock, block, sideIcon, physicalLength,
					startDistance, endDistance, 0.0D, false, texturePhase, baseTopY, bottomY);
			addContinuousDiagonalSideFace(cache, railTile, hostBlock, block, sideIcon, physicalLength,
					startDistance, endDistance, DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH, true,
					texturePhase, baseTopY, bottomY);
		}

		addContinuousDiagonalPocketWalls(cache, railTile, renderBlocks, physicalLength, baseTopY,
				blockLength, texturePhase);
		addContinuousDiagonalEnd(cache, railTile, renderBlocks, 0.0D, physicalLength, baseTopY,
				widthBoundaries, blockLength, false);
		TileTCRailHostData.CapturedHostBlock endHost = getContinuousDiagonalHost(
				railTile, renderBlocks, physicalLength - GEOMETRY_EPSILON, blockLength);
		Block endBlock = endHost != null ? Block.getBlockById(endHost.blockId) : null;
		IIcon endTopIcon = endBlock != null
				? getCapturedHostIcon(railTile, endHost, endBlock, BLOCK_SIDE_TOP) : null;
		IIcon endSideIcon = endBlock != null
				? getCapturedHostIcon(railTile, endHost, endBlock, BLOCK_SIDE_NORTH) : null;
		if (endHost != null && endBlock != null && endTopIcon != null && endSideIcon != null)
		{
			addDiagonalHalfHeightTerminalLanding(cache, railTile, endHost, endBlock, endTopIcon, endSideIcon,
					physicalLength, textureLength, texturePhase,
					baseTopY + getDiagonalHalfHeightBallastY(railTile, physicalLength, physicalLength),
					getRaisedProfileTop(railTile), getHostMinY(endBlock, endHost.metadata), true);
		}
	}

	/**
	 * Produces longitudinal split points at every top-texture repeat, side-texture repeat, and captured diagonal host
	 * boundary. The top and side textures use different longitudinal scales, so including both repeat sets prevents either
	 * UV interpolation from crossing an atlas seam inside one face.
	 *
	 * @param physicalLength complete diagonal centerline length in blocks
	 * @param textureLength authored longitudinal UV extent across the complete slope
	 * @param texturePhase authored UV coordinate at the low end
	 * @param blockLength number of captured diagonal host cells
	 * @return sorted, duplicate-free distances from zero through {@code physicalLength}
	 */
	static List<Double> getContinuousDiagonalLengthBoundaries(double physicalLength,
			double textureLength, double texturePhase, int blockLength)
	{
		List<Double> candidates = getTextureRepeatBoundaries(physicalLength, textureLength, texturePhase);
		candidates.addAll(getTextureRepeatBoundaries(physicalLength, physicalLength, texturePhase));
		for (int index = 1; index < blockLength; index++)
		{
			candidates.add(index * DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
		}
		Collections.sort(candidates);
		List<Double> boundaries = new ArrayList<Double>(candidates.size());
		for (double candidate : candidates)
		{
			if (boundaries.isEmpty()
					|| Math.abs(candidate - boundaries.get(boundaries.size() - 1)) > GEOMETRY_EPSILON)
			{
				boundaries.add(candidate);
			}
		}
		return boundaries;
	}

	/**
	 * Produces cross-track split points for both exterior edges and all four exact diagonal rail-pocket walls.
	 *
	 * @return sorted cross-track distances spanning the complete square-root-of-two-block strip width
	 */
	static List<Double> getContinuousDiagonalTrenchBoundaries()
	{
		List<Double> boundaries = getTextureRepeatBoundaries(
				DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH, DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH, 0.0D);
		double[] pocketEdges = new double[] {
				-DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH,
				-DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH
		};
		for (double pocketEdge : pocketEdges)
		{
			boundaries.add((1.0D - pocketEdge) / Math.sqrt(2.0D));
		}
		Collections.sort(boundaries);
		return boundaries;
	}

	/**
	 * Determines whether one diagonal line coordinate lies inside either established rail pocket.
	 *
	 * @param lineCoordinate signed perpendicular coordinate relative to the diagonal centerline
	 * @return {@code true} when the coordinate lies beneath either rail corridor
	 */
	static boolean isContinuousDiagonalPocket(double lineCoordinate)
	{
		double lowMinimum = -DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH;
		double lowMaximum = -DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH;
		double highMinimum = DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH;
		double highMaximum = DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH;
		return lineCoordinate >= lowMinimum && lineCoordinate <= lowMaximum
				|| lineCoordinate >= highMinimum && lineCoordinate <= highMaximum;
	}

	/**
	 * Resolves the captured host cell containing one longitudinal section of the continuous diagonal strip.
	 *
	 * @param railTile visible diagonal slope supplying its core and facing
	 * @param renderBlocks captured host cells keyed relative to the visible parent
	 * @param centerlineDistance distance from the low end along the diagonal centerline, in blocks
	 * @param blockLength number of captured diagonal host cells
	 * @return matching captured host, or the first captured host when a legacy footprint omits the expected key
	 */
	static TileTCRailHostData.CapturedHostBlock getContinuousDiagonalHost(TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks,
			double centerlineDistance, int blockLength)
	{
		int index = Math.max(0, Math.min(blockLength - 1,
				(int)Math.floor(centerlineDistance / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH)));
		int[] offset = EmbeddedHostPreviewRenderer.getHalfHeightSlopeCellOffset(
				railTile.getCoreType(), railTile.getFacing(), index);
		TileTCRailHostData.CapturedHostBlock hostBlock = renderBlocks.get(
				TileTCRailHostData.key(offset[0], 0, offset[1]));
		return hostBlock != null ? hostBlock : renderBlocks.values().iterator().next();
	}

	/**
	 * Adds one continuous diagonal top section at either terrain height or the one-pixel-lower rail-pocket height.
	 * Coordinates are converted back into the owning host's local space so world placement, lighting, and tint remain tied
	 * to that captured cell.
	 *
	 * @param cache cache receiving the generated top face
	 * @param railTile visible diagonal slope supplying facing and rise
	 * @param hostBlock captured host owning this longitudinal section
	 * @param block captured host block type
	 * @param icon captured top icon
	 * @param physicalLength complete diagonal centerline length in blocks
	 * @param textureLength authored longitudinal UV extent
	 * @param startDistance first centerline distance in blocks
	 * @param endDistance second centerline distance in blocks
	 * @param startWidth first cross-track distance in blocks
	 * @param endWidth second cross-track distance in blocks
	 * @param texturePhase authored longitudinal UV coordinate at the low end
	 * @param baseTopY low-end terrain or pocket height in local block coordinates
	 */
	static void addContinuousDiagonalTopFace(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double textureLength, double startDistance, double endDistance,
			double startWidth, double endWidth, double texturePhase, double baseTopY)
	{
		PointXZ first = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), startDistance, endWidth);
		PointXZ second = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, endWidth);
		PointXZ third = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, startWidth);
		PointXZ fourth = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), startDistance, startWidth);
		double startY = baseTopY + getDiagonalHalfHeightBallastY(railTile, startDistance, physicalLength);
		double endY = baseTopY + getDiagonalHalfHeightBallastY(railTile, endDistance, physicalLength);
		double startU = getWrappedTextureStart(
				startWidth * DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
		double endU = getWrappedTextureEnd(
				endWidth * DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
		double startV = 1.0D - getWrappedTextureStart(texturePhase + startDistance * textureLength / physicalLength);
		double endV = 1.0D - getWrappedTextureEnd(texturePhase + endDistance * textureLength / physicalLength);
		double offsetX = hostBlock.offsetX;
		double offsetZ = hostBlock.offsetZ;
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, CUSTOM_TOP_FACE,
				0, 1, 0, SHADE_TOP_FACE,
				new QuadVertices(first.x - offsetX, startY, first.z - offsetZ,
						second.x - offsetX, endY, second.z - offsetZ,
						third.x - offsetX, endY, third.z - offsetZ,
						fourth.x - offsetX, startY, fourth.z - offsetZ),
				new QuadTextureCoordinates(endU, startV, endU, endV, startU, endV, startU, startV)));
	}

	/**
	 * Adds one continuous exterior side section as two independently mapped faces. The lower face uses ordinary block-side
	 * UVs, while the upper half-height wedge copies the established generated diagonal slope's UV formula exactly. This
	 * keeps the grass edge upright and prevents either part from stretching across the other's height.
	 *
	 * @param cache cache receiving the generated wall face
	 * @param railTile visible diagonal slope supplying facing and rise
	 * @param hostBlock captured host owning this longitudinal section
	 * @param block captured host block type
	 * @param icon captured side icon
	 * @param physicalLength complete diagonal centerline length in blocks
	 * @param startDistance first centerline distance in blocks
	 * @param endDistance second centerline distance in blocks
	 * @param widthDistance cross-track position of the exterior edge in blocks
	 * @param reverse whether the opposite exterior edge requires reversed winding
	 * @param texturePhase authored longitudinal UV coordinate at the low end
	 * @param baseTopY low-end terrain height in local block coordinates
	 * @param bottomY captured host's lowest rendered local Y coordinate
	 */
	static void addContinuousDiagonalSideFace(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double startDistance, double endDistance, double widthDistance,
			boolean reverse, double texturePhase, double baseTopY, double bottomY)
	{
		PointXZ start = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), startDistance, widthDistance);
		PointXZ end = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, widthDistance);
		double startY = baseTopY + getDiagonalHalfHeightBallastY(railTile, startDistance, physicalLength);
		double endY = baseTopY + getDiagonalHalfHeightBallastY(railTile, endDistance, physicalLength);
		double startU = getWrappedTextureStart(startDistance + texturePhase);
		double endU = getWrappedTextureEnd(endDistance + texturePhase);
		double surfaceY = getRaisedProfileTop(railTile);
		int[] normal = getDiagonalHalfHeightSideNormal(railTile.getFacing(), reverse);
		if (surfaceY > bottomY + GEOMETRY_EPSILON)
		{
			addContinuousDiagonalSideLayer(cache, hostBlock, block, icon, start, end,
					surfaceY, surfaceY, bottomY, startU, endU,
					0.0D, 0.0D, clampIconCoordinate(surfaceY - bottomY), reverse, normal);
		}
		if (Math.max(startY, endY) > surfaceY + GEOMETRY_EPSILON)
		{
			double startTopV = clampIconCoordinate(0.5D - (startY - baseTopY));
			double endTopV = clampIconCoordinate(0.5D - (endY - baseTopY));
			addContinuousDiagonalSideLayer(cache, hostBlock, block, icon, start, end,
					startY, endY, surfaceY, startU, endU,
					startTopV, endTopV, 0.5D, reverse, normal);
		}
	}

	/**
	 * Emits one atlas-safe vertical layer of a continuous diagonal exterior wall.
	 *
	 * @param cache cache receiving the generated wall layer
	 * @param hostBlock captured host owning this longitudinal section
	 * @param block captured host block type
	 * @param icon captured side icon
	 * @param start first world-relative edge point
	 * @param end second world-relative edge point
	 * @param startTopY layer top at the first point
	 * @param endTopY layer top at the second point
	 * @param bottomY shared layer bottom
	 * @param startU icon-local longitudinal coordinate at the first point
	 * @param endU icon-local longitudinal coordinate at the second point
	 * @param startTopV icon-local vertical coordinate at the first top point
	 * @param endTopV icon-local vertical coordinate at the second top point
	 * @param bottomV icon-local vertical coordinate along the shared bottom edge
	 * @param reverse whether the opposite exterior edge requires reversed winding
	 * @param normal two-element X/Z lighting normal for this exterior edge
	 */
	static void addContinuousDiagonalSideLayer(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			PointXZ start, PointXZ end, double startTopY, double endTopY, double bottomY,
			double startU, double endU, double startTopV, double endTopV, double bottomV,
			boolean reverse, int[] normal)
	{
		double offsetX = hostBlock.offsetX;
		double offsetZ = hostBlock.offsetZ;
		QuadVertices vertices = reverse
				? new QuadVertices(end.x - offsetX, endTopY, end.z - offsetZ,
						start.x - offsetX, startTopY, start.z - offsetZ,
						start.x - offsetX, bottomY, start.z - offsetZ,
						end.x - offsetX, bottomY, end.z - offsetZ)
				: new QuadVertices(start.x - offsetX, startTopY, start.z - offsetZ,
						end.x - offsetX, endTopY, end.z - offsetZ,
						end.x - offsetX, bottomY, end.z - offsetZ,
						start.x - offsetX, bottomY, start.z - offsetZ);
		QuadTextureCoordinates texture = reverse
				? new QuadTextureCoordinates(endU, endTopV, startU, startTopV,
						startU, bottomV, endU, bottomV)
				: new QuadTextureCoordinates(startU, startTopV, endU, endTopV,
						endU, bottomV, startU, bottomV);
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, OBLIQUE_WALL_FACE,
				normal[0], 0, normal[1], SHADE_OBLIQUE_WALL, vertices, texture));
	}

	/**
	 * Restricts one generated icon-local coordinate to the current atlas sprite.
	 *
	 * @param coordinate generated icon-local coordinate
	 * @return the coordinate clamped from zero through one
	 */
	static double clampIconCoordinate(double coordinate)
	{
		return Math.max(0.0D, Math.min(1.0D, coordinate));
	}

	/**
	 * Adds the four uninterrupted one-pixel pocket walls beneath both diagonal rails. Each wall is split at captured-host
	 * boundaries and every longitudinal texture repeat, then mapped explicitly to the topmost one-pixel slice of the side
	 * icon. This keeps material, tint, and lighting placement-specific without sampling beyond the selected atlas sprite.
	 *
	 * @param cache cache receiving the generated pocket walls
	 * @param railTile visible diagonal slope supplying facing and rise
	 * @param renderBlocks captured host cells supplying material and lighting ownership
	 * @param physicalLength complete diagonal centerline length in blocks
	 * @param baseTopY low-end terrain height in local block coordinates
	 * @param blockLength number of captured diagonal host cells
	 * @param texturePhase authored longitudinal texture coordinate at the low end
	 */
	static void addContinuousDiagonalPocketWalls(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks,
			double physicalLength, double baseTopY, int blockLength, double texturePhase)
	{
		double[] lineCoordinates = new double[] {
				-DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH,
				-DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH
		};
		List<Double> lengthBoundaries = getContinuousDiagonalLengthBoundaries(
				physicalLength, physicalLength, texturePhase, blockLength);
		for (int index = 0; index < lengthBoundaries.size() - 1; index++)
		{
			double startDistance = lengthBoundaries.get(index);
			double endDistance = lengthBoundaries.get(index + 1);
			TileTCRailHostData.CapturedHostBlock hostBlock = getContinuousDiagonalHost(
					railTile, renderBlocks, (startDistance + endDistance) * 0.5D, blockLength);
			Block block = hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null;
			IIcon icon = block != null ? getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH) : null;
			if (hostBlock == null || block == null || icon == null)
			{
				continue;
			}
			double offsetX = hostBlock.offsetX;
			double offsetZ = hostBlock.offsetZ;
			double startTopY = baseTopY + getDiagonalHalfHeightBallastY(railTile, startDistance, physicalLength);
			double endTopY = baseTopY + getDiagonalHalfHeightBallastY(railTile, endDistance, physicalLength);
			double startU = getWrappedTextureStart(texturePhase + startDistance);
			double endU = getWrappedTextureEnd(texturePhase + endDistance);
			for (double lineCoordinate : lineCoordinates)
			{
				double widthDistance = (1.0D - lineCoordinate) / Math.sqrt(2.0D);
				PointXZ start = getDiagonalHalfHeightBallastPoint(
						railTile.getFacing(), startDistance, widthDistance);
				PointXZ end = getDiagonalHalfHeightBallastPoint(
						railTile.getFacing(), endDistance, widthDistance);
				EmbeddedHostFace wall = EmbeddedHostFace.texturedQuad(hostBlock, block, icon, OBLIQUE_WALL_FACE,
						0, 1, 0, SHADE_OBLIQUE_WALL, new QuadVertices(
						start.x - offsetX, startTopY, start.z - offsetZ,
						end.x - offsetX, endTopY, end.z - offsetZ,
						end.x - offsetX, endTopY - TRENCH_POCKET_DROP, end.z - offsetZ,
						start.x - offsetX, startTopY - TRENCH_POCKET_DROP, start.z - offsetZ),
						new QuadTextureCoordinates(startU, 0.0D, endU, 0.0D,
								endU, TRENCH_POCKET_DROP, startU, TRENCH_POCKET_DROP));
				wall.setVirtualTrenchWall(true);
				cache.mesh.addFace(wall);
			}
		}
	}

	/**
	 * Closes one cross-track end of the continuous diagonal host strip while retaining pocket-height notches beneath both
	 * rails. Both the low and raised ends use this path so neither end depends on an OBJ shell.
	 *
	 * @param cache cache receiving the generated raised-end faces
	 * @param railTile visible diagonal slope supplying facing and rise
	 * @param renderBlocks captured host cells supplying the end material and lighting ownership
	 * @param endDistance centerline distance of the end being closed in blocks
	 * @param physicalLength complete diagonal centerline length in blocks
	 * @param baseTopY low-end terrain height in local block coordinates
	 * @param widthBoundaries cross-track boundaries containing exterior, texture, and pocket edges
	 * @param blockLength number of captured diagonal host cells
	 * @param raisedEnd whether this is the high end and therefore requires the opposite winding and normal
	 */
	static void addContinuousDiagonalEnd(EmbeddedHostRenderCache cache, TileTCRail railTile,
			Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks,
			double endDistance, double physicalLength, double baseTopY, List<Double> widthBoundaries,
			int blockLength, boolean raisedEnd)
	{
		TileTCRailHostData.CapturedHostBlock hostBlock = getContinuousDiagonalHost(
				railTile, renderBlocks, raisedEnd ? physicalLength - GEOMETRY_EPSILON : 0.0D, blockLength);
		Block block = hostBlock != null ? Block.getBlockById(hostBlock.blockId) : null;
		IIcon icon = block != null ? getCapturedHostIcon(railTile, hostBlock, block, BLOCK_SIDE_NORTH) : null;
		if (hostBlock == null || block == null || icon == null)
		{
			return;
		}
		double bottomY = getHostMinY(block, hostBlock.metadata);
		double surfaceY = getRaisedProfileTop(railTile);
		int[] normal = getDiagonalHalfHeightEndNormal(railTile.getFacing());
		if (raisedEnd == false)
		{
			normal = new int[] {-normal[0], -normal[1]};
		}
		for (int widthIndex = 0; widthIndex < widthBoundaries.size() - 1; widthIndex++)
		{
			double startWidth = widthBoundaries.get(widthIndex);
			double endWidth = widthBoundaries.get(widthIndex + 1);
			double lineCoordinate = 1.0D - Math.sqrt(2.0D) * (startWidth + endWidth) * 0.5D;
			double topY = baseTopY + getDiagonalHalfHeightBallastY(railTile, endDistance, physicalLength)
					- (isContinuousDiagonalPocket(lineCoordinate) ? TRENCH_POCKET_DROP : 0.0D);
			PointXZ first = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, startWidth);
			PointXZ second = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, endWidth);
			double startU = getWrappedTextureStart(
					startWidth * DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
			double endU = getWrappedTextureEnd(
					endWidth * DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
			double lowerTopY = Math.min(topY, surfaceY);
			if (lowerTopY > bottomY + GEOMETRY_EPSILON)
			{
				addContinuousDiagonalEndLayer(cache, hostBlock, block, icon, first, second,
						lowerTopY, bottomY, startU, endU,
						clampIconCoordinate(surfaceY - lowerTopY),
						clampIconCoordinate(surfaceY - bottomY), raisedEnd, normal);
			}
			if (topY > surfaceY + GEOMETRY_EPSILON)
			{
				addContinuousDiagonalEndLayer(cache, hostBlock, block, icon, first, second,
						topY, surfaceY, startU, endU,
						clampIconCoordinate(0.5D - (topY - baseTopY)),
						0.5D, raisedEnd, normal);
			}
		}
	}

	/**
	 * Emits one atlas-safe vertical layer of a continuous diagonal low- or high-end cap.
	 *
	 * @param cache cache receiving the generated end layer
	 * @param hostBlock captured host owning the end
	 * @param block captured host block type
	 * @param icon captured side icon
	 * @param first first cross-track edge point
	 * @param second second cross-track edge point
	 * @param topY layer top in local block coordinates
	 * @param bottomY layer bottom in local block coordinates
	 * @param startU icon-local coordinate at the first edge
	 * @param endU icon-local coordinate at the second edge
	 * @param topV icon-local vertical coordinate along the top edge
	 * @param bottomV icon-local vertical coordinate along the bottom edge
	 * @param raisedEnd whether the high-end winding is required
	 * @param normal two-element X/Z lighting normal for this end
	 */
	static void addContinuousDiagonalEndLayer(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			PointXZ first, PointXZ second, double topY, double bottomY,
			double startU, double endU, double topV, double bottomV, boolean raisedEnd, int[] normal)
	{
		double offsetX = hostBlock.offsetX;
		double offsetZ = hostBlock.offsetZ;
		QuadVertices vertices = raisedEnd
				? new QuadVertices(first.x - offsetX, topY, first.z - offsetZ,
						second.x - offsetX, topY, second.z - offsetZ,
						second.x - offsetX, bottomY, second.z - offsetZ,
						first.x - offsetX, bottomY, first.z - offsetZ)
				: new QuadVertices(second.x - offsetX, topY, second.z - offsetZ,
						first.x - offsetX, topY, first.z - offsetZ,
						first.x - offsetX, bottomY, first.z - offsetZ,
						second.x - offsetX, bottomY, second.z - offsetZ);
		QuadTextureCoordinates texture = raisedEnd
				? new QuadTextureCoordinates(startU, topV, endU, topV,
						endU, bottomV, startU, bottomV)
				: new QuadTextureCoordinates(endU, topV, startU, topV,
						startU, bottomV, endU, bottomV);
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, OBLIQUE_WALL_FACE,
				normal[0], 0, normal[1], SHADE_OBLIQUE_WALL, vertices, texture));
	}

	/**
	 * Adds the two triangular terminal ears present on every authored full-height diagonal slope. The half-height models
	 * were cut from longer slopes before this landing, so the generated renderer restores its exact half-block forward
	 * reach at the final slope height. True-embedded landings continue both rail pockets through the restored geometry;
	 * ordinary ballast landings remain solid. Boundary walls close the added shape without restoring the obsolete
	 * cross-cap through its middle.
	 *
	 * @param cache cache receiving the terminal top triangles and boundary walls
	 * @param railTile visible diagonal slope supplying its facing
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param topIcon block icon used by the two terminal top triangles
	 * @param sideIcon block icon used by the four exposed landing walls
	 * @param physicalLength centerline distance from the low end to the original strip endpoint, in blocks
	 * @param topTextureLength authored longitudinal UV extent across the sloped strip
	 * @param texturePhase authored longitudinal UV coordinate at the low end of the sloped strip
	 * @param topY final flat landing height in local block coordinates
	 * @param surfaceY unraised support height separating the lower block wall from the half-height upper wall
	 * @param bottomY lowest rendered local Y coordinate of the support material
	 * @param cutRailPockets whether the two true-embedded rail trenches continue through the landing
	 */
	static void addDiagonalHalfHeightTerminalLanding(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon topIcon, IIcon sideIcon,
			double physicalLength, double topTextureLength, double texturePhase,
			double topY, double surfaceY, double bottomY, boolean cutRailPockets)
	{
		PointXZ[] points = getDiagonalHalfHeightTerminalLandingPoints(railTile.getFacing(), physicalLength);
		PointXZ first = points[0];
		PointXZ second = points[2];
		PointXZ firstEar = points[3];
		PointXZ secondEar = points[4];
		List<Double> widthBoundaries = getDiagonalHalfHeightTerminalLandingBoundaries(cutRailPockets);
		for (int index = 0; index < widthBoundaries.size() - 1; index++)
		{
			double startWidth = widthBoundaries.get(index);
			double endWidth = widthBoundaries.get(index + 1);
			double midpoint = (startWidth + endWidth) * 0.5D;
			double lineCoordinate = 1.0D - Math.sqrt(2.0D) * midpoint;
			double sectionTopY = cutRailPockets && isContinuousDiagonalPocket(lineCoordinate)
					? topY - TRENCH_POCKET_DROP : topY;
			addDiagonalTerminalLandingTopSection(cache, railTile, hostBlock, block, topIcon,
					physicalLength, topTextureLength, texturePhase,
					startWidth, endWidth, sectionTopY);
			PointXZ outerStart = getDiagonalTerminalLandingOuterPoint(
					railTile.getFacing(), physicalLength, startWidth);
			PointXZ outerEnd = getDiagonalTerminalLandingOuterPoint(
					railTile.getFacing(), physicalLength, endWidth);
			boolean reverseTextureCoordinates = midpoint > DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH * 0.5D;
			addDiagonalTerminalLandingWall(cache, hostBlock, block, sideIcon,
					outerEnd, outerStart, sectionTopY, surfaceY, bottomY,
					reverseTextureCoordinates, false);
		}

		addDiagonalTerminalLandingWall(cache, hostBlock, block, sideIcon,
				firstEar, first, topY, surfaceY, bottomY, true, false);
		addDiagonalTerminalLandingWall(cache, hostBlock, block, sideIcon,
				second, secondEar, topY, surfaceY, bottomY, false, false);
		if (cutRailPockets)
		{
			addDiagonalTerminalLandingPocketWalls(cache, railTile, hostBlock, block, sideIcon,
					physicalLength, topY);
		}
	}

	/**
	 * Produces width splits for the diagonal terminal landing. Every split is either the center crease, a continued
	 * top-texture repeat, or—when requested—one of the four exact rail-pocket edges, so no emitted face crosses a texture
	 * atlas boundary or mixes raised terrain with a lowered trench.
	 *
	 * @param cutRailPockets whether rail-pocket edges must be included
	 * @return sorted, duplicate-free cross-track distances spanning the complete terminal width
	 */
	static List<Double> getDiagonalHalfHeightTerminalLandingBoundaries(boolean cutRailPockets)
	{
		List<Double> candidates = getTextureRepeatBoundaries(DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH,
				DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH, 0.0D);
		candidates.add(DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH * 0.5D);
		if (cutRailPockets)
		{
			double[] lineCoordinates = new double[] {
					-DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH,
					-DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH,
					DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH,
					DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH
			};
			for (double lineCoordinate : lineCoordinates)
			{
				candidates.add((1.0D - lineCoordinate) / Math.sqrt(2.0D));
			}
		}
		Collections.sort(candidates);
		List<Double> boundaries = new ArrayList<Double>(candidates.size());
		for (double candidate : candidates)
		{
			if (boundaries.isEmpty()
					|| Math.abs(candidate - boundaries.get(boundaries.size() - 1)) > GEOMETRY_EPSILON)
			{
				boundaries.add(candidate);
			}
		}
		return boundaries;
	}

	/**
	 * Emits one raised or pocket-height width slice of the diagonal terminal landing. The slice is clipped again wherever
	 * its outward V coordinate crosses a texture repeat, preventing interpolation through neighboring atlas sprites. U
	 * continues the adjacent slope's cross-track mapping, while V uses the authored terminal's one-repeat-per-block scale
	 * from the slope endpoint so the restored ears do not stretch the captured block texture.
	 *
	 * @param cache cache receiving the terminal top section
	 * @param railTile visible diagonal slope supplying its facing
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param icon captured top icon
	 * @param physicalLength centerline distance to the original slope endpoint, in blocks
	 * @param topTextureLength authored longitudinal UV extent across the sloped strip
	 * @param texturePhase authored longitudinal UV coordinate at the low end of the sloped strip
	 * @param startWidth first cross-track distance of this section, in blocks
	 * @param endWidth second cross-track distance of this section, in blocks
	 * @param sectionTopY raised terrain or lowered pocket height in local block coordinates
	 */
	static void addDiagonalTerminalLandingTopSection(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double topTextureLength, double texturePhase,
			double startWidth, double endWidth, double sectionTopY)
	{
		double startAdvance = getDiagonalTerminalLandingAdvance(startWidth);
		double endAdvance = getDiagonalTerminalLandingAdvance(endWidth);
		double endpointTexture = texturePhase + topTextureLength;
		List<double[]> terminalPolygon = new ArrayList<double[]>();
		terminalPolygon.add(new double[] { startWidth, 0.0D });
		terminalPolygon.add(new double[] { endWidth, 0.0D });
		terminalPolygon.add(new double[] { endWidth, endAdvance });
		terminalPolygon.add(new double[] { startWidth, startAdvance });
		double maximumAdvance = Math.max(startAdvance, endAdvance);
		List<Double> advanceBoundaries = getTextureRepeatBoundaries(
				maximumAdvance, maximumAdvance, endpointTexture);
		for (int index = 0; index < advanceBoundaries.size() - 1; index++)
		{
			double minimumAdvance = advanceBoundaries.get(index);
			double maximumBandAdvance = advanceBoundaries.get(index + 1);
			List<double[]> clipped = clipDiagonalTerminalPolygon(
					terminalPolygon, minimumAdvance, true);
			clipped = clipDiagonalTerminalPolygon(clipped, maximumBandAdvance, false);
			addDiagonalTerminalLandingTopPolygon(cache, railTile, hostBlock, block, icon,
					physicalLength, endpointTexture, sectionTopY, startWidth, endWidth,
					minimumAdvance, maximumBandAdvance, clipped);
		}
	}

	/**
	 * Clips a terminal-top polygon against one constant-advance boundary. Splitting before UV wrapping prevents a face
	 * from interpolating backward across the block-texture atlas when its longitudinal coordinate crosses an integer.
	 *
	 * @param polygon ordered pairs containing cross-track width at index zero and terminal advance at index one
	 * @param boundary terminal-advance coordinate of the clipping line
	 * @param keepAbove whether coordinates on the greater-than side of the boundary remain
	 * @return clipped polygon with adjacent duplicate vertices removed
	 */
	static List<double[]> clipDiagonalTerminalPolygon(List<double[]> polygon,
			double boundary, boolean keepAbove)
	{
		List<double[]> clipped = new ArrayList<double[]>();
		if (polygon.isEmpty())
		{
			return clipped;
		}
		double[] previous = polygon.get(polygon.size() - 1);
		boolean previousInside = keepAbove
				? previous[1] >= boundary - GEOMETRY_EPSILON
				: previous[1] <= boundary + GEOMETRY_EPSILON;
		for (double[] current : polygon)
		{
			boolean currentInside = keepAbove
					? current[1] >= boundary - GEOMETRY_EPSILON
					: current[1] <= boundary + GEOMETRY_EPSILON;
			if (currentInside != previousInside)
			{
				double fraction = (boundary - previous[1]) / (current[1] - previous[1]);
				addDistinctTerminalCoordinate(clipped,
						new double[] { previous[0] + (current[0] - previous[0]) * fraction, boundary });
			}
			if (currentInside)
			{
				addDistinctTerminalCoordinate(clipped, new double[] { current[0], current[1] });
			}
			previous = current;
			previousInside = currentInside;
		}
		if (clipped.size() > 1 && terminalCoordinatesMatch(clipped.get(0), clipped.get(clipped.size() - 1)))
		{
			clipped.remove(clipped.size() - 1);
		}
		return clipped;
	}

	/**
	 * Appends one terminal parameter-space coordinate unless it duplicates the coordinate most recently appended.
	 *
	 * @param coordinates ordered output polygon being assembled
	 * @param candidate cross-track width and terminal-advance coordinate to append
	 */
	static void addDistinctTerminalCoordinate(List<double[]> coordinates, double[] candidate)
	{
		if (coordinates.isEmpty()
				|| terminalCoordinatesMatch(coordinates.get(coordinates.size() - 1), candidate) == false)
		{
			coordinates.add(candidate);
		}
	}

	/**
	 * Compares two terminal parameter-space coordinates using the renderer's geometry tolerance.
	 *
	 * @param first first width-and-advance pair
	 * @param second second width-and-advance pair
	 * @return whether both coordinates describe the same terminal point
	 */
	static boolean terminalCoordinatesMatch(double[] first, double[] second)
	{
		return Math.abs(first[0] - second[0]) <= GEOMETRY_EPSILON
				&& Math.abs(first[1] - second[1]) <= GEOMETRY_EPSILON;
	}

	/**
	 * Converts one atlas-safe terminal polygon from width/advance space into rendered geometry. Quads are emitted directly;
	 * triangles and larger clipped polygons are triangulated and converted to nondegenerate quads for the renderer's fixed
	 * {@code GL_QUADS} batch.
	 *
	 * @param cache cache receiving the terminal-top faces
	 * @param railTile visible diagonal slope supplying its facing
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param icon captured top icon
	 * @param physicalLength centerline distance to the original slope endpoint, in blocks
	 * @param endpointTexture unwrapped longitudinal texture coordinate at the terminal base
	 * @param topY terminal-top height in local block coordinates
	 * @param startWidth first cross-track boundary of the unsplit section
	 * @param endWidth second cross-track boundary of the unsplit section
	 * @param minimumAdvance lower atlas-safe advance boundary
	 * @param maximumAdvance upper atlas-safe advance boundary
	 * @param polygon clipped width-and-advance coordinates in perimeter order
	 */
	static void addDiagonalTerminalLandingTopPolygon(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double endpointTexture, double topY,
			double startWidth, double endWidth, double minimumAdvance, double maximumAdvance,
			List<double[]> polygon)
	{
		if (polygon.size() < 3)
		{
			return;
		}
		double widthScale = DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH
				/ DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH;
		double widthTile = Math.floor(((startWidth + endWidth) * 0.5D) * widthScale);
		double advanceTile = Math.floor(endpointTexture
				+ (minimumAdvance + maximumAdvance) * 0.5D);
		PointXZ[] points = new PointXZ[polygon.size()];
		double[] textureU = new double[polygon.size()];
		double[] textureV = new double[polygon.size()];
		for (int index = 0; index < polygon.size(); index++)
		{
			double[] coordinate = polygon.get(index);
			PointXZ worldPoint = getDiagonalHalfHeightBallastPoint(
					railTile.getFacing(), physicalLength + coordinate[1], coordinate[0]);
			points[index] = new PointXZ(worldPoint.x - hostBlock.offsetX, worldPoint.z - hostBlock.offsetZ);
			textureU[index] = coordinate[0] * widthScale - widthTile;
			textureV[index] = 1.0D - (endpointTexture + coordinate[1] - advanceTile);
		}
		if (polygon.size() == 4)
		{
			addDiagonalTerminalLandingTopQuad(cache, hostBlock, block, icon, topY,
					points[0], textureU[0], textureV[0], points[1], textureU[1], textureV[1],
					points[2], textureU[2], textureV[2], points[3], textureU[3], textureV[3]);
			return;
		}
		for (int index = 1; index < polygon.size() - 1; index++)
		{
			addQuadrangulatedDiagonalTerminalTriangle(cache, hostBlock, block, icon, topY,
					points[0], textureU[0], textureV[0],
					points[index], textureU[index], textureV[index],
					points[index + 1], textureU[index + 1], textureV[index + 1]);
		}
	}

	/**
	 * Splits one triangular terminal-top section into three nondegenerate quads. Minecraft 1.7.10 batches this renderer as
	 * {@code GL_QUADS}; repeating a triangle vertex leaves driver-dependent interpolation at the center crease, which can
	 * appear as a long texture sliver. Edge midpoints and the centroid retain the triangle's exact geometry and affine UV
	 * mapping while giving every submitted quad four distinct corners.
	 *
	 * @param cache cache receiving the three replacement quads
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param icon captured top icon
	 * @param topY terminal-top height in local block coordinates
	 * @param first first triangle vertex in host-local X/Z coordinates
	 * @param firstU horizontal icon coordinate at the first vertex
	 * @param firstV vertical icon coordinate at the first vertex
	 * @param second second triangle vertex in host-local X/Z coordinates
	 * @param secondU horizontal icon coordinate at the second vertex
	 * @param secondV vertical icon coordinate at the second vertex
	 * @param third third triangle vertex in host-local X/Z coordinates
	 * @param thirdU horizontal icon coordinate at the third vertex
	 * @param thirdV vertical icon coordinate at the third vertex
	 */
	static void addQuadrangulatedDiagonalTerminalTriangle(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon, double topY,
			PointXZ first, double firstU, double firstV,
			PointXZ second, double secondU, double secondV,
			PointXZ third, double thirdU, double thirdV)
	{
		PointXZ firstSecond = midpoint(first, second);
		PointXZ secondThird = midpoint(second, third);
		PointXZ thirdFirst = midpoint(third, first);
		PointXZ center = new PointXZ((first.x + second.x + third.x) / 3.0D,
				(first.z + second.z + third.z) / 3.0D);
		double firstSecondU = (firstU + secondU) * 0.5D;
		double firstSecondV = (firstV + secondV) * 0.5D;
		double secondThirdU = (secondU + thirdU) * 0.5D;
		double secondThirdV = (secondV + thirdV) * 0.5D;
		double thirdFirstU = (thirdU + firstU) * 0.5D;
		double thirdFirstV = (thirdV + firstV) * 0.5D;
		double centerU = (firstU + secondU + thirdU) / 3.0D;
		double centerV = (firstV + secondV + thirdV) / 3.0D;

		addDiagonalTerminalLandingTopQuad(cache, hostBlock, block, icon, topY,
				first, firstU, firstV, firstSecond, firstSecondU, firstSecondV,
				center, centerU, centerV, thirdFirst, thirdFirstU, thirdFirstV);
		addDiagonalTerminalLandingTopQuad(cache, hostBlock, block, icon, topY,
				firstSecond, firstSecondU, firstSecondV, second, secondU, secondV,
				secondThird, secondThirdU, secondThirdV, center, centerU, centerV);
		addDiagonalTerminalLandingTopQuad(cache, hostBlock, block, icon, topY,
				center, centerU, centerV, secondThird, secondThirdU, secondThirdV,
				third, thirdU, thirdV, thirdFirst, thirdFirstU, thirdFirstV);
	}

	/**
	 * Adds one fully specified, nondegenerate terminal-top quad to the cached host mesh.
	 *
	 * @param cache cache receiving the quad
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param icon captured top icon
	 * @param topY terminal-top height in local block coordinates
	 * @param first first host-local X/Z vertex
	 * @param firstU horizontal icon coordinate at the first vertex
	 * @param firstV vertical icon coordinate at the first vertex
	 * @param second second host-local X/Z vertex
	 * @param secondU horizontal icon coordinate at the second vertex
	 * @param secondV vertical icon coordinate at the second vertex
	 * @param third third host-local X/Z vertex
	 * @param thirdU horizontal icon coordinate at the third vertex
	 * @param thirdV vertical icon coordinate at the third vertex
	 * @param fourth fourth host-local X/Z vertex
	 * @param fourthU horizontal icon coordinate at the fourth vertex
	 * @param fourthV vertical icon coordinate at the fourth vertex
	 */
	static void addDiagonalTerminalLandingTopQuad(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon, double topY,
			PointXZ first, double firstU, double firstV,
			PointXZ second, double secondU, double secondV,
			PointXZ third, double thirdU, double thirdV,
			PointXZ fourth, double fourthU, double fourthV)
	{
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, CUSTOM_TOP_FACE,
				0, 1, 0, SHADE_TOP_FACE,
				new QuadVertices(first.x, topY, first.z, second.x, topY, second.z,
						third.x, topY, third.z, fourth.x, topY, fourth.z),
				new QuadTextureCoordinates(firstU, firstV, secondU, secondV,
						thirdU, thirdV, fourthU, fourthV)));
	}

	/**
	 * Returns the midpoint of two terminal-top X/Z positions.
	 *
	 * @param first first X/Z position
	 * @param second second X/Z position
	 * @return position halfway between the supplied vertices
	 */
	static PointXZ midpoint(PointXZ first, PointXZ second)
	{
		return new PointXZ((first.x + second.x) * 0.5D, (first.z + second.z) * 0.5D);
	}

	/**
	 * Adds the four one-pixel-deep walls that continue both true-embedded rail pockets through the terminal landing.
	 * Each wall tapers from the original slope endpoint to the landing's V-shaped outer boundary.
	 *
	 * @param cache cache receiving terminal trench walls
	 * @param railTile visible diagonal slope supplying its facing
	 * @param hostBlock captured host owning the terminal landing
	 * @param block captured host block type
	 * @param icon captured side icon used inside the trench
	 * @param physicalLength centerline distance to the original slope endpoint, in blocks
	 * @param topY raised landing height before the one-pixel pocket drop
	 */
	static void addDiagonalTerminalLandingPocketWalls(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double topY)
	{
		double[] lineCoordinates = new double[] {
				-DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH,
				-DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET - DIAGONAL_RAIL_LINE_HALF_WIDTH,
				DIAGONAL_RAIL_LINE_OFFSET + DIAGONAL_RAIL_LINE_OUTSIDE_HALF_WIDTH
		};
		double offsetX = hostBlock.offsetX;
		double offsetZ = hostBlock.offsetZ;
		for (double lineCoordinate : lineCoordinates)
		{
			double widthDistance = (1.0D - lineCoordinate) / Math.sqrt(2.0D);
			PointXZ start = getDiagonalHalfHeightBallastPoint(
					railTile.getFacing(), physicalLength, widthDistance);
			PointXZ end = getDiagonalTerminalLandingOuterPoint(
					railTile.getFacing(), physicalLength, widthDistance);
			double wallLength = getDiagonalTerminalLandingAdvance(widthDistance);
			EmbeddedHostFace wall = EmbeddedHostFace.texturedQuad(hostBlock, block, icon, OBLIQUE_WALL_FACE,
					0, 1, 0, SHADE_OBLIQUE_WALL, new QuadVertices(
					start.x - offsetX, topY, start.z - offsetZ,
					end.x - offsetX, topY, end.z - offsetZ,
					end.x - offsetX, topY - TRENCH_POCKET_DROP, end.z - offsetZ,
					start.x - offsetX, topY - TRENCH_POCKET_DROP, start.z - offsetZ),
					new QuadTextureCoordinates(0.0D, 0.0D, wallLength, 0.0D,
							wallLength, TRENCH_POCKET_DROP, 0.0D, TRENCH_POCKET_DROP));
			wall.setVirtualTrenchWall(true);
			cache.mesh.addFace(wall);
		}
	}

	/**
	 * Returns the outward advance available at one terminal cross-track coordinate. The value is zero at the center crease
	 * and grows linearly to the authored half-block-per-axis reach at either outer edge.
	 *
	 * @param widthDistance cross-track distance from the terminal's first edge, in blocks
	 * @return forward centerline distance from the original endpoint to the V-shaped outer boundary, in blocks
	 */
	static double getDiagonalTerminalLandingAdvance(double widthDistance)
	{
		return Math.abs(widthDistance - DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH * 0.5D);
	}

	/**
	 * Resolves the V-shaped outer-boundary point corresponding to one terminal cross-track coordinate.
	 *
	 * @param facing Traincraft diagonal facing from four through seven
	 * @param physicalLength centerline distance to the original slope endpoint, in blocks
	 * @param widthDistance cross-track distance from the terminal's first edge, in blocks
	 * @return terminal outer-boundary point in visible-parent coordinates
	 */
	static PointXZ getDiagonalTerminalLandingOuterPoint(int facing, double physicalLength,
			double widthDistance)
	{
		return getDiagonalHalfHeightBallastPoint(facing,
				physicalLength + getDiagonalTerminalLandingAdvance(widthDistance), widthDistance);
	}

	/**
	 * Returns the five authored-equivalent points defining a diagonal slope's two terminal ears. The first three points
	 * are the strip's first edge, center, and second edge at its nominal endpoint; the final two advance the outer edges
	 * by one-half block on both world axes, matching the landing retained by every full-height diagonal slope OBJ.
	 *
	 * @param facing Traincraft diagonal facing from four through seven
	 * @param physicalLength centerline distance from the low end to the nominal strip endpoint, in blocks
	 * @return ordered points containing first edge, center, second edge, first ear, and second ear
	 */
	static PointXZ[] getDiagonalHalfHeightTerminalLandingPoints(int facing, double physicalLength)
	{
		double width = DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH;
		double forwardDistance = physicalLength + DIAGONAL_DISTANCE_COMPONENT;
		return new PointXZ[] {
				getDiagonalHalfHeightBallastPoint(facing, physicalLength, 0.0D),
				getDiagonalHalfHeightBallastPoint(facing, physicalLength, width * 0.5D),
				getDiagonalHalfHeightBallastPoint(facing, physicalLength, width),
				getDiagonalHalfHeightBallastPoint(facing, forwardDistance, 0.0D),
				getDiagonalHalfHeightBallastPoint(facing, forwardDistance, width)
		};
	}

	/**
	 * Closes one exposed edge of a diagonal terminal ear. The lower support and upper half-height landing use separate UV
	 * ranges so neither section stretches a block texture beyond its physical height.
	 *
	 * @param cache cache receiving the generated boundary wall faces
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param icon captured side icon
	 * @param first first endpoint in visible-parent coordinates
	 * @param second second endpoint in visible-parent coordinates
	 * @param topY final landing height in local block coordinates
	 * @param surfaceY unraised support height separating lower and upper wall sections
	 * @param bottomY lowest rendered local Y coordinate of the support material
	 * @param reverseHorizontalTexture whether horizontal UVs run from the second endpoint back toward the first
	 * @param reverseVerticalTexture whether vertical UVs run from the section bottom toward its top
	 */
	static void addDiagonalTerminalLandingWall(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			PointXZ first, PointXZ second, double topY, double surfaceY, double bottomY,
			boolean reverseHorizontalTexture, boolean reverseVerticalTexture)
	{
		double deltaX = second.x - first.x;
		double deltaZ = second.z - first.z;
		double textureLength = Math.min(1.0D, Math.sqrt(deltaX * deltaX + deltaZ * deltaZ));
		int normalX = getDirectionSign(deltaZ);
		int normalZ = getDirectionSign(-deltaX);
		if (surfaceY > bottomY + GEOMETRY_EPSILON)
		{
			addDiagonalTerminalLandingWallSection(cache, hostBlock, block, icon, first, second,
					surfaceY, bottomY, 0.0D, clampIconCoordinate(surfaceY - bottomY),
					textureLength, normalX, normalZ,
					reverseHorizontalTexture, reverseVerticalTexture);
		}
		if (topY > surfaceY + GEOMETRY_EPSILON)
		{
			addDiagonalTerminalLandingWallSection(cache, hostBlock, block, icon, first, second,
					topY, surfaceY, 0.0D, clampIconCoordinate(topY - surfaceY),
					textureLength, normalX, normalZ,
					reverseHorizontalTexture, reverseVerticalTexture);
		}
	}

	/**
	 * Emits one atlas-safe rectangular section of a terminal-ear boundary wall.
	 *
	 * @param cache cache receiving the generated wall section
	 * @param hostBlock material-bearing host cell owning the terminal geometry
	 * @param block captured or selected ballast block
	 * @param icon captured side icon
	 * @param first first endpoint in visible-parent coordinates
	 * @param second second endpoint in visible-parent coordinates
	 * @param topY section top in local block coordinates
	 * @param bottomY section bottom in local block coordinates
	 * @param topV icon-local vertical coordinate at the section top
	 * @param bottomV icon-local vertical coordinate at the section bottom
	 * @param endU icon-local horizontal coordinate at the second endpoint
	 * @param normalX outward X lighting normal
	 * @param normalZ outward Z lighting normal
	 * @param reverseHorizontalTexture whether horizontal UVs run from {@code endU} down to zero
	 * @param reverseVerticalTexture whether the top vertices use {@code bottomV} and bottom vertices use {@code topV}
	 */
	static void addDiagonalTerminalLandingWallSection(EmbeddedHostRenderCache cache,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			PointXZ first, PointXZ second, double topY, double bottomY, double topV, double bottomV,
			double endU, int normalX, int normalZ,
			boolean reverseHorizontalTexture, boolean reverseVerticalTexture)
	{
		double offsetX = hostBlock.offsetX;
		double offsetZ = hostBlock.offsetZ;
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, OBLIQUE_WALL_FACE,
				normalX, 0, normalZ, SHADE_OBLIQUE_WALL,
				new QuadVertices(first.x - offsetX, topY, first.z - offsetZ,
						second.x - offsetX, topY, second.z - offsetZ,
						second.x - offsetX, bottomY, second.z - offsetZ,
						first.x - offsetX, bottomY, first.z - offsetZ),
				new QuadTextureCoordinates(reverseHorizontalTexture ? endU : 0.0D,
						reverseVerticalTexture ? bottomV : topV,
						reverseHorizontalTexture ? 0.0D : endU,
						reverseVerticalTexture ? bottomV : topV,
						reverseHorizontalTexture ? 0.0D : endU,
						reverseVerticalTexture ? topV : bottomV,
						reverseHorizontalTexture ? endU : 0.0D,
						reverseVerticalTexture ? topV : bottomV)));
	}

	/**
	 * Converts one floating-point edge component into the nearest axis or diagonal lighting direction.
	 *
	 * @param component signed edge-normal component
	 * @return negative one, zero, or positive one
	 */
	static int getDirectionSign(double component)
	{
		return component < -GEOMETRY_EPSILON ? -1 : component > GEOMETRY_EPSILON ? 1 : 0;
	}

	/**
	 * Adds one UV-repeat-safe section of the authored diagonal ballast top.
	 *
	 * @param cache cache receiving the generated face
	 * @param railTile visible rail tile supplying facing and rise
	 * @param hostBlock synthetic parent cell supplying material identity
	 * @param block selected ballast block
	 * @param icon selected ballast top icon
	 * @param physicalLength total diagonal centerline length, in blocks
	 * @param topTextureLength authored longitudinal UV extent following the inclined top surface
	 * @param startDistance first centerline distance, in blocks
	 * @param endDistance second centerline distance, in blocks
	 * @param startWidth first cross-track distance, in blocks
	 * @param endWidth second cross-track distance, in blocks
	 * @param texturePhase authored longitudinal texture offset, in icon repeats
	 */
	static void addDiagonalHalfHeightTopFace(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double topTextureLength, double startDistance, double endDistance,
			double startWidth, double endWidth, double texturePhase)
	{
		PointXZ first = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), startDistance, endWidth);
		PointXZ second = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, endWidth);
		PointXZ third = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, startWidth);
		PointXZ fourth = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), startDistance, startWidth);
		double startY = getDiagonalHalfHeightBallastY(railTile, startDistance, physicalLength);
		double endY = getDiagonalHalfHeightBallastY(railTile, endDistance, physicalLength);
		double startU = getWrappedTextureStart(
				startWidth * DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
		double endU = getWrappedTextureEnd(
				endWidth * DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH / DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH);
		double startV = 1.0D - getWrappedTextureStart(
				texturePhase + startDistance * topTextureLength / physicalLength);
		double endV = 1.0D - getWrappedTextureEnd(
				texturePhase + endDistance * topTextureLength / physicalLength);
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, CUSTOM_TOP_FACE,
				0, 1, 0, SHADE_TOP_FACE,
				new QuadVertices(first.x, startY, first.z, second.x, endY, second.z,
						third.x, endY, third.z, fourth.x, startY, fourth.z),
				new QuadTextureCoordinates(endU, startV, endU, endV, startU, endV, startU, startV)));
	}

	/**
	 * Adds one UV-repeat-safe longitudinal side section of the diagonal ballast wedge.
	 *
	 * @param cache cache receiving the generated face
	 * @param railTile visible rail tile supplying facing and rise
	 * @param hostBlock synthetic parent cell supplying material identity
	 * @param block selected ballast block
	 * @param icon selected ballast icon
	 * @param physicalLength total diagonal centerline length, in blocks
	 * @param startDistance first centerline distance, in blocks
	 * @param endDistance second centerline distance, in blocks
	 * @param widthDistance cross-track edge distance, in blocks
	 * @param reverse whether this is the opposite edge and requires reversed winding
	 * @param texturePhase authored longitudinal texture offset, in icon repeats
	 */
	static void addDiagonalHalfHeightSideFace(EmbeddedHostRenderCache cache, TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, IIcon icon,
			double physicalLength, double startDistance, double endDistance,
			double widthDistance, boolean reverse, double texturePhase)
	{
		PointXZ start = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), startDistance, widthDistance);
		PointXZ end = getDiagonalHalfHeightBallastPoint(railTile.getFacing(), endDistance, widthDistance);
		double startY = getDiagonalHalfHeightBallastY(railTile, startDistance, physicalLength);
		double endY = getDiagonalHalfHeightBallastY(railTile, endDistance, physicalLength);
		double startU = getWrappedTextureStart(startDistance + texturePhase);
		double endU = getWrappedTextureEnd(endDistance + texturePhase);
		int[] normal = getDiagonalHalfHeightSideNormal(railTile.getFacing(), reverse);
		QuadVertices vertices = reverse
				? new QuadVertices(end.x, endY, end.z, start.x, startY, start.z,
						start.x, 0.0D, start.z, end.x, 0.0D, end.z)
				: new QuadVertices(start.x, startY, start.z, end.x, endY, end.z,
						end.x, 0.0D, end.z, start.x, 0.0D, start.z);
		QuadTextureCoordinates texture = reverse
				? new QuadTextureCoordinates(endU, 0.5D - endY, startU, 0.5D - startY,
						startU, 0.5D, endU, 0.5D)
				: new QuadTextureCoordinates(startU, 0.5D - startY, endU, 0.5D - endY,
						endU, 0.5D, startU, 0.5D);
		cache.mesh.addFace(EmbeddedHostFace.texturedQuad(hostBlock, block, icon, OBLIQUE_WALL_FACE,
				normal[0], 0, normal[1], SHADE_OBLIQUE_WALL, vertices, texture));
	}

	/**
	 * Converts authored diagonal centerline and cross-track distances into the tile-local coordinates produced by the
	 * existing OBJ model transform for facings four through seven.
	 *
	 * @param facing Traincraft diagonal facing
	 * @param centerlineDistance physical distance from the low end, in blocks
	 * @param widthDistance physical distance from the first ballast edge, in blocks
	 * @return tile-local X/Z point matching the authored ballast OBJ
	 */
	static PointXZ getDiagonalHalfHeightBallastPoint(int facing, double centerlineDistance, double widthDistance)
	{
		double crossOffset = widthDistance - DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH * 0.5D;
		double rawX = (-centerlineDistance + crossOffset) * DIAGONAL_DISTANCE_COMPONENT;
		double rawZ = (-centerlineDistance - crossOffset) * DIAGONAL_DISTANCE_COMPONENT;
		switch (facing)
		{
			case 4:
				return new PointXZ(1.0D + rawZ, -rawX);
			case 5:
				return new PointXZ(1.0D + rawX, 1.0D + rawZ);
			case 6:
				return new PointXZ(-rawZ, 1.0D + rawX);
			case 7:
			default:
				return new PointXZ(-rawX, -rawZ);
		}
	}

	/**
	 * Returns the authored slope height at one physical centerline distance.
	 *
	 * @param railTile visible rail tile supplying its saved half-height rise
	 * @param centerlineDistance physical distance from the low end, in blocks
	 * @param physicalLength total diagonal centerline length, in blocks
	 * @return local top-surface Y coordinate from zero through one half
	 */
	static double getDiagonalHalfHeightBallastY(TileTCRail railTile,
			double centerlineDistance, double physicalLength)
	{
		double rise = railTile.slopeHeight > 0.0D ? railTile.slopeHeight : 0.5D;
		return rise * centerlineDistance / physicalLength;
	}

	/**
	 * Returns the longitudinal UV phase measured from the corresponding authored diagonal ballast OBJ.
	 *
	 * @param blockLength nominal diagonal footprint length in blocks
	 * @return authored texture phase in icon repeats
	 */
	static double getDiagonalHalfHeightTopTexturePhase(int blockLength)
	{
		switch (blockLength)
		{
			case 6:
				return 0.10D;
			case 9:
				return -0.38D;
			default:
				return 0.0D;
		}
	}

	/**
	 * Returns the longitudinal UV extent measured from the corresponding authored diagonal ballast OBJ. Keeping these
	 * exported values avoids a visible phase drift caused by recomputing the UV length from the geometric slope.
	 *
	 * @param blockLength nominal diagonal footprint length in blocks
	 * @return authored longitudinal UV extent in icon repeats
	 */
	static double getDiagonalHalfHeightTopTextureLength(int blockLength)
	{
		switch (blockLength)
		{
			case 3:
				return 4.2705D;
			case 6:
				return 8.48D;
			case 9:
				return 12.72D;
			default:
				return blockLength * DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH;
		}
	}

	/**
	 * Returns geometric boundaries split wherever an authored repeating UV crosses an integer icon edge.
	 *
	 * @param geometricExtent total geometric distance, in blocks
	 * @param textureExtent total authored UV distance across the geometric extent
	 * @param texturePhase texture-coordinate value at geometric distance zero
	 * @return sorted geometric boundaries including zero and {@code geometricExtent}
	 */
	static List<Double> getTextureRepeatBoundaries(double geometricExtent,
			double textureExtent, double texturePhase)
	{
		List<Double> boundaries = new ArrayList<Double>();
		boundaries.add(0.0D);
		double nextTextureBoundary = Math.floor(texturePhase) + 1.0D - texturePhase;
		double nextBoundary = nextTextureBoundary * geometricExtent / textureExtent;
		while (nextBoundary < geometricExtent - GEOMETRY_EPSILON)
		{
			if (nextBoundary > GEOMETRY_EPSILON)
			{
				boundaries.add(nextBoundary);
			}
			nextTextureBoundary += 1.0D;
			nextBoundary = nextTextureBoundary * geometricExtent / textureExtent;
		}
		boundaries.add(geometricExtent);
		return boundaries;
	}

	/**
	 * Returns the icon-local coordinate at the beginning of one repeat-safe segment.
	 *
	 * @param textureCoordinate unwrapped authored texture coordinate
	 * @return wrapped coordinate from zero inclusive to one exclusive
	 */
	static double getWrappedTextureStart(double textureCoordinate)
	{
		double wrapped = textureCoordinate - Math.floor(textureCoordinate);
		return Math.abs(wrapped - 1.0D) <= GEOMETRY_EPSILON ? 0.0D : wrapped;
	}

	/**
	 * Returns the icon-local coordinate at the end of one repeat-safe segment, preserving one at an exact repeat edge.
	 *
	 * @param textureCoordinate unwrapped authored texture coordinate
	 * @return wrapped coordinate greater than zero through one
	 */
	static double getWrappedTextureEnd(double textureCoordinate)
	{
		double wrapped = textureCoordinate - Math.floor(textureCoordinate);
		return Math.abs(wrapped) <= GEOMETRY_EPSILON ? 1.0D : wrapped;
	}

	/**
	 * Returns the outward X/Z normal for one longitudinal diagonal ballast edge after applying the placed facing.
	 *
	 * @param facing Traincraft diagonal facing
	 * @param reverse whether the second cross-track edge is being emitted
	 * @return two-element outward X/Z normal
	 */
	static int[] getDiagonalHalfHeightSideNormal(int facing, boolean reverse)
	{
		int rawX = reverse ? 1 : -1;
		int rawZ = reverse ? -1 : 1;
		return transformDiagonalNormal(facing, rawX, rawZ);
	}

	/**
	 * Returns the outward X/Z normal for the raised end cap after applying the placed facing.
	 *
	 * @param facing Traincraft diagonal facing
	 * @return two-element outward X/Z normal
	 */
	static int[] getDiagonalHalfHeightEndNormal(int facing)
	{
		return transformDiagonalNormal(facing, -1, -1);
	}

	/**
	 * Rotates an authored X/Z normal through the same facing transform as the diagonal OBJ.
	 *
	 * @param facing Traincraft diagonal facing
	 * @param rawX authored normal X component
	 * @param rawZ authored normal Z component
	 * @return two-element transformed X/Z normal
	 */
	static int[] transformDiagonalNormal(int facing, int rawX, int rawZ)
	{
		switch (facing)
		{
			case 4:
				return new int[] { rawZ, -rawX };
			case 5:
				return new int[] { rawX, rawZ };
			case 6:
				return new int[] { -rawZ, rawX };
			case 7:
			default:
				return new int[] { -rawX, -rawZ };
		}
	}

	/**
	 * Adds one solid, uncut ballast cell through the embedded host material and face-building path.
	 * Internal faces shared by the slope footprint are omitted, while exposed walls remain visible beside
	 * unrelated neighboring tracks.
	 *
	 * @param cache cache receiving generated faces
	 * @param railTile visible rail tile supplying material and world context
	 * @param hostKeys owner-relative keys belonging to this synthetic slope footprint
	 * @param hostBlock synthetic ballast cell being drawn
	 * @param block selected ballast block type
	 */
	static void addUncutHalfHeightSlopeCell(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block)
	{
		HostShape flat = new HostShape(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D, false);
		addFace(cache, railTile, hostKeys, hostBlock, block, flat,
				BLOCK_SIDE_TOP, 0, 1, 0, SHADE_TOP_FACE, false);
		addUncutHalfHeightSlopeSide(cache, railTile, hostKeys, hostBlock, block, flat,
				BLOCK_SIDE_NORTH, 0, -1, SHADE_Z_FACE);
		addUncutHalfHeightSlopeSide(cache, railTile, hostKeys, hostBlock, block, flat,
				BLOCK_SIDE_SOUTH, 0, 1, SHADE_Z_FACE);
		addUncutHalfHeightSlopeSide(cache, railTile, hostKeys, hostBlock, block, flat,
				BLOCK_SIDE_WEST, -1, 0, SHADE_X_FACE);
		addUncutHalfHeightSlopeSide(cache, railTile, hostKeys, hostBlock, block, flat,
				BLOCK_SIDE_EAST, 1, 0, SHADE_X_FACE);
	}

	/**
	 * Adds one exposed synthetic slope wall unless the adjacent cell belongs to the same ballast mesh.
	 *
	 * @param cache cache receiving the generated wall
	 * @param railTile visible rail tile supplying material context
	 * @param hostKeys owner-relative keys belonging to this synthetic slope footprint
	 * @param hostBlock synthetic ballast cell being drawn
	 * @param block selected ballast block type
	 * @param shape initially flat cell bounds that will be slope-warped
	 * @param side Minecraft block-side index
	 * @param normalX neighboring cell X offset
	 * @param normalZ neighboring cell Z offset
	 * @param shade vanilla directional shade multiplier
	 */
	static void addUncutHalfHeightSlopeSide(EmbeddedHostRenderCache cache, TileTCRail railTile, Set<String> hostKeys,
			TileTCRailHostData.CapturedHostBlock hostBlock, Block block, HostShape shape,
			int side, int normalX, int normalZ, float shade)
	{
		String neighborKey = TileTCRailHostData.key(
				hostBlock.offsetX + normalX, hostBlock.offsetY, hostBlock.offsetZ + normalZ);
		if (hostKeys.contains(neighborKey) == false)
		{
			addCustomVerticalFace(cache, railTile, hostKeys, hostBlock, block, shape,
					side, BLOCK_SIDE_TOP, normalX, normalZ, shade, false);
		}
	}

	/**
	 * Raises the top edge of a synthetic ballast mesh along the established true-embedded 1x6 grade while keeping its
	 * bottom edge at the top boundary of the supporting block. The sloped surface remains aligned with the rail model
	 * at Y=0 through Y=0.5, and no generated wall extends into the block below.
	 *
	 * @param mesh completed flat synthetic mesh to transform in place
	 * @param railTile visible rail tile supplying facing, half-block rise, and footprint length
	 */
	static void warpUncutHalfHeightSlopeFaces(EmbeddedHostMesh mesh, TileTCRail railTile)
	{
		List<EmbeddedHostFace> faces = mesh.getFaces();
		for (int index = 0; index < faces.size(); index++)
		{
			EmbeddedHostFace face = faces.get(index);
			QuadVertices source = face.isQuad() ? face.getQuadVertices() : getCuboidFaceVertices(face);
			if (source == null)
			{
				continue;
			}
			boolean topFace = face.getSide() == BLOCK_SIDE_TOP;
			QuadVertices warped = new QuadVertices(
					source.firstX, getUncutHalfHeightSlopeVertexY(railTile, face, source.firstX, source.firstZ, true), source.firstZ,
					source.secondX, getUncutHalfHeightSlopeVertexY(railTile, face, source.secondX, source.secondZ, true), source.secondZ,
					source.thirdX, getUncutHalfHeightSlopeVertexY(railTile, face, source.thirdX, source.thirdZ, topFace), source.thirdZ,
					source.fourthX, getUncutHalfHeightSlopeVertexY(railTile, face, source.fourthX, source.fourthZ, topFace), source.fourthZ);
			TileTCRailHostData.CapturedHostBlock hostBlock =
					new TileTCRailHostData.CapturedHostBlock(face.getOffsetX(), face.getOffsetY(), face.getOffsetZ(),
							Block.getIdFromBlock(face.getBlock()), face.getMetadata(), face.getColour());
			EmbeddedHostFace warpedFace = EmbeddedHostFace.quad(hostBlock, face.getBlock(), face.getIcon(),
					topFace ? CUSTOM_TOP_FACE : face.getSide(), face.getNormalX(), face.getNormalY(), face.getNormalZ(),
					face.getDirectionalShade(), warped);
			warpedFace.setTopAnchoredSideTexture(topFace == false);
			mesh.setFace(index, warpedFace);
		}
	}

	/**
	 * Returns the unchanged true-embedded slope rise for a top vertex or the supporting block's fixed top boundary for
	 * a bottom vertex. This confines the synthetic ballast to the space above the supporting block.
	 *
	 * @param railTile visible rail tile supplying slope direction and dimensions
	 * @param face synthetic cell containing the vertex
	 * @param localX vertex X coordinate within the synthetic cell
	 * @param localZ vertex Z coordinate within the synthetic cell
	 * @param raised whether this vertex belongs to the sloped top edge
	 * @return local vertex Y coordinate
	 */
	static double getUncutHalfHeightSlopeVertexY(TileTCRail railTile, EmbeddedHostFace face,
			double localX, double localZ, boolean raised)
	{
		return raised ? warpEmbeddedHalfHeightVertexY(railTile, face.getOffsetX(), face.getOffsetZ(),
				localX, RENDER_EPSILON * 2.0D, localZ, 0.0D) - RENDER_EPSILON * 2.0D : 0.0D;
	}

	/**
	 * Returns whether the captured host itself must follow a half-height rail slope.
	 * Host-mounted slopes retain their intact captured block shape and therefore do not use this transform.
	 *
	 * @param railTile visible rail tile being classified
	 * @return whether generated host and trench faces must rise with the reused slope model
	 */
	static boolean usesRisingEmbeddedHalfHeightSurface(TileTCRail railTile)
	{
		return railTile != null && railTile.isReplaceTargetTrack() && railTile.isIntactHostMountedTrack() == false
				&& railTile.getCoreType() != null && railTile.getCoreType().isHalfHeightSlope();
	}


	/**
	 * Warps the already established straight or diagonal trench mesh onto the authored half-height slope.
	 * This deliberately runs after ordinary profile construction so rail-pocket widths, clipping, winding,
	 * material selection, and exterior-face decisions remain shared with level embedded track.
	 *
	 * @param mesh completed level host mesh whose non-bottom vertices will be raised in place
	 * @param railTile visible rail tile supplying facing and authored slope length
	 */
	static void warpEmbeddedHalfHeightSlopeFaces(EmbeddedHostMesh mesh, TileTCRail railTile)
	{
		List<EmbeddedHostFace> faces = mesh.getFaces();
		for (int index = 0; index < faces.size(); index++)
		{
			EmbeddedHostFace face = faces.get(index);
			QuadVertices source = face.isQuad() ? face.getQuadVertices() : getCuboidFaceVertices(face);
			if (source == null)
			{
				continue;
			}
			double hostMinY = getHostMinY(face.getBlock(), face.getMetadata());
			QuadVertices warped = new QuadVertices(
					source.firstX, warpEmbeddedHalfHeightVertexY(railTile, face.getOffsetX(), face.getOffsetZ(),
						source.firstX, source.firstY, source.firstZ, hostMinY), source.firstZ,
					source.secondX, warpEmbeddedHalfHeightVertexY(railTile, face.getOffsetX(), face.getOffsetZ(),
						source.secondX, source.secondY, source.secondZ, hostMinY), source.secondZ,
					source.thirdX, warpEmbeddedHalfHeightVertexY(railTile, face.getOffsetX(), face.getOffsetZ(),
						source.thirdX, source.thirdY, source.thirdZ, hostMinY), source.thirdZ,
					source.fourthX, warpEmbeddedHalfHeightVertexY(railTile, face.getOffsetX(), face.getOffsetZ(),
						source.fourthX, source.fourthY, source.fourthZ, hostMinY), source.fourthZ);
			int side = face.getSide() == BLOCK_SIDE_TOP ? CUSTOM_TOP_FACE : face.getSide();
			TileTCRailHostData.CapturedHostBlock hostBlock =
					new TileTCRailHostData.CapturedHostBlock(face.getOffsetX(), face.getOffsetY(), face.getOffsetZ(),
							Block.getIdFromBlock(face.getBlock()), face.getMetadata(), face.getColour());
			mesh.setFace(index, EmbeddedHostFace.quad(hostBlock, face.getBlock(), face.getIcon(), side,
					face.getNormalX(), face.getNormalY(), face.getNormalZ(), face.getDirectionalShade(), warped));
		}
	}

	/**
	 * Converts one axis-aligned cached face to the same four-vertex ordering used by the custom emitter.
	 * Bottom faces return {@code null} because the captured host underside remains level.
	 *
	 * @param face cached cuboid face to convert
	 * @return matching custom vertices, or {@code null} for an unchanged bottom face
	 */
	static QuadVertices getCuboidFaceVertices(EmbeddedHostFace face)
	{
		CuboidBounds bounds = face.getCuboidBounds();
		switch (face.getSide())
		{
			case BLOCK_SIDE_TOP:
				return new QuadVertices(bounds.maxX, bounds.maxY, bounds.maxZ, bounds.maxX, bounds.maxY, bounds.minZ,
						bounds.minX, bounds.maxY, bounds.minZ, bounds.minX, bounds.maxY, bounds.maxZ);
			case BLOCK_SIDE_NORTH:
				return new QuadVertices(bounds.minX, bounds.maxY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.minZ,
						bounds.maxX, bounds.minY, bounds.minZ, bounds.minX, bounds.minY, bounds.minZ);
			case BLOCK_SIDE_SOUTH:
				return new QuadVertices(bounds.maxX, bounds.maxY, bounds.maxZ, bounds.minX, bounds.maxY, bounds.maxZ,
						bounds.minX, bounds.minY, bounds.maxZ, bounds.maxX, bounds.minY, bounds.maxZ);
			case BLOCK_SIDE_WEST:
				return new QuadVertices(bounds.minX, bounds.maxY, bounds.maxZ, bounds.minX, bounds.maxY, bounds.minZ,
						bounds.minX, bounds.minY, bounds.minZ, bounds.minX, bounds.minY, bounds.maxZ);
			case BLOCK_SIDE_EAST:
				return new QuadVertices(bounds.maxX, bounds.maxY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.maxZ,
						bounds.maxX, bounds.minY, bounds.maxZ, bounds.maxX, bounds.minY, bounds.minZ);
			default:
				return null;
		}
	}

	/**
	 * Raises one generated host vertex according to its distance along the existing half-height slope.
	 * Vertices on the captured host underside remain fixed, while surface, pocket, and trench-wall vertices
	 * receive the same offset so the pocket depth remains exactly one pixel.
	 *
	 * @param railTile visible rail tile supplying direction and length
	 * @param hostOffsetX captured cell X offset from the visible rail
	 * @param hostOffsetZ captured cell Z offset from the visible rail
	 * @param localX vertex X coordinate within the captured cell
	 * @param localY original vertex Y coordinate within the captured cell
	 * @param localZ vertex Z coordinate within the captured cell
	 * @param hostMinY captured host's fixed underside height
	 * @return transformed local Y coordinate
	 */
	static double warpEmbeddedHalfHeightVertexY(TileTCRail railTile, int hostOffsetX, int hostOffsetZ,
			double localX, double localY, double localZ, double hostMinY)
	{
		if (localY <= hostMinY + RENDER_EPSILON)
		{
			return localY;
		}
		double length = railTile.slopeLength > 0.0D ? railTile.slopeLength : 1.0D;
		double progress;
		switch (railTile.getFacing())
		{
			case 0:
				progress = hostOffsetZ + localZ;
				break;
			case 1:
				progress = -hostOffsetX + 1.0D - localX;
				break;
			case 2:
				progress = -hostOffsetZ + 1.0D - localZ;
				break;
			case 3:
				progress = hostOffsetX + localX;
				break;
			case 4:
				progress = (-hostOffsetX + 1.0D - localX + hostOffsetZ + localZ) * 0.5D;
				break;
			case 5:
				progress = (-hostOffsetX + 1.0D - localX - hostOffsetZ + 1.0D - localZ) * 0.5D;
				break;
			case 6:
				progress = (hostOffsetX + localX - hostOffsetZ + 1.0D - localZ) * 0.5D;
				break;
			default:
				progress = (hostOffsetX + localX + hostOffsetZ + localZ) * 0.5D;
				break;
		}
		double clampedProgress = Math.max(0.0D, Math.min(length, progress));
		return localY + railTile.slopeHeight * clampedProgress / length;
	}

}
