package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP9 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp9")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_534", "marker_body_535", "marker_body_536",
            "marker_body_537", "marker_body_538", "marker_body_539",
            "marker_wm_chop_body_11", "marker_wm_chop_body_12")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_127", "front_numberboard_body_128", "front_numberboard_body_532",
            "front_numberboard_body_533", "front_numberboard_chop_body_5", "front_numberboard_chop_body_6",
            "numberboard_chop_body_2", "numberboard_chop_body_297", "numberboard_chop_body_298",
            "numberboard_chop_body_3", "numberboard_chop_body_317", "numberboard_chop_body_318",
            "numberboard_chop_body_545", "numberboard_chop_body_546", "rear_numberboard_body_231",
            "rear_numberboard_body_232")
        .build();


    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP9;
    }
    public DieselGP9(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "BN 1783");
        InsertTexture(1, "Southern Pacific (Black Widow Passenger)");
        InsertTexture(2, "Southern Pacific (Black Widow)");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Western Pacific");
        InsertTexture(5, "Avanste Northeastern (Late) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(6, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(7, "Lisha & Watson (High Hood)", LockoutGroup.LW);
        InsertTexture(8, "Lisha & Watson (Chop Nose)", LockoutGroup.LW);
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "Nomansi & Eastern Pacific (Early)", LockoutGroup.CUBED);
        InsertTexture(11, "Nomansi & Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(12, "Milwaukee Road");
        InsertTexture(13, "Canadian Pacific (Script)");
        InsertTexture(14, "Denver & Rio Grande Western (Early)");
        InsertTexture(15, "Denver & Rio Grande Western");
        InsertTexture(16, "Denver & Rio Grande Western (Big Logo)");
        InsertTexture(17, "Spokane Portland & Seattle (Early)");
        InsertTexture(18, "Spokane Portland & Seattle (Middle Era)");
        InsertTexture(19, "Spokane Portland & Seattle (Late)");
        InsertTexture(20, "Magnolia Acres", LockoutGroup.MAG);
        InsertTexture(21, "New York Central (Early)");
        InsertTexture(22, "New York Central (Lightning Bolt)");
        InsertTexture(23, "New York Central (Late)");
        InsertTexture(24, "New York Central (Grey Lighting Bolt)");
        InsertTexture(25, "ATSF (Pinstripe)");
        InsertTexture(26, "ATSF (Zebrastripe)");
        InsertTexture(27, "Penn Central");
        InsertTexture(28, "Union Pacific");
        InsertTexture(29, "Consolidated Rail Corporation");
        InsertTexture(30, "Western Pacific");
        InsertTexture(31, "ADT (Ex UP)"/*, LockoutGroup.ADT*/);
        InsertTexture(32, "ADT"/*, LockoutGroup.ADT*/);
        InsertTexture(33, "Northern Pacific");
        InsertTexture(34, "BN 1742");
        InsertTexture(35, "BN 1755");
        InsertTexture(36, "BN 1918");
        InsertTexture(37, "BN 1949");
        InsertTexture(38, "NP (Phase II)");
        InsertTexture(39, "NP (Phase II no DB)");
        InsertTexture(40, "NP (Phase III)");
        InsertTexture(41, "NP (Phase III no DB)");
        InsertTexture(42, "DLMR (Early)", LockoutGroup.DLMR);
        InsertTexture(43, "DLMR (Late)", LockoutGroup.DLMR);
        InsertTexture(44, "DLMR (MOW)", LockoutGroup.DLMR);
        InsertTexture(45, "MMID (High Nose)");
        InsertTexture(46, "MMID (Chop Nose)");
        InsertTexture(47, "SGPR 25 (Patch) (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(48, "WM (As Delivered)");
        InsertTexture(49, "WM (Chop Nose)");
        InsertTexture(50, "WM (Chop Nose Circus Scheme)");
        InsertTexture(51, "Chessie System");
        InsertTexture(52, "Southern Pacific (Bloodynose)");
        InsertTexture(53, "C&O (Early)");
        InsertTexture(54, "C&O (Late)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.15, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String transportYear() {
        return "1954-1963";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP9";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}