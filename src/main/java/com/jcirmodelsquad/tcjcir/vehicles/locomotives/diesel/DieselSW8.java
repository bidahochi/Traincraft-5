package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSW8 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sw8")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_crl_body_422", "marker_crl_body_423", "marker_crl_body_424",
            "marker_crl_body_425")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_double_body_403", "front_numberboard_double_body_404", "front_numberboard_single_body_76",
            "front_numberboard_single_body_77", "numberboard_body_144", "numberboard_body_145",
            "numberboard_body_417", "numberboard_body_421", "rear_numberboard_double_body_407",
            "rear_numberboard_double_body_408", "rear_numberboard_single_body_405", "rear_numberboard_single_body_406")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW8;
    }
    public DieselSW8(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "DRIR 553");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "NYC");
        InsertTexture(3, "NYC");
        InsertTexture(4, "Strasbooger/Strasboner/Strasburger/Strasburry Dough Boy");//if you change this i will end your life
        InsertTexture(5, "EMDX");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }



    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1950-1954";
    }

    @Override
    public String getInventoryName() {
        return "EMD SW8";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
