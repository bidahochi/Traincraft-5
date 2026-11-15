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

public class DieselDash839CE extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash839CE;
    }
    public DieselDash839CE(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "North Fox (KIT-80)", LockoutGroup.FNCC);
        InsertTexture(2, "North Fox 475 (KIT-80 OLS Unit)", LockoutGroup.FNCC);
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "Blandsville & Blankerston");
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
            new SeatDefinition("driver", 2.0344F, 0.3F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F; }

    @Override
    public String transportYear() {
        return "1984-1987";
    }

    @Override
    public String getInventoryName() {
        return "GE C39-8E";
    }


}
