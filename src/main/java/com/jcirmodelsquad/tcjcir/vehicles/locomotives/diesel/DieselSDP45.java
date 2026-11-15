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


public class DieselSDP45 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSDP45;
    }
    public DieselSDP45(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "Southern Pacific");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Great Northern");
        InsertTexture(3, "Burlington Northern 6596");
        InsertTexture(4, "Burlington Northern 6593");
        InsertTexture(5, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(6, "JCIR 6 Years");

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
            new SeatDefinition("driver", 1.8531F, 0.2F, -0.0075F, SeatRole.DRIVER)
        };
    }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.6F;
    }

    @Override
    public String transportYear() {
        return "1967-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD SDP45";
    }






}
