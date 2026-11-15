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

public class DieselAC4400CW extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselAC4400CW; }

    public DieselAC4400CW(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CSXT (YN2)");
        InsertTexture(1, "CSXT (YN3)");
        InsertTexture(2, "Nomansi and Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(3, "Blandsville & Blankerston");
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
            new SeatDefinition("driver", 1.9F, 0.45F, 0.3501F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() { return "GE AC4400CW"; }

    @Override
    public String transportYear() {
        return "1993-2004";
    }



}
