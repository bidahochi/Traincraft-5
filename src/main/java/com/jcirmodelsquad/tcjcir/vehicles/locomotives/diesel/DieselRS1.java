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

public class DieselRS1 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS1;
    }
    public DieselRS1(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "she ann on my arbor till i bankruptcy");
        InsertTexture(1, "she wabash on my lake till i ann arbor");
        InsertTexture(2, "Tidewater Southern");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "DLMR (Early)", LockoutGroup.DLMR);
        InsertTexture(5, "DLMR (Late)", LockoutGroup.DLMR);
        InsertTexture(6, "FMSR", LockoutGroup.FMSR);
        InsertTexture(7, "ATSF");
        InsertTexture(8, "Glontch");
        InsertTexture(9, "AGW", LockoutGroup.AGW);
        InsertTexture(10, "CYDZ");
        InsertTexture(11, "ARR");

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
            new SeatDefinition("driver", -0.825F, 0.35F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() {
        return "ALCo RS-1";
    }
}
