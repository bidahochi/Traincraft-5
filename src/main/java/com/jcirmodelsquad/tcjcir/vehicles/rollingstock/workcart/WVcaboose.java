package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.api.RollingStockSkinLightingProfiles;

public class WVcaboose extends AbstractWorkCart
{
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:wv_caboose")
        .defaults()
        .emissiveOnly(
            "rear_center", "rear_left", "rear_right", "front_right", "front_left")
        .build();

    public WVcaboose(World world) {
        super(world);
        InsertTexture(0, "ATSF");
        InsertTexture(1, "BN");
        InsertTexture(2, "MT&S");
        InsertTexture(3, "OWO");
        InsertTexture(4, "SOO");
        InsertTexture(5, "Generic Green");
        InsertTexture(6, "Magnolia");
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
        return 0.3125F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 1.9375F;
    }
}
