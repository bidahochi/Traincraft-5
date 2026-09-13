package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU18Balt extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:u18balt")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_137", "marker_body_138", "marker_body_149",
            "marker_body_150", "marker_body_82", "marker_body_83")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_117", "numberboard_body_126", "numberboard_body_158",
            "numberboard_body_159")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18Balt;
    }
    public DieselU18Balt(World world) {
        super(world, LiquidManager.dieselFilter());
        

        InsertTexture(0, "PW (Late Orange & Brown)");
        InsertTexture(1, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(2, "FCOM (Ex FNCC)");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "SV 402", LockoutGroup.BIDA);
        InsertTexture(5, "SV 406", LockoutGroup.BIDA);
        InsertTexture(6, "SV 1801", LockoutGroup.BIDA);
        InsertTexture(7, "Grassland Laboratories");
        InsertTexture(8, "GCM", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(9, "CSXT (Stealth)");
        InsertTexture(10, "CSXT (Blue Stripe)");
        InsertTexture(11, "CSXT (Blue Down)");
        InsertTexture(12, "CSXT (Yn1)");
        InsertTexture(13, "CSXT (Yn2)");
        InsertTexture(14, "CSXT (MoW)");
        InsertTexture(15, "Pickens Railway");
        InsertTexture(16, "Seaboard Coast Line");
        InsertTexture(17, "Family Lines (SCL)");
        InsertTexture(18, "Seaboard System");
        InsertTexture(19, "Guilford System (MEC 401)");
        InsertTexture(20, "MEC 405");
        InsertTexture(21, "Texas Utilities (RCO Gear)");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.6, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F; }

    @Override
    public String transportYear() {
        return "1973-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U18B";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
