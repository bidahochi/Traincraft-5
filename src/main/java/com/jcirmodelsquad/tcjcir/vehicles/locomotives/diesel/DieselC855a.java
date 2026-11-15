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

public class DieselC855a extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselC855a;
    }
    public DieselC855a(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(2, "Great Lakes & Northern Territories");
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
            new SeatDefinition("driver", 3.0344F, 0.4F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.9F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo C855a";
    }

    @Override
    public String transportYear() {
        return "1964";
    }
}
