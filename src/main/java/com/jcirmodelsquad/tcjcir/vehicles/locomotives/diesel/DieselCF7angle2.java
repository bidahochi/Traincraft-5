package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselCF7angle2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7angle2;
    }
    public DieselCF7angle2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CFW 517", LockoutGroup.BIDA);
        InsertTexture(1, "CFW 2209", LockoutGroup.BIDA);
        InsertTexture(2, "CBRR 715", LockoutGroup.BIDA);
        InsertTexture(3, "CBRR 77", LockoutGroup.BIDA);
        InsertTexture(4, "CBRR 4677", LockoutGroup.BIDA);
        InsertTexture(5, "ex FNCC", LockoutGroup.BIDA);
        InsertTexture(6, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String transportYear() {
        return "1969-1978";
    }

    @Override
    public String getInventoryName() {
        return "EMD CF7 (CBRR)";
    }



}