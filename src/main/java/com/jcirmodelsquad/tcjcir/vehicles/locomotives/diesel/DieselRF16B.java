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


public class DieselRF16B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRF16B;
    }
    public DieselRF16B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Pennsylvania (1 Stipe)");
        InsertTexture(1, "Baltimore & Ohio");
        InsertTexture(2, "Baltimore & Ohio (Late)");
        InsertTexture(3, "New York Central");
        InsertTexture(4, "New York Central (Late)");
        InsertTexture(5, "Monongahela");
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
            new SeatDefinition("driver", 1.8F, -0.08F, 0.47F, SeatRole.DRIVER)
        };
    }
    

    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }



    @Override
    public String getInventoryName() {
        return "BLH RF-16B";
    }

    


}
