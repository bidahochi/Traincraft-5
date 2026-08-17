package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD40dash3 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sd40dash3")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_284", "numberboard_body_285", "rear_numberboard_body_208",
            "rear_numberboard_body_209")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40dash3;
    }
    public DieselSD40dash3(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "CSXT (RCO Equipped)");
        InsertTexture(1, "CSXT");
        InsertTexture(2, "Ann Arbor");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.1, 0.2, -0.35); }


    

    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "2011-Present";
    }

    @Override
    public String getInventoryName() {
        return "CSX SD40-3";
    }


    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
