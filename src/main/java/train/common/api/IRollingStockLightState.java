package train.common.api;

/**
 * Read-only synchronized lighting state consumed by model and effect rendering.
 *
 * <p>This contract deliberately contains no mutation methods. Providers such as tenders can expose
 * a server-authored mirror through this interface without claiming independently adjustable
 * controls.
 */
public interface IRollingStockLightState
{
    /** @return the synchronized front-headlight level */
    RollingStockHeadlightLevel getFrontHeadlightLevel();

    /** @return the synchronized rear-headlight level */
    RollingStockHeadlightLevel getRearHeadlightLevel();

    /**
     * Reports whether a logical lighting circuit is active.
     *
     * @param channel circuit to query
     * @return whether the circuit is enabled
     */
    boolean isLightChannelEnabled(RollingStockLightChannel channel);

    /**
     * Reports a synchronized, non-persistent signal such as the active horn response window.
     *
     * @param signal transient signal to query
     * @return whether that signal is currently active
     */
    default boolean isTransientLightSignalEnabled(RollingStockTransientLightSignal signal)
    {
        return false;
    }
}
