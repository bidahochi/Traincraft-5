package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselRS2 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:rs2")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_1_body_377", "marker_1_body_380", "marker_2_body_150",
            "marker_2_body_152", "marker_2_body_373", "marker_2_body_374",
            "marker_2_body_375", "marker_2_body_376", "marker_2_body_378",
            "marker_2_body_379", "marker_2_body_381", "marker_2_body_382",
            "marker_body_250", "marker_body_251", "marker_body_384",
            "marker_body_385", "marker_body_386", "marker_body_387")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_397", "numberboard_body_398", "numberboard_body_399",
            "numberboard_body_400")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselRS2;
    }
    public DieselRS2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Deleware & Hudson");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "sans fey undertail rayroad");
        InsertTexture(3, "Lehigh & New England");
        InsertTexture(4, "Lehigh & New England (late)");
        InsertTexture(5, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(6, "AGW", LockoutGroup.AGW);
        InsertTexture(7, "WM (Fireball)");
        InsertTexture(8, "WM (Speed Lettering)");
        InsertTexture(9, "MONON (early, steam gen)");
        InsertTexture(10, "MONON (early)");
        InsertTexture(11, "MONON (steam gen)");
        InsertTexture(12, "MONON");

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
        return "ALCo RS-2";
    }

    



    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
