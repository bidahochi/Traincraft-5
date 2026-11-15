package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSD60 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD60;
    }
    public DieselSD60(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Oakway Lease");
        InsertTexture(1, "Oakway Lease");
        InsertTexture(2, "CN (Ex Oakway i think?)");
        InsertTexture(3, "Uncle Pete");
        InsertTexture(4, "NS (SOU order-spec");
        InsertTexture(5, "CR (ohe now thats quality -demoman tf2)");
        InsertTexture(6, "Blandsville & Blanklands Terminal Railroad Association");
        InsertTexture(7, "GLoNT");
        InsertTexture(8, "BN (Tiger Stripe)");
        InsertTexture(9, "CSXT (Yn3)");
        InsertTexture(10, "CSXT (Yn2)");
        InsertTexture(11, "CSXT (Yn1)");
        InsertTexture(12, "CSXT (Stealth)");
        InsertTexture(13, "SOO (White)");
        InsertTexture(14, "SOO (Red)");
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
            new SeatDefinition("driver", 1.825F, 0.2F, 0.3503F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.425F; }

    @Override
    public String transportYear() {
        return "1984-1991";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD60";
    }


}