package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselDash940C extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash940C;
    }
    public DieselDash940C(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Avanste Northeastern (Bida Fictional)"/*, LockoutGroup.ANE*/);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportYear() {
        return "1995";
    }

    @Override
    public String getInventoryName() {
        return "GE Dash 9-40C";
    }



}
