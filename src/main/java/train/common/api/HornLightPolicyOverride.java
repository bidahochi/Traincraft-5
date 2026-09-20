package train.common.api;

import train.common.appearance.HornLightPolicyRegistry;

/** Immutable partial trigger settings, composed before constructing a server horn policy. */
public final class HornLightPolicyOverride
{
    private static final double KILOMETERS_PER_MILE = 1.609344D;
    private static final double DEFAULT_MINIMUM_SPEED_MPH = 0.0D;
    private final Boolean enabled;
    private final Integer durationTicks;
    private final Double minimumSpeedMph;
    private final Double maximumSpeedMph;
    private final String preset;

    /**
     * Creates an inline partial layer. Null fields inherit; speed bounds are in mph.
     * Positive infinity explicitly removes the maximum gate. Combined range validation
     * happens after inheritance because a layer may specify only one bound.
     */
    public HornLightPolicyOverride(Boolean enabled, Integer durationTicks, Double minimumSpeedMph,
        Double maximumSpeedMph)
    {
        this(null, enabled, durationTicks, minimumSpeedMph, maximumSpeedMph);
    }

    /**
     * Selects an optional namespaced policy before applying this layer's explicit fields.
     * A preset replaces the lower layer's base; omitted fields then inherit from that preset.
     * Without a preset, omitted fields inherit directly from the lower layer.
     */
    public HornLightPolicyOverride(String preset, Boolean enabled, Integer durationTicks, Double minimumSpeedMph,
        Double maximumSpeedMph)
    {
        if (durationTicks != null && durationTicks <= 0)
        {
            throw new IllegalArgumentException("Horn policy durationTicks must be positive");
        }
        if (minimumSpeedMph != null && (Double.isNaN(minimumSpeedMph)
            || Double.isInfinite(minimumSpeedMph) || minimumSpeedMph < 0))
        {
            throw new IllegalArgumentException("Horn policy minimumSpeedMph must be finite and nonnegative");
        }
        if (maximumSpeedMph != null && (Double.isNaN(maximumSpeedMph) || maximumSpeedMph < 0))
        {
            throw new IllegalArgumentException("Horn policy maximumSpeedMph must be nonnegative or unbounded");
        }
        this.preset = preset;
        this.enabled = enabled;
        this.durationTicks = durationTicks;
        this.minimumSpeedMph = minimumSpeedMph;
        this.maximumSpeedMph = maximumSpeedMph;
    }

    /**
     * Composes a higher-priority layer without modifying either input. A new preset
     * replaces this layer; otherwise only supplied fields change. Null means no layer.
     */
    public HornLightPolicyOverride merge(HornLightPolicyOverride next)
    {
        if (next == null)
        {
            return this;
        }
        if (next.preset != null)
        {
            return next;
        }
        return new HornLightPolicyOverride(preset, next.enabled == null ? enabled : next.enabled,
            next.durationTicks == null ? durationTicks : next.durationTicks,
            next.minimumSpeedMph == null ? minimumSpeedMph : next.minimumSpeedMph,
            next.maximumSpeedMph == null ? maximumSpeedMph : next.maximumSpeedMph);
    }

    /** Resolves against installed definitions; invalid references or ranges reject the contribution. */
    public RollingStockHornLightResponsePolicy resolve()
    {
        return resolve(HornLightPolicyRegistry.INSTALLED);
    }

    /**
     * Expands a policy during loading, never during horn actions or rendering. The supplied
     * registry belongs to the current load operation. Disabled policies still validate their
     * fields so enabling a higher layer cannot conceal invalid configuration.
     */
    public RollingStockHornLightResponsePolicy resolve(HornLightPolicyRegistry registry)
    {
        if (preset != null)
        {
            HornLightPolicyOverride fields = new HornLightPolicyOverride(enabled, durationTicks,
                minimumSpeedMph, maximumSpeedMph);
            return registry.get(preset).merge(fields).resolve(registry);
        }
        int ticks = durationTicks == null ? RollingStockTransientLightTimer.HORN_RESPONSE_TICKS : durationTicks;
        double minimum = minimumSpeedMph == null ? DEFAULT_MINIMUM_SPEED_MPH : minimumSpeedMph;
        double maximum = maximumSpeedMph == null ? Double.POSITIVE_INFINITY : maximumSpeedMph;
        if (ticks <= 0 || Double.isNaN(minimum) || Double.isInfinite(minimum) || minimum < 0
            || Double.isNaN(maximum) || maximum <= minimum)
        {
            throw new IllegalArgumentException("Invalid hornResponsePolicy duration or speed range");
        }
        if (Boolean.FALSE.equals(enabled))
        {
            return RollingStockHornLightResponsePolicy.DISABLED;
        }
        if (Double.isInfinite(maximum))
        {
            return RollingStockHornLightResponsePolicy.fixedTicks(ticks, minimum * KILOMETERS_PER_MILE);
        }
        return RollingStockHornLightResponsePolicy.fixedTicks(
            ticks, minimum * KILOMETERS_PER_MILE, maximum * KILOMETERS_PER_MILE);
    }
}
