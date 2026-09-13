package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP30 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp30")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_nose", "rear_marker_high", "rear_marker_low")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_73", "front_numberboard_body_74", "numberboard_body_383",
            "numberboard_body_385", "rear_numberboard_body_41", "rear_numberboard_body_42")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP30;
    }
    public DieselGP30(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "ICG");
        InsertTexture(1, "ACL");
        InsertTexture(2, "CSX (YN1)");
        InsertTexture(3, "CSX (YN2)");
        InsertTexture(4, "CSX (MoW)");
        InsertTexture(5, "CR");
        InsertTexture(6, "DRGW (Small Logo)");
        InsertTexture(7, "ARR (Rebuilt)");
        InsertTexture(8, "UP");
        InsertTexture(9, "BN 2206");
        InsertTexture(10, "BN 2222");
        InsertTexture(11, "FNCC 250", LockoutGroup.FNCC);
        InsertTexture(12, "OC&G 35", LockoutGroup.CUBED);
        InsertTexture(13, "MAG 84", LockoutGroup.MAG);
        InsertTexture(14, "KCS i mean CGW");
        InsertTexture(15, "DLMR", LockoutGroup.DLMR);
        InsertTexture(16, "B&B");
        InsertTexture(17, "WV");
        InsertTexture(18, "GLNT");
        InsertTexture(19, "GN (Big Sky Blue)");
        InsertTexture(20, "CB&Q");
        InsertTexture(21, "CNW");
        InsertTexture(22, "Seaboard System");
        InsertTexture(23, "Chessie System");
        InsertTexture(24, "Southern Pacific (Bloodynose)");
        InsertTexture(25, "PDEV (Bida Fictional)"/*, LockoutGroup.PDEV*/);
        InsertTexture(26, "FMSR", LockoutGroup.FMSR);
        InsertTexture(27, "C&O");
        InsertTexture(28, "C&O (Blue Dip)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.75, 0.125, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.15F; }

    @Override
    public String transportYear() {
        return "1961-1963";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP30";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}