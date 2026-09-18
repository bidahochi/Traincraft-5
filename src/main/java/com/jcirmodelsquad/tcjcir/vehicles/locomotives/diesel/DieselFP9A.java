package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselFP9A extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFP9A;
    }
    public DieselFP9A(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the benis sus
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.19, -0.35); }

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.9F;
    }

    @Override
    public String transportYear() {
        return "1953-1960";
    }

    @Override
    public String getInventoryName() {
        return "EMD FP9A";
    }

    
    



}
