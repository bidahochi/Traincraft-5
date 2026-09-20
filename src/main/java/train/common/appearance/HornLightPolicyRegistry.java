package train.common.appearance;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import train.common.api.HornLightPolicyOverride;
import train.common.utils.SharedJsonParser;

/**
 * Named, reusable horn trigger definitions independent of stock, skin and geometry.
 * Referenced definitions are loaded and cached on configuration paths only. Installed
 * definitions come from classpath assets, never Minecraft's client resource-pack manager.
 */
public final class HornLightPolicyRegistry
{
    private static final String ASSET_PREFIX = "assets/";
    private static final String POLICY_DIRECTORY = "/lighting/horn_response_policies/";
    private static final String SCHEMA_VERSION = "1";
    /** Process-lifetime installed definitions; editing production content requires a restart. */
    public static final HornLightPolicyRegistry INSTALLED = new HornLightPolicyRegistry(null);
    private final Path developmentAssets;
    private final Map<String, HornLightPolicyOverride> definitions =
        new HashMap<String, HornLightPolicyOverride>();

    private HornLightPolicyRegistry(Path developmentAssets)
    {
        this.developmentAssets = developmentAssets;
    }

    /**
     * Creates a load-scoped source registry rooted at the project's assets directory.
     * Discard it after building a replacement snapshot; a fresh registry observes later edits.
     * Source files take precedence over installed definitions and are never written here.
     */
    public static HornLightPolicyRegistry development(Path assets)
    {
        return new HornLightPolicyRegistry(assets.toAbsolutePath().normalize());
    }

    /** Returns the resource path for a namespaced registry key, preserving path ownership. */
    public static String resourcePath(String id)
    {
        LegacySkinMapping.requireId(id);
        return ASSET_PREFIX + id.substring(0, id.indexOf(':')) + POLICY_DIRECTORY
            + id.substring(id.indexOf(':') + 1) + ".json";
    }

    /**
     * Loads and validates a referenced definition once. Missing or invalid definitions
     * reject the caller's candidate and are not cached. The lock protects cold configuration
     * loads shared by server startup and client validation; runtime effects never call here.
     * Description text and raw JSON are discarded after validation.
     */
    public synchronized HornLightPolicyOverride get(String id)
    {
        HornLightPolicyOverride known = definitions.get(id);
        if (known != null)
        {
            return known;
        }
        String resource = resourcePath(id);
        try (Reader reader = open(resource))
        {
            if (reader == null)
            {
                throw new IllegalArgumentException("Unknown horn response policy " + id + " at " + resource);
            }
            JsonElement value = SharedJsonParser.INSTANCE.parse(reader);
            if (value == null || value.isJsonObject() == false)
            {
                throw new IllegalArgumentException("Expected horn policy object at " + resource);
            }
            JsonObject root = value.getAsJsonObject();
            JsonElement description = root.get("description");
            if (description != null && (description.isJsonPrimitive() == false
                || description.getAsJsonPrimitive().isString() == false))
            {
                throw new IllegalArgumentException("Horn policy description must be a string at " + resource);
            }
            if (root.has("schemaVersion") == false
                || SCHEMA_VERSION.equals(root.get("schemaVersion").toString()) == false
                || root.has("policy") == false || root.get("policy").isJsonObject() == false)
            {
                throw new IllegalArgumentException("Expected schemaVersion 1 and policy object at " + resource);
            }
            JsonObject policy = root.getAsJsonObject("policy");
            if (policy.has("preset"))
            {
                throw new IllegalArgumentException("Horn registry definitions cannot reference another preset: " + id);
            }
            HornLightPolicyOverride definition = RollingStockAppearanceJson.parseHornResponsePolicy(policy);
            definition.resolve(this);
            definitions.put(id, definition);
            return definition;
        }
        catch (IOException | JsonParseException exception)
        {
            throw new IllegalArgumentException("Cannot read horn response policy " + id + " at " + resource, exception);
        }
    }

    /**
     * Opens source-first input; the caller closes the returned reader. Null means absent
     * from both sources. An existing unreadable source fails rather than hiding an edit
     * behind an older installed copy.
     */
    private Reader open(String resource) throws IOException
    {
        if (developmentAssets != null)
        {
            Path source = developmentAssets.resolve(resource.substring(ASSET_PREFIX.length())).normalize();
            if (source.startsWith(developmentAssets) == false)
            {
                throw new IOException("Horn policy escapes development assets: " + source);
            }
            if (Files.exists(source))
            {
                return Files.newBufferedReader(source, StandardCharsets.UTF_8);
            }
        }
        InputStream stream = HornLightPolicyRegistry.class.getResourceAsStream("/" + resource);
        return stream == null ? null : new InputStreamReader(stream, StandardCharsets.UTF_8);
    }
}
