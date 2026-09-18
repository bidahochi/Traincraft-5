package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselC424 extends DieselTrain {


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselC424; }

    public DieselC424(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Spokane, Portland & Seattle");
        InsertTexture(1, "Morristown & Erie");
        InsertTexture(2, "Western New York & Pennsylvania");
        InsertTexture(3, "Washaska & Old Fox RR");
        InsertTexture(4, "Latrans Range RR (Bida Fictional)"/*, LockoutGroup.LRR*/);
        InsertTexture(5, "NdeM");
        InsertTexture(6, "NdeM");
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(9, "Deadwood & La Mesa", LockoutGroup.DLMR);
        InsertTexture(10, "Penn Central");
        InsertTexture(11, "FNCC (2nd order)", LockoutGroup.FNCC);
        InsertTexture(12, "Burlington Northern");
        InsertTexture(13, "Great Lakes & Northern Territories");
        InsertTexture(14, "FMSR (2nd Order)", LockoutGroup.FMSR);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() { return "ALCo C424"; }

    
    



}
