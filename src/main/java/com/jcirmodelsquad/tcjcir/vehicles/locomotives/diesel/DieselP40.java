package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselP40 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselP40;
    }
    public DieselP40(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "Amtrak Phase III");
        InsertTexture(1, "Amtrak Phase V");
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
            new SeatDefinition("driver", 2.0219F, 0.32F, 0F, SeatRole.DRIVER)
        };
    }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String transportYear() {
        return "1993";
    }

    @Override
    public String getInventoryName() {
        return "Ge P40";
    }


    



}
