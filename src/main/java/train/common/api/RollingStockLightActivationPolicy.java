package train.common.api;

/** Determines how synchronized controls activate a physical light fixture. */
public enum RollingStockLightActivationPolicy
{
    /** The fixture follows only its configured control circuit. */
    CIRCUIT_ONLY,
    /** Requires the configured circuit and facing headlight; DIM emits only the source, BRIGHT also projects. */
    FACING_HEADLIGHT,
    /** Requires the configured circuit and a BRIGHT facing headlight; DIM leaves the fixture off. */
    FACING_HEADLIGHT_BRIGHT_ONLY
}
