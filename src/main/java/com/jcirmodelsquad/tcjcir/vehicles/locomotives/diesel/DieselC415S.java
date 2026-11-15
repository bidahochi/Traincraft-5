package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselC415S extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselC415S;
    }
    public DieselC415S(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Burlington Northern");
        InsertTexture(1, "Spokane, Portland & Seattle");
        InsertTexture(2, "GRN");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "ANW (not to be confused with ANE)");
        InsertTexture(5, "ANW (Chevrons)");
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
            new SeatDefinition("driver", -0.2812F, 0.4F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo C415";
    }

    @Override
    public String transportYear() {
        return "1966-1968";
    }
}
