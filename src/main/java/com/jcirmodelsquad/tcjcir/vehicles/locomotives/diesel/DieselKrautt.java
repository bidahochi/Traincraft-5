package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselKrautt extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:krautt")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_marker_l_body_193", "front_marker_l_body_194", "rear_marker_l",
            "rear_marker_r")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_left_body_191", "front_numberboard_left_body_386", "front_numberboard_left_body_388",
            "front_numberboard_right_body_192", "front_numberboard_right_body_387", "front_numberboard_right_body_389")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselKrautt;
    }
    public DieselKrautt(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
    }

    @Override
    public String transportCountry()
    {
        return "DE";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.4, 0.2, -0.3); }
    



    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "Krauss-Maffei ML-4000";
    }

    



    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
