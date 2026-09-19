package train.common.api;

import java.util.Collections;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

/**
 * Lighting metadata owned by one authored rolling-stock skin.
 *
 * <p>This is the Java 8/FoxTC equivalent of the modern lighting {@code TransportSkin}. It
 * deliberately contains no model-part discovery: every key is a stable fixture id authored by the
 * model.
 */
public final class RollingStockSkinLighting
{
    public static final RollingStockSkinLighting EMPTY = new RollingStockSkinLighting(true);

    // Preserve authored spelling without allocating lowercase strings during fixture lookups.
    private final Map<String, RollingStockLightOverride> lightOverrides =
        new TreeMap<String, RollingStockLightOverride>(Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER));
    private final Map<String, RollingStockLightOverride> lightOverridesView =
        Collections.unmodifiableMap(lightOverrides);
    private int lightingRevision;
    private final boolean immutable;

    /** Creates a mutable skin-lighting override collection with revision zero. */
    public RollingStockSkinLighting()
    {
        this(false);
    }

    private RollingStockSkinLighting(boolean immutable)
    {
        this.immutable = immutable;
    }

    /** Overrides fixture availability without discarding an existing behavior override. */
    public RollingStockSkinLighting setLightEnabled(String emitterId, boolean enabled)
    {
        checkMutable();
        RollingStockLightOverride current = lightOverrides.get(emitterId);
        lightOverrides.put(
            emitterId,
            new RollingStockLightOverride(
                enabled, true, current == null ? null : current.behavior(),
                current == null ? null : current.group(),
                current == null ? null : current.fixtureType()));
        lightingRevision++;
        return this;
    }

    /** Merges a partial behavior override and increments the cache-facing revision. */
    public RollingStockSkinLighting setLightBehavior(
        String emitterId, RollingStockLightBehaviorOverride behavior)
    {
        checkMutable();
        if (behavior == null)
        {
            throw new NullPointerException("behavior");
        }
        RollingStockLightOverride current = lightOverrides.get(emitterId);
        RollingStockLightBehaviorOverride combined =
            current == null || current.behavior() == null
            ? behavior
            : current.behavior().merge(behavior);
        lightOverrides.put(
            emitterId,
            new RollingStockLightOverride(
                current == null || current.enabled(),
                current != null && current.availabilityOverridden(),
                combined, current == null ? null : current.group(),
                current == null ? null : current.fixtureType()));
        lightingRevision++;
        return this;
    }

    /** Sets shared lighting-effect identity; null inherits and an empty string clears grouping. */
    public RollingStockSkinLighting setLightGroup(String emitterId, String group)
    {
        checkMutable();
        RollingStockLightOverride current = lightOverrides.get(emitterId);
        RollingStockLightOverride next = new RollingStockLightOverride(true, false, null, group);
        if (current != null)
        {
            next = current.merge(next);
        }
        lightOverrides.put(emitterId, next);
        lightingRevision++;
        return this;
    }

    /** Assigns an operational role without changing the model-owned fixture identity. */
    public RollingStockSkinLighting setLightFixtureType(
        String emitterId, LightFixtureType fixtureType)
    {
        if (fixtureType == null)
        {
            throw new NullPointerException("fixtureType");
        }
        setLightBehavior(emitterId, fixtureType.behavior());
        RollingStockLightOverride current = lightOverrides.get(emitterId);
        lightOverrides.put(emitterId, new RollingStockLightOverride(current.enabled(),
            current.availabilityOverridden(), current.behavior(), current.group(), fixtureType));
        return this;
    }

    /** Applies shared preset defaults while retaining lower-layer properties the preset does not own. */
    public RollingStockSkinLighting setLightPreset(String emitterId, String preset)
    {
        checkMutable();
        RollingStockLightOverride next = LightPresets.named(preset);
        RollingStockLightOverride current = lightOverrides.get(emitterId);
        if (current != null)
        {
            next = current.merge(next);
        }
        lightOverrides.put(emitterId, next);
        lightingRevision++;
        return this;
    }

    /** Overrides the default fixture, source-glow, hotspot, and beam color. */
    public RollingStockSkinLighting setLightColor(String emitterId, int color)
    {
        return setLightBehavior(
                   emitterId,
                   RollingStockLightBehaviorOverride.builder().color(color).build());
    }

    /** Overrides detected beam reach without changing its width or other behavior. */
    public RollingStockSkinLighting setLightBeamLength(String emitterId, float length)
    {
        return setLightBehavior(
                   emitterId,
                   RollingStockLightBehaviorOverride.builder().beamLength(length).build());
    }

    /**
     * Overrides model-authored beam aim without changing the fixture's source face or glow.
     *
     * <p>This setting is optional. When omitted, the model rotation or automatically detected face
     * direction remains in effect.
     */
    public RollingStockSkinLighting setLightBeamRotation(
        String emitterId, float pitchDegrees, float yawDegrees)
    {
        return setLightBehavior(
                   emitterId,
                   RollingStockLightBehaviorOverride.builder()
                   .beamRotation(pitchDegrees, yawDegrees)
                   .build());
    }

    public RollingStockSkinLighting setLightFunction(
        String emitterId, RollingStockLightFunction function)
    {
        if (function == null)
        {
            throw new NullPointerException("function");
        }
        RollingStockLightBehaviorOverride behavior;
        switch (function.pattern())
        {
            case GYRALITE:
                behavior = RollingStockLightBehaviorOverride.gyralite();
                break;
            case MARS:
                behavior = RollingStockLightBehaviorOverride.mars();
                break;
            case ALTERNATING:
                behavior = RollingStockLightBehaviorOverride.alternatingDitch(function);
                break;
            case FLASH:
            case PHASED:
                behavior = RollingStockLightBehaviorOverride.beacon(function);
                break;
            default:
                behavior = RollingStockLightBehaviorOverride.builder().function(function).build();
        }
        return setLightBehavior(emitterId, behavior);
    }

    public RollingStockSkinLighting setLightMarker(String emitterId, int color)
    {
        return setLightBehavior(emitterId, RollingStockLightBehaviorOverride.marker(color));
    }

    public RollingStockSkinLighting setLightGyralite(String emitterId)
    {
        return setLightBehavior(emitterId, RollingStockLightBehaviorOverride.gyralite());
    }

    public RollingStockSkinLighting setLightMars(String emitterId)
    {
        return setLightBehavior(emitterId, RollingStockLightBehaviorOverride.mars());
    }

    public RollingStockSkinLighting setLightAlternatingDitch(String emitterId, int phase)
    {
        return setLightAlternatingDitch(
                   emitterId, phase, RollingStockLightFunction.LampResponse.INCANDESCENT);
    }

    public RollingStockSkinLighting setLightAlternatingDitch(
        String emitterId, int phase, RollingStockLightFunction.LampResponse response)
    {
        return setLightBehavior(
                   emitterId, RollingStockLightBehaviorOverride.alternatingDitch(phase, response));
    }

    public RollingStockSkinLighting setSteadyHeadlight(String emitterId)
    {
        return setLightBehavior(emitterId, RollingStockLightBehaviorOverride.steadyHeadlight());
    }

    /** Returns a live read-only map; mutations occur only through this class's setters. */
    public Map<String, RollingStockLightOverride> lightOverrides()
    {
        return lightOverridesView;
    }

    /** Returns the monotonic revision used to invalidate resolved-lighting caches. */
    public int lightingRevision()
    {
        return lightingRevision;
    }

    /** Creates a sealed profile by composing skin-specific values over shared defaults. */
    public static RollingStockSkinLighting immutableComposite(
        RollingStockSkinLighting defaults, RollingStockSkinLighting skin)
    {
        RollingStockSkinLighting result = new RollingStockSkinLighting(true);
        if (defaults != null)
        {
            result.lightOverrides.putAll(defaults.lightOverrides);
            result.lightingRevision += defaults.lightingRevision;
        }
        if (skin != null)
        {
            for (Map.Entry<String, RollingStockLightOverride> entry
                    : skin.lightOverrides.entrySet())
            {
                String id = entry.getKey();
                RollingStockLightOverride next = entry.getValue();
                RollingStockLightOverride previous = result.lightOverrides.get(id);
                RollingStockLightOverride combined = next;
                if (previous != null)
                {
                    combined = previous.merge(next);
                }
                result.lightOverrides.put(id, combined);
            }
            result.lightingRevision += skin.lightingRevision;
        }
        return result.lightOverrides.isEmpty() ? EMPTY : result;
    }

    private void checkMutable()
    {
        if (immutable)
        {
            throw new UnsupportedOperationException("The empty skin-lighting profile is immutable");
        }
    }

}
