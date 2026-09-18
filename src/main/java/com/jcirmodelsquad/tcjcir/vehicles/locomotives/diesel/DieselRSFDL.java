package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselRSFDL extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRSFDL;
    }
    public DieselRSFDL(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "not FNCC");
        InsertTexture(1, "peenore lol");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.1, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo RSFDL";
    }


}
