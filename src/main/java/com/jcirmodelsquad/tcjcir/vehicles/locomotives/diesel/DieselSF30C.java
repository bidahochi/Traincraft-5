package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSF30C extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSF30C;
    }
    public DieselSF30C(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF (Freightbonnet)");
        InsertTexture(1, "ATSF (Kodachrome)");
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
            new SeatDefinition("driver", 1.8922F, 0.3F, 0F, SeatRole.DRIVER)
        };
    }






    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1F;
    }

    @Override
    public String transportYear() {
        return "1985-1986";
    }

    @Override
    public String getInventoryName() {
        return "GE SF30C";
    }

    




}
