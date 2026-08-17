package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselCF7angle3 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:cf7angle3")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_39", "marker_body_41", "marker_brw_42_body_455",
            "marker_brw_42_body_456")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_129", "numberboard_body_130", "rear_numberboard_right_body_113",
            "rear_numberboard_right_body_114")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7angle3;
    }
    public DieselCF7angle3(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "ANE (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(1, "FNCC (CEE Rebuilt)", LockoutGroup.FNCC);
        InsertTexture(2, "FNCC (Ex CEE Ne WP)", LockoutGroup.FNCC);
        InsertTexture(3, "FNCC 27", LockoutGroup.FNCC);
        InsertTexture(4, "KCRC 2601 (FNCC 28)", LockoutGroup.FNCC);
        InsertTexture(5, "KCRC 2583 (FNCC 29)", LockoutGroup.FNCC);
        InsertTexture(6, "SNCT 102 (Post 1983) (Protolance)", LockoutGroup.SNCT);
        InsertTexture(7, "SNCT 103 (Post 1983) (Protolance)", LockoutGroup.SNCT);
        InsertTexture(8, "SGPR 582 (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(9, "SGPR 585 (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(10, "SGPR 587 (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(11, "SGPR 590 (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(12, "SGPR 924/925 (Arrival Scheme) (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(13, "SGPR 924/925 (Repaint) (Bida Fictional)"/*, LockoutGroup.SGPR*/);
        InsertTexture(14, "ARSR 2497", LockoutGroup.BIDA);
        InsertTexture(15, "ARSR 2610", LockoutGroup.BIDA);
        InsertTexture(16, "C&PV", LockoutGroup.CPV);
        InsertTexture(17, "CFW 1504", LockoutGroup.BIDA);
        InsertTexture(18, "FURRX");
        InsertTexture(19, "GLNT");
        InsertTexture(20, "CNRC 4100 (Ex FNCC 41) (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(21, "CNRC 4101-4102 (Ex ATSF) (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(22, "KTR (Ex ATSF 2581)");
        InsertTexture(23, "");
        InsertTexture(24, "");
        InsertTexture(25, "");
        InsertTexture(26, "");
        InsertTexture(27, "");
        InsertTexture(28, "");
        InsertTexture(29, "");
        InsertTexture(30, "");
        InsertTexture(31, "");
        InsertTexture(32, "");
        InsertTexture(33, "");
        InsertTexture(34, "");
        InsertTexture(35, "");
        InsertTexture(36, "");
        InsertTexture(37, "");
        InsertTexture(38, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F; }

    @Override
    public String getInventoryName() {
        return "EMD CF7 (Angle Cab)";
    }

    @Override
    public String transportYear() {
        return "1969-1978";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
