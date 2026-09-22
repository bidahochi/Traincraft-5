package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselMP900 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselMP900;
    }
    public DieselMP900(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Masaou Demo");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Washaska Resources #906", LockoutGroup.BIDA);

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 1.1, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() {
        return "Masaou MP900";
    }

    @Override
    public boolean isFictional() {
        return true;
    }


}
