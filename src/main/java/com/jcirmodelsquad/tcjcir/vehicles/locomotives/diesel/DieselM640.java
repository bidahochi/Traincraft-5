package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM640 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:m640")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_105", "marker_body_117")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_101", "front_numberboard_body_114")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM640;
    }
    public DieselM640(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "CPRail 4744");
        InsertTexture(1, "CPRail 4744 (AC Convertible)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Kingsland Rail");
        InsertTexture(4, "Kingsland Rail");
        InsertTexture(5, "Kingsland Rail");

    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.8, 0.25, -0.4); }
    

    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW M640";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
