package train.common.api;

/**
 * Defines the synchronized operator controls exposed by rolling stock with configurable lighting.
 *
 * <p>This is the authoritative replacement for the legacy combined-light contract. Fixture identity
 * and behavior remain model/profile concerns; implementations expose only synchronized operator
 * state.
 */

public interface IRollingStockLightControls
{
    /** @return the synchronized front-headlight level */
    public RollingStockHeadlightLevel getFrontHeadlightLevel();

    /** @return the synchronized rear-headlight level */
    public RollingStockHeadlightLevel getRearHeadlightLevel();

    /** @param level new front-headlight level; {@code null} is treated as off */
    public
    void setFrontHeadlightLevel(RollingStockHeadlightLevel level);

    /** @param level new rear-headlight level; {@code null} is treated as off */
    public
    void setRearHeadlightLevel(RollingStockHeadlightLevel level);

    /**
     * Reports whether a logical lighting circuit is active.
     *
     * @param channel circuit to query
     * @return whether the circuit is enabled
     */
    public boolean isLightChannelEnabled(RollingStockLightChannel channel);

    /**
     * Changes a logical lighting circuit.
     *
     * @param channel circuit to change
     * @param enabled whether the circuit should be enabled
     */
    public

    void setLightChannelEnabled(RollingStockLightChannel channel,

    boolean enabled);
}
