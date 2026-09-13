package train.common.api;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Immutable Java-authored collection of default and per-skin lighting exceptions for one stock.
 * The builder records a stable stock scope separately from model-local fixture keys, normalizes
 * skin keys once, supports vararg fixture groups, and seals every returned
 * {@link RollingStockSkinLighting}.
 * Model extraction remains authoritative; profiles contain only genuine behavioral exceptions.
 */
public final class RollingStockSkinLightingProfiles
{
    /** Empty profile collection used by rolling stock without Java-authored exceptions. */
    public static final RollingStockSkinLightingProfiles EMPTY =
        new RollingStockSkinLightingProfiles(
            "",
            RollingStockSkinLighting.EMPTY,
            Collections.<String, RollingStockSkinLighting>emptyMap());

    private final String fixtureScope;
    private final RollingStockSkinLighting defaults;
    private final Map<String, RollingStockSkinLighting> skins;

    private RollingStockSkinLightingProfiles(
        String fixtureScope,
        RollingStockSkinLighting defaults,
        Map<String, RollingStockSkinLighting> skins)
    {
        this.fixtureScope = fixtureScope;
        this.defaults = defaults;
        this.skins = skins;
    }

    /** Starts a Java profile declaration for a scope such as {@code bap:u30bh}. */
    public static Builder builder(String fixtureScope)
    {
        return new Builder(fixtureScope);
    }

    /** Returns the sealed profile for a case-insensitive skin key, or shared defaults. */
    public RollingStockSkinLighting forSkin(String skinName)
    {
        if (skinName == null)
        {
            return defaults;
        }
        RollingStockSkinLighting profile = skins.get(normalizeSkin(skinName));
        return profile == null ? defaults : profile;
    }

    /** Returns the sealed stock-wide defaults used when no skin-specific entry exists. */
    public RollingStockSkinLighting defaults()
    {
        return defaults;
    }

    /** Returns the namespaced stock scope that owns these model-local fixture keys. */
    public String fixtureScope()
    {
        return fixtureScope;
    }

    private static String normalizeSkin(String value)
    {
        return value.trim().toLowerCase(Locale.ROOT);
    }

    /** Mutable declaration builder; {@link #build()} returns detached immutable profiles. */
    public static final class Builder
    {
        private final String fixtureScope;
        private final RollingStockSkinLighting defaults = new RollingStockSkinLighting();
        private final Map<String, RollingStockSkinLighting> skins =
            new LinkedHashMap<String, RollingStockSkinLighting>();

        private Builder(String fixtureScope)
        {
            if (fixtureScope == null || fixtureScope.trim().isEmpty())
            {
                throw new IllegalArgumentException("Fixture scope must not be blank");
            }
            String normalized = fixtureScope.trim();
            this.fixtureScope = normalized.endsWith("/")
                                ? normalized.substring(0, normalized.length() - 1)
                                : normalized;
        }

        /** Selects stock-wide defaults that are composed beneath every named skin. */
        public SkinBuilder defaults()
        {
            return new SkinBuilder(this, defaults);
        }

        /** Selects or creates a case-insensitive named skin declaration. */
        public SkinBuilder skin(String skinName)
        {
            if (skinName == null || skinName.trim().isEmpty())
            {
                throw new IllegalArgumentException("Skin name must not be blank");
            }
            String key = normalizeSkin(skinName);
            RollingStockSkinLighting lighting = skins.get(key);
            if (lighting == null)
            {
                lighting = new RollingStockSkinLighting();
                skins.put(key, lighting);
            }
            return new SkinBuilder(this, lighting);
        }

        /** Selects a named skin; equivalent to {@link #skin(String)}. */
        public SkinBuilder setSkin(String skinName)
        {
            return skin(skinName);
        }

        /** Seals defaults and composed skin profiles into an immutable lookup. */
        public RollingStockSkinLightingProfiles build()
        {
            RollingStockSkinLighting sealedDefaults =
                RollingStockSkinLighting.immutableComposite(null, defaults);
            Map<String, RollingStockSkinLighting> sealed =
                new LinkedHashMap<String, RollingStockSkinLighting>();
            for (Map.Entry<String, RollingStockSkinLighting> entry : skins.entrySet())
            {
                sealed.put(
                    entry.getKey(),
                    RollingStockSkinLighting.immutableComposite(defaults, entry.getValue()));
            }
            return new RollingStockSkinLightingProfiles(
                       fixtureScope, sealedDefaults, Collections.unmodifiableMap(sealed));
        }

        private String fixtureId(String fixture)
        {
            if (fixture == null || fixture.trim().isEmpty())
            {
                throw new IllegalArgumentException("Fixture name must not be blank");
            }
            String normalized = fixture.trim();
            return normalized;
        }
    }

    /** Fluent operations applied to one default or named-skin declaration. */
    public static final class SkinBuilder
    {
        private final Builder parent;
        private final RollingStockSkinLighting lighting;

        private SkinBuilder(Builder parent, RollingStockSkinLighting lighting)
        {
            this.parent = parent;
            this.lighting = lighting;
        }

        /** Returns to the parent builder to select another skin or build the lookup. */
        public Builder endSkin()
        {
            return parent;
        }

        /**
         * Ends the current skin implicitly and selects the next named skin declaration.
         * This permits a linear {@code setSkin(...)} chain without explicit end markers.
         */
        public SkinBuilder setSkin(String skinName)
        {
            return parent.skin(skinName);
        }

        /** Ends the current skin implicitly and selects another skin using the short alias. */
        public SkinBuilder skin(String skinName)
        {
            return setSkin(skinName);
        }

        /** Ends the current skin implicitly and seals the complete profile collection. */
        public RollingStockSkinLightingProfiles build()
        {
            return parent.build();
        }

        /** Explicitly enables or disables a fixture while retaining automatic behavior. */
        public SkinBuilder enabled(String fixture, boolean enabled)
        {
            lighting.setLightEnabled(parent.fixtureId(fixture), enabled);
            return this;
        }

        /** Applies one packed {@code 0xRRGGBB} color to every supplied fixture. */
        public SkinBuilder color(int color, String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightColor(parent.fixtureId(fixture), color);
            }
            return this;
        }

        /** Assigns one operational fixture type to every supplied physical fixture. */
        public SkinBuilder fixtureType(LightFixtureType type, String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightFixtureType(parent.fixtureId(fixture), type);
            }
            return this;
        }

        /** Assigns the steady-headlight preset to every supplied fixture. */
        public SkinBuilder steadyHeadlight(String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setSteadyHeadlight(parent.fixtureId(fixture));
            }
            return this;
        }

        /** Assigns the Gyralite preset to every supplied fixture. */
        public SkinBuilder gyralite(String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightGyralite(parent.fixtureId(fixture));
            }
            return this;
        }

        /** Assigns the Mars-light preset to every supplied fixture. */
        public SkinBuilder mars(String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightMars(parent.fixtureId(fixture));
            }
            return this;
        }

        /** Assigns a non-projecting marker preset and color to every supplied fixture. */
        public SkinBuilder marker(int color, String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightMarker(parent.fixtureId(fixture), color);
            }
            return this;
        }

        /** Makes every supplied fixture source-emissive without changing its operational role. */
        public SkinBuilder emissiveOnly(String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightBehavior(
                    parent.fixtureId(fixture),
                    RollingStockLightBehaviorOverride.emissiveOnly());
            }
            return this;
        }

        /** Assigns one alternating-ditch phase and response to every supplied fixture. */
        public SkinBuilder alternatingDitch(
            int phase,
            RollingStockLightFunction.LampResponse response,
            String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightAlternatingDitch(
                    parent.fixtureId(fixture), phase, response);
            }
            return this;
        }

        /** Applies an advanced partial behavior override to every supplied fixture. */
        public SkinBuilder behavior(
            RollingStockLightBehaviorOverride behavior, String... fixtures)
        {
            for (String fixture : required(fixtures))
            {
                lighting.setLightBehavior(parent.fixtureId(fixture), behavior);
            }
            return this;
        }

        /**
         * Applies an activation policy to one or more fixtures for this skin.
         *
         * @param policy circuit-only or facing-headlight policy
         * @param fixtures fixture ids receiving the override
         * @return this skin builder
         */
        public SkinBuilder activationPolicy(
            RollingStockLightActivationPolicy policy, String... fixtures)
        {
            RollingStockLightBehaviorOverride behavior =
                RollingStockLightBehaviorOverride.builder().activationPolicy(policy).build();
            return behavior(behavior, fixtures);
        }

        /**
         * Configures the temporary horn response for supplied ditch-light fixtures.
         *
         * @param mode affected headlight end or ends
         * @param function optional temporary function; {@code null} preserves an existing
         *     alternating function and otherwise selects the standard alternator
         * @param phase optional fixed phase {@code 0..1}; {@code null} derives left/right from position
         * @param fixtures fixture ids receiving the override
         * @return this skin builder
         */
        public SkinBuilder ditchHornResponse(
            RollingStockDitchHornMode mode,
            RollingStockLightFunction function,
            Integer phase,
            String... fixtures)
        {
            RollingStockLightBehaviorOverride behavior =
                RollingStockLightBehaviorOverride.builder()
                .ditchHornResponse(mode, function, phase)
                .build();
            return behavior(behavior, fixtures);
        }

        /**
         * Overrides the active fixture's Minecraft lightmap floor.
         *
         * @param value minimum lightmap component value in {@code 0..240}
         * @param fixtures fixture ids receiving the override
         * @return this skin builder
         */
        public SkinBuilder lightmapFloor(int value, String... fixtures)
        {
            RollingStockLightBehaviorOverride behavior =
                RollingStockLightBehaviorOverride.builder().lightmapFloor(value).build();
            return behavior(behavior, fixtures);
        }

        private static String[] required(String[] fixtures)
        {
            if (fixtures == null || fixtures.length == 0)
            {
                throw new IllegalArgumentException("At least one fixture is required");
            }
            return fixtures;
        }
    }
}
