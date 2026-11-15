package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricEF1 extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricEF1;
    }
    public ElectricEF1(World world) {
        super(world);
    }
    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.9625F, 0.25F, 0.0306F, SeatRole.DRIVER)
        };
    }

    
    @Override
    public String getInventoryName() {
        return "GE MILW EF-1";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.135F;
    }


    
}
