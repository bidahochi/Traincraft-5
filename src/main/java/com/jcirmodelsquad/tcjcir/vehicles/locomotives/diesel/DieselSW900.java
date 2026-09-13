package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSW900 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sw900")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_crl_body_422", "marker_crl_body_423", "marker_crl_body_424",
            "marker_crl_body_425")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_double_body_403", "front_numberboard_double_body_404", "front_numberboard_single_body_76",
            "front_numberboard_single_body_77", "numberboard_body_144", "numberboard_body_145",
            "numberboard_body_417", "numberboard_body_421", "rear_numberboard_double_body_407",
            "rear_numberboard_double_body_408", "rear_numberboard_single_body_405", "rear_numberboard_single_body_406")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW900;
    }
    public DieselSW900(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Electric Fuels Corporation");
        InsertTexture(1, "Conrail Shared Assets");
        InsertTexture(2, "Avanste Northeastern (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Deadwood & La Mesa", LockoutGroup.DLMR);
        InsertTexture(5, "New York Central");
        InsertTexture(6, "New York Central");
        InsertTexture(7, "Great Lakes & Northern Territories");
        InsertTexture(8, "Wesser Valley");
        InsertTexture(9, "Falcon Area Rapid Transit MOW");
        InsertTexture(10, "Sacramento Northern (Ex FNCC)");
        InsertTexture(11, "SP Tigerstripe");
        InsertTexture(12, "Peninsula Development & Improvement Company (Bida Fictional)"/*, LockoutGroup.PDEV*/);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String transportYear() {
        return "1954-1969";
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