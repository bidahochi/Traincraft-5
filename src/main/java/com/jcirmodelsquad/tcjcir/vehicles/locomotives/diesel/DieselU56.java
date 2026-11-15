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

public class DieselU56 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU56;
    }
    public DieselU56(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
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
            new SeatDefinition("driver", 3.1469F, 0.4F, 0.3F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.8F; }

    @Override
    public String getInventoryName() {
        return "CEE U56";
    }

    @Override
    public boolean isFictional() {
        return true;
    }


}