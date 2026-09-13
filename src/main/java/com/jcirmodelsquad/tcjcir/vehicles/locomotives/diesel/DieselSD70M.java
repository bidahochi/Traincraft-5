package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselSD70M extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd70m")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_marker_bugeye_body_202", "front_marker_bugeye_body_203", "rear_marker_bugeye_body_267",
            "rear_marker_bugeye_body_268", "rear_marker_high", "rear_marker_low")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_175", "numberboard_body_176", "rear_numberboard_body_36",
            "rear_numberboard_body_37")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD70M;
    }
    public DieselSD70M(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "EMD Demo 7001");
        InsertTexture(1, "NS (Early)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "CSXT (YN2)");
        InsertTexture(4, "CSXT (YN3)");
        InsertTexture(5, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.1, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.45F; }

    @Override
    public String transportYear() {
        return "1992-2007";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD70M";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
