package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselC425 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:c425")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_126", "marker_body_127", "marker_body_171",
            "marker_body_172")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_157", "front_numberboard_body_158", "numberboard_body_128",
            "numberboard_body_129")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselC425;
    }
    public DieselC425(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Penn Central");
        InsertTexture(1, "Chicago Northwestern");
        InsertTexture(2, "Spokane, Portland & Seattle");
        InsertTexture(3, "Burlington Northern");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3, 0.2, -0.35); }
    

    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String getInventoryName() {
        return "ALCo C425";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
