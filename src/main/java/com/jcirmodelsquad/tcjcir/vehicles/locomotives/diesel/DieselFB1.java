package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselFB1 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFB1;
    }
    public DieselFB1(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "New Haven");
        InsertTexture(1, "New Haven 2");
        InsertTexture(2, "Lehigh Valley");
        InsertTexture(3, "Reading");
        InsertTexture(4, "Great Northern");
        InsertTexture(5, "Great Northern (Solid)");
        InsertTexture(6, "Lehigh & New England");
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
            new SeatDefinition("driver", 1.45F, -0.08F, 0F, SeatRole.DRIVER)
        };
    }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.96F;
    }



    @Override
    public String getInventoryName() {
        return "Alco FB-1";
    }

    


}
