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

public class DieselRS3 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS3;
    }
    public DieselRS3(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Boston & Maine (Simp)");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Denver & Rio Grande Western (Early)");
        InsertTexture(3, "Denver & Rio Grande Western");
        InsertTexture(4, "AGW", LockoutGroup.AGW);
        InsertTexture(5, "CCRL");
        InsertTexture(6, "SER");
        InsertTexture(7, "NSE");
        InsertTexture(8, "WM (Fireball)");
        InsertTexture(9, "WM (Fireball Hammerhead)");
        InsertTexture(10, "WM (Speed Lettering)");
        InsertTexture(11, "WM (Speed Lettering Hammerhead)");
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
            new SeatDefinition("driver", -0.825F, 0.35F, 0.35F, SeatRole.DRIVER)
        };
    }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }



    @Override
    public String getInventoryName() {
        return "ALCo RS-3";
    }


    



}
