package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

//haha sw1 go brrrr
public class DieselTR4B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselTR4B;
    }
    public DieselTR4B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Belt Railroad of Chicago");
        InsertTexture(1, "Milwaukee Road");
        InsertTexture(2, "Chesapeake & Ohio");
        InsertTexture(3, "Baltimore & Ohio");
        InsertTexture(4, "Great Lakes & Northern Territories");
        InsertTexture(5, "Blandsville & Blankerston");
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
            new SeatDefinition("driver", -1.83F, -0.03F, 0F, SeatRole.DRIVER)
        };
    }


    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    

    @Override
    public String getInventoryName() {
        return "EMD TR4 Calf";
    }

    




}
