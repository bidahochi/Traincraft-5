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


public class DieselSDP40 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSDP40;
    }
    public DieselSDP40(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "Burlington Northern");
        InsertTexture(1, "NEP", LockoutGroup.CUBED);
        InsertTexture(2, "NEPKIN", LockoutGroup.CUBED);
        InsertTexture(3, "that one chopass SDP that cubed is obsessed with");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "Burlington Northern 6396");
        InsertTexture(6, "MRL (80s-90s)");
        InsertTexture(7, "GN (BSB)");
        InsertTexture(8, "GN (EB)");
        InsertTexture(9, "Steampunk Rail", LockoutGroup.SPR);
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
            new SeatDefinition("driver", 1.6891F, 0.15F, -0.0075F, SeatRole.DRIVER)
        };
    }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String transportYear() {
        return "1966-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD SDP40";
    }

    
    



}
