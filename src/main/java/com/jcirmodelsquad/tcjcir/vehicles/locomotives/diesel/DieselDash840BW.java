package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash840BW extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dash840bw")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_aussy_body_286", "marker_aussy_body_287", "marker_body_284",
            "marker_body_285", "marker_crl_body_172", "marker_crl_body_173",
            "rear_marker_box_body_399", "rear_marker_box_body_400")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_159", "numberboard_body_160", "numberboard_body_384",
            "numberboard_body_385", "numberboard_upper_body_256", "numberboard_upper_body_258")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash840BW;
    }
    public DieselDash840BW(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF");
        InsertTexture(1, "borgborg");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(4, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(5, "Coyote & Fort Woods (Bida Freelance)");
        InsertTexture(6, "");
        InsertTexture(7, "");
        InsertTexture(8, "");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.35, -0.35); }
    

    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1988-1992";
    }

    @Override
    public String getInventoryName() {
        return "GE Dash 8-40BW";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
