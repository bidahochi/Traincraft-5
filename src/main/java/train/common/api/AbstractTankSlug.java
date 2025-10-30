package train.common.api;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.register.ITrainRecord;

public abstract class AbstractTankSlug extends LiquidTank implements IFluidHandler, INoFuelTransferEntity, IRollingStockLightControls
{
    public int freightInventorySize;

    private int update = 8;
    private LiquidManager.StandardTank theTank;

    public boolean isLightsEnabled = true; // This is always on since there is nothing to control this presently on Tanker Slugs
    public boolean isBeaconEnabled = true; // This is always on since there is nothing to control this presently on Tanker Slugs
    public byte beaconCycleIndex = 0;
    public byte ditchLightMode = 1;


    public AbstractTankSlug(World world, ITrainRecord trainRecord)
    {
        super(world, trainRecord.getTankCapacity());

        initFreightWater();
        this.theTank = LiquidManager.getInstance().new FilteredTank(trainRecord.getTankCapacity(), LiquidManager.dieselFilter());
        dataWatcher.addObject(28, lightingDetailsJSON());
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void onUpdate()
    {
        cycleBeaconIndex();
        super.onUpdate();
        checkInvent(cargoItems[0]);
        if (worldObj.isRemote) {
            return;
        }

        if (theTank != null && theTank.getFluid() != null) {
            this.dataWatcher.updateObject(18, theTank.getFluidAmount());
            this.dataWatcher.updateObject(4, theTank.getFluid().getFluidID());
            if (theTank.getFluid().amount <= 1) {
                motionX *= 0.94;
                motionZ *= 0.94;
            }
        }
        else if (theTank != null && theTank.getFluid() == null) {
            this.dataWatcher.updateObject(18, 0);
            this.dataWatcher.updateObject(4, 0);
        }

        if (getAmount() > 0) {
            // setColor(getColorFromString("Full"));
            setDefaultMass(-trainSpec.getMass()*4);
            if ((motionX>0.01 || motionZ>0.01) && ticksExisted % 40 == 0) {
                drain(ForgeDirection.UNKNOWN, 8,true);
            }

        } else if (getAmount() <= 0) {
            // setColor(getColorFromString("Empty"));
            setDefaultMass(trainSpec.getMass());
        }

        if (!worldObj.isRemote)
        {
            dataWatcher.updateObject(28, lightingDetailsJSON());
        }
    }

    private void cycleBeaconIndex()
    {
        if (isBeaconEnabled && ticksExisted % 5 == 0)
        {
            beaconCycleIndex++;
            if (beaconCycleIndex == 4)
            {
                beaconCycleIndex = 0;
            }
        }
    }

    public int getDiesel() {
        return (this.dataWatcher.getWatchableObjectInt(18));
    }

    public int getLiquidItemID() {
        return (this.dataWatcher.getWatchableObjectInt(4));
    }

    public LiquidManager.StandardTank getTank() {
        return theTank;
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < cargoItems.length; i++) {
            if (cargoItems[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                cargoItems[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }


        nbttagcompound.setTag("Items", nbttaglist);
        if (theTank !=null && theTank.getFluid() != null) {
            new FluidStack(theTank.getFluid(), this.dataWatcher.getWatchableObjectInt(18)).writeToNBT(nbttagcompound);
        }

        nbttagcompound.setString("lightingDetailsJSON", lightingDetailsJSON());
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        cargoItems = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < cargoItems.length) {
                cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
        if (nbttagcompound.hasKey("FluidName")) {
            fill(ForgeDirection.UNKNOWN, FluidStack.loadFluidStackFromNBT(nbttagcompound), true);
        }

        JsonObject lightingDetailsJSONObject;
        try {
            lightingDetailsJSONObject = new JsonParser().parse(nbttagcompound.getString("lightingDetailsJSON")).getAsJsonObject();
        }
        catch (Exception e)
        {
            lightingDetailsJSONObject = lightingDetailsAsJSON();
        }

        isLightsEnabled = lightingDetailsJSONObject.get("isLightsEnabled").getAsBoolean();
        isBeaconEnabled = lightingDetailsJSONObject.get("isBeaconEnabled").getAsBoolean();
        ditchLightMode = lightingDetailsJSONObject.get("ditchLightMode").getAsByte();
        beaconCycleIndex = lightingDetailsJSONObject.get("beaconCycleIndex").getAsByte();

        dataWatcher.updateObject(28, lightingDetailsJSON());
    }

    private void placeInInvent(ItemStack itemstack1) {
        for (int i = 1; i < cargoItems.length; i++) {
            if (cargoItems[i] == null) {
                cargoItems[i] = itemstack1;
                return;
            }
            else if (cargoItems[i] != null && cargoItems[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() && (!itemstack1.getHasSubtypes() || cargoItems[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(cargoItems[i], itemstack1)) {
                int var9 = cargoItems[i].stackSize + itemstack1.stackSize;
                if (var9 <= itemstack1.getMaxStackSize()) {
                    cargoItems[i].stackSize = var9;

                }
                else if (cargoItems[i].stackSize < itemstack1.getMaxStackSize()) {
                    cargoItems[i].stackSize += 1;
                }
                return;
            }
            else if (i == cargoItems.length - 1) {
                entityDropItem(itemstack1,1);
                return;
            }
        }
    }

    public void liquidInSlot(ItemStack itemstack) {
        if (worldObj.isRemote)
            return;
        this.update += 1;
        if (this.update % 8 == 0 && itemstack != null) {
            ItemStack result = LiquidManager.getInstance().processContainer(this, 0, this, itemstack);
            if (result != null) {
                placeInInvent(result);
            }
        }
    }

    public ItemStack checkInvent(ItemStack cargoItems0) {

        if (getDiesel() > 0) {
            fuelTrain = (getDiesel());
        }
        if (fuelTrain <= 0) {
            motionX *= 0.88;
            motionZ *= 0.88;
        }
        if (cargoItems0 != null) {
            liquidInSlot(cargoItems0);
        }
        return cargoItems0;
    }

    public void initFreightWater() {
        freightInventorySize = 2;
        cargoItems = new ItemStack[freightInventorySize];
    }

    @Override
    public int getSizeInventory() {
        return freightInventorySize;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!this.worldObj.isRemote) {
            entityplayer.openGui(Traincraft.instance, GuiIDs.LIQUID, worldObj, this.getEntityId(), -1, (int) this.posZ);
        }
        return true;
    }

    @Override
    public boolean isStorageCart() {
        return true;
    }

    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
        return theTank.fill(resource, doFill);
    }

    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
        if (resource == null || !resource.isFluidEqual(theTank.getFluid())) {
            return null;
        }
        return theTank.drain(resource.amount, doDrain);
    }

    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        return theTank.drain(maxDrain, doDrain);
    }

    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return true;
    }

    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid) {
        return true;
    }

    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from) {
        return new FluidTankInfo[] { theTank.getInfo() };
    }

    public FluidStack getFluid() {
        return theTank.getFluid();
    }

    public int getFluidAmount() {
        return dataWatcher.getWatchableObjectInt(18);
    }

    @Override
    public String getLiquidName(){
        return FluidRegistry.getFluid(this.dataWatcher.getWatchableObjectInt(4))!=null? FluidRegistry.getFluid(this.dataWatcher.getWatchableObjectInt(4)).getUnlocalizedName():null;
    }

    //region Implement IRollingStockLightControls
    public String lightingDetailsJSON()
    {
        JsonObject lightingDetailsJSON = new JsonObject();
        lightingDetailsJSON.addProperty("isLightsEnabled", isLightsEnabled);
        lightingDetailsJSON.addProperty("isBeaconEnabled", isBeaconEnabled);
        lightingDetailsJSON.addProperty("beaconCycleIndex", beaconCycleIndex);
        lightingDetailsJSON.addProperty("ditchLightMode", ditchLightMode);
        return lightingDetailsJSON.toString();
    }

    public JsonObject lightingDetailsAsJSON()
    {
        JsonObject lightingDetailsJSON = new JsonObject();
        lightingDetailsJSON.addProperty("isLightsEnabled", isLightsEnabled);
        lightingDetailsJSON.addProperty("isBeaconEnabled", isBeaconEnabled);
        lightingDetailsJSON.addProperty("beaconCycleIndex", beaconCycleIndex);
        lightingDetailsJSON.addProperty("ditchLightMode", ditchLightMode);
        return lightingDetailsJSON;
    }

    /**
     *
     * @param isLightsOn set 0 if lights is false, 1 if true
     */
    public void setPacketLights(boolean isLightsOn)
    {
        isLightsEnabled = isLightsOn;
    }

    /**
     *
     * @param isBeaconOn set 0 if beacon is false, 1 if true
     */
    public void setPacketBeacon(boolean isBeaconOn)
    {
        isBeaconEnabled = isBeaconOn;
    }

    /**Sets the Ditch light mode
     *
     * @param ditchLightMode set 0 for off,
     */
    public void setPacketDitchLightsMode(byte ditchLightMode)
    {
        this.ditchLightMode = ditchLightMode;
    }

    public boolean isLightsEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(28)).get("isLightsEnabled").getAsBoolean();
    }

    public boolean isBeaconEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(28)).get("isBeaconEnabled").getAsBoolean();
    }

    public byte getBeaconCycleIndex()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(28)).get("beaconCycleIndex").getAsByte();
    }

    public boolean isDitchLightsEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(28)).get("ditchLightMode").getAsByte() > 0;
    }

    private JsonObject AsJsonObject(String string)
    {
        return new JsonParser().parse(string).getAsJsonObject();
    }
}
