package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;


public class DieselSW9 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW9;
    }
    public DieselSW9(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Western Pacific (As delivered)");
        InsertTexture(1, "Western Pacific");
        InsertTexture(2, "Western Pacific (Late)");
        InsertTexture(3, "Conrail");
        InsertTexture(4, "Apalachicola Northern");
        InsertTexture(5, "Blandsville & Blankerston");
        InsertTexture(6, "Southern");
    }

    @Override
    public float transportMetricHorsePower()
    {
        return 1200;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1950-1953";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW900";
    }

    @Override
    public int getTankCapacity()
    {
        return 8000;
    }

    
    

}
