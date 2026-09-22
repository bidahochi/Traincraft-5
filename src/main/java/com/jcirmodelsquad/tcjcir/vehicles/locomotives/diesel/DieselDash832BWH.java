package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash832BWH extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash832BWH;
    }
    public DieselDash832BWH(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Amtrak (PH 3)");
        InsertTexture(1, "Amtrak (PH 4)");
        InsertTexture(2, "Amtrak (PH 5)");
        InsertTexture(3, "Western Pacific (Cali Zephyr)");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "");
        InsertTexture(6, "");
        InsertTexture(7, "");
        InsertTexture(8, "");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.35, -0.35); }




    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1990-1991";
    }

    @Override
    public String getInventoryName() {
        return "GE Dash 8-32BWH";
    }


    



}
