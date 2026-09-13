package train.client.render.lighting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import train.common.api.ResolvedSkinLighting;
import train.common.api.RollingStockLightDefinition;
import train.common.api.RollingStockLightOverride;

/**
 * Vehicle-agnostic Java 8 immutable skin/profile resolver. Vehicle and skin registrations own their
 * override maps; this class only composes them with extracted baseline fixtures and texture
 * visibility.
 */
final class SkinLightingResolver
{
    private SkinLightingResolver() {}

    static RollingStockLightDefinition resolveDefinition(
        Map<String, RollingStockLightOverride> overrides,
        RollingStockLightDefinition baseline)
    {
        if (baseline.instrument())
        {
            return resolveInstrumentDefinition(overrides.get(baseline.id()), baseline);
        }
        RollingStockLightOverride override = overrides.get(baseline.id());
        return override == null || override.behavior() == null
               ? baseline
               : override.behavior().apply(baseline);
    }

    static ResolvedSkinLighting resolveProfile(
        List<RollingStockLightDefinition> defaults,
        Map<String, RollingStockLightOverride> overrides,
        Visibility visibility)
    {
        List<RollingStockLightDefinition> active = new ArrayList<RollingStockLightDefinition>();
        Set<String> known = new HashSet<String>();
        Set<String> available = new HashSet<String>();
        for (RollingStockLightDefinition base : defaults)
        {
            RollingStockLightOverride override = overrides.get(base.id());
            String partName = base.taggedPartName();
            known.add(base.id());
            if (partName != null && partName.trim().isEmpty() == false)
            {
                known.add(partName);
            }
            boolean enabled;
            if (base.instrument())
            {
                // Instrument behavior is model-owned. A skin may suppress an unwanted
                // instrument, but may not force-enable hidden texture geometry.
                enabled = (override == null
                           || override.availabilityOverridden() == false
                           || override.enabled())
                          && (base.taggedUvRegions().isEmpty()
                              || visibility.visible(base));
            }
            else if (override != null && override.availabilityOverridden())
            {
                enabled = override.enabled();
            }
            else
            {
                if (base.taggedUvRegions().isEmpty())
                {
                    enabled = true;
                }
                else
                {
                    enabled = visibility.visible(base);
                }
            }
            if (enabled == false)
            {
                continue;
            }
            RollingStockLightDefinition definition =
                base.instrument()
                ? resolveInstrumentDefinition(override, base)
                : override != null && override.behavior() != null
                  ? override.behavior().apply(base)
                  : base;
            active.add(definition);
            available.add(definition.id());
            if (partName != null && partName.trim().isEmpty() == false)
            {
                available.add(partName);
            }
        }
        return new ResolvedSkinLighting(active, known, available);
    }

    /** Applies the sole permitted instrument behavior override: packed fixture color. */
    private static RollingStockLightDefinition resolveInstrumentDefinition(
        RollingStockLightOverride override, RollingStockLightDefinition baseline)
    {
        Integer color = override == null || override.behavior() == null
                        ? null
                        : override.behavior().color();
        return color == null ? baseline : baseline.toBuilder().color(color).build();
    }

    interface Visibility
    {
        boolean visible(RollingStockLightDefinition definition);
    }
}
