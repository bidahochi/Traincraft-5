package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;

public class WPShops600Series extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:wp_shops_600")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_left_marker", "front_right_marker", "rear_left_marker",
            "rear_right_marker")
        .emissiveOnly(
            "front_gyralite", "rear_gyralite",
            "front_right_marker", "front_left_marker",
            "rear_right_marker", "rear_left_marker")
        .build();

    public WPShops600Series(World world) {
        super(world);
        InsertTexture(0, "WP");
        InsertTexture(1, "WP");
        InsertTexture(2, "WP MOW");
        InsertTexture(3, "SN");
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
        return 2.125F;
    }
}
