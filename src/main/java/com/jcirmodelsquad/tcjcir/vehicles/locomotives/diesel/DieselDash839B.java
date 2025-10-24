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

public class DieselDash839B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash839B;
    }
    public DieselDash839B(World world) {
        super(world, EnumTrains.Dash839B.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Southern Pacific");
        InsertTexture(1, "LMX (1990s)");
        InsertTexture(2, "Western Pacific (Early)");
        InsertTexture(3, "Western Pacific (Late)");
        InsertTexture(4, "Western Pacific (OLS)");
        InsertTexture(5, "Blandsville & Blankerston");
        InsertTexture(6, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(7, "North Fox (KIT-80)", LockoutGroup.FNCC);
        InsertTexture(8, "CEEX 90s Lease Scheme");

    }
    public DieselDash839B(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.25, -0.35); }




    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE B39-8";
    }

    


    

}
