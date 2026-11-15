package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselC425 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselC425;
    }
    public DieselC425(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Penn Central");
        InsertTexture(1, "Chicago Northwestern");
        InsertTexture(2, "Spokane, Portland & Seattle");
        InsertTexture(3, "Burlington Northern");
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
            new SeatDefinition("driver", 1.6F, 0.2F, 0.3503F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo C425";
    }

    @Override
    public String transportYear() {
        return "1964-1966";
    }
}
