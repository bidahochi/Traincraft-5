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
    private final String group;
    private final LightFixtureType fixtureType;

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
        this(enabled, availabilityOverridden, behavior, null);
    }

    /** Null group inherits; an empty group explicitly leaves this fixture independent. */
    public RollingStockLightOverride(boolean enabled, boolean availabilityOverridden,
        RollingStockLightBehaviorOverride behavior, String group)
    {
        this(enabled, availabilityOverridden, behavior, group, null);
    }

    /** Retains the declared source role as well as its expanded effect settings. */
    public RollingStockLightOverride(boolean enabled, boolean availabilityOverridden,
        RollingStockLightBehaviorOverride behavior, String group, LightFixtureType fixtureType)
    {
        this.enabled = enabled;
        this.availabilityOverridden = availabilityOverridden;
        this.behavior = behavior;
        this.group = group;
        this.fixtureType = fixtureType;
    }

    /** Source role for geometry-specific rendering; null inherits the historical model preset. */
    public LightFixtureType fixtureType()
    {
        return fixtureType;
    }

    /** Optional shared effect identity, resolved by lighting rather than model geometry. */
    public String group()
    {
        return group;
    }

    /** Composes a higher-priority partial layer while retaining omitted properties. */
    public RollingStockLightOverride merge(RollingStockLightOverride next)
    {
        RollingStockLightBehaviorOverride combined = behavior;
        if (next.behavior != null)
        {
            combined = next.behavior;
            if (behavior != null)
            {
                combined = behavior.merge(next.behavior);
            }
        }
        boolean selectedEnabled = enabled;
        if (next.availabilityOverridden)
        {
            selectedEnabled = next.enabled;
        }
        String selectedGroup = group;
        if (next.group != null)
        {
            selectedGroup = next.group;
        }
        return new RollingStockLightOverride(selectedEnabled,
            availabilityOverridden || next.availabilityOverridden, combined, selectedGroup,
            next.fixtureType == null ? fixtureType : next.fixtureType);
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
               && Objects.equals(behavior, value.behavior)
               && fixtureType == value.fixtureType
               && Objects.equals(group, value.group);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(enabled, availabilityOverridden, behavior, group, fixtureType);
    }
}
