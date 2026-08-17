package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselFP7A extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:fp7a")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_461", "marker_body_462")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_413", "numberboard_body_414")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFP7A;
    }
    public DieselFP7A(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the benis sus
        InsertTexture(0, "Readding a fucking book");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "Flatiron Northwestern");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Western Pacific");
        InsertTexture(5, "Joblogh Rail Network");
        InsertTexture(6, "Great Lakes & Northern Territories");
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.19, -0.35); }


    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.9F;
    }

    @Override
    public String transportYear() {
        return "1949-1953";
    }

    @Override
    public String getInventoryName() {
        return "EMD FP7A";
    }

    
    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
