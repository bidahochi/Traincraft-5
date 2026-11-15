package train.common.api;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S1CPacketEntityMetadata;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.api.LiquidManager.StandardTank;
import train.common.api.locomotive.AbstractBoilerLocomotive;
import train.common.api.control.SteamFiringType;
import train.common.core.handlers.FuelHandler;
import train.common.inventory.InventoryLiquidFiredLocomotive;
import train.common.inventory.InventoryLoco;
import train.common.library.GuiIDs;
import train.common.entity.rollingStock.EntityBUnitDD35;
import train.common.slots.IFluidContainerSlotValidator;

import java.util.concurrent.atomic.AtomicReference;

/** Steam locomotive with shared boiler operation and per-livery firing defaults. */
public abstract class SteamTrain extends AbstractBoilerLocomotive implements IFluidHandler, IFluidContainerSlotValidator
{
	private static final String NBT_LIQUID_FUEL_TANK = "LiquidFiredSteamFuelTank";
	private static final int DW_SECONDARY_TANK_STRING = 29;
	private static final String NBT_FIRING_VERSION = "tcSteamFiringVersion";
	private static final String NBT_SELECTED_FIRING = "tcSelectedSteamFiringType";
	private static final int FIRING_VERSION = 1;
	private static final int UNSET_SKIN_ID = -1;

	private final boolean tracksFiringSelection;
	private final AtomicReference<Runnable> pendingFiringRepaint;
	private SteamFiringType selectedFiringType;
	private boolean firingWatcherInitialized;
	private final LiquidManager.FilteredTank liquidFuelTank;
	private int fluidContainerUpdate = 8;
	private int coolantContainerUpdate = 8;

	private int maxFuel = 20000;
	private int update = 8;

	/** @deprecated Tank capacity comes from the stock record. Use {@link #SteamTrain(World)}. */
	@Deprecated
	public SteamTrain(World world, int capacity)
	{
		this(world);
	}

	public SteamTrain(World world)
	{
		this(world, null);
	}

	public SteamTrain(World world, FluidStack filter)
	{
		super(world, filter);
		int fuelCapacity = liquidFuelCapacity();
		tracksFiringSelection = hasFiringChoices();
		pendingFiringRepaint = tracksFiringSelection && world != null && world.isRemote == false
				? new AtomicReference<>() : null;
		boolean defaultsToOil = firingType() == SteamFiringType.OIL;
		if (fuelCapacity > 0 || defaultsToOil || tracksFiringSelection)
		{
			liquidFuelTank = LiquidManager.getInstance().new FilteredTank(fuelCapacity, LiquidManager.dieselFilter());
			this.dataWatcher.addObject(DW_SECONDARY_TANK_STRING, buildSecondaryTankSyncString());
			firingWatcherInitialized = true;
			if (defaultsToOil && tracksFiringSelection == false)
			{
				numCargoSlots = 3;
				numCargoSlots1 = 0;
				numCargoSlots2 = 0;
				inventorySize = 5;
				locoInvent = new ItemStack[inventorySize];
			}
			// The boiler initializes its watcher before the oil tank exists.
			if (world != null)
			{
				syncFluidDataWatcher();
			}
		}
		else
		{
			liquidFuelTank = null;
		}
	}

	/** @deprecated Tank capacity comes from the stock record. Use {@link #SteamTrain(World, FluidStack)}. */
	@Deprecated
	public SteamTrain(World world, int capacity, FluidStack filter)
	{
		this(world, filter);
	}

	/** Reports the effective firing type, including a selected mode retained through a livery change. */
	public final SteamFiringType firingType()
	{
		if (tracksFiringSelection && worldObj != null && worldObj.isRemote)
		{
			if (firingWatcherInitialized)
			{
				String[] fuelData = getSecondaryFuelData();
				if (fuelData.length > 2)
				{
					if (SteamFiringType.OIL.name().equals(fuelData[2]))
					{
						return SteamFiringType.OIL;
					}
					if (SteamFiringType.COAL.name().equals(fuelData[2]))
					{
						return SteamFiringType.COAL;
					}
				}
			}
			return defaultFiringTypeForSkin(UNSET_SKIN_ID);
		}
		if (selectedFiringType != null)
		{
			return selectedFiringType;
		}
		int currentSkin = worldObj == null ? color : getColor();
		return defaultFiringTypeForSkin(currentSkin == UNSET_SKIN_ID ? normalizeFiringSkin(currentSkin) : currentSkin);
	}

	/** Matches native setColor's byte-based palette lookup, including its initial/default -1 fallback. */
	private int normalizeFiringSkin(int requestedColor)
	{
		int[] colors = trainSpec == null ? null : trainSpec.getColors();
		if (colors == null || colors.length == 0)
		{
			return requestedColor;
		}
		if (requestedColor != UNSET_SKIN_ID)
		{
			for (int registeredColor : colors)
			{
				if ((byte) requestedColor == registeredColor)
				{
					return requestedColor;
				}
			}
		}
		return colors[0];
	}

	/** Declares a livery's default fuel. The unset skin ID returns the stock default for saves without a fuel selection. */
	public SteamFiringType defaultFiringTypeForSkin(int skin)
	{
		return SteamFiringType.COAL;
	}

	/** Override when a skin supports both fuels; existing skins permit only their declared default. */
	public boolean supportsFiringType(int skin, SteamFiringType firingType)
	{
		return firingType == defaultFiringTypeForSkin(normalizeFiringSkin(skin));
	}

	/** Checks whether a registered skin can use a fuel other than the stock default. */
	private boolean hasFiringChoices()
	{
		SteamFiringType stockDefaultFiringType = defaultFiringTypeForSkin(UNSET_SKIN_ID);
		SteamFiringType alternateFiring = stockDefaultFiringType == SteamFiringType.COAL ? SteamFiringType.OIL : SteamFiringType.COAL;
		int[] skins = getTrainSpec().getColors();
		if (skins == null || skins.length == 0)
		{
			return supportsFiringType(UNSET_SKIN_ID, alternateFiring);
		}
		for (int skin : skins)
		{
			if (defaultFiringTypeForSkin(skin) != stockDefaultFiringType || supportsFiringType(skin, alternateFiring))
			{
				return true;
			}
		}
		return false;
	}

	/** Placement and load keep native color handling; only repaint enforces gameplay conversion safety. */
	@Override
	public void setColor(int color)
	{
		super.setColor(color);
		if (firingWatcherInitialized && tracksFiringSelection && worldObj != null && worldObj.isRemote == false)
		{
			dataWatcher.updateObject(DW_SECONDARY_TANK_STRING, buildSecondaryTankSyncString());
		}
	}

	/**
	 * Routes repaint through this locomotive's server update if its firing can change.
	 * Returns false when the handler can use the ordinary fixed-fuel repaint path.
	 * The latest request replaces any request waiting for the update.
	 */
	public final boolean deferFiringRepaint(Runnable repaint)
	{
		if (pendingFiringRepaint == null)
		{
			return false;
		}
		pendingFiringRepaint.set(repaint);
		return true;
	}

	/**
	 * Applies an authorized repaint on the server thread. Returns false if the fuel cannot change safely.
	 * A successful fuel change closes the driver's old service menu and synchronizes the new mode.
	 */
	public boolean repaint(EntityPlayer player, int skin)
	{
		if (worldObj == null || worldObj.isRemote)
		{
			return false;
		}
		int normalizedSkin = normalizeFiringSkin(skin);
		SteamFiringType previousType = firingType();
		SteamFiringType targetType = previousType;
		if (supportsFiringType(normalizedSkin, targetType) == false)
		{
			if (player == null || isProtectedControlAuthorized(player) == false)
			{
				return false;
			}
			targetType = defaultFiringTypeForSkin(normalizedSkin);
			if (canConvertFiringType() == false || (targetType == SteamFiringType.OIL && getSecondaryTankCapacity() <= 0))
			{
				player.addChatMessage(new ChatComponentText("Turn the engine off and empty its fuel input, fire and oil tank before changing fuel. Keep only water containers in the water slot."));
				return false;
			}
		}
		if (tracksFiringSelection)
		{
			selectedFiringType = targetType;
		}
		setColor(normalizedSkin);
		if (tracksFiringSelection)
		{
			syncLiquidFuelTankToClient();
			syncFluidDataWatcher();
			if (previousType != firingType())
			{
				synchronizeFiringChange();
			}
		}
		return true;
	}

	/** Closes the old service layout and publishes its replacement before the driver can reopen it. */
	private void synchronizeFiringChange()
	{
		Entity driver = getActiveDriver();
		if (driver instanceof EntityPlayerMP)
		{
			EntityPlayerMP player = (EntityPlayerMP) driver;
			if (player.openContainer instanceof InventoryLoco
					|| player.openContainer instanceof InventoryLiquidFiredLocomotive)
			{
				player.closeScreen();
			}
		}
		if (worldObj instanceof WorldServer)
		{
			WorldServer world = (WorldServer) worldObj;
			world.getEntityTracker().func_151247_a(this,
					new S1CPacketEntityMetadata(getEntityId(), getDataWatcher(), true));
		}
	}

	/** A fuel conversion requires the engine off, empty fuel storage and a water-compatible service slot. */
	private boolean canConvertFiringType()
	{
		if (isLocoTurnedOn() || getFuel() != 0 || locoInvent[FUEL_SLOT_INDEX] != null
				|| (liquidFuelTank != null && liquidFuelTank.getFluidAmount() > 0))
		{
			return false;
		}
		ItemStack waterContainer = locoInvent[WATER_SLOT_INDEX];
		if (waterContainer == null || FluidContainerRegistry.isEmptyContainer(waterContainer))
		{
			return true;
		}
		FluidStack containedWater = FluidContainerRegistry.getFluidForFilledItem(waterContainer);
		return containedWater != null && containedWater.getFluid() == FluidRegistry.WATER && coolantTank.acceptsFluid(containedWater);
	}

	/** Declares liquid fuel capacity in millibuckets during construction. */
	protected int liquidFuelCapacity()
	{
		return 0;
	}

	/** Identifies coal-fired stock for coal controls and service slots. */
	public static boolean isCoalFiredSteam(Entity transport)
	{
		return transport instanceof SteamTrain
				&& ((SteamTrain) transport).firingType() == SteamFiringType.COAL;
	}

	/** Identifies liquid-fired stock for its existing fuel tank and service menu. */
	public static boolean isOilFiredSteam(Entity transport)
	{
		return transport instanceof SteamTrain
				&& ((SteamTrain) transport).firingType() == SteamFiringType.OIL;
	}

	/**
	 * Checks the stock's default firing type using the unset skin ID.
	 * Slot and control layouts use this stock default across livery changes.
	 */
	public static boolean hasStockDefaultFiringType(Entity transport, SteamFiringType firingType)
	{
		if ((transport instanceof SteamTrain) == false)
		{
			return false;
		}
		SteamTrain locomotive = (SteamTrain) transport;
		return locomotive.defaultFiringTypeForSkin(UNSET_SKIN_ID) == firingType;
	}

	@Override
	public void pressKey(int i)
	{
		if (i == 7 && getActiveDriver() instanceof EntityPlayer)
		{
			((EntityPlayer) getActiveDriver()).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
		}
	}

	public StandardTank getTank() {
		return coolantTank;
	}

	private void placeInInvent(ItemStack itemstack1, SteamTrain loco) {
		for (int i = 2; i < loco.locoInvent.length; i++) {
			if (loco.locoInvent[i] == null) {
				loco.locoInvent[i] = itemstack1;
				return;
			}
			else if (loco.locoInvent[i] != null && loco.locoInvent[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() &&
					(!itemstack1.getHasSubtypes() || locoInvent[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(locoInvent[i], itemstack1)) {
				int var9 = locoInvent[i].stackSize + itemstack1.stackSize;
				if (var9 <= itemstack1.getMaxStackSize()) {
					loco.locoInvent[i].stackSize = var9;
					return;
				}
				else if (locoInvent[i].stackSize < locoInvent[i].getMaxStackSize()) {
					loco.locoInvent[i].stackSize += 1;
					return;
				}
			}
			else if (i == loco.locoInvent.length - 1) {
				entityDropItem(itemstack1,1);
				return;
			}
		}
	}

	/** Services a coal engine's boiler container and returns the resulting item to coal stock. */
	public void liquidInSlot(ItemStack container, SteamTrain locomotive)
	{
		if (worldObj.isRemote || firingType() != SteamFiringType.COAL || isCoalFiredSteam(locomotive) == false)
		{
			return;
		}

		this.update += 1;
		if (this.update % 8 == 0 && container != null)
		{
			ItemStack result = LiquidManager.getInstance().processContainer(this, WATER_SLOT_INDEX, this, container);
			if (result != null)
			{
				placeInInvent(result, locomotive);
			}
		}
	}

	@Override
	protected void checkBoilerInventory(ItemStack fuelSlotStack, ItemStack waterSlotStack)
	{
		if (firingType() == SteamFiringType.OIL)
		{
			checkOilInventory(fuelSlotStack, waterSlotStack);
		}
		else
		{
			checkCoalInventory(fuelSlotStack, waterSlotStack);
		}
	}

	private void checkCoalInventory(ItemStack locoInvent0, ItemStack locoInvent1)
	{
		if (this.canCheckInvent == false)
		{
			return;
		}

		boolean hasCoalInTender = false;
		if (isLocoTurnedOn() && ticksExisted%10==0) {
			FluidStack drain = null;

			if(fill(ForgeDirection.UNKNOWN,new FluidStack(FluidRegistry.WATER, 100), false)==100) {
				blocksToCheck = new TileEntity[]{worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
						worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
						worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posZ)),
						worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
				};

				for (TileEntity block : blocksToCheck) {
					if (drain == null && block instanceof IFluidHandler) {
						for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
							if(((IFluidHandler) block).drain(direction,100,false)!=null &&
									((IFluidHandler) block).drain(direction, 100, false).fluid==FluidRegistry.WATER &&
									((IFluidHandler) block).drain(direction, 100, false).amount ==100
							) {
								drain = ((IFluidHandler) block).drain(
										direction, 100, true);
							}
						}
					}
				}
			}

			if(cartLinked1 instanceof Tender){
				if(drain==null && fill(ForgeDirection.UNKNOWN,new FluidStack(FluidRegistry.WATER, 100), false)==100) {
					if (getFluid() == null || getFluid().getFluid() == FluidRegistry.WATER) {
						drain = ((Tender) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
					}
				}
				for (int h = 0; h < ((Tender) cartLinked1).tenderItems.length; h++) {
					if (((Tender) cartLinked1).tenderItems[h] != null && FuelHandler.steamFuelLast(((Tender) cartLinked1).tenderItems[h]) != 0) {
						if (getFuel() < maxFuel && ((getFuel() + FuelHandler.steamFuelLast(((Tender) cartLinked1).tenderItems[h])) <= maxFuel)) {
							fuelTrain += FuelHandler.steamFuelLast(((Tender) cartLinked1).tenderItems[h]);
							hasCoalInTender = true;
							((Tender) cartLinked1).decrStackSize(h, 1);
							break;
						}
					}
				}

			} else if (cartLinked2 instanceof Tender){

				if(drain==null && fill(ForgeDirection.UNKNOWN,new FluidStack(FluidRegistry.WATER, 100), false)==100) {
					if (getFluid() == null || getFluid().getFluid() == FluidRegistry.WATER) {
						drain = ((Tender) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
					}
				}

				for (int h = 0; h < ((Tender) cartLinked2).tenderItems.length; h++) {
					if (((Tender) cartLinked2).tenderItems[h] != null && FuelHandler.steamFuelLast(((Tender) cartLinked2).tenderItems[h]) != 0) {
						if (getFuel() < maxFuel && ((getFuel() + FuelHandler.steamFuelLast(((Tender) cartLinked2).tenderItems[h])) <= maxFuel)) {
							fuelTrain += FuelHandler.steamFuelLast(((Tender) cartLinked2).tenderItems[h]);
							hasCoalInTender = true;
							((Tender) cartLinked2).decrStackSize(h, 1);
							break;
						}
					}
				}
			}
			if (drain != null){
				fill(ForgeDirection.UNKNOWN, drain, true);
			}
		}
		if (!hasCoalInTender && locoInvent0 != null && FuelHandler.steamFuelLast(locoInvent0) != 0) {
			if (getFuel() < maxFuel && ((getFuel() + FuelHandler.steamFuelLast(locoInvent0) <= maxFuel))) {
				fuelTrain += FuelHandler.steamFuelLast(locoInvent0);
				decrStackSize(0, 1);
			}
		}

		if (locoInvent1 != null) {
			liquidInSlot(locoInvent1, this);
			return;
		}
		if (getFuel() <= 0) {
			motionX *= 0.88;
			motionZ *= 0.88;
		}
	}

	/** Used for the gui */
	@Override
	public int getFuelDiv(int i)
	{
		if (firingType() == SteamFiringType.OIL)
		{
			int fuelCapacity = getSecondaryTankCapacity();
			return fuelCapacity <= 0 ? 0 : (getSecondaryTankAmount() * i) / fuelCapacity;
		}
		if (worldObj.isRemote) {
			return ((this.dataWatcher.getWatchableObjectInt(24) * i) / maxFuel);
		}
		return (this.fuelTrain * i) / maxFuel;
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
	{
		if (firingType() == SteamFiringType.OIL)
		{
			if (resource == null || resource.getFluid() == null)
			{
				return 0;
			}
			if (resource.getFluid() == FluidRegistry.WATER)
			{
				return super.fill(from, resource, doFill);
			}
			return isAcceptedLiquidSteamFuel(resource) ? liquidFuelTank.fill(resource, doFill) : 0;
		}
		return coolantTank.fill(resource, doFill);
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
	{
		if (firingType() == SteamFiringType.OIL)
		{
			if (resource == null || resource.getFluid() == null)
			{
				return null;
			}
			if (resource.getFluid() == FluidRegistry.WATER)
			{
				return super.drain(from, resource, doDrain);
			}
			FluidStack currentFuel = liquidFuelTank == null ? null : liquidFuelTank.getFluid();
			if (isAcceptedLiquidSteamFuel(resource) && currentFuel != null && resource.isFluidEqual(currentFuel))
			{
				return liquidFuelTank.drain(resource.amount, doDrain);
			}
			return null;
		}
		if (resource == null || resource.isFluidEqual(coolantTank.getFluid()) == false)
		{
			return null;
		}
		return coolantTank.drain(resource.amount, doDrain);
	}

	/** Untyped draining remains boiler water, including the boiler's own consumption. */
	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
	{
		if (firingType() == SteamFiringType.OIL)
		{
			return super.drain(from, maxDrain, doDrain);
		}
		return coolantTank.drain(maxDrain, doDrain);
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid)
	{
		return firingType() != SteamFiringType.OIL || fluid == FluidRegistry.WATER || isAcceptedLiquidSteamFuel(fluid);
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid)
	{
		return firingType() != SteamFiringType.OIL || fluid == FluidRegistry.WATER || isAcceptedLiquidSteamFuel(fluid);
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from)
	{
		if (firingType() == SteamFiringType.OIL && liquidFuelTank != null)
		{
			return new FluidTankInfo[] { coolantTank.getInfo(), liquidFuelTank.getInfo() };
		}
		return new FluidTankInfo[] { coolantTank.getInfo() };
	}

	public FluidStack getFluid() {
		return coolantTank.getFluid();
	}

	public int getFluidAmount() {
		return coolantTank.getFluidAmount();
	}

	/** Maximum millibuckets requested per source transfer; refined fuel retains its smaller batch. */
	protected int getLiquidFuelTransferAmount(Fluid fluid)
	{
		if (fluid == LiquidManager.REFINED_FUEL)
		{
			return 50;
		}

		return 100;
	}

	/** Returns the oil tank, or null for coal engines and before oil tank initialization. */
	public LiquidManager.StandardTank getLiquidFuelTank()
	{
		return firingType() == SteamFiringType.OIL ? liquidFuelTank : null;
	}

	/** Returns the current oil stack, or null when the tank is absent or empty. */
	public FluidStack getLiquidFuel()
	{
		StandardTank fuelTank = getLiquidFuelTank();
		return fuelTank == null ? null : fuelTank.getFluid();
	}

	/** Returns the synchronized oil reserve in millibuckets. */
	public int getLiquidFuelAmount()
	{
		return getSecondaryTankAmount();
	}

	/** Returns the allocated oil capacity in millibuckets, or zero when no oil tank exists. */
	public int getSecondaryTankCapacity()
	{
		return liquidFuelTank == null ? 0 : liquidFuelTank.getCapacity();
	}

	/** Returns the current oil fluid ID, or zero when the tank is absent or empty. */
	public int getLiquidFuelItemID()
	{
		FluidStack fuel = getLiquidFuel();
		return fuel != null && fuel.getFluid() != null ? fuel.getFluid().getID() : 0;
	}

	@Override
	public void onUpdate()
	{
		if (pendingFiringRepaint != null && isDead == false)
		{
			Runnable repaint = pendingFiringRepaint.getAndSet(null);
			if (repaint != null)
			{
				repaint.run();
			}
		}
		super.onUpdate();
		if (worldObj.isRemote || liquidFuelTank == null)
		{
			return;
		}

		syncLiquidFuelTankToClient();
	}

	private void syncLiquidFuelTankToClient()
	{
		if (firingType() == SteamFiringType.OIL)
		{
			this.fuelTrain = liquidFuelTank.getFluidAmount();
		}

		if (worldObj != null && worldObj.isRemote == false)
		{
			this.dataWatcher.updateObject(
					DW_SECONDARY_TANK_STRING,
					buildSecondaryTankSyncString()
			);

			/*
			 * 24 is already registered by Locomotive.
			 * We only update it, never add it.
			 */
			this.dataWatcher.updateObject(24, this.fuelTrain);
		}
	}

	private void syncFuelTrainFromLiquidTank()
	{
		this.fuelTrain = liquidFuelTank.getFluidAmount();
	}

	private void checkOilInventory(ItemStack fuelSlotStack, ItemStack waterSlotStack)
	{
		if (this.canCheckInvent == false)
		{
			return;
		}

		if (fuelSlotStack != null)
		{
			processFilteredContainerInSlot(
					FUEL_SLOT_INDEX,
					fuelSlotStack,
					liquidFuelTank,
					true
			);
		}

		if (waterSlotStack != null)
		{
			processFilteredContainerInSlot(
					WATER_SLOT_INDEX,
					waterSlotStack,
					coolantTank,
					false
			);
		}

		if (isLocoTurnedOn() && ticksExisted % 10 == 0)
		{
			pullWaterFromNearbyAndLinkedTenders();
			pullLiquidFuelFromSources();
		}

		if (getFuel() <= 0)
		{
			motionX *= 0.88;
			motionZ *= 0.88;
		}
	}

	/** Services one oil-engine container on its existing eight-call cadence, returning empties to cargo. */
	protected void processFilteredContainerInSlot(
			int slot,
			ItemStack itemstack,
			LiquidManager.StandardTank targetTank,
			boolean fuelSlot
	)
	{
		if (worldObj.isRemote)
		{
			return;
		}

		if (fuelSlot)
		{
			this.fluidContainerUpdate++;

			if (this.fluidContainerUpdate % 8 != 0)
			{
				return;
			}
		}
		else
		{
			this.coolantContainerUpdate++;

			if (this.coolantContainerUpdate % 8 != 0)
			{
				return;
			}
		}

		if (itemstack == null || targetTank == null)
		{
			return;
		}

		FluidStack contained = FluidContainerRegistry.getFluidForFilledItem(itemstack);

		if (contained != null && targetTank.acceptsFluid(contained) == false)
		{
			return;
		}

		if (contained == null && FluidContainerRegistry.isEmptyContainer(itemstack) == false)
		{
			return;
		}

		ItemStack result = LiquidManager.getInstance().processContainer(
				this,
				slot,
				new SingleTankFluidHandler(targetTank),
				itemstack
		);

		if (result != null)
		{
			placeReturnedContainer(result, 2);
		}
	}

	/** Encodes oil name and millibuckets, with an authoritative mode only for skin-configurable stock. */
	private String buildSecondaryTankSyncString()
	{
		FluidStack fuel = liquidFuelTank != null ? liquidFuelTank.getFluid() : null;
		String fuelData = fuel == null || fuel.getFluid() == null
				? NULL_FLUID_NAME + FLUID_SYNC_SEPARATOR + "0"
				: fuel.getFluid().getName() + FLUID_SYNC_SEPARATOR + fuel.amount;
		return tracksFiringSelection ? fuelData + FLUID_SYNC_SEPARATOR + firingType().name() : fuelData;
	}

	/** Validates oil-engine service slots; coal menus retain their existing unfiltered slot classes. */
	@Override
	public boolean isContainerValidForInputSlot(int slot, ItemStack stack)
	{
		if (firingType() != SteamFiringType.OIL)
		{
			return false;
		}

		LiquidManager.StandardTank targetTank = getInputTank(slot);
		return targetTank != null && isContainerAcceptedByTank(targetTank, stack);
	}

	private boolean isContainerAcceptedByTank(LiquidManager.StandardTank tank, ItemStack stack)
	{
		if (stack == null)
		{
			return false;
		}

		if (FluidContainerRegistry.isEmptyContainer(stack))
		{
			return true;
		}

		FluidStack contained = FluidContainerRegistry.getFluidForFilledItem(stack);
		return contained != null && tank.acceptsFluid(contained);
	}

	private LiquidManager.StandardTank getInputTank(int slot)
	{
		if (slot == FUEL_SLOT_INDEX)
		{
			return liquidFuelTank;
		}

		if (slot == WATER_SLOT_INDEX)
		{
			return coolantTank;
		}

		return null;
	}

	protected boolean isAcceptedLiquidSteamFuel(FluidStack stack)
	{
		if (stack == null || stack.getFluid() == null)
		{
			return false;
		}

		return isAcceptedLiquidSteamFuel(stack.getFluid());
	}

	protected boolean isAcceptedLiquidSteamFuel(Fluid fluid)
	{
		if (fluid == null || liquidFuelTank == null)
		{
			return false;
		}

		FluidStack[] accepted = liquidFuelTank.getMultiFilter();

		for (int i = 0; i < accepted.length; i++)
		{
			if (accepted[i] != null && accepted[i].getFluid() == fluid)
			{
				return true;
			}
		}

		return false;
	}

	/** Restricts a service-slot container to its selected water or oil tank. */
	private class SingleTankFluidHandler implements IFluidHandler
	{
		private final LiquidManager.StandardTank tank;

		private SingleTankFluidHandler(LiquidManager.StandardTank tank)
		{
			this.tank = tank;
		}

		@Override
		public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
		{
			return resource == null ? 0 : tank.fill(resource, doFill);
		}

		@Override
		public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
		{
			if (resource == null || tank.getFluid() == null || resource.isFluidEqual(tank.getFluid()) == false)
			{
				return null;
			}

			return tank.drain(resource.amount, doDrain);
		}

		@Override
		public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
		{
			return tank.drain(maxDrain, doDrain);
		}

		@Override
		public boolean canFill(ForgeDirection from, Fluid fluid)
		{
			return fluid != null && tank.fill(new FluidStack(fluid, 1), false) > 0;
		}

		@Override
		public boolean canDrain(ForgeDirection from, Fluid fluid)
		{
			return fluid != null && tank.getFluid() != null && tank.getFluid().getFluid() == fluid;
		}

		@Override
		public FluidTankInfo[] getTankInfo(ForgeDirection from)
		{
			return new FluidTankInfo[] { tank.getInfo() };
		}
	}

	@Override
	protected void updateFuelTrain(int amount)
	{
		if (firingType() != SteamFiringType.OIL)
		{
			super.updateFuelTrain(amount);
			return;
		}

		if (this.isLocoTurnedOn() == false && this.canBePulled == false)
		{
			motionX *= 0.8;
			motionZ *= 0.8;
			return;
		}

		if (this.isLocoTurnedOn() && liquidFuelTank.getFluidAmount() > 0)
		{
			liquidFuelTank.drain(amount, true);
			syncFuelTrainFromLiquidTank();

			if (fuelTrain <= 0)
			{
				fuelTrain = 0;
			}
		}
	}

	/** Preserves supply priority: both tenders, nearby handlers, then both linked liquid tanks. */
	private void pullLiquidFuelFromSources()
	{
		pullLiquidFuelFromLinkedTender(cartLinked1);
		pullLiquidFuelFromLinkedTender(cartLinked2);

		pullLiquidFuelFromNearbyFluidHandlers();

		pullLiquidFuelFromLinkedLiquidTank(cartLinked1);
		pullLiquidFuelFromLinkedLiquidTank(cartLinked2);
	}

	private void pullLiquidFuelFromLinkedTender(Object linkedCart)
	{
		if ((linkedCart instanceof Tender) == false)
		{
			return;
		}

		IFluidHandler handler = (IFluidHandler) linkedCart;
		FluidStack drained = tryDrainAcceptedFuel(handler, ForgeDirection.UNKNOWN, true);

		if (drained != null)
		{
			liquidFuelTank.fill(drained, true);
			syncFuelTrainFromLiquidTank();
		}
	}

	private void pullLiquidFuelFromLinkedLiquidTank(Object linkedCart)
	{
		if ((linkedCart instanceof LiquidTank) == false)
		{
			return;
		}

		if (linkedCart instanceof INoFuelTransferEntity)
		{
			return;
		}

		if (linkedCart instanceof EntityBUnitDD35)
		{
			return;
		}

		IFluidHandler handler = (IFluidHandler) linkedCart;
		FluidStack drained = tryDrainAcceptedFuel(handler, ForgeDirection.UNKNOWN, true);

		if (drained != null)
		{
			liquidFuelTank.fill(drained, true);
			syncFuelTrainFromLiquidTank();
		}
	}

	private void pullLiquidFuelFromNearbyFluidHandlers()
	{
		if (canAcceptAnyLiquidFuel() == false)
		{
			return;
		}

		FluidStack drain = null;

		blocksToCheck = new TileEntity[] {
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posZ)),
				worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
		};

		for (TileEntity block : blocksToCheck)
		{
			if (drain != null || (block instanceof IFluidHandler) == false)
			{
				continue;
			}

			IFluidHandler handler = (IFluidHandler) block;

			for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS)
			{
				drain = tryDrainAcceptedFuel(handler, direction, true);

				if (drain != null)
				{
					break;
				}
			}
		}

		if (drain != null)
		{
			liquidFuelTank.fill(drain, true);
			syncFuelTrainFromLiquidTank();
		}
	}

	private boolean canAcceptAnyLiquidFuel()
	{
		FluidStack[] fuels = liquidFuelTank.getMultiFilter();

		for (int i = 0; i < fuels.length; i++)
		{
			FluidStack fuel = fuels[i];

			if (fuel == null || fuel.getFluid() == null)
			{
				continue;
			}

			int amount = getLiquidFuelTransferAmount(fuel.getFluid());
			FluidStack test = new FluidStack(fuel.getFluid(), amount);

			if (liquidFuelTank.fill(test, false) > 0)
			{
				return true;
			}
		}

		return false;
	}

	private FluidStack tryDrainAcceptedFuel(IFluidHandler handler, ForgeDirection direction, boolean doDrain)
	{
		if (handler == null)
		{
			return null;
		}

		FluidStack[] accepted = liquidFuelTank.getMultiFilter();

		for (int i = 0; i < accepted.length; i++)
		{
			FluidStack acceptedFuel = accepted[i];

			if (acceptedFuel == null || acceptedFuel.getFluid() == null)
			{
				continue;
			}

			Fluid fluid = acceptedFuel.getFluid();
			int amount = getLiquidFuelTransferAmount(fluid);

			FluidStack request = new FluidStack(fluid, amount);
			int acceptedAmount = liquidFuelTank.fill(request, false);

			if (acceptedAmount <= 0)
			{
				continue;
			}

			request.amount = acceptedAmount;
			FluidStack test = handler.drain(direction, request, false);

			if (test != null
					&& test.getFluid() == fluid
					&& test.amount > 0)
			{
				return handler.drain(direction, request, doDrain);
			}
		}

		return null;
	}

	/** Retains fixed-engine watcher 23 formats; configurable stock always includes its oil tank fields. */
	@Override
	protected String BUILD_DW_TANK_DATA_STRING()
	{
		if (liquidFuelTank == null || (tracksFiringSelection == false && firingType() != SteamFiringType.OIL))
		{
			return super.BUILD_DW_TANK_DATA_STRING();
		}

		String fullTankString = super.BUILD_DW_TANK_DATA_STRING() + FLUID_SYNC_SEPARATOR;

		if (liquidFuelTank != null && liquidFuelTank.getFluid() != null)
		{
			fullTankString += liquidFuelTank.getFluid().getFluidID() + FLUID_SYNC_SEPARATOR +  liquidFuelTank.getFluid().amount;
		}
		else
		{
			fullTankString += ("0" + FLUID_SYNC_SEPARATOR + "0");
		}

		return fullTankString;
	}

	/** Reads the oil fluid ID from the combined tank watcher; missing or malformed data yields zero. */
	public int getSecondaryLiquidId()
	{
		String[] fluidData = getFluidData().split(FLUID_SYNC_SEPARATOR);

		if (fluidData.length <= 2)
		{
			return 0;
		}

		try
		{
			return Integer.parseInt(fluidData[2]);
		}
		catch (NumberFormatException ignored)
		{
			return 0;
		}
	}

	/** Returns watcher 29's oil name, or the existing null-fluid sentinel. */
	public String getSecondaryLiquidName()
	{
		String[] fuelData = getSecondaryFuelData();
		return fuelData.length > 0 ? fuelData[0] : NULL_FLUID_NAME;
	}

	/** Reads oil millibuckets from watcher 29, falling back to the legacy combined tank watcher. */
	public int getSecondaryTankAmount()
	{
		String[] fuelData = getSecondaryFuelData();

		if (fuelData.length > 1)
		{
			try
			{
				return Integer.parseInt(fuelData[1]);
			}
			catch (NumberFormatException ignored)
			{
				// Fall through to the combined tank watcher.
			}
		}

		String[] fluidData = getFluidData().split(FLUID_SYNC_SEPARATOR);

		if (fluidData.length <= 3)
		{
			return 0;
		}

		try
		{
			return Integer.parseInt(fluidData[3]);
		}
		catch (NumberFormatException ignored)
		{
			return 0;
		}
	}

	private String[] getSecondaryFuelData()
	{
		if (firingWatcherInitialized == false || liquidFuelTank == null)
		{
			return new String[0];
		}

		String value = this.dataWatcher.getWatchableObjectString(DW_SECONDARY_TANK_STRING);

		if (value == null || value.length() == 0)
		{
			return new String[0];
		}

		return value.split(FLUID_SYNC_SEPARATOR);
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tag)
	{
		super.writeEntityToNBT(tag);
		if (tracksFiringSelection)
		{
			tag.setInteger(NBT_FIRING_VERSION, FIRING_VERSION);
			tag.setString(NBT_SELECTED_FIRING, selectedFiringType == null ? "" : selectedFiringType.name());
		}
		if (liquidFuelTank != null)
		{
			NBTTagCompound fuelTag = new NBTTagCompound();
			liquidFuelTank.writeToNBT(fuelTag);
			tag.setTag(NBT_LIQUID_FUEL_TANK, fuelTag);
		}
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tag)
	{
		if (tracksFiringSelection)
		{
			// Older saves used the stock's legacy fuel regardless of skin.
			selectedFiringType = defaultFiringTypeForSkin(UNSET_SKIN_ID);
			if (tag.getInteger(NBT_FIRING_VERSION) >= FIRING_VERSION && tag.hasKey(NBT_SELECTED_FIRING))
			{
				String savedType = tag.getString(NBT_SELECTED_FIRING);
				if (savedType.length() == 0)
				{
					selectedFiringType = null;
				}
				else if (SteamFiringType.OIL.name().equals(savedType))
				{
					selectedFiringType = SteamFiringType.OIL;
				}
				else if (SteamFiringType.COAL.name().equals(savedType))
				{
					selectedFiringType = SteamFiringType.COAL;
				}
			}
		}
		super.readEntityFromNBT(tag);
		if (liquidFuelTank == null)
		{
			return;
		}
		if (tag.hasKey(NBT_LIQUID_FUEL_TANK))
		{
			liquidFuelTank.readFromNBT(tag.getCompoundTag(NBT_LIQUID_FUEL_TANK));
		}
		if (firingType() == SteamFiringType.OIL)
		{
			syncFuelTrainFromLiquidTank();
		}
		if (tracksFiringSelection)
		{
			syncLiquidFuelTankToClient();
			if (worldObj != null)
			{
				syncFluidDataWatcher();
			}
		}
	}
}
