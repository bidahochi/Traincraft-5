package tb.dev.stockresources;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import tmt.ModelBase;
import train.client.render.RenderEnum;
import train.client.render.register.ITrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractTrains;
import train.common.appearance.StockLightingIdentity;
import train.common.library.register.ITrainRecord;
import train.common.utils.devutils.DebugUtil;

/** One-shot development generation after registration, when a client world can support model factories. */
public final class StockResourceDevBootstrap
{
    private static boolean registered;
    private boolean completed;

    private StockResourceDevBootstrap()
    {
    }

    /** Registers only on a development client; production and dedicated servers do no work. */
    public static void init()
    {
        if (Boolean.TRUE.equals(DebugUtil.dev) == false
            || FMLCommonHandler.instance().getSide().isClient() == false || registered)
        {
            return;
        }
        registered = true;
        FMLCommonHandler.instance().bus().register(new StockResourceDevBootstrap());
    }

    /**
     * Waits for the first client world, then unregisters before scanning. No generation or model
     * reflection runs on subsequent ticks. Temporary stock instances are never spawned in a world.
     */
    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event)
    {
        if (completed || event.phase != TickEvent.Phase.END || Minecraft.getMinecraft().theWorld == null)
        {
            return;
        }
        completed = true;
        FMLCommonHandler.instance().bus().unregister(this);
        Path project = Loader.instance().getConfigDir().toPath().toAbsolutePath().normalize();
        while (project != null && (Files.isRegularFile(project.resolve("build.gradle")) == false
                || Files.isDirectory(project.resolve("src/main/resources/assets")) == false))
        {
            project = project.getParent();
        }
        if (project == null)
        {
            LogManager.getLogger("Traincraft").warn("Stock scaffolds skipped: no writable development project found");
            return;
        }
        generate(project, Minecraft.getMinecraft().theWorld);
    }

    /** Source ownership prevents writing installed addon or resource-pack contents into this project. */
    public static boolean ownsStock(Path project, Class<?> entityType)
    {
        String source = entityType.getName();
        int nested = source.indexOf('$');
        if (nested >= 0)
        {
            source = source.substring(0, nested);
        }
        return Files.isRegularFile(project.resolve("src/main/java").resolve(source.replace('.', '/') + ".java"));
    }

    /**
     * Creates only missing documents for project-owned registrations. Third-party model factories
     * may throw runtime failures: this cold per-stock boundary reports them and skips that lighting
     * file. Previously accepted files and other stocks remain intact; failed scans are not saved.
     * Discovery is limited to supported model containers and does not guarantee complete coverage.
     */
    private static void generate(Path project, World world)
    {
        Path assets = project.resolve("src/main/resources/assets");
        Map<String, ITrainRecord> stocks = new TreeMap<String, ITrainRecord>();
        for (ITrainRecord record : Traincraft.traincraftRegistry.getAllTrains().values())
        {
            if (ownsStock(project, record.getEntityClass()))
            {
                String id = StockLightingIdentity.resolve(record);
                if (id.isEmpty() == false)
                {
                    stocks.put(id, record);
                }
            }
        }
        ModelFixtureScaffold discovery = new ModelFixtureScaffold();
        int mappings = 0;
        int lighting = 0;
        int skinLists = 0;
        for (Map.Entry<String, ITrainRecord> entry : stocks.entrySet())
        {
            String stock = entry.getKey();
            ITrainRecord record = entry.getValue();
            try
            {
                if (StockResourceGenerator.mapping(assets, stock, record.getColors()))
                {
                    mappings++;
                }
                if (StockResourceGenerator.hasDocument(assets, stock, "lighting.json"))
                {
                    if (StockResourceGenerator.populateSkins(assets, stock, record.getColors()))
                    {
                        skinLists++;
                    }
                    continue;
                }
                ModelBase model = model(record, world);
                if (model == null)
                {
                    LogManager.getLogger("Traincraft").warn(
                            "No model for {}; lighting.json not generated. Register its render model first", stock);
                    continue;
                }
                if (StockResourceGenerator.lighting(assets, stock, discovery.discover(model)))
                {
                    lighting++;
                }
                if (StockResourceGenerator.populateSkins(assets, stock, record.getColors()))
                {
                    skinLists++;
                }
            }
            catch (IOException | IllegalAccessException | RuntimeException exception)
            {
                LogManager.getLogger("Traincraft").warn(
                        "Could not generate missing stock resources for " + stock + " under " + assets
                            + "; existing files preserved. Check model names and filesystem access", exception);
            }
        }
        LogManager.getLogger("Traincraft").info(
                "Development stock scaffolds: {} legacy mappings and {} lighting documents created under {}. "
                    + "Existing files unchanged; use /reloadstocklighting <stock> to preview source JSON",
                mappings, lighting, skinLists, assets);
    }

    /** Reuses RenderEnum models directly; other render-record lookups first construct an unspawned stock. */
    private static ModelBase model(ITrainRecord record, World world)
    {
        for (RenderEnum render : RenderEnum.values())
        {
            if (render.getEntityClass() == record.getEntityClass())
            {
                return render.getModel();
            }
        }
        AbstractTrains instance = Traincraft.traincraftRegistry.getEntity(record.getEntityClass(), world);
        if (instance == null)
        {
            return null;
        }
        ITrainRenderRecord render = Traincraft.traincraftRegistry.getTrainRenderRecord(record.getEntityClass(), instance);
        if (render.getEntityClass() != record.getEntityClass())
        {
            return null;
        }
        return render.getModel();
    }
}
