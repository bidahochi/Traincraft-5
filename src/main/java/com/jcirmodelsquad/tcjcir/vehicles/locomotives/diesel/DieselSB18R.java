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

public class DieselSB18R extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSB18R;
    }
    public DieselSB18R(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "CEE Factory Blank (Phase 1)");
        InsertTexture(1, "CEE Factory Blank (Phase 2)");
        InsertTexture(2, "Western Pacific (Early)");
        InsertTexture(3, "Western Pacific (Late)");
        InsertTexture(4, "TTLC (Highlands Moss)");
        InsertTexture(5, "TTLC (Koke Moss)");
        InsertTexture(6, "TTLC (Moss)");
        InsertTexture(7, "TTLC (Oak Moss)");
        InsertTexture(8, "TTLC (Reindeer Moss)");
        InsertTexture(9, "TTLC (Swamp Moss)");
        InsertTexture(10, "Morristown Tenneva & Southern", LockoutGroup.MTS);
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
            new SeatDefinition("driver", 1.3F, 0.225F, 0.0075F, SeatRole.DRIVER)
        };
    }

    @Override
    public String transportYear() {
        return "1981-1989";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "CEE SB18R";
    }



}
