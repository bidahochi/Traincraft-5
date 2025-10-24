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


public class DieselCF7_H_Angle extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.CF7_H_Angle;
    }

    public DieselCF7_H_Angle(World world) {
        super(world, EnumTrains.CF7angle.getTankCapacity(), LiquidManager.dieselFilter());

        //InsertTexture(0, "Denver SUCK MY FUCKIN BALLS cock sucker island (stupid) mofo Volkswagon 1083 deez nuts express");

    }
    public DieselCF7_H_Angle(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 1.9, 0); }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.95F;
    }



    @Override
    public String getInventoryName() {
        return "CF7 Anglecab (Heritage Model)";
    }

    

    
    

}
