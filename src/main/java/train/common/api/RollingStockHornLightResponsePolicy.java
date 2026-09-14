package train.common.api;

/**
 * Immutable, server-side trigger policy for a temporary horn-driven lighting response.
 * Durations use game ticks and speed thresholds use real-world kilometers per hour. Every enabled
 * policy has an exclusive minimum and may also have an inclusive maximum speed.
 */
public final class RollingStockHornLightResponsePolicy
{
    /** Shared opt-out used by rolling stock that has no horn-driven light behavior. */
    public static final RollingStockHornLightResponsePolicy DISABLED =
        new RollingStockHornLightResponsePolicy(0, 0.0D, Double.POSITIVE_INFINITY);

    private static final int TICKS_PER_SECOND = 20;
    private final int durationTicks;
    private final double minimumSpeedKmh, maximumSpeedKmh;

    private RollingStockHornLightResponsePolicy(
        int durationTicks, double minimumSpeedKmh, double maximumSpeedKmh)
    {
        this.durationTicks = durationTicks;
        this.minimumSpeedKmh = minimumSpeedKmh;
        this.maximumSpeedKmh = maximumSpeedKmh;
    }

    /**
     * Creates an enabled policy whose response duration is measured in game ticks.
     *
     * @param durationTicks positive response duration in game ticks
     * @param minimumSpeedKmh non-negative exclusive speed threshold in km/h
     * @return an enabled policy, or {@link #DISABLED} when either value is invalid
     */
    public static RollingStockHornLightResponsePolicy fixedTicks(
        int durationTicks, double minimumSpeedKmh)
    {
        if (durationTicks <= 0 || validSpeed(minimumSpeedKmh) == false)
        {
            return DISABLED;
        }
        return new RollingStockHornLightResponsePolicy(
                   durationTicks, minimumSpeedKmh, Double.POSITIVE_INFINITY);
    }

    /**
     * Creates an enabled, speed-bounded policy whose duration is measured in game ticks.
     *
     * @param durationTicks positive response duration in game ticks
     * @param minimumSpeedKmh non-negative exclusive minimum speed in km/h
     * @param maximumSpeedKmh finite inclusive maximum speed in km/h
     * @return an enabled policy, or {@link #DISABLED} when the duration or range is invalid
     */
    public static RollingStockHornLightResponsePolicy fixedTicks(
        int durationTicks, double minimumSpeedKmh, double maximumSpeedKmh)
    {
        if (durationTicks <= 0
                || validSpeed(minimumSpeedKmh) == false
                || validSpeed(maximumSpeedKmh) == false
                || maximumSpeedKmh <= minimumSpeedKmh)
        {
            return DISABLED;
        }
        return new RollingStockHornLightResponsePolicy(
                   durationTicks, minimumSpeedKmh, maximumSpeedKmh);
    }

    /**
     * Creates an enabled policy whose response duration is measured in whole seconds.
     *
     * @param durationSeconds positive response duration in seconds
     * @param minimumSpeedKmh non-negative exclusive speed threshold in km/h
     * @return an enabled policy, or {@link #DISABLED} when either value is invalid
     */
    public static RollingStockHornLightResponsePolicy fixedSeconds(
        int durationSeconds, double minimumSpeedKmh)
    {
        if (durationSeconds <= 0
                || durationSeconds > Integer.MAX_VALUE / TICKS_PER_SECOND
                || validSpeed(minimumSpeedKmh) == false)
        {
            return DISABLED;
        }
        return fixedTicks(durationSeconds * TICKS_PER_SECOND, minimumSpeedKmh);
    }

    /**
     * Creates an enabled, speed-bounded policy whose duration is measured in whole seconds.
     *
     * @param durationSeconds positive response duration in seconds
     * @param minimumSpeedKmh non-negative exclusive minimum speed in km/h
     * @param maximumSpeedKmh finite inclusive maximum speed in km/h
     * @return an enabled policy, or {@link #DISABLED} when the duration or range is invalid
     */
    public static RollingStockHornLightResponsePolicy fixedSeconds(
        int durationSeconds, double minimumSpeedKmh, double maximumSpeedKmh)
    {
        if (durationSeconds <= 0 || durationSeconds > Integer.MAX_VALUE / TICKS_PER_SECOND)
        {
            return DISABLED;
        }
        return fixedTicks(
                   durationSeconds * TICKS_PER_SECOND, minimumSpeedKmh, maximumSpeedKmh);
    }

    /** Reports whether a speed threshold is finite and non-negative. */
    private static boolean validSpeed(double speedKmh)
    {
        return Double.isNaN(speedKmh) == false
               && Double.isInfinite(speedKmh) == false
               && speedKmh >= 0.0D;
    }

    /** @return whether this policy can start a horn-light response */
    public boolean enabled()
    {
        return durationTicks > 0;
    }

    /** @return configured response duration in game ticks, or zero when disabled */
    public int durationTicks()
    {
        return durationTicks;
    }

    /** @return exclusive minimum speed threshold in km/h */
    public double minimumSpeedKmh()
    {
        return minimumSpeedKmh;
    }

    /** @return whether this policy defines an upper speed limit */
    public boolean hasMaximumSpeedKmh()
    {
        return Double.isInfinite(maximumSpeedKmh) == false;
    }

    /**
     * Returns the inclusive upper speed limit.
     *
     * @return maximum speed in km/h, or positive infinity when the policy has no upper limit
     */
    public double maximumSpeedKmh()
    {
        return maximumSpeedKmh;
    }

    /**
     * Reports whether a speed can start this policy's horn-light response.
     *
     * <p>The comparison uses absolute speed and a strict threshold, so a speed exactly equal to
     * the configured minimum is ineligible. A configured maximum remains eligible.
     *
     * @param speedKmh signed or unsigned speed in km/h
     * @return whether this policy is enabled and the finite speed lies within its configured range
     */
    public boolean qualifies(double speedKmh)
    {
        double absoluteSpeedKmh = Math.abs(speedKmh);
        return enabled()
               && Double.isNaN(absoluteSpeedKmh) == false
               && Double.isInfinite(absoluteSpeedKmh) == false
               && absoluteSpeedKmh > minimumSpeedKmh
               && absoluteSpeedKmh <= maximumSpeedKmh;
    }
}
