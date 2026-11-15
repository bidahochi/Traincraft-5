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

public class DieselF9B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF9B;
    }
    public DieselF9B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Blandsville & Blankerstoner");
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
        InsertTexture(2, "FNCC (Ex NP)", LockoutGroup.FNCC);
        InsertTexture(3, "DRGW (4 stripe)");
        InsertTexture(4, "DRGW (4 stripe, late)");
        InsertTexture(5, "DRGW (1 stripe)");
        InsertTexture(6, "SP Scarlet");
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
            new SeatDefinition("driver", 1.1644F, 0.19F, 0.1781F, SeatRole.DRIVER)
        };
    }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.87F;
    }

    @Override
    public String transportYear() {
        return "1953-1960";
    }

    @Override
    public String getInventoryName() {
        return "EMD F9b";
    }






}
