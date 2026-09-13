package train.common.track.attachment;

/** Built-in namespaced mounting slots and validation for extension-provided slot identifiers. */
public final class TrackAttachmentSlots
{
	/** Mount centered within the selected track cell. */
	public static final String CENTER = "tc:center";
	/** First logical end of a track cell, independent from world direction. */
	public static final String TRACK_END_A = "tc:track_end_a";
	/** Second logical end of a track cell, independent from world direction. */
	public static final String TRACK_END_B = "tc:track_end_b";
	/** Surface layer mounted around or between the rails of the selected track cell. */
	public static final String TRACK_SURFACE = "tc:track_surface";

	private TrackAttachmentSlots()
	{
	}

	/**
	 * Validates an extension-provided slot identifier at its construction boundary.
	 *
	 * @param slotId namespaced identifier to validate
	 * @return validated namespaced slot identifier
	 */
	public static String requireValid(String slotId)
	{
		if (slotId == null || slotId.matches("[a-z0-9_.-]+:[a-z0-9_./-]+") == false)
		{
			throw new IllegalArgumentException("Invalid track attachment slot id: " + slotId);
		}
		return slotId;
	}
}
