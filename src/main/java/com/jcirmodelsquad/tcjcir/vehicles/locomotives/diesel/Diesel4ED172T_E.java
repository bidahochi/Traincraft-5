package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class Diesel4ED172T_E extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:cee4ed172t_e")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_208", "marker_body_209", "marker_body_210",
            "marker_body_211", "marker_body_213", "marker_body_214")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_130", "numberboard_body_131", "numberboard_body_160",
            "numberboard_body_161", "numberboard_body_177", "numberboard_body_178")
        .build();


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.Diesel4ED172_E; }

    public Diesel4ED172T_E(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "GLNT");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "AA");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public String getInventoryName() { return "CEE 4ED-172T (EMD Repower)"; }

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
