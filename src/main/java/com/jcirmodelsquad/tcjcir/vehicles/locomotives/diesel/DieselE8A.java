package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselE8A extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselE8A;
    }
    public DieselE8A(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the benis sus
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
            new SeatDefinition("driver", 1.7906F, 0.19F, 0F, SeatRole.DRIVER)
        };
    }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.16F;
    }

    @Override
    public String transportYear() {
        return "1949-1954";
    }

    @Override
    public String getInventoryName() {
        return "EMD E8A";
    }


    


}
