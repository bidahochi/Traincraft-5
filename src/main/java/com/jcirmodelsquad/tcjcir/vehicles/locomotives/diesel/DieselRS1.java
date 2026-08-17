package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselRS1 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:rs1")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_366", "numberboard_body_367")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS1;
    }
    public DieselRS1(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "she ann on my arbor till i bankruptcy");
        InsertTexture(1, "she wabash on my lake till i ann arbor");
        InsertTexture(2, "Tidewater Southern");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "DLMR (Early)", LockoutGroup.DLMR);
        InsertTexture(5, "DLMR (Late)", LockoutGroup.DLMR);
        InsertTexture(6, "FMSR", LockoutGroup.FMSR);
        InsertTexture(7, "ATSF");
        InsertTexture(8, "Glontch");
        InsertTexture(9, "AGW", LockoutGroup.AGW);
        InsertTexture(10, "CYDZ");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.4, 0.35, -0.35); }
    

    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "ALCo RS-1";
    }

    



    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
