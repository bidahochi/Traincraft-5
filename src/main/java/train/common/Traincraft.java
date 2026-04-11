package train.common;

import com.google.gson.JsonParser;
import com.jcirmodelsquad.tcjcir.features.signal.dynamic.TrainTalk;
import com.jcirmodelsquad.tcjcir.recipes.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.api.LiquidManager;
import train.common.blocks.TCBlocks;
import train.common.commands.lockout.tcAddUserToSkinGroup;
import train.common.commands.lockout.tcRemoveUserFromSkinGroup;
import train.common.commands.lockout.tcSetSkinGroupOwner;
import train.common.commands.tcAdminPerm;
import train.common.core.CommonProxy;
import train.common.core.TrainModCore;
import train.common.core.creativetab.*;
import train.common.core.handlers.*;
import train.common.core.managers.TierRecipeManager;
import train.common.generation.ComponentVillageTrainstation;
import train.common.generation.WorldGenWorld;
import train.common.items.TCItems;
import train.common.library.BetterEnumSounds;
import train.common.library.BlockIDs;
import train.common.library.Info;
import train.common.library.TraincraftRegistry;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OverlayFontRegistry;
import train.common.recipes.AssemblyTableRecipes;
import train.common.utils.devutils.DebugUtil;
import train.common.utils.devutils.TrainSheetsDataGenerator;
import train.common.utils.lockout.ILockoutGroup;
import train.common.utils.lockout.LockoutPermissionsUtil;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion)
public class Traincraft {

	/* TrainCraft instance */
	@Instance(Info.modID)
	public static Traincraft instance;

	/* TrainCraft proxy files */
	@SidedProxy(clientSide = "train.client.core.ClientProxy", serverSide = "train.common.core.CommonProxy")
	public static CommonProxy proxy;

	public static final LockoutPermissionsUtil lockoutPermissionsUtil = new LockoutPermissionsUtil();
	public static final TraincraftRegistry traincraftRegistry = new TraincraftRegistry();

	/* TrainCraft Logger */
	public static Logger tcLog = LogManager.getLogger(Info.modName);

	/** Network Channel to send packets on */
	public static SimpleNetworkWrapper modChannel;
	public static SimpleNetworkWrapper keyChannel;
	public static SimpleNetworkWrapper rotationChannel;
	public static SimpleNetworkWrapper toggleChunkLoadingChannel;

	public static SimpleNetworkWrapper slotschannel;
	public static SimpleNetworkWrapper ignitionChannel;
	public static SimpleNetworkWrapper brakeChannel;
	public static SimpleNetworkWrapper interchangeChannel;
	public static SimpleNetworkWrapper lockChannel;
	public static SimpleNetworkWrapper rollingStockLightsChannel;
	public static SimpleNetworkWrapper rollingStockBeaconChannel;
	public static SimpleNetworkWrapper rollingStockDitchLightsChannel;
	public static SimpleNetworkWrapper builderChannel;
	public static SimpleNetworkWrapper switchStandLockChannel;
	public static SimpleNetworkWrapper cargoSelectionChannel;
	public static SimpleNetworkWrapper paintbrushColorChannel;
    public static SimpleNetworkWrapper overlayTextureChannel;
	public static SimpleNetworkWrapper updateTrainIDChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TrainIDChannel");
	public static SimpleNetworkWrapper updateDestinationChannel = NetworkRegistry.INSTANCE.newSimpleChannel("updateDestnChannel");

	public static SimpleNetworkWrapper mtcChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTrainControl");
	public static SimpleNetworkWrapper mtcBlockChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCBlock");

	public static SimpleNetworkWrapper geometryCarChannel = NetworkRegistry.INSTANCE.newSimpleChannel("GeometryChannel");
	public static SimpleNetworkWrapper geometryCarChannelServer = NetworkRegistry.INSTANCE.newSimpleChannel("GeometryChannelServer");

	public static SimpleNetworkWrapper remoteControlKey = NetworkRegistry.INSTANCE.newSimpleChannel("RemoteControl");
	public static SimpleNetworkWrapper brakeUpdateFromServer = NetworkRegistry.INSTANCE.newSimpleChannel("BUpdateFromServer");
	public static SimpleNetworkWrapper updateEtiChannel = NetworkRegistry.INSTANCE.newSimpleChannel("UpdateETI");

	public static SimpleNetworkWrapper lockoutCommChannel;

	public static final SimpleNetworkWrapper BannedItems_CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel("banneditems_sync");

	public static SimpleNetworkWrapper tcCraftingBenchChannel = NetworkRegistry.INSTANCE.newSimpleChannel("tc.craftingtable");

	public static FMLEventChannel channel;

	/*public static  SimpleNetworkWrapper itsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterSpeed");
//public static  SimpleNetworkWrapper mtcsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCSysSetSpeed");
public static  SimpleNetworkWrapper itnsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("TransmitterNextSpeed");
public static final SimpleNetworkWrapper mtlChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCLevelUpdater");
public static final SimpleNetworkWrapper msChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatus");
public static final SimpleNetworkWrapper mscChannel = NetworkRegistry.INSTANCE.newSimpleChannel("MTCStatusToClient");
public static final SimpleNetworkWrapper atoChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ATOPacket");
public static final SimpleNetworkWrapper atoSetStopPoint = NetworkRegistry.INSTANCE.newSimpleChannel("ATOSetStopPoint");
//public static final SimpleNetworkWrapper ctChannel = NetworkRegistry.INSTANCE.newSimpleChannel("ctmChannel");
public static final SimpleNetworkWrapper gsfsChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsChannel");
public static final SimpleNetworkWrapper gsfsrChannel = NetworkRegistry.INSTANCE.newSimpleChannel("gsfsReturnChannel");*/
	public static File configDirectory;

	/* Creative tabs for Traincraft */
	public static CreativeTabs tcTab, tcHeritageTab, tcSteamTab, tcDieselTab, tcElectricTab, tcPassengerTab, tcFreightTab, tcBooseTab;

	public ArmorMaterial armor = EnumHelper.addArmorMaterial("Armor", 5, new int[] { 1, 2, 2, 1 }, 25);
	public ArmorMaterial armorCloth = EnumHelper.addArmorMaterial("TCcloth", 5, new int[] {1, 2, 2, 1}, 25);
	public ArmorMaterial armorCompositeSuit = EnumHelper.addArmorMaterial("TCsuit", 70, new int[] {2, 6, 5, 2}, 50);
	public static int trainArmor;
	public static int trainCloth;
	public static int trainCompositeSuit;


	public static WorldGenWorld worldGen;

	public static final JsonParser jsonParser = new JsonParser();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		tcLog.info("Starting Fox-Traincraft " + Info.modVersion + "!");
		if (DebugUtil.dev)
		{
			tcLog.info("DEV ENVIRONMENT DETECTED");
		}
		/* Config handler */
		configDirectory= event.getModConfigurationDirectory();
		ConfigHandler.init(new File(event.getModConfigurationDirectory(), Info.modName + ".cfg"));

		/* Register the KeyBinding Handler */
		proxy.registerKeyBindingHandler();

		/* Register Overlay Fonts */

		OverlayFontRegistry.registerFont(EnumOverlayFonts.OxygenSansSmall);
		OverlayFontRegistry.registerFont(EnumOverlayFonts.OxygenSansMid);
		OverlayFontRegistry.registerFont(EnumOverlayFonts.BapSansMid);
		OverlayFontRegistry.registerFont(EnumOverlayFonts.BapSansSmall);

		/* Register Items, Blocks, ... */
		tcLog.info("Initialize blocks, items, and other stuff");
		tcTab = new CreativeTabTraincraft(CreativeTabs.getNextID(), "Traincraft");
		tcHeritageTab = new CreativeTabTraincraftHeritage(CreativeTabs.getNextID(), "Traincraft Heritage");

		if (ConfigHandler.ENABLE_BAP_SPLIT_TABS)
		{
			tcSteamTab = new CreativeTabTraincraftSteam(CreativeTabs.getNextID(), "BAP Steam");
			tcDieselTab = new CreativeTabTraincraftDiesel(CreativeTabs.getNextID(), "BAP Diesel");
			tcElectricTab = new CreativeTabTraincraftElectric(CreativeTabs.getNextID(), "BAP Electric");
			tcPassengerTab = new CreativeTabTraincraftPassenger(CreativeTabs.getNextID(), "BAP Passenger");
			tcFreightTab = new CreativeTabTraincraftFreight(CreativeTabs.getNextID(), "BAP Freight");
			tcBooseTab = new CreativeTabTraincraftBoose(CreativeTabs.getNextID(), "BAP Caboosey");
		}
		else
		{
			tcDieselTab = new CreativeTabTraincraftDiesel(CreativeTabs.getNextID(), "Bidahochi's American Pack");
		}

		trainArmor = proxy.addArmor("armor");
		trainCloth = proxy.addArmor("Paintable");
		trainCompositeSuit = proxy.addArmor("CompositeSuit");
		TCBlocks.init();
		TCItems.init();
		new EntityHandler();


		proxy.registerTileEntities();
		proxy.registerSounds();
		BetterEnumSounds.init();

		proxy.setHook(); // Moved file needed to run JLayer, we need to set a hook in order to retrieve it

		GameRegistry.registerFuelHandler(new FuelHandler());
		AchievementHandler.load();
		AchievementPage.registerAchievementPage(AchievementHandler.tmPage);
		GameRegistry.registerWorldGenerator(worldGen = new WorldGenWorld(),5);

		//Retrogen Handling
		RetrogenHandler retroGen = new RetrogenHandler();
		MinecraftForge.EVENT_BUS.register(retroGen);
		FMLCommonHandler.instance().bus().register(retroGen);

		BlockBreakHandler blockBreakHandler = new BlockBreakHandler();
		MinecraftForge.EVENT_BUS.register(blockBreakHandler);
		FMLCommonHandler.instance().bus().register(blockBreakHandler);

		MapGenStructureIO.func_143031_a(ComponentVillageTrainstation.class, "Trainstation");

		if (Loader.isModLoaded("ComputerCraft")) {
			try {
				proxy.registerComputerCraftPeripherals();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		/* Other Proxy init */
		tcLog.info("Initializing renderer and events.");
		proxy.registerRenderInformation();
		proxy.registerEvents(event);

		/* Networking and Packet initialisation */
		PacketHandler.init();

		tcLog.info("Finished Preinitialization!");
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		tcLog.info("Entering Initialization.");

		if (Loader.isModLoaded("ForgeMultipart"))
		{
			tcLog.info("ForgeMultipart detected. Registering Traincraft Blocks");
			train.common.core.plugins.ForgeMultiPart.registerBlocks(BlockIDs.values());
		}

		//proxy.getCape();

		/* GUI handler initiation */
		tcLog.info("Initializing gui...");
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
		FMLCommonHandler.instance().bus().register(new CraftingHandler());

		/* Ore dictionary */
		OreHandler.registerOres();

		/* Register the liquids */
		tcLog.info("Initializing fluids..");
		LiquidManager.getInstance().registerLiquids();

		/* Liquid FX */
		proxy.registerTextureFX();

		/*Trainman Villager*/
		tcLog.info("Initializing VillagerJoe!!! :D ..and other village stuff.");
		VillagerRegistry.instance().registerVillagerId(ConfigHandler.TRAINCRAFT_VILLAGER_ID);
		VillagerTraincraftHandler villageHandler = new VillagerTraincraftHandler();
		VillagerRegistry.instance().registerVillageCreationHandler(villageHandler);
		proxy.registerVillagerSkin(ConfigHandler.TRAINCRAFT_VILLAGER_ID, "station_chief.png");
		VillagerRegistry.instance().registerVillageTradeHandler(ConfigHandler.TRAINCRAFT_VILLAGER_ID, villageHandler);

		//register player scaler
		proxy.registerPlayerScaler();
		proxy.registerBookHandler();
		proxy.registerMouseEventHandler();

		/*FMLCommonHandler.instance().bus().register(VBCTracking.getInstance());
		MinecraftForge.EVENT_BUS.register(VBCTracking.getInstance());*/

		TrainTalk.getInstance().init();
		//DSSConfig.load();




		tcLog.info("Finished Initialization!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent evt)
	{
		tcLog.info("Entering PostInitialization.");
		/* Recipes */
		tcLog.info("Initializing recipes...");
		new RecipeHandler();

		new SteamRecipes(TierRecipeManager.getInstance());
		new DieselRecipes(TierRecipeManager.getInstance());
		new ElectricRecipes(TierRecipeManager.getInstance());
		new FreightRecipes(TierRecipeManager.getInstance());
		new PassengerRecipes(TierRecipeManager.getInstance());

		new AssemblyTableRecipes().recipes();

		tcLog.info("Registering ChunkHandler..");

		tcLog.info("Activating mod compatibility.");
		TrainModCore.ModsLoaded();
		LiquidManager.getLiquidsFromDictionnary();
		if (Loader.isModLoaded("OpenComputers")) {
			tcLog.info("OpenComputers integration successfully activated!");
		}

		//Just for the laffs :)
		/*TrainTalk.getInstance().init();
		DynamicSignalServer thing = new DynamicSignalServer(0, "AutoTrain Test");
		thing.init();*/
		MapGenVillage.villageSpawnBiomes = Arrays.asList(BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.savanna, BiomeGenBase.extremeHills);
		tcLog.info("Finished PostInitialization! We are done for Traincraft!");
		// Uncomment this to regen the texture prefix data file.
		if (DebugUtil.dev && FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			new TrainSheetsDataGenerator();
		}

		ItemHandler.parseBannedItems(ConfigHandler.ROLLINGSTOCK_INVENTORY_BLACKLIST_RAW);
	}

	@EventHandler
	public void serverStop(FMLServerStoppedEvent event) {
		proxy.killAllStreams();
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
		lockoutPermissionsUtil.SetupLockoutFolders();
		tcLog.info("Traincraft: Project Locked Folders Initialized");
		for(HashMap.Entry<String, ILockoutGroup> record : lockoutPermissionsUtil.GetLockoutGroupReg().entrySet())
		{
			lockoutPermissionsUtil.SetupSkinGroup(record.getKey(), record.getValue().groupUUIDOwner());
		}
		tcLog.info("Traincraft: Project Locked Folders Skin Groups Initialized");

		event.registerServerCommand(new tcAdminPerm());
		event.registerServerCommand(new tcAddUserToSkinGroup());
		event.registerServerCommand(new tcSetSkinGroupOwner());
		event.registerServerCommand(new tcRemoveUserFromSkinGroup());

	}



}
