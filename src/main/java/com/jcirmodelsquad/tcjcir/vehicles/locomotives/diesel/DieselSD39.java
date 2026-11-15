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

public class DieselSD39 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.DieselSD39;
    }

    public DieselSD39(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "BNSF");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "TORE");
        InsertTexture(3, "NEP", LockoutGroup.CUBED);
        InsertTexture(4, "NEP", LockoutGroup.CUBED);
        InsertTexture(5, "NEP", LockoutGroup.CUBED);
        InsertTexture(6, "FURRX");
        InsertTexture(7, "Carbondale & Pine Valley", LockoutGroup.CPV);

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
            new SeatDefinition("driver", 1.4875F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1968-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD39";
    }


}
