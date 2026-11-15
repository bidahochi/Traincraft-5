package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselHHgregg extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselHHGregg;
    }
    public DieselHHgregg(World world) {
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
            new SeatDefinition("driver", -1.2F, 0.1F, 0F, SeatRole.DRIVER)
        };
    }

    



    

    




    @Override
    public String getInventoryName() {
        return "hhhgregg, Panasonic Blu-ray nintey-nine dollars, thirty-two inch LCD TV two-nintey nine, LG fourty-two inch HD TV only four eighty-nine, everything on sale during chirstmas";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1F);
    }
    




}
