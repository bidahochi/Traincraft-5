package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSD60 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd60")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_marker", "front_marker_bugeye_body_345", "front_marker_bugeye_body_346",
            "rear_marker_bugeye_body_347", "rear_marker_bugeye_body_348", "rear_marker_high",
            "rear_marker_low")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_147", "front_numberboard_body_148", "rear_numberboard_body_166",
            "rear_numberboard_body_167")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD60;
    }
    public DieselSD60(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Oakway Lease");
        InsertTexture(1, "Oakway Lease");
        InsertTexture(2, "CN (Ex Oakway i think?)");
        InsertTexture(3, "Uncle Pete");
        InsertTexture(4, "NS (SOU order-spec");
        InsertTexture(5, "CR (ohe now thats quality -demoman tf2)");
        InsertTexture(6, "Blandsville & Blanklands Terminal Railroad Association");
        InsertTexture(7, "GLoNT");
        InsertTexture(8, "BN (Tiger Stripe)");
        InsertTexture(9, "CSXT (Yn3)");
        InsertTexture(10, "CSXT (Yn2)");
        InsertTexture(11, "CSXT (Yn1)");
        InsertTexture(12, "CSXT (Stealth)");
        InsertTexture(13, "SOO (White)");
        InsertTexture(14, "SOO (Red)");
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
        return "1984-1991";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD60";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}