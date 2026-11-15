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


public class DieselFB2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFB2;
    }
    public DieselFB2(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "New York Central (Lightning)");
        InsertTexture(1, "Chicago Northwestern");
        InsertTexture(2, "ALCO Demonstrator");
        InsertTexture(3, "Great Northern");
        InsertTexture(4, "Great Northern (Solid)");
        InsertTexture(5, "Canadian National (Old)");
        InsertTexture(6, "Canadian National (Stripes)");
        InsertTexture(7, "Galesburg Clinton & Midland (FPB-2)", LockoutGroup.GCM);
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
        return "Alco FB-2";
    }




}
