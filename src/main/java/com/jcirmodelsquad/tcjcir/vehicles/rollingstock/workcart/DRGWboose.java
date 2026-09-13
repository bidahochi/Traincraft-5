package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.enums.LockoutGroup;

public class DRGWboose extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:drgw_01400_caboose")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "front_left_marker", "front_right_marker", "rear_left_marker",
            "rear_right_marker")
        .emissiveOnly(
            "front_left_marker", "front_right_marker",
            "rear_right_marker", "rear_left_marker")
        .build();

    public DRGWboose(World world) {
        super(world);
        InsertTexture(0, "DRGW (4 Stripe)");
        InsertTexture(1, "DRGW (1 Stripe)");
        InsertTexture(2, "DRGW (1 Stripe, Removed Windows)");
        InsertTexture(3, "DRGW (01450, Induction Antennas)");
        InsertTexture(4, "DRGW (01451-01459, Induction Antennas)");
        InsertTexture(5, "DRGW (01440-01469, Radio Equipped)");
        InsertTexture(6, "DRGW (01470-01479, Radio Equipped)");
        InsertTexture(7, "DRGW (01400-01449, As built)");
        InsertTexture(8, "DRGW (01407-01439, Late Early)");
        InsertTexture(9, "DRGW (01400-01449)");
        InsertTexture(10, "DRGW (01400-01406, Switch Caboose)");
        InsertTexture(11, "DRGW (The Action Road)");
        InsertTexture(12, "DRGW (The Action Road, Removed Windows)");
        InsertTexture(13, "DLMR", LockoutGroup.DLMR);
        InsertTexture(14, "C&PV", LockoutGroup.CPV);
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
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.4F;
    }

    @Override
    public String getInventoryName() {
        return "DRGW 01400 Series Caboose";
    }
}
