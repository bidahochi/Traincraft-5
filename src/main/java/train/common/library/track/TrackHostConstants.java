package train.common.library.track;

/** Shared serialized and block-state constants used by host-replacing track placement. */
public final class TrackHostConstants
{
	/** Metadata bit that distinguishes a top slab from a bottom slab in Minecraft 1.7.10. */
	public static final int TOP_SLAB_METADATA_BIT = 8;
	/** World update flags that notify neighbors and synchronize the changed block to clients. */
	public static final int NOTIFY_NEIGHBORS_AND_CLIENTS = 3;
	/** Opaque white used when an older save has no captured biome tint. */
	public static final int DEFAULT_HOST_TINT = 0xFFFFFF;
	/** Height of a full captured-host surface above its occupied block coordinate. */
	public static final double FULL_BLOCK_SURFACE_HEIGHT = 1.0D;
	/** Height of a top or bottom half-slab in blocks. */
	public static final float HALF_BLOCK_HEIGHT = 0.5F;
	/** Collision and selection height of the legacy rail base in blocks. */
	public static final float DEFAULT_RAIL_BASE_HEIGHT = 0.125F;
	/** Amount that true-embedded rail models sit below their captured host surface. */
	public static final double EMBEDDED_TRACK_MODEL_INSET = 0.078125D;

	/** Creates no instances; track-host constants are static. */
	private TrackHostConstants()
	{
	}
}
