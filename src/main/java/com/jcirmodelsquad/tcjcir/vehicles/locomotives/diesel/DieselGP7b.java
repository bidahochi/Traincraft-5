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

public class DieselGP7b extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7b;
    }
    public DieselGP7b(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Avanste Northeastern (Bida Fictional)"/*, LockoutGroup.ANE*/);
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
            new SeatDefinition("driver", 1.0812F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1949-1954";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP7b";
    }


}