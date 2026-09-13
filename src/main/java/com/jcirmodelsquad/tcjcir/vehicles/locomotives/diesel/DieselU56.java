package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU56 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:u56")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_210", "marker_body_211")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_22", "numberboard_body_23")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU56;
    }
    public DieselU56(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.3, 0.4, -0.3); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.8F; }

    @Override
    public String getInventoryName() {
        return "CEE U56";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}