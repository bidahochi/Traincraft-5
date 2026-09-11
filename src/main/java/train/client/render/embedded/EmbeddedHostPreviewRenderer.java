package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import train.common.library.track.EnumCoreTrack;
import train.common.library.track.ITrackDefinition;
import train.common.library.track.TrackHostConstants;
import train.common.library.track.TrackSlopeParameters;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static train.client.render.embedded.EmbeddedHostRenderController.*;
import static train.client.render.embedded.EmbeddedHostLightingPreparer.*;
import static train.client.render.embedded.EmbeddedSlopeRenderPolicy.*;
import static train.client.render.embedded.EmbeddedSlopeHostMeshBuilder.*;

/**
 * Owns bounded placement-preview meshes and the transient rail state required to build them.
 *
 * <p>Preview keys contain geometry and material inputs only. Placement colors and alpha are applied for one draw and
 * restored afterward, preventing valid and invalid previews from duplicating meshes or contaminating later frames.
 * The synthetic rail reuses placed-track builders but is never registered or inserted into a world.</p>
 */
@SideOnly(Side.CLIENT)
final class EmbeddedHostPreviewRenderer
{
	private static final int MAX_HALF_HEIGHT_PREVIEW_MESHES = 64;
	private static final Map<String, EmbeddedHostRenderCache> HALF_HEIGHT_PREVIEW_CACHE =
			new LinkedHashMap<String, EmbeddedHostRenderCache>(16, 0.75F, true);
	private static final int MAX_TRUE_EMBEDDED_PREVIEW_MESHES = 64;
	private static final Map<String, EmbeddedHostRenderCache> TRUE_EMBEDDED_PREVIEW_CACHE =
			new LinkedHashMap<String, EmbeddedHostRenderCache>(16, 0.75F, true);

	private EmbeddedHostPreviewRenderer()
	{
	}

	/**
	 * Draws the cached generated ballast wedge used by a translucent half-height placement preview. Preview geometry uses
	 * the same cardinal or diagonal builder as placed rails, while material tint and placement-validity color remain
	 * frame-local and therefore do not multiply the number of cached meshes.
	 *
	 * @param track selected track definition supplying the ballast and placement family
	 * @param core effective cardinal or diagonal half-height core shown by the preview
	 * @param facing preview direction in Traincraft's cardinal or diagonal facing space
	 * @param ballastBlock block whose atlas icons texture the generated wedge
	 * @param ballastMetadata metadata selecting the ballast block icons
	 * @param ballastTint packed RGB material tint sampled at the placement target
	 * @param renderX additional X translation in the caller-established preview coordinate frame, in blocks
	 * @param renderY additional Y translation in the caller-established preview coordinate frame, in blocks
	 * @param renderZ additional Z translation in the caller-established preview coordinate frame, in blocks
	 * @param red red placement-validity multiplier
	 * @param green green placement-validity multiplier
	 * @param blue blue placement-validity multiplier
	 * @param alpha preview opacity from zero through one
	 */
	static void renderHalfHeightBallastPreview(ITrackDefinition track, EnumCoreTrack core, int facing,
			Block ballastBlock, int ballastMetadata, int ballastTint,
			double renderX, double renderY, double renderZ,
			float red, float green, float blue, float alpha)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(core);
		if (track == null || slope == null || core.isHalfHeightSlope() == false || ballastBlock == null)
		{
			return;
		}
		String key = core.name() + '|' + facing + '|' + Block.getIdFromBlock(ballastBlock) + '|' + ballastMetadata;
		EmbeddedHostRenderCache cache = HALF_HEIGHT_PREVIEW_CACHE.get(key);
		PreviewHalfHeightRail previewRail = new PreviewHalfHeightRail(track, core);
		previewRail.setFacing(facing);
		previewRail.setBallastMaterial(Block.getIdFromBlock(ballastBlock));
		previewRail.ballastMetadata = ballastMetadata;
		previewRail.ballastColour = TrackHostConstants.DEFAULT_HOST_TINT;
		previewRail.slopeHeight = slope.getHeight();
		previewRail.slopeLength = slope.getLength();
		previewRail.slopeAngle = slope.getAngle();
		if (cache == null)
		{
			cache = new EmbeddedHostRenderCache(0, false, 0L);
			addGeneratedHalfHeightBallast(cache, previewRail,
					getSyntheticHalfHeightBallastBlocks(previewRail), 0.0D);
			prepareFaceLightingContext(cache, previewRail);
			prepareCachedEntryLighting(cache, previewRail);
			putHalfHeightPreviewCache(key, cache);
		}

		int previewTint = multiplyPreviewTint(ballastTint, red, green, blue);
		renderPreviewFaces(cache, previewRail, renderX, renderY, renderZ, previewTint, alpha);
	}

	/**
	 * Draws the prospective captured-host trench for a true-embedded half-height slope without changing the world.
	 * The temporary rail carries the actual blocks beneath every future parent or gag cell into the same cached trench
	 * builder used after placement, so cut width, slope warping, side visibility, materials, and lighting remain
	 * identical to the placed result.
	 *
	 * @param track selected true-embedded track definition
	 * @param core effective cardinal or diagonal half-height core shown by the preview
	 * @param facing preview direction in Traincraft's cardinal or diagonal facing space
	 * @param world world supplying prospective captured blocks, neighboring coverage, tint, and lighting
	 * @param originX world X coordinate of the future parent rail cell
	 * @param originY world Y coordinate of the first host block that placement would replace
	 * @param originZ world Z coordinate of the future parent rail cell
	 * @param renderX preview X translation relative to the already translated rail model origin
	 * @param renderY preview Y translation relative to the already translated rail model origin
	 * @param renderZ preview Z translation relative to the already translated rail model origin
	 * @param red red placement-validity multiplier
	 * @param green green placement-validity multiplier
	 * @param blue blue placement-validity multiplier
	 * @param alpha preview opacity from zero through one
	 */
	static void renderTrueEmbeddedHalfHeightPreview(ITrackDefinition track, EnumCoreTrack core, int facing,
			World world, int originX, int originY, int originZ,
			double renderX, double renderY, double renderZ,
			float red, float green, float blue, float alpha)
	{
		TrackSlopeParameters slope = TrackSlopeParameters.canonical(core);
		if (track == null || slope == null || core.isHalfHeightSlope() == false || world == null)
		{
			return;
		}
		int slopeLength = (int)slope.getLength();

		PreviewHalfHeightRail previewRail = new PreviewHalfHeightRail(track, core);
		previewRail.setWorldObj(world);
		previewRail.xCoord = originX;
		previewRail.yCoord = originY;
		previewRail.zCoord = originZ;
		previewRail.setFacing(facing);
		previewRail.slopeHeight = slope.getHeight();
		previewRail.slopeLength = slope.getLength();
		previewRail.slopeAngle = slope.getAngle();

		List<TileTCRailHostData.CapturedHostBlock> hostBlocks =
				new ArrayList<TileTCRailHostData.CapturedHostBlock>(slopeLength);
		for (int index = 0; index < slopeLength; index++)
		{
			int[] offset = getHalfHeightSlopeCellOffset(core, facing, index);
			int worldX = originX + offset[0];
			int worldZ = originZ + offset[1];
			Block block = world.getBlock(worldX, originY, worldZ);
			if (block == null || block.isAir(world, worldX, originY, worldZ))
			{
				continue;
			}
			int metadata = world.getBlockMetadata(worldX, originY, worldZ);
			hostBlocks.add(new TileTCRailHostData.CapturedHostBlock(offset[0], 0, offset[1],
					Block.getIdFromBlock(block), metadata, block.colorMultiplier(world, worldX, originY, worldZ)));
		}
		if (hostBlocks.isEmpty())
		{
			return;
		}
		previewRail.replaceCapturedHostBlocks(hostBlocks, 0, 0, 0);

		String key = getTrueEmbeddedPreviewCacheKey(previewRail, world, originX, originY, originZ);
		EmbeddedHostRenderCache cache = TRUE_EMBEDDED_PREVIEW_CACHE.get(key);
		long currentLightUpdateVersion = EmbeddedHostLighting.getClientLightUpdateVersion(world);
		if (cache == null)
		{
			cache = buildCache(previewRail);
			cache.clientLightUpdateVersion = currentLightUpdateVersion;
			putTrueEmbeddedPreviewCache(key, cache);
		}
		else if (EmbeddedHostLighting.hasRelevantClientLightUpdate(
				world, cache.lightingSnapshot, cache.clientLightUpdateVersion)
				|| shouldRefreshCachedLighting(false, cache.lightingSnapshot, world))
		{
			prepareCachedEntryLighting(cache, previewRail);
		}
		cache.clientLightUpdateVersion = currentLightUpdateVersion;

		int previewTint = multiplyPreviewTint(TrackHostConstants.DEFAULT_HOST_TINT, red, green, blue);
		renderPreviewFaces(cache, previewRail, renderX, renderY, renderZ, previewTint, alpha);
	}

	/**
	 * Returns one half-height footprint cell's parent-relative horizontal offset using the same cardinal and diagonal
	 * direction rules as placed generated slopes.
	 *
	 * @param core effective half-height slope core
	 * @param facing Traincraft cardinal or diagonal direction
	 * @param index zero-based cell index along the slope
	 * @return two-element array containing X and Z offsets
	 */
	static int[] getHalfHeightSlopeCellOffset(EnumCoreTrack core, int facing, int index)
	{
		int offsetX = 0;
		int offsetZ = 0;
		if (isDiagonalHalfHeightSlopeCore(core))
		{
			offsetX = facing == 4 || facing == 5 ? -index : index;
			offsetZ = facing == 5 || facing == 6 ? -index : index;
		}
		else switch (facing)
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
		return new int[] {offsetX, offsetZ};
	}

	/**
	 * Builds the bounded preview-cache identity from world position, exact captured materials, and neighboring geometry.
	 *
	 * @param previewRail temporary rail containing prospective captured hosts
	 * @param world world owning the preview position
	 * @param originX future parent X coordinate
	 * @param originY future parent Y coordinate
	 * @param originZ future parent Z coordinate
	 * @return stable cache key for the current preview inputs
	 */
	private static String getTrueEmbeddedPreviewCacheKey(PreviewHalfHeightRail previewRail, World world,
			int originX, int originY, int originZ)
	{
		Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks =
				previewRail.getTrackHostRenderBlocks();
		StringBuilder key = new StringBuilder(getSlopeTopologyKey(previewRail, renderBlocks));
		key.append('|').append(System.identityHashCode(world)).append('|').append(originX).append(',')
				.append(originY).append(',').append(originZ).append('|').append(getHostGeometrySignature(previewRail));
		List<String> hostKeys = new ArrayList<String>(renderBlocks.keySet());
		Collections.sort(hostKeys);
		for (String hostKey : hostKeys)
		{
			TileTCRailHostData.CapturedHostBlock host = renderBlocks.get(hostKey);
			key.append(';').append(hostKey).append(':').append(host.blockId).append(':')
					.append(host.metadata).append(':').append(host.colour);
		}
		return key.toString();
	}

	/**
	 * Inserts one true-embedded preview mesh into its access-ordered cache and evicts the least recently used entry.
	 *
	 * @param key complete preview identity
	 * @param cache prepared trench mesh
	 */
	private static void putTrueEmbeddedPreviewCache(String key, EmbeddedHostRenderCache cache)
	{
		if (TRUE_EMBEDDED_PREVIEW_CACHE.size() >= MAX_TRUE_EMBEDDED_PREVIEW_MESHES)
		{
			String eldest = TRUE_EMBEDDED_PREVIEW_CACHE.keySet().iterator().next();
			TRUE_EMBEDDED_PREVIEW_CACHE.remove(eldest);
		}
		TRUE_EMBEDDED_PREVIEW_CACHE.put(key, cache);
	}

	/**
	 * Draws a prepared preview mesh with a temporary placement-validity tint and opacity, restoring every cached face
	 * afterward so later previews reuse the original material appearance.
	 *
	 * @param cache prepared preview mesh
	 * @param previewRail temporary rail supplying world-aware material and lighting context
	 * @param renderX preview X translation
	 * @param renderY preview Y translation
	 * @param renderZ preview Z translation
	 * @param previewTint packed RGB placement-validity tint
	 * @param alpha preview opacity from zero through one
	 */
	private static void renderPreviewFaces(EmbeddedHostRenderCache cache, TileTCRail previewRail,
			double renderX, double renderY, double renderZ, int previewTint, float alpha)
	{
		RenderBlocks renderer = new RenderBlocks();
		EmbeddedHostRenderState renderState = EmbeddedHostRenderState.begin();
		try
		{
			Tessellator tessellator = renderState.getTessellator();
			for (EmbeddedHostFace face : cache.mesh.getFaces())
			{
				int cachedTint = face.getCachedTint();
				float cachedAlpha = face.getCachedAlpha();
				face.setCachedTint(multiplyPackedTint(cachedTint, previewTint));
				face.setCachedAlpha(alpha);
				try
				{
					renderState.prepareForQuad();
					EmbeddedHostFaceEmitter.render(tessellator, renderer, previewRail, face,
							renderX, renderY, renderZ);
				}
				finally
				{
					face.setCachedTint(cachedTint);
					face.setCachedAlpha(cachedAlpha);
				}
			}
			renderState.finish();
		}
		finally
		{
			renderState.restore();
		}
	}

	/**
	 * Inserts one preview mesh into the access-ordered cache and removes the least-recently-used entry at the bound.
	 *
	 * @param key material, core, and orientation cache key
	 * @param cache prepared preview mesh
	 */
	private static void putHalfHeightPreviewCache(String key, EmbeddedHostRenderCache cache)
	{
		if (HALF_HEIGHT_PREVIEW_CACHE.size() >= MAX_HALF_HEIGHT_PREVIEW_MESHES)
		{
			String eldest = HALF_HEIGHT_PREVIEW_CACHE.keySet().iterator().next();
			HALF_HEIGHT_PREVIEW_CACHE.remove(eldest);
		}
		HALF_HEIGHT_PREVIEW_CACHE.put(key, cache);
	}

	/**
	 * Packs material tint multiplied by the red, green, and blue placement-preview channels.
	 *
	 * @param materialTint packed RGB ballast tint
	 * @param red red placement-validity multiplier
	 * @param green green placement-validity multiplier
	 * @param blue blue placement-validity multiplier
	 * @return packed RGB preview tint
	 */
	private static int multiplyPreviewTint(int materialTint, float red, float green, float blue)
	{
		int materialRed = materialTint >> 16 & 255;
		int materialGreen = materialTint >> 8 & 255;
		int materialBlue = materialTint & 255;
		return Math.min(255, Math.max(0, Math.round(materialRed * red))) << 16
				| Math.min(255, Math.max(0, Math.round(materialGreen * green))) << 8
				| Math.min(255, Math.max(0, Math.round(materialBlue * blue)));
	}

	/**
	 * Multiplies two packed RGB tints channel by channel.
	 *
	 * @param first first packed RGB tint
	 * @param second second packed RGB tint
	 * @return packed RGB product
	 */
	private static int multiplyPackedTint(int first, int second)
	{
		int red = (first >> 16 & 255) * (second >> 16 & 255) / 255;
		int green = (first >> 8 & 255) * (second >> 8 & 255) / 255;
		int blue = (first & 255) * (second & 255) / 255;
		return red << 16 | green << 8 | blue;
	}

	static void clear()
	{
		HALF_HEIGHT_PREVIEW_CACHE.clear();
		TRUE_EMBEDDED_PREVIEW_CACHE.clear();
	}

	/** Supplies an effective preview core without registering a temporary track definition. */
	static final class PreviewHalfHeightRail extends TileTCRail
	{
		private final ITrackDefinition previewTrack;
		private final EnumCoreTrack previewCore;

		PreviewHalfHeightRail(ITrackDefinition previewTrack, EnumCoreTrack previewCore)
		{
			this.previewTrack = previewTrack;
			this.previewCore = previewCore;
		}

		@Override
		public ITrackDefinition getTrackType()
		{
			return previewTrack;
		}

		@Override
		public EnumCoreTrack getCoreType()
		{
			return previewCore;
		}
	}
}
