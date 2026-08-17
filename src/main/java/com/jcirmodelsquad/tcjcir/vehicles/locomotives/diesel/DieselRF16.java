package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselRF16 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:rf16")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_335", "marker_body_336", "marker_body_531",
            "marker_body_532")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRF16;
    }
    public DieselRF16(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Pennsylvania (1 Stipe)");
        InsertTexture(1, "Delaware & Hudson");
        InsertTexture(2, "Michigan Northern");
        InsertTexture(3, "Baltimore & Ohio");
        InsertTexture(4, "Baltimore & Ohio (Late)");
        InsertTexture(5, "Baltimore & Ohio (Late, with plow)");
        InsertTexture(6, "New York Central");
        InsertTexture(7, "New York Central (Late)");
        InsertTexture(8, "Monongahela");
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "A-Team");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.3, -0.37); }


    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }

    

    @Override
    public String getInventoryName() {
        return "BLH RF-16";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
