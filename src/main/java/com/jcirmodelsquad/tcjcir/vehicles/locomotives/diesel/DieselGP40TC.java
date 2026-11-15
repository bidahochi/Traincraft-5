package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP40TC extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP40TC;
    }
    public DieselGP40TC(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "GO Transit");
        InsertTexture(1, "Amtrak");
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
            new SeatDefinition("driver", 1.6562F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }
    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1966";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP40TC";
    }

    



}
