package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselP32 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselP32;
    }
    public DieselP32(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Metro North");
        InsertTexture(1, "Metro North (New Haven)");
        InsertTexture(2, "Amtrak (Empire Service)");
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
        return "1995-2001";
    }

    @Override
    public String getInventoryName() {
        return "Ge P40-P42";
    }






}
