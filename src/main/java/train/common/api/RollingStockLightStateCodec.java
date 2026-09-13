package train.common.api;

/**
 * Defines the compact synchronized representation shared by mutable light-control owners and
 * read-only state mirrors. Bits {@code 0..1} store the front level, {@code 2..3} the rear level,
 * {@code 4..7} the ditch, beacon, auxiliary, and Gyralite flags, and bit {@code 8} the transient
 * horn-response signal. The packed value is stored in data watcher slot
 * {@value #WATCHER_SLOT}; changing the slot or layout affects synchronization compatibility.
 * Mutable control owners persist the values represented by bits {@code 0..7} through separate NBT
 * fields and the {@code tcLightChannels} channel-mask conversion. Read-only mirrors such as tenders
 * may publish the
 * same packed layout without saving it. Bit {@code 8} is watcher-only and is never persisted.
 */
public final class RollingStockLightStateCodec
{
    /** Shared entity data-watcher slot reserved for the packed light state. */
    public static final int WATCHER_SLOT = 28;

    /** Packed value with both headlights off, every circuit disabled, and no transient signal. */
    public static final int ALL_OFF = 0;

    private static final int LEVEL_MASK = 0x3;
    private static final int REAR_SHIFT = 2;
    private static final int DITCH_BIT = 1 << 4;
    private static final int BEACON_BIT = 1 << 5;
    private static final int AUX_BIT = 1 << 6;
    private static final int GYRA_BIT = 1 << 7;
    private static final int HORN_BIT = 1 << 8;

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
        return pack(front, rear, ditch, beacon, aux, gyra, false);
    }

    /**
     * Packs stable light-state channels plus the synchronized transient horn signal.
     *
     * <p>The first eight bits retain the established synchronized layout. Mutable control owners
     * convert those values to existing NBT fields rather than writing this watcher value directly;
     * read-only mirrors need not persist them. The watcher-only horn flag is ignored by
     * {@link #persistentChannels(int)}.
     *
     * @param front front headlight level
     * @param rear rear headlight level
     * @param ditch ditch-light master state
     * @param beacon beacon master state
     * @param aux auxiliary-light master state
     * @param gyra Gyralite master state
     * @param horn whether the temporary horn response is active
     * @return packed watcher value
     */
    public static int pack(
        RollingStockHeadlightLevel front,
        RollingStockHeadlightLevel rear,
        boolean ditch,
        boolean beacon,
        boolean aux,
        boolean gyra,
        boolean horn)
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
        if (horn)
        {
            packed |= HORN_BIT;
        }
        return packed;
    }

    /**
     * Reads one non-persistent synchronized signal from the packed watcher value.
     *
     * @param packed packed watcher state
     * @param signal signal to query
     * @return whether the requested signal bit is set
     */
    public static boolean transientEnabled(
        int packed, RollingStockTransientLightSignal signal)
    {
        return signal == RollingStockTransientLightSignal.HORN && (packed & HORN_BIT) != 0;
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

    /**
     * Converts packed state to the persistent mask stored in {@code tcLightChannels}.
     */
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
