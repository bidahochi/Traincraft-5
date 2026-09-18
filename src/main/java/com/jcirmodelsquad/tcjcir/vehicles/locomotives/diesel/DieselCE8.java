package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselCE8 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCE8;
    }
    public DieselCE8(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "FNCC 99 (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "Peninsula Development & Improvement Company (Bida Fictional)"/*, LockoutGroup.PDEV*/);
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "");
        InsertTexture(4, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.16, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "CEE CE8";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public String transportYear() {
        return "1980";
    }


}
