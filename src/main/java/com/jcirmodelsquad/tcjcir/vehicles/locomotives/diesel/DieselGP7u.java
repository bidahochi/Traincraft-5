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

public class DieselGP7u extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7u;
    }
    public DieselGP7u(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF (Kodachrome)");
        InsertTexture(1, "ATSF (Freightbonnet)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Avanste Northeastern (Radio Equipped) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(4, "Avanste Northeastern (Yard) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(5, "Fox Union Rail Resources (FURRX)");
        InsertTexture(6, "OC&G 15", LockoutGroup.CUBED);
        InsertTexture(7, "FNCC 210-213 (GP9(U) group e)", LockoutGroup.FNCC);
        InsertTexture(8, "FNCC 235-240 (ex FMSR units)", LockoutGroup.FNCC);

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
            new SeatDefinition("driver", 1.0812F, 0.1F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1972-1981";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP7u";
    }


}