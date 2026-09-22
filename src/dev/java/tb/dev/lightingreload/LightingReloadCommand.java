package tb.dev.lightingreload;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Field;
import java.util.Map;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.apache.logging.log4j.LogManager;
import net.minecraft.command.CommandBase;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.client.ClientCommandHandler;
import train.client.render.lighting.ClientRollingStockAppearanceLoader;
import train.client.render.lighting.ClientRollingStockLighting;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightState;
import train.common.api.RollingStockLightDefinition;
import train.common.api.RollingStockLightFunction;
import train.common.api.RollingStockLightState;
import train.common.api.RollingStockTransientLightSignal;
import train.common.Traincraft;
import train.common.appearance.StockLightingIdentity;
import train.common.appearance.LegacySkinMapping;
import train.common.appearance.ServerHornLightPolicies;
import train.common.appearance.HornLightPolicyRegistry;
import train.common.utils.SharedJsonParser;
import train.common.library.register.ITrainRecord;
import train.common.utils.devutils.DebugUtil;

/** Development-only lighting preview reload and cached-fixture diagnostics. */
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
        return "/reloadstocklighting <namespace:stock> [resources|diagnose]";
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
            || (arguments.length == 2 && "resources".equals(arguments[1]) == false
                && "diagnose".equals(arguments[1]) == false))
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
        if (arguments.length == 2 && "diagnose".equals(arguments[1]))
        {
            diagnoseRenderedFixtures(sender, stockId);
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

    /**
     * Reads the renderer's existing cache without reloading it or changing entity controls.
     * Reflection is confined to this development-only command so production rendering needs
     * no diagnostic API. Each field is resolved once per invocation, outside any render loop.
     * The cache is read on its owning client thread; failure reports an incompatible renderer.
     */
    private static void diagnoseRenderedFixtures(ICommandSender sender, String stockId)
    {
        Minecraft minecraft = Minecraft.getMinecraft();
        if (minecraft.theWorld == null || minecraft.thePlayer == null)
        {
            sender.addChatMessage(new ChatComponentText("Open a world and render the stock first."));
            return;
        }
        try
        {
            Field statesField = ClientRollingStockLighting.class.getDeclaredField("RUNTIME_STATES");
            statesField.setAccessible(true);
            Map<?, ?> states = (Map<?, ?>) statesField.get(null);
            EntityRollingStock nearest = null;
            double nearestDistance = Double.POSITIVE_INFINITY;
            for (Object candidate : minecraft.theWorld.loadedEntityList)
            {
                if (candidate instanceof EntityRollingStock)
                {
                    EntityRollingStock stock = (EntityRollingStock) candidate;
                    double distance = stock.getDistanceSqToEntity(minecraft.thePlayer);
                    if (stockId.equals(stock.getRollingStockAppearanceId()) && distance < nearestDistance)
                    {
                        nearest = stock;
                        nearestDistance = distance;
                    }
                }
            }
            Object state = states.get(nearest);
            if (state == null || nearest instanceof IRollingStockLightState == false)
            {
                sender.addChatMessage(new ChatComponentText("No rendered light-state cache for " + stockId));
                return;
            }
            IRollingStockLightState controls = (IRollingStockLightState) nearest;
            LogManager.getLogger("Traincraft").info("Lighting diagnostic stock={} entity={} color={} skin={} horn={}",
                stockId, nearest.getEntityId(), nearest.getColor(),
                ClientRollingStockAppearanceLoader.INSTANCE.resolveLegacySkin(stockId, nearest.getColor()),
                controls.isTransientLightSignalEnabled(RollingStockTransientLightSignal.HORN));
            Field fixturesField = state.getClass().getDeclaredField("resolvedFixtures");
            fixturesField.setAccessible(true);
            Map<?, ?> fixtures = (Map<?, ?>) fixturesField.get(state);
            Field definitionField = null;
            double time = minecraft.theWorld.getTotalWorldTime();
            for (Object fixture : fixtures.values())
            {
                if (definitionField == null)
                {
                    definitionField = fixture.getClass().getDeclaredField("definition");
                    definitionField.setAccessible(true);
                }
                RollingStockLightDefinition definition = (RollingStockLightDefinition) definitionField.get(fixture);
                RollingStockLightFunction horn = definition.hornFunction();
                LogManager.getLogger("Traincraft").info(
                    "Lighting diagnostic fixture={} channel={} circuit={} normal={} hornMode={} hornPhase={} hornFunctionPhase={} localZ={} sourceNow={}",
                    definition.id(), definition.channel(), definition.controlCircuit(), definition.function().pattern(),
                    definition.ditchHornMode(), definition.hornPhase(),
                    horn == null ? "fallback" : Integer.toString(horn.phaseIndex()), definition.z(),
                    RollingStockLightState.outputForState(controls, definition, time).sourceIntensity());
            }
            sender.addChatMessage(new ChatComponentText("Logged cached lighting for entity "
                + nearest.getEntityId() + " (" + stockId + "). No settings changed."));
        }
        catch (ReflectiveOperationException | SecurityException exception)
        {
            LogManager.getLogger("Traincraft").warn("Cannot inspect renderer lighting cache", exception);
            sender.addChatMessage(new ChatComponentText("Lighting diagnostic failed; see the log."));
        }
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
            HornLightPolicyRegistry registry =
                HornLightPolicyRegistry.development(project.resolve("src/main/resources/assets"));
            ClientRollingStockAppearanceLoader.INSTANCE.reloadStockFromDocuments(stockId, document, dictionary, registry);
            Minecraft minecraft = Minecraft.getMinecraft();
            if (minecraft.isSingleplayer() && minecraft.getIntegratedServer() != null
                && minecraft.getIntegratedServer().getPublic() == false)
            {
                for (ITrainRecord record : Traincraft.traincraftRegistry.getAllTrains().values())
                {
                    if (stockId.equals(StockLightingIdentity.resolve(record)))
                    {
                        ServerHornLightPolicies.reloadDevelopment(stockId, document, dictionary, registry);
                        sender.addChatMessage(new ChatComponentText("Reloaded local server horn policy; active countdowns unchanged."));
                        break;
                    }
                }
            }
            else
            {
                sender.addChatMessage(new ChatComponentText("Server horn policy unchanged: source reload requires a private integrated dev game."));
            }
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
