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
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;


public class DieselCE8 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCE8;
    }
    public DieselCE8(World world) {
        super(world, EnumTrains.CE8.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "FNCC 99 (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "Nomansi Sugar Cane Corperation");
        InsertTexture(2, "Blandsville & Blankerston (No Dynamics)");
        InsertTexture(3, "Blandsville & Blankerston (Dynamics)");
        InsertTexture(4, "L&W", LockoutGroup.LW);
    }
    public DieselCE8(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.16, -0.35); }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }



    @Override
    public String getInventoryName() {
        return "CEE CE8";
    }

    


    

}
