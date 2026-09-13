package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.enums.LockoutGroup;

public class Tender10k extends Tender  {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:tender10k")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_49", "marker_body_51")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_72")
        .build();


    public Tender10k(World world) {
        super(world,  LiquidManager.WATER_FILTER);
       
        InsertTexture(0, "Blank");
        InsertTexture(1, "Spoof");
        InsertTexture(2, "WP");
        InsertTexture(3, "NEP-WP 334 aux tender", LockoutGroup.CUBED);
        InsertTexture(4, "WPMW");
        InsertTexture(5, "DLMR Herald Logo", LockoutGroup.DLMR);
        InsertTexture(6, "DLMR Text Logo", LockoutGroup.DLMR);
        InsertTexture(7, "FMSR 561", LockoutGroup.FMSR);
        InsertTexture(8, "FMSR 570", LockoutGroup.FMSR);
        InsertTexture(9, "FMSR 574", LockoutGroup.FMSR);
        InsertTexture(10, "FMSR 577", LockoutGroup.FMSR);

    }

    @Override
    public String getInventoryName() {
        return "WP 10,000 Gal Tender";
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public boolean canBeRidden() {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.8F;
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}