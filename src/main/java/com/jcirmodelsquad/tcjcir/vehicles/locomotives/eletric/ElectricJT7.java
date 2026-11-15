package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricJT7 extends ElectricTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricJT7;
    }
    public ElectricJT7(World world) {
        super(world);
    }
    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.0078F, 0.3F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public String getInventoryName() {
        return "CEE JT-7 'Pignose'";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.7F;
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public String transportYear() {
        return "1948, 1952-1960";
    }


}
