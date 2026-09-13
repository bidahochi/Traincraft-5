package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP39 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp39")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_10", "marker_body_11", "marker_body_444",
            "marker_body_445", "marker_two_body_440", "marker_two_body_442",
            "marker_two_body_446")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_73", "front_numberboard_body_74", "numberboard_body_379",
            "numberboard_body_380", "rear_numberboard_body_536", "rear_numberboard_body_537",
            "rear_numberboard_body_95", "rear_numberboard_body_96")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP39;
    }
    public DieselGP39(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Atlanta & St Andrews Bay");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "CSXT (YN2)");
        InsertTexture(3, "CSXT (Bluedown)");
        InsertTexture(4, "Chessie System");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.15, -0.325); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F; }

    @Override
    public String transportYear() {
        return "1969-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP39";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}