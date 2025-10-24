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


public class DieselFAFDL extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFAFDL;
    }
    public DieselFAFDL(World world) {
        super(world, EnumTrains.FAFDL.getTankCapacity(), LiquidManager.dieselFilter());
        
        InsertTexture(0, "FMSR", LockoutGroup.FMSR);
        InsertTexture(1, "Blandsville & Blankerston (Early FAFDL)");
        InsertTexture(2, "Blandsville & Blankerston (Late FAFDL)");
        InsertTexture(3, "");
    }
    public DieselFAFDL(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.72, 0.13, -0.35); }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.93F;
    }

    

    @Override
    public String getInventoryName() {
        return "CEE FA-FDL";
    }

    

    
    

}
