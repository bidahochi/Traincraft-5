package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselB30 extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselB30; }

    public DieselB30(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CNCR 5550 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(1, "CNCR 5552 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(2, "CNCR 5553-5555 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(3, "CSXT (Yn2)");
        InsertTexture(4, "CSXT (Yn1)");
        InsertTexture(5, "CSXT (Stealth)");
        InsertTexture(6, "CSXT (Bluedown)");
        InsertTexture(7, "Seaboard");
        InsertTexture(8, "Chessie System");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String getInventoryName() { return "GE B30-7"; }

    @Override
    public String transportYear() {
        return "1977-1983";
    }


}