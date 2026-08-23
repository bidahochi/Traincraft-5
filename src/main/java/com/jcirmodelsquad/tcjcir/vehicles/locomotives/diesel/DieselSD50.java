package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.api.RollingStockLightFunction;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSD50 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd50")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_marker", "front_marker_bugeye_body_345", "front_marker_bugeye_body_346",
            "rear_marker_bugeye_body_347", "rear_marker_bugeye_body_348", "rear_marker_high",
            "rear_marker_low", "rear_marker_high2", "front_marker2", "rear_marker_low2")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_147", "front_numberboard_body_148", "rear_numberboard_body_166",
            "rear_numberboard_body_167")
        .setSkin("Cyan")//fncc
                .gyralite("frontHighbeamF", "frontHighbeamE")
        .setSkin("Skin16")//fncc
                .gyralite("frontHighbeamF", "frontHighbeamE")//FrontDitchHigh1
                .alternatingDitch(
                        0,
                        RollingStockLightFunction.LampResponse.INCANDESCENT,
                        "FrontDitchHigh1", "RearDitchHigh1")
                .alternatingDitch(
                        1,
                        RollingStockLightFunction.LampResponse.INCANDESCENT,
                        "FrontDitchHigh2", "RearDitchHigh2")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD50;
    }
    public DieselSD50(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CSX (YN1)");
        InsertTexture(1, "CSX (YN2)");
        InsertTexture(2, "CSX (YN3)");
        InsertTexture(3, "CR (First Order)");
        InsertTexture(4, "NS (Ex CR)");
        InsertTexture(5, "DRGW");
        InsertTexture(6, "ANE (1st & 2nd Orders) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(7, "Blandsville & Blanklands Terminal Railroad Association");
        InsertTexture(8, "HBRY");
        InsertTexture(9, "FNCC KIT-L", LockoutGroup.FNCC);
        InsertTexture(10, "FNCC KIT80", LockoutGroup.FNCC);
        InsertTexture(11, "Seaboard System");
        InsertTexture(12, "Chessie System");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.425F; }

    @Override
    public String transportYear() {
        return "1980-1985";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD50";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
