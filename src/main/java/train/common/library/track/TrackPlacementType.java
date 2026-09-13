package train.common.library.track;

/** Defines how a track occupies or replaces its selected supporting block. */
public enum TrackPlacementType
{
	SURFACE(false),
	REPLACE_TARGET(true),
	SLAB_MOUNTED(true),
	STAIR_MOUNTED(true);

	private final boolean replacesTarget;

	/**
	 * Creates a placement mode with its target-replacement behavior.
	 *
	 * @param replacesTarget whether placement captures and replaces the selected host block
	 */
	private TrackPlacementType(boolean replacesTarget)
	{
		this.replacesTarget = replacesTarget;
	}

	/**
	 * Returns whether this mode captures and replaces the selected host block.
	 *
	 * @return whether the selected target is captured and replaced by a rail cell
	 */
	public boolean replacesTarget()
	{
		return replacesTarget;
	}
}
