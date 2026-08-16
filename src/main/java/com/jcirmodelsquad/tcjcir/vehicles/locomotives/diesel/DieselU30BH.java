package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LightFixtureType;
import train.common.api.LiquidManager;
import train.common.api.RollingStockLightFunction;
import train.common.api.RollingStockLightColors;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU30BH extends DieselTrain {
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:u30bh")
        .defaults()
        .fixtureType(
            LightFixtureType.DITCH_LIGHT,
            "front_left_lower", "front_left_upper",
            "front_right_lower", "front_right_upper",
            "rear_left_lower", "rear_left_upper",
            "rear_right_lower", "rear_right_upper")
        .steadyHeadlight(
            "front_nose_headlight_left", "front_nose_headlight_right",
            "front_headlight_lower_phase2", "front_headlight_upper_phase2",
            "rear_headlight_lower", "rear_headlight_upper")
        .fixtureType(
            LightFixtureType.MARKER_LIGHT,
            "front_marker_left", "front_marker_right",
            "rear_marker_lower_left", "rear_marker_lower_right",
            "rear_marker_upper_left", "rear_marker_upper_right")
        .gyralite("front_gyralite", "rear_gyralite_left", "rear_gyralite_right")
        .color(
            RollingStockLightColors.WARM_WHITE,
            "front_nose_headlight_left", "front_nose_headlight_right",
            "front_headlight_lower_phase2", "front_headlight_upper_phase2",
            "rear_headlight_lower", "rear_headlight_upper")
        .color(
            RollingStockLightColors.RED,
            "front_gyralite", "rear_gyralite_left", "rear_gyralite_right")
        .fixtureType(
            LightFixtureType.NUMBERBOARD,
            "front_numberboard_left", "front_numberboard_right",
            "rear_numberboard_left", "rear_numberboard_right")
        .fixtureType(
            LightFixtureType.COMMANDER,
            "commander_left", "commander_right")
        .fixtureType(LightFixtureType.PRIME_1, "prime_1")
        .fixtureType(LightFixtureType.PRIME_2, "prime_2")
        .fixtureType(LightFixtureType.PRIME_3, "prime_3")
        .fixtureType(LightFixtureType.PRIME_4, "prime_4")
        .setSkin("purple")
        .alternatingDitch(
            0,
            RollingStockLightFunction.LampResponse.INCANDESCENT,
            "front_left_lower",
            "front_left_upper",
            "rear_left_lower",
            "rear_left_upper")
        .alternatingDitch(
            1,
            RollingStockLightFunction.LampResponse.INCANDESCENT,
            "front_right_lower",
            "front_right_upper",
            "rear_right_lower",
            "rear_right_upper")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU30BH;
    }
    public DieselU30BH(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Northern Cascades Transit Authority (NOCTA)", LockoutGroup.BIDA);
        InsertTexture(1, "Blandsville Area Rapid Transporation (BlART)");
        InsertTexture(2, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(3, "CRL (70s-80s)");
        InsertTexture(4, "CRL (80s-2006)");
        InsertTexture(5, "CRL (2006-onwards)");
    }


    @Override
    protected RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String getInventoryName() {
        return "CEE U30B(H)";
    }

    @Override
    public boolean isFictional() {
        return true;
    }
}
