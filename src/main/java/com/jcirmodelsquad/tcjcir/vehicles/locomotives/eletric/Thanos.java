package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;
//package train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class Thanos extends ElectricTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Thanos;
    }
    public Thanos(World world) {
        super(world);
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", -0.5812F, 0.1F, 0.1847F, SeatRole.DRIVER)
        };
    }




    @Override
    public String getInventoryName() {
        return "Thanos Cart";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 0.53F;
    }

    @Override
    public boolean isFictional()
    {
        return true;
    }
}