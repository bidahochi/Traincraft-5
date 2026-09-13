package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselCF7hh extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:cf7hh")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_334", "marker_body_335", "marker_body_39",
            "marker_body_41")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_133", "numberboard_body_134", "numberboard_body_317",
            "numberboard_body_318")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7HH;
    }
    public DieselCF7hh(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Grassland Laboratories");
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
    public String getInventoryName() {
        return "CEE CF7 (GL)";
    }

    @Override
    public String transportYear() {
        return "1969-1978";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
