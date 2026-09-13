package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselS12 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:s12")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_223", "front_numberboard_body_224", "numberboard_body_329",
            "numberboard_body_330", "numberboard_body_382", "numberboard_body_383",
            "rear_numberboard_body_378", "rear_numberboard_body_379")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselS12;
    }
    public DieselS12(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Amador Central Railroad");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Latrans Range Railroad (Bida Fictional)"/*, LockoutGroup.LRR*/);
        InsertTexture(3, "hamburger helper railroad", LockoutGroup.DLMR);
        InsertTexture(4, "DDVR 30 & 31");
        InsertTexture(5, "FMSR", LockoutGroup.FMSR);
        InsertTexture(6, "OC&G (Ex FMSR 164)", LockoutGroup.CUBED);
        InsertTexture(7, "Monongahela");
        InsertTexture(8, "SP Tigerstripe");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.3, 0.2, -0.37); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F;
    }

    @Override
    public String getInventoryName() {
        return "BLH S12 (606A)";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
