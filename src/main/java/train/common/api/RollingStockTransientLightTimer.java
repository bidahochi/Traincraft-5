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
     * Advances a non-negative countdown by one server tick.
     *
     * @param remaining current ticks remaining
     * @return decremented value, clamped to zero
     */
    public static int tick(int remaining)
    {
        return remaining > 0 ? remaining - 1 : 0;
    }
}
