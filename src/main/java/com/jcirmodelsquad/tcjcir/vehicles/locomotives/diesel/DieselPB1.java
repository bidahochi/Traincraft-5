package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselPB1 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselPB1;
    }
    public DieselPB1(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Santa Fe");
        InsertTexture(1, "Demonstrator");
        InsertTexture(2, "Denver & Rio Grande Western");
        InsertTexture(3, "Denver & Rio Grande Western (4 Stripe)");
        InsertTexture(4, "Southern Pacific");
        InsertTexture(5, "Union Pacific");
        InsertTexture(6, "New York Central");
        InsertTexture(7, "Generic");
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
            new SeatDefinition("driver", 1.8F, -0.08F, 0F, SeatRole.DRIVER)
        };
    }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "Alco PA-1";
    }

}
