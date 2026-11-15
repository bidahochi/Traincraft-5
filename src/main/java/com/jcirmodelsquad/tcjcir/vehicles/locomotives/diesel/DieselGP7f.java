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

public class DieselGP7f extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7f;
    }
    public DieselGP7f(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "ARR 1803");
        InsertTexture(1, "ARR 1807");
        InsertTexture(2, "ARR 1802");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "SNCT 401 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(5, "SNCT 402 (Protolance)", LockoutGroup.SNCT);
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
            new SeatDefinition("driver", 1.0656F, 0.1F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1949-1954";
    }

    @Override
    public String getInventoryName() {
        return "ARR GP7u";
    }


}