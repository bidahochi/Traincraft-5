package train.common.api;

import java.util.Objects;

/**
 * Immutable skin-authored changes for one model-owned fixture.
 *
 * <p>Availability and behavior are independent. An override may explicitly enable or disable a
 * fixture, replace selected behavior properties without changing availability, or do both.</p>
 */
public final class RollingStockLightOverride
{
    private final boolean enabled, availabilityOverridden;
    private final RollingStockLightBehaviorOverride behavior;

    /**
     * Creates an override with explicit availability semantics.
     *
     * @param enabled availability value used when {@code availabilityOverridden} is true
     * @param availabilityOverridden whether automatic texture/model availability is replaced
     * @param behavior optional partial behavior override; {@code null} preserves model behavior
     */
    public RollingStockLightOverride(
        boolean enabled,
        boolean availabilityOverridden,
        RollingStockLightBehaviorOverride behavior)
    {
        this.enabled = enabled;
        this.availabilityOverridden = availabilityOverridden;
        this.behavior = behavior;
    }

    /** Creates an override that explicitly sets availability and optionally changes behavior. */
    public RollingStockLightOverride(boolean enabled, RollingStockLightBehaviorOverride behavior)
    {
        this(enabled, true, behavior);
    }

    /** Returns an override that forces the fixture available without changing its behavior. */
    public static RollingStockLightOverride available()
    {
        return new RollingStockLightOverride(true, true, null);
    }

    /** Returns an override that suppresses the fixture without changing its behavior. */
    public static RollingStockLightOverride disabled()
    {
        return new RollingStockLightOverride(false, true, null);
    }

    /** Returns a behavior-only override that preserves automatic fixture availability. */
    public static RollingStockLightOverride behavior(RollingStockLightBehaviorOverride b)
    {
        return new RollingStockLightOverride(true, false, b);
    }

    public boolean enabled()
    {
        return enabled;
    }

    public boolean availabilityOverridden()
    {
        return availabilityOverridden;
    }

    public RollingStockLightBehaviorOverride behavior()
    {
        return behavior;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
        {
            return true;
        }
        if ((other instanceof RollingStockLightOverride) == false)
        {
            return false;
        }
        RollingStockLightOverride value = (RollingStockLightOverride) other;
        return enabled == value.enabled
               && availabilityOverridden == value.availabilityOverridden
               && Objects.equals(behavior, value.behavior);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(enabled, availabilityOverridden, behavior);
    }
}
