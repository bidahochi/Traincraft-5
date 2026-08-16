package train.client.render;

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
final class SkinLightingResolver {
    private SkinLightingResolver() {}

    static RollingStockLightDefinition resolveDefinition(
            Map<String, RollingStockLightOverride> overrides,
            RollingStockLightDefinition baseline) {
        RollingStockLightOverride override = overrides.get(baseline.id());
        return override == null || override.behavior() == null
                ? baseline
                : override.behavior().apply(baseline);
    }

    static ResolvedSkinLighting resolveProfile(
            List<RollingStockLightDefinition> defaults,
            Map<String, RollingStockLightOverride> overrides,
            Visibility visibility) {
        List<RollingStockLightDefinition> active = new ArrayList<RollingStockLightDefinition>();
        Set<String> known = new HashSet<String>();
        Set<String> available = new HashSet<String>();
        for (RollingStockLightDefinition base : defaults) {
            RollingStockLightOverride override = overrides.get(base.id());
            String partName = base.taggedPartName();
            known.add(base.id());
            if (partName != null && partName.trim().isEmpty() == false) {
                known.add(partName);
            }
            boolean enabled;
            if (override != null && override.availabilityOverridden()) {
                enabled = override.enabled();
            } else if (base.taggedUvRegions().isEmpty()) {
                enabled = true;
            } else {
                enabled = visibility.visible(base);
            }
            if (enabled == false) continue;
            RollingStockLightDefinition definition =
                    override != null && override.behavior() != null
                            ? override.behavior().apply(base)
                            : base;
            active.add(definition);
            available.add(definition.id());
            if (partName != null && partName.trim().isEmpty() == false) {
                available.add(partName);
            }
        }
        return new ResolvedSkinLighting(active, known, available);
    }

    interface Visibility {
        boolean visible(RollingStockLightDefinition definition);
    }
}
