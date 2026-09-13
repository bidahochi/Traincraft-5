package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.enums.LockoutGroup;


public class SMSC1 extends AbstractTankSlug
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:smsc1")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_189", "numberboard_body_190", "rear_numberboard_right_body_144",
            "rear_numberboard_right_body_145")
        .build();

    public SMSC1(World world)
    {
        super(world);
        InsertTexture(0, "FNCC S99 (KIT-L)", LockoutGroup.FNCC);
    }

    @Override
    public String getInventoryName() {
        return "Slug Motor System, C-C, Type 1";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 3.0F;
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}