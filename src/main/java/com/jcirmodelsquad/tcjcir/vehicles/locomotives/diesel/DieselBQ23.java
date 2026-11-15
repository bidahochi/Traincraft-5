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

public class DieselBQ23 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselBQ23;
    }
    public DieselBQ23(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Family Lines (As Delivered)");
        InsertTexture(1, "Providence & Worcester");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "CSXT YN2 3003");
        InsertTexture(4, "CSXT YN2 (Post 90s)");
        InsertTexture(5, "CSXT Ghrey Ghonst");
        InsertTexture(6, "breaking bad if it was good");
        InsertTexture(7, "Nautilussy so sussy", LockoutGroup.CUBED);
        InsertTexture(8, "FNCC (KIT-L)", LockoutGroup.FNCC);
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
            new SeatDefinition("driver", 1.8594F, 0.35F, 0.4F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String transportYear() {
        return "1978-1979";
    }

    @Override
    public String getInventoryName() {
        return "GE BQ23-7";
    }



}
