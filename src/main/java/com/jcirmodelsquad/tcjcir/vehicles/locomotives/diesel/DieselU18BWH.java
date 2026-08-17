package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU18BWH extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:u18bwh")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_141", "marker_body_142", "marker_body_275",
            "marker_body_276", "marker_body_90", "marker_body_91")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_205", "numberboard_body_206", "numberboard_body_280",
            "numberboard_body_281")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18BWH;
    }
    public DieselU18BWH(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Amtrak (PH1)");
        InsertTexture(1, "Amtrak (Low Clearance NEC Edition)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.3, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String getInventoryName() {
        return "GE U18B(W)H";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
