package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselFOLM1B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFOLM1B;
    }
    public DieselFOLM1B(World world) {
        super(world, LiquidManager.dieselFilter());

    }

    @Override
    public String transportCountry()
    {
        return "CZ";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.0969F, 0.35F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public String getInventoryName() {
        return "FOL-M1B";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1F);
    }
}