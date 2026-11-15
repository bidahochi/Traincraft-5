package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselBoxcab23Ton extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselBoxcab23Ton;
    }
    public DieselBoxcab23Ton(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //i think i need a scooby doo tie-fighter now

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
            new SeatDefinition("driver", 0.55F, 0.17F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.7F;
    }

    @Override
    public String transportYear() {
        return "1939";
    }

    @Override
    public String getInventoryName() {
        return "GE 23 Ton Boxcab";
    }
}
