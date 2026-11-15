package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM636 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM636D;
    }
    public DieselM636(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FCP (Small Words)");
        InsertTexture(1, "FCP (Big Letters)");
        InsertTexture(2, "FCP (but its BLUe)");
        InsertTexture(3, "FCP (Southern Pacific Obsession)");
        InsertTexture(4, "Blandsville & Blankerston");

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
            new SeatDefinition("driver", 2.0691F, 0.25F, 0.4F, SeatRole.DRIVER)
        };
    }








    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }



    @Override
    public String getInventoryName() {
        return "MLW M636 (Divot End)";
    }

    
    

}
