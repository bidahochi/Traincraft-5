package train.common.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;
import train.common.Traincraft;
import train.common.library.GuiIDs;

public abstract class AbstractTankSlug extends LiquidTank implements IFluidHandler, INoFuelTransferEntity, IRollingStockLightControls
{
    public int freightInventorySize;

    private int update = 8;
    private LiquidManager.StandardTank theTank;

    private RollingStockHeadlightLevel frontHeadlightLevel = RollingStockHeadlightLevel.BRIGHT;
    private RollingStockHeadlightLevel rearHeadlightLevel = RollingStockHeadlightLevel.OFF;
    private boolean ditchLightsEnabled = true;
    private boolean beaconEnabled = true;
    private boolean auxLightsEnabled;
    private boolean gyraLightsEnabled;


    public AbstractTankSlug(World world)
    {
        super(world, 0);
        if (world != null)
        {
            initFreightWater();
            this.theTank = LiquidManager.getInstance().new FilteredTank(getTankCapacity(), LiquidManager.dieselFilter());
            dataWatcher.addObject(RollingStockLightStateCodec.WATCHER_SLOT, packLightState());
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void onUpdate()
    {
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
        else
        { if (theTank != null && theTank.getFluid() == null) {
            this.dataWatcher.updateObject(18, 0);
            this.dataWatcher.updateObject(4, 0);
        }
        }

        if (getAmount() > 0) {
            // setColor(getColorFromString("Full"));
            setDefaultMass(-trainSpec.getMass()*4);
            if ((motionX>0.01 || motionZ>0.01) && ticksExisted % 40 == 0) {
                drain(ForgeDirection.UNKNOWN, 8,true);
            }

        } else
        { if (getAmount() <= 0) {
            // setColor(getColorFromString("Empty"));
            setDefaultMass(trainSpec.getMass());
        }
    }

        if (worldObj.isRemote == false)
            {
            synchronizeLightState ();
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

        nbttagcompound.setInteger("tcFrontHeadlightLevel", frontHeadlightLevel.ordinal());
        nbttagcompound.setInteger("tcRearHeadlightLevel", rearHeadlightLevel.ordinal());
        nbttagcompound.setInteger(
            "tcLightChannels",
            RollingStockLightStateCodec.persistentChannels(packLightState()));
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

        JsonObject previousState = new JsonObject();
        if (nbttagcompound.hasKey("lightingDetailsJSON"))
        {
        try {
                JsonElement parsedState = Traincraft.jsonParser.parse(nbttagcompound.getString("lightingDetailsJSON"));
                if (parsedState.isJsonObject())
                {
                    previousState = parsedState.getAsJsonObject();
        }
            }
        catch (JsonParseException ignored)
        {
                // Missing or malformed legacy lighting state migrates to the documented defaults.
            }
        }

        boolean previousLights = jsonBoolean(previousState, "isLightsEnabled", true);
        frontHeadlightLevel =
            nbttagcompound.hasKey("tcFrontHeadlightLevel")
            ? RollingStockHeadlightLevel.fromOrdinal(
                nbttagcompound.getInteger("tcFrontHeadlightLevel"))
            : previousLights
            ? RollingStockHeadlightLevel.BRIGHT
            : RollingStockHeadlightLevel.OFF;
        rearHeadlightLevel =
            nbttagcompound.hasKey("tcRearHeadlightLevel")
            ? RollingStockHeadlightLevel.fromOrdinal(
                nbttagcompound.getInteger("tcRearHeadlightLevel"))
            : RollingStockHeadlightLevel.OFF;
        if (nbttagcompound.hasKey("tcLightChannels"))
        {
            int channels = nbttagcompound.getInteger("tcLightChannels");
            ditchLightsEnabled = (channels & RollingStockLightChannel.DITCH.mask()) != 0;
            beaconEnabled = (channels & RollingStockLightChannel.BEACON.mask()) != 0;
            auxLightsEnabled = (channels & RollingStockLightChannel.AUX.mask()) != 0;
            gyraLightsEnabled = (channels & RollingStockLightChannel.GYRA.mask()) != 0;
        }
        else
        {
            ditchLightsEnabled = jsonByte(previousState, "ditchLightMode", (byte) 1) > 0;
            beaconEnabled = jsonBoolean(previousState, "isBeaconEnabled", true);
        }

        dataWatcher.updateObject(RollingStockLightStateCodec.WATCHER_SLOT, packLightState());
    }

    private void placeInInvent(ItemStack itemstack1) {
        for (int i = 1; i < cargoItems.length; i++) {
            if (cargoItems[i] == null) {
                cargoItems[i] = itemstack1;
                return;
            }
            else
            { if (cargoItems[i] != null && cargoItems[i].getItem() == itemstack1.getItem() && itemstack1.isStackable() && (itemstack1.getHasSubtypes() == false || cargoItems[i].getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(cargoItems[i], itemstack1)) {
                int var9 = cargoItems[i].stackSize + itemstack1.stackSize;
                if (var9 <= itemstack1.getMaxStackSize()) {
                    cargoItems[i].stackSize = var9;

                }
                else
                    { if (cargoItems[i].stackSize < itemstack1.getMaxStackSize()) {
                    cargoItems[i].stackSize += 1;
                }
                    }
                return;
            }
            else
                { if (i == cargoItems.length - 1) {
                entityDropItem(itemstack1,1);
                return;
            }
        }
    }
        }
    }

    public void liquidInSlot(ItemStack itemstack) {
        if (worldObj.isRemote)
        {
            return;
        }
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

    @Override
    public RollingStockHeadlightLevel getFrontHeadlightLevel()
    {
        return worldObj != null && worldObj.isRemote
               ? RollingStockLightStateCodec.front(synchronizedLightState())
               : frontHeadlightLevel;
    }

    @Override

    public RollingStockHeadlightLevel getRearHeadlightLevel()
    {
        return worldObj != null && worldObj.isRemote
               ? RollingStockLightStateCodec.rear(synchronizedLightState())
               : rearHeadlightLevel;
    }

    @Override
    public void setFrontHeadlightLevel(RollingStockHeadlightLevel level)
    {
        frontHeadlightLevel = level == null ? RollingStockHeadlightLevel.OFF : level;
        synchronizeLightState();
    }

    @Override
    public void setRearHeadlightLevel(RollingStockHeadlightLevel level)
    {
        rearHeadlightLevel = level == null ? RollingStockHeadlightLevel.OFF : level;
        synchronizeLightState();
    }

    @Override
    public boolean isLightChannelEnabled(RollingStockLightChannel channel)
    {
        return RollingStockLightStateCodec.enabled(synchronizedLightState(), channel);
    }

    @Override
    public void setLightChannelEnabled(RollingStockLightChannel channel, boolean enabled)
    {
        if (channel == null)
        {
            return;
        }
        switch (channel)
        {
            case HEADLIGHT:
                if (enabled == false)
    {
                    frontHeadlightLevel = RollingStockHeadlightLevel.OFF;
                    rearHeadlightLevel = RollingStockHeadlightLevel.OFF;
    }
                else
                {
                    if(frontHeadlightLevel == RollingStockHeadlightLevel.OFF
                            && rearHeadlightLevel == RollingStockHeadlightLevel.OFF)
    {
                        frontHeadlightLevel = RollingStockHeadlightLevel.BRIGHT;
    }
                }
                break;
            case DITCH:
                ditchLightsEnabled = enabled;
                break;
            case BEACON:
                beaconEnabled = enabled;
                break;
            case AUX:
                auxLightsEnabled = enabled;
                break;
            case GYRA:
                gyraLightsEnabled = enabled;
                break;
            default:
        return;
    }
        synchronizeLightState();
    }

    /** Packs server-owned fields into the stable synchronized representation. */
    private int packLightState()
    {
        return RollingStockLightStateCodec.pack(
                   frontHeadlightLevel,
                   rearHeadlightLevel,
                   ditchLightsEnabled,
                   beaconEnabled,
                   auxLightsEnabled,
                   gyraLightsEnabled);
    }

    /** Reads the watcher on clients and the authoritative fields on the server. */
    private int synchronizedLightState()
    {
        return worldObj != null && worldObj.isRemote
               ? dataWatcher.getWatchableObjectInt(RollingStockLightStateCodec.WATCHER_SLOT)
               : packLightState();
    }

    /** Publishes a server-side control mutation through the stable watcher slot. */
    private void synchronizeLightState()
    {
        if (worldObj != null && worldObj.isRemote == false)
    {
            dataWatcher.updateObject(RollingStockLightStateCodec.WATCHER_SLOT, packLightState());
        }

    }

    private static boolean jsonBoolean(JsonObject object, String key, boolean fallback)
    {
        return object != null && object.has(key) ? object.get(key).getAsBoolean() : fallback;
    }

    private static byte jsonByte(JsonObject object, String key, byte fallback)
    {
        return object != null && object.has(key) ? object.get(key).getAsByte() : fallback;
    }
}
