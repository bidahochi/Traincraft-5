package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselCF7angle extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:cf7angle")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_39", "marker_body_41")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_138", "numberboard_body_139", "rear_numberboard_right_body_118",
            "rear_numberboard_right_body_119")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselCF7angle;
    }
    public DieselCF7angle(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF 2444");
        InsertTexture(1, "ATSF 2546");
        InsertTexture(2, "Washington Central Railroad");
        InsertTexture(3, "Columbus & Greenville Railway");
        InsertTexture(4, "Red River Valley & Western");
        InsertTexture(5, "Twin Cities & Western");
        InsertTexture(6, "Los Angeles Junction");
        InsertTexture(7, "WATCO 6");
        InsertTexture(8, "WATCO 7");
        InsertTexture(9, "WATX 1002");
        InsertTexture(10, "WAMX 7108");
        InsertTexture(11, "WATX 2633");
        InsertTexture(12, "Grafton & Upton");
        InsertTexture(13, "Delta Southern");
        InsertTexture(14, "Midwest Coal Handling");
        InsertTexture(15, "Mississippi & Skuna Valley D-5");
        InsertTexture(16, "Gloster Southern");
        InsertTexture(17, "Amtrak 585");
        InsertTexture(18, "Nittany & Blad Eagle");
        InsertTexture(19, "Florida Central 50");
        InsertTexture(20, "");
        InsertTexture(21, "");
        InsertTexture(22, "");
        InsertTexture(23, "");
        InsertTexture(24, "");
        InsertTexture(25, "");
        InsertTexture(26, "");
        InsertTexture(27, "");
        InsertTexture(28, "");
        InsertTexture(29, "");
        InsertTexture(30, "");
        InsertTexture(31, "");
        InsertTexture(32, "");
        InsertTexture(33, "");
        InsertTexture(34, "");
        InsertTexture(35, "");
        InsertTexture(36, "");
        InsertTexture(37, "");
        InsertTexture(38, "");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.5, 0.2, -0.35); }
    
    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String transportYear() {
        return "1969-1978";
    }

    @Override
    public String getInventoryName() {
        return "EMD CF7 Angle Cab";
    }



    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
