package train.common.api;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import mods.railcraft.api.carts.IMinecart;
import mods.railcraft.api.carts.IRoutableCart;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.*;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.util.Constants;
import org.apache.commons.lang3.ArrayUtils;
import train.client.gui.GuiTCTextField;
import train.client.render.register.SubTrainRenderRecord;
import train.common.Traincraft;
import train.common.adminbook.ItemAdminBook;
import train.common.blocks.BlockTCRail;
import train.common.blocks.BlockTCRailGag;
import train.common.core.handlers.ConfigHandler;
import train.common.core.handlers.TrainHandler;
import train.common.entity.CargoManager;
import train.common.entity.TrustedPlayer;
import train.common.items.ItemChunkLoaderActivator;
import train.common.items.ItemAbstractRollingStock;
import train.common.items.ItemWrench;
import train.common.library.register.ITrainRecord;
import train.client.render.register.ITrainRenderRecord;
import train.common.overlaytexture.OverlayTextureManager;
import train.common.tile.TileTCRail;
import train.common.tile.TileTCRailGag;
import train.common.utils.lockout.ILockoutGroup;

import java.util.*;

import static train.common.core.handlers.ConfigHandler.CREATIVE_DROP_ROLLINGSTOCK;

public abstract class AbstractTrains extends EntityMinecart implements IMinecart, IRoutableCart, IEntityAdditionalSpawnData
{
	/**
	 * The color of the current rollingstock -1 if default
	 */
	protected int color;
	public boolean isAttached = false;
	public boolean isAttaching = false;
	public static int numberOfTrains;
	public double Link1;
	public double Link2;
	protected boolean linked = false;
	public EntityRollingStock cartLinked1;
	public EntityRollingStock cartLinked2;
	public int clearLinkTimer = 0;
	//private Set chunks;
	protected Ticket chunkTicket;
	public float renderYaw;
	protected float renderPitch;
    /**
     * The Train
     */
	public TrainHandler trainHandler;
	public List<ChunkCoordIntPair> loadedChunks = new ArrayList<ChunkCoordIntPair>();
	public boolean shouldChunkLoad = true;
	protected boolean itemdropped =false;
	/**
	 * A reference to EnumTrains containing all spec for this specific train
	 */
	protected ITrainRecord trainSpec;

	private ITrainRenderRecord renderSpec;
	private SubTrainRenderRecord subTrainRenderRecordSpec;

	/**
	 * The name of the train based on the item name
	 */
	public String trainName = "";
	public double accelerate = 0.7D;
	public double brake = 0.96D;
	/**
	 * determines the mass of the carts from 0 to 10 it's then multiplied by 10
	 * to pretend this is [tons]
	 */
	public double mass = 1;
	/**
	 * the default mass, not affected by weight of items/liquids
	 */
	public double defaultMass = 1;
	/**
	 * the power of locomotives, 0 for carts
	 */
	public int power = 0;
	/**
	 * Whether this train is locked and can only be used by the Owner
	 */
	public boolean locked = false;
	/**
	 * The owner of the train: The user who spawned it
	 */
	public String trainOwner = "";

	public String getTransportOwner() {
		return trainOwner;
	}

	public void setTrainOwner(String trainOwner) {
		this.trainOwner = trainOwner;
	}

	/**
	 * The creator of the train
	 */
	public String trainCreator = "";

	/**
	 * The type of the train: steam tender diesel electric freight flat tank
	 * passenger work special
	 */
	public String trainType = "";

	///**
	// * player who destroyed the train
	// */
	//protected String trainDestroyer = "";

	/**
	 * unique ID for a train. ID is create when item is created. This allows to
	 * track a train not only in his entity form
	 */
	public int uniqueID = -1;
	/**
	 * supposed to store the last ID given;
	 */
	public static int uniqueIDs = 1;

	/**
	 * The distance this train has traveled
	 */
	public double trainDistanceTraveled = 0;

	public String destination = "";

	public GuiTCTextField guiTCTextFieldTrainNote;
	public String trainNote = "";
	private OverlayTextureManager overlayTextureContainer;
	private boolean acceptsOverlayTextures = false;

	public TileTCRail currentParentRail = null;

	/**
	 * Registers all possible color textures
	 */
	public ArrayList<Integer> acceptedColors;

	/**
	 * <p>List of players trusted to use the train</p>
	 */
	private List<TrustedPlayer> trustedList = new ArrayList<>();
	private CargoManager cargoManager = null;
	private final Map<Integer, String> textureDescriptionMap = new HashMap<>();

	public final Map<Integer, String> textureFullPathOverride = new HashMap<>();

	public Map<Integer, String> getTextureDescriptionMap()
	{
		return textureDescriptionMap;
	}

	public boolean isTextureDescriptionMapEmpty()
	{
		return textureDescriptionMap.isEmpty();
	}

	public boolean textureDescriptionMapContainsKey(int key)
	{
		return textureDescriptionMap.containsKey(key);
	}

	public String textureDescriptionGet(int key)
	{
		return textureDescriptionMap.get(key);
	}

	public void InsertTexture(int pos, String desc, ILockoutGroup lockoutGroup)
	{
		textureDescriptionMap.put(pos, desc);
		lockoutMap.put(pos, lockoutGroup);
	}

	public void InsertTexture(int pos, String desc)
	{
		textureDescriptionMap.put(pos, desc);
	}

	public void InsertTexture(String desc, ILockoutGroup lockoutGroup)
	{
		int pos = textureDescriptionMap.size();
		textureDescriptionMap.put(pos, desc);
		lockoutMap.put(pos, lockoutGroup);
	}

	public void InsertTexture(String desc)
	{
		int pos = textureDescriptionMap.size();
		textureDescriptionMap.put(pos, desc);
	}

	/**
	 * Function as a compatibility layer to easily convert tim
	 * @param theClass
	 * @param modID
	 * @param fullTexturePath
	 * @param desc
	 * @param extraLore
	 */
	public void InsertSkinRecord(Class theClass, String modID, String fullTexturePath, String desc, String extraLore)
	{
		int pos = textureDescriptionMap.size();
		textureDescriptionMap.put(pos, desc);
		textureFullPathOverride.put(pos, fullTexturePath);
	}

	public final Map<Integer, ILockoutGroup> lockoutMap = new HashMap<>();

	public final boolean IsSkinLockedByLockout(int i)
	{
		return lockoutMap.containsKey(i);
	}

	@Override
	public float getBrightness(float p_70013_1_) {
		getBrightnessForRender(2);
		getBrightness(2);
		isBurning();
		isImmuneToFire();
		return super.getBrightness(p_70013_1_);
	}

	public AbstractTrains(World world) {
		super(world);
		color = -1;
		trainSpec = Traincraft.instance.traincraftRegistry.getTrainRecord(this.getClass());
		acceptedColors = new ArrayList<Integer>();
		this.setMinecartName(trainSpec.name());
		if (trainSpec.getColors() != null)
		{
			for (int i = 0; i < trainSpec.getColors().length; i++)
			{
				this.acceptedColors.add((trainSpec.getColors()[i]));
			}
		}
		if (world != null)
		{
			renderDistanceWeight = 2.0D;
			dataWatcher.addObject(12, color);
			dataWatcher.addObject(6, trainType);
			dataWatcher.addObject(7, trainOwner);
			//dataWatcher.addObject(8, trainDestroyer);
			dataWatcher.addObject(9, trainName);
			dataWatcher.addObject(10, numberOfTrains);
			dataWatcher.addObject(11, uniqueID);
			dataWatcher.addObject(13, trainCreator);
			dataWatcher.addObject(31, trainNote); //train note


			// Chunk loading by default should always be disabled when placing a locomotive
			this.setFlag(7, false);
			this.setDefaultMass(trainSpec.getMass() > 0 ? trainSpec.getMass() : weightKg() * 0.1 );
			this.setSize(0.98f, 1.98f);
			GetRenderSpec();
		}
	}

	/**
	 * Please keep this based on the real country code standard ISO 3166 code
	 * @return
	 */
	public String transportCountry()
	{
		return "";
	};

	public String transportYear() {
		return "";
	}

	public boolean isFictional() {
		return false;
	}


	/**
	 * Called to set up initial pos and motion
	 * ONLY CALLED BY SERVER SIDE
	 * @param x
	 * @param y
	 * @param z
	 */
	public void SetupRollingStockSpawn(double x, double y, double z)
	{
		setPosition(x, y + (double)yOffset, z);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;

		if (getCargoManager() != null && getCargoManager().GetDefaultOverride() != -1)
		{
			getCargoManager().setSelectedCargo(getCargoManager().GetDefaultOverride());
		}
	}

	private void GetRenderSpec()
	{
		if (worldObj.isRemote)
		{
			renderSpec = Traincraft.instance.traincraftRegistry.getTrainRenderRecord(this.getClass(), this);
			subTrainRenderRecordSpec = renderSpec.getSubTrainRenderRecord(((short) this.getColor()));
		}
	}

	public int numCarsOnSlope() {
		int count = 0;
		if (trainHandler == null) {
			return 1;
		}
		for(EntityRollingStock entity: trainHandler.getTrains())
		{
			int floorX = (int) Math.floor(entity.posX);
			int floorY = (int) Math.floor(entity.posY);
			int floorZ = (int) Math.floor(entity.posZ);
			Block block = worldObj.getBlock(floorX, floorY, floorZ);
			TileTCRail tile = null;
			if (block instanceof BlockAir) {
				floorY--;
				block = worldObj.getBlock(floorX, floorY, floorZ);
			}
			if (block instanceof BlockTCRail) {
				tile = (TileTCRail) worldObj.getTileEntity(floorX, floorY, floorZ);
			} else if (block instanceof BlockTCRailGag) {
				TileTCRailGag tileGag = (TileTCRailGag) worldObj.getTileEntity(floorX, floorY, floorZ);
				if (worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ) instanceof TileTCRail) {
					tile = (TileTCRail) worldObj.getTileEntity(tileGag.originX, tileGag.originY, tileGag.originZ);
				}
			}
			if (tile != null && tile.slopeAngle != 0) {
				count++;
			}
		}
		return count;
	}

	public boolean IsChunkLoading()
	{
		return getFlag(7);
	}

	@Override
	public AxisAlignedBB getCollisionBox(Entity p_70114_1_) {
		if(riddenByEntity!=p_70114_1_){
			return super.getCollisionBox(p_70114_1_);
		} else {
				return null;
			}
	}

	/**
	 * <p>This method is called on the client side when an entity is being loaded in. The additionalData buffer is sent from the server
	 * and is populated by the server using the writeSpawnData method.</p>
	 * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
	 * @param additionalData The packet data stream
	 */
	@Override
	public void readSpawnData(ByteBuf additionalData) {
		locked = additionalData.readBoolean();
	}

	/**
	 * <p>This method is called on the server side when a connected client is loading the entity. Data written
	 * to the ByteBuffer will be synced with the client and available to the client through the readSpawnData method.</p>
	 * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
	 * @param buffer The packet data stream
	 */
	@Override
	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeBoolean(locked);
	}

	public float getPlayerScale(){ 	return 0.65f;}

	public float getPlayerModelOffset(boolean isSelf)
	{
		// 0.15 must match the base value of the other
		return isSelf ? 0.15f : (0.15f * 2f) + 0.02f;
	}

	public abstract boolean isLocomotive();

	public abstract boolean isPassenger();

	public abstract boolean isFreightCart();

	public abstract boolean isFreightOrPassenger();

	public abstract boolean isBuilder();

	public abstract boolean isTender();

	public abstract boolean isWorkCart();

	public abstract boolean isElectricTrain();

	public abstract boolean isLinked();

	protected abstract boolean canOverheat();

	protected abstract int getOverheatTime();

	public abstract float getLinkageDistance(EntityMinecart cart);

	//public abstract int getID();

	public abstract boolean canBeAdjusted(EntityMinecart cart2);

	public abstract float getOptimalDistance(EntityMinecart cart2);

	public abstract List<ItemStack> getItemsDropped();

	public int getUniqueTrainID(){
		return uniqueID;
	}

	public String getTrainNote() {
		return dataWatcher.getWatchableObjectString(31);
	}

	public void manageChunkLoading(){
		//if(this instanceof Locomotive)System.out.println("I'm alive. Remote: " + worldObj.isRemote);
		if (!worldObj.isRemote && this.uniqueID == -1) {
			if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
				//TraincraftSaveHandler.createFile(FMLCommonHandler.instance().getMinecraftServerInstance());
				//int readID = TraincraftSaveHandler.readInt(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:");
				//int newID = setNewUniqueID(readID);
				setNewUniqueID(this.getEntityId());
				//TraincraftSaveHandler.writeValue(FMLCommonHandler.instance().getMinecraftServerInstance(), "numberOfTrains:", new String("" + newID));
				//System.out.println("Train is missing an ID, adding new one for "+this.trainName+" "+this.uniqueID);
			}
		}
		shouldChunkLoad = getFlag(7);
		if (shouldChunkLoad){
			if(this.chunkTicket == null) {
				this.requestTicket();
			}
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if(!(this instanceof EntityRollingStock)) {
			manageChunkLoading();
		}
		/*
		 * if (worldObj.isRemote) { if (this.getFlag(6)) { if (this.chunks !=
		 * null) { Iterator var3 = this.chunks.iterator(); while
		 * (var3.hasNext()) { ChunkCoordIntPair var4 = (ChunkCoordIntPair)
		 * var3.next(); int x = var4.getCenterXPos(); int z =
		 * var4.getCenterZPosition();
		 * this.worldObj.spawnParticle("mobSpellAmbient", x, posY, z, 0, 0, 0);
		 * for (int i = 0; i < 10; i++) { this.worldObj.spawnParticle("portal",
		 * x + (this.rand.nextDouble() - 0.5D) * (double) 8, this.posY +
		 * this.rand.nextDouble() * (double) 6 - 0.25D, z +
		 * (this.rand.nextDouble() - 0.5D) * (double) 8, (this.rand.nextDouble()
		 * - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() -
		 * 0.5D) * 2.0D); } } } else { this.setupChunks(this.chunkCoordX,
		 * this.chunkCoordZ); } } } else if (!ConfigHandler.CHUNK_LOADING) {
		 * this.releaseTicket(); } else { if (this.ticket == null) {
		 * this.requestTicket(); } }
		 */
	}
	@Override
	public void setDead()
	{
		ForgeChunkManager.releaseTicket(chunkTicket);
	}

	public int setNewUniqueID(int numberOfTrains) {
		// System.out.println(numberOfTrains);
		if (numberOfTrains <= 0) {
			numberOfTrains = uniqueIDs++;
		}
		else {
			uniqueIDs = numberOfTrains++;
		}
		this.uniqueID = numberOfTrains;
		getEntityData().setInteger("uniqueID", numberOfTrains);
		// System.out.println("setting new ID "+uniqueID);
		return numberOfTrains;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		ItemStack itemstack = entityplayer.inventory.getCurrentItem();
		if (!worldObj.isRemote && ConfigHandler.CHUNK_LOADING && (this instanceof Locomotive))
		{
			if (onClickWithChunkLoader(itemstack, entityplayer))
			{
				return true;
			}

			if(lockThisCart(itemstack, entityplayer))
			{
				return true;
			}
		}
		return false;
	}

	public boolean onClickWithChunkLoader(ItemStack itemStack, EntityPlayer entityplayer)
	{
		if (itemStack != null && itemStack.getItem() instanceof ItemChunkLoaderActivator)
		{
			if (getFlag(7))
			{
				this.setFlag(7, false);
				entityplayer.addChatMessage(new ChatComponentText("Stop loading chunks"));
				ForgeChunkManager.releaseTicket(chunkTicket);
				chunkTicket = null;
			}
			else
			{
				this.setFlag(7, true);
				entityplayer.addChatMessage(new ChatComponentText("Start loading chunks"));
			}
			itemStack.damageItem(1, entityplayer);
			return true;
		}

		return false;
	}

	public void setPacketChunkLoading(boolean shouldChunkLoad)
	{
		this.shouldChunkLoad = shouldChunkLoad;
		if (getFlag(7))
		{
			this.setFlag(7, false);

			ForgeChunkManager.releaseTicket(chunkTicket);
			chunkTicket = null;
		}
	}

	/**
	 * set the color of the rollingstock
	 *
	 * @see ItemAbstractRollingStock
	 * @param color
	 */
	/*public void setColor(int color) {
		if (color==-1 && EnumTrains.getCurrentTrain(getCartItem().getItem()).getColors()!=null){
			color = getColorFromString(EnumTrains.getCurrentTrain(getCartItem().getItem()).getColors()[0]);
		}
		dataWatcher.updateObject(12, color);
	}*/
	public void setColor(int color)
	{
		int[] colors = Traincraft.traincraftRegistry.getCurrentTrain(getCartItem().getItem()).getColors();
		if (colors != null)
		{
			if (color==-1 || !ArrayUtils.contains(colors,(byte)color)) {
				color = (colors[0]);
			}
		}
		dataWatcher.updateObject(12, color);
		this.getEntityData().setInteger("color", color);
		if (worldObj.isRemote)
		{
			subTrainRenderRecordSpec = getRenderSpec().getSubTrainRenderRecord(((short) this.getColor()));
		}
	}

	public void setRenderYaw(float yaw) {
		this.renderYaw = yaw;
	}

	public void setRenderPitch(float pitch) {
		this.renderPitch = pitch;
	}

	public int getColor() {
		return dataWatcher.getWatchableObjectInt(12);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		//super.writeEntityToNBT(nbttagcompound);
		nbttagcompound.setInteger("color", getColor());
		nbttagcompound.setBoolean("chunkLoadingState", getFlag(7));
		nbttagcompound.setDouble("trainDistanceTraveled", trainDistanceTraveled);
		nbttagcompound.setString("theOwner", trainOwner);
		nbttagcompound.setBoolean("locked", locked);
		nbttagcompound.setString("theCreator", trainCreator);
		nbttagcompound.setString("theName", trainName);
		nbttagcompound.setString("theType", trainType);
		nbttagcompound.setInteger("uniqueID", uniqueID);
		//nbttagcompound.setInteger("uniqueIDs",uniqueIDs);

		nbttagcompound.setInteger("numberOfTrains", AbstractTrains.numberOfTrains);
		nbttagcompound.setBoolean("isAttached", this.isAttached);
		nbttagcompound.setBoolean("linked", this.linked);
		//nbttagcompound.setDouble("motionX", motionX);
		//nbttagcompound.setDouble("motionZ", motionZ);
		nbttagcompound.setDouble("Link1", Link1);
		nbttagcompound.setDouble("Link2", Link2);

		nbttagcompound.setInteger("Dim", this.dimension);

		nbttagcompound.setLong("UUIDM", this.getUniqueID().getMostSignificantBits());
		nbttagcompound.setLong("UUIDL", this.getUniqueID().getLeastSignificantBits());
		nbttagcompound.setString("trainNote", trainNote);
		exportTrustedListToNBT(nbttagcompound);
		if (cargoManager != null) {
			getCargoManager().exportToNBT(nbttagcompound);
		}

		nbttagcompound.setBoolean("acceptsOverlayTextures", acceptsOverlayTextures);
		if (acceptsOverlayTextures) {
			nbttagcompound.setTag("overlayTextureConfigTag", overlayTextureContainer.getOverlayConfigTag());
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		//super.readEntityFromNBT(nbttagcompound);
		setColor(nbttagcompound.getInteger("color"));
		setFlag(7, nbttagcompound.getBoolean("chunkLoadingState"));
		trainDistanceTraveled = nbttagcompound.getDouble("trainDistanceTraveled");
		trainOwner = nbttagcompound.getString("theOwner");
		this.locked = nbttagcompound.getBoolean("locked");
		setFlag(8, locked);
		trainCreator = nbttagcompound.getString("theCreator");
		trainName = nbttagcompound.getString("theName");
		trainType = nbttagcompound.getString("theType");
		uniqueID = nbttagcompound.getInteger("uniqueID");
		//uniqueIDs = nbttagcompound.getInteger("uniqueIDs");
		setInformation(trainType, trainOwner, trainCreator, trainName, uniqueID);

		numberOfTrains = nbttagcompound.getInteger("numberOfTrains");
		isAttached = nbttagcompound.getBoolean("isAttached");
		linked = nbttagcompound.getBoolean("linked");
		//motionX = nbttagcompound.getDouble("motionX");
		//motionZ = nbttagcompound.getDouble("motionZ");
		Link1 = nbttagcompound.getDouble("Link1");
		Link2 = nbttagcompound.getDouble("Link2");
		if(nbttagcompound.hasKey("Dim")){
			this.dimension=nbttagcompound.getInteger("Dim");
		}
		if(nbttagcompound.hasKey("trainNote")) trainNote = nbttagcompound.getString("trainNote");
		dataWatcher.updateObject(31, trainNote);

		if(nbttagcompound.hasKey("UUIDM")){
			this.entityUniqueID = new UUID(nbttagcompound.getLong("UUIDM"), nbttagcompound.getLong("UUIDL"));
		}
		importTrustedListFromNBT(nbttagcompound);
		if (cargoManager != null) {
			getCargoManager().importFromNBTTagCompound(nbttagcompound);
		}

		if (nbttagcompound.getBoolean("acceptsOverlayTextures")) {
			acceptsOverlayTextures = true;
			overlayTextureContainer.importFromConfigTag(nbttagcompound.getCompoundTag("overlayTextureConfigTag"));
		}
	}

	@Override
	public boolean writeMountToNBT(NBTTagCompound tag){
		return false;
	}
	@Override
	public boolean writeToNBTOptional(NBTTagCompound p_70039_1_) {
		if (!this.isDead && this.getEntityString() != null) {
			p_70039_1_.setString("id", this.getEntityString());
			this.writeToNBT(p_70039_1_);
			return true;
		}
		return false;
	}

	public void setInformation(String trainType, String trainOwner, String trainCreator, String trainName, int uniqueID) {
		if (!worldObj.isRemote) {
			dataWatcher.updateObject(6, trainType);
			dataWatcher.updateObject(7, trainOwner);
			dataWatcher.updateObject(9, trainName);
			dataWatcher.updateObject(11, uniqueID);
			dataWatcher.updateObject(31, trainNote);

			if (trainCreator != null && !trainCreator.isEmpty()){ dataWatcher.updateObject(13, trainCreator);}
		}
	}

	/**
	 * @author 02skaplan
	 * <p>Called to setup the overlay texture manager for the given AbstractTrain. It is recommended
	 * to call this from the constructor of the AbstractTrain-derived entity class.</p>
	 * <p>After calling, it is recommended to use getOverlayTextureContainer to initialze the fixed, dynamic, or both
	 * fixed and dynamic overlays with their respective settings.</p>
	 */
	public void initOverlayTextures() {
		overlayTextureContainer = new OverlayTextureManager(this);
		acceptsOverlayTextures = true;
	}

	public OverlayTextureManager getOverlayTextureContainer() {
		return overlayTextureContainer;
	}

	public boolean acceptsOverlayTextures() {
		return acceptsOverlayTextures;
	}

	public static String getColorAsString(int i)
	{
		switch (i)
		{
			case 0:
				return "Black";
			case 1:
				return "Red";
			case 2:
				return "Green";
			case 3:
				return "Brown";
			case 4:
				return "Blue";
			case 5:
				return "Purple";
			case 6:
				return "Cyan";
			case 7:
				return "LightGrey";
			case 8:
				return "Grey";
			case 13:
				return "Magenta";
			case 10:
				return "Lime";
			case 11:
				return "Yellow";
			case 12:
				return "LightBlue";
			case 9:
				return "Pink";
			case 14:
				return "Orange";
			case 15:
				return "White";
			case 100:
				return "Empty";
			case 101:
				return "Full";
			default:
				return "Skin" + i;
		}
	}

	public String getColorAsString()
	{
		return getColorAsString(getColor());
	}

	public static int getColorFromString(String color)
	{
		switch (color)
		{
			case "Black":
				return 0;
			case "Red":
				return 1;
			case "Green":
				return 2;
			case "Brown":
				return 3;
			case "Blue":
				return 4;
			case "Purple":
				return 5;
			case "Cyan":
				return 6;
			case "LightGrey":
				return 7;
			case "Grey":
				return 8;
			case "Magenta":
				return 13;
			case "Lime":
				return 10;
			case "Yellow":
				return 11;
			case "LightBlue":
				return 12;
			case "Pink":
				return 9;
			case "Orange":
				return 14;
			case "White":
				return 15;
			default:
			{
				if (color.startsWith("Skin"))
				{
					return Integer.parseInt(color.substring(4));
				}
			}
		}

		if (color.equals("Empty"))
		{
			return 100;
		}
		if (color.equals("Full"))
		{
			return 101;
		}
		return -1;
	}

	public void dropCartAsItem(boolean isCreative)
	{
		if (!itemdropped && (CREATIVE_DROP_ROLLINGSTOCK || !isCreative))
		{
			itemdropped=true;
			for (ItemStack item : getItemsDropped())
			{
				if (item.getItem() instanceof ItemAbstractRollingStock)
				{
					ItemStack stack = ItemAbstractRollingStock.setPersistentData(item,this,this.getUniqueTrainID(), trainOwner, trainCreator, getColor(), trainNote);
					exportTrustedListToNBT(stack != null ? stack.getTagCompound() : null);
					if (cargoManager!= null && cargoManager.getSelectedCargo() != 0 && stack != null)
					{
						stack.getTagCompound().setInteger("cargoSelection", cargoManager.getSelectedCargo());
					}
                    // Only save the overlay configuration to NBT if it exists. No need to store an empty configuration in NBT as it will be initialized as the default when the entity spawns in.
                    if (this.acceptsOverlayTextures && this.getOverlayTextureContainer().hasActiveOverlays() && stack != null)
                        stack.getTagCompound().setTag("overlayTextureConfigTag", getOverlayTextureContainer().getOverlayConfigTag());
					entityDropItem(stack!=null?stack:item,0);
				}
				else
				{
					setUniqueIDToItem(item);
					entityDropItem(item, 0);
				}
			}
		}
	}

	protected void setUniqueIDToItem(ItemStack stack) {
		NBTTagCompound var3 = stack.getTagCompound();
		if (var3 == null) {
			var3 = new NBTTagCompound();
			stack.setTagCompound(var3);
		}
		if (this.uniqueID != -1) stack.getTagCompound().setInteger("uniqueID", this.uniqueID);
		if (this.trainCreator != null && !this.trainCreator.isEmpty()) stack.getTagCompound().setString("trainCreator", this.trainCreator);
		if (this.getColor() != -1) stack.getTagCompound().setInteger("trainColor", this.getColor());

	}

	protected void setDefaultMass(double def) {
		this.mass = def;
		this.defaultMass = def;
	}

	protected double getDefaultMass() {
		return defaultMass;
	}

	/**
	 * Lock packet
	 */
	public boolean getTrainLockedFromPacket() {
		return locked;
	}

	/**
	 * Lock packet
	 */
	public void setTrainLockedFromPacket(boolean set) {
		// System.out.println(worldObj.isRemote + " " + set);
		locked = set;
	}


	/** Locking for passengers, flat, caboose, jukebox,workcart */
	protected boolean lockThisCart(ItemStack itemstack, EntityPlayer entityplayer) {
		if (itemstack != null && (itemstack.getItem() instanceof ItemWrench || itemstack.getItem() instanceof ItemAdminBook))
		{
			if (entityplayer.getDisplayName().equals(this.trainOwner) || entityplayer.getGameProfile().getName().equals(this.trainOwner)
					|| this.trainOwner.equals("") || entityplayer.canCommandSenderUseCommand(2, ""))
			{
				if (locked)
				{
					locked = false;
					if(worldObj.isRemote)
					{
						entityplayer.addChatMessage(new ChatComponentText("Unlocked"));
					}
				}
				else {
					locked = true;
					if(worldObj.isRemote)
					{
						entityplayer.addChatMessage(new ChatComponentText("Locked"));
					}
				}
			}
			else if (worldObj.isRemote) {
				entityplayer.addChatMessage(new ChatComponentText("You are not the owner!"));
			}
			return true;
		}
		return false;
	}

	protected boolean canBeRiddenWhileLocked(AbstractTrains train) {
		return (train instanceof Locomotive) || (train instanceof IPassenger) || (train instanceof AbstractWorkCart);
	}

	protected boolean canBeDestroyedByPlayer(DamageSource damagesource) {
		if (this.getTrainLockedFromPacket())
		{
			if (damagesource.getEntity() instanceof EntityPlayer)
			{
				if ((damagesource.getEntity() instanceof EntityPlayerMP) &&
						((EntityPlayerMP)damagesource.getEntity()).canCommandSenderUseCommand(2, "") &&
						((EntityPlayer) damagesource.getEntity()).inventory.getCurrentItem() != null &&
						((EntityPlayer) damagesource.getEntity()).inventory.getCurrentItem().getItem() instanceof ItemWrench)
				{

					((EntityPlayer) damagesource.getEntity()).addChatMessage(new ChatComponentText("Removing the train using OP permission"));
					return false;
				}
				else if (!((EntityPlayer) damagesource.getEntity()).getDisplayName().equalsIgnoreCase(this.trainOwner) && !(this.isPlayerTrustedToBreak(((EntityPlayerMP) damagesource.getEntity()).getDisplayName())))
				{
					((EntityPlayer) damagesource.getEntity()).addChatMessage(new ChatComponentText("You are not the owner!"));
					return true;
				}
			}
			else if (!damagesource.isProjectile())
			{
				return true;
			}
		}
		return false;
	}

	public final static void dropStockInventoryContents(AbstractTrains stock, ItemStack cargoItems[])
	{
		if (cargoItems != null)
		{
			for (ItemStack stack : cargoItems) {
				if (stack != null) {
					stock.entityDropItem(stack, 0);
				}
			}
		}
	}

	/** Railcraft routing integration */
	@Override
	public boolean doesCartMatchFilter(ItemStack stack, EntityMinecart cart) {
		if (stack == null || cart == null) { return false; }
		ItemStack cartItem = cart.getCartItem();
		return cartItem.getItem() == stack.getItem();
	}

	@Override
	public String getDestination() {
		if (destination == null) return "";
		return destination;
	}

	/**
	 * Only locomotives can receive a destination from a track. It is then
	 * transmitted to attached carts
	 */
	@Override
	public boolean setDestination(ItemStack ticket) {
		return false;
	}

	public static String getTicketDestination(ItemStack ticket) {
		if ((ticket == null)) { return ""; }
		NBTTagCompound nbt = ticket.getTagCompound();
		if (nbt == null) { return ""; }
		return nbt.getString("dest");
	}


	@Override
	public String getCommandSenderName()
	{
		return StatCollector.translateToLocal(getCartItem().getItem().getUnlocalizedName()+".name");
	}

	public void setTicket(ForgeChunkManager.Ticket ticket){
		this.chunkTicket = ticket;
	}
	public ForgeChunkManager.Ticket getTicket(){
		return this.chunkTicket;
	}

	public void requestTicket() {
		ForgeChunkManager.Ticket chunkTicket = ForgeChunkManager.requestTicket(Traincraft.instance, worldObj , ForgeChunkManager.Type.ENTITY);
		if(chunkTicket != null) {
			chunkTicket.setChunkListDepth(25);
			chunkTicket.bindEntity(this);
			this.setTicket(chunkTicket);
		}
	}

	public String getPersistentUUID() {
		if(getEntityData().hasKey("puuid")) {
			return getEntityData().getString("puuid");
		} else {
			System.out.println("setting UUID");
			getEntityData().setString("puuid", getUniqueID().toString());
			return this.getUniqueID().toString();
		}
	}

	/**defines the weight of the transport.*/
	public float weightKg()
	{
		return (float)trainSpec.getMass()*10f;
	}

	/**
	 * @return Returns String ArrayList of trusted players' usernames.
	 */
	public List<TrustedPlayer> getTrustedList() {
		return trustedList;
	}
	public void setTrustedList(List<TrustedPlayer> trustedList) { this.trustedList = trustedList; }

	/**
	 * <p>Returns whether or not a player is trusted to a piece of rolling stock.</p>
	 * @param displayName Case-insensitive display name of player.
	 * @return True if the player is trusted, false if the player is not trusted.
	 */
	public boolean isPlayerTrusted(String displayName) {
		for (TrustedPlayer trustedPlayer : this.getTrustedList()) {
			if (trustedPlayer.getDisplayName().equalsIgnoreCase(displayName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <p>Returns whether or not a player is trusted to break a piece of rolling stock.</p>
	 * @param displayName Case-insensitive display name of player.
	 * @return True if player has break access, false if player does not have break access.
	 */
	public boolean isPlayerTrustedToBreak(String displayName) {
		for (TrustedPlayer trustedPlayer : this.getTrustedList()) {
			if (trustedPlayer.getDisplayName().equalsIgnoreCase(displayName)) {
				return trustedPlayer.hasBreakAccess();
			}
		}
		return false;
	}

	/**
	 * <p>Export trusted players to NBT tag for data saving.</p>
	 * @param nbttagcompound NBT tag into which to write trusted list.
	 */
	public void exportTrustedListToNBT(NBTTagCompound nbttagcompound) {
		if (!trustedList.isEmpty()) {
			NBTTagList trustedList = new NBTTagList();
			for (TrustedPlayer trustedPlayer : this.trustedList) {
				NBTTagCompound trustedPlayerTag = new NBTTagCompound();
				trustedPlayerTag.setString("playerName", trustedPlayer.getDisplayName());
				trustedPlayerTag.setBoolean("breakAccess", trustedPlayer.hasBreakAccess());
				trustedList.appendTag(trustedPlayerTag);
			}
			nbttagcompound.setTag("trustedList", trustedList);
			nbttagcompound.setString("trustedListPreviousOwner", getTransportOwner());
		}
	}

	/**
	 * <p>Import a trusted player list from a given NBT tag.</p>
	 * @param nbttagcompound NBT tag from which to import trusted list.
	 */
	public void importTrustedListFromNBT(NBTTagCompound nbttagcompound) {
		if (nbttagcompound.hasKey("trustedList")) {
			NBTTagList trustedList = nbttagcompound.getTagList("trustedList", Constants.NBT.TAG_COMPOUND);
			this.trustedList.clear();
			for (int i = 0; i < trustedList.tagCount(); i++) {
				if (!trustedList.getCompoundTagAt(i).getString("playerName").equalsIgnoreCase(trainOwner)) // Check to ensure we're not adding the current owner to the trusted list...
					this.trustedList.add(new TrustedPlayer(trustedList.getCompoundTagAt(i).getString("playerName"), trustedList.getCompoundTagAt(i).getBoolean("breakAccess")));
			}
			if (nbttagcompound.hasKey("trustedListPreviousOwner")) { // If the previous owner is not the one who placed down the piece of rolling stock...
				if (!nbttagcompound.getString("trustedListPreviousOwner").equalsIgnoreCase(trainOwner)) {
					getTrustedList().add(new TrustedPlayer(nbttagcompound.getString("trustedListPreviousOwner"), true));
				}
			}
		}
	}

	/**
	 * @author 02skaplan
	 * @return CargoManager for entity if entity supports custom cargo, else null.
	 */
	public final CargoManager getCargoManager() {
		return cargoManager;
	}

	/**
	 * @author 02skaplan
	 * <p>Call after super and init in a Class<\? extends EntityRollingStock\>'s constructor with a new CargoManager containing
	 * all cargo options for a given entity.</p>
	 */
	public void setCargoManager(CargoManager cargoManager) {
		this.cargoManager = cargoManager;
	}

	public ITrainRenderRecord getRenderSpec()
	{
		if (renderSpec == null)
		{
			GetRenderSpec();
		}
		return renderSpec;
	}


	public float[] getRenderScale(){return getRenderSpec().getScale();}

	@SideOnly(Side.CLIENT)
	public float[] modelOffsets(){return getRenderSpec().getTrans();}

	@SideOnly(Side.CLIENT)
	public float[] modelRotations(){return getRenderSpec().getRotate();}

	public boolean hasSmoke() {return getSubTrainRenderRecordSpec() != null && getSubTrainRenderRecordSpec().hasSmoke();}

	public boolean hasExplosion() {return getSubTrainRenderRecordSpec() != null && getSubTrainRenderRecordSpec().hasExplosions();}

	public SubTrainRenderRecord getSubTrainRenderRecordSpec()
	{
		if (subTrainRenderRecordSpec == null)
		{
			GetRenderSpec();
		}
		return subTrainRenderRecordSpec;
	}

	/**
	 * Code to insert the render record when its needed
	 */
	@SideOnly(Side.CLIENT)
	public void onRenderInsertRecord()
	{

	}
}