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

public class DieselC415H extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselC415H;
    }
    public DieselC415H(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Port of Tillamook Bay 701 (BRJ 701 Early)");
        InsertTexture(1, "Port of Tillamook Bay 702 (BRJ 702 Early)");
        InsertTexture(2, "Latrans Range Railroad (Bida Fictional)"/*, LockoutGroup.LRR*/);
        InsertTexture(3, "Southern Pacific");
        InsertTexture(4, "Southern Pacific (Red Deckplate)");
        InsertTexture(5, "Morristown, Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(6, "Fox, Marble, & Seaboard Ry", LockoutGroup.FMSR);
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
            new SeatDefinition("driver", -0.2969F, 0.5F, 0.0003F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo C415 High Visibility";
    }

    @Override
    public String transportYear() {
        return "1966-1968";
    }
}
