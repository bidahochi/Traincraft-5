package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP39Dash2 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp39dash2")
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
        return EnumSounds.DieselGP39Dash2;
    }
    public DieselGP39Dash2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "MKT");
        InsertTexture(1, "FURRX (Ex CSWR)");
        InsertTexture(2, "Nomansi & Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(3, "NEP (Late)", LockoutGroup.CUBED);
        InsertTexture(4, "CSXT (YN3)");

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
        return "1974-1984";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP39-2";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}