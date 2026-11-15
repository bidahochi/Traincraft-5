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

public class DieselHH660 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselHH600;
    }
    public DieselHH660(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "RE 601");
        InsertTexture(1, "RE 606");
        InsertTexture(2, "ATSF (Zebra)");
        InsertTexture(3, "DLMR", LockoutGroup.DLMR);
        InsertTexture(4, "FPRR");
        InsertTexture(5, "FURRX (Ex FPRR)");
        InsertTexture(6, "CCRL");
        InsertTexture(7, "CCRL MOW/Shunter");
        InsertTexture(8, "Moonguy Quarry");
        InsertTexture(9, "Moonguy Quarry (Ex CCRL)");
        InsertTexture(10, "SER");

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
            new SeatDefinition("driver", -1.2F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public String getInventoryName() {
        return "ALCO HH660";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1F);
    }
}
