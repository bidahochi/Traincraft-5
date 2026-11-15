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


public class DieselDS441000 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDS441000;
    }
    public DieselDS441000(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Chicago & Northwestern (Early)");
        InsertTexture(1, "Chicago & Northwestern (Late)");
        InsertTexture(2, "New York Central (Early)");
        InsertTexture(3, "New York Central (Late)");
        InsertTexture(4, "AGW", LockoutGroup.AGW);
        InsertTexture(5, "Union Pacific");
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
            new SeatDefinition("driver", -1.3844F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }






    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F;
    }

    @Override
    public String getInventoryName() {
        return "BLH DS-4-4-1000 (606SC)";
    }

    




}
