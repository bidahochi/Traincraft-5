package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailHostData;
import train.client.render.embedded.EmbeddedHostFace;
import train.client.render.embedded.EmbeddedHostFaceEmitter;
import train.client.render.embedded.EmbeddedHostLighting;
import train.client.render.embedded.EmbeddedHostRenderState;
import train.client.render.embedded.EmbeddedSwitchTerrainProfiles.Profile;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static train.client.render.embedded.EmbeddedTrenchProfileRules.*;
import static train.client.render.embedded.EmbeddedSlopeRenderPolicy.*;
import static train.client.render.embedded.EmbeddedDisplayListPolicy.*;
import static train.client.render.embedded.EmbeddedCapturedHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedHostLightingPreparer.*;
import static train.client.render.embedded.EmbeddedSlopeHostMeshBuilder.*;
import static train.client.render.embedded.EmbeddedSwitchHostMeshBuilder.*;

/**
 * Owns the lifetime of tile-local host meshes and their OpenGL display lists.
 *
 * <p>Geometry invalidation rebuilds through the appropriate mesh builder. Light-only invalidation retains the ordered
 * face mesh and refreshes its prepared appearance. Weak tile keys avoid retaining unloaded chunks, and the reference
 * queue releases display lists whose tile entities were collected.</p>
 *
	 * <p>A visible mesh renders directly while waiting in the deduplicated display-list compilation queue. The queue is
	 * serviced under count and time budgets each frame; its total size is not capped. Keep GL state and display-list
	 * replacement ordering unchanged when adjusting this class.</p>
 */
@SideOnly(Side.CLIENT)
final class EmbeddedHostRenderController
{
	/*
	 * True embedded rails replace their host blocks in the world. This renderer
	 * rebuilds the visible host surfaces from the blocks saved by the parent track.
	 * The finished faces are cached because a long track may cover many helper blocks
	 * and several host materials.
	 */
	static final ReferenceQueue<TileTCRail> COLLECTED_TILE_QUEUE = new ReferenceQueue<TileTCRail>();
	static final Map<WeakTileKey, EmbeddedHostRenderCache> CACHE = new HashMap<WeakTileKey, EmbeddedHostRenderCache>();
	static final List<DisplayListCompileRequest> DISPLAY_LIST_COMPILE_QUEUE =
			new ArrayList<DisplayListCompileRequest>();
	static final int BLOCK_SIDE_BOTTOM = 0;
	static final int BLOCK_SIDE_TOP = 1;
	static final int BLOCK_SIDE_NORTH = 2;
	static final int BLOCK_SIDE_SOUTH = 3;
	static final int BLOCK_SIDE_WEST = 4;
	static final int BLOCK_SIDE_EAST = 5;
	static final int FULL_BRIGHT_LIGHTMAP = 0xF000F0;
	/** Distance between adjacent Minecraft block-light levels in the packed lightmap lane. */
	static final int PACKED_BLOCK_LIGHT_STEP = 0x10;
	static final int MINECRAFT_WORLD_HEIGHT = 256;
	static final long GEOMETRY_HASH_MULTIPLIER = 0x9E3779B97F4A7C15L;
	static final long COVERED_NEIGHBOR_HASH = 0xC2B2AE3D27D4EB4FL;
	static World displayListWorld;
	/*
	 * These small allowances solve different problems. 0.003 separates faces that
	 * would flicker at the same depth, 0.001 treats almost-equal wall heights as equal,
	 * and 0.0001 is used for precise cut comparisons where a visible shift is unwanted.
	 */
	static final double RENDER_EPSILON = 0.003D;
	static final double GEOMETRY_EPSILON = 0.0001D;
	static final double FACE_HEIGHT_EPSILON = 0.001D;
	/**
	 * Reads lighting just beyond a block face. Half a block reaches the face from the
	 * center; the extra 0.01 safely crosses the block boundary despite rounding. This
	 * makes the lookup use the neighboring block instead of the host block.
	 */
	static final double LIGHT_SAMPLE_OUTSET = 0.51D;
	static final float SHADE_TOP_FACE = 1.0F;
	static final float SHADE_BOTTOM_FACE = 0.5F;
	static final float SHADE_Z_FACE = 0.8F;
	static final float SHADE_X_FACE = 0.6F;
	static final float SHADE_OBLIQUE_WALL = 0.75F;
	static final int CUSTOM_TOP_FACE = -2;
	static final int OBLIQUE_WALL_FACE = -1;
	/** Exact cross-track width of the authored diagonal half-height ballast OBJs. */
	static final double DIAGONAL_HALF_HEIGHT_BALLAST_WIDTH = Math.sqrt(2.0D);
	/** Authored cross-track UV extent shared by the legacy diagonal ballast OBJs. */
	static final double DIAGONAL_HALF_HEIGHT_BALLAST_TEXTURE_WIDTH = 1.41D;
	/** Converts physical distance along either 45-degree axis into equal X and Z movement. */
	static final double DIAGONAL_DISTANCE_COMPONENT = 1.0D / Math.sqrt(2.0D);
	/** Lowers the trench by one texture pixel (1/16 block), matching existing embedded rails. */
	static final double TRENCH_POCKET_DROP = 0.0625D;
	/*
	 * Faraway shapes may be skipped based on the camera direction. This starts after
	 * 40 blocks and stops before the last quarter of the render distance. Allowing
	 * twice the host radius and using a -0.45 direction limit keeps long tracks that
	 * cross the camera view. It skips only shapes clearly behind the player, which
	 * avoided visible objects popping in.
	 */
	static final double VIEW_CULL_MIN_CLOSE_DISTANCE = 40.0D;
	static final double VIEW_CULL_RENDER_DISTANCE_FACTOR = 0.75D;
	static final double VIEW_CULL_RADIUS_MULTIPLIER = 2.0D;
	static final double VIEW_CULL_DOT_THRESHOLD = -0.45D;
	/*
	 * Grid sizes are the number of cut samples per block. Diagonals and the narrow
	 * crossing in the 4x11 switch need 32 samples to avoid gaps at block edges. Other
	 * shapes use 16. Tracks covering more than 24 saved blocks use half as many samples
	 * to limit cache-building work. Model-based switches stay at 16 because their
	 * connected rail paths supply the detailed edge.
	 */
	static final int MODEL_SWITCH_MESH_GRID_SIZE = 16;
	/**
	 * A full circle is split into 96 straight pieces, or 3.75 degrees per piece. This
	 * kept the largest supported curve looking smooth without noticeably increasing
	 * the cached shape. The work happens while building the cache, not on every frame.
	 */
	static final int CURVE_PROFILE_SEGMENTS = 96;
	/** Half-degree steps keep short visible curve sections when neighboring block sections join. */
	static final int CURVE_ANGLE_MASK_BINS = 720;
	/**
	 * Extends each found curve section by ten degrees. This closes tiny gaps caused by
	 * straight curve pieces and block boundaries. Less padding left holes; more could
	 * draw a trench wall beyond the real rail curve.
	 */
	static final double CURVE_ANGLE_MASK_PADDING = Math.PI / 18.0D;
	/*
	 * Rail center positions come from the visible straight-track model. Trench widths
	 * were then compared in-game with that straight track. Inner widths were reduced
	 * until terrain stopped touching the rail. Outer widths were adjusted separately
	 * so turns and diagonals kept the same outside margin without widening the cut on
	 * the far side of a neighboring rail.
	 */
	/** Creates no instances; embedded host rendering is static and cache-backed. */
	private EmbeddedHostRenderController()
	{
	}

	/**
	 * Draws captured host material around one true-embedded track at the supplied render position.
	 * Geometry and prepared appearance are rebuilt only after relevant changes are detected; cached lighting inputs are
	 * refreshed immediately after rail-neighbor events and periodically sampled only as a fallback.
	 *
	 * @param railTile visible rail tile that owns or resolves the captured host cells
	 * @param renderX camera-relative X position of the visible rail tile, in blocks
	 * @param renderY camera-relative Y position of the visible rail tile, in blocks
	 * @param renderZ camera-relative Z position of the visible rail tile, in blocks
	 */
	static void render(TileTCRail railTile, double renderX, double renderY, double renderZ)
	{
		if (railTile == null || railTile.getTrackHostRenderBlocks().isEmpty()
				&& usesUncutRegularHalfHeightBallast(railTile) == false)
		{
			return;
		}

		World world = railTile.getWorldObj();
		if (displayListWorld != world)
		{
			clear();
			displayListWorld = world;
		}
		long currentLightUpdateVersion = EmbeddedHostLighting.getClientLightUpdateVersion(world);
		releaseCollectedDisplayLists();

		WeakTileKey lookupKey = new WeakTileKey(railTile, null);
		EmbeddedHostRenderCache cache = CACHE.get(lookupKey);
		boolean hostTerrainSwitchState = getHostTerrainSwitchState(railTile);
		int currentVersion = railTile.getTrackHostRenderVersion();
		boolean rebuildGeometry = cache == null || cache.switchState != hostTerrainSwitchState;
		boolean refreshLightingFromNeighborEvent = false;
		boolean refreshLightingFromClientWorld = cache != null
				&& EmbeddedHostLighting.hasRelevantClientLightUpdate(
						world, cache.lightingSnapshot, cache.clientLightUpdateVersion);
		if (rebuildGeometry == false && cache.version != currentVersion)
		{
			long currentGeometrySignature = getHostGeometrySignature(railTile);
			if (cache.geometrySignature != currentGeometrySignature)
			{
				rebuildGeometry = true;
			}
			else
			{
				cache.version = currentVersion;
				refreshLightingFromNeighborEvent = true;
			}
		}
		if (rebuildGeometry)
		{
			CACHE.remove(lookupKey);
			releaseDisplayList(cache);
			cache = buildCache(railTile);
			cache.clientLightUpdateVersion = currentLightUpdateVersion;
			CACHE.put(new WeakTileKey(railTile, COLLECTED_TILE_QUEUE), cache);
		}
		else
		{
			cache.clientLightUpdateVersion = currentLightUpdateVersion;
			boolean refreshCachedLighting = refreshLightingFromNeighborEvent || refreshLightingFromClientWorld
					|| shouldRefreshCachedLighting(false, cache.lightingSnapshot, world);
			if (refreshCachedLighting)
			{
				stageDisplayListForReplacement(cache);
				prepareCachedEntryLighting(cache, railTile);
			}
		}

		if (cache.mesh.getFaces().isEmpty())
		{
			return;
		}
		if (shouldCullByViewAngle(railTile, cache))
		{
			return;
		}
		if (cache.displayList != 0)
		{
			renderDisplayList(cache.displayList, renderX, renderY, renderZ);
			return;
		}

		RenderBlocks renderer = new RenderBlocks();
		EmbeddedHostRenderState renderState = EmbeddedHostRenderState.begin();
		try
		{
			Tessellator tessellator = renderState.getTessellator();
			if (shouldUseDisplayList(cache.mesh.getFaces().size(), usesAlwaysCachedSlopeMesh(railTile)))
			{
				queueDisplayListCompilation(cache, railTile);
			}
			renderEntries(cache, renderState, tessellator, renderer, railTile, renderX, renderY, renderZ);
			renderState.finish();
		}
		finally
		{
			renderState.restore();
		}
	}

	/**
	 * Builds all host faces from the visible tile's owner-rebased captured blocks.
	 *
	 * @param railTile visible rail tile supplying captured blocks and profile data
	 * @return newly built tile-local mesh, lighting snapshot, and render cache state
	 */
	static EmbeddedHostRenderCache buildCache(TileTCRail railTile)
	{
		EmbeddedHostRenderCache cache = new EmbeddedHostRenderCache(railTile.getTrackHostRenderVersion(), getHostTerrainSwitchState(railTile),
				getHostGeometrySignature(railTile));
		Map<String, TileTCRailHostData.CapturedHostBlock> renderBlocks = getHostBlocksForRendering(railTile);
		Set<String> hostKeys = new HashSet<String>(renderBlocks.keySet());
		boolean compositeMountedSlope = railTile.isIntactHostMountedTrack() && usesGeneratedHalfHeightBallast(railTile);
		String slopeTopologyKey = usesAlwaysCachedSlopeMesh(railTile) && compositeMountedSlope == false
				&& (railTile instanceof EmbeddedHostPreviewRenderer.PreviewHalfHeightRail) == false
				? getSlopeTopologyKey(railTile, renderBlocks) : null;
		SlopeMeshTopologyCache.Template slopeTopology = slopeTopologyKey != null
				? SlopeMeshTopologyCache.get(slopeTopologyKey) : null;
		if (slopeTopology != null && bindSlopeTopology(cache, railTile, renderBlocks, slopeTopology))
		{
			return prepareCompletedCache(cache, railTile, null);
		}
		if (usesUncutRegularHalfHeightBallast(railTile))
		{
			addGeneratedHalfHeightBallast(cache, railTile, renderBlocks, 0.0D);
			return prepareCompletedCache(cache, railTile, slopeTopologyKey);
		}
		if (usesContinuousTrueEmbeddedDiagonalHalfHeightSlope(railTile))
		{
			addContinuousTrueEmbeddedDiagonalHalfHeightSlope(cache, railTile, renderBlocks);
			return prepareCompletedCache(cache, railTile, slopeTopologyKey);
		}
		AngleMask curveAngleMask = usesCurvedOverlayProfile(railTile) || shouldUseCurvedSwitchProfile(railTile) ? buildCurveAngleMask(railTile) : null;
		Profile modelProfile = getModelTerrainProfile(railTile);
		EmbeddedModelSwitchTopCache.Template modelSwitchTop = modelProfile != null
				? getOrBuildModelSwitchTopTemplate(railTile, renderBlocks, modelProfile) : null;
		for (TileTCRailHostData.CapturedHostBlock hostBlock : renderBlocks.values())
		{
			cache.mesh.includeHost(hostBlock);
			Block block = Block.getBlockById(hostBlock.blockId);
			if (block == null)
			{
				continue;
			}
			if (usesSampledTrenchProfile(railTile))
			{
				double profileMinY = getTrenchProfileMinY(railTile, block, hostBlock);
				addCapturedShapesBelowTrench(cache, railTile, hostKeys, hostBlock, block, profileMinY);
				addSampledProfileFaces(cache, railTile, hostKeys, hostBlock, block, hostBlock.metadata,
						curveAngleMask, modelSwitchTop, profileMinY);
			}
			else
			{
				for (HostShape shape : getHostShapes(railTile, block, hostBlock))
				{
					addCuboidFaces(cache, railTile, hostKeys, hostBlock, block, shape);
				}
			}
		}
		if (usesRisingEmbeddedHalfHeightSurface(railTile))
		{
			warpEmbeddedHalfHeightSlopeFaces(cache.mesh, railTile);
		}
		if (compositeMountedSlope)
		{
			Map<String, TileTCRailHostData.CapturedHostBlock> ballastBlocks =
					getSyntheticHalfHeightBallastBlocks(railTile);
			addGeneratedHalfHeightBallast(cache, railTile, ballastBlocks, railTile.getTrackSurfaceYOffset());
		}
		return prepareCompletedCache(cache, railTile, slopeTopologyKey);
	}

	/**
	 * Combines an explicit refresh request with the exact lighting-snapshot comparison. The render controller currently
	 * handles tracked neighbor and client render invalidations before this fallback and therefore passes {@code false}.
	 *
	 * @param refreshFromNeighborEvent whether a rail or gag neighbor callback advanced the host render version
	 * @param lightingSnapshot previously prepared world-light and ambient-occlusion samples
	 * @param world current client world supplying fallback samples
	 * @return whether cached tint, light, ambient occlusion, and the tile display list must be refreshed
	 */
	static boolean shouldRefreshCachedLighting(boolean refreshFromNeighborEvent,
			EmbeddedHostLighting.Snapshot lightingSnapshot, World world)
	{
		return refreshFromNeighborEvent || lightingSnapshot.hasChanged(world);
	}

	/**
	 * Releases live, retired, and queued graphics resources and clears tile meshes, previews, model-switch tops, slope
	 * topology, and client render-invalidation tracking. Parsed switch terrain profiles remain process-lifetime caches.
	 * The reference queue is drained after display-list release so collected tiles cannot strand graphics objects.
	 */
	static void clear()
	{
		clearDisplayListCompilationQueue();
		for (EmbeddedHostRenderCache cache : CACHE.values())
		{
			releaseDisplayList(cache);
		}
		CACHE.clear();
		EmbeddedHostPreviewRenderer.clear();
		EmbeddedModelSwitchTopCache.clear();
		SlopeMeshTopologyCache.clear();
		EmbeddedHostLighting.clearClientLightUpdateTracker();
		while (COLLECTED_TILE_QUEUE.poll() != null)
		{
			// Drain references whose graphics objects were released above.
		}
		displayListWorld = null;
	}

	/**
	 * Compiles the nearest display-list requests accumulated during the completed world frame. Compilation stops after
	 * the count or time budget is exhausted; deferred visible meshes are rendered directly and request compilation again
	 * during the next frame.
	 */
	static void compileQueuedDisplayLists()
	{
		if (DISPLAY_LIST_COMPILE_QUEUE.isEmpty())
		{
			return;
		}
		List<DisplayListCompileRequest> requests =
				new ArrayList<DisplayListCompileRequest>(DISPLAY_LIST_COMPILE_QUEUE);
		DISPLAY_LIST_COMPILE_QUEUE.clear();
		for (DisplayListCompileRequest request : requests)
		{
			request.cache.displayListCompilationQueued = false;
		}
		Collections.sort(requests, new Comparator<DisplayListCompileRequest>()
		{
			@Override
			public int compare(DisplayListCompileRequest first, DisplayListCompileRequest second)
			{
				return Double.compare(first.distanceSquared, second.distanceSquared);
			}
		});

		long startedAt = System.nanoTime();
		int compiledCount = 0;
		for (DisplayListCompileRequest request : requests)
		{
			long elapsedNanos = System.nanoTime() - startedAt;
			if (hasCompilationBudget(compiledCount, elapsedNanos) == false)
			{
				break;
			}
			TileTCRail railTile = request.railTile.get();
			if (railTile == null || request.cache.displayList != 0
					|| CACHE.get(new WeakTileKey(railTile, null)) != request.cache)
			{
				continue;
			}
			compileDisplayList(request.cache, railTile);
			compiledCount++;
		}
	}

	/**
	 * Queues one visible mesh for nearest-first display-list compilation after the world frame finishes.
	 *
	 * @param cache prepared mesh cache awaiting a display list
	 * @param railTile visible rail tile owning the prepared mesh
	 */
	static void queueDisplayListCompilation(EmbeddedHostRenderCache cache, TileTCRail railTile)
	{
		if (cache.displayList != 0 || cache.displayListCompilationQueued)
		{
			return;
		}
		Entity camera = Minecraft.getMinecraft().renderViewEntity;
		double distanceSquared = 0.0D;
		if (camera != null)
		{
			double deltaX = railTile.xCoord + 0.5D - camera.posX;
			double deltaY = railTile.yCoord + 0.5D - camera.posY;
			double deltaZ = railTile.zCoord + 0.5D - camera.posZ;
			distanceSquared = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
		}
		cache.displayListCompilationQueued = true;
		DISPLAY_LIST_COMPILE_QUEUE.add(new DisplayListCompileRequest(railTile, cache, distanceSquared));
	}

	/** Clears deferred compilation requests and releases their per-cache queued markers. */
	static void clearDisplayListCompilationQueue()
	{
		for (DisplayListCompileRequest request : DISPLAY_LIST_COMPILE_QUEUE)
		{
			request.cache.displayListCompilationQueued = false;
		}
		DISPLAY_LIST_COMPILE_QUEUE.clear();
	}

	/** Deletes graphics objects whose weakly referenced rail tiles were collected. */
	static void releaseCollectedDisplayLists()
	{
		WeakTileKey collectedKey;
		while ((collectedKey = (WeakTileKey)COLLECTED_TILE_QUEUE.poll()) != null)
		{
			releaseDisplayList(CACHE.remove(collectedKey));
		}
	}

	/**
	 * Replays every prepared mesh face while respecting the render state's tessellator batch limit.
	 *
	 * @param cache cache containing prepared tile-local faces
	 * @param renderState owner of the current tessellator and OpenGL state
	 * @param tessellator tessellator receiving face vertices
	 * @param renderer vanilla block renderer used for captured block textures
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @param renderX camera-relative X position of the visible rail tile, in blocks
	 * @param renderY camera-relative Y position of the visible rail tile, in blocks
	 * @param renderZ camera-relative Z position of the visible rail tile, in blocks
	 */
	static void renderEntries(EmbeddedHostRenderCache cache, EmbeddedHostRenderState renderState, Tessellator tessellator,
			RenderBlocks renderer, TileTCRail railTile, double renderX, double renderY, double renderZ)
	{
		for (EmbeddedHostFace entry : cache.mesh.getFaces())
		{
			renderState.prepareForQuad();
			EmbeddedHostFaceEmitter.render(tessellator, renderer, railTile, entry, renderX, renderY, renderZ);
		}
	}

	/**
	 * Stores one track's prepared host faces in a tile-local display list without drawing it. The list becomes available
	 * to the normal tile render path on the following frame.
	 *
	 * @param cache cache receiving ownership of the compiled display list
	 * @param railTile visible rail tile used as the world-coordinate origin
	 * @return whether a display list was created successfully
	 */
	static boolean compileDisplayList(EmbeddedHostRenderCache cache, TileTCRail railTile)
	{
		int displayList = GL11.glGenLists(1);
		if (displayList == 0)
		{
			releaseRetiredDisplayList(cache);
			return false;
		}

		EmbeddedHostRenderState renderState = EmbeddedHostRenderState.begin();
		boolean listOpen = false;
		boolean compiled = false;
		try
		{
			Tessellator tessellator = renderState.getTessellator();
			RenderBlocks renderer = new RenderBlocks();
			GL11.glNewList(displayList, GL11.GL_COMPILE);
			listOpen = true;
			renderEntries(cache, renderState, tessellator, renderer, railTile, 0.0D, 0.0D, 0.0D);
			renderState.finish();
			GL11.glEndList();
			listOpen = false;
			cache.displayList = displayList;
			compiled = true;
			releaseRetiredDisplayList(cache);
			return true;
		}
		finally
		{
			if (listOpen)
			{
				GL11.glEndList();
			}
			if (compiled == false)
			{
				GL11.glDeleteLists(displayList, 1);
				releaseRetiredDisplayList(cache);
			}
			renderState.restore();
		}
	}

	/**
	 * Draws a compiled tile-local display list while preserving the caller's render state.
	 *
	 * @param displayList OpenGL display-list handle
	 * @param renderX camera-relative X position of the visible rail tile, in blocks
	 * @param renderY camera-relative Y position of the visible rail tile, in blocks
	 * @param renderZ camera-relative Z position of the visible rail tile, in blocks
	 */
	static void renderDisplayList(int displayList, double renderX, double renderY, double renderZ)
	{
		EmbeddedHostRenderState renderState = EmbeddedHostRenderState.beginDisplayList();
		try
		{
			renderDisplayListWithoutState(displayList, renderX, renderY, renderZ);
		}
		finally
		{
			renderState.restore();
		}
	}

	/**
	 * Draws a compiled list without changing lighting or culling state managed by the outer render pass.
	 *
	 * @param displayList OpenGL display-list handle
	 * @param renderX camera-relative X position of the visible rail tile, in blocks
	 * @param renderY camera-relative Y position of the visible rail tile, in blocks
	 * @param renderZ camera-relative Z position of the visible rail tile, in blocks
	 */
	static void renderDisplayListWithoutState(int displayList, double renderX, double renderY, double renderZ)
	{
		GL11.glPushMatrix();
		try
		{
			GL11.glTranslated(renderX, renderY, renderZ);
			GL11.glCallList(displayList);
		}
		finally
		{
			GL11.glPopMatrix();
		}
	}

	/**
	 * Deletes the OpenGL list owned by one cache and clears its handle.
	 *
	 * @param cache cache to release, or {@code null} when no cache was built
	 */
	static void releaseDisplayList(EmbeddedHostRenderCache cache)
	{
		if (cache == null)
		{
			return;
		}
		if (cache.displayList != 0)
		{
			GL11.glDeleteLists(cache.displayList, 1);
			cache.displayList = 0;
		}
		releaseRetiredDisplayList(cache);
	}

	/**
	 * Keeps the current display list allocated while its replacement is compiled.
	 * A live old identifier prevents OpenGL from immediately handing the same name
	 * back to the refreshed list, which avoids stale driver-side command data.
	 *
	 * @param cache cache whose active display list is awaiting replacement
	 */
	static void stageDisplayListForReplacement(EmbeddedHostRenderCache cache)
	{
		if (cache == null || cache.displayList == 0)
		{
			return;
		}
		releaseRetiredDisplayList(cache);
		cache.retiredDisplayList = cache.displayList;
		cache.displayList = 0;
	}

	/**
	 * Deletes the superseded display list retained during an in-place lighting refresh.
	 *
	 * @param cache cache owning the retired display list, or {@code null}
	 */
	static void releaseRetiredDisplayList(EmbeddedHostRenderCache cache)
	{
		if (cache == null || cache.retiredDisplayList == 0)
		{
			return;
		}
		GL11.glDeleteLists(cache.retiredDisplayList, 1);
		cache.retiredDisplayList = 0;
	}

	/**
	 * Returns the switch-state discriminator baked into cached host geometry. Model-derived terrain profiles combine both
	 * switch routes and therefore use one stable discriminator; other switch geometry follows the tile's current state.
	 *
	 * @param railTile visible rail tile whose terrain geometry is cached
	 * @return cache discriminator for geometry affected by switch state
	 */
	static boolean getHostTerrainSwitchState(TileTCRail railTile)
	{
		if (getModelTerrainProfile(railTile) != null)
		{
			return true;
		}
		return railTile.getSwitchState();
	}

	/**
	 * Skips only distant meshes whose complete bounding sphere lies safely behind the camera.
	 *
	 * @param railTile visible rail tile used to place the tile-local bounds in the world
	 * @param cache cache containing the host mesh bounds
	 * @return whether the complete host mesh can be skipped for this view
	 */
	static boolean shouldCullByViewAngle(TileTCRail railTile, EmbeddedHostRenderCache cache)
	{
		// Keep nearby embedded rails visible from any angle; distance-scaled backface culling only helps on long spans.
		Entity viewer = Minecraft.getMinecraft().renderViewEntity;
		if (viewer == null || cache.mesh.getHostCount() <= 0)
		{
			return false;
		}

		double centerX = railTile.xCoord + cache.mesh.getCenterX();
		double centerY = railTile.yCoord + cache.mesh.getCenterY();
		double centerZ = railTile.zCoord + cache.mesh.getCenterZ();
		double viewerOffsetX = centerX - viewer.posX;
		double viewerOffsetY = centerY - (viewer.posY + viewer.getEyeHeight());
		double viewerOffsetZ = centerZ - viewer.posZ;
		double distanceSquared = viewerOffsetX * viewerOffsetX
				+ viewerOffsetY * viewerOffsetY + viewerOffsetZ * viewerOffsetZ;
		double closeDistance = getViewCullCloseDistance() + cache.mesh.getRadius() * VIEW_CULL_RADIUS_MULTIPLIER;
		if (distanceSquared <= closeDistance * closeDistance)
		{
			return false;
		}

		double distance = Math.sqrt(distanceSquared);
		if (distance <= GEOMETRY_EPSILON)
		{
			return false;
		}

		double yaw = Math.toRadians(-viewer.rotationYaw - 90.0F);
		double pitch = Math.toRadians(-viewer.rotationPitch);
		double pitchCos = Math.cos(pitch);
		double lookX = Math.cos(yaw) * pitchCos;
		double lookY = Math.sin(pitch);
		double lookZ = Math.sin(yaw) * pitchCos;
		double viewDotProduct = (viewerOffsetX * lookX + viewerOffsetY * lookY + viewerOffsetZ * lookZ) / distance;
		return viewDotProduct < VIEW_CULL_DOT_THRESHOLD;
	}

	/**
	 * Returns the distance inside which host meshes are never rejected by view direction.
	 *
	 * @return close-distance threshold in blocks
	 */
	static double getViewCullCloseDistance()
	{
		Minecraft minecraft = Minecraft.getMinecraft();
		if (minecraft == null || minecraft.gameSettings == null)
		{
			return VIEW_CULL_MIN_CLOSE_DISTANCE;
		}
		return Math.max(VIEW_CULL_MIN_CLOSE_DISTANCE, minecraft.gameSettings.renderDistanceChunks * 16.0D * VIEW_CULL_RENDER_DISTANCE_FACTOR);
	}

	/**
	 * One weakly owned request for deferred display-list compilation.
	 * Distance is captured when queued so sorting performs no later world or camera queries.
	 */
	static final class DisplayListCompileRequest
	{
		private final WeakReference<TileTCRail> railTile;
		private final EmbeddedHostRenderCache cache;
		private final double distanceSquared;

		/**
		 * Records one visible mesh awaiting deferred display-list compilation.
		 *
		 * @param railTile visible rail tile owning the prepared mesh
		 * @param cache prepared mesh cache awaiting compilation
		 * @param distanceSquared squared camera distance used for nearest-first ordering
		 */
		private DisplayListCompileRequest(TileTCRail railTile, EmbeddedHostRenderCache cache, double distanceSquared)
		{
			this.railTile = new WeakReference<TileTCRail>(railTile);
			this.cache = cache;
			this.distanceSquared = distanceSquared;
		}
	}

	/**
	 * Identity-based weak tile key used by the controller cache.
	 * The hash is captured while the tile is live; cleared keys compare unequal and are removed through the reference
	 * queue rather than by value equality.
	 */
	static final class WeakTileKey extends WeakReference<TileTCRail>
	{
		private final int identityHash;

		/**
		 * Creates an identity-based weak key and registers it for graphics-resource cleanup.
		 *
		 * @param tile rail tile identified by object identity
		 * @param queue cleanup queue, or {@code null} for a temporary lookup key
		 */
		private WeakTileKey(TileTCRail tile, ReferenceQueue<TileTCRail> queue)
		{
			super(tile, queue);
			identityHash = System.identityHashCode(tile);
		}

		/**
		 * Returns the stable identity hash captured before the weak reference can clear.
		 *
		 * @return identity hash of the referenced rail tile
		 */
		@Override
		public int hashCode()
		{
			return identityHash;
		}

		/**
		 * Compares live weak keys by the exact rail tile object they reference.
		 *
		 * @param candidate object being compared with this key
		 * @return whether both live keys reference the same rail tile object
		 */
		@Override
		public boolean equals(Object candidate)
		{
			if (this == candidate)
			{
				return true;
			}
			if ((candidate instanceof WeakTileKey) == false)
			{
				return false;
			}
			TileTCRail tile = get();
			return tile != null && tile == ((WeakTileKey)candidate).get();
		}
	}

}

