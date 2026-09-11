package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IWorldAccess;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Tracks client render invalidations in four-by-four-block horizontal regions so cached embedded surfaces update with
 * ordinary chunk geometry. These callbacks include vanilla light propagation and unrelated visual updates, so the
 * tracker intentionally treats them as conservative lighting-refresh signals. Small regions prevent one update from
 * rebinding every embedded mesh in its chunk while keeping event recording constant-time per invalidated block.
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostLightUpdateTracker
{
	/** Converts block coordinates into four-by-four-block light-region coordinates. */
	private static final int LIGHT_REGION_SHIFT = 2;
	/** Bounds historical region bookkeeping while off-screen caches retain throttled exact-value validation. */
	private static final int MAX_TRACKED_REGIONS = 16384;
	/** Coalesces regions commonly touched repeatedly during one synchronous client render-invalidation pass. */
	private static final int RECENT_REGION_CAPACITY = 256;
	private static final Map<Long, Long> REGION_VERSIONS = new HashMap<Long, Long>();
	private static final long[] RECENT_REGION_KEYS = new long[RECENT_REGION_CAPACITY];
	private static World attachedWorld;
	private static Listener listener;
	private static long currentVersion;
	private static long recentRegionTick = Long.MIN_VALUE;

	/** Creates no instances; one listener follows the active client world. */
	private EmbeddedHostLightUpdateTracker()
	{
	}

	/**
	 * Attaches the tracker to the supplied world when necessary and returns the latest tracked render-invalidation version.
	 *
	 * @param world active client world, or {@code null} when no world is loaded
	 * @return monotonically increasing version of received client render invalidations
	 */
	public static long getCurrentVersion(World world)
	{
		ensureAttached(world);
		return currentVersion;
	}

	/**
	 * Returns whether a tracked client render invalidation newer than the cache occurred in any small region sampled by
	 * its lighting snapshot.
	 *
	 * @param world active client world that owns the snapshot
	 * @param snapshot cached lighting sample locations to compare
	 * @param previousVersion latest tracker version already consumed by the render cache
	 * @return whether the cache must immediately rebind its lighting
	 */
	public static boolean hasRelevantUpdate(World world, EmbeddedHostLighting.Snapshot snapshot, long previousVersion)
	{
		ensureAttached(world);
		if (snapshot == null || previousVersion == currentVersion)
		{
			return false;
		}
		return snapshot.hasNewerRegionVersion(REGION_VERSIONS, previousVersion);
	}

	/**
	 * Detaches the listener and discards all versions when renderer caches reset or the active client world changes.
	 */
	public static void clear()
	{
		if (attachedWorld != null && listener != null)
		{
			attachedWorld.removeWorldAccess(listener);
		}
		attachedWorld = null;
		listener = null;
		currentVersion = 0L;
		recentRegionTick = Long.MIN_VALUE;
		Arrays.fill(RECENT_REGION_KEYS, Long.MIN_VALUE);
		REGION_VERSIONS.clear();
	}

	/**
	 * Packs signed four-block light-region coordinates into one stable key without allocating a coordinate object.
	 *
	 * @param regionX horizontal light-region X coordinate
	 * @param regionZ horizontal light-region Z coordinate
	 * @return packed light-region coordinate key
	 */
	public static long packRegionKey(int regionX, int regionZ)
	{
		return ((long)regionX << 32) ^ (regionZ & 0xFFFFFFFFL);
	}

	/**
	 * Converts one block coordinate directly into its four-by-four-block horizontal tracked-region key.
	 *
	 * @param blockX lighting sample or render-invalidation block X coordinate
	 * @param blockZ lighting sample or render-invalidation block Z coordinate
	 * @return packed key for the containing tracked region
	 */
	public static long packBlockRegionKey(int blockX, int blockZ)
	{
		return packRegionKey(blockX >> LIGHT_REGION_SHIFT, blockZ >> LIGHT_REGION_SHIFT);
	}

	/**
	 * Checks whether any region sampled by a lighting snapshot has a recorded client render invalidation newer than the
	 * owning render cache.
	 *
	 * @param sampleRegionKeys packed regions used by one lighting snapshot
	 * @param regionVersions latest client render-invalidation version recorded for each tracked region
	 * @param previousVersion latest tracker version already consumed by the render cache
	 * @return whether at least one sampled region was invalidated after {@code previousVersion}
	 */
	public static boolean containsNewerRegionVersion(long[] sampleRegionKeys, Map<Long, Long> regionVersions,
			long previousVersion)
	{
		for (long regionKey : sampleRegionKeys)
		{
			Long regionVersion = regionVersions.get(Long.valueOf(regionKey));
			if (regionVersion != null && regionVersion.longValue() > previousVersion)
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * Replaces the world listener when the active client world changes and resets versions owned by the previous world.
	 *
	 * @param world active client world, or {@code null} when no world is loaded
	 */
	private static void ensureAttached(World world)
	{
		if (attachedWorld == world)
		{
			return;
		}
		clear();
		if (world != null)
		{
			attachedWorld = world;
			listener = new Listener();
			world.addWorldAccess(listener);
		}
	}

	/**
	 * Records the four-block horizontal region containing one client render invalidation.
	 *
	 * @param blockX invalidated block X coordinate
	 * @param blockZ invalidated block Z coordinate
	 */
	private static void recordBlockUpdate(int blockX, int blockZ)
	{
		recordRegionUpdate(packBlockRegionKey(blockX, blockZ));
	}

	/**
	 * Records one affected render region and bounds historical bookkeeping before inserting a previously unseen region.
	 * Repeated callbacks in the same region and world tick are coalesced before any map lookup or allocation.
	 *
	 * @param regionX affected four-block region X coordinate
	 * @param regionZ affected four-block region Z coordinate
	 */
	private static void recordRegionUpdate(int regionX, int regionZ)
	{
		recordRegionUpdate(packRegionKey(regionX, regionZ));
	}

	/**
	 * Records one packed render region, using a fixed direct-mapped table to discard repeated callbacks during the same
	 * world tick without allocating or linearly scanning the regions already seen that tick.
	 *
	 * @param regionKey packed four-block render-region coordinate
	 */
	private static void recordRegionUpdate(long regionKey)
	{
		long worldTick = attachedWorld != null ? attachedWorld.getTotalWorldTime() : Long.MIN_VALUE;
		if (worldTick != recentRegionTick)
		{
			recentRegionTick = worldTick;
			Arrays.fill(RECENT_REGION_KEYS, Long.MIN_VALUE);
		}
		int recentHash = 31 * (int)(regionKey >>> 32) + (int)regionKey;
		recentHash ^= recentHash >>> 16;
		int recentIndex = recentHash & (RECENT_REGION_KEYS.length - 1);
		if (RECENT_REGION_KEYS[recentIndex] == regionKey)
		{
			return;
		}
		RECENT_REGION_KEYS[recentIndex] = regionKey;
		if (REGION_VERSIONS.size() >= MAX_TRACKED_REGIONS
				&& REGION_VERSIONS.containsKey(Long.valueOf(regionKey)) == false)
		{
			REGION_VERSIONS.clear();
		}
		currentVersion++;
		REGION_VERSIONS.put(Long.valueOf(regionKey), Long.valueOf(currentVersion));
	}

	/** Receives vanilla world-access notifications; only the render-invalidation callbacks update tracked regions. */
	private static final class Listener implements IWorldAccess
	{
		/**
		 * Ignores the general block-update callback because the tracker consumes the more targeted render-invalidation
		 * callbacks, including those emitted by light propagation.
		 *
		 * @param x updated block X coordinate
		 * @param y updated block Y coordinate
		 * @param z updated block Z coordinate
		 */
		@Override
		public void markBlockForUpdate(int x, int y, int z)
		{
		}

		/**
		 * Records the small horizontal region containing one client render invalidation. Vanilla lighting is one producer,
		 * but non-light visual changes use the same callback.
		 *
		 * @param x invalidated block X coordinate
		 * @param y invalidated block Y coordinate
		 * @param z invalidated block Z coordinate
		 */
		@Override
		public void markBlockForRenderUpdate(int x, int y, int z)
		{
			recordBlockUpdate(x, z);
		}

		/**
		 * Records every four-block horizontal region touched by a client range-render invalidation, including skylight and
		 * non-light visual updates.
		 *
		 * @param minX inclusive minimum block X coordinate
		 * @param minY inclusive minimum block Y coordinate
		 * @param minZ inclusive minimum block Z coordinate
		 * @param maxX inclusive maximum block X coordinate
		 * @param maxY inclusive maximum block Y coordinate
		 * @param maxZ inclusive maximum block Z coordinate
		 */
		@Override
		public void markBlockRangeForRenderUpdate(int minX, int minY, int minZ, int maxX, int maxY, int maxZ)
		{
			int minRegionX = Math.min(minX, maxX) >> LIGHT_REGION_SHIFT;
			int maxRegionX = Math.max(minX, maxX) >> LIGHT_REGION_SHIFT;
			int minRegionZ = Math.min(minZ, maxZ) >> LIGHT_REGION_SHIFT;
			int maxRegionZ = Math.max(minZ, maxZ) >> LIGHT_REGION_SHIFT;
			for (int regionX = minRegionX; regionX <= maxRegionX; regionX++)
			{
				for (int regionZ = minRegionZ; regionZ <= maxRegionZ; regionZ++)
				{
					recordRegionUpdate(regionX, regionZ);
				}
			}
		}

		/**
		 * Ignores world sounds.
		 *
		 * @param name sound resource name
		 * @param x sound X coordinate
		 * @param y sound Y coordinate
		 * @param z sound Z coordinate
		 * @param volume sound volume
		 * @param pitch sound pitch
		 */
		@Override
		public void playSound(String name, double x, double y, double z, float volume, float pitch)
		{
		}

		/**
		 * Ignores player-excluded world sounds.
		 *
		 * @param excludedPlayer player excluded from hearing the sound
		 * @param name sound resource name
		 * @param x sound X coordinate
		 * @param y sound Y coordinate
		 * @param z sound Z coordinate
		 * @param volume sound volume
		 * @param pitch sound pitch
		 */
		@Override
		public void playSoundToNearExcept(EntityPlayer excludedPlayer, String name, double x, double y, double z,
				float volume, float pitch)
		{
		}

		/**
		 * Ignores particle creation.
		 *
		 * @param name particle resource name
		 * @param x particle X coordinate
		 * @param y particle Y coordinate
		 * @param z particle Z coordinate
		 * @param velocityX particle X velocity
		 * @param velocityY particle Y velocity
		 * @param velocityZ particle Z velocity
		 */
		@Override
		public void spawnParticle(String name, double x, double y, double z, double velocityX, double velocityY,
				double velocityZ)
		{
		}

		/**
		 * Ignores entity creation.
		 *
		 * @param entity created entity
		 */
		@Override
		public void onEntityCreate(Entity entity)
		{
		}

		/**
		 * Ignores entity removal.
		 *
		 * @param entity removed entity
		 */
		@Override
		public void onEntityDestroy(Entity entity)
		{
		}

		/**
		 * Ignores record playback.
		 *
		 * @param name record resource name
		 * @param x record block X coordinate
		 * @param y record block Y coordinate
		 * @param z record block Z coordinate
		 */
		@Override
		public void playRecord(String name, int x, int y, int z)
		{
		}

		/**
		 * Ignores broadcast sounds.
		 *
		 * @param soundId broadcast sound identifier
		 * @param x sound block X coordinate
		 * @param y sound block Y coordinate
		 * @param z sound block Z coordinate
		 * @param data broadcast sound data
		 */
		@Override
		public void broadcastSound(int soundId, int x, int y, int z, int data)
		{
		}

		/**
		 * Ignores auxiliary world effects.
		 *
		 * @param player player associated with the effect
		 * @param effectId auxiliary effect identifier
		 * @param x effect block X coordinate
		 * @param y effect block Y coordinate
		 * @param z effect block Z coordinate
		 * @param data auxiliary effect data
		 */
		@Override
		public void playAuxSFX(EntityPlayer player, int effectId, int x, int y, int z, int data)
		{
		}

		/**
		 * Ignores partial block-destruction rendering.
		 *
		 * @param breakerId entity identifier performing the block damage
		 * @param x damaged block X coordinate
		 * @param y damaged block Y coordinate
		 * @param z damaged block Z coordinate
		 * @param progress partial-destruction progress
		 */
		@Override
		public void destroyBlockPartially(int breakerId, int x, int y, int z, int progress)
		{
		}

		/** Ignores static-entity renderer changes. */
		@Override
		public void onStaticEntitiesChanged()
		{
		}
	}
}
