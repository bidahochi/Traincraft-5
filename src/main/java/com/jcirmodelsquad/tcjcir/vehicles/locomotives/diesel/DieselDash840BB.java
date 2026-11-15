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

public class DieselDash840BB extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash840BB;
    }
    public DieselDash840BB(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF");
        InsertTexture(1, "North Fox (Early)", LockoutGroup.FNCC);
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
            new SeatDefinition("driver", 1.7F, 0.3F, -0.0003F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1988-1992";
    }

    @Override
    public String getInventoryName() {
        return "GE Dash 8-40B B-Unit";
    }


}
