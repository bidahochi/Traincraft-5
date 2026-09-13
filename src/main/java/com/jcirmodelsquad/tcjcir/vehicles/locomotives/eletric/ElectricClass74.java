package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricClass74 extends ElectricTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:class74")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_22", "marker_body_23", "marker_body_3",
            "marker_body_4")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricClass74;
    }
    public ElectricClass74(World world) {
        super(world);
        InsertTexture(0, "BR");
        InsertTexture(1, "SPR", LockoutGroup.SPR);
        InsertTexture(2, "GCM", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(3, "CRL");
        InsertTexture(4, "CRL (Phase 2)");
    }

    @Override
    public String transportCountry()
    {
        return "UK";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.65, 0.08, 0.25); }



    

    



    @Override
    public String getInventoryName() {
        return "Class 74";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.2F;
    }


    

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
