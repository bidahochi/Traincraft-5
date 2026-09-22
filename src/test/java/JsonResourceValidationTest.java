import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.junit.Test;
import train.common.appearance.LegacySkinMapping;
import train.common.appearance.RollingStockAppearanceJson;
import train.common.utils.SharedJsonParser;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/** Validates production and development JSON resources without loading models or starting a game. */
public class JsonResourceValidationTest
{
    @Test
    public void allJsonResourcesAreValid() throws IOException
    {
        List<Path> files = new ArrayList<Path>();
        for (String directory : new String[] {"src/main/resources", "src/dev/resources"})
        {
            Path root = Paths.get(directory);
            if (Files.isDirectory(root))
            {
                try (Stream<Path> paths = Files.walk(root))
                {
                    paths.filter(Files::isRegularFile)
                            .filter(path -> path.getFileName().toString().toLowerCase(Locale.ROOT).endsWith(".json"))
                            .sorted().forEach(files::add);
                }
            }
        }
        assertTrue("No JSON resources found; check the test working directory", files.isEmpty() == false);
        List<String> failures = new ArrayList<String>();
        for (Path file : files)
        {
            try
            {
                String text = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);
                validateSyntax(text);
                validateStockDocument(file, text);
            }
            catch (IOException | IllegalArgumentException | JsonParseException exception)
            {
                failures.add(file + ": " + exception.getMessage());
            }
        }
        assertTrue("Invalid JSON resources:\n" + String.join("\n", failures), failures.isEmpty());
    }

    @Test
    public void strictValidationRejectsMalformedAndAmbiguousDocuments() throws IOException
    {
        for (String text : new String[] {"", "{unquoted:1}", "{'a':1}", "{/*comment*/}",
                "{\"a\":1,}", "{} {}", "{\"a\":1,\"a\":2}", "[1,]"})
        {
            try
            {
                validateSyntax(text);
                fail("Accepted invalid JSON: " + text);
            }
            catch (IOException exception)
            {
                // Expected: malformed syntax or a duplicate object key.
            }
        }
        validateSyntax("{\"a\":[true,false,null,1.25e2,{\"name\":\"value\"}]}");
    }

    /** Gson's tree parser enables lenient syntax; inspect tokens strictly before using that parser. */
    private static void validateSyntax(String text) throws IOException
    {
        try (JsonReader reader = new JsonReader(new StringReader(text)))
        {
            reader.setLenient(false);
            readValue(reader);
            if (reader.peek() != JsonToken.END_DOCUMENT)
            {
                throw new IOException("Unexpected content after the JSON document");
            }
        }
    }

    /** Checks duplicate keys before Gson's tree representation can silently replace their values. */
    private static void readValue(JsonReader reader) throws IOException
    {
        switch (reader.peek())
        {
            case BEGIN_OBJECT:
                reader.beginObject();
                Set<String> names = new HashSet<String>();
                while (reader.hasNext())
                {
                    String name = reader.nextName();
                    if (names.add(name) == false)
                    {
                        throw new IOException("Duplicate object key: " + name);
                    }
                    readValue(reader);
                }
                reader.endObject();
                break;
            case BEGIN_ARRAY:
                reader.beginArray();
                while (reader.hasNext())
                {
                    readValue(reader);
                }
                reader.endArray();
                break;
            case STRING:
            case NUMBER:
                reader.nextString();
                break;
            case BOOLEAN:
                reader.nextBoolean();
                break;
            case NULL:
                reader.nextNull();
                break;
            default:
                throw new IOException("Expected a JSON value, found " + reader.peek());
        }
    }

    /** Uses the resource path, not optional stock metadata, as the schema's expected identity. */
    private static void validateStockDocument(Path file, String text)
    {
        String name = file.getFileName().toString();
        if (name.equals("lighting.json") == false && name.equals("legacy_skin_ids.json") == false)
        {
            return;
        }
        for (int index = 0; index + 4 < file.getNameCount(); index++)
        {
            if (file.getName(index).toString().equals("assets")
                    && file.getName(index + 2).toString().equals("rolling_stock"))
            {
                String stock = file.getName(index + 1) + ":"
                        + file.subpath(index + 3, file.getNameCount() - 1).toString().replace('\\', '/');
                JsonElement root = SharedJsonParser.INSTANCE.parse(text);
                if (root.isJsonObject() == false)
                {
                    throw new IllegalArgumentException("Stock document must be an object");
                }
                if (name.equals("lighting.json"))
                {
                    RollingStockAppearanceJson.parse(stock, root.getAsJsonObject());
                }
                else
                {
                    LegacySkinMapping.parse(stock, root.getAsJsonObject());
                }
                return;
            }
        }
        throw new IllegalArgumentException("Stock document is outside assets/<namespace>/rolling_stock/<stock>/");
    }
}
