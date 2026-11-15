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

public class DieselDash818BE extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash818BE;
    }
    public DieselDash818BE(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FNCC (Kit-L)", LockoutGroup.FNCC);
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
            new SeatDefinition("driver", 1.575F, 0.25F, 0.3546F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String getInventoryName() {
        return "GE B18-8E";
    }

    @Override
    public String transportYear() {
        return "1987";
    }

    @Override
    public boolean isFictional(){
        return true;
    }



}