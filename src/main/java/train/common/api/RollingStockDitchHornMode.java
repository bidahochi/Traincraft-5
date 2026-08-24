package train.common.api;

/** Selects which ditch-light ends participate in a temporary horn response. */
public enum RollingStockDitchHornMode
{
    /** Ditch lights ignore the transient horn signal. */
    NONE,
    /** Only ditch lights facing the currently active headlight end respond. */
    ACTIVE_END,
    /** Ditch lights at both ends respond, including an otherwise inactive end. */
    BOTH_ENDS
}
