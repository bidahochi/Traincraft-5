package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP39TDash2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP39TDash2;
    }
    public DieselGP39TDash2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "DIP", LockoutGroup.BIDA);
        InsertTexture(1, "");
        InsertTexture(2, "");
        InsertTexture(3, "");
        InsertTexture(4, "");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.15, -0.325); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F; }

    @Override
    public String getInventoryName() {
        return "EMD GP39T-2";
    }

    @Override
    public boolean isFictional() {
        return true;
    }


}