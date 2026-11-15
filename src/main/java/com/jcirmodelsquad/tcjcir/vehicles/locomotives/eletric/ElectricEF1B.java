package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricEF1B extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricEF1B;
    }
    public ElectricEF1B(World world) {
        super(world);
    }
    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.72115F, 0.25F, 0F, SeatRole.DRIVER)
        };
    }



    





    @Override
    public String getInventoryName() {
        return "GE MILW EF-1B";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1875F;
    }


    
}
