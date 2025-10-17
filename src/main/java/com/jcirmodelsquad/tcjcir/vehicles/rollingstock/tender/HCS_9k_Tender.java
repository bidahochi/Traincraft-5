package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class HCS_9k_Tender extends Tender implements IInventory {
    public int freightInventorySize;
    public int numFreightSlots;

    public HCS_9k_Tender(World world) {
        super(world, FluidRegistry.WATER, 0, EnumTrains.HCS_9k_Tender.getTankCapacity(), LiquidManager.WATER_FILTER);
        initFreightTender();
    }

    public void initFreightTender() {
        freightInventorySize = 16;
        tenderItems = new ItemStack[freightInventorySize];
    }

    public HCS_9k_Tender(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + (double) yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    

    @Override
    public void onUpdate() {
        super.onUpdate();
        checkInvent(tenderItems[0], this);
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);

        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < tenderItems.length; i++) {
            if (tenderItems[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                tenderItems[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        tenderItems = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < tenderItems.length) {
                tenderItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }
    @Override
    public String getInventoryName() {
        return "UP - SP 9000 Gallon Tender";
    }

    @Override
    public int getSizeInventory() {
        return freightInventorySize;
    }

    

    @Override
    public boolean canBeRidden() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

    @Override
    public boolean isItemValidForSlot(int i, ItemStack itemstack) {
        return true;
    }
}