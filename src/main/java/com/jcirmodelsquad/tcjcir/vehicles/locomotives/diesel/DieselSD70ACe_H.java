package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD70ACe_H extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd70ace_h")
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
        return EnumSounds.DieselSD70ACe_H;
    }
    public DieselSD70ACe_H(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "hey louis");
        InsertTexture(1, "NS 1065 (Savannah & Atlanta)");
        InsertTexture(2, "NS 1066 (New York Central)");
        InsertTexture(3, "NS 1067 (Reading)");
        InsertTexture(4, "NS 1068 (Erie)");
        InsertTexture(5, "NS 1069 (Virginian)");
        InsertTexture(6, "NS 1070 (Wabash)");
        InsertTexture(7, "NS 1071 (Central Railroad of New Jersey)");
        InsertTexture(8, "NS 1072 (Illinois Terminal)");
        InsertTexture(9, "NS 1073 (Penn Central)");
        InsertTexture(10, "NS 1074 (Delaware Lackawanna & Western)");
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
        return "EMD SD70ACe (Heritage Units)";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}