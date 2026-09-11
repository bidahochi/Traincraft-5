package train.client.render.embedded;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.world.World;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.TrackCellResolver;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.client.render.embedded.EmbeddedHostFace.CuboidBounds;
import train.client.render.embedded.EmbeddedHostFace.QuadVertices;

import java.util.HashMap;
import java.util.Map;

import static train.client.render.embedded.EmbeddedCapturedHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedHostRenderController.*;
import static train.client.render.embedded.EmbeddedSlopeHostMeshBuilder.*;

/**
 * Prepares geometry signatures, face appearance, and cached per-vertex lighting.
 *
 * <p>Geometry classification is performed once per mesh. Tint, packed brightness, ambient occlusion, pillar
 * orientation, and the lighting snapshot are refreshable appearance data. The transient vertex cache lasts for one
 * preparation pass, so equal corners share samples without retaining a world or growing across frames.</p>
 *
 * <p>Virtual trench walls sample their side and opening, while bottom-slab top faces retain the brighter supporting
 * surface sample. Keep these exceptions symmetric across all four horizontal sides.</p>
 */
final class EmbeddedHostLightingPreparer
{
	private EmbeddedHostLightingPreparer()
	{
	}

	/**
	 * Classifies geometry-dependent lighting exceptions before refreshable light values are sampled.
	 *
	 * @param cache completed geometry cache whose faces receive stable classifications
	 * @param railTile visible rail supplying captured-neighbor ownership
	 */
	static void prepareFaceLightingContext(EmbeddedHostRenderCache cache, TileTCRail railTile)
	{
		for (EmbeddedHostFace entry : cache.mesh.getFaces())
		{
			entry.setVirtualTrenchWall(isVirtualTrenchWall(railTile, entry));
		}
	}

	/**
	 * Hashes only captured-host and neighboring coverage state that can change the generated mesh.
	 * Neighbor callbacks may report light-only changes such as torch replacement; comparing this
	 * inexpensive signature lets those updates retain the existing trench geometry.
	 *
	 * @param railTile visible rail tile supplying captured hosts and neighboring world blocks
	 * @return order-independent signature of all geometry-affecting host and coverage inputs
	 */
	static long getHostGeometrySignature(TileTCRail railTile)
	{
		Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks =
				getHostBlocksForRendering(railTile);
		long signature = renderBlocks.size() * GEOMETRY_HASH_MULTIPLIER;
		for (TileTCRailHostData.CapturedHostBlock hostBlock : renderBlocks.values())
		{
			long hostPosition = EmbeddedHostLighting.getPositionKey(
					hostBlock.offsetX, hostBlock.offsetY, hostBlock.offsetZ);
			long hostValue = hostPosition ^ ((long)hostBlock.blockId << 16) ^ (long)hostBlock.metadata;
			signature += mixGeometryValue(hostValue);
			for (TileTCRailHostData.CapturedHostShape shape : hostBlock.shapes)
			{
				signature += mixGeometryValue(Double.doubleToLongBits(shape.minX));
				signature += mixGeometryValue(Double.doubleToLongBits(shape.minY));
				signature += mixGeometryValue(Double.doubleToLongBits(shape.minZ));
				signature += mixGeometryValue(Double.doubleToLongBits(shape.maxX));
				signature += mixGeometryValue(Double.doubleToLongBits(shape.maxY));
				signature += mixGeometryValue(Double.doubleToLongBits(shape.maxZ));
			}
			signature += getNeighborGeometryHash(railTile, hostBlock, -1, 0, 0);
			signature += getNeighborGeometryHash(railTile, hostBlock, 1, 0, 0);
			signature += getNeighborGeometryHash(railTile, hostBlock, 0, -1, 0);
			signature += getNeighborGeometryHash(railTile, hostBlock, 0, 1, 0);
			signature += getNeighborGeometryHash(railTile, hostBlock, 0, 0, -1);
			signature += getNeighborGeometryHash(railTile, hostBlock, 0, 0, 1);
		}
		return signature;
	}

	/**
	 * Hashes whether one adjacent world cell covers an embedded host face.
	 *
	 * @param railTile visible rail tile supplying world and captured-host context
	 * @param hostBlock captured host whose neighbor is inspected
	 * @param normalX neighboring cell X offset
	 * @param normalY neighboring cell Y offset
	 * @param normalZ neighboring cell Z offset
	 * @return mixed position and coverage contribution
	 */
	static long getNeighborGeometryHash(TileTCRail railTile,
			TileTCRailHostData.CapturedHostBlock hostBlock, int normalX, int normalY, int normalZ)
	{
		long neighborPosition = EmbeddedHostLighting.getPositionKey(
				hostBlock.offsetX + normalX, hostBlock.offsetY + normalY, hostBlock.offsetZ + normalZ);
		long coverage = isOccludedByNeighbor(railTile, hostBlock, normalX, normalY, normalZ)
				? COVERED_NEIGHBOR_HASH : 0L;
		return mixGeometryValue(neighborPosition ^ coverage);
	}

	/**
	 * Mixes one host or neighbor value before it enters the order-independent geometry signature.
	 *
	 * @param value raw packed host or neighboring coverage value
	 * @return mixed signature contribution
	 */
	static long mixGeometryValue(long value)
	{
		value ^= value >>> 33;
		value *= GEOMETRY_HASH_MULTIPLIER;
		value ^= value >>> 29;
		return value;
	}

	/**
	 * Resolves pillar direction, tint, and packed vertex light before the mesh enters the per-frame path.
	 *
	 * @param cache cache whose generated faces receive prepared appearance values
	 * @param railTile visible rail tile used to resolve host materials and world lighting
	 */
	static void prepareCachedEntryLighting(EmbeddedHostRenderCache cache, TileTCRail railTile)
	{
		Map<Long, Integer> tintCache = new HashMap<Long, Integer>();
		Map<Long, Integer> brightnessCache = new HashMap<Long, Integer>();
		Map<Long, Integer> appearanceCache = new HashMap<Long, Integer>();
		VertexLightingCache vertexLightingCache = new VertexLightingCache();
		for (EmbeddedHostFace entry : cache.mesh.getFaces())
		{
			entry.setCachedPillarAxis(EmbeddedHostFaceEmitter.resolvePillarAxis(railTile, entry));
			entry.setCachedTint(getHostTintColor(railTile, entry, tintCache));
			entry.setCachedFaceBrightness(getFaceBrightness(railTile, entry, brightnessCache));
			entry.setCachedVertexBrightness(getEntryVertexBrightness(
					railTile, entry, brightnessCache, appearanceCache, vertexLightingCache));
			entry.setCachedVertexAmbientOcclusion(
					getEntryVertexAmbientOcclusion(
							railTile, entry, brightnessCache, appearanceCache, vertexLightingCache));
		}
		cache.lightingSnapshot = EmbeddedHostLighting.capture(
				brightnessCache, appearanceCache, railTile.getWorldObj());
	}

	/**
	 * Resolves packed brightness for the face's four vertices in tessellator submission order. Custom quads use their
	 * authored vertex order; cuboid faces use the side-specific order used by the face emitter.
	 *
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @param entry tile-local face whose vertices are sampled
	 * @param brightnessCache sampled world positions and their packed light values
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @param vertexLightingCache exact shared-vertex lighting resolved during this preparation pass
	 * @return four packed-light values in face-submission order
	 */
	static int[] getEntryVertexBrightness(TileTCRail railTile, EmbeddedHostFace entry,
			Map<Long, Integer> brightnessCache, Map<Long, Integer> appearanceCache,
			VertexLightingCache vertexLightingCache)
	{
		if (entry.isQuad())
		{
			QuadVertices quad = entry.getQuadVertices();
			return new int[] {
					vertexLightingCache.get(railTile, entry, quad.firstX, quad.firstY, quad.firstZ,
							brightnessCache, appearanceCache).brightness,
					vertexLightingCache.get(railTile, entry, quad.secondX, quad.secondY, quad.secondZ,
							brightnessCache, appearanceCache).brightness,
					vertexLightingCache.get(railTile, entry, quad.thirdX, quad.thirdY, quad.thirdZ,
							brightnessCache, appearanceCache).brightness,
					vertexLightingCache.get(railTile, entry, quad.fourthX, quad.fourthY, quad.fourthZ,
							brightnessCache, appearanceCache).brightness
			};
		}

		CuboidBounds bounds = entry.getCuboidBounds();
		switch (entry.getSide())
		{
			case BLOCK_SIDE_BOTTOM:
				return getVertexBrightnessArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.minY, bounds.maxZ, bounds.minX, bounds.minY, bounds.minZ,
						bounds.maxX, bounds.minY, bounds.minZ, bounds.maxX, bounds.minY, bounds.maxZ);
			case BLOCK_SIDE_TOP:
				return getVertexBrightnessArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.maxX, bounds.maxY, bounds.maxZ, bounds.maxX, bounds.maxY, bounds.minZ,
						bounds.minX, bounds.maxY, bounds.minZ, bounds.minX, bounds.maxY, bounds.maxZ);
			case BLOCK_SIDE_NORTH:
				return getVertexBrightnessArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.maxY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.minZ,
						bounds.maxX, bounds.minY, bounds.minZ, bounds.minX, bounds.minY, bounds.minZ);
			case BLOCK_SIDE_SOUTH:
				return getVertexBrightnessArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.maxY, bounds.maxZ, bounds.minX, bounds.minY, bounds.maxZ,
						bounds.maxX, bounds.minY, bounds.maxZ, bounds.maxX, bounds.maxY, bounds.maxZ);
			case BLOCK_SIDE_WEST:
				return getVertexBrightnessArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.maxY, bounds.maxZ, bounds.minX, bounds.maxY, bounds.minZ,
						bounds.minX, bounds.minY, bounds.minZ, bounds.minX, bounds.minY, bounds.maxZ);
			case BLOCK_SIDE_EAST:
				return getVertexBrightnessArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.maxX, bounds.minY, bounds.maxZ, bounds.maxX, bounds.minY, bounds.minZ,
						bounds.maxX, bounds.maxY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.maxZ);
			default:
				return new int[] { entry.getCachedFaceBrightness(), entry.getCachedFaceBrightness(),
						entry.getCachedFaceBrightness(), entry.getCachedFaceBrightness() };
		}
	}

	/**
	 * Samples four local face vertices and returns packed light in submission order.
	 *
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @param entry tile-local face supplying its captured host offset
	 * @param brightnessCache sampled world positions and their packed light values
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @param vertexLightingCache exact shared-vertex lighting resolved earlier in this preparation pass
	 * @param firstX first vertex X coordinate within the host cell, in blocks
	 * @param firstY first vertex Y coordinate within the host cell, in blocks
	 * @param firstZ first vertex Z coordinate within the host cell, in blocks
	 * @param secondX second vertex X coordinate within the host cell, in blocks
	 * @param secondY second vertex Y coordinate within the host cell, in blocks
	 * @param secondZ second vertex Z coordinate within the host cell, in blocks
	 * @param thirdX third vertex X coordinate within the host cell, in blocks
	 * @param thirdY third vertex Y coordinate within the host cell, in blocks
	 * @param thirdZ third vertex Z coordinate within the host cell, in blocks
	 * @param fourthX fourth vertex X coordinate within the host cell, in blocks
	 * @param fourthY fourth vertex Y coordinate within the host cell, in blocks
	 * @param fourthZ fourth vertex Z coordinate within the host cell, in blocks
	 * @return four packed-light values in the supplied vertex order
	 */
	static int[] getVertexBrightnessArray(TileTCRail railTile, EmbeddedHostFace entry,
			Map<Long, Integer> brightnessCache, Map<Long, Integer> appearanceCache,
			VertexLightingCache vertexLightingCache,
			double firstX, double firstY, double firstZ,
			double secondX, double secondY, double secondZ,
			double thirdX, double thirdY, double thirdZ,
			double fourthX, double fourthY, double fourthZ)
	{
		return new int[] {
				vertexLightingCache.get(railTile, entry, firstX, firstY, firstZ,
						brightnessCache, appearanceCache).brightness,
				vertexLightingCache.get(railTile, entry, secondX, secondY, secondZ,
						brightnessCache, appearanceCache).brightness,
				vertexLightingCache.get(railTile, entry, thirdX, thirdY, thirdZ,
						brightnessCache, appearanceCache).brightness,
				vertexLightingCache.get(railTile, entry, fourthX, fourthY, fourthZ,
						brightnessCache, appearanceCache).brightness
		};
	}

	/**
	 * Resolves the four vanilla-style ambient-occlusion multipliers in face-submission order.
	 *
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @param entry tile-local face whose vertices are sampled
	 * @param brightnessCache sampled world positions and their packed light values
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @param vertexLightingCache exact shared-vertex lighting resolved earlier in this preparation pass
	 * @return four ambient-occlusion multipliers in face-submission order
	 */
	static float[] getEntryVertexAmbientOcclusion(TileTCRail railTile, EmbeddedHostFace entry,
			Map<Long, Integer> brightnessCache, Map<Long, Integer> appearanceCache,
			VertexLightingCache vertexLightingCache)
	{
		if (entry.isQuad())
		{
			QuadVertices quad = entry.getQuadVertices();
			return new float[] {
					vertexLightingCache.get(railTile, entry, quad.firstX, quad.firstY, quad.firstZ,
							brightnessCache, appearanceCache).ambientOcclusion,
					vertexLightingCache.get(railTile, entry, quad.secondX, quad.secondY, quad.secondZ,
							brightnessCache, appearanceCache).ambientOcclusion,
					vertexLightingCache.get(railTile, entry, quad.thirdX, quad.thirdY, quad.thirdZ,
							brightnessCache, appearanceCache).ambientOcclusion,
					vertexLightingCache.get(railTile, entry, quad.fourthX, quad.fourthY, quad.fourthZ,
							brightnessCache, appearanceCache).ambientOcclusion
			};
		}

		CuboidBounds bounds = entry.getCuboidBounds();
		switch (entry.getSide())
		{
			case BLOCK_SIDE_BOTTOM:
				return getVertexAmbientOcclusionArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.minY, bounds.maxZ, bounds.minX, bounds.minY, bounds.minZ,
						bounds.maxX, bounds.minY, bounds.minZ, bounds.maxX, bounds.minY, bounds.maxZ);
			case BLOCK_SIDE_TOP:
				return getVertexAmbientOcclusionArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.maxX, bounds.maxY, bounds.maxZ, bounds.maxX, bounds.maxY, bounds.minZ,
						bounds.minX, bounds.maxY, bounds.minZ, bounds.minX, bounds.maxY, bounds.maxZ);
			case BLOCK_SIDE_NORTH:
				return getVertexAmbientOcclusionArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.maxY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.minZ,
						bounds.maxX, bounds.minY, bounds.minZ, bounds.minX, bounds.minY, bounds.minZ);
			case BLOCK_SIDE_SOUTH:
				return getVertexAmbientOcclusionArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.maxY, bounds.maxZ, bounds.minX, bounds.minY, bounds.maxZ,
						bounds.maxX, bounds.minY, bounds.maxZ, bounds.maxX, bounds.maxY, bounds.maxZ);
			case BLOCK_SIDE_WEST:
				return getVertexAmbientOcclusionArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.minX, bounds.maxY, bounds.maxZ, bounds.minX, bounds.maxY, bounds.minZ,
						bounds.minX, bounds.minY, bounds.minZ, bounds.minX, bounds.minY, bounds.maxZ);
			case BLOCK_SIDE_EAST:
				return getVertexAmbientOcclusionArray(railTile, entry, brightnessCache, appearanceCache, vertexLightingCache,
						bounds.maxX, bounds.minY, bounds.maxZ, bounds.maxX, bounds.minY, bounds.minZ,
						bounds.maxX, bounds.maxY, bounds.minZ, bounds.maxX, bounds.maxY, bounds.maxZ);
			default:
				return new float[] { 1.0F, 1.0F, 1.0F, 1.0F };
		}
	}

	/**
	 * Samples ambient occlusion at four supplied local vertices.
	 *
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @param entry tile-local face supplying its captured host offset and normal
	 * @param brightnessCache sampled world positions and their packed light values
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @param vertexLightingCache exact shared-vertex lighting resolved earlier in this preparation pass
	 * @param firstX first vertex X coordinate within the host cell, in blocks
	 * @param firstY first vertex Y coordinate within the host cell, in blocks
	 * @param firstZ first vertex Z coordinate within the host cell, in blocks
	 * @param secondX second vertex X coordinate within the host cell, in blocks
	 * @param secondY second vertex Y coordinate within the host cell, in blocks
	 * @param secondZ second vertex Z coordinate within the host cell, in blocks
	 * @param thirdX third vertex X coordinate within the host cell, in blocks
	 * @param thirdY third vertex Y coordinate within the host cell, in blocks
	 * @param thirdZ third vertex Z coordinate within the host cell, in blocks
	 * @param fourthX fourth vertex X coordinate within the host cell, in blocks
	 * @param fourthY fourth vertex Y coordinate within the host cell, in blocks
	 * @param fourthZ fourth vertex Z coordinate within the host cell, in blocks
	 * @return four ambient-occlusion multipliers in the supplied vertex order
	 */
	static float[] getVertexAmbientOcclusionArray(TileTCRail railTile, EmbeddedHostFace entry,
			Map<Long, Integer> brightnessCache, Map<Long, Integer> appearanceCache,
			VertexLightingCache vertexLightingCache,
			double firstX, double firstY, double firstZ,
			double secondX, double secondY, double secondZ,
			double thirdX, double thirdY, double thirdZ,
			double fourthX, double fourthY, double fourthZ)
	{
		return new float[] {
				vertexLightingCache.get(railTile, entry, firstX, firstY, firstZ,
						brightnessCache, appearanceCache).ambientOcclusion,
				vertexLightingCache.get(railTile, entry, secondX, secondY, secondZ,
						brightnessCache, appearanceCache).ambientOcclusion,
				vertexLightingCache.get(railTile, entry, thirdX, thirdY, thirdZ,
						brightnessCache, appearanceCache).ambientOcclusion,
				vertexLightingCache.get(railTile, entry, fourthX, fourthY, fourthZ,
						brightnessCache, appearanceCache).ambientOcclusion
		};
	}

	/**
	 * Resolves and memoizes the captured-host tint for one owner-relative host cell.
	 *
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @param entry face identifying the captured material and owner-relative host cell
	 * @param tintCache tints already resolved by owner-relative host position
	 * @return packed RGB tint for the captured host cell
	 */
	static int getHostTintColor(TileTCRail railTile, EmbeddedHostFace entry, Map<Long, Integer> tintCache)
	{
		long key = EmbeddedHostLighting.getPositionKey(entry.getOffsetX(), entry.getOffsetY(), entry.getOffsetZ());
		Integer cached = tintCache.get(key);
		if (cached != null)
		{
			return cached.intValue();
		}
		int tint = EmbeddedHostMaterialAccess.getTint(railTile, entry.getBlock(), entry.getMetadata(),
				entry.getOffsetX(), entry.getOffsetY(), entry.getOffsetZ(), entry.getColour());
		tintCache.put(key, Integer.valueOf(tint));
		return tint;
	}

	/**
	 * Samples packed light for one face. Ordinary faces use the world block immediately beyond their normal;
	 * bottom-slab top faces use vanilla's interpolated half-slab neighborhood.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param entry face supplying its captured offset and outward normal
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed sky-light and block-light value
	 */
	static int getFaceBrightness(TileTCRail railTile, EmbeddedHostFace entry, Map<Long, Integer> brightnessCache)
	{
		if (railTile.getWorldObj() == null)
		{
			return FULL_BRIGHT_LIGHTMAP;
		}
		if (entry.isVirtualTrenchWall())
		{
			int openingY = getVirtualTrenchOpeningY(railTile, entry);
			return EmbeddedHostLighting.getBrightness(railTile.getWorldObj(),
					railTile.xCoord + entry.getOffsetX(), openingY,
					railTile.zCoord + entry.getOffsetZ(), brightnessCache);
		}
		if (entry.getNormalY() > 0 && isBottomSlabHost(entry.getBlock(), entry.getMetadata()))
		{
			return getHostTopBrightness(railTile, entry, 0.5D, 0.5D, brightnessCache);
		}
		int sampleX = railTile.xCoord + entry.getOffsetX() + entry.getNormalX();
		int sampleY = railTile.yCoord + entry.getOffsetY() + entry.getNormalY();
		int sampleZ = railTile.zCoord + entry.getOffsetZ() + entry.getNormalZ();

		return EmbeddedHostLighting.getBrightness(
				railTile.getWorldObj(), sampleX, sampleY, sampleZ, brightnessCache);
	}

	/**
	 * Interpolates packed light for one local vertex from surrounding world-light samples.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param entry face supplying its captured offset and normal
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localY vertex Y coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed interpolated sky-light and block-light value
	 */
	static int getVertexBrightness(TileTCRail railTile, EmbeddedHostFace entry, double localX, double localY, double localZ,
			Map<Long, Integer> brightnessCache)
	{
		World world = railTile.getWorldObj();
		if (world == null)
		{
			return FULL_BRIGHT_LIGHTMAP;
		}
		if (entry.isVirtualTrenchWall())
		{
			return getVirtualTrenchBrightness(railTile, entry, localX, localZ, brightnessCache);
		}

		double normalX = entry.getNormalX();
		double normalY = entry.getNormalY();
		double normalZ = entry.getNormalZ();
		double normalLength = Math.sqrt(normalX * normalX + normalY * normalY + normalZ * normalZ);
		if (normalLength <= GEOMETRY_EPSILON)
		{
			normalY = 1.0D;
			normalLength = 1.0D;
		}
		normalX /= normalLength;
		normalY /= normalLength;
		normalZ /= normalLength;

		double worldX = railTile.xCoord + entry.getOffsetX() + localX + normalX * LIGHT_SAMPLE_OUTSET;
		double worldY = railTile.yCoord + entry.getOffsetY() + localY + normalY * LIGHT_SAMPLE_OUTSET;
		double worldZ = railTile.zCoord + entry.getOffsetZ() + localZ + normalZ * LIGHT_SAMPLE_OUTSET;
		if (Math.abs(normalY) >= Math.abs(normalX) && Math.abs(normalY) >= Math.abs(normalZ))
		{
			if (normalY > 0.0D)
			{
				return getHostTopBrightness(railTile, entry, localX, localZ, brightnessCache);
			}
			int minX = (int)Math.floor(worldX);
			int minZ = (int)Math.floor(worldZ);
			int sampleY = (int)Math.floor(worldY);
			return EmbeddedHostLighting.interpolatePackedBrightness(
					getTopCornerBrightness(world, minX, sampleY, minZ, brightnessCache),
					getTopCornerBrightness(world, minX + 1, sampleY, minZ, brightnessCache),
					getTopCornerBrightness(world, minX, sampleY, minZ + 1, brightnessCache),
					getTopCornerBrightness(world, minX + 1, sampleY, minZ + 1, brightnessCache),
					worldX - minX, worldZ - minZ);
		}
		else if (Math.abs(normalX) >= Math.abs(normalZ))
		{
			int sampleX = (int)Math.floor(worldX);
			int minY = (int)Math.floor(worldY);
			int minZ = (int)Math.floor(worldZ);
			int sideBrightness = EmbeddedHostLighting.interpolatePackedBrightness(
					getXFaceCornerBrightness(world, sampleX, minY, minZ, brightnessCache),
					getXFaceCornerBrightness(world, sampleX, minY + 1, minZ, brightnessCache),
					getXFaceCornerBrightness(world, sampleX, minY, minZ + 1, brightnessCache),
					getXFaceCornerBrightness(world, sampleX, minY + 1, minZ + 1, brightnessCache),
					worldY - minY, worldZ - minZ);
			return retainBrighterSurfaceLight(sideBrightness,
					getVirtualTrenchBrightness(railTile, entry, localX, localZ, brightnessCache));
		}
		else
		{
			int minX = (int)Math.floor(worldX);
			int minY = (int)Math.floor(worldY);
			int sampleZ = (int)Math.floor(worldZ);
			int sideBrightness = EmbeddedHostLighting.interpolatePackedBrightness(
					getZFaceCornerBrightness(world, minX, minY, sampleZ, brightnessCache),
					getZFaceCornerBrightness(world, minX + 1, minY, sampleZ, brightnessCache),
					getZFaceCornerBrightness(world, minX, minY + 1, sampleZ, brightnessCache),
					getZFaceCornerBrightness(world, minX + 1, minY + 1, sampleZ, brightnessCache),
					worldX - minX, worldY - minY);
			return retainBrighterSurfaceLight(sideBrightness,
					getVirtualTrenchBrightness(railTile, entry, localX, localZ, brightnessCache));
		}
	}

	/**
	 * Prevents an opaque neighboring cell from making a rebuilt wall darker than its exposed surface.
	 * Sky light keeps the brighter exposed value. Block light retains vanilla's one-level side attenuation,
	 * while preventing an opaque fake or neighboring cell from lowering the side by several light levels.
	 *
	 * @param sideBrightness packed light interpolated from the outward side of the face
	 * @param topBrightness packed light interpolated from the open surface above the embedded host
	 * @return packed light with corrected sky light and normally attenuated surface block light
	 */
	static int retainBrighterSurfaceLight(int sideBrightness, int topBrightness)
	{
		int sky = Math.max((sideBrightness >>> 16) & 0xFF, (topBrightness >>> 16) & 0xFF);
		int sideBlock = sideBrightness & 0xFF;
		int attenuatedTopBlock = Math.max(0, (topBrightness & 0xFF) - PACKED_BLOCK_LIGHT_STEP);
		int block = Math.max(sideBlock, attenuatedTopBlock);
		return (sky << 16) | block;
	}

	/**
	 * Interpolates the vanilla ambient-occlusion color multiplier at one local face vertex.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param entry face supplying its captured offset and outward normal
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localY vertex Y coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return interpolated ambient-occlusion multiplier from zero to one
	 */
	static float getVertexAmbientOcclusion(TileTCRail railTile, EmbeddedHostFace entry,
			double localX, double localY, double localZ, Map<Long, Integer> appearanceCache)
	{
		World world = railTile.getWorldObj();
		if (world == null)
		{
			return 1.0F;
		}
		double normalX = entry.getNormalX();
		double normalY = entry.getNormalY();
		double normalZ = entry.getNormalZ();
		double normalLength = Math.sqrt(normalX * normalX + normalY * normalY + normalZ * normalZ);
		if (normalLength <= GEOMETRY_EPSILON)
		{
			normalY = 1.0D;
			normalLength = 1.0D;
		}
		normalX /= normalLength;
		normalY /= normalLength;
		normalZ /= normalLength;

		double worldX = railTile.xCoord + entry.getOffsetX() + localX + normalX * LIGHT_SAMPLE_OUTSET;
		double worldY = railTile.yCoord + entry.getOffsetY() + localY + normalY * LIGHT_SAMPLE_OUTSET;
		double worldZ = railTile.zCoord + entry.getOffsetZ() + localZ + normalZ * LIGHT_SAMPLE_OUTSET;
		if (Math.abs(normalY) >= Math.abs(normalX) && Math.abs(normalY) >= Math.abs(normalZ))
		{
			if (normalY > 0.0D && isBottomSlabHost(entry.getBlock(), entry.getMetadata()))
			{
				return getBottomSlabTopAmbientOcclusion(
						railTile, entry, localX, localZ, appearanceCache);
			}
			int minX = (int)Math.floor(worldX);
			int minZ = (int)Math.floor(worldZ);
			int sampleY = (int)Math.floor(worldY);
			return EmbeddedHostLighting.interpolateAmbientOcclusion(
					getTopCornerAmbientOcclusion(world, minX, sampleY, minZ, appearanceCache),
					getTopCornerAmbientOcclusion(world, minX + 1, sampleY, minZ, appearanceCache),
					getTopCornerAmbientOcclusion(world, minX, sampleY, minZ + 1, appearanceCache),
					getTopCornerAmbientOcclusion(world, minX + 1, sampleY, minZ + 1, appearanceCache),
					worldX - minX, worldZ - minZ);
		}
		if (Math.abs(normalX) >= Math.abs(normalZ))
		{
			int sampleX = (int)Math.floor(worldX);
			int minY = (int)Math.floor(worldY);
			int minZ = (int)Math.floor(worldZ);
			return EmbeddedHostLighting.interpolateAmbientOcclusion(
					getXFaceCornerAmbientOcclusion(world, sampleX, minY, minZ, appearanceCache),
					getXFaceCornerAmbientOcclusion(world, sampleX, minY + 1, minZ, appearanceCache),
					getXFaceCornerAmbientOcclusion(world, sampleX, minY, minZ + 1, appearanceCache),
					getXFaceCornerAmbientOcclusion(world, sampleX, minY + 1, minZ + 1, appearanceCache),
					worldY - minY, worldZ - minZ);
		}
		int minX = (int)Math.floor(worldX);
		int minY = (int)Math.floor(worldY);
		int sampleZ = (int)Math.floor(worldZ);
		return EmbeddedHostLighting.interpolateAmbientOcclusion(
				getZFaceCornerAmbientOcclusion(world, minX, minY, sampleZ, appearanceCache),
				getZFaceCornerAmbientOcclusion(world, minX + 1, minY, sampleZ, appearanceCache),
				getZFaceCornerAmbientOcclusion(world, minX, minY + 1, sampleZ, appearanceCache),
				getZFaceCornerAmbientOcclusion(world, minX + 1, minY + 1, sampleZ, appearanceCache),
				worldX - minX, worldY - minY);
	}

	/**
	 * Returns whether a vertical face lies inside a host cell instead of on its exterior block boundary.
	 * Internal faces border the renderer's virtual trench cavity and cannot use world samples from the
	 * opaque embedded-rail block occupying that same coordinate.
	 *
	 * @param entry embedded host face being classified
	 * @return whether the face is an internal trench wall
	 */
	static boolean isInternalTrenchWall(EmbeddedHostFace entry)
	{
		if (entry.getSide() == OBLIQUE_WALL_FACE)
		{
			return true;
		}
		if (entry.getNormalY() != 0)
		{
			return false;
		}
		if (entry.isQuad())
		{
			QuadVertices quad = entry.getQuadVertices();
			switch (entry.getSide())
			{
				case BLOCK_SIDE_NORTH:
					return isNotWhollyOnBoundary(quad.firstZ, quad.secondZ, quad.thirdZ, quad.fourthZ, 0.0D);
				case BLOCK_SIDE_SOUTH:
					return isNotWhollyOnBoundary(quad.firstZ, quad.secondZ, quad.thirdZ, quad.fourthZ, 1.0D);
				case BLOCK_SIDE_WEST:
					return isNotWhollyOnBoundary(quad.firstX, quad.secondX, quad.thirdX, quad.fourthX, 0.0D);
				case BLOCK_SIDE_EAST:
					return isNotWhollyOnBoundary(quad.firstX, quad.secondX, quad.thirdX, quad.fourthX, 1.0D);
				default:
					return true;
			}
		}
		CuboidBounds bounds = entry.getCuboidBounds();
		switch (entry.getSide())
		{
			case BLOCK_SIDE_NORTH:
				return Math.abs(bounds.minZ) > GEOMETRY_EPSILON;
			case BLOCK_SIDE_SOUTH:
				return Math.abs(bounds.maxZ - 1.0D) > GEOMETRY_EPSILON;
			case BLOCK_SIDE_WEST:
				return Math.abs(bounds.minX) > GEOMETRY_EPSILON;
			case BLOCK_SIDE_EAST:
				return Math.abs(bounds.maxX - 1.0D) > GEOMETRY_EPSILON;
			default:
				return false;
		}
	}

	/**
	 * Returns whether a wall borders any part of the virtual trench rather than ordinary world air.
	 * A wall on a host-cell boundary is still virtual when the adjacent world cell is another captured
	 * embedded host. A surviving partial wall beside an opaque ordinary block is also virtual because
	 * sampling light from inside that opaque neighbor would blacken only that wall; completely covered
	 * faces have already been removed during geometry construction.
	 *
	 * @param railTile visible rail tile supplying captured-host ownership and world coordinates
	 * @param entry vertical embedded host face being classified
	 * @return whether the face must use virtual-cavity lighting
	 */
	static boolean isVirtualTrenchWall(TileTCRail railTile, EmbeddedHostFace entry)
	{
		if (isInternalTrenchWall(entry))
		{
			return true;
		}
		if (entry.getNormalY() != 0)
		{
			return false;
		}
		int neighborX = railTile.xCoord + entry.getOffsetX() + entry.getNormalX();
		int neighborY = railTile.yCoord + entry.getOffsetY();
		int neighborZ = railTile.zCoord + entry.getOffsetZ() + entry.getNormalZ();
		if (getCapturedHostBlockAtWorld(railTile, neighborX, neighborY, neighborZ) != null)
		{
			return true;
		}
		World world = railTile.getWorldObj();
		Block neighbor = world != null ? world.getBlock(neighborX, neighborY, neighborZ) : null;
		return neighbor != null && neighbor.isOpaqueCube();
	}

	/**
	 * Returns whether at least one custom-face coordinate differs from the selected host-cell boundary.
	 *
	 * @param first first submitted coordinate
	 * @param second second submitted coordinate
	 * @param third third submitted coordinate
	 * @param fourth fourth submitted coordinate
	 * @param boundary expected exterior boundary coordinate
	 * @return whether the face is not wholly on that boundary
	 */
	static boolean isNotWhollyOnBoundary(double first, double second, double third, double fourth,
			double boundary)
	{
		return Math.abs(first - boundary) > GEOMETRY_EPSILON
				|| Math.abs(second - boundary) > GEOMETRY_EPSILON
				|| Math.abs(third - boundary) > GEOMETRY_EPSILON
				|| Math.abs(fourth - boundary) > GEOMETRY_EPSILON;
	}

	/**
	 * Matches vanilla top-face corner substitution so custom trench edges do not outline in low light.
	 *
	 * @param railTile visible rail tile supplying the world-coordinate origin
	 * @param entry top face supplying its captured host offset
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed interpolated top-face light
	 */
	static int getHostTopBrightness(TileTCRail railTile, EmbeddedHostFace entry, double localX, double localZ,
			Map<Long, Integer> brightnessCache)
	{
		int hostY = railTile.yCoord + entry.getOffsetY();
		if (isBottomSlabHost(entry.getBlock(), entry.getMetadata()))
		{
			World world = railTile.getWorldObj();
			int blockX = railTile.xCoord + entry.getOffsetX();
			int blockZ = railTile.zCoord + entry.getOffsetZ();
			int baseY = world.getBlock(blockX, hostY + 1, blockZ).isOpaqueCube() ? hostY : hostY + 1;
			return getTopBrightnessAtPlanes(railTile, entry, localX, localZ,
					baseY, hostY, hostY + 1, brightnessCache);
		}
		return getTopBrightnessAtY(railTile, entry, localX, localZ, hostY + 1, brightnessCache);
	}

	/**
	 * Classifies a captured host as a non-opaque bottom-half slab.
	 *
	 * @param block captured host block type, or {@code null} when unavailable
	 * @param metadata captured host block metadata
	 * @return whether the host occupies the lower half of its block cell
	 */
	static boolean isBottomSlabHost(Block block, int metadata)
	{
		return block instanceof BlockSlab && block.isOpaqueCube() == false
				&& (metadata & TrackHostConstants.TOP_SLAB_METADATA_BIT) == 0;
	}

	/**
	 * Interpolates ambient occlusion for a bottom-slab top face using vanilla's split sampling planes.
	 * Cardinal and diagonal neighbors are sampled beside the slab, while the center contribution and
	 * diagonal corner-visibility checks are sampled in the cell above it.
	 *
	 * @param railTile visible rail tile supplying the host column's world coordinates
	 * @param entry top face supplying its captured host offset
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return interpolated ambient-occlusion multiplier from zero to one
	 */
	static float getBottomSlabTopAmbientOcclusion(TileTCRail railTile, EmbeddedHostFace entry,
			double localX, double localZ, Map<Long, Integer> appearanceCache)
	{
		World world = railTile.getWorldObj();
		int blockX = railTile.xCoord + entry.getOffsetX();
		int hostY = railTile.yCoord + entry.getOffsetY();
		int blockZ = railTile.zCoord + entry.getOffsetZ();
		int aboveY = hostY + 1;

		float center = getBlockAmbientOcclusion(world, blockX, aboveY, blockZ, appearanceCache);
		float west = getBlockAmbientOcclusion(world, blockX - 1, hostY, blockZ, appearanceCache);
		float east = getBlockAmbientOcclusion(world, blockX + 1, hostY, blockZ, appearanceCache);
		float north = getBlockAmbientOcclusion(world, blockX, hostY, blockZ - 1, appearanceCache);
		float south = getBlockAmbientOcclusion(world, blockX, hostY, blockZ + 1, appearanceCache);

		boolean westBlocksGrass = EmbeddedHostLighting.getCanBlockGrass(
				world, blockX - 1, aboveY, blockZ, appearanceCache);
		boolean eastBlocksGrass = EmbeddedHostLighting.getCanBlockGrass(
				world, blockX + 1, aboveY, blockZ, appearanceCache);
		boolean northBlocksGrass = EmbeddedHostLighting.getCanBlockGrass(
				world, blockX, aboveY, blockZ - 1, appearanceCache);
		boolean southBlocksGrass = EmbeddedHostLighting.getCanBlockGrass(
				world, blockX, aboveY, blockZ + 1, appearanceCache);

		float northWest = northBlocksGrass == false && westBlocksGrass == false ? west
				: getBlockAmbientOcclusion(world, blockX - 1, hostY, blockZ - 1, appearanceCache);
		float northEast = northBlocksGrass == false && eastBlocksGrass == false ? east
				: getBlockAmbientOcclusion(world, blockX + 1, hostY, blockZ - 1, appearanceCache);
		float southWest = southBlocksGrass == false && westBlocksGrass == false ? west
				: getBlockAmbientOcclusion(world, blockX - 1, hostY, blockZ + 1, appearanceCache);
		float southEast = southBlocksGrass == false && eastBlocksGrass == false ? east
				: getBlockAmbientOcclusion(world, blockX + 1, hostY, blockZ + 1, appearanceCache);

		float cornerNorthWest = EmbeddedHostLighting.getAmbientOcclusion(west, northWest, north, center);
		float cornerNorthEast = EmbeddedHostLighting.getAmbientOcclusion(north, northEast, east, center);
		float cornerSouthWest = EmbeddedHostLighting.getAmbientOcclusion(south, southWest, west, center);
		float cornerSouthEast = EmbeddedHostLighting.getAmbientOcclusion(east, southEast, south, center);
		return EmbeddedHostLighting.interpolateAmbientOcclusion(
				cornerNorthWest, cornerNorthEast, cornerSouthWest, cornerSouthEast,
				clampUnit(localX), clampUnit(localZ));
	}

	/**
	 * Resolves top-style packed light for a wall bordering the virtual trench cavity.
	 *
	 * @param railTile visible rail tile supplying captured-host and world coordinates
	 * @param entry virtual trench wall supplying its captured host offset
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed interpolated light from the first open cell above the virtual cavity
	 */
	static int getVirtualTrenchBrightness(TileTCRail railTile, EmbeddedHostFace entry,
			double localX, double localZ, Map<Long, Integer> brightnessCache)
	{
		return getTopBrightnessAtY(railTile, entry, localX, localZ,
				getVirtualTrenchOpeningY(railTile, entry), brightnessCache);
	}

	/**
	 * Finds the first world cell above a captured host column that is not another embedded fake cell.
	 * Vertically offset and sloped footprints can stack captured cells, so {@code hostY + 1} is not
	 * necessarily the opening through which the virtual trench receives light.
	 *
	 * @param railTile visible rail tile supplying captured-host and world coordinates
	 * @param entry virtual trench wall supplying its captured host offset
	 * @return world Y coordinate of the first open lighting sample
	 */
	static int getVirtualTrenchOpeningY(TileTCRail railTile, EmbeddedHostFace entry)
	{
		int worldX = railTile.xCoord + entry.getOffsetX();
		int worldY = railTile.yCoord + entry.getOffsetY() + 1;
		int worldZ = railTile.zCoord + entry.getOffsetZ();
		World world = railTile.getWorldObj();
		while (worldY < MINECRAFT_WORLD_HEIGHT
				&& (getCapturedHostBlockAtWorld(railTile, worldX, worldY, worldZ) != null
				|| world != null && TrackCellResolver.isHostReplacingRailBlock(world.getBlock(worldX, worldY, worldZ))))
		{
			worldY++;
		}
		return worldY;
	}

	/**
	 * Interpolates vanilla-style top-face packed light at one explicit world Y plane.
	 *
	 * @param railTile visible rail tile supplying the host column's world X/Z coordinates
	 * @param entry face supplying its captured host X/Z offset
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param sampleY explicit world Y plane from which light is sampled
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed interpolated top-style light
	 */
	static int getTopBrightnessAtY(TileTCRail railTile, EmbeddedHostFace entry,
			double localX, double localZ, int sampleY, Map<Long, Integer> brightnessCache)
	{
		return getTopBrightnessAtPlanes(railTile, entry, localX, localZ,
				sampleY, sampleY, sampleY + 1, brightnessCache);
	}

	/**
	 * Interpolates vanilla-style top-face packed light with independently selected center, neighbor, and
	 * corner-visibility planes. Vanilla bottom slabs use their own Y plane for cardinal and diagonal samples,
	 * while using the cell above for the face center and grass-blocking checks.
	 *
	 * @param railTile visible rail tile supplying the host column's world X/Z coordinates
	 * @param entry face supplying its captured host X/Z offset
	 * @param localX vertex X coordinate within the host cell, in blocks
	 * @param localZ vertex Z coordinate within the host cell, in blocks
	 * @param baseY world Y coordinate used for the top face's center light
	 * @param neighborY world Y coordinate used for cardinal and diagonal light samples
	 * @param grassY world Y coordinate used for diagonal corner-visibility checks
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed interpolated top-face light
	 */
	static int getTopBrightnessAtPlanes(TileTCRail railTile, EmbeddedHostFace entry,
			double localX, double localZ, int baseY, int neighborY, int grassY,
			Map<Long, Integer> brightnessCache)
	{
		/*
		 * Keep every clipped polygon in a captured host block on the same lighting
		 * field as a vanilla top face.  Sampling from the vertex's floored world
		 * coordinate is continuous, but it does not match RenderBlocks around a
		 * point light: vanilla conditionally substitutes a cardinal sample for the
		 * diagonal one.  That difference is normally hidden by a full block face,
		 * but it outlines the edge of a custom trench in low light.
		 */
		World world = railTile.getWorldObj();
		int blockX = railTile.xCoord + entry.getOffsetX();
		int blockZ = railTile.zCoord + entry.getOffsetZ();

		int base = EmbeddedHostLighting.getBrightness(world, blockX, baseY, blockZ, brightnessCache);
		int west = EmbeddedHostLighting.getBrightness(world, blockX - 1, neighborY, blockZ, brightnessCache);
		int east = EmbeddedHostLighting.getBrightness(world, blockX + 1, neighborY, blockZ, brightnessCache);
		int north = EmbeddedHostLighting.getBrightness(world, blockX, neighborY, blockZ - 1, brightnessCache);
		int south = EmbeddedHostLighting.getBrightness(world, blockX, neighborY, blockZ + 1, brightnessCache);

		boolean westBlocksGrass = world.getBlock(blockX - 1, grassY, blockZ).getCanBlockGrass();
		boolean eastBlocksGrass = world.getBlock(blockX + 1, grassY, blockZ).getCanBlockGrass();
		boolean northBlocksGrass = world.getBlock(blockX, grassY, blockZ - 1).getCanBlockGrass();
		boolean southBlocksGrass = world.getBlock(blockX, grassY, blockZ + 1).getCanBlockGrass();

		int northWest = northBlocksGrass == false && westBlocksGrass == false ? west
				: EmbeddedHostLighting.getBrightness(world, blockX - 1, neighborY, blockZ - 1, brightnessCache);
		int northEast = northBlocksGrass == false && eastBlocksGrass == false ? east
				: EmbeddedHostLighting.getBrightness(world, blockX + 1, neighborY, blockZ - 1, brightnessCache);
		int southWest = southBlocksGrass == false && westBlocksGrass == false ? west
				: EmbeddedHostLighting.getBrightness(world, blockX - 1, neighborY, blockZ + 1, brightnessCache);
		int southEast = southBlocksGrass == false && eastBlocksGrass == false ? east
				: EmbeddedHostLighting.getBrightness(world, blockX + 1, neighborY, blockZ + 1, brightnessCache);

		int cornerNorthWest = EmbeddedHostLighting.getAmbientOcclusionBrightness(west, northWest, north, base);
		int cornerNorthEast = EmbeddedHostLighting.getAmbientOcclusionBrightness(north, northEast, east, base);
		int cornerSouthWest = EmbeddedHostLighting.getAmbientOcclusionBrightness(south, southWest, west, base);
		int cornerSouthEast = EmbeddedHostLighting.getAmbientOcclusionBrightness(east, southEast, south, base);
		return EmbeddedHostLighting.interpolatePackedBrightness(
				cornerNorthWest, cornerNorthEast, cornerSouthWest, cornerSouthEast,
				clampUnit(localX), clampUnit(localZ));
	}

	/**
	 * Clamps a local interpolation fraction to the inclusive zero-to-one range.
	 *
	 * @param value interpolation fraction
	 * @return {@code value} limited to zero through one
	 */
	static double clampUnit(double value)
	{
		return Math.max(0.0D, Math.min(1.0D, value));
	}

	/**
	 * Returns vanilla-style packed ambient-occlusion brightness for the northwest corner of a horizontal top face.
	 *
	 * @param world client world supplying center, north, west, and northwest light samples
	 * @param worldX top-face block X coordinate
	 * @param worldY top-face block Y coordinate
	 * @param worldZ top-face block Z coordinate
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed sky and block light blended for the northwest corner
	 */
	static int getTopCornerBrightness(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> brightnessCache)
	{
		int second = EmbeddedHostLighting.getBrightness(
				world, worldX, worldY, worldZ - 1, brightnessCache);
		int third = EmbeddedHostLighting.getBrightness(
				world, worldX - 1, worldY, worldZ, brightnessCache);
		boolean useDiagonal = EmbeddedHostLighting.usesDiagonalCornerSample(
				world.getBlock(worldX, worldY + 1, worldZ - 1).getCanBlockGrass(),
				world.getBlock(worldX - 1, worldY + 1, worldZ).getCanBlockGrass());
		int diagonal = useDiagonal
				? EmbeddedHostLighting.getBrightness(world, worldX - 1, worldY, worldZ - 1, brightnessCache)
				: third;
		return EmbeddedHostLighting.getAmbientOcclusionBrightness(
				diagonal, second, third,
				EmbeddedHostLighting.getBrightness(world, worldX, worldY, worldZ, brightnessCache));
	}

	/**
	 * Returns ambient-occlusion light around one X-facing vertical corner.
	 *
	 * @param world client world supplying light values
	 * @param worldX corner world block X coordinate
	 * @param worldY corner world block Y coordinate
	 * @param worldZ corner world block Z coordinate
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed averaged corner light
	 */
	static int getXFaceCornerBrightness(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> brightnessCache)
	{
		int second = EmbeddedHostLighting.getBrightness(
				world, worldX, worldY, worldZ - 1, brightnessCache);
		int third = EmbeddedHostLighting.getBrightness(
				world, worldX, worldY - 1, worldZ, brightnessCache);
		boolean useDiagonal = EmbeddedHostLighting.usesDiagonalCornerSample(
				world.getBlock(worldX, worldY, worldZ - 1).getCanBlockGrass(),
				world.getBlock(worldX, worldY - 1, worldZ).getCanBlockGrass());
		int diagonal = useDiagonal
				? EmbeddedHostLighting.getBrightness(world, worldX, worldY - 1, worldZ - 1, brightnessCache)
				: third;
		return EmbeddedHostLighting.getAmbientOcclusionBrightness(
				diagonal, second, third,
				EmbeddedHostLighting.getBrightness(world, worldX, worldY, worldZ, brightnessCache));
	}

	/**
	 * Returns ambient-occlusion light around one Z-facing vertical corner.
	 *
	 * @param world client world supplying light values
	 * @param worldX corner world block X coordinate
	 * @param worldY corner world block Y coordinate
	 * @param worldZ corner world block Z coordinate
	 * @param brightnessCache sampled world positions and their packed light values
	 * @return packed averaged corner light
	 */
	static int getZFaceCornerBrightness(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> brightnessCache)
	{
		int second = EmbeddedHostLighting.getBrightness(
				world, worldX, worldY - 1, worldZ, brightnessCache);
		int third = EmbeddedHostLighting.getBrightness(
				world, worldX - 1, worldY, worldZ, brightnessCache);
		boolean useDiagonal = EmbeddedHostLighting.usesDiagonalCornerSample(
				world.getBlock(worldX, worldY - 1, worldZ).getCanBlockGrass(),
				world.getBlock(worldX - 1, worldY, worldZ).getCanBlockGrass());
		int diagonal = useDiagonal
				? EmbeddedHostLighting.getBrightness(world, worldX - 1, worldY - 1, worldZ, brightnessCache)
				: third;
		return EmbeddedHostLighting.getAmbientOcclusionBrightness(
				diagonal, second, third,
				EmbeddedHostLighting.getBrightness(world, worldX, worldY, worldZ, brightnessCache));
	}

	/**
	 * Returns vanilla-style ambient occlusion around one horizontal face corner.
	 *
	 * @param world client world supplying neighboring block shapes
	 * @param worldX corner world block X coordinate
	 * @param worldY corner world block Y coordinate
	 * @param worldZ corner world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return averaged ambient-occlusion multiplier
	 */
	static float getTopCornerAmbientOcclusion(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> appearanceCache)
	{
		float second = getBlockAmbientOcclusion(world, worldX, worldY, worldZ - 1, appearanceCache);
		float third = getBlockAmbientOcclusion(world, worldX - 1, worldY, worldZ, appearanceCache);
		boolean useDiagonal = EmbeddedHostLighting.usesDiagonalCornerSample(
				EmbeddedHostLighting.getCanBlockGrass(
						world, worldX, worldY + 1, worldZ - 1, appearanceCache),
				EmbeddedHostLighting.getCanBlockGrass(
						world, worldX - 1, worldY + 1, worldZ, appearanceCache));
		float diagonal = useDiagonal
				? getBlockAmbientOcclusion(world, worldX - 1, worldY, worldZ - 1, appearanceCache) : third;
		return EmbeddedHostLighting.getAmbientOcclusion(
				diagonal, second, third,
				getBlockAmbientOcclusion(world, worldX, worldY, worldZ, appearanceCache));
	}

	/**
	 * Returns vanilla-style ambient occlusion around one X-facing vertical corner.
	 *
	 * @param world client world supplying neighboring block shapes
	 * @param worldX corner world block X coordinate
	 * @param worldY corner world block Y coordinate
	 * @param worldZ corner world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return averaged ambient-occlusion multiplier
	 */
	static float getXFaceCornerAmbientOcclusion(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> appearanceCache)
	{
		float second = getBlockAmbientOcclusion(world, worldX, worldY, worldZ - 1, appearanceCache);
		float third = getBlockAmbientOcclusion(world, worldX, worldY - 1, worldZ, appearanceCache);
		boolean useDiagonal = EmbeddedHostLighting.usesDiagonalCornerSample(
				EmbeddedHostLighting.getCanBlockGrass(
						world, worldX, worldY, worldZ - 1, appearanceCache),
				EmbeddedHostLighting.getCanBlockGrass(
						world, worldX, worldY - 1, worldZ, appearanceCache));
		float diagonal = useDiagonal
				? getBlockAmbientOcclusion(world, worldX, worldY - 1, worldZ - 1, appearanceCache) : third;
		return EmbeddedHostLighting.getAmbientOcclusion(
				diagonal, second, third,
				getBlockAmbientOcclusion(world, worldX, worldY, worldZ, appearanceCache));
	}

	/**
	 * Returns vanilla-style ambient occlusion around one Z-facing vertical corner.
	 *
	 * @param world client world supplying neighboring block shapes
	 * @param worldX corner world block X coordinate
	 * @param worldY corner world block Y coordinate
	 * @param worldZ corner world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return averaged ambient-occlusion multiplier
	 */
	static float getZFaceCornerAmbientOcclusion(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> appearanceCache)
	{
		float second = getBlockAmbientOcclusion(world, worldX, worldY - 1, worldZ, appearanceCache);
		float third = getBlockAmbientOcclusion(world, worldX - 1, worldY, worldZ, appearanceCache);
		boolean useDiagonal = EmbeddedHostLighting.usesDiagonalCornerSample(
				EmbeddedHostLighting.getCanBlockGrass(
						world, worldX, worldY - 1, worldZ, appearanceCache),
				EmbeddedHostLighting.getCanBlockGrass(
						world, worldX - 1, worldY, worldZ, appearanceCache));
		float diagonal = useDiagonal
				? getBlockAmbientOcclusion(world, worldX - 1, worldY - 1, worldZ, appearanceCache) : third;
		return EmbeddedHostLighting.getAmbientOcclusion(
				diagonal, second, third,
				getBlockAmbientOcclusion(world, worldX, worldY, worldZ, appearanceCache));
	}

	/**
	 * Reads the static ambient-light value vanilla assigns to one world block.
	 *
	 * @param world client world supplying the block
	 * @param worldX sampled world block X coordinate
	 * @param worldY sampled world block Y coordinate
	 * @param worldZ sampled world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return block ambient-light value from zero to one
	 */
	static float getBlockAmbientOcclusion(World world, int worldX, int worldY, int worldZ,
			Map<Long, Integer> appearanceCache)
	{
		return EmbeddedHostLighting.getAmbientOcclusion(
				world, worldX, worldY, worldZ, appearanceCache);
	}

	/**
	 * Deduplicates exact vertex-light samples during one appearance-preparation pass.
	 * The mutable lookup key avoids one allocation per probe; stored keys are defensive copies and are never mutated.
	 */
	static final class VertexLightingCache
	{
		private final Map<VertexLightingKey, VertexLighting> values =
				new HashMap<VertexLightingKey, VertexLighting>();
		private final VertexLightingKey lookupKey = new VertexLightingKey();

		/**
		 * Returns cached lighting for one exact host-local vertex, resolving it on the first request.
		 *
		 * @param railTile visible rail tile supplying the world-coordinate origin
		 * @param entry face supplying its host offset, normal, and virtual-wall classification
		 * @param localX vertex X coordinate within the host cell, in blocks
		 * @param localY vertex Y coordinate within the host cell, in blocks
		 * @param localZ vertex Z coordinate within the host cell, in blocks
		 * @param brightnessCache sampled world positions and their packed light values
		 * @param appearanceCache sampled positions and their block-appearance signatures
		 * @return exact packed-light and ambient-occlusion pair for the vertex
		 */
		private VertexLighting get(TileTCRail railTile, EmbeddedHostFace entry,
				double localX, double localY, double localZ,
				Map<Long, Integer> brightnessCache, Map<Long, Integer> appearanceCache)
		{
			lookupKey.set(entry, localX, localY, localZ);
			VertexLighting lighting = values.get(lookupKey);
			if (lighting == null)
			{
				lighting = new VertexLighting(
						getVertexBrightness(railTile, entry, localX, localY, localZ, brightnessCache),
						getVertexAmbientOcclusion(railTile, entry, localX, localY, localZ, appearanceCache));
				values.put(new VertexLightingKey(lookupKey), lighting);
			}
			return lighting;
		}
	}

	/** Exact vertex identity within one captured host block and face-lighting context. */
	static final class VertexLightingKey
	{
		private int offsetX;
		private int offsetY;
		private int offsetZ;
		private long localXBits;
		private long localYBits;
		private long localZBits;
		private int normalX;
		private int normalY;
		private int normalZ;
		private boolean virtualTrenchWall;

		/** Creates the mutable lookup key used only for transient map reads. */
		private VertexLightingKey()
		{
		}

		/**
		 * Creates an immutable-by-convention copy suitable for insertion into the cache map.
		 *
		 * @param source populated lookup key whose exact fields are copied
		 */
		private VertexLightingKey(VertexLightingKey source)
		{
			this.offsetX = source.offsetX;
			this.offsetY = source.offsetY;
			this.offsetZ = source.offsetZ;
			this.localXBits = source.localXBits;
			this.localYBits = source.localYBits;
			this.localZBits = source.localZBits;
			this.normalX = source.normalX;
			this.normalY = source.normalY;
			this.normalZ = source.normalZ;
			this.virtualTrenchWall = source.virtualTrenchWall;
		}

		/**
		 * Replaces the transient lookup key with one exact vertex identity.
		 *
		 * @param entry face supplying its host offset, normal, and virtual-wall classification
		 * @param localX vertex X coordinate within the host cell, in blocks
		 * @param localY vertex Y coordinate within the host cell, in blocks
		 * @param localZ vertex Z coordinate within the host cell, in blocks
		 */
		private void set(EmbeddedHostFace entry, double localX, double localY, double localZ)
		{
			this.offsetX = entry.getOffsetX();
			this.offsetY = entry.getOffsetY();
			this.offsetZ = entry.getOffsetZ();
			this.localXBits = Double.doubleToLongBits(localX);
			this.localYBits = Double.doubleToLongBits(localY);
			this.localZBits = Double.doubleToLongBits(localZ);
			this.normalX = entry.getNormalX();
			this.normalY = entry.getNormalY();
			this.normalZ = entry.getNormalZ();
			this.virtualTrenchWall = entry.isVirtualTrenchWall();
		}

		/**
		 * Hashes every field that can alter vertex lighting.
		 *
		 * @return exact vertex-context hash
		 */
		@Override
		public int hashCode()
		{
			int result = offsetX;
			result = 31 * result + offsetY;
			result = 31 * result + offsetZ;
			result = 31 * result + (int)(localXBits ^ localXBits >>> 32);
			result = 31 * result + (int)(localYBits ^ localYBits >>> 32);
			result = 31 * result + (int)(localZBits ^ localZBits >>> 32);
			result = 31 * result + normalX;
			result = 31 * result + normalY;
			result = 31 * result + normalZ;
			return 31 * result + (virtualTrenchWall ? 1 : 0);
		}

		/**
		 * Compares every exact coordinate and face-lighting field.
		 *
		 * @param candidate possible vertex-lighting key
		 * @return whether both keys identify the same lighting sample
		 */
		@Override
		public boolean equals(Object candidate)
		{
			if (this == candidate)
			{
				return true;
			}
			if ((candidate instanceof VertexLightingKey) == false)
			{
				return false;
			}
			VertexLightingKey other = (VertexLightingKey)candidate;
			return offsetX == other.offsetX && offsetY == other.offsetY && offsetZ == other.offsetZ
					&& localXBits == other.localXBits && localYBits == other.localYBits
					&& localZBits == other.localZBits && normalX == other.normalX
					&& normalY == other.normalY && normalZ == other.normalZ
					&& virtualTrenchWall == other.virtualTrenchWall;
		}
	}

	/** Prepared lightmap and ambient-occlusion values shared by an exact vertex. */
	static final class VertexLighting
	{
		private final int brightness;
		private final float ambientOcclusion;

		/**
		 * Creates one immutable prepared vertex-lighting pair.
		 *
		 * @param brightness packed sky-light and block-light value
		 * @param ambientOcclusion ambient-occlusion multiplier from zero to one
		 */
		private VertexLighting(int brightness, float ambientOcclusion)
		{
			this.brightness = brightness;
			this.ambientOcclusion = ambientOcclusion;
		}
	}
}
