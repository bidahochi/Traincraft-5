package train.common.appearance;

import train.common.utils.SharedJsonParser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import train.common.api.AbstractTrains;

/** Immutable per-stock integer-to-lighting-key dictionary, not a selectable skin catalog. */
public final class LegacySkinMapping
{
    private static final Pattern ID = Pattern.compile("[a-z0-9_.-]+:[a-z0-9_.-]+(?:/[a-z0-9_.-]+)*");
    private final Map<Integer, String> entries;

    private LegacySkinMapping(Map<Integer, String> entries)
    {
        this.entries = Collections.unmodifiableMap(new LinkedHashMap<Integer, String>(entries));
    }

    /** Parses the complete contribution before any accepted dictionary is changed. */
    public static LegacySkinMapping parse(JsonObject root)
    {
        if (root == null || root.has("schemaVersion") == false
            || root.get("schemaVersion").toString().equals("1") == false
            || root.has("legacyColors") == false || root.get("legacyColors").isJsonObject() == false)
        {
            throw new IllegalArgumentException("Expected schemaVersion 1 and legacyColors object");
        }
        if (root.has("stock"))
        {
            JsonElement stock = root.get("stock");
            if (stock.isJsonPrimitive() == false || stock.getAsJsonPrimitive().isString() == false)
            {
                throw new IllegalArgumentException("stock must be a namespaced string");
            }
            requireId(stock.getAsString());
        }
        Map<Integer, String> entries = new LinkedHashMap<Integer, String>();
        for (Map.Entry<String, JsonElement> entry : root.getAsJsonObject("legacyColors").entrySet())
        {
            int color = Integer.parseInt(entry.getKey());
            if (Integer.toString(color).equals(entry.getKey()) == false
                || entry.getValue().isJsonPrimitive() == false
                || entry.getValue().getAsJsonPrimitive().isString() == false)
            {
                throw new IllegalArgumentException("Invalid legacy color entry " + entry.getKey());
            }
            String target = entry.getValue().getAsString();
            requireId(target);
            entries.put(color, target);
        }
        return new LegacySkinMapping(entries);
    }

    /** Validates optional readable stock metadata against the authoritative resource path. */
    public static LegacySkinMapping parse(String expectedStockId, JsonObject root)
    {
        requireId(expectedStockId);
        LegacySkinMapping mapping = parse(root);
        if (root.has("stock") && expectedStockId.equals(root.get("stock").getAsString()) == false)
        {
            throw new IllegalArgumentException("stock '" + root.get("stock").getAsString()
                + "' does not match requested '" + expectedStockId + "'");
        }
        return mapping;
    }

    /** Validates path-safe namespaced identities; dot traversal segments are forbidden. */
    public static void requireId(String id)
    {
        if (id == null || ID.matcher(id).matches() == false)
        {
            throw new IllegalArgumentException("Invalid namespaced identity: " + id);
        }
        String namespace = id.substring(0, id.indexOf(':'));
        if (namespace.equals(".") || namespace.equals(".."))
        {
            throw new IllegalArgumentException("Invalid identity namespace: " + id);
        }
        for (String segment : id.substring(id.indexOf(':') + 1).split("/"))
        {
            if (segment.equals(".") || segment.equals(".."))
            {
                throw new IllegalArgumentException("Identity contains a traversal segment: " + id);
            }
        }
    }

    /** Generates the existing string-style color name, never a texture or display description. */
    public static String defaultId(String stockId, int color)
    {
        requireId(stockId);
        return stockId.substring(0, stockId.indexOf(':') + 1)
            + AbstractTrains.getColorAsString(color).toLowerCase(Locale.ROOT);
    }

    /** Resolves an authored mapping or the deterministic legacy string convention. */
    public String resolve(String stockId, int color)
    {
        String target = entries.get(color);
        return target == null ? defaultId(stockId, color) : target;
    }

    /** Returns the immutable authored entries in file order. */
    public Map<Integer, String> entries()
    {
        return entries;
    }

    /** Converts an old lighting document in memory; the original file and its aliases stay intact. */
    public JsonObject migrateLighting(String stockId, JsonObject source)
    {
        RollingStockAppearanceJson.parse(stockId, source);
        JsonObject migrated = SharedJsonParser.INSTANCE.parse(source.toString()).getAsJsonObject();
        migrated.addProperty("stock", stockId);
        JsonObject skins = migrated.getAsJsonObject("skins");
        if (skins == null)
        {
            return migrated;
        }
        JsonObject replacements = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : skins.entrySet())
        {
            JsonObject skin = entry.getValue().getAsJsonObject();
            JsonElement aliases = skin.remove("legacyAliases");
            boolean mapped = false;
            if (aliases != null)
            {
                for (JsonElement alias : aliases.getAsJsonArray())
                {
                    String name = alias.getAsString();
                    Integer color = legacyColor(name);
                    if (color != null)
                    {
                        String key = resolve(stockId, color);
                        if (replacements.has(key) && replacements.get(key) != skin)
                        {
                            throw new IllegalArgumentException("Conflicting legacy lighting alias for " + key);
                        }
                        replacements.add(key, skin);
                        mapped = true;
                    }
                }
            }
            if (mapped == false)
            {
                replacements.add(entry.getKey(), skin);
            }
        }
        migrated.add("skins", replacements);
        return migrated;
    }

    /** Recognizes actual color keys, never railroad names or arbitrary display aliases. */
    private static Integer legacyColor(String name)
    {
        if (name.regionMatches(true, 0, "skin", 0, 4))
        {
            try
            {
                return Integer.valueOf(name.substring(4));
            }
            catch (NumberFormatException exception)
            {
                return null;
            }
        }
        for (int color = 0; color < 16; color++)
        {
            if (AbstractTrains.getColorAsString(color).equalsIgnoreCase(name))
            {
                return color;
            }
        }
        if ("Empty".equalsIgnoreCase(name))
        {
            return 100;
        }
        return "Full".equalsIgnoreCase(name) ? Integer.valueOf(101) : null;
    }

    /** Adds only absent integer keys, preserving authored targets and unrelated JSON fields. */
    public static boolean appendMissing(JsonObject root, String stockId, int[] colors)
    {
        parse(stockId, root);
        boolean changed = false;
        if (root.has("stock") == false)
        {
            root.addProperty("stock", stockId);
            changed = true;
        }
        JsonObject entries = root.getAsJsonObject("legacyColors");
        if (colors != null)
        {
            for (int color : colors)
            {
                String key = Integer.toString(color);
                if (entries.has(key) == false)
                {
                    entries.addProperty(key, defaultId(stockId, color));
                    changed = true;
                }
            }
        }
        return changed;
    }

    /** Creates an empty versioned dictionary for a new stock. */
    public static JsonObject emptyDocument()
    {
        JsonObject root = new JsonObject();
        root.addProperty("schemaVersion", 1);
        root.add("legacyColors", new JsonObject());
        return root;
    }

    /** Resolves the owner resource path shared by lighting and development generation. */
    public static String resourcePath(String stockId, String fileName)
    {
        requireId(stockId);
        return "rolling_stock/" + stockId.substring(stockId.indexOf(':') + 1) + "/" + fileName;
    }

    /** Read-only compatibility location used before stock folders were simplified. */
    public static String previousResourcePath(String stockId, String fileName)
    {
        requireId(stockId);
        return "traincraft/rolling_stock/" + stockId.replace(':', '/') + "/" + fileName;
    }
}
