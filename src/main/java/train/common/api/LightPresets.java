package train.common.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/** Shared built-in authoring presets, expanded from the same factories used by Java builders. */
public final class LightPresets
{
    private static final Map<String, RollingStockLightOverride> VALUES = createPresets();

    private LightPresets()
    {
    }

    /** Returns an immutable preset; unknown names are rejected at the resource boundary. */
    public static RollingStockLightOverride named(String name)
    {
        RollingStockLightOverride value = VALUES.get(name.toLowerCase(Locale.ROOT));
        if (value == null)
        {
            throw new IllegalArgumentException("Unknown lighting preset '" + name + "'");
        }
        return value;
    }

    /** Available names and defaults, also usable by development authoring tools. */
    public static Map<String, RollingStockLightOverride> values()
    {
        return VALUES;
    }

    private static Map<String, RollingStockLightOverride> createPresets()
    {
        Map<String, RollingStockLightOverride> values = new LinkedHashMap<String, RollingStockLightOverride>();
        for (LightFixtureType type : LightFixtureType.values())
        {
            values.put(type.name().toLowerCase(Locale.ROOT),
                new RollingStockLightOverride(true, false, type.behavior(), null, type));
        }
        values.put("gyralite", RollingStockLightOverride.behavior(RollingStockLightBehaviorOverride.gyralite()));
        values.put("mars", RollingStockLightOverride.behavior(RollingStockLightBehaviorOverride.mars()));
        values.put("emissive_only", RollingStockLightOverride.behavior(RollingStockLightBehaviorOverride.emissiveOnly()));
        values.put("alternating_ditch", RollingStockLightOverride.behavior(RollingStockLightBehaviorOverride.alternatingDitch(0)));
        values.put("horn_alternating_ditch", RollingStockLightOverride.behavior(
            RollingStockLightBehaviorOverride.hornAlternatingDitch(0, RollingStockLightFunction.LampResponse.INCANDESCENT)));
        return Collections.unmodifiableMap(values);
    }
}
