package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

//haha sw1 go brrrr
public class DieselTR4 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:tr4")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_crl_body_386", "marker_crl_body_387", "marker_crl_body_479",
            "marker_crl_body_480")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_double_body_372", "front_numberboard_double_body_373", "front_numberboard_double_body_400",
            "front_numberboard_double_body_401", "front_numberboard_single_body_76", "front_numberboard_single_body_77",
            "numberboard_body_141", "numberboard_body_142", "numberboard_body_381",
            "numberboard_body_385", "rear_numberboard_double_body_376", "rear_numberboard_double_body_377",
            "rear_numberboard_single_body_374", "rear_numberboard_single_body_375")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselTR4;
    }
    public DieselTR4(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Belt Railroad of Chicago");
        InsertTexture(1, "Milwaukee Road");
        InsertTexture(2, "Chesapeake & Ohio");
        InsertTexture(3, "Baltimore & Ohio");
        InsertTexture(4, "Great Lakes & Northern Territories");
        InsertTexture(5, "Blandsville & Blankerston");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override

    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }






    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "EMD TR4 Cow";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
