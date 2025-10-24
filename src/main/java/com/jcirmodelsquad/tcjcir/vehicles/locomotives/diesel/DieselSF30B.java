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

public class DieselSF30B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSF30B;
    }
    public DieselSF30B(World world) {
        super(world, EnumTrains.SF30B.getTankCapacity(), LiquidManager.dieselFilter());

        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "MKM Leasing");
        InsertTexture(2, "CNRC 1000 & 1001 (Ex MKM)", LockoutGroup.CNRC);
        InsertTexture(3, "ATSF 7200 (Early)");
        InsertTexture(4, "ATSF 6149 (Mid)");
        InsertTexture(5, "ATSF 6419 (Late)");
        InsertTexture(6, "BNSF 4276 (Ex ATSF)");
        InsertTexture(7, "Minnesota Commerical 42 (Patch)");
        InsertTexture(8, "Minnesota Commerical 42");
    }
    public DieselSF30B(World world, double d, double d1, double d2){
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
        return "ATSF SF30B";
    }

    

    
    

}
