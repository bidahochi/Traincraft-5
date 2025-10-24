package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;
//package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class Thanos extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Thanos;
    }
    public Thanos(World world) {
        super(world);
    }

    public Thanos(World world, double d, double d1, double d2) {
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
    public void updateRiderPosition() {
        if(riddenByEntity==null){return;}
        riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.10F, posZ);
    }




    @Override
    public String getInventoryName() {
        return "Thanos Cart";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.53F;
    }


    
}