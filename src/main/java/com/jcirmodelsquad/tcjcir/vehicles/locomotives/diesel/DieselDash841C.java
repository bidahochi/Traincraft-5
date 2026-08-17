package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselDash841C extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dash841c")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_327", "marker_body_328", "marker_crl_body_465",
            "marker_crl_body_466", "marker_sou_body_467", "marker_sou_body_468")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_322", "numberboard_body_323", "numberboard_body_419",
            "numberboard_body_420")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash841C;
    }
    public DieselDash841C(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Canadian National");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "CSLX");
        InsertTexture(3, "WP (Early)");
        InsertTexture(4, "WP (Late)");
        InsertTexture(5, "WP (Rebuilt)");
        InsertTexture(6, "uhhhhhhhhhh peenor lol");
        InsertTexture(7, "Chicago and North Western");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.05, 0.3, -0.35); }


    
    
    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.34F;
    }

    @Override
    public String transportYear() {
        return "1993";
    }

    @Override
    public String getInventoryName() {
        return "GE C41-8";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
