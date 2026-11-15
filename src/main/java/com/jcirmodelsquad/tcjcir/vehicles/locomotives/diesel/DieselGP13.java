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

public class DieselGP13 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP13;
    }
    public DieselGP13(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(9, "Avanste Northeastern (Late) (Bida Fictional)"/*, LockoutGroup.ANE*/);
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
            new SeatDefinition("driver", 0.5F, 0.15F, 0.0892F, SeatRole.DRIVER)
        };
    }

    @Override
    public String getInventoryName() {
        return "EMD GP13";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1.14F);
    }
}