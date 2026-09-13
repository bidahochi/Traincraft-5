package train.common.track.attachment;

/** Immutable local-space dimensions used for attachment selection and collision. */
public final class TrackAttachmentBounds
{
	/** Empty geometry used by attachment types that do not contribute a hitbox. */
	public static final TrackAttachmentBounds EMPTY = new TrackAttachmentBounds(
			0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);

	private final double minimumX;
	private final double minimumY;
	private final double minimumZ;
	private final double maximumX;
	private final double maximumY;
	private final double maximumZ;

	/**
	 * Defines attachment-local bounds before yaw or track-slope rotation is applied.
	 *
	 * @param minimumX minimum local X coordinate
	 * @param minimumY minimum height above the attachment origin
	 * @param minimumZ minimum local Z coordinate
	 * @param maximumX maximum local X coordinate
	 * @param maximumY maximum height above the attachment origin
	 * @param maximumZ maximum local Z coordinate
	 */
	public TrackAttachmentBounds(double minimumX, double minimumY, double minimumZ,
			double maximumX, double maximumY, double maximumZ)
	{
		if (isFinite(minimumX) == false || isFinite(minimumY) == false || isFinite(minimumZ) == false
				|| isFinite(maximumX) == false || isFinite(maximumY) == false || isFinite(maximumZ) == false)
		{
			throw new IllegalArgumentException("Track attachment bounds must be finite");
		}
		if (maximumX < minimumX || maximumY < minimumY || maximumZ < minimumZ)
		{
			throw new IllegalArgumentException("Track attachment bounds must be ordered");
		}
		this.minimumX = minimumX;
		this.minimumY = minimumY;
		this.minimumZ = minimumZ;
		this.maximumX = maximumX;
		this.maximumY = maximumY;
		this.maximumZ = maximumZ;
	}

	private static boolean isFinite(double value)
	{
		return Double.isNaN(value) == false && Double.isInfinite(value) == false;
	}

	/** @return minimum local X coordinate */
	public double getMinimumX()
	{
		return minimumX;
	}

	/** @return minimum local height in blocks */
	public double getMinimumY()
	{
		return minimumY;
	}

	/** @return minimum local Z coordinate */
	public double getMinimumZ()
	{
		return minimumZ;
	}

	/** @return maximum local X coordinate */
	public double getMaximumX()
	{
		return maximumX;
	}

	/** @return maximum local height in blocks */
	public double getMaximumY()
	{
		return maximumY;
	}

	/** @return maximum local Z coordinate */
	public double getMaximumZ()
	{
		return maximumZ;
	}

	/** @return whether these dimensions contribute no selectable or collidable volume */
	public boolean isEmpty()
	{
		return maximumX == minimumX || maximumY == minimumY || maximumZ == minimumZ;
	}

	@Override
	public boolean equals(Object other)
	{
		if ((other instanceof TrackAttachmentBounds) == false)
		{
			return false;
		}
		TrackAttachmentBounds bounds = (TrackAttachmentBounds)other;
		return Double.compare(minimumX, bounds.minimumX) == 0
				&& Double.compare(minimumY, bounds.minimumY) == 0
				&& Double.compare(minimumZ, bounds.minimumZ) == 0
				&& Double.compare(maximumX, bounds.maximumX) == 0
				&& Double.compare(maximumY, bounds.maximumY) == 0
				&& Double.compare(maximumZ, bounds.maximumZ) == 0;
	}

	@Override
	public int hashCode()
	{
		long minimumXBits = Double.doubleToLongBits(minimumX);
		long minimumYBits = Double.doubleToLongBits(minimumY);
		long minimumZBits = Double.doubleToLongBits(minimumZ);
		long maximumXBits = Double.doubleToLongBits(maximumX);
		long maximumYBits = Double.doubleToLongBits(maximumY);
		long maximumZBits = Double.doubleToLongBits(maximumZ);
		int result = (int)(minimumXBits ^ (minimumXBits >>> 32));
		result = 31 * result + (int)(minimumYBits ^ (minimumYBits >>> 32));
		result = 31 * result + (int)(minimumZBits ^ (minimumZBits >>> 32));
		result = 31 * result + (int)(maximumXBits ^ (maximumXBits >>> 32));
		result = 31 * result + (int)(maximumYBits ^ (maximumYBits >>> 32));
		return 31 * result + (int)(maximumZBits ^ (maximumZBits >>> 32));
	}
}
