package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;

public class HBC1Bboose extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:hbc1b")
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

    public HBC1Bboose(World world) {
        super(world);
        InsertTexture(0, "Ann Arbor");
        InsertTexture(1, "WV");
        InsertTexture(2, "GCN");
        InsertTexture(3, "GCM", train.common.enums.LockoutGroup.GCM);
        InsertTexture(4, "TIRY");
        InsertTexture(5, "TIRY");
        InsertTexture(6, "CRL");
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
