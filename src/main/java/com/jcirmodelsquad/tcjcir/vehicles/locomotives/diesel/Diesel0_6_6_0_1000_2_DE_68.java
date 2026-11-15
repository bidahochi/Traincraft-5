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


public class Diesel0_6_6_0_1000_2_DE_68 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.Diesel0_6_6_0_1000_2_DE_68;
    }
    public Diesel0_6_6_0_1000_2_DE_68(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CNJ");
        InsertTexture(1, "CNJ (late)");
        InsertTexture(2, "CNJ (late, #2002)");
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
            new SeatDefinition("driver", 2.84F, 0.18F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.98F; }

    @Override
    public String transportYear() {
        return "1946-1947";
    }

    @Override
    public String getInventoryName() {
        return "BLW 0-6-6-0 1000/2 DE-6.8";
    }



}
