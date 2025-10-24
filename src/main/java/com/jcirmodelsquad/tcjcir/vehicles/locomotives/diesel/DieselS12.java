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


public class DieselS12 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselS12;
    }
    public DieselS12(World world) {
        super(world, EnumTrains.S12.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "Amador Central Railroad");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Latrans Range Railroad", LockoutGroup.LRR);
        InsertTexture(3, "hamburger helper railroad");
        InsertTexture(4, "DDVR 30 & 31");
        InsertTexture(5, "FMSR", LockoutGroup.FMSR);
        InsertTexture(6, "OC&G (Ex FMSR 164)");
        InsertTexture(7, "Monongahela");
        InsertTexture(8, "SP Tigerstripe");
    }
    public DieselS12(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.3, 0.2, -0.37); }








    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F;
    }



    @Override
    public String getInventoryName() {
        return "BLH S12 (606A)";
    }

}
