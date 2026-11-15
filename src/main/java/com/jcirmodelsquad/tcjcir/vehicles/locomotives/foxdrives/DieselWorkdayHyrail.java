package com.jcirmodelsquad.tcjcir.vehicles.locomotives.foxdrives;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselWorkdayHyrail extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselWorkdayHyrail;
    }
    public DieselWorkdayHyrail(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "Generic");
        InsertTexture(1, "CSXT");
        InsertTexture(2, "FNCC MOW", LockoutGroup.FNCC);
        InsertTexture(3, "WP/NEP MOW");
        InsertTexture(4, "GLC");
        InsertTexture(5, "CRIP");
        InsertTexture(6, "GCM", train.common.enums.LockoutGroup.GCM); 
    }


    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 0.3469F, -0.4F, -0.2844F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.6F;
    }

    

    @Override
    public String getInventoryName() {
        return "1980 Pine Workday Hi-rail Truck";
    }

}
