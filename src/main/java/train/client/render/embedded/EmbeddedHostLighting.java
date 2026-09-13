package train.client.render.embedded;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.world.World;

import java.util.Map;
import java.util.HashSet;
import java.util.Set;

/**
 * Resolves and tracks the Minecraft lighting and ambient-occlusion inputs used by embedded host faces.
 *
	 * <p>Geometry caches store lighting with their faces so the steady render loop performs no world-light lookups. A
	 * lightweight world listener records small regions touched by generic client render invalidations; render caches use
	 * those events as conservative lighting-refresh signals. While rendered, each snapshot also checks its exact light and
	 * block-appearance values at most twice per second for changes not accompanied by a tracked render invalidation.</p>
 */
@SideOnly(Side.CLIENT)
public final class EmbeddedHostLighting
{
	private static final int PACKED_LIGHT_CHANNEL_MASK = 255;
	private static final int PACKED_SKY_LIGHT_SHIFT = 16;
	private static final int AMBIENT_OCCLUSION_SAMPLE_SHIFT = 2;
	private static final int VANILLA_LIGHTMAP_LANE_MASK = 0xFF00FF;
	private static final int PACKED_HORIZONTAL_COORDINATE_BITS = 26;
	private static final int PACKED_HEIGHT_BITS = 12;
	private static final int PACKED_Z_SHIFT = PACKED_HEIGHT_BITS;
	private static final int PACKED_X_SHIFT = PACKED_HORIZONTAL_COORDINATE_BITS + PACKED_HEIGHT_BITS;
	private static final long PACKED_HORIZONTAL_COORDINATE_MASK =
			(1L << PACKED_HORIZONTAL_COORDINATE_BITS) - 1L;
	private static final long PACKED_HEIGHT_MASK = (1L << PACKED_HEIGHT_BITS) - 1L;
	private static final long VALIDATION_INTERVAL_TICKS = 10L;
	/** Creates no instances; embedded-host lighting helpers are static. */
	private EmbeddedHostLighting()
	{
	}

	/**
	 * Attaches the lightweight render-invalidation listener to the current client world and returns its latest version.
	 * These generic client callbacks are consumed as conservative lighting-refresh signals.
	 *
	 * @param world current client world that owns the embedded-host renderer
	 * @return monotonically increasing client render-invalidation version for that world
	 */
	public static long getClientLightUpdateVersion(World world)
	{
		return EmbeddedHostLightUpdateTracker.getCurrentVersion(world);
	}

	/**
	 * Returns whether a client render invalidation occurred after the cache last rendered in a four-by-four-block region
	 * sampled by the supplied lighting snapshot. Such invalidations include light propagation and non-light visual updates.
	 *
	 * @param world current client world that emitted render invalidations
	 * @param snapshot cached light and block-appearance sample locations
	 * @param previousVersion client render-invalidation version already consumed by the owning render cache
	 * @return whether the snapshot must immediately rebind its placement-specific lighting
	 */
	public static boolean hasRelevantClientLightUpdate(World world, Snapshot snapshot, long previousVersion)
	{
		return EmbeddedHostLightUpdateTracker.hasRelevantUpdate(world, snapshot, previousVersion);
	}

	/**
	 * Detaches and clears the client render-invalidation listener when embedded renderer caches reset or worlds change.
	 */
	public static void clearClientLightUpdateTracker()
	{
		EmbeddedHostLightUpdateTracker.clear();
	}

	/**
	 * Bilinearly interpolates the independent sky-light and block-light channels across a face.
	 *
	 * @param lowerLeft packed lower-left light
	 * @param lowerRight packed lower-right light
	 * @param upperLeft packed upper-left light
	 * @param upperRight packed upper-right light
	 * @param horizontalFraction horizontal interpolation fraction from zero to one
	 * @param verticalFraction vertical interpolation fraction from zero to one
	 * @return interpolated packed light
	 */
	public static int interpolatePackedBrightness(int lowerLeft, int lowerRight, int upperLeft, int upperRight,
			double horizontalFraction, double verticalFraction)
	{
		double lowerWeight = 1.0D - verticalFraction;
		double leftWeight = 1.0D - horizontalFraction;
		double lowerLeftWeight = leftWeight * lowerWeight;
		double lowerRightWeight = horizontalFraction * lowerWeight;
		double upperLeftWeight = leftWeight * verticalFraction;
		double upperRightWeight = horizontalFraction * verticalFraction;
		int sky = (int)(((lowerLeft >>> PACKED_SKY_LIGHT_SHIFT) & PACKED_LIGHT_CHANNEL_MASK) * lowerLeftWeight
				+ ((lowerRight >>> PACKED_SKY_LIGHT_SHIFT) & PACKED_LIGHT_CHANNEL_MASK) * lowerRightWeight
				+ ((upperLeft >>> PACKED_SKY_LIGHT_SHIFT) & PACKED_LIGHT_CHANNEL_MASK) * upperLeftWeight
				+ ((upperRight >>> PACKED_SKY_LIGHT_SHIFT) & PACKED_LIGHT_CHANNEL_MASK) * upperRightWeight)
				& PACKED_LIGHT_CHANNEL_MASK;
		int block = (int)((lowerLeft & PACKED_LIGHT_CHANNEL_MASK) * lowerLeftWeight
				+ (lowerRight & PACKED_LIGHT_CHANNEL_MASK) * lowerRightWeight
				+ (upperLeft & PACKED_LIGHT_CHANNEL_MASK) * upperLeftWeight
				+ (upperRight & PACKED_LIGHT_CHANNEL_MASK) * upperRightWeight) & PACKED_LIGHT_CHANNEL_MASK;
		return (sky << PACKED_SKY_LIGHT_SHIFT) | block;
	}

	/**
	 * Bilinearly interpolates four vanilla ambient-occlusion color multipliers.
	 *
	 * @param lowerLeft lower-left ambient-occlusion multiplier
	 * @param lowerRight lower-right ambient-occlusion multiplier
	 * @param upperLeft upper-left ambient-occlusion multiplier
	 * @param upperRight upper-right ambient-occlusion multiplier
	 * @param horizontalFraction horizontal interpolation fraction from zero to one
	 * @param verticalFraction vertical interpolation fraction from zero to one
	 * @return interpolated ambient-occlusion multiplier
	 */
	public static float interpolateAmbientOcclusion(float lowerLeft, float lowerRight,
			float upperLeft, float upperRight, double horizontalFraction, double verticalFraction)
	{
		double lowerWeight = 1.0D - verticalFraction;
		double leftWeight = 1.0D - horizontalFraction;
		return (float)(lowerLeft * leftWeight * lowerWeight
				+ lowerRight * horizontalFraction * lowerWeight
				+ upperLeft * leftWeight * verticalFraction
				+ upperRight * horizontalFraction * verticalFraction);
	}

	/**
	 * Averages the four block ambient-light values contributing to one vanilla-style face corner.
	 *
	 * @param first first neighboring ambient-light value
	 * @param second second neighboring ambient-light value
	 * @param third third neighboring ambient-light value
	 * @param base ambient-light value at the corner's base coordinate
	 * @return arithmetic mean of the four ambient-light values
	 */
	public static float getAmbientOcclusion(float first, float second, float third, float base)
	{
		return (first + second + third + base) * 0.25F;
	}

	/**
	 * Implements vanilla's corner rule for choosing a true diagonal instead of a cardinal substitute.
	 *
	 * @param firstCanBlockGrass first cardinal neighbor's Minecraft grass-blocking flag
	 * @param secondCanBlockGrass second cardinal neighbor's Minecraft grass-blocking flag
	 * @return whether the diagonal sample is visible and should be used
	 */
	public static boolean usesDiagonalCornerSample(boolean firstCanBlockGrass, boolean secondCanBlockGrass)
	{
		return firstCanBlockGrass || secondCanBlockGrass;
	}

	/**
	 * Reads packed light at one world block coordinate and records it for reuse and invalidation.
	 *
	 * @param world client world supplying light values
	 * @param sampleX sampled world block X coordinate
	 * @param sampleY sampled world block Y coordinate
	 * @param sampleZ sampled world block Z coordinate
	 * @param brightnessCache current cache-build map receiving the sample
	 * @return packed sky-light and block-light value
	 */
	public static int getBrightness(World world, int sampleX, int sampleY, int sampleZ,
			Map<Long, Integer> brightnessCache)
	{
		long packedPosition = getPositionKey(sampleX, sampleY, sampleZ);
		Integer cached = brightnessCache.get(Long.valueOf(packedPosition));
		if (cached != null)
		{
			return cached.intValue();
		}

		int brightness = readBrightness(world, sampleX, sampleY, sampleZ);
		brightnessCache.put(Long.valueOf(packedPosition), Integer.valueOf(brightness));
		return brightness;
	}

	/**
	 * Reads packed light with the sampled block's own emitted-light value as vanilla's minimum.
	 * This matters when the sample coordinate is a newly placed torch or another light-emitting block:
	 * its propagated world light may not be available yet, but the source itself must never read as dark.
	 *
	 * @param world client world supplying the sampled block and lightmap
	 * @param sampleX sampled world block X coordinate
	 * @param sampleY sampled world block Y coordinate
	 * @param sampleZ sampled world block Z coordinate
	 * @return packed sky-light and block-light value
	 */
	private static int readBrightness(World world, int sampleX, int sampleY, int sampleZ)
	{
		Block block = world.getBlock(sampleX, sampleY, sampleZ);
		return world.getLightBrightnessForSkyBlocks(sampleX, sampleY, sampleZ,
				block.getLightValue(world, sampleX, sampleY, sampleZ));
	}

	/**
	 * Averages four packed-light samples using the same channel separation as vanilla ambient occlusion.
	 *
	 * @param first first neighboring packed-light sample
	 * @param second second neighboring packed-light sample
	 * @param third third neighboring packed-light sample
	 * @param base packed-light sample at the corner's base coordinate
	 * @return averaged packed light
	 */
	public static int getAmbientOcclusionBrightness(int first, int second, int third, int base)
	{
		if (first == 0)
		{
			first = base;
		}
		if (second == 0)
		{
			second = base;
		}
		if (third == 0)
		{
			third = base;
		}
		return ((first + second + third + base) >> AMBIENT_OCCLUSION_SAMPLE_SHIFT)
				& VANILLA_LIGHTMAP_LANE_MASK;
	}

	/**
	 * Reads and records one block's ambient-light value for later cache invalidation.
	 *
	 * @param world client world supplying the sampled block
	 * @param sampleX sampled world block X coordinate
	 * @param sampleY sampled world block Y coordinate
	 * @param sampleZ sampled world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return sampled block ambient-light value
	 */
	public static float getAmbientOcclusion(World world, int sampleX, int sampleY, int sampleZ,
			Map<Long, Integer> appearanceCache)
	{
		return recordAppearance(world, sampleX, sampleY, sampleZ, appearanceCache)
				.getAmbientOcclusionLightValue();
	}

	/**
	 * Reads and records one block's vanilla AO corner-selection flag for later cache invalidation.
	 *
	 * @param world client world supplying the sampled block
	 * @param sampleX sampled world block X coordinate
	 * @param sampleY sampled world block Y coordinate
	 * @param sampleZ sampled world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return sampled block grass-blocking flag
	 */
	public static boolean getCanBlockGrass(World world, int sampleX, int sampleY, int sampleZ,
			Map<Long, Integer> appearanceCache)
	{
		return recordAppearance(world, sampleX, sampleY, sampleZ, appearanceCache).getCanBlockGrass();
	}

	/**
	 * Records the block properties that affect cached ambient-occlusion values and corner selection.
	 *
	 * @param world client world supplying the sampled block
	 * @param sampleX sampled world block X coordinate
	 * @param sampleY sampled world block Y coordinate
	 * @param sampleZ sampled world block Z coordinate
	 * @param appearanceCache sampled positions and their block-appearance signatures
	 * @return sampled block
	 */
	private static Block recordAppearance(World world, int sampleX, int sampleY, int sampleZ,
			Map<Long, Integer> appearanceCache)
	{
		Block block = world.getBlock(sampleX, sampleY, sampleZ);
		Long positionKey = Long.valueOf(getPositionKey(sampleX, sampleY, sampleZ));
		int signature = getAppearanceSignature(block);
		Integer recordedSignature = appearanceCache.get(positionKey);
		if (recordedSignature == null || recordedSignature.intValue() != signature)
		{
			appearanceCache.put(positionKey, Integer.valueOf(signature));
		}
		return block;
	}

	/**
	 * Builds a stable signature from only the sampled block properties used by ambient occlusion.
	 * Block identity and metadata are deliberately excluded: swapping air and a torch changes neither
	 * AO input, and packed-light validation handles the torch's actual lighting effect after propagation.
	 *
	 * @param block sampled block
	 * @return combined ambient-light and corner-flag signature
	 */
	private static int getAppearanceSignature(Block block)
	{
		return 31 * Float.floatToIntBits(block.getAmbientOcclusionLightValue())
				+ (block.getCanBlockGrass() ? 1 : 0);
	}

	/**
	 * Captures every sampled world position so a cached mesh can later detect lighting changes.
	 *
	 * @param brightnessSamples sampled position keys and packed-light values from one cache build
	 * @param appearanceSamples sampled position keys and block-appearance signatures from one cache build
	 * @param world client world supplying the capture tick, or {@code null}
	 * @return owned lighting snapshot
	 */
	public static Snapshot capture(Map<Long, Integer> brightnessSamples,
			Map<Long, Integer> appearanceSamples, World world)
	{
		long[] samplePositions = new long[brightnessSamples.size()];
		int[] sampleValues = new int[brightnessSamples.size()];
		int sampleIndex = 0;
		for (Map.Entry<Long, Integer> sample : brightnessSamples.entrySet())
		{
			long packedPosition = sample.getKey().longValue();
			int sampleX = unpackSignedCoordinate(packedPosition, PACKED_X_SHIFT,
					PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
			int sampleY = unpackSignedCoordinate(packedPosition, 0, PACKED_HEIGHT_BITS, PACKED_HEIGHT_MASK);
			int sampleZ = unpackSignedCoordinate(packedPosition, PACKED_Z_SHIFT,
					PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
			samplePositions[sampleIndex] = packedPosition;
			sampleValues[sampleIndex] = world != null
					? readBrightness(world, sampleX, sampleY, sampleZ) : sample.getValue().intValue();
			sampleIndex++;
		}
		long[] appearancePositions = new long[appearanceSamples.size()];
		int[] appearanceValues = new int[appearanceSamples.size()];
		sampleIndex = 0;
		for (Map.Entry<Long, Integer> sample : appearanceSamples.entrySet())
		{
			appearancePositions[sampleIndex] = sample.getKey().longValue();
			appearanceValues[sampleIndex] = sample.getValue().intValue();
			sampleIndex++;
		}
		long worldTick = world != null ? world.getTotalWorldTime() : 0L;
		return new Snapshot(samplePositions, sampleValues,
				appearancePositions, appearanceValues, worldTick);
	}

	/**
	 * Packs signed Minecraft world coordinates into the same compact layout used by block positions.
	 *
	 * @param worldX signed world block X coordinate
	 * @param worldY signed world block Y coordinate
	 * @param worldZ signed world block Z coordinate
	 * @return packed allocation-free position key
	 */
	public static long getPositionKey(int worldX, int worldY, int worldZ)
	{
		return (((long)worldX & PACKED_HORIZONTAL_COORDINATE_MASK) << PACKED_X_SHIFT)
				| (((long)worldZ & PACKED_HORIZONTAL_COORDINATE_MASK) << PACKED_Z_SHIFT)
				| ((long)worldY & PACKED_HEIGHT_MASK);
	}

	/**
	 * Returns a snapshot with no sampled positions for a newly created render cache.
	 *
	 * @return empty lighting snapshot
	 */
	public static Snapshot emptySnapshot()
	{
		return new Snapshot(new long[0], new int[0], new long[0], new int[0], 0L);
	}

	/**
	 * Restores one signed coordinate from a masked section of a packed position.
	 *
	 * @param packedPosition complete packed world position
	 * @param shift bit offset of the requested coordinate
	 * @param bitCount number of bits allocated to the coordinate
	 * @param mask unshifted mask covering the coordinate bits
	 * @return restored signed coordinate
	 */
	private static int unpackSignedCoordinate(long packedPosition, int shift, int bitCount, long mask)
	{
		long value = (packedPosition >>> shift) & mask;
		long signBit = 1L << (bitCount - 1);
		return (int)((value & signBit) == 0L ? value : value - (1L << bitCount));
	}

	/**
	 * Owns an immutable set of sampled positions and values plus mutable validation timing.
	 * The render cache discards the whole snapshot when any sampled value changes.
	 */
	public static final class Snapshot
	{
		private final long[] samplePositions;
		private final int[] sampleValues;
		private final long[] appearancePositions;
		private final int[] appearanceValues;
		private final long[] sampleRegionKeys;
		private long nextValidationTick;
		private long previousValidationTick;

		/**
		 * Stores owned sample arrays and the world tick at which their values were read.
		 *
		 * @param samplePositions packed sampled world positions
		 * @param sampleValues packed-light values matching {@code samplePositions}
		 * @param appearancePositions packed AO block-sample positions
		 * @param appearanceValues block-appearance signatures matching {@code appearancePositions}
		 * @param capturedWorldTick world tick at which the samples were captured
		 */
		private Snapshot(long[] samplePositions, int[] sampleValues,
				long[] appearancePositions, int[] appearanceValues, long capturedWorldTick)
		{
			this.samplePositions = samplePositions;
			this.sampleValues = sampleValues;
			this.appearancePositions = appearancePositions;
			this.appearanceValues = appearanceValues;
			this.sampleRegionKeys = collectSampleRegionKeys(samplePositions, appearancePositions);
			this.previousValidationTick = capturedWorldTick;
			this.nextValidationTick = capturedWorldTick + VALIDATION_INTERVAL_TICKS;
		}

		/**
		 * Checks the unique four-by-four-block horizontal regions containing this snapshot's lighting inputs against the
		 * latest event-driven region versions without exposing or copying its internal packed-key array.
		 *
		 * @param regionVersions latest client render-invalidation version recorded for each tracked region
		 * @param previousVersion latest tracker version already consumed by the render cache
		 * @return whether at least one sampled region changed after {@code previousVersion}
		 */
		public boolean hasNewerRegionVersion(Map<Long, Long> regionVersions, long previousVersion)
		{
			return EmbeddedHostLightUpdateTracker.containsNewerRegionVersion(sampleRegionKeys, regionVersions,
					previousVersion);
		}

		/**
		 * Polls recorded packed-light and block-appearance samples at most twice per second for changes not accompanied by
		 * a tracked client render invalidation.
		 *
		 * @param world current client world, or {@code null} when no validation is possible
		 * @return {@code true} when cached lighting, ambient occlusion, and any display list must be refreshed
		 */
		public boolean hasChanged(World world)
		{
			if (world == null || (samplePositions.length == 0 && appearancePositions.length == 0))
			{
				return false;
			}
			long worldTick = world.getTotalWorldTime();
			if (worldTick >= previousValidationTick && worldTick < nextValidationTick)
			{
				return false;
			}
			previousValidationTick = worldTick;
			nextValidationTick = worldTick + VALIDATION_INTERVAL_TICKS;
			for (int sampleIndex = 0; sampleIndex < samplePositions.length; sampleIndex++)
			{
				long packedPosition = samplePositions[sampleIndex];
				int sampleX = unpackSignedCoordinate(packedPosition, PACKED_X_SHIFT,
						PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
				int sampleY = unpackSignedCoordinate(packedPosition, 0, PACKED_HEIGHT_BITS, PACKED_HEIGHT_MASK);
				int sampleZ = unpackSignedCoordinate(packedPosition, PACKED_Z_SHIFT,
						PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
				int currentBrightness = readBrightness(world, sampleX, sampleY, sampleZ);
				if (currentBrightness != sampleValues[sampleIndex])
				{
					return true;
				}
			}
			for (int sampleIndex = 0; sampleIndex < appearancePositions.length; sampleIndex++)
			{
				long packedPosition = appearancePositions[sampleIndex];
				int sampleX = unpackSignedCoordinate(packedPosition, PACKED_X_SHIFT,
						PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
				int sampleY = unpackSignedCoordinate(packedPosition, 0, PACKED_HEIGHT_BITS, PACKED_HEIGHT_MASK);
				int sampleZ = unpackSignedCoordinate(packedPosition, PACKED_Z_SHIFT,
						PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
				Block block = world.getBlock(sampleX, sampleY, sampleZ);
				if (getAppearanceSignature(block)
						!= appearanceValues[sampleIndex])
				{
					return true;
				}
			}
			return false;
		}

		/**
		 * Collects the unique four-by-four-block horizontal regions containing any recorded light or appearance sample.
		 *
		 * @param lightPositions packed world positions used for brightness sampling
		 * @param blockPositions packed world positions used for ambient-occlusion appearance sampling
		 * @return packed unique light-region coordinates containing either kind of sample
		 */
		private static long[] collectSampleRegionKeys(long[] lightPositions, long[] blockPositions)
		{
			Set<Long> keys = new HashSet<Long>();
			addSampleRegionKeys(keys, lightPositions);
			addSampleRegionKeys(keys, blockPositions);
			long[] result = new long[keys.size()];
			int resultIndex = 0;
			for (Long key : keys)
			{
				result[resultIndex++] = key.longValue();
			}
			return result;
		}

		/**
		 * Adds the four-by-four-block horizontal region containing each packed sample to one deduplicating key set.
		 *
		 * @param keys destination set receiving packed four-block light-region coordinates
		 * @param positions packed world sample positions to classify
		 */
		private static void addSampleRegionKeys(Set<Long> keys, long[] positions)
		{
			for (long packedPosition : positions)
			{
				int sampleX = unpackSignedCoordinate(packedPosition, PACKED_X_SHIFT,
						PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
				int sampleZ = unpackSignedCoordinate(packedPosition, PACKED_Z_SHIFT,
						PACKED_HORIZONTAL_COORDINATE_BITS, PACKED_HORIZONTAL_COORDINATE_MASK);
				keys.add(Long.valueOf(EmbeddedHostLightUpdateTracker.packBlockRegionKey(sampleX, sampleZ)));
			}
		}
	}
}
