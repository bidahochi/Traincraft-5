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

public class DieselM420 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM420;
    }
    public DieselM420(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "BCOL (Zig Zag)");
        InsertTexture(1, "COW (Moo)");
        InsertTexture(2, "FNCC (KIT-L, Non Canon)", LockoutGroup.FNCC);
        InsertTexture(3, "the demon of babylon disguises himself as the righteous");
        InsertTexture(4, "SPR (M424)", LockoutGroup.SPR);
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
            new SeatDefinition("driver", 1.4F, 0.3F, 0.3F, SeatRole.DRIVER)
        };
    }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW M420";
    }






}
