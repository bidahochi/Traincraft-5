package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricEP1A extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricEP1A;
    }
    public ElectricEP1A(World world) {
        super(world);
    }
    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.9312F, 0.25F, 0.0013F, SeatRole.DRIVER)
        };
    }

    

    





    @Override
    public String getInventoryName() {
        return "GE MILW EP-1A";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.125F;
    }


    
}