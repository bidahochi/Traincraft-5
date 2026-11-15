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


public class DieselFBFDL extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFBFDL;
    }
    public DieselFBFDL(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FMSR", LockoutGroup.FMSR);
        InsertTexture(1, "Blandsville & Blankerston (Early FBFDL)");
        InsertTexture(2, "Blandsville & Blankerston (Late FBFDL)");
        InsertTexture(3, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public String transportYear() {
        return "1977-1978";
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.45F, -0.08F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.96F;
    }

    @Override
    public String getInventoryName() {
        return "CEE FB-FDL";
    }
}
