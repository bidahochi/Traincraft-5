package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class DieselSW1600 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1600;
    }
    public DieselSW1600(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "FNCC (DAR80)", LockoutGroup.FNCC);
    }

    @Override
    public float transportMetricHorsePower()
    {
        return 1600;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.1, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.175F; }

    @Override
    public String getInventoryName() {
        return "FNCC SW1600";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public int getTankCapacity()
    {
        return 10000;
    }
}