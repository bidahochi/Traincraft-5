package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSW9 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sw9")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_crl_body_386", "marker_crl_body_387", "marker_crl_body_479",
            "marker_crl_body_480")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_double_body_372", "front_numberboard_double_body_373", "front_numberboard_double_body_400",
            "front_numberboard_double_body_401", "front_numberboard_single_body_76", "front_numberboard_single_body_77",
            "numberboard_body_141", "numberboard_body_142", "numberboard_body_381",
            "numberboard_body_385", "rear_numberboard_double_body_376", "rear_numberboard_double_body_377",
            "rear_numberboard_single_body_374", "rear_numberboard_single_body_375")
        .build();

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.DieselSW9;
    }

    public DieselSW9(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Western Pacific (As delivered)");
        InsertTexture(1, "Western Pacific");
        InsertTexture(2, "Western Pacific (Late)");
        InsertTexture(3, "Conrail");
        InsertTexture(4, "Apalachicola Northern");
        InsertTexture(5, "Blandsville & Blankerston");
        InsertTexture(6, "Southern");
        InsertTexture(7, "C&O");
    }

    @Override
    public String transportCountry() {
        return "US";
    }

    @Override
    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35);
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1950-1953";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW900";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
