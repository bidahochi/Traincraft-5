package com.jcirmodelsquad.tcjcir.vehicles.locomotives.foxdrives;

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
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselWorkdayHyrail extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselWorkdayHyrail;
    }
    public DieselWorkdayHyrail(World world) {
        super(world, EnumTrains.WorkdayHyrail.getTankCapacity(), LiquidManager.dieselFilter());
        InsertTexture(0, "Generic");
        InsertTexture(1, "CSXT");
        InsertTexture(2, "FNCC MOW", LockoutGroup.FNCC);
        InsertTexture(3, "WP/NEP MOW");
        InsertTexture(4, "GLC");
        InsertTexture(5, "CRIP");
        InsertTexture(6, "GCM");
    }
    public DieselWorkdayHyrail(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 1.3, -0.4, 0.30); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.6F;
    }

    

    @Override
    public String getInventoryName() {
        return "1980 Pine Workday Hi-rail Truck";
    }


}
