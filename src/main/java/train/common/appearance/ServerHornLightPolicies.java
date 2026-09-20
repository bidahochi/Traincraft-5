package train.common.appearance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import train.common.Traincraft;
import train.common.api.HornLightPolicyOverride;
import train.common.api.RollingStockHornLightResponsePolicy;
import train.common.library.register.ITrainRecord;
import train.common.utils.SharedJsonParser;

/**
 * Server trigger policies from installed classpath assets, never client resource packs.
 * Only resolved policies and the compatibility dictionary survive loading. One immutable
 * snapshot makes replacements visible to the server without changing active countdowns.
 */
public final class ServerHornLightPolicies
{
    private static volatile Map<String, StockPolicies> policies = Collections.emptyMap();

    private ServerHornLightPolicies()
    {
    }

    /**
     * Builds server-session definitions after stock registration, before entity gameplay.
     * Each invalid stock is diagnosed and omitted, retaining its Java fallback. Publication
     * happens once after all stocks have been processed; no partial map becomes visible.
     */
    public static void loadInstalled()
    {
        Map<String, StockPolicies> loaded = new HashMap<String, StockPolicies>();
        for (ITrainRecord record : Traincraft.traincraftRegistry.getAllTrains().values())
        {
            String stock = StockLightingIdentity.resolve(record);
            if (stock.isEmpty())
            {
                continue;
            }
            try
            {
                JsonObject lighting = installedDocument(stock, "lighting.json");
                if (lighting != null)
                {
                    loaded.put(stock, prepare(stock, lighting,
                        installedDocument(stock, "legacy_skin_ids.json"), HornLightPolicyRegistry.INSTALLED));
                }
            }
            catch (IOException | IllegalArgumentException | JsonParseException exception)
            {
                Traincraft.tcLog.warn("Horn policy rejected for " + stock
                    + "; retaining legacy trigger behavior. Check installed lighting/mapping JSON", exception);
            }
        }
        policies = Collections.unmodifiableMap(loaded);
    }

    /** Returns the precomputed server policy; null preserves a stock's legacy Java fallback. */
    public static RollingStockHornLightResponsePolicy resolve(String stock, String skinId)
    {
        StockPolicies entry = forStock(stock);
        if (entry == null)
        {
            return null;
        }
        return entry.resolve(skinId);
    }

    /** Captures mapping and policies from one reload generation, or null when the stock has no accepted document. */
    public static StockPolicies forStock(String stock)
    {
        return policies.get(stock);
    }

    /**
     * Validates then atomically replaces one stock for a trusted local development reload.
     * Callers must gate this to a local integrated development server; never expose it to packets.
     */
    public static void reloadDevelopment(String stock,
        JsonObject lighting, JsonObject mapping)
    {
        reloadDevelopment(stock, lighting, mapping, HornLightPolicyRegistry.INSTALLED);
    }

    /**
     * Resolves and atomically publishes one stock against the supplied source registry.
     * Validation failure leaves the previous snapshot intact. The caller enforces private
     * integrated development use; this method does not reset entity timers or publish packets.
     */
    public static synchronized void reloadDevelopment(String stock,
        JsonObject lighting, JsonObject mapping, HornLightPolicyRegistry registry)
    {
        StockPolicies replacement = prepare(stock, lighting, mapping, registry);
        Map<String, StockPolicies> next = new HashMap<String, StockPolicies>(policies);
        next.put(stock, replacement);
        policies = Collections.unmodifiableMap(next);
    }

    /**
     * Validates the complete document before retaining resolved skin policies and its dictionary.
     * No raw JSON, model data or registry reference escapes into the runtime snapshot.
     */
    private static StockPolicies prepare(String stock, JsonObject lighting, JsonObject mapping,
        HornLightPolicyRegistry registry)
    {
        RollingStockAppearanceLighting document = RollingStockAppearanceJson.parse(stock, lighting, registry);
        LegacySkinMapping dictionary = LegacySkinMapping.parse(stock,
            mapping == null ? LegacySkinMapping.emptyDocument() : mapping);
        Map<String, RollingStockHornLightResponsePolicy> resolved =
            new HashMap<String, RollingStockHornLightResponsePolicy>();
        for (String skinId : document.skins().keySet())
        {
            HornLightPolicyOverride policy = document.resolve(skinId).hornResponsePolicy();
            if (policy != null)
            {
                resolved.put(skinId, policy.resolve(registry));
            }
        }
        HornLightPolicyOverride defaults = document.defaults().hornResponsePolicy();
        return new StockPolicies(defaults == null ? null : defaults.resolve(registry), resolved, dictionary);
    }

    /**
     * Reads the first present installed layout, closing its input before returning.
     * Missing documents return null. Malformed content fails this stock's load rather than
     * consulting client resource packs or silently selecting another installed layout.
     */
    private static JsonObject installedDocument(String stock, String file) throws IOException
    {
        String namespace = stock.substring(0, stock.indexOf(':'));
        String[] paths =
        {
            LegacySkinMapping.resourcePath(stock, file),
            LegacySkinMapping.previousResourcePath(stock, file),
            "rolling_stock_appearance/" + stock.substring(stock.indexOf(':') + 1) + ".json"
        };
        for (String path : paths)
        {
            if (path.startsWith("rolling_stock_appearance/") && "lighting.json".equals(file) == false)
            {
                continue;
            }
            String resourcePath = "/assets/" + namespace + "/" + path;
            InputStream stream = ServerHornLightPolicies.class.getResourceAsStream(resourcePath);
            if (stream == null)
            {
                continue;
            }
            try (Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8))
            {
                JsonElement value = SharedJsonParser.INSTANCE.parse(reader);
                if (value == null || value.isJsonObject() == false)
                {
                    throw new IllegalArgumentException("Expected object at " + resourcePath);
                }
                return value.getAsJsonObject();
            }
        }
        return null;
    }

    /** Immutable skin-keyed policies and the matching transitional dictionary for one stock. */
    public static final class StockPolicies
    {
        private final RollingStockHornLightResponsePolicy defaults;
        private final Map<String, RollingStockHornLightResponsePolicy> skins;
        private final LegacySkinMapping legacyMapping;

        private StockPolicies(RollingStockHornLightResponsePolicy defaults,
            Map<String, RollingStockHornLightResponsePolicy> skins, LegacySkinMapping legacyMapping)
        {
            this.defaults = defaults;
            this.skins = Collections.unmodifiableMap(
                new HashMap<String, RollingStockHornLightResponsePolicy>(skins));
            this.legacyMapping = legacyMapping;
        }

        /** Resolves an exact skin key, falling back to stock defaults when no layer exists. */
        public RollingStockHornLightResponsePolicy resolve(String skinId)
        {
            RollingStockHornLightResponsePolicy policy = skins.get(skinId);
            return policy == null ? defaults : policy;
        }

        /** Supplies the immutable dictionary only to legacy-selection compatibility consumers. */
        public LegacySkinMapping legacyMapping()
        {
            return legacyMapping;
        }
    }
}
