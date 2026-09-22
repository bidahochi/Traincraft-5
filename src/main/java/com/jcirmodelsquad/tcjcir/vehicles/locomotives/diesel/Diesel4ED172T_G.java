package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class Diesel4ED172T_G extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.Diesel4ED172_G; }

    public Diesel4ED172T_G(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Grassland Laboratories");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public String getInventoryName() { return "CEE 4ED-172T (GE Repower)"; }

    @Override
    public boolean isFictional() {
        return true;
    }


}
