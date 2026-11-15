package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselTGVmobile extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselTGVMobile;
    }
    public DieselTGVmobile(World world) {
        super(world, LiquidManager.dieselFilter());

    }




    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 0.6906F, -0.2F, 0F, SeatRole.DRIVER)
        };
    }
    

    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.0F;
    }



    @Override
    public String getInventoryName() {
        return "TGV Highrail Van Thing";
    }

    

}
