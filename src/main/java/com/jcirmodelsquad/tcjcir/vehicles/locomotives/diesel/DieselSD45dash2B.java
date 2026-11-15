package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD45dash2B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD45dash2B;
    }
    public DieselSD45dash2B(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "ATSF (Pinstripe)");
        InsertTexture(1, "ATSF (Freightbonnet)");
        InsertTexture(2, "ATSF (Kodachrome)");
        InsertTexture(3, "ATSF (Bicentennial)");
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
            new SeatDefinition("driver", 1.6688F, 0.3F, 0F, SeatRole.DRIVER)
        };
    }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String transportYear() {
        return "1972-1974";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD45-2";
    }






}
