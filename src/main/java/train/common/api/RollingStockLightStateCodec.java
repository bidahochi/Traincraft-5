package train.common.api;

/**
 * Defines the compact synchronized representation shared by every rolling-stock entity that
 * exposes lighting controls. Bits {@code 0..1} store the front level, {@code 2..3} the rear
 * level, and {@code 4..7} the ditch, beacon, auxiliary, and Gyralite flags. The same value is
 * stored in data watcher slot {@value #WATCHER_SLOT}; changing either layout is a protocol and
 * save-data compatibility change.
 */
public final class RollingStockLightStateCodec
{
    /** Shared entity data-watcher slot reserved for the packed light state. */
    public static final int WATCHER_SLOT = 28;

    private static final int LEVEL_MASK = 0x3;
    private static final int REAR_SHIFT = 2;
    private static final int DITCH_BIT = 1 << 4;
    private static final int BEACON_BIT = 1 << 5;
    private static final int AUX_BIT = 1 << 6;
    private static final int GYRA_BIT = 1 << 7;

    private RollingStockLightStateCodec() {}

    /** Packs front/rear levels and named circuit flags into the stable low eight bits. */
    public static int pack(
        RollingStockHeadlightLevel front,
        RollingStockHeadlightLevel rear,
        boolean ditch,
        boolean beacon,
        boolean aux,
        boolean gyra)
    {
        int packed = level(front).ordinal() & LEVEL_MASK;
        packed |= (level(rear).ordinal() & LEVEL_MASK) << REAR_SHIFT;
        if (ditch)
        {
            packed |= DITCH_BIT;
        }
        if (beacon)
        {
            packed |= BEACON_BIT;
        }
        if (aux)
        {
            packed |= AUX_BIT;
        }
        if (gyra)
        {
            packed |= GYRA_BIT;
        }
        return packed;
    }

    public static RollingStockHeadlightLevel front(int packed)
    {
        return RollingStockHeadlightLevel.fromOrdinal(packed & LEVEL_MASK);
    }

    public static RollingStockHeadlightLevel rear(int packed)
    {
        return RollingStockHeadlightLevel.fromOrdinal((packed >> REAR_SHIFT) & LEVEL_MASK);
    }

    public static boolean enabled(int packed, RollingStockLightChannel channel)
    {
        if (channel == null)
        {
            return false;
        }
        switch (channel)
        {
            case HEADLIGHT:
                return front(packed) != RollingStockHeadlightLevel.OFF
                       || rear(packed) != RollingStockHeadlightLevel.OFF;
            case DITCH:
                return (packed & DITCH_BIT) != 0;
            case BEACON:
                return (packed & BEACON_BIT) != 0;
            case AUX:
                return (packed & AUX_BIT) != 0;
            case GYRA:
                return (packed & GYRA_BIT) != 0;
            default:
                return false;
        }
    }

    /** Converts a packed state to the legacy/persistent channel mask used during migration. */
    public static int persistentChannels(int packed)
    {
        int channels = 0;
        for (RollingStockLightChannel channel : RollingStockLightChannel.values())
        {
            if (enabled(packed, channel))
            {
                channels |= channel.mask();
            }
        }
        return channels;
    }

    private static RollingStockHeadlightLevel level(RollingStockHeadlightLevel level)
    {
        return level == null ? RollingStockHeadlightLevel.OFF : level;
    }
}
