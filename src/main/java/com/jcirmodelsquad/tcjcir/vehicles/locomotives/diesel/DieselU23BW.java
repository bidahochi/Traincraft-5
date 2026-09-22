package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU23BW extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23BW;
    }
    public DieselU23BW(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "CSXT (Yn2, Protolance)");
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.3, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String getInventoryName() {
        return "GE U23B(W)";
    }


}
