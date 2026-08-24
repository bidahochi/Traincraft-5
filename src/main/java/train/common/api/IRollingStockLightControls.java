package train.common.api;

/**
 * Defines the synchronized operator controls exposed by rolling stock with configurable lighting.
 *
 * <p>Fixture identity and behavior remain model/profile concerns; implementations expose only
 * synchronized operator state for the available lighting circuits.
 */
public interface IRollingStockLightControls extends IRollingStockLightState
{
    /** @return the synchronized front-headlight level */
    @Override
    RollingStockHeadlightLevel getFrontHeadlightLevel();

    /** @return the synchronized rear-headlight level */
    @Override
    RollingStockHeadlightLevel getRearHeadlightLevel();

    /** @param level new front-headlight level; {@code null} is treated as off */
    void setFrontHeadlightLevel(RollingStockHeadlightLevel level);

    /** @param level new rear-headlight level; {@code null} is treated as off */
    void setRearHeadlightLevel(RollingStockHeadlightLevel level);

    /**
     * Reports whether a logical lighting circuit is active.
     *
     * @param channel circuit to query
     * @return whether the circuit is enabled
     */
    @Override
    boolean isLightChannelEnabled(RollingStockLightChannel channel);

    /**
     * Changes a logical lighting circuit.
     *
     * @param channel circuit to change
     * @param enabled whether the circuit should be enabled
     */
    void setLightChannelEnabled(RollingStockLightChannel channel, boolean enabled);

    /**
     * Reports a synchronized, non-persistent signal such as the active horn response window.
     * The default keeps existing third-party implementations source compatible.
     *
     * @param signal transient signal to query
     * @return whether that signal is currently active
     */
    @Override
    default boolean isTransientLightSignalEnabled(RollingStockTransientLightSignal signal)
    {
        return false;
    }
}
