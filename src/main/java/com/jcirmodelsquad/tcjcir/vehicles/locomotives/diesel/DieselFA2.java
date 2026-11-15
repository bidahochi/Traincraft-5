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


public class DieselFA2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFA2;
    }
    public DieselFA2(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "New York Central (Lightning)");
        InsertTexture(1, "Chicago Northwestern");
        InsertTexture(2, "Wabash");
        InsertTexture(3, "ALCO Demonstrator");
        InsertTexture(4, "Great Northern");
        InsertTexture(5, "Great Northern (Solid)");
        InsertTexture(6, "Great Northern (Steam Gen)");
        InsertTexture(7, "Great Northern (Steam Gen Solid 2)");
        InsertTexture(8, "Canadian National (Old)");
        InsertTexture(9, "Canadian National (Stripes)");
        InsertTexture(10, "Galesburg Clinton & Midland (FPA-2)", LockoutGroup.GCM);
        InsertTexture(11, "WM (Speed Lettering)");
        InsertTexture(12, "WM (Circus)");
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
            new SeatDefinition("driver", 1.2766F, 0.14F, 0F, SeatRole.DRIVER)
        };
    }
    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.93F;
    }



    @Override
    public String getInventoryName() {
        return "Alco FA-2";
    }

    




}
