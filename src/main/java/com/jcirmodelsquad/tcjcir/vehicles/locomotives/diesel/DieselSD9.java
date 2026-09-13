package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD9 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd9")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_sd7_body_264", "marker_sd7_body_265", "marker_sd7_body_266",
            "marker_sd7_body_267", "marker_sd9_body_223", "marker_sd9_body_225",
            "marker_sd9_body_97", "marker_sd9_body_98", "marker_two")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_35", "front_numberboard_body_36", "numberboard_chop_body_356",
            "numberboard_chop_body_357", "rear_numberboard_body_91", "rear_numberboard_body_92")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD9;
    }
    public DieselSD9(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "SP (1980s)");
        InsertTexture(1, "SP (Trashcan gaming)");
        InsertTexture(2, "MILW");
        InsertTexture(3, "MILW (Typeface)");
        InsertTexture(4, "FNCC 201 & 202 (Kit-L)", LockoutGroup.FNCC);
        InsertTexture(5, "Blandsville Pacific");
        InsertTexture(6, "OC&G", LockoutGroup.CUBED);
        InsertTexture(7, "DRGW");
        InsertTexture(8, "DRGW (5305, Low Hood)");
        InsertTexture(9, "ADT"/*, LockoutGroup.ADT*/);
        InsertTexture(10, "WFR (actually they both cring)");
        InsertTexture(11, "DLMR", LockoutGroup.DLMR);
        InsertTexture(12, "WV");
        InsertTexture(13, "CNRC 6100 - 6102 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(14, "DMIR (Early)");
        InsertTexture(15, "DMIR (Arrow)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.1, -0.45); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.39F; }

    @Override
    public String transportYear() {
        return "1954-1959";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD9";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}