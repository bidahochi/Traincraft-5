package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LightFixtureType;
import train.common.api.LiquidManager;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselTB27 extends DieselTrain {
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:tb27")
        .defaults()
        .fixtureType(
            LightFixtureType.NUMBERBOARD,
            "rear_numberboard_right", "rear_numberboard_left",
            "front_numberboard_right", "front_numberboard_left",
            "front_numberboard_sp_right", "front_numberboard_sp_left")
        .fixtureType(
            LightFixtureType.MARKER_LIGHT,
            "rear_marker_right", "rear_marker_left",
            "front_marker_right", "front_marker_left",
            "front_marker_sp_right", "front_marker_sp_left")
        .steadyHeadlight(
            "rear_headlight_lower_right", "rear_headlight_lower_left",
            "rear_headlight_upper_right", "rear_headlight_upper_left",
            "front_headlight_lower", "front_headlight_upper")
        .gyralite("front_gyralite_right", "front_gyralite_left")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselTB27;
    }
    public DieselTB27(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Demonstrator");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Avanste Northeastern (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(3, "SPR", LockoutGroup.SPR);

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
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.0, 0.35, 0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String getInventoryName() {
        return "Masaou TB27";
    }

    @Override
    public boolean isFictional(){
        return true;
    }
}
