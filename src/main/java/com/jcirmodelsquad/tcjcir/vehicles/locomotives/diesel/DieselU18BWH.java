package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselU18BWH extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18BWH;
    }
    public DieselU18BWH(World world) {
        super(world, EnumTrains.U18BWH.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Amtrak (PH1)");
        InsertTexture(1, "Amtrak (Low Clearance NEC Edition)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Galesburg Clinton & Midland");
    }
    public DieselU18BWH(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }



    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.3, 0.25, -0.35); }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }



    @Override
    public String getInventoryName() {
        return "GE U18B(W)H";
    }

    

    
    

}
