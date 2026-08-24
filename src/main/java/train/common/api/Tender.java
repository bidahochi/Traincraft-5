package train.common.api;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.api.LiquidManager.StandardTank;
import train.common.api.stock.TenderStorageMode;
import train.common.entity.rollingStock.EntityBUnitDD35;
import train.common.entity.rollingStock.EntityBUnitEMDF3;
import train.common.entity.rollingStock.EntityBUnitEMDF7;
import train.common.library.GuiIDs;
import train.common.library.register.TenderRecord;
import train.common.slots.IFluidContainerSlotValidator;

import javax.annotation.Nullable;

/**
 * Tender rolling stock whose lighting is a read-only mirror of a directly coupled locomotive.
 *
 * <p>A tender implements {@link IRollingStockLightState} so the shared model and effect renderers
 * can query its synchronized light state. It does not own operator-adjustable switches:
 * the server copies the coupled locomotive's complete packed state into the tender watcher, and
 * publishes an all-off state while no locomotive is directly coupled. Because it does not
 * implement {@link IRollingStockLightControls}, mutable lighting panels and lighting-control
 * packets reject it through their normal interface checks.
 */
public abstract class Tender extends Freight implements IFluidHandler, IInventory,
		IFluidContainerSlotValidator, IRollingStockLightState
{
	public static final String NBT_TENDER_STORAGE_MODE = "TenderStorageMode";
	public static final String NBT_PRIMARY_TANK = "PrimaryTank";
	public static final String NBT_SECONDARY_TANK = "SecondaryTank";

	private static final long STORAGE_MODE_SWITCH_WINDOW_MILLIS = 15_000L;
	private static final int PRIMARY_TANK = 0;
	private static final int SECONDARY_TANK = 1;

	private static final int PRIMARY_CONTAINER_SLOT = 0;

	private static final int SECONDARY_CONTAINER_SLOT = 1;

	/*
	 * Packed watcher format:
	 *
	 * mode-_-primaryFluidId-_-primaryAmount-_-secondaryFluidId-_-secondaryAmount
	 *
	 * Index layout:
	 * 0 = storage mode
	 * 1 = primary fluid id
	 * 2 = primary fluid amount
	 * 3 = secondary fluid id
	 * 4 = secondary fluid amount
	 * 5 = storage mode switch available (0 or 1)
	 * Old watcher IDs 4 and 23 are intentionally no longer used.
	 */
	private static final int DW_TENDER_TANK_SYNC = 24;
	private static final String SYNC_SEPARATOR = "-_-";

	public ItemStack tenderItems[];

	private int maxTank;
	private int update = 8;
	private int secondaryUpdate = 8;

	protected StandardTank[] tankArray;
	public TileEntity[] blocksToCheck;
	public int freightInventorySize;

	protected TenderStorageMode storageMode;

	/**
	 * USE Tender(World world, FluidStack filter)
	 *
	 * @param world
	 * @param fluid
	 * @param quantity
	 * @param capacity
	 * @param filter
	 */
	@Deprecated
	public Tender(World world, Fluid fluid, int quantity, int capacity, FluidStack filter)
	{
		this(world, filter);
	}

	public Tender(World world, @Nullable FluidStack filter)
	{
		super(world);

		this.maxTank = getTankCapacity();
		this.storageMode = getDefaultStorageMode();

		freightInventorySize = getInventorySizeForMode(storageMode);
		tenderItems = new ItemStack[freightInventorySize];

		tankArray = setupTanks(filter);

		this.dataWatcher.addObject(DW_TENDER_TANK_SYNC, buildTankSyncString());
		// Initialize the synchronized mirror to all-off so client and server reads are valid before
		// the first server-side coupling update. Tenders never use uncontrolled-preview semantics.
		this.dataWatcher.addObject(
			RollingStockLightStateCodec.WATCHER_SLOT, RollingStockLightStateCodec.ALL_OFF);
	}

	protected TenderRecord getTenderRecordOrNull()
	{
		if (trainSpec instanceof TenderRecord)
		{
			return (TenderRecord) trainSpec;
		}

		return null;
	}

	public TenderStorageMode getDefaultStorageMode()
	{
		TenderRecord record = getTenderRecordOrNull();

		if (record == null)
		{
			return TenderStorageMode.COAL_BUNKER;
		}

		TenderStorageMode mode = record.getDefaultTenderStorageMode();

		if (mode != null && record.allowsTenderStorageMode(mode))
		{
			return mode;
		}

		if (record.allowsTenderStorageMode(TenderStorageMode.COAL_BUNKER))
		{
			return TenderStorageMode.COAL_BUNKER;
		}

		if (record.allowsTenderStorageMode(TenderStorageMode.DUAL_CHAMBER))
		{
			return TenderStorageMode.DUAL_CHAMBER;
		}

		return TenderStorageMode.COAL_BUNKER;
	}

	public boolean supportsStorageMode(TenderStorageMode mode)
	{
		TenderRecord record = getTenderRecordOrNull();

		if (mode == null)
		{
			return false;
		}

		if (record == null)
		{
			return mode == TenderStorageMode.COAL_BUNKER;
		}

		if (mode == TenderStorageMode.DUAL_CHAMBER)
		{
			return record.supportsDualChamberTender();
		}

		return record.supportsCoalBunkerTender();
	}

	protected TenderStorageMode sanitizeStorageMode(TenderStorageMode mode)
	{
		TenderRecord record = getTenderRecordOrNull();

		if (record == null)
		{
			return TenderStorageMode.COAL_BUNKER;
		}

		if (mode != null && record.allowsTenderStorageMode(mode))
		{
			return mode;
		}

		return getDefaultStorageMode();
	}

	protected TenderStorageMode readStorageMode(NBTTagCompound nbttagcompound)
	{
		TenderStorageMode mode;

		if (nbttagcompound.hasKey(NBT_TENDER_STORAGE_MODE))
		{
			mode = TenderStorageMode.fromId(nbttagcompound.getInteger(NBT_TENDER_STORAGE_MODE));
		}
		else
		{
			mode = getDefaultStorageMode();

			/*
			 * Migration safety for old saves.
			 *
			 * Crafting-based mode switching should produce empty tender items,
			 * but old placed entities may already have inventory. If an old save
			 * defaults to dual chamber and has items outside the smaller dual
			 * chamber slot range, prefer coal bunker if that mode is allowed.
			 */
			TenderRecord record = getTenderRecordOrNull();

			if (record != null
					&& mode == TenderStorageMode.DUAL_CHAMBER
					&& record.allowsTenderStorageMode(TenderStorageMode.COAL_BUNKER)
					&& savedInventoryHasItemsOutsideSlotRange(nbttagcompound, record.getDualChamberInventorySize()))
			{
				mode = TenderStorageMode.COAL_BUNKER;
			}
		}

		return sanitizeStorageMode(mode);
	}

	private boolean savedInventoryHasItemsOutsideSlotRange(NBTTagCompound nbttagcompound, int allowedSlots)
	{
		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);

		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound itemTag = nbttaglist.getCompoundTagAt(i);
			int slot = itemTag.getByte("Slot") & 0xff;

			if (slot >= allowedSlots)
			{
				return true;
			}
		}

		return false;
	}

	public TenderStorageMode getStorageMode()
	{
		if (worldObj != null && worldObj.isRemote)
		{
			return TenderStorageMode.fromId(getSyncedInt(0));
		}

		return storageMode;
	}

	public boolean isDualChamberMode()
	{
		return getStorageMode() == TenderStorageMode.DUAL_CHAMBER;
	}

	public boolean isCoalBunkerMode()
	{
		return getStorageMode() == TenderStorageMode.COAL_BUNKER;
	}

	public boolean isStorageModeSwitchable()
	{
		TenderRecord record = getTenderRecordOrNull();
		return record != null && record.isTenderStorageSwitchable();
	}

	public boolean isStorageModeSwitchAvailable()
	{
		if (!isStorageModeSwitchable())
		{
			return false;
		}

		if (worldObj != null && worldObj.isRemote)
		{
			return getSyncedInt(5) == 1;
		}

		return isWithinRealTimeWindow(STORAGE_MODE_SWITCH_WINDOW_MILLIS);
	}

	public boolean canPlayerChangeStorageMode(EntityPlayer player)
	{
		if (player == null || !isStorageModeSwitchAvailable())
		{
			return false;
		}

		if (!getTrainLockedFromPacket())
		{
			return true;
		}

		String playerName = player.getDisplayName();
		return playerName.equalsIgnoreCase(getTransportOwner()) || isPlayerTrusted(playerName);
	}

	public boolean setStorageMode(TenderStorageMode mode)
	{
		if (worldObj == null || worldObj.isRemote || mode == null || !isStorageModeSwitchAvailable())
		{
			return false;
		}

		TenderStorageMode sanitizedMode = sanitizeStorageMode(mode);

		if (sanitizedMode == storageMode)
		{
			return true;
		}

		if (!isTenderInventoryEmpty())
		{
			return false;
		}

		if (sanitizedMode == TenderStorageMode.COAL_BUNKER
				&& getSecondaryTank() != null
				&& getSecondaryTank().getFluidAmount() > 0)
		{
			return false;
		}

		setStorageModeInternal(sanitizedMode);
		updateTankWatcher();
		return true;
	}

	public void restoreStorageModeFromItem(int modeId)
	{
		if (worldObj == null || worldObj.isRemote)
		{
			return;
		}

		setStorageModeInternal(TenderStorageMode.fromId(modeId));
		updateTankWatcher();
	}

	private boolean isTenderInventoryEmpty()
	{
		if (tenderItems == null)
		{
			return true;
		}

		for (ItemStack stack : tenderItems)
		{
			if (stack != null && stack.stackSize > 0)
			{
				return false;
			}
		}

		return true;
	}

	protected boolean supportsSecondaryTank()
	{
		TenderRecord record = getTenderRecordOrNull();

		return record != null
				&& record.getSecondaryTankCapacity() > 0
				&& record.allowsTenderStorageMode(TenderStorageMode.DUAL_CHAMBER);
	}

	protected int getInventorySizeForMode(TenderStorageMode mode)
	{
		TenderRecord record = getTenderRecordOrNull();

		if (record == null)
		{
			return 16;
		}

		if (mode == TenderStorageMode.DUAL_CHAMBER)
		{
			return record.getDualChamberInventorySize();
		}

		return record.getCoalBunkerInventorySize();
	}

	private void applyInventorySizeForMode(TenderStorageMode mode)
	{
		int newSize = getInventorySizeForMode(mode);

		ItemStack[] oldItems = tenderItems;
		ItemStack[] newItems = new ItemStack[newSize];

		if (oldItems != null)
		{
			int copyLength = Math.min(oldItems.length, newItems.length);

			for (int i = 0; i < copyLength; i++)
			{
				newItems[i] = oldItems[i];
			}
		}

		this.freightInventorySize = newSize;
		this.tenderItems = newItems;
	}

	private void setStorageModeInternal(TenderStorageMode mode)
	{
		this.storageMode = sanitizeStorageMode(mode);
		applyInventorySizeForMode(this.storageMode);

		if (this.storageMode == TenderStorageMode.COAL_BUNKER)
		{
			purgeSecondaryTank();
		}
	}

	private void purgeSecondaryTank()
	{
		if (tankArray != null && tankArray.length > SECONDARY_TANK && tankArray[SECONDARY_TANK] != null)
		{
			tankArray[SECONDARY_TANK].setFluid(null);
		}
	}

	protected int getActiveTankCount()
	{
		if (storageMode == TenderStorageMode.DUAL_CHAMBER
				&& supportsSecondaryTank()
				&& tankArray != null
				&& tankArray.length > SECONDARY_TANK)
		{
			return 2;
		}

		return 1;
	}

	public StandardTank[] setupTanks(@Nullable FluidStack filter)
	{
		StandardTank primary;

		if (filter == null)
		{
			primary = LiquidManager.getInstance().new StandardTank(getTankCapacity());
		}
		else
		{
			primary = LiquidManager.getInstance().new FilteredTank(getTankCapacity(), filter);
		}

		/*
		 * For switchable tenders, both tanks exist internally.
		 * Coal bunker mode simply exposes only the primary tank.
		 */
		if (!supportsSecondaryTank())
		{
			return new StandardTank[] { primary };
		}

		return new StandardTank[] {
				primary,
				LiquidManager.getInstance().new FilteredTank(getSecondaryTankCapacity(), LiquidManager.dieselFilter())
		};
	}

	public int getTankCapacity()
	{
		return trainSpec.getTankCapacity();
	}

	public int getSecondaryTankCapacity()
	{
		TenderRecord record = getTenderRecordOrNull();

		if (record == null)
		{
			return 0;
		}

		return record.getSecondaryTankCapacity();
	}

	@Override
	public final boolean interactFirst(EntityPlayer entityplayer)
	{
		playerEntity = entityplayer;

		if ((super.interactFirst(entityplayer)))
		{
			return false;
		}

		if (!this.worldObj.isRemote)
		{
			entityplayer.openGui(Traincraft.instance, GuiIDs.TENDER, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}

		return true;
	}

	@Override
	public final void setDead()
	{
		super.setDead();
		isDead = true;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
	{
		super.writeEntityToNBT(nbttagcompound);

		if (storageMode == null)
		{
			storageMode = getDefaultStorageMode();
		}

		nbttagcompound.setInteger(NBT_TENDER_STORAGE_MODE, storageMode.getId());

		/*
		 * Primary-tank compatibility save.
		 *
		 * Keep this so old single-tank behavior remains compatible with older
		 * code paths that expect the primary tank directly in the root compound.
		 */
		this.tankArray[PRIMARY_TANK].writeToNBT(nbttagcompound);

		/*
		 * New explicit tank tags.
		 *
		 * These prevent secondary tank data from colliding with the primary tank.
		 */
		NBTTagCompound primaryTankTag = new NBTTagCompound();
		this.tankArray[PRIMARY_TANK].writeToNBT(primaryTankTag);
		nbttagcompound.setTag(NBT_PRIMARY_TANK, primaryTankTag);

		if (getActiveTankCount() > 1)
		{
			NBTTagCompound secondaryTankTag = new NBTTagCompound();
			this.tankArray[SECONDARY_TANK].writeToNBT(secondaryTankTag);
			nbttagcompound.setTag(NBT_SECONDARY_TANK, secondaryTankTag);
		}
		else
		{
			nbttagcompound.removeTag(NBT_SECONDARY_TANK);
		}

		NBTTagList nbttaglist = new NBTTagList();

		for (int i = 0; i < tenderItems.length; i++)
		{
			if (tenderItems[i] != null)
			{
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				tenderItems[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}

		nbttagcompound.setTag("Items", nbttaglist);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{
		super.readEntityFromNBT(nbttagcompound);

		setStorageModeInternal(readStorageMode(nbttagcompound));

		/*
		 * Prefer the new explicit primary tank tag.
		 * Fall back to the old root-level tank data for old saves.
		 */
		if (nbttagcompound.hasKey(NBT_PRIMARY_TANK))
		{
			this.tankArray[PRIMARY_TANK].readFromNBT(nbttagcompound.getCompoundTag(NBT_PRIMARY_TANK));
		}
		else
		{
			this.tankArray[PRIMARY_TANK].readFromNBT(nbttagcompound);
		}

		if (getActiveTankCount() > 1 && nbttagcompound.hasKey(NBT_SECONDARY_TANK))
		{
			this.tankArray[SECONDARY_TANK].readFromNBT(nbttagcompound.getCompoundTag(NBT_SECONDARY_TANK));
		}
		else
		{
			purgeSecondaryTank();
		}

		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		tenderItems = new ItemStack[getSizeInventory()];

		for (int i = 0; i < nbttaglist.tagCount(); i++)
		{
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;

			if (j >= 0 && j < tenderItems.length)
			{
				tenderItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}

		updateTankWatcher();
	}

	@Override
	public final int getSizeInventory()
	{
		return freightInventorySize;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();

		if (worldObj.isRemote)
		{
			return;
		}

		checkInvent(null, this);
		updateTankWatcher();
		updateMirroredLightState();
	}

	/**
	 * Publishes the complete light state of a directly coupled locomotive to this tender's clients.
	 *
	 * <p>The watcher is deliberately transient and is never saved by the tender. An unlinked tender
	 * publishes the packed all-off value, so newly placed tenders and tenders whose locomotive is
	 * detached cannot retain an illuminated lens, beam, beacon, or auxiliary fixture. If locomotives
	 * are coupled at both ends, link one wins the otherwise ambiguous selection.
	 */
	private void updateMirroredLightState()
	{
		IRollingStockLightState locomotiveState = locomotiveLightState(cartLinked1);
		if (locomotiveState == null)
		{
			locomotiveState = locomotiveLightState(cartLinked2);
		}

		int mirroredState = packMirroredLightState(locomotiveState);
		boolean stateUnchanged =
				dataWatcher.getWatchableObjectInt(RollingStockLightStateCodec.WATCHER_SLOT)
				== mirroredState;
		if (stateUnchanged == false)
		{
			dataWatcher.updateObject(RollingStockLightStateCodec.WATCHER_SLOT, mirroredState);
		}
	}

	/** Returns readable light state only for a directly coupled locomotive. */
	private static IRollingStockLightState locomotiveLightState(EntityRollingStock linkedStock)
	{
		return linkedStock instanceof Locomotive
				? (IRollingStockLightState) linkedStock
				: null;
	}

	/** Packs all stable light channels plus the transient horn response, or all-off when unlinked. */
	static int packMirroredLightState(IRollingStockLightState locomotiveState)
	{
		if (locomotiveState == null)
		{
			return RollingStockLightStateCodec.ALL_OFF;
		}
		return RollingStockLightStateCodec.pack(
				locomotiveState.getFrontHeadlightLevel(),
				locomotiveState.getRearHeadlightLevel(),
				locomotiveState.isLightChannelEnabled(RollingStockLightChannel.DITCH),
				locomotiveState.isLightChannelEnabled(RollingStockLightChannel.BEACON),
				locomotiveState.isLightChannelEnabled(RollingStockLightChannel.AUX),
				locomotiveState.isLightChannelEnabled(RollingStockLightChannel.GYRA),
				locomotiveState.isTransientLightSignalEnabled(
						RollingStockTransientLightSignal.HORN));
	}

	/** Reads the server-authored mirror used by every tender fixture. */
	private int mirroredLightState()
	{
		return dataWatcher.getWatchableObjectInt(RollingStockLightStateCodec.WATCHER_SLOT);
	}

	@Override
	public RollingStockHeadlightLevel getFrontHeadlightLevel()
	{
		return RollingStockLightStateCodec.front(mirroredLightState());
	}

	@Override
	public RollingStockHeadlightLevel getRearHeadlightLevel()
	{
		return RollingStockLightStateCodec.rear(mirroredLightState());
	}

	@Override
	public boolean isLightChannelEnabled(RollingStockLightChannel channel)
	{
		return RollingStockLightStateCodec.enabled(mirroredLightState(), channel);
	}

	@Override
	public boolean isTransientLightSignalEnabled(RollingStockTransientLightSignal signal)
	{
		return RollingStockLightStateCodec.transientEnabled(mirroredLightState(), signal);
	}

	private void updateTankWatcher()
	{
		this.dataWatcher.updateObject(DW_TENDER_TANK_SYNC, buildTankSyncString());
	}

	private String buildTankSyncString()
	{
		TenderStorageMode mode = storageMode == null ? TenderStorageMode.COAL_BUNKER : storageMode;

		return mode.getId()
				+ SYNC_SEPARATOR + getTankFluidId(PRIMARY_TANK)
				+ SYNC_SEPARATOR + getTankFluidAmount(PRIMARY_TANK)
				+ SYNC_SEPARATOR + getVisibleSecondaryFluidId()
				+ SYNC_SEPARATOR + getVisibleSecondaryFluidAmount()
				+ SYNC_SEPARATOR + (isStorageModeSwitchAvailableServerSide() ? 1 : 0);
	}

	private boolean isStorageModeSwitchAvailableServerSide()
	{
		return isStorageModeSwitchable()
				&& isWithinRealTimeWindow(STORAGE_MODE_SWITCH_WINDOW_MILLIS);
	}

	private int getVisibleSecondaryFluidId()
	{
		if (storageMode != TenderStorageMode.DUAL_CHAMBER)
		{
			return 0;
		}

		return getTankFluidId(SECONDARY_TANK);
	}

	private int getVisibleSecondaryFluidAmount()
	{
		if (storageMode != TenderStorageMode.DUAL_CHAMBER)
		{
			return 0;
		}

		return getTankFluidAmount(SECONDARY_TANK);
	}

	private int getTankFluidId(int tankIndex)
	{
		if (tankArray == null || tankIndex < 0 || tankIndex >= tankArray.length || tankArray[tankIndex] == null)
		{
			return 0;
		}

		FluidStack fluidStack = tankArray[tankIndex].getFluid();

		if (fluidStack == null)
		{
			return 0;
		}

		return fluidStack.getFluidID();
	}

	private int getTankFluidAmount(int tankIndex)
	{
		if (tankArray == null || tankIndex < 0 || tankIndex >= tankArray.length || tankArray[tankIndex] == null)
		{
			return 0;
		}

		return tankArray[tankIndex].getFluidAmount();
	}

	private int getSyncedInt(int index)
	{
		String value = this.dataWatcher.getWatchableObjectString(DW_TENDER_TANK_SYNC);

		if (value == null || value.length() == 0)
		{
			return 0;
		}

		String[] split = value.split(SYNC_SEPARATOR);

		if (index < 0 || index >= split.length)
		{
			return 0;
		}

		try
		{
			return Integer.parseInt(split[index]);
		}
		catch (NumberFormatException e)
		{
			return 0;
		}
	}

	public int getSyncedPrimaryFluidId()
	{
		return getSyncedInt(1);
	}

	public int getSyncedPrimaryFluidAmount()
	{
		return getSyncedInt(2);
	}

	public int getSyncedSecondaryFluidId()
	{
		return getSyncedInt(3);
	}

	public int getSyncedSecondaryFluidAmount()
	{
		return getSyncedInt(4);
	}

	/**
	 * Handle mass depending on items and liquid.
	 */
	@Override
	protected void handleMass()
	{
		if (this.updateTicks % 10 != 0)
		{
			return;
		}

		this.mass = this.getDefaultMass();
		this.itemInsideCount = 0;

		for (int i = 0; i < getSizeInventory(); i++)
		{
			ItemStack itemstack = getStackInSlot(i);

			if (itemstack != null && itemstack.stackSize > 0)
			{
				this.itemInsideCount += itemstack.stackSize;
			}
		}

		mass += (this.itemInsideCount * 0.0001D);

		int activeTankCount = getActiveTankCount();

		for (int i = 0; i < activeTankCount; i++)
		{
			if (tankArray[i] != null && tankArray[i].getFluid() != null && tankArray[i].getFluid().amount > 0)
			{
				mass += (tankArray[i].getFluid().amount / 10000.0D);
			}
		}
	}

	/**
	 * Added for SMP, used by the HUD.
	 *
	 * @return primary tank fluid amount
	 */
	public int getWater()
	{
		return getSyncedPrimaryFluidAmount();
	}

	/**
	 * Used by the GUI.
	 *
	 * @return primary tank fluid id
	 */
	public int getLiquidItemID()
	{
		return getSyncedPrimaryFluidId();
	}

	public int getCartTankCapacity()
	{
		return maxTank;
	}

	public StandardTank getTank()
	{
		return tankArray[PRIMARY_TANK];
	}

	public StandardTank getSecondaryTank()
	{
		if (tankArray == null || tankArray.length <= SECONDARY_TANK)
		{
			return null;
		}

		return tankArray[SECONDARY_TANK];
	}

	public FluidStack getSecondaryFluid()
	{
		if (getActiveTankCount() <= 1)
		{
			return null;
		}

		return tankArray[SECONDARY_TANK].getFluid();
	}

	public int getSecondaryFluidAmount()
	{
		if (getActiveTankCount() <= 1)
		{
			return 0;
		}

		return tankArray[SECONDARY_TANK].getFluidAmount();
	}

	@Override
	public boolean isContainerValidForInputSlot(int slot, ItemStack stack)
	{
		if (stack == null)
		{
			return false;
		}

		StandardTank targetTank;

		if (slot == PRIMARY_CONTAINER_SLOT)
		{
			targetTank = getTank();
		}
		else if (slot == SECONDARY_CONTAINER_SLOT && isDualChamberMode())
		{
			targetTank = getSecondaryTank();
		}
		else
		{
			return false;
		}

		if (targetTank == null)
		{
			return false;
		}

		if (FluidContainerRegistry.isEmptyContainer(stack))
		{
			return true;
		}

		FluidStack contained = FluidContainerRegistry.getFluidForFilledItem(stack);
		return contained != null && targetTank.acceptsFluid(contained);
	}

	private boolean isContainerInputSlot(int slot)
	{
		if (slot == PRIMARY_CONTAINER_SLOT)
		{
			return true;
		}

		return isDualChamberMode() && slot == SECONDARY_CONTAINER_SLOT;
	}

	private void placeInInvent(ItemStack itemstack1, Tender tender)
	{
		if (itemstack1 == null)
		{
			return;
		}

		for (int i = 0; i < tender.tenderItems.length; i++)
		{
			if (tender.isContainerInputSlot(i))
			{
				continue;
			}

			if (tender.tenderItems[i] == null)
			{
				tender.tenderItems[i] = itemstack1;
				return;
			}
			else if (tender.tenderItems[i].getItem() == itemstack1.getItem()
					&& itemstack1.isStackable()
					&& (!itemstack1.getHasSubtypes() || tender.tenderItems[i].getItemDamage() == itemstack1.getItemDamage())
					&& ItemStack.areItemStackTagsEqual(tender.tenderItems[i], itemstack1))
			{
				int var9 = tender.tenderItems[i].stackSize + itemstack1.stackSize;

				if (var9 <= tender.tenderItems[i].getMaxStackSize())
				{
					tender.tenderItems[i].stackSize = var9;
					return;
				}
				else if (tender.tenderItems[i].stackSize < tender.tenderItems[i].getMaxStackSize())
				{
					tender.tenderItems[i].stackSize += 1;
					return;
				}
			}
		}

		entityDropItem(itemstack1, 1);
	}

	public void liquidInSlot(ItemStack itemstack, Tender tender)
	{
		processLiquidContainerSlot(PRIMARY_CONTAINER_SLOT, PRIMARY_TANK, itemstack, tender, false);
	}

	public void liquidInSecondarySlot(ItemStack itemstack, Tender tender)
	{
		if (!isDualChamberMode())
		{
			return;
		}

		if (getActiveTankCount() <= 1)
		{
			return;
		}

		processLiquidContainerSlot(SECONDARY_CONTAINER_SLOT, SECONDARY_TANK, itemstack, tender, true);
	}

	private void processLiquidContainerSlot(int slotIndex, int tankIndex, ItemStack itemstack, Tender tender, boolean secondary)
	{
		if (worldObj.isRemote)
		{
			return;
		}

		if (itemstack == null)
		{
			return;
		}

		if (slotIndex < 0 || slotIndex >= tenderItems.length)
		{
			return;
		}

		if (tankIndex < 0 || tankIndex >= tankArray.length)
		{
			return;
		}

		if (secondary)
		{
			this.secondaryUpdate += 1;

			if (this.secondaryUpdate % 8 != 0)
			{
				return;
			}
		}
		else
		{
			this.update += 1;

			if (this.update % 8 != 0)
			{
				return;
			}
		}

		/*
		 * Container slots always target one tank. This prevents an empty
		 * container in the primary slot from draining the secondary tank.
		 */
		IFluidHandler handler = new SingleTenderTankFluidHandler(tankIndex);

		ItemStack result = LiquidManager.getInstance().processContainer(this, slotIndex, handler, itemstack);

		if (result != null)
		{
			placeInInvent(result, tender);
			decrStackSize(slotIndex, 1);
		}
	}

	protected void checkInvent(ItemStack tenderInvent, Tender loco)
	{
		if (tenderItems != null && tenderItems.length > PRIMARY_CONTAINER_SLOT)
		{
			ItemStack primaryInput = tenderItems[PRIMARY_CONTAINER_SLOT];

			if (primaryInput != null)
			{
				liquidInSlot(primaryInput, loco);
			}
		}

		if (isDualChamberMode() && tenderItems != null && tenderItems.length > SECONDARY_CONTAINER_SLOT)
		{
			ItemStack secondaryInput = tenderItems[SECONDARY_CONTAINER_SLOT];

			if (secondaryInput != null)
			{
				liquidInSecondarySlot(secondaryInput, loco);
			}
		}

		if (ticksExisted % 5 == 0 && fill(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), false) == 100)
		{
			FluidStack drain = null;

			blocksToCheck = new TileEntity[] {
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posZ)),
					worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
			};

			for (TileEntity block : blocksToCheck)
			{
				if (drain == null && block instanceof IFluidHandler)
				{
					for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS)
					{
						FluidStack testDrain = ((IFluidHandler) block).drain(direction, 100, false);

						if (testDrain != null
								&& testDrain.fluid == FluidRegistry.WATER
								&& testDrain.amount == 100)
						{
							drain = ((IFluidHandler) block).drain(direction, 100, true);
						}
					}
				}
			}

			if (drain == null && cartLinked1 instanceof LiquidTank
					&& !(cartLinked1 instanceof EntityBUnitEMDF7)
					&& !(cartLinked1 instanceof EntityBUnitEMDF3)
					&& !(cartLinked1 instanceof EntityBUnitDD35))
			{
				if (getFluid() == null)
				{
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				}
				else if (getFluid().getFluid() == FluidRegistry.WATER)
				{
					drain = ((LiquidTank) cartLinked1).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				}
			}
			else if (drain == null && cartLinked2 instanceof LiquidTank
					&& !(cartLinked2 instanceof EntityBUnitEMDF7)
					&& !(cartLinked2 instanceof EntityBUnitEMDF3)
					&& !(cartLinked2 instanceof EntityBUnitDD35))
			{
				if (getFluid() == null)
				{
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				}
				else if (getFluid().getFluid() == FluidRegistry.WATER)
				{
					drain = ((LiquidTank) cartLinked2).drain(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), true);
				}
			}

			if (drain != null)
			{
				fill(ForgeDirection.UNKNOWN, drain, true);
			}
		}
	}

	/* IInventory implements */

	@Override
	public ItemStack getStackInSlot(int i)
	{
		return tenderItems[i];
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int par1)
	{
		if (this.tenderItems[par1] != null)
		{
			ItemStack var2 = this.tenderItems[par1];
			this.tenderItems[par1] = null;
			return var2;
		}
		else
		{
			return null;
		}
	}

	@Override
	public ItemStack decrStackSize(int i, int j)
	{
		if (tenderItems[i] != null)
		{
			if (tenderItems[i].stackSize <= j)
			{
				ItemStack itemstack = tenderItems[i];
				tenderItems[i] = null;
				return itemstack;
			}

			ItemStack itemstack1 = tenderItems[i].splitStack(j);

			if (tenderItems[i].stackSize == 0)
			{
				tenderItems[i] = null;
			}

			return itemstack1;
		}
		else
		{
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack)
	{
		tenderItems[i] = itemstack;

		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		{
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	public void setLiquid(FluidStack liquid)
	{
	}

	public void setCapacity(int capacity)
	{
		this.maxTank = capacity;
	}

	public int getCapacity()
	{
		return this.maxTank;
	}

	@Override
	public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
	{
		if (resource == null || resource.getFluid() == null)
		{
			return 0;
		}

		int activeTankCount = getActiveTankCount();

		for (int i = 0; i < activeTankCount; i++)
		{
			int filled = tankArray[i].fill(resource, doFill);

			if (filled > 0)
			{
				return filled;
			}
		}

		return 0;
	}

	@Override
	public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
	{
		if (resource == null || resource.getFluid() == null)
		{
			return null;
		}

		int activeTankCount = getActiveTankCount();

		for (int i = 0; i < activeTankCount; i++)
		{
			FluidStack current = tankArray[i].getFluid();

			if (current != null && resource.isFluidEqual(current))
			{
				return tankArray[i].drain(resource.amount, doDrain);
			}
		}

		return null;
	}

	@Override
	public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
	{
		if (maxDrain <= 0)
		{
			return null;
		}

		/*
		 * Older unloaders use the untyped Forge drain method. Drain one tank
		 * at a time, primary first, so both chambers can eventually unload
		 * without ever mixing fluids in a single FluidStack.
		 */
		int activeTankCount = getActiveTankCount();

		for (int i = 0; i < activeTankCount; i++)
		{
			if (tankArray[i] != null && tankArray[i].getFluidAmount() > 0)
			{
				return tankArray[i].drain(maxDrain, doDrain);
			}
		}

		return null;
	}

	@Override
	public boolean canFill(ForgeDirection from, Fluid fluid)
	{
		if (fluid == null)
		{
			return false;
		}

		int activeTankCount = getActiveTankCount();

		for (int i = 0; i < activeTankCount; i++)
		{
			FluidStack current = tankArray[i].getFluid();

			if (current != null && current.getFluid() == fluid)
			{
				return true;
			}

			if (tankArray[i].fill(new FluidStack(fluid, 1), false) > 0)
			{
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean canDrain(ForgeDirection from, Fluid fluid)
	{
		if (fluid == null)
		{
			return false;
		}

		int activeTankCount = getActiveTankCount();

		for (int i = 0; i < activeTankCount; i++)
		{
			FluidStack current = tankArray[i].getFluid();

			if (current != null && current.getFluid() == fluid)
			{
				return true;
			}
		}

		return false;
	}

	@Override
	public FluidTankInfo[] getTankInfo(ForgeDirection from)
	{
		if (getActiveTankCount() <= 1)
		{
			return new FluidTankInfo[] { tankArray[PRIMARY_TANK].getInfo() };
		}

		return new FluidTankInfo[] {
				tankArray[PRIMARY_TANK].getInfo(),
				tankArray[SECONDARY_TANK].getInfo()
		};
	}

	public FluidStack getFluid()
	{
		return tankArray[PRIMARY_TANK].getFluid();
	}

	public int getFluidAmount()
	{
		return tankArray[PRIMARY_TANK].getFluidAmount();
	}

	private class SingleTenderTankFluidHandler implements IFluidHandler
	{
		private final int tankIndex;

		private SingleTenderTankFluidHandler(int tankIndex)
		{
			this.tankIndex = tankIndex;
		}

		private StandardTank getTargetTank()
		{
			if (tankArray == null || tankIndex < 0 || tankIndex >= tankArray.length)
			{
				return null;
			}

			return tankArray[tankIndex];
		}

		@Override
		public int fill(ForgeDirection from, FluidStack resource, boolean doFill)
		{
			StandardTank tank = getTargetTank();

			if (tank == null || resource == null || resource.getFluid() == null)
			{
				return 0;
			}

			return tank.fill(resource, doFill);
		}

		@Override
		public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain)
		{
			StandardTank tank = getTargetTank();

			if (tank == null || resource == null || resource.getFluid() == null)
			{
				return null;
			}

			FluidStack current = tank.getFluid();

			if (current == null || !resource.isFluidEqual(current))
			{
				return null;
			}

			return tank.drain(resource.amount, doDrain);
		}

		@Override
		public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain)
		{
			StandardTank tank = getTargetTank();

			if (tank == null)
			{
				return null;
			}

			return tank.drain(maxDrain, doDrain);
		}

		@Override
		public boolean canFill(ForgeDirection from, Fluid fluid)
		{
			StandardTank tank = getTargetTank();

			if (tank == null || fluid == null)
			{
				return false;
			}

			FluidStack current = tank.getFluid();

			if (current != null && current.getFluid() == fluid)
			{
				return true;
			}

			return tank.fill(new FluidStack(fluid, 1), false) > 0;
		}

		@Override
		public boolean canDrain(ForgeDirection from, Fluid fluid)
		{
			StandardTank tank = getTargetTank();

			if (tank == null || fluid == null)
			{
				return false;
			}

			FluidStack current = tank.getFluid();

			return current != null && current.getFluid() == fluid;
		}

		@Override
		public FluidTankInfo[] getTankInfo(ForgeDirection from)
		{
			StandardTank tank = getTargetTank();

			if (tank == null)
			{
				return new FluidTankInfo[0];
			}

			return new FluidTankInfo[] { tank.getInfo() };
		}
	}

	@Override
	public void dropCartAsItem(boolean isCreative)
	{
		if (!itemdropped)
		{
			super.dropCartAsItem(isCreative);
			dropStockInventoryContents(this, tenderItems);
		}
	}
}
