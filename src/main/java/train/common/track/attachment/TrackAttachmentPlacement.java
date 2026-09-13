package train.common.track.attachment;

/** Immutable mounting decision produced before an attachment is installed. */
public final class TrackAttachmentPlacement
{
	private static final float FULL_ROTATION_DEGREES = 360.0F;

	private final String slotId;
	private final float yawDegrees;

	/**
	 * Creates a placement using a namespaced slot and canonical world yaw.
	 *
	 * @param slotId validated namespaced mounting slot
	 * @param yawDegrees clockwise world yaw in degrees, normalized during construction
	 */
	public TrackAttachmentPlacement(String slotId, float yawDegrees)
	{
		this.slotId = TrackAttachmentSlots.requireValid(slotId);
		this.yawDegrees = normalizeYaw(yawDegrees);
	}

	/** @return the namespaced mounting slot */
	public String getSlotId()
	{
		return slotId;
	}

	/** @return normalized clockwise world yaw in degrees */
	public float getYawDegrees()
	{
		return yawDegrees;
	}

	/** @return the supplied yaw normalized to the range zero inclusive through 360 exclusive */
	public static float normalizeYaw(float yawDegrees)
	{
		if (Float.isNaN(yawDegrees) || Float.isInfinite(yawDegrees))
		{
			throw new IllegalArgumentException("Track attachment yaw must be finite");
		}
		float normalized = yawDegrees % FULL_ROTATION_DEGREES;
		return normalized < 0.0F ? normalized + FULL_ROTATION_DEGREES : normalized;
	}
}
