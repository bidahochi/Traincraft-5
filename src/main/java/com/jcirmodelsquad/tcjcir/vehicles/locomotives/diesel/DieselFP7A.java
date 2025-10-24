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


public class DieselFP7A extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFP7A;
    }
    public DieselFP7A(World world) {
        super(world, EnumTrains.FP7A.getTankCapacity(), LiquidManager.dieselFilter());

        //when the benis sus
        InsertTexture(0, "Readding a fucking book");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Flatiron Northwestern");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Western Pacific");
        InsertTexture(5, "Joblogh Rail Network");
        InsertTexture(6, "Great Lakes & Northern Territories");
    }
    public DieselFP7A(World world, double d, double d1, double d2){
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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.19, -0.35); }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.9F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD FP7A";
    }

    

    
    

}
