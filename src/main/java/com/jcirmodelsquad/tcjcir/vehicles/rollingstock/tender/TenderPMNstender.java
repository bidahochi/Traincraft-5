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

public class TenderPMNstender extends Tender  {
    
    

    public TenderPMNstender(World world) {
        super(world, FluidRegistry.WATER, 0, EnumTrains.PMNstender.getTankCapacity(), LiquidManager.WATER_FILTER);
       
        InsertTexture(0, "Pere Marquette");
        InsertTexture(1, "C&O Early");
        InsertTexture(2, "C&O Late");
        InsertTexture(3, "Polar Express");
    }

    

    public TenderPMNstender(World world, double d, double d1, double d2) {
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
        return "PM N Series Tender";
    }

    

    

    @Override
    public boolean canBeRidden() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.165F;
    }

    
}