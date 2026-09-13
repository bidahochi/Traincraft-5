package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselRSFDL extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:rsfdl")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_197", "marker_body_199")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_186", "numberboard_body_187", "numberboard_body_224",
            "numberboard_body_225")
        .fixtureType(train.common.api.LightFixtureType.COMMANDER, "commander")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRSFDL;
    }
    public DieselRSFDL(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "not FNCC");
        InsertTexture(1, "peenore lol");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.1, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo RSFDL";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
