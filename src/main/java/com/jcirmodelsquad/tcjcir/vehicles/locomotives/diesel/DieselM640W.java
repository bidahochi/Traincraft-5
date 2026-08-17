package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM640W extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:m640w")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_207", "marker_body_208", "marker_body_79",
            "marker_body_80")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_199", "numberboard_body_200", "numberboard_body_81",
            "numberboard_body_82")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM640W;
    }
    public DieselM640W(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "COW");
        InsertTexture(1, "COW (Special)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Kingsland Rail");

    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.75, 0.35, -0.4); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }

    @Override
    public String getInventoryName() {
        return "MLW M640W";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
