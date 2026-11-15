package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class BigMeme extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.BigMeme;
    }
    public BigMeme(World world) {
        super(world);
    }
    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", -0.25F, 0.25F, 0F, SeatRole.DRIVER)
        };
    }


    @Override
    public String getInventoryName() {
        return "Leslie A-425 Trailer";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.8F;
    }

    
    
}
