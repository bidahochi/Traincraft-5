package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselB23S7 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:b23s7")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_154", "marker_body_155", "marker_body_338",
            "marker_body_339")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_149", "numberboard_body_150", "numberboard_body_328",
            "numberboard_body_329")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselB23S7;
    }
    public DieselB23S7(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "GECX 2000");
        InsertTexture(1, "GECX 2002");
        InsertTexture(2, "Monongahela");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(5, "WP (Early)");
        InsertTexture(6, "WP (Late)");
        InsertTexture(7, "CSXT (Yn3)");
        InsertTexture(8, "CFWD (Bida Fictional)");
        InsertTexture(9, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.1, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String getInventoryName() {
        return "GE B23-S7";
    }

    @Override
    public String transportYear() {
        return "1989-1991";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
