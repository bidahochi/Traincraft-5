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

public class DieselDash840B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash840B;
    }
    public DieselDash840B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CSXT (YN2)");
        InsertTexture(1, "CSXT (YN3)");
        InsertTexture(2, "ATSF (Freightbonnet)");
        InsertTexture(3, "BNSF");
        InsertTexture(4, "CR");
        InsertTexture(5, "PDR");
        InsertTexture(6, "GCM", LockoutGroup.GCM);
        InsertTexture(7, "NS");
        InsertTexture(8, "");
        InsertTexture(9, "");

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
            new SeatDefinition("driver", 1.8688F, 0.25F, 0.3575F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String transportYear() {
        return "1988-1989";
    }

    @Override
    public String getInventoryName() {
        return "GE B40-8";
    }



}
