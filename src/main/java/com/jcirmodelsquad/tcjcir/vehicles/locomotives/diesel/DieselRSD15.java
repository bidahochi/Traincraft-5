package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselRSD15 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRSD15;
    }
    public DieselRSD15(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "FURRX (EX CSWR)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.2312F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }



    @Override
    public String getInventoryName() {
        return "ALCo RSD-15";
    }


    



}
