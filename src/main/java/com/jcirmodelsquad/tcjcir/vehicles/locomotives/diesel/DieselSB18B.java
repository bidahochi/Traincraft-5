package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSB18B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSB18B;
    }
    public DieselSB18B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CEE Factory Blank (Phase 1)");
        InsertTexture(1, "TTLC (Alaskan Moss)");
        InsertTexture(2, "TTLC (Coronado Moss)");
        InsertTexture(3, "TTLC (Pond Moss)");
        InsertTexture(4, "TTLC (Turtle Moss)");
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
            new SeatDefinition("driver", 1.3F, 0.2F, 0.0003F, SeatRole.DRIVER)
        };
    }

    @Override
    public String transportYear() {
        return "1981-1989";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "CEE SB18B";
    }



}
