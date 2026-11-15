package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselF40PH extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF40PH;
    }
    public DieselF40PH(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Amtrak (Phase III)");
        InsertTexture(1, "Amtrak (Phase IV)");
        InsertTexture(2, "Amtrak (Phase II)");
        InsertTexture(3, "VIA Rail");
        InsertTexture(4, "JCTransit");

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
            new SeatDefinition("driver", 1.4531F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }


    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.0F;
    }


    @Override
    public String transportYear() {
        return "1975-1988";
    }

    @Override
    public String getInventoryName() {
        return "EMD F40PH";
    }

    
    



}
