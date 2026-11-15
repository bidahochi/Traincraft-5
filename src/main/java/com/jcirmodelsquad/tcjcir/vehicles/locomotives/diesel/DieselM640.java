package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM640 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM640;
    }
    public DieselM640(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "CPRail 4744");
        InsertTexture(1, "CPRail 4744 (AC Convertible)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Kingsland Rail");
        InsertTexture(4, "Kingsland Rail");
        InsertTexture(5, "Kingsland Rail");

    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }


    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.0922F, 0.25F, 0.4F, SeatRole.DRIVER)
        };
    }
    

    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW M640";
    }


}
