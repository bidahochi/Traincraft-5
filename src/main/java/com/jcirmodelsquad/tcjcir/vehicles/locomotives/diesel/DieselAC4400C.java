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

public class DieselAC4400C extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselAC4400C; }

    public DieselAC4400C(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Western Pacific");
        InsertTexture(1, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(2, "North Fox (KIT-80)", LockoutGroup.FNCC);
        InsertTexture(3, "CEFX");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "NEP", LockoutGroup.CUBED);
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.8844F, 0.3F, 0.3503F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public String getInventoryName() { return "GE AC4400C"; }

    /*@Override
    public String transportYear() {
        return "1981-1989";
    }*/

    @Override
    public boolean isFictional(){
        return true;
    }


}
