package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSF30B extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sf30b")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_fictional_body_105", "marker_fictional_body_106", "marker_fictional_body_308",
            "marker_fictional_body_309")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_184", "numberboard_body_185", "rear_numberboard_fictional_body_150",
            "rear_numberboard_fictional_body_307")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSF30B;
    }
    public DieselSF30B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "MKM Leasing");
        InsertTexture(2, "CNRC 1000 & 1001 (Ex MKM) (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(3, "ATSF 7200 (Early)");
        InsertTexture(4, "ATSF 6149 (Mid)");
        InsertTexture(5, "ATSF 6419 (Late)");
        InsertTexture(6, "BNSF 4276 (Ex ATSF)");
        InsertTexture(7, "Minnesota Commerical 42 (Patch)");
        InsertTexture(8, "Minnesota Commerical 42");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.3, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String getInventoryName() {
        return "ATSF SF30B";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
