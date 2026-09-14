package train.common.api;

/** Shared server-owned timing rules for synchronized, non-persistent light responses. */
public final class RollingStockTransientLightTimer
{
    /** Duration of an authenticated horn-triggered ditch-light response. */
    public static final int HORN_RESPONSE_TICKS = 65;

    /** Prevents construction of the shared transient-timing utility. */
    private RollingStockTransientLightTimer() {}

    /** @return the initial synchronized horn-response countdown */
    public static int startHorn()
    {
        return HORN_RESPONSE_TICKS;
    }

    /**
     * Applies a horn trigger without cancelling an already active response when the new action
     * does not meet the policy's speed gate.
     *
     * @param remaining current response time remaining in ticks
     * @param policy policy controlling duration and minimum speed
     * @param speedKmh current rolling-stock speed in km/h
     * @return the policy duration when eligible, otherwise the non-negative existing duration
     */
    public static int startHorn(
        int remaining,
        RollingStockHornLightResponsePolicy policy,
        double speedKmh)
    {
        if (policy == null)
        {
            return Math.max(0, remaining);
        }
        return policy.qualifies(speedKmh) ? policy.durationTicks() : Math.max(0, remaining);
    }

    /**
     * Advances a response countdown by one server tick.
     *
     * @param remaining current response time remaining in ticks
     * @return the decremented duration, clamped at zero
     */
    public static int tick(int remaining)
    {
        return remaining > 0 ? remaining - 1 : 0;
    }
}
