package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselTB27 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselTB27;
    }
    public DieselTB27(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Demonstrator");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Avanste Northeastern (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(3, "SPR", LockoutGroup.SPR);

    }


    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.0, 0.35, 0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() {
        return "Masaou TB27";
    }

    @Override
    public boolean isFictional(){
        return true;
    }
}
