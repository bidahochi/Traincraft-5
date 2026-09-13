package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

//haha sw1 go brrrr
public class DieselSW1200 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sw1200")
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
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1200;
    }
    public DieselSW1200(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Illinois Terminal");
        InsertTexture(1, "Burlington Northern");
        InsertTexture(2, "Denver & Rio Grande Western");
        InsertTexture(3, "Denver & Rio Grande Western (Late)");
        InsertTexture(4, "Chicago & North Western");
        InsertTexture(5, "Great Northern");
        InsertTexture(6, "Milwaukee Road");
        InsertTexture(7, "Minneapolis, Northfield and Southern");
        InsertTexture(8, "Great Lakes & Northern Territories");
        InsertTexture(9, "Fremont & Elkhorn Valley Railroad");
        InsertTexture(10, "West Creek Pacific");
        InsertTexture(11, "Blandsville & Blankerston");
        InsertTexture(12, "JRN");
        InsertTexture(13, "JRN (Yellow Cab)");
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
        return "1954-1966";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW1200";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
