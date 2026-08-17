package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class DieselGP20 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp20")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_box_chop_body_263", "marker_box_chop_body_265", "marker_box_lownose_body_266",
            "marker_box_lownose_body_267", "marker_sd9_body_259", "marker_sd9_body_261")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_72", "front_numberboard_body_73", "numberboard_chop_body_144",
            "numberboard_chop_body_145", "rear_numberboard_body_135", "rear_numberboard_body_136")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP20;
    }
    public DieselGP20(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "EMD Demonstrator");
        InsertTexture(1, "Western Pacific");
        InsertTexture(2, "Union Pacific \"Omaha GP20\" ");
        InsertTexture(3, "Union Pacific (Official Ord)");
        InsertTexture(4, "Southern Pacific");
        InsertTexture(5, "Southern Pacific (GP20R)");
        InsertTexture(6, "New York Central");
        InsertTexture(7, "AT&SF");
        InsertTexture(8, "BN 2028 (ex CB&Q)");
        InsertTexture(9, "BN 2012 (ex GN)");
        InsertTexture(10, "GN Empire Builder");
        InsertTexture(11, "GN \"Big Sky Blue\"");
        InsertTexture(12, "CB&Q");
        InsertTexture(13, "D&LMR", LockoutGroup.DLMR);
        InsertTexture(14, "Oil Clusters and Garden", LockoutGroup.CUBED);
        InsertTexture(15, "Lowhood Blank");
        InsertTexture(16, "Highhood Blank");
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
        return "EMD GP20";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}