package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash840C extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dash840c")
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
        return EnumSounds.DieselDash840C;
    }
    public DieselDash840C(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Union Pacific (ITS A SPECTRUM ITS OKAY)");
        InsertTexture(1, "CSXT (Grey Ghost)");
        InsertTexture(2, "CSXT (YN2)");
        InsertTexture(3, "CSXT (YN3)");
        InsertTexture(4, "CSXT (JCIR 6th Anniversary)");
        InsertTexture(5, "CSXT (Ex-SPB)");
        InsertTexture(6, "Conrail");
        InsertTexture(7, "Southern Port Belt");
        InsertTexture(8, "Blandsville & Blankerston");
        InsertTexture(9, "Morristown Tenneva & Southern");
        InsertTexture(10, "FURRX");
        InsertTexture(11, "GCM", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(12, "ITBR");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.05, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String transportYear() {
        return "1987-1992";
    }

    @Override
    public String getInventoryName() {
        return "GE C40-8";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
