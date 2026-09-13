package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSW1000 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sw1000")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_177", "marker_body_178", "marker_body_216",
            "marker_body_222", "marker_body_376", "marker_body_377",
            "marker_body_402", "marker_body_404")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_175", "numberboard_body_176", "numberboard_body_217",
            "numberboard_body_221", "numberboard_body_392", "numberboard_body_393")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW1000;
    }
    public DieselSW1000(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Burlington Northern");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(3, "Rio Grande");
        InsertTexture(4, "Nomansi and Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(5, "Southern Peenor Belt");
        InsertTexture(6, "Southern Port Belt (BN Patch)");
        InsertTexture(7, "Thunder Valley Transportation District (Falcon Area Rapid Transit)");
        InsertTexture(8, "ANW", LockoutGroup.ANW);
        InsertTexture(9, "ANW (Chevrons)", LockoutGroup.ANW);
        InsertTexture(10, "Peninsula Development & Improvement Company (Bida Fictional)"/*, LockoutGroup.PDEV*/);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.1, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.175F; }

    @Override
    public String transportYear() {
        return "1966-1972";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW1000";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
