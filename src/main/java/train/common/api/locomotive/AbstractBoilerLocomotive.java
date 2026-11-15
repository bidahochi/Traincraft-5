package train.common.api.locomotive;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.LiquidManager.StandardTank;
import train.common.api.Locomotive;
import train.common.api.Tender;
import train.common.library.GuiIDs;

import javax.annotation.Nullable;

/**
 * Shared boiler/water behavior for steam-style locomotives.
 *
 * This class owns:
 * - the boiler water tank
 * - water NBT
 * - water datawatcher sync
 * - water container handling
 * - boiler water consumption
 * - pulling water from linked tenders / nearby fluid handlers
 *
 * This class does NOT know about:
 * - coal
 * - wood
 * - FuelHandler.steamFuelLast(...)
 * - liquid fuel
 * - diesel/refined fuel consumption
 */
public abstract class AbstractBoilerLocomotive extends Locomotive implements IFluidHandler {

    public int fuelSlot = 1;
    public int waterSlot = 1;

    protected static final int FUEL_SLOT_INDEX = 0;
    protected static final int WATER_SLOT_INDEX = 1;

    protected static final int DW_TANK_DATA_STRING = 23;

    protected static final String FLUID_SYNC_SEPARATOR = "-_-";
    protected static final String NULL_FLUID_NAME = "null";

    protected int maxTank;

    private int waterContainerUpdate = 8;

    protected StandardTank coolantTank;

    public AbstractBoilerLocomotive(World world) {
        this(world, null);
    }

    public AbstractBoilerLocomotive(World world, @Nullable FluidStack waterFilter) {
        super(world);

        this.maxTank = getTankCapacity();

        if (waterFilter == null)
        {
            this.coolantTank = LiquidManager.getInstance().new StandardTank(getTankCapacity());
        }
        else
        {
            this.coolantTank = LiquidManager.getInstance().new FilteredTank(getTankCapacity(), waterFilter);
        }

        numCargoSlots = 3;
        numCargoSlots1 = 3;
        numCargoSlots2 = 3;
        inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + fuelSlot + waterSlot;

        fuelTrain = 0;
        locoInvent = new ItemStack[inventorySize];

        if (world != null)
        {
            this.dataWatcher.addObject(DW_TANK_DATA_STRING, BUILD_DW_TANK_DATA_STRING());
            syncFluidDataWatcher();
        }
    }

    public int getTankCapacity() {
        if (this.trainSpec != null) {
            return this.trainSpec.getTankCapacity();
        }

        return 0;
    }

    /**
     * returns the waterConsumption for each steam loco default is 200: rand.nextInt(200)==0
     *
     * @return
     */
    public int getWaterConsumption() {
        if (trainSpec != null) {
            return trainSpec.getWaterConsumption();
        }

        return 200;
    }

    @Override
    public void pressKey(int i)
    {
        if (i == 7 && getActiveDriver() instanceof EntityPlayer)
        {
            ((EntityPlayer) getActiveDriver()).openGui(
                    Traincraft.instance,
                    GuiIDs.LOCO,
                    worldObj,
                    (int) this.posX,
                    (int) this.posY,
                    (int) this.posZ
            );
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (worldObj.isRemote) {
            return;
        }

        if (coolantTank != null && coolantTank.getFluid() != null && getIsFuelled()) {
            if (coolantTank.getFluid().amount <= 1) {
                motionX *= 0.94;
                motionZ *= 0.94;
            }
        }

        if (rand.nextInt(100) == 0 && getWaterAmount() > 0 && getIsFuelled()) {
            drain(ForgeDirection.UNKNOWN, getWaterConsumption() / 5, true);
        }

        checkBoilerInventory(
                locoInvent.length > 0 ? locoInvent[0] : null,
                locoInvent.length > 1 ? locoInvent[1] : null
        );

        // This must always be last since we need to update the data at the end of the tick.
        syncFluidDataWatcher();
    }

    protected abstract void checkBoilerInventory(ItemStack fuelSlotStack, ItemStack waterSlotStack);

    protected void syncFluidDataWatcher() {

        this.dataWatcher.updateObject(DW_TANK_DATA_STRING, BUILD_DW_TANK_DATA_STRING());
    }

    protected String getFluidData()
    {
        if (worldObj != null && worldObj.isRemote) {
            return this.dataWatcher.getWatchableObjectString(DW_TANK_DATA_STRING);
        }
        return BUILD_DW_TANK_DATA_STRING();
    }

    /**
     * SMP/HUD water amount.
     */
    public final int getWaterAmount() {
        return Integer.parseInt(this.dataWatcher.getWatchableObjectString(DW_TANK_DATA_STRING).split(FLUID_SYNC_SEPARATOR)[1]);
    }

    /**
     * GUI liquid ID for the boiler/water tank.
     */
    public final int getLiquidItemID() {
        return Integer.parseInt(this.dataWatcher.getWatchableObjectString(DW_TANK_DATA_STRING).split(FLUID_SYNC_SEPARATOR)[0]);
    }

    protected String BUILD_DW_TANK_DATA_STRING()
    {
        if (coolantTank != null && coolantTank.getFluid() != null)
        {
            return coolantTank.getFluid().getFluidID() + FLUID_SYNC_SEPARATOR + coolantTank.getFluid().amount;
        }
        else
        {
            return ("0" + FLUID_SYNC_SEPARATOR + "0");
        }
    }

    public StandardTank getTank() {
        return coolantTank;
    }

    public FluidStack getFluid() {
        return coolantTank.getFluid();
    }

    public int getFluidAmount() {
        return coolantTank.getFluidAmount();
    }

    public int getCartTankCapacity() {
        return maxTank;
    }

    public void setCapacity(int capacity) {
        this.maxTank = capacity;
    }

    public int getCapacity() {
        return this.maxTank;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tag) {
        super.writeEntityToNBT(tag);

        if (this.coolantTank != null) {
            this.coolantTank.writeToNBT(tag);
        }

        tag.setBoolean("canBeAdjusted", canBeAdjusted);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound tag) {
        super.readEntityFromNBT(tag);

        if (this.coolantTank != null) {
            this.coolantTank.readFromNBT(tag);
        }

        canBeAdjusted = tag.getBoolean("canBeAdjusted");
    }

    protected void processWaterContainerInSlot(int slot, ItemStack itemstack) {
        if (worldObj.isRemote) {
            return;
        }

        this.waterContainerUpdate++;

        if (this.waterContainerUpdate % 8 != 0 || itemstack == null) {
            return;
        }

        FluidStack contained = FluidContainerRegistry.getFluidForFilledItem(itemstack);

        if (contained == null || contained.getFluid() != FluidRegistry.WATER) {
            return;
        }

        ItemStack result = LiquidManager.getInstance().processContainer(this, slot, this, itemstack);

        if (result != null) {
            placeReturnedContainer(result, 2);
            decrStackSize(slot, 1);
        }
    }

    protected void placeReturnedContainer(ItemStack itemstack, int startSlot)
    {
        for (int i = startSlot; i < locoInvent.length; i++)
        {
            if (locoInvent[i] == null) {
                locoInvent[i] = itemstack;
                return;
            }
            else if (locoInvent[i].getItem() == itemstack.getItem()
                    && itemstack.isStackable()
                    && (!itemstack.getHasSubtypes() || locoInvent[i].getItemDamage() == itemstack.getItemDamage())
                    && ItemStack.areItemStackTagsEqual(locoInvent[i], itemstack)) {

                int newSize = locoInvent[i].stackSize + itemstack.stackSize;

                if (newSize <= itemstack.getMaxStackSize()) {
                    locoInvent[i].stackSize = newSize;
                    return;
                }
                else if (locoInvent[i].stackSize < locoInvent[i].getMaxStackSize()) {
                    locoInvent[i].stackSize += 1;
                    return;
                }
            }
            else if (i == locoInvent.length - 1) {
                entityDropItem(itemstack, 1);
                return;
            }
        }
    }

    protected void pullWaterFromNearbyFluidHandlers() {
        if (fill(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), false) <= 0) {
            return;
        }

        FluidStack drain = null;

        blocksToCheck = new TileEntity[] {
                worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY - 1), MathHelper.floor_double(posZ)),
                worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 2), MathHelper.floor_double(posZ)),
                worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 3), MathHelper.floor_double(posX)),
                worldObj.getTileEntity(MathHelper.floor_double(posX), MathHelper.floor_double(posY + 4), MathHelper.floor_double(posZ))
        };

        for (TileEntity block : blocksToCheck) {
            if (drain != null || !(block instanceof IFluidHandler)) {
                continue;
            }

            IFluidHandler handler = (IFluidHandler) block;

            for (ForgeDirection direction : ForgeDirection.VALID_DIRECTIONS) {
                FluidStack test = handler.drain(direction, new FluidStack(FluidRegistry.WATER, 100), false);

                if (test != null && test.getFluid() == FluidRegistry.WATER && test.amount > 0) {
                    drain = handler.drain(direction, new FluidStack(FluidRegistry.WATER, 100), true);
                    break;
                }
            }
        }

        if (drain != null) {
            fill(ForgeDirection.UNKNOWN, drain, true);
        }
    }

    protected boolean pullWaterFromLinkedTender(Object linkedCart) {
        if (!(linkedCart instanceof Tender)) {
            return false;
        }

        if (fill(ForgeDirection.UNKNOWN, new FluidStack(FluidRegistry.WATER, 100), false) <= 0) {
            return false;
        }

        Tender tender = (Tender) linkedCart;

        FluidStack test = tender.drain(
                ForgeDirection.UNKNOWN,
                new FluidStack(FluidRegistry.WATER, 100),
                false
        );

        if (test != null && test.getFluid() == FluidRegistry.WATER && test.amount > 0) {
            FluidStack drained = tender.drain(
                    ForgeDirection.UNKNOWN,
                    new FluidStack(FluidRegistry.WATER, 100),
                    true
            );

            if (drained != null) {
                fill(ForgeDirection.UNKNOWN, drained, true);
                return true;
            }
        }

        return false;
    }

    protected void pullWaterFromNearbyAndLinkedTenders() {
        pullWaterFromNearbyFluidHandlers();
        pullWaterFromLinkedTender(cartLinked1);
        pullWaterFromLinkedTender(cartLinked2);
    }

    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
        if (resource == null || resource.getFluid() == null) {
            return 0;
        }

        if (resource.getFluid() != FluidRegistry.WATER) {
            return 0;
        }

        return coolantTank.fill(resource, doFill);
    }

    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
        if (resource == null || coolantTank == null || coolantTank.getFluid() == null) {
            return null;
        }

        if (resource.getFluid() != FluidRegistry.WATER) {
            return null;
        }

        if (!resource.isFluidEqual(coolantTank.getFluid())) {
            return null;
        }

        return coolantTank.drain(resource.amount, doDrain);
    }

    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        return coolantTank == null ? null : coolantTank.drain(maxDrain, doDrain);
    }

    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return fluid == FluidRegistry.WATER;
    }

    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid) {
        return fluid == FluidRegistry.WATER;
    }

    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from) {
        return new FluidTankInfo[] { coolantTank.getInfo() };
    }
}
