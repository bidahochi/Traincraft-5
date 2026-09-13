package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash818BE extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dash818be")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_226", "marker_body_227", "marker_crl_body_282",
            "marker_crl_body_283", "marker_sou_body_284", "marker_sou_body_285")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_221", "numberboard_body_222", "numberboard_body_273",
            "numberboard_body_274")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash818BE;
    }
    public DieselDash818BE(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "FNCC (Kit-L)", LockoutGroup.FNCC);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.1, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String getInventoryName() {
        return "GE B18-8E";
    }

    @Override
    public String transportYear() {
        return "1987";
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