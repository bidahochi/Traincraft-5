package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselBeep extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselBeep;
    }
    public DieselBeep(World world) {
        super(world, LiquidManager.dieselFilter());

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
            new SeatDefinition("driver", -1.4688F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public String getInventoryName() {
        return "ATSF Beep";
    }

    @Override
    public String transportYear() {
        return "1943";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1.05F);
    }


    



}
