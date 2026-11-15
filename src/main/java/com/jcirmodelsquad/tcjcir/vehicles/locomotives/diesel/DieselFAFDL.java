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


public class DieselFAFDL extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFAFDL;
    }
    public DieselFAFDL(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FMSR", LockoutGroup.FMSR);
        InsertTexture(1, "Blandsville & Blankerston (Early FAFDL)");
        InsertTexture(2, "Blandsville & Blankerston (Late FAFDL)");
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
            new SeatDefinition("driver", 1.2888F, 0.13F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.93F;
    }

    @Override
    public String getInventoryName() {
        return "CEE FA-FDL";
    }


}
