package train.common.api;

import cpw.mods.fml.client.FMLClientHandler;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import org.lwjgl.input.Keyboard;
import train.common.Traincraft;
import train.common.core.handlers.ConfigHandler;
import train.common.core.network.PacketKeyPress;
import train.common.library.GuiIDs;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public abstract class AbstractControlCar extends EntityRollingStock implements IInventory, IPassenger, IRollingStockLightControls {
    private static final int FORWARD_PRESS_KEY = 4;
    private static final int REVERSE_PRESS_KEY = 5;
    private static final int HORN_KEY = 8;
    private static final int BRAKE_PRESS_KEY = 12;
    private static final int FORWARD_RELEASE_KEY = 13;
    private static final int REVERSE_RELEASE_KEY = 14;
    private static final int BRAKE_RELEASE_KEY = 15;

    public Locomotive connectedLocomotive;
    public int whistleDelay;

    //region inventory
    public int inventorySize;
    private int slotsFilled=0;
    protected ItemStack controlCarInventory[];
    public int numCargoSlots;
    public int numCargoSlots1;
    public int numCargoSlots2;
    //endregion inventory

    private boolean forwardPressed = false;
    private boolean backwardPressed = false;
    private boolean brakePressed = false;

    private final RollingStockLightControls lightControls = new RollingStockLightControls(this);
    
    public AbstractControlCar(World world)
    {
        super(world);

        if (world != null)
        {
            numCargoSlots = 3;
            numCargoSlots1 = 3;
            numCargoSlots2 = 3;
            inventorySize = numCargoSlots + numCargoSlots2 + numCargoSlots1 + 1;
            controlCarInventory = new ItemStack[inventorySize];
            lightControls.initialize();
            if (connectedLocomotive == null)
            {
                dataWatcher.addObject(29, 0);
            }
            else
            {
                dataWatcher.addObject(29, connectedLocomotive.getEntityId());
            }
        }
    }

    public abstract SoundRecord getSoundRecord();

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
        writeInventory(nbttagcompound);

        lightControls.write(nbttagcompound);


    }

    private void writeInventory(NBTTagCompound nbttagcompound)
    {
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < controlCarInventory.length; i++) {
            if (controlCarInventory[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                controlCarInventory[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }



    @Override
    protected void readEntityFromNBT(NBTTagCompound ntc)
    {
        super.readEntityFromNBT(ntc);
        readInventory(ntc);

        lightControls.read(ntc);

        lightControls.synchronize();
    }

    private void readInventory(NBTTagCompound ntc)
    {
        NBTTagList nbttaglist = ntc.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        controlCarInventory = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < controlCarInventory.length) {
                controlCarInventory[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    @Override
    public void onUpdate()
    {

        tickStockResponses();

        if (worldObj.isRemote == false)
        {
            //Server side stuff.

            if (cartLinked1 != null) {
                if ((cartLinked1).trainHandler != null && (cartLinked1).trainHandler.getTrains().size() != 0) {
                    for (int j1 = 0; j1 < (cartLinked1).trainHandler.getTrains().size(); j1++) {
                        EntityRollingStock daRollingStock = (cartLinked1).trainHandler.getTrains().get(j1);
                        if (daRollingStock instanceof Locomotive) {
                            connectedLocomotive = (Locomotive) daRollingStock;
                            break;
                        }
                    }
                }

            }
            if (connectedLocomotive == null) {
                dataWatcher.updateObject(29, 0);
            } else {
                dataWatcher.updateObject(29, connectedLocomotive.getEntityId());
            }


        } else
            {
            //Client side stuff.
        }
        handleTrainMovement();
        if (whistleDelay > 0) {
            whistleDelay--;
        }

        super.onUpdate();
        if (!worldObj.isRemote)
        {
            lightControls.synchronize();
        }
    }

    public void soundHorn()
    {
        SoundRecord trainSoundRecord = getSoundRecord();
        if (trainSoundRecord != null && !trainSoundRecord.getHornString().equals(""))
        {
            if (whistleDelay == 0)
            {
                worldObj.playSoundAtEntity(this, Info.resourceLocation + ":" + trainSoundRecord.getHornString(), trainSoundRecord.getHornVolume(), 1.0F);
                whistleDelay = 65;
            }
        }

        List entities = worldObj.getEntitiesWithinAABB(EntityAnimal.class, AxisAlignedBB.getBoundingBox(
                this.posX-20,this.posY-5,this.posZ-20,
                this.posX+20,this.posY+5,this.posZ+20));

        for(Object e : entities) {
            if(e instanceof EntityAnimal) {
                ((EntityAnimal) e).setTarget(this);
                ((EntityAnimal) e).getNavigator().setPath(null, 0);
            }
        }
    }
    @Override
    public void updateRiderPosition() {
        if(riddenByEntity!=null) {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.2, posZ);
        }
    }

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
        {
            System.out.println("UwU");
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.CONTROL_CAR, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    // I'm moving this to a separate function because it's really, really thick, and I want to try
    // to make things look neater.
    public void handleTrainMovement() {
        if (worldObj.isRemote) {
            if (ticksExisted % 2 == 0 && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) {

                if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindForward.getKeyCode())
                        && !forwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(FORWARD_PRESS_KEY));
                    forwardPressed = true;
                } else
                { if (Keyboard
                        .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindForward.getKeyCode()) == false
                        && forwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(FORWARD_RELEASE_KEY));
                    forwardPressed = false;
                }
                }
                if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindBack.getKeyCode())
                        && !backwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(REVERSE_PRESS_KEY));
                    backwardPressed = true;
                } else
                { if (Keyboard
                        .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindBack.getKeyCode()) == false
                        && backwardPressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(REVERSE_RELEASE_KEY));
                    backwardPressed = false;
                }
                }
                if (Keyboard.isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode())
                        && !brakePressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(BRAKE_PRESS_KEY));
                    brakePressed = true;
                } else
                { if (Keyboard
                        .isKeyDown(FMLClientHandler.instance().getClient().gameSettings.keyBindJump.getKeyCode()) == false
                        && brakePressed) {
                    Traincraft.keyChannel.sendToServer(new PacketKeyPress(BRAKE_RELEASE_KEY));
                    brakePressed = false;
                }
            }
        }
        } else {
            //Server stuff.
            if (connectedLocomotive != null) {
                if (forwardPressed || backwardPressed) {

                    if (connectedLocomotive.getFuel() > 0 && connectedLocomotive.isLocoTurnedOn() && rand.nextInt(4) == 0 && !worldObj.isRemote) {
                        if (this.getTrainLockedFromPacket() && !((EntityPlayer) this.riddenByEntity).getDisplayName()
                                .toLowerCase().equals(this.getTransportOwner().toLowerCase())) {
                            return;
                        }
                        if (riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
                            int dir = MathHelper
                                    .floor_double((((EntityPlayer) riddenByEntity).rotationYaw * 4F) / 360F + 0.5D) & 3;
                            //System.out.println(dir);
                            if (dir == 2) {
                                if (forwardPressed) {
                                    connectedLocomotive.motionZ -= 0.0075 * this.accelerate;
                                    //System.out.println("A");
                                } else {
                                    connectedLocomotive.motionZ += 0.0075 * this.accelerate;
                                    //System.out.println("B");
                                }
                            } else
                            { if (dir == 0) {
                                if (forwardPressed) {
                                    connectedLocomotive.motionZ += 0.0075 * this.accelerate;
                                    //System.out.println("C");
                                } else {
                                    connectedLocomotive.motionZ -= 0.0075 * this.accelerate;
                                    //System.out.println("D");
                                }
                            } else
                                { if (dir == 1) {
                                if (forwardPressed) {
                                    connectedLocomotive.motionX -= 0.0075 * this.accelerate;
                                    //System.out.println("E");
                                } else {
                                    connectedLocomotive.motionX += 0.0075 * this.accelerate;
                                    //System.out.println("F");
                                }
                            } else {
                                if (forwardPressed) {
                                    connectedLocomotive.motionX += 0.0075 * this.accelerate;
                                    //System.out.println("G");
                                } else {
                                    connectedLocomotive.motionX -= 0.0075 * this.accelerate;
                                    //System.out.println("H");
                                }
                            }
                        }
                    }
                        }
                    }
                } else
                { if (brakePressed) {
                    connectedLocomotive.motionX *= brake;
                    connectedLocomotive.motionZ *= brake;
                }
            }
        }

    }
    }

    @Override
    public void keyHandlerFromPacket(int key) {
        if (this.getTrainLockedFromPacket()) {
            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer
                    && ((EntityPlayer) this.riddenByEntity).getDisplayName().toLowerCase()
                    .equals(this.getTransportOwner().toLowerCase()) == false) {
                return;
            }
        }
        pressKey(key);
        if (key == HORN_KEY) {
            triggerHornResponse();
            if (ConfigHandler.SOUNDS) {
                soundHorn();
            }
        }
        if (key == FORWARD_PRESS_KEY) {
            forwardPressed = true;
        }
        if (key == REVERSE_PRESS_KEY) {
            backwardPressed = true;
        }
        if (key == BRAKE_PRESS_KEY) {
            brakePressed = true;
        }
        if (key == FORWARD_RELEASE_KEY) {
            forwardPressed = false;
        }
        if (key == REVERSE_RELEASE_KEY) {
            backwardPressed = false;
        }
        if (key == BRAKE_RELEASE_KEY) {
            brakePressed = false;
        }
    }

    public int getLocomotiveBeingControlledEntityID()
    {
        return dataWatcher.getWatchableObjectInt(29);
    }

    /** Returns the shared control owner; stock without mutable controls allocates none. */
    @Override
    protected RollingStockLightControls mutableLightControls()
    {
        return lightControls;
    }

    @Override
    public RollingStockHeadlightLevel getFrontHeadlightLevel()
    {
        return lightControls.getFrontHeadlightLevel();
    }

    @Override
    public RollingStockHeadlightLevel getRearHeadlightLevel()
    {
        return lightControls.getRearHeadlightLevel();
    }

    @Override
    public void setFrontHeadlightLevel(RollingStockHeadlightLevel level)
    {
        lightControls.setFrontHeadlightLevel(level);
    }

    @Override
    public void setRearHeadlightLevel(RollingStockHeadlightLevel level)
    {
        lightControls.setRearHeadlightLevel(level);
    }

    @Override
    public boolean isLightChannelEnabled(RollingStockLightChannel channel)
    {
        return lightControls.isLightChannelEnabled(channel);
    }

    @Override
    public boolean isLightChannelManuallyEnabled(RollingStockLightChannel channel)
    {
        return lightControls.isLightChannelManuallyEnabled(channel);
    }

    @Override
    public boolean isEmergencyLightForced()
    {
        return lightControls.isEmergencyLightForced();
    }

    @Override
    public void setLightChannelEnabled(RollingStockLightChannel channel, boolean enabled)
    {
        lightControls.setLightChannelEnabled(channel, enabled);
    }

    @Override
    public boolean isTransientLightSignalEnabled(RollingStockTransientLightSignal signal)
    {
        return lightControls.isTransientLightSignalEnabled(signal);
    }




    //region Implement IInventory
    @Override
    public int getSizeInventory()
    {
        return inventorySize;
    }

    @Override
    public void markDirty() { }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public void openInventory() {
    }

    @Override
    public void closeInventory() {
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public ItemStack[] getInventory() {
        return controlCarInventory;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return controlCarInventory[i];
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if (this.controlCarInventory[par1] != null) {
            ItemStack var2 = this.controlCarInventory[par1];
            this.controlCarInventory[par1] = null;
            return var2;
        } else {
            return null;
        }
    }

    @Override
    public ItemStack decrStackSize(int i, int j) {
        if (controlCarInventory[i] != null) {
            if (controlCarInventory[i].stackSize <= j) {
                ItemStack itemstack = controlCarInventory[i];
                controlCarInventory[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = controlCarInventory[i].splitStack(j);
            if (controlCarInventory[i].stackSize == 0) {
                controlCarInventory[i] = null;
            }
            return itemstack1;

        } else {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemstack) {
        controlCarInventory[i] = itemstack;
        if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
        {
            itemstack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName()
    {
        return getCommandSenderName();
    }

    //endregion Implement IInventory
}
