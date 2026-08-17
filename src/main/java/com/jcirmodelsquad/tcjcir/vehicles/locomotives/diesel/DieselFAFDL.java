package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselFAFDL extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:fafdl")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_l_type_1", "marker_l_type_2", "marker_r_type_1",
            "marker_r_type_2")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_left_body_186", "numberboard_left_body_63", "rear_numberboard_right_body_187",
            "rear_numberboard_right_body_80")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFAFDL;
    }
    public DieselFAFDL(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FMSR", LockoutGroup.FMSR);
        InsertTexture(1, "Blandsville & Blankerston (Early FAFDL)");
        InsertTexture(2, "Blandsville & Blankerston (Late FAFDL)");
        InsertTexture(3, "");
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
    public String transportYear() {
        return "1977-1978";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.72, 0.13, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.93F;
    }

    @Override
    public String getInventoryName() {
        return "CEE FA-FDL";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
