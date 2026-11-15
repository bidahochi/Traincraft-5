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


public class DieselDR441500BPhase2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500BPhase2;
    }
    public DieselDR441500BPhase2(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Missouri Pacific (As delivered)");
        InsertTexture(1, "Missouri Pacific");
        InsertTexture(2, "New York Central (As delivered)");
        InsertTexture(3, "New York Central");
        InsertTexture(4, "New York Central (Dynamics removed)");
        InsertTexture(5, "New York Central (Cigarband)");
        InsertTexture(6, "Blandsville & Blankerston");
        InsertTexture(7, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(8, "Steampunk Rail", LockoutGroup.SPR);

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
            new SeatDefinition("driver", 2F, -0.08F, 0.47F, SeatRole.DRIVER)
        };
    }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }


    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500B (Phase 2)";
    }

    


}
