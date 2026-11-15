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

public class DieselRS2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS2;
    }
    public DieselRS2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Deleware & Hudson");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "sans fey undertail rayroad");
        InsertTexture(3, "Lehigh & New England");
        InsertTexture(4, "Lehigh & New England (late)");
        InsertTexture(5, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(6, "AGW", LockoutGroup.AGW);
        InsertTexture(7, "WM (Fireball)");
        InsertTexture(8, "WM (Speed Lettering)");
        InsertTexture(9, "MONON (early, steam gen)");
        InsertTexture(10, "MONON (early)");
        InsertTexture(11, "MONON (steam gen)");
        InsertTexture(12, "MONON");

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
        return "ALCo RS-2";
    }

    




}
