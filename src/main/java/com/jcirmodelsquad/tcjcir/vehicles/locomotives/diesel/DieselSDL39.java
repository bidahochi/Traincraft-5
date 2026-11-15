package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSDL39 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSDL39;
    }
    public DieselSDL39(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "MILW");
        InsertTexture(1, "MILW");
        InsertTexture(2, "MILW");
        InsertTexture(3, "WC");
        InsertTexture(4, "WFR");
        InsertTexture(5, "WFR (JCIR 6 Years)");

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
            new SeatDefinition("driver", 1.2F, 0.2F, 0.0003F, SeatRole.DRIVER)
        };
    }
    

    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1F;
    }

    @Override
    public String transportYear() {
        return "1969-1972";
    }

    @Override
    public String getInventoryName() {
        return "EMD SDL39";
    }







}
