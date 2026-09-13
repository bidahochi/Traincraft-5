package train.common.library.track;

/** Immutable canonical slope parameters resolved from one track definition or core. */
public final class TrackSlopeParameters
{
	private static final double HALF_HEIGHT = 0.5D;
	private static final double EMBEDDED_TRANSITION_LENGTH = 3.0D;

	private final double height;
	private final double length;
	private final double angle;
	private final boolean diagonal;

	private TrackSlopeParameters(double height, double length, double angle, boolean diagonal)
	{
		this.height = height;
		this.length = length;
		this.angle = angle;
		this.diagonal = diagonal;
	}

	/**
	 * Normalizes the persisted values for slope definitions with canonical geometry.
	 *
	 * @param track resolved track definition
	 * @param persistedHeight persisted slope height
	 * @param persistedLength persisted slope length
	 * @param persistedAngle persisted slope angle
	 * @return normalized slope parameters
	 */
	public static TrackSlopeParameters normalize(ITrackDefinition track,
			double persistedHeight, double persistedLength, double persistedAngle)
	{
		TrackSlopeParameters canonical = canonical(track);
		if (canonical == null)
		{
			return new TrackSlopeParameters(persistedHeight, persistedLength, persistedAngle, false);
		}
		if (track.getCoreTrack().isHalfHeightSlope() || track.getCoreTrack().isEmbeddedTransitionSlope())
		{
			return canonical;
		}
		return new TrackSlopeParameters(
				persistedHeight, persistedLength, canonical.angle, canonical.diagonal);
	}

	/**
	 * Returns canonical construction parameters for a supported slope.
	 *
	 * @param track slope definition to resolve
	 * @return canonical parameters, or {@code null} when the definition is not a supported slope
	 */
	public static TrackSlopeParameters canonical(ITrackDefinition track)
	{
		return track != null ? canonical(track.getCoreTrack()) : null;
	}

	/**
	 * Returns canonical construction parameters for a supported slope core.
	 *
	 * @param core slope core to resolve
	 * @return canonical parameters, or {@code null} when the core is not a supported slope
	 */
	public static TrackSlopeParameters canonical(EnumCoreTrack core)
	{
		if (core == null)
		{
			return null;
		}
		switch (core)
		{
			case CORE_EMBEDDED_TRANSITION_SLOPE:
				return create(TrackHostConstants.EMBEDDED_TRACK_MODEL_INSET,
						EMBEDDED_TRANSITION_LENGTH, false);
			case CORE_EMBEDDED_DIAGONAL_TRANSITION_SLOPE:
				return create(TrackHostConstants.EMBEDDED_TRACK_MODEL_INSET,
						EMBEDDED_TRANSITION_LENGTH, true);
			case CORE_3_SLOPE:
				return new TrackSlopeParameters(1.0D, 3.0D, 0.26D, false);
			case CORE_6_SLOPE:
				return new TrackSlopeParameters(1.0D, 6.0D, 0.13D, false);
			case CORE_12_SLOPE:
				return new TrackSlopeParameters(1.0D, 12.0D, 0.0666D, false);
			case CORE_18_SLOPE:
				return new TrackSlopeParameters(1.0D, 18.0D, 0.0444D, false);
			case CORE_3_HALF_HEIGHT_SLOPE:
				return create(HALF_HEIGHT, 3.0D, false);
			case CORE_6_HALF_HEIGHT_SLOPE:
				return create(HALF_HEIGHT, 6.0D, false);
			case CORE_9_HALF_HEIGHT_SLOPE:
				return create(HALF_HEIGHT, 9.0D, false);
			case CORE_3_DIAGONAL_SLOPE:
				return new TrackSlopeParameters(1.0D, 3.0D, 0.23D, true);
			case CORE_6_DIAGONAL_SLOPE:
				return new TrackSlopeParameters(1.0D, 6.0D, 0.12D, true);
			case CORE_12_DIAGONAL_SLOPE:
				return new TrackSlopeParameters(1.0D, 12.0D, 0.06D, true);
			case CORE_18_DIAGONAL_SLOPE:
				return new TrackSlopeParameters(1.0D, 18.0D, 0.04D, true);
			case CORE_3_DIAGONAL_HALF_HEIGHT_SLOPE:
				return create(HALF_HEIGHT, 3.0D, true);
			case CORE_6_DIAGONAL_HALF_HEIGHT_SLOPE:
				return create(HALF_HEIGHT, 6.0D, true);
			case CORE_9_DIAGONAL_HALF_HEIGHT_SLOPE:
				return create(HALF_HEIGHT, 9.0D, true);
			default:
				return null;
		}
	}

	private static TrackSlopeParameters create(double height, double length, boolean diagonal)
	{
		double run = diagonal ? length * Math.sqrt(2.0D) : length;
		return new TrackSlopeParameters(height, length, Math.atan(height / run), diagonal);
	}

	/** @return normalized slope height */
	public double getHeight()
	{
		return height;
	}

	/** @return normalized slope length */
	public double getLength()
	{
		return length;
	}

	/** @return normalized slope angle */
	public double getAngle()
	{
		return angle;
	}

	/** @return whether the slope follows a diagonal horizontal path */
	public boolean isDiagonal()
	{
		return diagonal;
	}

	/** @return horizontal world-space run, including diagonal distance when applicable */
	public double getHorizontalRun()
	{
		return diagonal ? length * Math.sqrt(2.0D) : length;
	}

	/** @return slope grade as rise divided by horizontal run, expressed as a percentage */
	public double getGradePercent()
	{
		double run = getHorizontalRun();
		return run > 0.0D ? height / run * 100.0D : 0.0D;
	}
}
