package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselS2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselS2;
    }
    public DieselS2(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Penn Central");
        InsertTexture(2, "Great Northern");
        InsertTexture(3, "The Milwaukee Road");
        InsertTexture(4, "Morristown Tennrva and Southern");
        InsertTexture(5, "FURRX");
        InsertTexture(6, "ATSF (Pinstripe)");
        InsertTexture(7, "Amtrak (Phase I)");
        InsertTexture(8, "Amtrak (Phase II)");
        InsertTexture(9, "CP Rail");
        InsertTexture(10, "Dee Dee Valley Railroad");
        InsertTexture(11, "Ann Arbor");
        InsertTexture(12, "AGW");
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
            new SeatDefinition("driver", -1.2F, 0.3F, -0.0312F, SeatRole.DRIVER)
        };
    }

    





    




    @Override
    public String getInventoryName() {
        return "ALCO S2";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1F);
    }
    






}
