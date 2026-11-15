package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselHighrailTruck extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselHighrailTruck;
    }
    public DieselHighrailTruck(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //apparently, the reason "world" was red was cus it needed the tank capacity thingg from something else, so iDk reER
    }
    

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 0.4688F, -0.1F, 0F, SeatRole.DRIVER)
        };
    }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }



    @Override
    public String getInventoryName() {
        return "Generic Highrail Truck";
    }

    

}
