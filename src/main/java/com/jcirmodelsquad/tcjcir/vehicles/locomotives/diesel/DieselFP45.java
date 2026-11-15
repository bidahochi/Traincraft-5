package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselFP45 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFP45;
    }
    public DieselFP45(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "THE MILWAUKEE ROAD");
        InsertTexture(1, "THE MILWAUKEE ROAD");
        InsertTexture(2, "ATSF (Warbonnet w/ Large letters)");
        InsertTexture(3, "ATSF (Warbonnet w/ Small letters)");
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
            new SeatDefinition("driver", 1.6344F, 0.3F, 0F, SeatRole.DRIVER)
        };
    }
    

    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String transportYear() {
        return "1967-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD FP45";
    }

    




}