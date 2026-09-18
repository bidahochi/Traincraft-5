package tb.dev.stockresources;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import train.common.appearance.LegacySkinMapping;
import train.common.appearance.RollingStockAppearanceJson;
import train.common.utils.SharedJsonParser;

/** Create-only development asset writer. Existing files, including malformed files, are untouched. */
public final class StockResourceGenerator
{
    private static final Gson JSON_WRITER = new GsonBuilder().setPrettyPrinting().create();

    private StockResourceGenerator()
    {
    }

    /** Builds a dictionary from registered integer colors, not model geometry or texture filenames. */
    public static boolean mapping(Path assets, String stock, int[] colors) throws IOException
    {
        if (hasDocument(assets, stock, "legacy_skin_ids.json"))
        {
            return false;
        }
        JsonObject document = LegacySkinMapping.emptyDocument();
        LegacySkinMapping.appendMissing(document, stock, colors);
        return writeMissing(path(assets, stock, "legacy_skin_ids.json"), document);
    }

    /** Validates discovered fixtures before creating the stock-wide default lighting document. */
    public static boolean lighting(Path assets, String stock, JsonObject fixtures) throws IOException
    {
        if (hasDocument(assets, stock, "lighting.json"))
        {
            return false;
        }
        JsonObject document = new JsonObject();
        document.addProperty("schemaVersion", 1);
        document.addProperty("stock", stock);
        JsonObject defaults = new JsonObject();
        defaults.add("fixtures", fixtures);
        JsonObject lighting = new JsonObject();
        lighting.add("defaults", defaults);
        document.add("lighting", lighting);
        RollingStockAppearanceJson.parse(stock, document);
        return writeMissing(path(assets, stock, "lighting.json"), document);
    }

    /** Older authored layouts also count as existing; a scaffold must not shadow their overrides. */
    public static boolean hasDocument(Path assets, String stock, String file) throws IOException
    {
        if (Files.exists(path(assets, stock, file)))
        {
            return true;
        }
        Path namespace = assets.resolve(stock.substring(0, stock.indexOf(':')));
        if (Files.exists(namespace.resolve(LegacySkinMapping.previousResourcePath(stock, file))))
        {
            return true;
        }
        return "lighting.json".equals(file) && Files.exists(namespace.resolve("rolling_stock_appearance")
                .resolve(stock.substring(stock.indexOf(':') + 1) + ".json"));
    }

    /** Returns a confined path and rejects symlinks before any directory can be created. */
    public static Path path(Path assets, String stock, String file) throws IOException
    {
        LegacySkinMapping.requireId(stock);
        Path root = assets.toAbsolutePath().normalize();
        Path target = root.resolve(stock.substring(0, stock.indexOf(':')))
                .resolve(LegacySkinMapping.resourcePath(stock, file)).normalize();
        if (target.startsWith(root) == false)
        {
            throw new IOException("Stock resource escapes project assets: " + target);
        }
        for (Path current = target; current != null; current = current.getParent())
        {
            if (Files.isSymbolicLink(current))
            {
                throw new IOException("Refusing generated assets through symlink: " + current);
            }
        }
        return target;
    }

    /** Writes a complete temporary document, then publishes without replacing an existing file. */
    private static boolean writeMissing(Path target, JsonObject document) throws IOException
    {
        if (Files.exists(target))
        {
            return false;
        }
        String text = JSON_WRITER.toJson(document) + "\n";
        SharedJsonParser.INSTANCE.parse(text);
        Files.createDirectories(target.getParent());
        Path temporary = Files.createTempFile(target.getParent(), ".stock-resource-", ".tmp");
        try
        {
            Files.write(temporary, text.getBytes(StandardCharsets.UTF_8));
            try
            {
                Files.move(temporary, target);
            }
            catch (FileAlreadyExistsException exception)
            {
                return false;
            }
            return true;
        }
        finally
        {
            Files.deleteIfExists(temporary);
        }
    }
}
