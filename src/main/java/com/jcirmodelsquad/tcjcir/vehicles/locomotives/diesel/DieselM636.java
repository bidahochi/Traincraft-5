package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LightFixtureType;
import train.common.api.LiquidManager;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM636 extends DieselTrain {
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:m636")
        .defaults()
        .steadyHeadlight(
            "front_headlight_n_upper", "front_headlight_n_lower",
            "front_headlight_rock_right", "front_headlight_rock_left",
            "rear_headlight_lower", "rear_headlight_upper",
            "front_headlight_high_right", "front_headlight_high_left",
            "front_headlight_vertical_upper", "front_headlight_vertical_lower")
        .fixtureType(
            LightFixtureType.NUMBERBOARD,
            "front_numberboard_right", "front_numberboard_left",
            "rear_numberboard_right", "rear_numberboard_left")
        .fixtureType(
            LightFixtureType.MARKER_LIGHT,
            "front_classlight_right", "front_classlight_left",
            "rear_marker_right", "rear_marker_left")
        .gyralite("front_gyralite_right", "front_gyralite_left")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM636D;
    }
    public DieselM636(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FCP (Small Words)");
        InsertTexture(1, "FCP (Big Letters)");
        InsertTexture(2, "FCP (but its BLUe)");
        InsertTexture(3, "FCP (Southern Pacific Obsession)");
        InsertTexture(4, "Blandsville & Blankerston");

    }

    @Override
    protected RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
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
        return "MLW M636 (Divot End)";
    }

    
    

}
