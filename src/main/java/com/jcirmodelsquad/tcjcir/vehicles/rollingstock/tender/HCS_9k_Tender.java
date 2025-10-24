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
import train.common.enums.LockoutGroup;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class HCS_9k_Tender extends Tender  {
    
    

    public HCS_9k_Tender(World world) {
        super(world, FluidRegistry.WATER, 0, EnumTrains.HCS_9k_Tender.getTankCapacity(), LiquidManager.WATER_FILTER);
       
        InsertTexture(0, "Blank");
        InsertTexture(1, "SPMW");
        InsertTexture(2, "Southern Pacific (Lines Lettering)");
        InsertTexture(3, "Southern Pacific");
        InsertTexture(4, "Herber Valley 618");
        InsertTexture(5, "Union Pacific (Late)");
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
    public String getInventoryName() {
        return "UP - SP 9000 Gallon Tender";
    }

    

    

    @Override
    public boolean canBeRidden() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }

    
}