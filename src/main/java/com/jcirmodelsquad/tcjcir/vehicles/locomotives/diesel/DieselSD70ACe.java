package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD70ACe extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd70ace")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_cn_body_273", "marker_cn_body_274", "marker_cn_body_279",
            "marker_cn_body_281")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_229", "numberboard_body_230", "numberboard_body_34",
            "numberboard_body_39")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD70ACe;
    }
    public DieselSD70ACe(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "FURRX Lease");
        InsertTexture(2, "CSXT Thundercab");
        InsertTexture(3, "PRLX \"C&O Heritable\"");
        InsertTexture(4, "CSXT What If Whispercab, Hunter Harrison Killed it");
        InsertTexture(5, "BNSF Whispercab");
        InsertTexture(6, "BNSF Thundercab");
        InsertTexture(7, "KCS Grey Ghost Thundercab");
        InsertTexture(8, "KCS Belle Thundercab");
        InsertTexture(9, "KCS Belle Whispercab");
        InsertTexture(10, "UP Flag Whispercab");
        InsertTexture(11, "UP Flag Thundercab");
        InsertTexture(12, "UP Lettering Whispercab");
        InsertTexture(13, "UP Lettering Thundercab");
        InsertTexture(14, "NS Second Order");
        InsertTexture(15, "Montana Rail Link");
        InsertTexture(16, "EMDX Demonstrator Whispercab");
        InsertTexture(17, "CN Demonstrator Whispercab");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
        
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.15, 0.4, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.45F; }

    @Override
    public String transportYear() {
        return "2003-Present";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD70ACe";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
