package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricB_BEL extends ElectricTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:b_bel")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_2_body_310", "marker_2_body_311", "marker_body_176",
            "marker_body_177", "marker_body_86", "marker_body_87")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_132", "numberboard_body_133", "numberboard_early_body_161",
            "numberboard_early_body_162", "numberboard_late_body_172", "numberboard_late_body_173")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricB_BEL;
    }
    public ElectricB_BEL(World world) {
        super(world);
        InsertTexture(0, "Blandsville & Blankerston");
        InsertTexture(1, "FNCC (DAR80)", LockoutGroup.FNCC);
        InsertTexture(2, "Western Pacific");
        InsertTexture(3, "Norfolk Southern");
        InsertTexture(4, "FURRX");
        InsertTexture(5, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(6, "JCIR 633");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public String transportYear() {
        return "1993-1998";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public String getInventoryName() {
        return "CEE B-BEL";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
