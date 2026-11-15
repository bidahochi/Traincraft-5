package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU18BB extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18BB;
    }
    public DieselU18BB(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(10, "");
        InsertTexture(0, "West Creek Pacific");
        InsertTexture(1, "Gaesburg Clinton & Midland");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.3204F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String transportYear() {
        return "1973-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U18B B-Unit";
    }


}
