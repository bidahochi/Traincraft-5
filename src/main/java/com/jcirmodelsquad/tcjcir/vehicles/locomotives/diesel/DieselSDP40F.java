package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSDP40F extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSDP40F;
    }
    public DieselSDP40F(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "EMD");
        InsertTexture(1, "Amtrak (Phase III)");
        InsertTexture(2, "Amtrak (Phase I)");
        InsertTexture(3, "Amtrak (Phase II)");
        InsertTexture(4, "ATSF (Frieghtbonnet)");
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
            new SeatDefinition("driver", 1.65F, 0.3F, 0F, SeatRole.DRIVER)
        };
    }




    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String transportYear() {
        return "1973-1974";
    }

    @Override
    public String getInventoryName() {
        return "EMD SDP40F";
    }

    
    



}
