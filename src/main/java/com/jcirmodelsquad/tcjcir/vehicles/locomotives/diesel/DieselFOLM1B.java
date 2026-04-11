package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselFOLM1B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFOLM1B;
    }
    public DieselFOLM1B(World world) {
        super(world, LiquidManager.dieselFilter());

    }

    @Override
    public float transportMetricHorsePower()
    {
        return 5000;
    }

    @Override
    public String transportCountry()
    {
        return "CZ";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 4.0, 0.35f);
    }

    @Override
    public String getInventoryName() {
        return "FOL-M1B";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1F);
    }

    @Override
    public int getTankCapacity()
    {
        return 15000;
    }
}