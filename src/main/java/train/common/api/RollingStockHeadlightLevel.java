package train.common.api;

/** Independently synchronized brightness for one locomotive end. */
public enum RollingStockHeadlightLevel
{
    OFF,
    DIM,
    BRIGHT;

    public RollingStockHeadlightLevel next()
    {
        switch (this)
        {
            case OFF:
                return DIM;
            case DIM:
                return BRIGHT;
            default:
                return OFF;
        }
    }

    public static RollingStockHeadlightLevel fromOrdinal(int ordinal)
    {
        RollingStockHeadlightLevel[] values = values();
        return ordinal >= 0 && ordinal < values.length ? values[ordinal] : OFF;
    }
}
