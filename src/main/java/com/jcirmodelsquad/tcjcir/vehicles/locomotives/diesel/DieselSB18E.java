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

public class DieselSB18E extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSB18E;
    }
    public DieselSB18E(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "CEE Factory Blank (Phase 2)");
        InsertTexture(1, "Nomansi & Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(2, "Western Pacific");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Galesburg Clinton & Midland i think", LockoutGroup.GCM);
        InsertTexture(5, "CSXT (Yn2, Protolance)");
        InsertTexture(6, "Morristown Tenneva & Southern", LockoutGroup.MTS);
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
            new SeatDefinition("driver", 1.3F, 0.225F, 0F, SeatRole.DRIVER)
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
        return "CEE SB18E";
    }



}
