package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP39 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP39;
    }
    public DieselGP39(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Atlanta & St Andrews Bay");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "CSXT (YN2)");
        InsertTexture(3, "CSXT (Bluedown)");
        InsertTexture(4, "Chessie System");

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
    public String transportYear() {
        return "1969-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP39";
    }


}