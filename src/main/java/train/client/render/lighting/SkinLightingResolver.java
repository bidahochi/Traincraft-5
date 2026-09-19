package train.client.render.lighting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import train.common.api.ResolvedSkinLighting;
import train.common.api.LightFixtureType;
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

    /** Explicit JSON grouping/clearing supersedes the legacy model assignment, including with explicit IDs. */
    public static String physicalGroup(Map<String, RollingStockLightOverride> overrides,
        String fixtureId, String legacyGroup)
    {
        RollingStockLightOverride member = overrides.get(fixtureId);
        if (member != null && member.group() != null)
        {
            return member.group().isEmpty() ? null : member.group().toLowerCase(Locale.ROOT);
        }
        return legacyGroup == null ? null : legacyGroup.toLowerCase(Locale.ROOT);
    }

    /**
     * Explicit JSON membership delegates all configurable settings to the shared entry.
     * Dormant member overrides remain available after clearing membership. Older model-only
     * groups retain their member-default composition for compatibility.
     */
    public static RollingStockLightOverride physicalOverride(
        Map<String, RollingStockLightOverride> overrides, String fixtureId, String group)
    {
        RollingStockLightOverride member = overrides.get(fixtureId);
        if (group == null)
        {
            return member;
        }
        RollingStockLightOverride shared = overrides.get(group);
        if (shared == null || shared == member)
        {
            return member;
        }
        if (member != null && member.group() != null && member.group().isEmpty() == false)
        {
            return shared;
        }
        if (member == null)
        {
            return shared;
        }
        // Surface availability stays member-owned; only shared effect behavior takes precedence.
        RollingStockLightOverride merged = member.merge(shared);
        boolean enabled = shared.enabled();
        if (member.availabilityOverridden())
        {
            enabled = member.enabled();
        }
        return new RollingStockLightOverride(enabled,
            member.availabilityOverridden() || shared.availabilityOverridden(),
            merged.behavior(), group, merged.fixtureType());
    }

    /** Resolves shared physical-effect settings consistently for rendering and lighting queries. */
    static RollingStockLightOverride resolveOverride(
        Map<String, RollingStockLightOverride> overrides, String fixtureId)
    {
        return physicalOverride(overrides, fixtureId, physicalGroup(overrides, fixtureId, null));
    }

    static RollingStockLightDefinition resolveDefinition(
        Map<String, RollingStockLightOverride> overrides,
        RollingStockLightDefinition baseline)
    {
        return resolveDefinition(overrides, baseline, null);
    }

    /** Uses the same legacy/JSON group precedence for pre-render queries as for visible parts. */
    public static RollingStockLightDefinition resolveDefinition(
        Map<String, RollingStockLightOverride> overrides,
        RollingStockLightDefinition baseline, String legacyGroup)
    {
        RollingStockLightOverride override = physicalOverride(overrides, baseline.id(),
            physicalGroup(overrides, baseline.id(), legacyGroup));
        if (override != null && override.fixtureType() != null)
        {
            LightFixtureType type = override.fixtureType();
            baseline = baseline.toBuilder(type.behavior().controlCircuit()).build();
            if (type == LightFixtureType.INSTRUMENT)
            {
                baseline = type.behavior().apply(baseline).toBuilder().instrument(true).build();
            }
        }
        if (baseline.instrument())
        {
            return resolveInstrumentDefinition(override, baseline);
        }
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
            RollingStockLightOverride override = resolveOverride(overrides, base.id());
            String partName = base.taggedPartName();
            known.add(base.id());
            if (partName != null && partName.trim().isEmpty() == false)
            {
                known.add(partName);
            }
            boolean enabled;
            RollingStockLightDefinition definition = resolveDefinition(overrides, base);
            if (definition.instrument())
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
