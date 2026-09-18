package tb.dev.lightingreload;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.logging.log4j.LogManager;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.ClientCommandHandler;
import train.client.render.lighting.ClientRollingStockAppearanceLoader;
import train.common.Traincraft;
import train.common.appearance.StockLightingIdentity;
import train.common.appearance.LegacySkinMapping;
import train.common.utils.SharedJsonParser;
import train.common.library.register.ITrainRecord;
import train.common.utils.devutils.DebugUtil;

/** Development-only client command; never changes server controls or writes assets. */
public final class LightingReloadCommand extends CommandBase
{
    private static boolean registered;

    /** Installs the command once on development clients through the optional cold bootstrap. */
    public static void init()
    {
        if (Boolean.TRUE.equals(DebugUtil.dev) == false
            || FMLCommonHandler.instance().getSide().isClient() == false || registered)
        {
            return;
        }
        ClientCommandHandler.instance.registerCommand(new LightingReloadCommand());
        registered = true;
    }

    /** The command is registered only through the development bootstrap. */
    private LightingReloadCommand()
    {
    }

    /** Returns the client-only authoring command name. */
    @Override
    public String getCommandName()
    {
        return "reloadstocklighting";
    }

    /** Requires a full normalized stock identity, not a model class or skin key. */
    @Override
    public String getCommandUsage(ICommandSender sender)
    {
        return "/reloadstocklighting <namespace:stock> [resources]";
    }

    /** No server permission is needed for a local visual resource refresh. */
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender)
    {
        return Boolean.TRUE.equals(DebugUtil.dev);
    }

    /** Validates the registered stock, then atomically replaces its accepted resource data. */
    @Override
    public void processCommand(ICommandSender sender, String[] arguments)
    {
        if (Boolean.TRUE.equals(DebugUtil.dev) == false)
        {
            return;
        }
        if (arguments.length < 1 || arguments.length > 2
            || (arguments.length == 2 && "resources".equals(arguments[1]) == false))
        {
            sender.addChatMessage(new ChatComponentText(getCommandUsage(sender)));
            return;
        }
        String stockId = arguments[0];
        boolean found = false;
        for (ITrainRecord record : Traincraft.traincraftRegistry.getAllTrains().values())
        {
            if (stockId.equals(StockLightingIdentity.resolve(record)))
            {
                found = true;
                break;
            }
        }
        if (found == false)
        {
            sender.addChatMessage(new ChatComponentText("Unknown stock ID: " + stockId));
            return;
        }
        if (arguments.length == 1 && reloadSource(sender, stockId))
        {
            return;
        }
        boolean loaded = ClientRollingStockAppearanceLoader.INSTANCE.reloadStock(stockId);
        String message;
        if (loaded)
        {
            message = "Reloaded lighting and skin mapping for " + stockId
                + " from active resources. Check the log for rejected contributions.";
        }
        else
        {
            message = "No valid lighting JSON for " + stockId
                + "; previous data retained. Check the active resource path and log.";
        }
        sender.addChatMessage(new ChatComponentText(message));
    }

    /** Reads editable project resources rather than Gradle/IDE output; never writes files. */
    private static boolean reloadSource(ICommandSender sender, String stockId)
    {
        Path project = Loader.instance().getConfigDir().toPath().toAbsolutePath().normalize();
        while (project != null)
        {
            if (Files.isRegularFile(project.resolve("build.gradle"))
                && Files.isDirectory(project.resolve("src/main/resources/assets")))
            {
                break;
            }
            project = project.getParent();
        }
        if (project == null)
        {
            return false;
        }
        String namespace = stockId.substring(0, stockId.indexOf(':'));
        Path assets = project.resolve("src/main/resources/assets").resolve(namespace).normalize();
        Path lighting = assets.resolve(LegacySkinMapping.resourcePath(stockId, "lighting.json")).normalize();
        if (lighting.startsWith(assets) == false || Files.isRegularFile(lighting) == false)
        {
            return false;
        }
        Path mapping = lighting.resolveSibling("legacy_skin_ids.json");
        try
        {
            JsonObject document = readDocument(lighting);
            JsonObject dictionary = Files.isRegularFile(mapping) ? readDocument(mapping) : null;
            ClientRollingStockAppearanceLoader.INSTANCE.reloadStockFromDocuments(stockId, document, dictionary);
            sender.addChatMessage(new ChatComponentText("Reloaded source lighting: " + lighting
                + " (local preview; resource-pack overlays bypassed)."));
            LogManager.getLogger("Traincraft").info("Reloaded source lighting: {}", lighting);
        }
        catch (IOException | IllegalArgumentException | JsonParseException exception)
        {
            sender.addChatMessage(new ChatComponentText("Source reload rejected; previous lighting retained: "
                + lighting + " — " + exception.getMessage()));
            LogManager.getLogger("Traincraft").warn("Source lighting reload rejected: {}", lighting, exception);
        }
        return true;
    }

    /** Uses the shared parser and closes the source reader on success or failure. */
    private static JsonObject readDocument(Path file) throws IOException
    {
        try (Reader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8))
        {
            JsonElement value = SharedJsonParser.INSTANCE.parse(reader);
            if (value == null || value.isJsonObject() == false)
            {
                throw new IllegalArgumentException("Expected a JSON object");
            }
            return value.getAsJsonObject();
        }
    }
}
