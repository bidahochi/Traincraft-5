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

public class DieselGPFDL extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGPFDL;
    }
    public DieselGPFDL(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "North Fox (KIT-L, Non Canon)", LockoutGroup.FNCC);
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Sacramento Northern (Ex FNCC 6&7)", LockoutGroup.CUBED);
        InsertTexture(3, "Sacramento Northern (Ex FNCC 6&7)", LockoutGroup.CUBED);
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
            new SeatDefinition("driver", 1.0812F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String getInventoryName() {
        return "EMD/CEE GPFDL";
    }

    @Override
    public boolean isFictional() {
        return true;
    }


}