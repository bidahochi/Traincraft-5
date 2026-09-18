package train.common.appearance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import train.common.api.RollingStockSkinLighting;

/**
 * Immutable lighting portion of one merged rolling-stock appearance document.
 *
 * <p>The object retains stock defaults, reusable named profiles, and skin-local layers separately
 * so development tools can inspect authored inheritance without flattening it. Runtime callers use
 * {@link #resolve(String)} to obtain the same model-default, stock-default, profile, and skin-local
 * composition used by rendering.</p>
 */
public final class RollingStockAppearanceLighting
{
    private final String stockId;
    private final RollingStockSkinLighting defaults;
    private final Map<String, RollingStockSkinLighting> profiles;
    private final Map<String, Skin> skins;
    private final Map<String, Skin> skinsByAlias;
    private final Set<String> fixtureIds;

    /**
     * Creates an immutable merged lighting document.
     *
     * @param stockId namespaced rolling-stock identity
     * @param defaults stock-wide fixture overrides
     * @param profiles namespaced reusable lighting profiles
     * @param skins namespaced skin declarations
     */
    public RollingStockAppearanceLighting(
        String stockId,
        RollingStockSkinLighting defaults,
        Map<String, RollingStockSkinLighting> profiles,
        Map<String, Skin> skins)
    {
        this.stockId = stockId;
        this.defaults = defaults == null ? RollingStockSkinLighting.EMPTY : defaults;
        this.profiles = immutableProfiles(profiles);
        this.skins = immutableSkins(skins);
        Map<String, Skin> aliases = new LinkedHashMap<String, Skin>();
        for (Skin skin : this.skins.values())
        {
            aliases.put(normalize(skin.id()), skin);
            for (String alias : skin.legacyAliases())
            {
                aliases.put(normalize(alias), skin);
            }
        }
        skinsByAlias = Collections.unmodifiableMap(aliases);
        Set<String> declared = new LinkedHashSet<String>(this.defaults.lightOverrides().keySet());
        for (RollingStockSkinLighting profile : this.profiles.values())
        {
            declared.addAll(profile.lightOverrides().keySet());
        }
        for (Skin skin : this.skins.values())
        {
            declared.addAll(skin.localLighting().lightOverrides().keySet());
        }
        fixtureIds = Collections.unmodifiableSet(declared);
    }

    /**
     * Returns all declared fixture names across skins, computed once per document.
     * Batch eligibility uses this stable set so switching skins does not rebuild model layouts.
     */
    public Set<String> fixtureIds()
    {
        return fixtureIds;
    }

    /** @return namespaced rolling-stock identity represented by this document */
    public String stockId()
    {
        return stockId;
    }

    /** @return immutable stock-wide fixture overrides */
    public RollingStockSkinLighting defaults()
    {
        return defaults;
    }

    /** @return immutable namespaced reusable profile map */
    public Map<String, RollingStockSkinLighting> profiles()
    {
        return profiles;
    }

    /** @return immutable namespaced skin declaration map */
    public Map<String, Skin> skins()
    {
        return skins;
    }

    /**
     * Resolves one current or future skin identity through the complete authored layer order.
     *
     * @param skinIdentity namespaced skin id or current case-insensitive legacy skin key
     * @return immutable effective authored lighting, excluding model defaults and runtime state
     */
    public RollingStockSkinLighting resolve(String skinIdentity)
    {
        Skin skin = skinIdentity == null ? null : skinsByAlias.get(normalize(skinIdentity));
        if (skin == null)
        {
            return defaults;
        }
        RollingStockSkinLighting profile = profiles.get(skin.profileId());
        RollingStockSkinLighting withProfile =
            RollingStockSkinLighting.immutableComposite(defaults, profile);
        return RollingStockSkinLighting.immutableComposite(withProfile, skin.localLighting());
    }

    private static Map<String, RollingStockSkinLighting> immutableProfiles(
        Map<String, RollingStockSkinLighting> values)
    {
        if (values == null || values.isEmpty())
        {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(
            new LinkedHashMap<String, RollingStockSkinLighting>(values));
    }

    private static Map<String, Skin> immutableSkins(Map<String, Skin> values)
    {
        if (values == null || values.isEmpty())
        {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap<String, Skin>(values));
    }

    private static String normalize(String value)
    {
        return value == null ? "" : value.trim().toLowerCase(Locale.ROOT);
    }

    /** Immutable namespaced skin entry with legacy aliases and one optional profile reference. */
    public static final class Skin
    {
        private final String id;
        private final List<String> legacyAliases;
        private final String profileId;
        private final RollingStockSkinLighting localLighting;

        /**
         * Creates one skin declaration.
         *
         * @param id namespaced stable skin id
         * @param legacyAliases current integer/color-system names such as {@code Purple}
         * @param profileId optional namespaced reusable profile id
         * @param localLighting skin-local fixture overrides
         */
        public Skin(
            String id,
            List<String> legacyAliases,
            String profileId,
            RollingStockSkinLighting localLighting)
        {
            this.id = id;
            this.legacyAliases =
                legacyAliases == null
                ? Collections.<String>emptyList()
                : Collections.unmodifiableList(new ArrayList<String>(legacyAliases));
            this.profileId = profileId;
            this.localLighting =
                localLighting == null ? RollingStockSkinLighting.EMPTY : localLighting;
        }

        /** @return namespaced stable skin id */
        public String id()
        {
            return id;
        }

        /** @return immutable current-skin-system aliases */
        public List<String> legacyAliases()
        {
            return legacyAliases;
        }

        /** @return namespaced profile id, or {@code null} when none is assigned */
        public String profileId()
        {
            return profileId;
        }

        /** @return immutable skin-local fixture override layer */
        public RollingStockSkinLighting localLighting()
        {
            return localLighting;
        }
    }
}

