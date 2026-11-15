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

public class DieselB36 extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselB36; }

    public DieselB36(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "CNRC 7772 & 7773 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(1, "CNRC 7771 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(2, "CNRC 7774 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(3, "CSXT (Yn2)");
        InsertTexture(4, "CSXT (Yn1)");
        InsertTexture(5, "CSXT (Stealth)");
        InsertTexture(6, "CSXT (Bluedown)");
        InsertTexture(7, "Seaboard");
        InsertTexture(8, "FNCC 161 (KIT-L, Extended DB Test Unit)");
        InsertTexture(9, "FNCC (KIT-L)");
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
            new SeatDefinition("driver", 1.6438F, 0.25F, 0.3425F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String transportYear() {
        return "1980-1985";
    }

    @Override
    public String getInventoryName() { return "GE B36-7"; }


}
