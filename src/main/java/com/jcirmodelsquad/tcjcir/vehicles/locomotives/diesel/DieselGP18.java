package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP18 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp18")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_534", "marker_body_535", "marker_body_536",
            "marker_body_537", "marker_body_538", "marker_body_539")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_127", "front_numberboard_body_128", "front_numberboard_body_532",
            "front_numberboard_body_533", "numberboard_chop_body_297", "numberboard_chop_body_298",
            "numberboard_chop_body_317", "numberboard_chop_body_318", "numberboard_chop_body_545",
            "numberboard_chop_body_546", "rear_numberboard_body_231", "rear_numberboard_body_232")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP18;
    }
    public DieselGP18(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "NP");
        InsertTexture(1, "BN 1996");
        InsertTexture(2, "T&P");
        InsertTexture(3, "MP (highhood)");
        InsertTexture(4, "MP (chop nose)");
        InsertTexture(5, "MP (eagle repaint)");
        InsertTexture(6, "RI");
        InsertTexture(7, "IC (highhood)");
        InsertTexture(8, "IC (chop nose)");
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "Blandsville & Blankerston");
        InsertTexture(11, "Seaboard System");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.15, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1959-1963";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP18";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}