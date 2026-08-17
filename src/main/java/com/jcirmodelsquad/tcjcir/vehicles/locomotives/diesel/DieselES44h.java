package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselES44h extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:es44h")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_aussy_body_214", "marker_aussy_body_215", "marker_body_120",
            "marker_body_121")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_135", "numberboard_body_136", "numberboard_body_52",
            "numberboard_body_54", "numberboard_upper_body_105", "numberboard_upper_body_203")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselES44h;
    }
    public DieselES44h(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "NS 8025 (Monongahela)");
        InsertTexture(1, "NS 8098 (Conrail)");
        InsertTexture(2, "NS 8099 (Southern)");
        InsertTexture(3, "NS 8100 (NKP)");
        InsertTexture(4, "NS 8101 (Central of Georgia)");
        InsertTexture(5, "NS 8102 (Pennsylvania)");
        InsertTexture(6, "NS 8103 (Norfolk & Western)");
        InsertTexture(7, "NS 8104 (LV Pre Jun 2012)");
        InsertTexture(8, "NS 8104 (LV Post Jun 2012)");
        InsertTexture(9, "NS 8105 (Interstate)");
        InsertTexture(10, "NS 8114 (NS 1942-1982)");
        InsertTexture(11, "CSX 1976 (Conrail)");
        InsertTexture(12, "CSX 1973 (Chessie)");
        InsertTexture(13, "CSX 1827 (Baltimore & Ohio)");
        InsertTexture(14, "CSX 1869 (Chesapeake & Ohio)");
        InsertTexture(15, "CSX 1982 (Seaboard)");
        InsertTexture(16, "CSX 1850 (Louisville & Nashville)");
        InsertTexture(17, "CSX 1871 (Atlantic Coast Line)");
        InsertTexture(18, "CSX 1853 (New York Central)");
        InsertTexture(19, "CSX 1897 (Monon)");
        InsertTexture(20, "CSX 1836 (Richmond Fredericksburg & Potomac)");
        InsertTexture(21, "CSX 1972 (Family Lines)");
        InsertTexture(22, "CSX 1852 (Western Maryland)");
        InsertTexture(23, "CSX 1899 (Pere Marquette)");
        InsertTexture(24, "CSX 1967 (Seaboard Coast Line)");
        InsertTexture(25, "CSX 1875 (Pittsburgh & Lake Erie)");
        InsertTexture(26, "CSX 1834 (Georgia Railroad)");
        InsertTexture(27, "CSX 1877 (Chicago & Eastern Illinois)");
        InsertTexture(28, "CSX 1901 (Seaboard Air Line)");
        InsertTexture(29, "CSX 1851 (Nashville Chattanooga & St Louis)");
        InsertTexture(30, "CSX 1902 (Clinchfield)");
        InsertTexture(31, "CSX 1981 (Pan Am Railways)");
        InsertTexture(32, "CSX 911 (Fire)");
        InsertTexture(33, "CSX 1776 (Military)");
        InsertTexture(34, "CSX 3194 (Police)");
        InsertTexture(35, "IAIS (513)");
        InsertTexture(36, "IAIS (516)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.4, -0.35); }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    @Override
    public String transportYear() {
        return "2003-Present";
    }

    @Override
    public String getInventoryName() {
        return "GE ES44 (Hertiable Units)";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
