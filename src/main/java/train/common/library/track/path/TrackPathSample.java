package train.common.library.track.path;

/** Immutable world-space point and tangent sampled from one track route. */
public final class TrackPathSample
{
	private final double worldX;
	private final double worldZ;
	private final double tangentX;
	private final double tangentZ;

	/**
	 * Creates one horizontal path sample.
	 *
	 * @param worldX sampled world X coordinate
	 * @param worldZ sampled world Z coordinate
	 * @param tangentX path tangent X component
	 * @param tangentZ path tangent Z component
	 */
	public TrackPathSample(double worldX, double worldZ, double tangentX, double tangentZ)
	{
		double tangentLength = Math.sqrt(tangentX * tangentX + tangentZ * tangentZ);
		if (tangentLength == 0.0D)
		{
			throw new IllegalArgumentException("Track path tangent cannot be zero");
		}
		this.worldX = worldX;
		this.worldZ = worldZ;
		this.tangentX = tangentX / tangentLength;
		this.tangentZ = tangentZ / tangentLength;
	}

	/** @return sampled world X coordinate */
	public double getWorldX()
	{
		return worldX;
	}

	/** @return sampled world Z coordinate */
	public double getWorldZ()
	{
		return worldZ;
	}

	/** @return normalized path tangent X component */
	public double getTangentX()
	{
		return tangentX;
	}

	/** @return normalized path tangent Z component */
	public double getTangentZ()
	{
		return tangentZ;
	}
}
