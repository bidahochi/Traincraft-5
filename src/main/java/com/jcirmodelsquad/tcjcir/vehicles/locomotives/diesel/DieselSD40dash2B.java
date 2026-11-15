package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD40dash2B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40dash2B;
    }
    public DieselSD40dash2B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(1, "");
        InsertTexture(0, "FURRX (Ex-CSWR)");
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
            new SeatDefinition("driver", 1.4688F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }


    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String transportYear() {
        return "1972-1989";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD40-2B";
    }


    



}
