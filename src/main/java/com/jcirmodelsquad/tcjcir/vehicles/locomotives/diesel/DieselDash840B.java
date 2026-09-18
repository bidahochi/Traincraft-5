package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash840B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash840B;
    }
    public DieselDash840B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CSXT (YN2)");
        InsertTexture(1, "CSXT (YN3)");
        InsertTexture(2, "ATSF (Freightbonnet)");
        InsertTexture(3, "BNSF");
        InsertTexture(4, "CR");
        InsertTexture(5, "PDR");
        InsertTexture(6, "GCM", LockoutGroup.GCM);
        InsertTexture(7, "NS");
        InsertTexture(8, "");
        InsertTexture(9, "");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String transportYear() {
        return "1988-1989";
    }

    @Override
    public String getInventoryName() {
        return "GE B40-8";
    }



}
