package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD40dash3 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40dash3;
    }
    public DieselSD40dash3(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "CSXT (RCO Equipped)");
        InsertTexture(1, "CSXT");
        InsertTexture(2, "Ann Arbor");
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
            new SeatDefinition("driver", 1.3531F, 0.2F, 0.3497F, SeatRole.DRIVER)
        };
    }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "2011-Present";
    }

    @Override
    public String getInventoryName() {
        return "CSX SD40-3";
    }


    



}
