package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.enums.LockoutGroup;

public class ICCBaywindowWP extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:icc_baywindow_wp")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_left_marker", "front_right_marker", "rear_left_marker",
            "rear_right_marker")
        .emissiveOnly(
            "front_right_marker", "front_left_marker",
            "rear_right_marker", "rear_left_marker",
            "rear_center", "front_center",
            "front_right", "front_left", "rear_left", "rear_right")
        .build();

    public ICCBaywindowWP(World world) {
        super(world);
        InsertTexture(0, "WP");
        InsertTexture(1, "WP (Later)");
        InsertTexture(2, "WP (Yard)");
        InsertTexture(3, "Generic");
        InsertTexture(4, "Fox, North Coast & Cascades (Regal)", LockoutGroup.FNCC);
        InsertTexture(5, "Fox, North Coast & Cascades (Regal Late)", LockoutGroup.FNCC);
        InsertTexture(6, "Fox, North Coast & Cascades (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(7, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(8, "DLMR", LockoutGroup.DLMR);
        InsertTexture(9, "DLMR (but somebody spilled the ketchup)", LockoutGroup.DLMR);
        InsertTexture(10, "AGW", LockoutGroup.AGW);
    }

    @Override
    protected RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.1F;
    }


    /**
     * Returns the name of the inventory
     */
    @Override
    public String getInventoryName()
    {
        return "ICC Baywindow Caboose (WP Config)";
    }
}
