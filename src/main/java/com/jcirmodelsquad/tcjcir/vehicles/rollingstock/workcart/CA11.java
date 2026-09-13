package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.enums.LockoutGroup;

public class CA11 extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:ca11")
        .defaults()
        .emissiveOnly(
            "rear_center", "front_center",
            "front_right", "front_left", "rear_left", "rear_right",
            "front_headlight_upper", "front_headlight_lower",
            "left_side_upper", "left_side_lower")
        .build();

    public CA11(World world) {
        super(world);
        InsertTexture(0, "UP");
        InsertTexture(1, "WP");
        InsertTexture(2, "FNCC (Regal)", LockoutGroup.FNCC);
        InsertTexture(3, "Generic");
        InsertTexture(4, "GLC");
        InsertTexture(5, "GLNT");
        InsertTexture(6, "CNRC C1-C5 (Bida Fictional)"/*, LockoutGroup.CNRC*/);
        InsertTexture(7, "");
        InsertTexture(8, "");
        InsertTexture(9, "");
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
}
