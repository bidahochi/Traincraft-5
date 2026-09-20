package train.client.render.lighting;

import train.common.appearance.HornLightPolicyRegistry;

import org.apache.logging.log4j.LogManager;
import train.common.utils.SharedJsonParser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import train.common.appearance.LegacySkinMapping;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import train.common.api.RollingStockSkinLighting;
import train.common.appearance.IRollingStockAppearanceProvider;
import train.common.appearance.RollingStockAppearanceJson;
import train.common.appearance.RollingStockAppearanceLighting;

/**
 * Client-only lazy resource adapter for portable rolling-stock appearance documents.
 *
 * <p>Each stock is loaded at most once per resource generation. Parsing, priority merging, string
 * normalization, and diagnostics stay on this cold path; rendering receives cached immutable
 * lighting maps. Missing documents are cached as true misses until the next resource reload.</p>
 */
public final class ClientRollingStockAppearanceLoader
    implements IRollingStockAppearanceProvider
{
    public static final ClientRollingStockAppearanceLoader INSTANCE =
        new ClientRollingStockAppearanceLoader();

    private static final String APPEARANCE_DIRECTORY = "rolling_stock_appearance/";
    private final IResourceManager resourceManager;

    private final Map<String, CacheEntry> cache =
        new LinkedHashMap<String, CacheEntry>();
    private final Map<String, LegacySkinMapping> mappings =
        new LinkedHashMap<String, LegacySkinMapping>();
    private final Map<String, Map<Integer, String>> skinKeys =
        new LinkedHashMap<String, Map<Integer, String>>();

    private ClientRollingStockAppearanceLoader()
    {
        this(null);
    }

    /** Uses an explicit resource stack for tooling; null follows Minecraft's current stack. */
    public ClientRollingStockAppearanceLoader(IResourceManager resourceManager)
    {
        this.resourceManager = resourceManager;
    }

    /** Resolves resources only on the cold load path, not during fixture evaluation. */
    private IResourceManager resources()
    {
        return resourceManager == null ? Minecraft.getMinecraft().getResourceManager() : resourceManager;
    }

    /** Clears all parsed documents and resolved skin lookups for a new resource generation. */
    public synchronized void clear()
    {
        cache.clear();
        mappings.clear();
        skinKeys.clear();
    }

    /**
     * Re-reads one stock from the active resource stack on the client thread.
     * A temporary loader validates the replacement before publication; if no valid lighting
     * document is available, all currently accepted caches remain unchanged. Other stocks and
     * model/texture caches are untouched. Entities observe the new immutable lighting instance
     * on their next lookup and refresh their resolved fixture state automatically.
     *
     * @return true when a valid replacement was published; false retains the previous state
     */
    public synchronized boolean reloadStock(String stockId)
    {
        LegacySkinMapping.requireId(stockId);
        ClientRollingStockAppearanceLoader replacement =
            new ClientRollingStockAppearanceLoader(resources());
        CacheEntry entry = replacement.load(stockId);
        if (entry.document == null)
        {
            return false;
        }
        LegacySkinMapping mapping = replacement.mapping(stockId);
        cache.put(stockId, entry);
        mappings.put(stockId, mapping);
        skinKeys.remove(stockId);
        return true;
    }

    /**
     * Publishes an explicitly supplied authoring preview without reading a stale build copy.
     * Both documents validate before any cache changes. A missing mapping uses the active
     * resource stack. This intentionally previews the supplied document, not resource-pack
     * overlays; ordinary resource reload restores the active stack.
     */
    public synchronized void reloadStockFromDocuments(String stockId, JsonObject lighting, JsonObject mapping)
    {
        reloadStockFromDocuments(stockId, lighting, mapping, HornLightPolicyRegistry.INSTALLED);
    }

    /** Validates a development preview using the same named policy definitions as its server candidate. */
    public synchronized void reloadStockFromDocuments(String stockId, JsonObject lighting, JsonObject mapping,
        HornLightPolicyRegistry registry)
    {
        LegacySkinMapping.requireId(stockId);
        RollingStockAppearanceLighting document = RollingStockAppearanceJson.parse(stockId, lighting, registry);
        LegacySkinMapping replacementMapping;
        if (mapping == null)
        {
            replacementMapping = new ClientRollingStockAppearanceLoader(resources()).mapping(stockId);
        }
        else
        {
            replacementMapping = LegacySkinMapping.parse(stockId, mapping);
        }
        cache.put(stockId, new CacheEntry(document));
        mappings.put(stockId, replacementMapping);
        skinKeys.remove(stockId);
    }

    /**
     * Resolves one stock/skin pair from a lazily loaded immutable appearance document.
     *
     * @return JSON-authored lighting, or {@code null} when no visual overrides are available
     */
    @Override
    public synchronized RollingStockSkinLighting resolveLighting(
        String stockId, String skinIdentity)
    {
        CacheEntry entry = cache.get(stockId);
        if (entry == null)
        {
            entry = load(stockId);
            cache.put(stockId, entry);
        }
        return entry.resolve(skinIdentity);
    }

    /** Client-thread cached compatibility resolution; no catalog or foreign-pack skin loading. */
    @Override
    public String resolveLegacySkin(String stockId, int color)
    {
        Map<Integer, String> resolved = skinKeys.get(stockId);
        if (resolved == null)
        {
            resolved = new LinkedHashMap<Integer, String>();
            skinKeys.put(stockId, resolved);
        }
        String key = resolved.get(color);
        if (key == null)
        {
            key = mapping(stockId).resolve(stockId, color);
            resolved.put(color, key);
        }
        return key;
    }

    /** Reads mapping contributions atomically in resource priority order and caches misses. */
    private LegacySkinMapping mapping(String stockId)
    {
        LegacySkinMapping cached = mappings.get(stockId);
        if (cached != null)
        {
            return cached;
        }
        ResourceLocation location = new ResourceLocation(
            stockId.substring(0, stockId.indexOf(':')),
            LegacySkinMapping.resourcePath(stockId, "legacy_skin_ids.json"));
        cached = readMapping(stockId, location);
        if (cached == null)
        {
            cached = readMapping(stockId, new ResourceLocation(location.getResourceDomain(),
                LegacySkinMapping.previousResourcePath(stockId, "legacy_skin_ids.json")));
        }
        if (cached == null)
        {
            cached = LegacySkinMapping.parse(LegacySkinMapping.emptyDocument());
        }
        mappings.put(stockId, cached);
        return cached;
    }

    /** Returns null when no valid contribution exists at this layout; never mixes layouts. */
    private LegacySkinMapping readMapping(String stockId, ResourceLocation location)
    {
        JsonObject accepted = LegacySkinMapping.emptyDocument();
        boolean found = false;
        try
        {
            List<IResource> resources = resources().getAllResources(location);
            for (IResource resource : resources)
            {
                try
                {
                    JsonObject contribution = readObject(resource, location);
                    LegacySkinMapping.parse(stockId, contribution);
                    RollingStockAppearanceJson.mergeObject(accepted, contribution);
                    found = true;
                }
                catch (IOException | IllegalArgumentException | JsonParseException exception)
                {
                    LogManager.getLogger("Traincraft").warn("Rejected legacy skin mapping {}: {}", location, exception.getMessage());
                }
            }
        }
        catch (IOException exception)
        {
            // A missing dictionary uses the existing string-style naming convention.
        }
        return found ? LegacySkinMapping.parse(accepted) : null;
    }

    /**
     * Returns the immutable loaded document for diagnostics without exposing cache mutation.
     *
     * @param stockId stable namespaced stock id
     * @return parsed document, or {@code null} when no valid contribution exists
     */
    public synchronized RollingStockAppearanceLighting document(String stockId)
    {
        CacheEntry entry = cache.get(stockId);
        if (entry == null)
        {
            entry = load(stockId);
            cache.put(stockId, entry);
        }
        return entry.document;
    }

    /** Returns the logical resource location used by every pack contributing to a stock. */
    public static ResourceLocation resourceLocation(String stockId)
    {
        int separator = stockId.indexOf(':');
        if (separator <= 0 || separator == stockId.length() - 1)
        {
            throw new IllegalArgumentException("Invalid rolling-stock appearance id " + stockId);
        }
        String namespace = stockId.substring(0, separator);
        return new ResourceLocation(namespace, LegacySkinMapping.resourcePath(stockId, "lighting.json"));
    }

    /** Loads, validates, and priority-merges all physical resources for one stock. */
    private CacheEntry load(String stockId)
    {
        ResourceLocation currentLocation;
        try
        {
            currentLocation = resourceLocation(stockId);
        }
        catch (IllegalArgumentException exception)
        {
            LogManager.getLogger("Traincraft").warn(exception.getMessage());
            return CacheEntry.MISSING;
        }
        CacheEntry current = load(stockId, currentLocation, false);
        if (current.document != null)
        {
            return current;
        }
        int separator = stockId.indexOf(':');
        CacheEntry previous = load(stockId, new ResourceLocation(currentLocation.getResourceDomain(),
            LegacySkinMapping.previousResourcePath(stockId, "lighting.json")), false);
        if (previous.document != null)
        {
            return previous;
        }
        CacheEntry oldest = load(stockId, new ResourceLocation(stockId.substring(0, separator),
            APPEARANCE_DIRECTORY + stockId.substring(separator + 1) + ".json"), true);
        return oldest;
    }

    /** Old and new locations are alternatives, never layers of the same merged document. */
    private CacheEntry load(String stockId, ResourceLocation requestedLocation, boolean legacy)
    {
        ResourceLocation location = requestedLocation;

        IResourceManager resourceManager = resources();
        List<IResource> resources;
        try
        {
            resources = resourceManager.getAllResources(location);
        }
        catch (IOException exception)
        {
            return CacheEntry.MISSING;
        }
        if (resources == null || resources.isEmpty())
        {
            return CacheEntry.MISSING;
        }

        List<RollingStockAppearanceJson.Contribution> contributions =
            new ArrayList<RollingStockAppearanceJson.Contribution>();
        for (int resourceIndex = 0; resourceIndex < resources.size(); resourceIndex++)
        {
            IResource resource = resources.get(resourceIndex);
            String sourceName = location + " priority " + resourceIndex;
            try
            {
                JsonObject json = readObject(resource, location);
                contributions.add(
                    new RollingStockAppearanceJson.Contribution(
                        sourceName, json));
            }
            catch (IOException exception)
            {
                LogManager.getLogger("Traincraft").warn(
                    "Could not read rolling-stock appearance {} from {}: {}",
                    location,
                    sourceName,
                    exception.getMessage());
            }
            catch (IllegalArgumentException | JsonParseException exception)
            {
                LogManager.getLogger("Traincraft").warn(
                    "Rejected rolling-stock appearance {} from {}: {}",
                    location,
                    sourceName,
                    exception.getMessage());
            }
        }

        RollingStockAppearanceJson.Result result =
            RollingStockAppearanceJson.merge(stockId, contributions);
        for (String diagnostic : result.diagnostics())
        {
            LogManager.getLogger("Traincraft").warn(
                "Rolling-stock appearance {}: {}", location, diagnostic);
        }
        if (result.lighting() == null)
        {
            return CacheEntry.MISSING;
        }
        try
        {
            return new CacheEntry(legacy
                ? RollingStockAppearanceJson.parse(stockId,
                    mapping(stockId).migrateLighting(stockId, result.mergedJson()))
                : result.lighting());
        }
        catch (IllegalArgumentException exception)
        {
            LogManager.getLogger("Traincraft").warn("Cannot migrate legacy lighting {}: {}", stockId, exception.getMessage());
            return CacheEntry.MISSING;
        }
    }

    /** Reads one physical JSON resource and always closes its stream. */
    private static JsonObject readObject(
        IResource resource, ResourceLocation location)
        throws IOException
    {
        Reader reader =
            new InputStreamReader(resource.getInputStream(), StandardCharsets.UTF_8);
        try
        {
            JsonElement element = SharedJsonParser.INSTANCE.parse(reader);
            if (element == null || element.isJsonObject() == false)
            {
                throw new IllegalArgumentException(
                    location + " root must be a JSON object");
            }
            return element.getAsJsonObject();
        }
        finally
        {
            reader.close();
        }
    }

    /** Cached document plus normalized per-skin effective profile lookups. */
    private static final class CacheEntry
    {
        private static final CacheEntry MISSING = new CacheEntry(null);

        private final RollingStockAppearanceLighting document;
        private final Map<String, RollingStockSkinLighting> resolvedSkins =
            new LinkedHashMap<String, RollingStockSkinLighting>();

        private CacheEntry(RollingStockAppearanceLighting document)
        {
            this.document = document;
        }

        private RollingStockSkinLighting resolve(String skinIdentity)
        {
            if (document == null)
            {
                return null;
            }
            String normalized =
                skinIdentity == null
                ? ""
                : skinIdentity.trim().toLowerCase(Locale.ROOT);
            RollingStockSkinLighting lighting = resolvedSkins.get(normalized);
            if (lighting == null)
            {
                lighting = document.resolve(skinIdentity);
                resolvedSkins.put(normalized, lighting);
            }
            return lighting;
        }
    }
}
