package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.enums.LockoutGroup;

public class HBC1Cboose extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:hbc1c")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_left_marker", "front_right_marker", "rear_left_marker",
            "rear_right_marker")
        .emissiveOnly(
            "rear_left", "rear_right", "front_right", "front_left",
            "rear_right_marker", "rear_left_marker",
            "front_left_marker", "front_right_marker")
        .build();

    public HBC1Cboose(World world) {
        super(world);
        InsertTexture(0, "Western Pacific");
        InsertTexture(1, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(2, "Great Lakes & Northern Territories"); // Great Lakes & Nice Tiddies
        InsertTexture(3, "CRL");
        InsertTexture(4, "CRL (MOW)");
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
        return 2.23F;
    }
}
