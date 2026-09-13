package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselCE8 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:ce8")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_124", "marker_body_126")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_141", "numberboard_body_142", "rear_numberboard_right_body_196",
            "rear_numberboard_right_body_197")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCE8;
    }
    public DieselCE8(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "FNCC 99 (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "Peninsula Development & Improvement Company (Bida Fictional)"/*, LockoutGroup.PDEV*/);
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "");
        InsertTexture(4, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.16, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "CEE CE8";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public String transportYear() {
        return "1980";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
