package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDH643 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDH643;
    }
    public DieselDH643(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Latrans Range Railroad (Bida Fictional)"/*, LockoutGroup.LRR*/);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.5, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.5F; }

    @Override
    public String getInventoryName() {
        return "ALCo DH643";
    }


}