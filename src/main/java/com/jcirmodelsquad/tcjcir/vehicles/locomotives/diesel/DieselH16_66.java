package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselH16_66 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselH16_66;
    }
    public DieselH16_66(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "TVA");
        InsertTexture(1, "Chicago Northwestern (Stripes)");
        InsertTexture(2, "Chicago Northwestern (No Stripes)");
        InsertTexture(3, "Chicago Northwestern");
        InsertTexture(4, "Chicago Northwestern (Zito Yellow)");
        InsertTexture(5, "TVA (Early Black)");
        InsertTexture(6, "TVA (Late Black)");
        InsertTexture(7, "The Milwaukee Road (Early)");
        InsertTexture(8, "The Milwaukee Road (Late)");
        InsertTexture(9, "Squaw Creek Coal (Yellow Steps)");
        InsertTexture(10, "Squaw Creek Coal");
        InsertTexture(11, "Canadian Pacific");
        InsertTexture(12, "DLMR", LockoutGroup.DLMR);
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
            new SeatDefinition("driver", 1.4188F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "FM H16-66";
    }

    
    


}
