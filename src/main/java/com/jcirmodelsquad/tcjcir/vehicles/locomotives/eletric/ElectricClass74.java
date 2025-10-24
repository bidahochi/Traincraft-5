package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class ElectricClass74 extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricClass74;
    }
    public ElectricClass74(World world) {
        super(world);
        InsertTexture(0, "BR");
        InsertTexture(1, "SPR", LockoutGroup.SPR);
        InsertTexture(2, "GCM");
        InsertTexture(3, "CRL");
        InsertTexture(4, "CRL (Phase 2)");
    }

    public ElectricClass74(World world, double d, double d1, double d2) {
        this(world);
        setPosition(d, d1 + (double) yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d ;
        prevPosY = d1;
        prevPosZ = d2;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.65, 0.08, 0.25); }



    

    



    @Override
    public String getInventoryName() {
        return "Class 74";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.2F;
    }


    
}
