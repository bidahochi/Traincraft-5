package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselPA1 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselPA1;
    }
    public DieselPA1(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Santa Fe");
        InsertTexture(1, "Santa Fe (Late)");
        InsertTexture(2, "Demonstrator");
        InsertTexture(3, "Nickel Plate Road (Early)");
        InsertTexture(4, "Nickel Plate Road");
        InsertTexture(5, "Wabash");
        InsertTexture(6, "Denver & Rio Grande Western");
        InsertTexture(7, "Denver & Rio Grande Western (4 Stripe)");
        InsertTexture(8, "Southern Pacific");
        InsertTexture(9, "Cotton Belt");
        InsertTexture(10, "New Haven");
        InsertTexture(11, "New Haven (Reverse McGinnis)");
        InsertTexture(12, "Pennsylvania Railroad");
        InsertTexture(13, "Union Pacific");
        InsertTexture(14, "Demonstrator (Canadian)");
        InsertTexture(15, "CN (Semi-fictional)");
        InsertTexture(16, "Missouri Pacific");
        InsertTexture(17, "Missouri Pacific (Jenks Blue)");
        InsertTexture(18, "Missouri-Kansas-Texas (Shadowlined)");
        InsertTexture(19, "Missouri-Kansas-Texas");
        InsertTexture(20, "New York Central");
        InsertTexture(21, "Pittsburgh & Lake Erie");
        InsertTexture(22, "Lehigh Valley");
        InsertTexture(23, "American Freedom Train");
        InsertTexture(24, "Generic");
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
            new SeatDefinition("driver", 1.7166F, 0.14F, 0F, SeatRole.DRIVER)
        };
    }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }



    @Override
    public String getInventoryName() {
        return "Alco PA-1";
    }





}
