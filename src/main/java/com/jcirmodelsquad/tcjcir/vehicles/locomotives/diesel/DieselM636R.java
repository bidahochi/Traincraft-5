package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM636R extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM636R;
    }
    public DieselM636R(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CN (Noodle)");
        InsertTexture(1, "CN (Stripes)");
        InsertTexture(2, "Blandsville & Blankerston");

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
            new SeatDefinition("driver", 2.0531F, 0.25F, 0.4F, SeatRole.DRIVER)
        };
    }
    

    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW M636 (Round End)";
    }


    



}
