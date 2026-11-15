package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselC855b extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselC855b;
    }
    public DieselC855b(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(2, "Great Lakes & Northern Territories"); // "Great Ligma & Northern Tiddies"
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
            new SeatDefinition("driver", 3.05F, 0.4F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.9F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo C855b";
    }

    @Override
    public String transportYear() {
        return "1964";
    }
}
