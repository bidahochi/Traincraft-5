package train.common.core;

import com.jcirmodelsquad.tcjcir.features.containers.ContainerStorage;
import com.jcirmodelsquad.tcjcir.features.containers.TileFortyFootContainer;
import com.jcirmodelsquad.tcjcir.features.signal.vbc.TileVBCController;
import com.jcirmodelsquad.tcjcir.tile.*;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.MinecraftForge;
import train.client.gui.GuiSpeedTransmitter;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.Freight;
import train.common.api.LiquidTank;
import train.common.api.Tender;
import train.common.containers.*;
import train.common.core.handlers.*;
import train.common.core.network.ServerLightActionQueue;
import train.common.core.network.lockout.PacketLockoutBookData;
import train.common.core.util.ReplacementStreamPlayer;
import train.common.entity.digger.EntityRotativeDigger;
import train.common.entity.rollingStock.EntityJukeBoxCart;
import train.common.entity.rollingStock.EntityTracksBuilder;
import train.common.entity.zeppelin.AbstractZeppelin;
import train.common.inventory.*;
import train.common.library.GuiIDs;
import train.common.mtc.block.BlockReceiverMTC;
import train.common.mtc.block.BlockTransmitterMTC;
import train.common.mtc.block.BlockTransmitterSpeed;
import train.common.mtc.block.BlockTransmitterStopPoint;
import train.common.mtc.tile.*;
import train.common.tile.*;
import train.common.tile.tileStopper.TileAmericanStopper;
import train.common.tile.tileStopper.TileGenericStopper;
import train.common.tile.tileStopper.legacy.concrete_type1.TileConcreteType1_AmericanStopper;
import train.common.tile.tileStopper.legacy.concrete_type1.TileConcreteType1_Generic_Stopper;
import train.common.tile.tileStopper.legacy.concrete_type2.TileConcreteType2_AmericanStopper;
import train.common.tile.tileStopper.legacy.concrete_type2.TileConcreteType2_Generic_Stopper;
import train.common.tile.tileStopper.legacy.sleeperless.TileEmbeddedAmericanStopper;
import train.common.tile.tileStopper.legacy.sleeperless.TileEmbeddedGenericStopper;
import train.common.tile.tileStopper.legacy.wood_type1.TileWoodType1_AmericanStopper;
import train.common.tile.tileStopper.legacy.wood_type1.TileWoodType1_Generic_Stopper;
import train.common.tile.tileStopper.legacy.wood_type2.TileWoodType2_AmericanStopper;
import train.common.tile.tileStopper.legacy.wood_type2.TileWoodType2_Generic_Stopper;
import train.common.tile.tileSwitch.*;
import train.common.track.attachment.TrackAttachment;
import train.common.utils.interchangetransferreport.InterchangeTransferReportGenerator.InterchangeReportDraft;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CommonProxy implements IGuiHandler {
	public static List<ReplacementStreamPlayer> playerList = new ArrayList<ReplacementStreamPlayer>();
	protected final List<IGuiHandler> devGuiHandlers = new ArrayList<IGuiHandler>();
	public static boolean debug = false;

	public void throwAlphaException() {
		throw new IllegalStateException("You're trying to use a Traincraft alpha-version past its expiry date. Download a release-build at https://minecraft.curseforge.com/projects/traincraft.");
	}

	public boolean isClient(){
		return false;
	}

	public void setKeyBinding(String name, int value) {}

	public void registerRenderInformation() {}

	public void registerEvents(FMLPreInitializationEvent event){
		WorldEvents worldEvents = new WorldEvents();
		ChunkEvents chunkEvents = new ChunkEvents();
		PlayerSyncHandler playerSyncHandler = new PlayerSyncHandler();

		registerEvent(worldEvents);
		registerEvent(chunkEvents);
		registerEvent(playerSyncHandler);
        registerEvent(ServerLightActionQueue.INSTANCE);

		ForgeChunkManager.setForcedChunkLoadingCallback(Traincraft.instance, chunkEvents);

	}

	public void registerEvent(Object o){
		FMLCommonHandler.instance().bus().register(o);
		MinecraftForge.EVENT_BUS.register(o);
	}

	public void registerDevGuiHandler(IGuiHandler handler) {
		if (handler != null && !devGuiHandlers.contains(handler)) {
			devGuiHandlers.add(handler);
		}
	}

	public void registerTileEntities() {
		GameRegistry.registerTileEntity(TileCrafterTierI.class, "TileCrafterTierI");
		GameRegistry.registerTileEntity(TileCrafterTierII.class, "TileCrafterTierII");
		GameRegistry.registerTileEntity(TileCrafterTierIII.class, "TileCrafterTierIII");
		GameRegistry.registerTileEntity(TileTrainWbench.class, "TileTrainWbench");
		GameRegistry.registerTileEntity(TileTrainDetector.class, "TileTrainDetector");
		GameRegistry.registerTileEntity(TileEntityDistil.class, "Tile Distil");
		GameRegistry.registerTileEntity(TileEntityOpenHearthFurnace.class, "Tile OpenHearthFurnace");
		GameRegistry.registerTileEntity(TileGenericStopper.class, "TileStopper");
		GameRegistry.registerTileEntity(TileEmbeddedGenericStopper.class, "TileEmbeddedStopper");
		GameRegistry.registerTileEntity(TileAmericanStopper.class, "TileAmericanStopper");
		GameRegistry.registerTileEntity(TileEmbeddedAmericanStopper.class, "TileEmbeddedAmericanStopper");

		GameRegistry.registerTileEntity(TileConcreteType1_Generic_Stopper.class, "TileConcreteType1_Stopper");
		GameRegistry.registerTileEntity(TileConcreteType1_AmericanStopper.class, "TileConcreteType1_AmericanStopper");
		GameRegistry.registerTileEntity(TileConcreteType2_Generic_Stopper.class, "TileConcreteType2_Stopper");
		GameRegistry.registerTileEntity(TileConcreteType2_AmericanStopper.class, "TileConcreteType2_AmericanStopper");
		GameRegistry.registerTileEntity(TileWoodType1_Generic_Stopper.class, "TileWoodType1_Stopper");
		GameRegistry.registerTileEntity(TileWoodType1_AmericanStopper.class, "TileWoodType1_AmericanStopper");
		GameRegistry.registerTileEntity(TileWoodType2_Generic_Stopper.class, "TileWoodType2_Stopper");
		GameRegistry.registerTileEntity(TileWoodType2_AmericanStopper.class, "TileWoodType2_AmericanStopper");



		GameRegistry.registerTileEntity(TileSignal.class, "TileTrainSignal");
		GameRegistry.registerTileEntity(TileLantern.class, "tileLantern");
		GameRegistry.registerTileEntity(TileHighStarSwitchStand.class, "tileSwitchStand");

		GameRegistry.registerTileEntity(TileOwoSwitchStand.class, "tileowoswitchstand");
		GameRegistry.registerTileEntity(TileCircleSwitchStand.class, "tilecircleswitchstand");
		GameRegistry.registerTileEntity(TileMILWSwitchStand.class, "tileMILWSwitchStand");
		GameRegistry.registerTileEntity(TileAutoSwitchStand.class, "tileautoSwitchStand");
		GameRegistry.registerTileEntity(TileOwoYardSwitchStand.class, "tileowoYardSwitchStand");
		GameRegistry.registerTileEntity(TileRacor36D_1.class, "tileRacor36D_1");
		GameRegistry.registerTileEntity(TileRacor36D_2.class, "tileRacor36D_2");
		GameRegistry.registerTileEntity(TileRacor36H.class, "tileRacor36H");
		GameRegistry.registerTileEntity(TileRacor36H_2.class, "tileRacor36H_2");

		GameRegistry.registerTileEntity(TileFortyFootContainer.class, "tileFortyFootContainer");

		GameRegistry.registerTileEntity(TileWaterWheel.class, "tileWaterWheel");
		GameRegistry.registerTileEntity(TileWindMill.class, "tileWindMill");
		GameRegistry.registerTileEntity(TileGeneratorDiesel.class, "tileGeneratorDiesel");
		GameRegistry.registerTileEntity(TileBook.class, "tileBook");
		GameRegistry.registerTileEntity(TileTCRailGag.class, "tileTCRailGag");
		GameRegistry.registerTileEntity(TileTCRail.class, "tileTCRail");
		GameRegistry.registerTileEntity(TileBridgePillar.class, "tileTCBridgePillar");

		GameRegistry.registerTileEntity(TileVBCController.class, "tileVBCController");

		GameRegistry.registerTileEntity(TileMTCMarker.class, "tileMTCMarker");

		GameRegistry.registerTileEntity(TileTransmitterSpeed.class, "tileInfoTransmitterSpeed");
		GameRegistry.registerTileEntity(TileInfoTransmitterMTC.class, "tileInfoTransmitterMTC");
		GameRegistry.registerTileEntity(TileReceiverMTC.class, "tileInfoReceiverMTC");
		GameRegistry.registerTileEntity(TileReceiverDestination.class, "tileInfoReceiverDestination");
		GameRegistry.registerTileEntity(TileInstructionRadio.class, "tilePDMInstructionRadio");
		GameRegistry.registerTileEntity(TileTransmitterStopPoint.class, "tileATOTransmitterStopPoint");

		//crossigns
		GameRegistry.registerTileEntity(TileMFPBWigWag.class, "tileMFPBWigWag");
		GameRegistry.registerTileEntity(TileWigWag.class, "tileWigWag");
		GameRegistry.registerTileEntity(TileCrossingBase.class, "tileCrossingBase");
		GameRegistry.registerTileEntity(TileFlashers.class, "tileFlashers");
		GameRegistry.registerTileEntity(TileStandardCantilever1.class, "tileStandardCantilever1");
		GameRegistry.registerTileEntity(TileStandardCantilever2.class, "tileStandardCantilever2");
		GameRegistry.registerTileEntity(TileStandardCantilever3.class, "tileStandardCantilever3");
		GameRegistry.registerTileEntity(TileMediumCantileverRight.class, "tileMediumCantileverRight");
		GameRegistry.registerTileEntity(TileMediumCantileverLeft.class, "tileMediumCantileverLeft");
		GameRegistry.registerTileEntity(TileLargeCantilever.class, "tileLargeCantilever");
		GameRegistry.registerTileEntity(TilePedestrianCrossing.class, "tilePedestrianCrossing");
		GameRegistry.registerTileEntity(TileFlashersWithGate.class, "tileStandardCrossingArm");
		GameRegistry.registerTileEntity(TileFlashersWithGate2.class, "tileStandardCrossingArm2");
		GameRegistry.registerTileEntity(TileWoodenCrossingBuck.class, "tileWoodenCrossingBuck");
		GameRegistry.registerTileEntity(TileSmallBungalo.class, "tileSmallBungalo");
		GameRegistry.registerTileEntity(TileMediumBungalo.class, "tileMediumBungalo");
		GameRegistry.registerTileEntity(TileLargeBungalo.class, "tileLargeBungalo");
	}

	public void registerComputerCraftPeripherals() throws ClassNotFoundException {
		Class computerCraft = Class.forName("dan200.computercraft.ComputerCraft");
		try {
			Method computerCraft_registerPeripheralProvider = computerCraft.getMethod("registerPeripheralProvider", new Class[] { Class.forName("dan200.computercraft.api.peripheral.IPeripheralProvider") });

			//Register all CC required blocks
			computerCraft_registerPeripheralProvider.invoke(null, BlockTransmitterSpeed.instance);
			computerCraft_registerPeripheralProvider.invoke(null, BlockReceiverMTC.instance);
			computerCraft_registerPeripheralProvider.invoke(null, BlockTransmitterMTC.instance);
			computerCraft_registerPeripheralProvider.invoke(null, BlockTransmitterStopPoint.instance);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		EntityPlayer riddenByEntity = null;
		Entity entity = player.ridingEntity;

		if (player.ridingEntity != null) {
			riddenByEntity = (EntityPlayer) entity.riddenByEntity;
		}

		Entity entity1 = null;
		if (y == -1) {
			entity1 = getEntity(world, x);
		}

		for (IGuiHandler handler : devGuiHandlers) {
			Object gui = handler.getServerGuiElement(ID, player, world, x, y, z);
			if (gui != null) {
				return gui;
			}
		}

		switch (ID) {

		case (GuiIDs.CRAFTER_TIER_I):
			return te != null && te instanceof TileCrafterTierI ? new ContainerTier(player.inventory, (TileCrafterTierI) te) : null;
		case (GuiIDs.CRAFTER_TIER_II):
			return te != null && te instanceof TileCrafterTierII ? new ContainerTier(player.inventory, (TileCrafterTierII) te) : null;
		case (GuiIDs.CRAFTER_TIER_III):
			return te != null && te instanceof TileCrafterTierIII ? new ContainerTier(player.inventory, (TileCrafterTierIII) te) : null;
		case (GuiIDs.DISTIL):
			return te != null && te instanceof TileEntityDistil ? new ContainerDistil(player.inventory, (TileEntityDistil) te) : null;
		case (GuiIDs.GENERATOR_DIESEL):
			return te != null && te instanceof TileGeneratorDiesel ? new ContainerGeneratorDiesel(player.inventory, (TileGeneratorDiesel) te) : null;
		case (GuiIDs.OPEN_HEARTH_FURNACE):
			return te != null && te instanceof TileEntityOpenHearthFurnace ? new ContainerOpenHearthFurnace(player.inventory, (TileEntityOpenHearthFurnace) te) : null;
		case (GuiIDs.TRAIN_WORKBENCH):
			return te != null && te instanceof TileTrainWbench ? new ContainerTrainWorkbench(player.inventory, player.worldObj, (TileTrainWbench) te) : null;
		case (GuiIDs.LOCO):
			if (riddenByEntity == null) {
				return null;
			}
			if (entity instanceof train.common.api.locomotive.AbstractLiquidFiredSteamEngine) {
				return new InventoryLiquidFiredLocomotive(
						riddenByEntity.inventory,
						(train.common.api.locomotive.AbstractLiquidFiredSteamEngine) entity
				);
			}
			return new InventoryLoco(riddenByEntity.inventory, (EntityRollingStock) entity);
		case (GuiIDs.CONTROL_CAR):
			return riddenByEntity != null ? new InventoryControlCar(riddenByEntity.inventory, (EntityRollingStock) entity) : null;
		case (GuiIDs.LOCO_TANKENGINE):
			return riddenByEntity != null ? new InventoryTankEngine(player.inventory, (EntityRollingStock) entity) : null;
		case (GuiIDs.CRAFTING_CART):
			return new ContainerWorkbenchCart(player.inventory, player.worldObj);
		case (GuiIDs.FURNACE_CART):
			return riddenByEntity != null ? new InventoryWorkCart(player.inventory, entity) : null;
		case (GuiIDs.ZEPPELIN):
			return riddenByEntity != null ? new InventoryZepp(player.inventory, (AbstractZeppelin) entity) : null;
		case (GuiIDs.DIGGER):
			return riddenByEntity != null  ? new InventoryRotativeDigger(player.inventory, (EntityRotativeDigger) entity) : null;

			/* Stationary entities while player is not riding. */
		case (GuiIDs.FREIGHT):
			//System.out.println("Freight: " + ID + " | " + entity1.getEntityName() + " | " + x + ":" + y + ":" + z);
			return entity1 != null && entity1 instanceof Freight ? new InventoryFreight(player.inventory, (Freight) entity1) : null;
		case (GuiIDs.JUKEBOX):
			return entity1 != null && entity1 instanceof EntityJukeBoxCart ? new InventoryJukeBoxCart(player.inventory, (EntityJukeBoxCart) entity1) : null;
		case (GuiIDs.TENDER):
			return entity1 != null && entity1 instanceof Tender ? new InventoryTender(player.inventory, (Tender) entity1) : null;
		case (GuiIDs.BUILDER):
			return entity1 != null && entity1 instanceof EntityTracksBuilder ? new InventoryBuilder(player.inventory, (EntityTracksBuilder) entity1) : null;
		case (GuiIDs.LIQUID):
			return entity1 != null && entity1 instanceof LiquidTank ? new InventoryLiquid(player.inventory, (LiquidTank) entity1) : null;
		case (GuiIDs.SPEED_TRANSMITTER):
			return te instanceof TileTransmitterSpeed ? new GuiSpeedTransmitter(te) : null;
		case (GuiIDs.STOPPOINT_TRANSMITTER):
			return te instanceof TileTransmitterStopPoint ? new GuiSpeedTransmitter(te) : null;
		case (GuiIDs.FORTY_FOOT_CONTAINER):
			return te instanceof TileFortyFootContainer ? new ContainerStorage(player.inventory, (TileFortyFootContainer) te) : null;
			default:
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public static Entity getEntity(World world, int entityId) {
		if ((world != null) && (world instanceof WorldServer)) {
			return world.getEntityByID(entityId);
		}
		return null;
	}

	public int addArmor(String armor) {
		return 0;
	}

	public Minecraft getClientInstance() {
		return FMLClientHandler.instance().getClient();
	}

	public GuiScreen getCurrentScreen() {
		return null;
	}

	public void registerTextureFX() {}

	public void registerSounds() {}

	public void registerBookHandler() {}

	public Minecraft getMinecraft() {
		return null;
	}

	public void registerVillagerSkin(int villagerId, String textureName) {}

	public static void killAllStreams() {
		for (ReplacementStreamPlayer p : playerList) {
			p.stopPlayer();
		}
	}

	public void openadmingui(String data){}

	/** Ignores a client-only interchange report request on the logical server. */
	public void openInterchangeReport(InterchangeReportDraft draft)
	{
	}

	/** Ignores a client-only lockout-book update on the logical server. */
	public void updateLockoutBook(PacketLockoutBookData packet)
	{
	}

	/** Ignores a client-only action-bar request on the logical server. */
	public void displayActionBarMessage(String message, int durationTicks)
	{
	}

	/** Ignores a client-only attachment-state update on the logical server. */
	public void applyTrackAttachmentState(int ownerX, int ownerY, int ownerZ,
			List<TrackAttachment> attachments)
	{
	}

	/** Ignores a client-only track-placement sound request on the logical server. */
	public void playTrackPlacementSound(double x, double y, double z)
	{
	}

	public static boolean checkJukeboxEntity(World world, int id) {
		return  world.getEntityByID(id)!=null;
	}

	public void doNEICheck(ItemStack stack) {}

	public EntityPlayer getPlayer() {
		return null;
	}

	public float getJukeboxVolume() {
		return 0;
	}

	public void registerKeyBindingHandler() {}

	public void setHook() {}

	public void registerPlayerScaler(){}

	public void registerMouseEventHandler() {
		MinecraftForge.EVENT_BUS.register(new MouseEventListener());
		Traincraft.channel.register(new PacketHandler());
	}

}
