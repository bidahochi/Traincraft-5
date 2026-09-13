package train.common.api;

import java.util.Locale;

/** Independently controlled rolling-stock light circuits. */
public enum RollingStockLightChannel
{
    HEADLIGHT(1),
    DITCH(1 << 1),
    BEACON(1 << 2),
    AUX(1 << 3),
    GYRA(1 << 4);

    private final int mask;

    RollingStockLightChannel(int mask)
    {
        this.mask = mask;
    }

    public int mask()
    {
        return mask;
    }

    public static RollingStockLightChannel fromTaggedPartName(String partName)
    {
        if (partName == null)
        {
            return null;
        }
        String name = partName.toLowerCase(Locale.ROOT);
        if (name.contains("instrument"))
        {
            // Instrument backlighting follows the existing headlight power state, but its
            // rendering behavior is locked separately by the extracted fixture definition.
            return HEADLIGHT;
        }
        if (name.contains("interior"))
        {
            // Passenger-compartment illumination uses AUX so it follows rolling-stock light
            // controls today and can receive a dedicated control later without changing models.
            return AUX;
        }
        if (name.contains("ditch"))
        {
            return DITCH;
        }
        if (name.contains("commander")
                || name.contains("prime1")
                || name.contains("prime2")
                || name.contains("prime3")
                || name.contains("prime4"))
        {
            return BEACON;
        }
        if (name.contains("numberboard"))
        {
            return AUX;
        }
        if (name.contains("marker"))
        {
            return AUX;
        }
        if (name.contains("lamp"))
        {
            return HEADLIGHT;
        }
        return null;
    }

    public static boolean taggedPartIsIlluminatedSurface(String partName)
    {
        return partName != null && partName.toLowerCase(Locale.ROOT).contains("numberboard");
    }

    /** Returns whether a semantic model tag declares immutable instrument backlighting. */
    public static boolean taggedPartIsInstrument(String partName)
    {
        return partName != null && partName.toLowerCase(Locale.ROOT).contains("instrument");
    }

    /** Returns whether a semantic model tag declares non-projecting interior illumination. */
    public static boolean taggedPartIsInterior(String partName)
    {
        return partName != null && partName.toLowerCase(Locale.ROOT).contains("interior");
    }

    public static RollingStockLightFunction defaultFunction(String partName)
    {
        if (partName == null)
        {
            return RollingStockLightFunction.STEADY;
        }
        String name = partName.toLowerCase(Locale.ROOT);
        if (name.contains("commander"))
        {
            return RollingStockLightFunction.commander();
        }
        for (int phase = 1; phase <= 4; phase++)
        {
            if (name.contains("prime" + phase))
            {
                return RollingStockLightFunction.prime(phase);
            }
        }
        return RollingStockLightFunction.STEADY;
    }
}
