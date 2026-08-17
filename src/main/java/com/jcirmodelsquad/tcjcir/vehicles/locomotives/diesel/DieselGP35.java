package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP35 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp35")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_two_body_103", "marker_two_body_105", "marker_two_body_61")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_90", "front_numberboard_body_91", "numberboard_body_173",
            "numberboard_body_174", "numberboard_body_323", "rear_numberboard_body_100",
            "rear_numberboard_body_99")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP35;
    }
    public DieselGP35(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Ann Arbor");
        InsertTexture(1, "Ann Arbor (Ferry in the Fog)");
        InsertTexture(2, "Southern");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Western Pacific");
        InsertTexture(5, "Southern Pacific (Early)");
        InsertTexture(6, "Southern Pacific (Late)");
        InsertTexture(7, "Conrail");
        InsertTexture(8, "Blandsville & Blankerston");
        InsertTexture(9, "Port of Latona Terminal Railroad");
        InsertTexture(10, "Great Lakes Central");
        InsertTexture(11, "Union Pacific (Ex-WP)");
        InsertTexture(12, "Conway Scenic");
        InsertTexture(13, "DRGW (Small logo)");
        InsertTexture(14, "DRGW (Big logo)");
        InsertTexture(15, "New York Central");
        InsertTexture(16, "New York Central");
        InsertTexture(17, "Avanste Northeastern"/*, LockoutGroup.ANE*/);
        InsertTexture(18, "AMEX 2019", LockoutGroup.BIDA);
        InsertTexture(19, "Great Lakes & North Territories");
        InsertTexture(20, "Ann Arbor (OLS)");
        InsertTexture(21, "Ann Arbor (Ex SouP)");
        InsertTexture(22, "GLC (Cigar Band)");
        InsertTexture(23, "GLC 385");
        InsertTexture(24, "GLC 391");
        InsertTexture(25, "GLC (Ex Sou)");
        InsertTexture(26, "TSBY");
        InsertTexture(27, "BN 2521");
        InsertTexture(28, "BN 2535");
        InsertTexture(29, "BN 2552 (Ex SLSF)");
        InsertTexture(30, "BN 2576 (Ex SLSF)");
        InsertTexture(31, "GLC 393");
        InsertTexture(32, "CSXT (Blue Down)");
        InsertTexture(33, "CSXT (Yn1)");
        InsertTexture(34, "Seaboard System");
        InsertTexture(35, "Chessie System");
        InsertTexture(36, "WM (Speed Lettering)");
        InsertTexture(37, "WM (Circus)");
        InsertTexture(38, "PDEV (Bida Fictional)"/*, LockoutGroup.PDEV*/);
        InsertTexture(39, "C&O");
        InsertTexture(40, "C&O (Blue Dip)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.7, 0.15, -0.325); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public String transportYear() {
        return "1963-1966";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP35 (Phase 1)";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}