package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class Dieselgtavthing extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Dieselgtavthing;
    }
    public Dieselgtavthing(World world) {
        super(world, LiquidManager.dieselFilter());
        

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
            new SeatDefinition("driver", 1.375F, 0.15F, -0.0006F, SeatRole.DRIVER)
        };
    }
    

    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "GTAV Locomotive";
    }

    




}