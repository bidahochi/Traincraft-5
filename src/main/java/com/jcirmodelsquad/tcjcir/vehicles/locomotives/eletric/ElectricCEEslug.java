package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricCEEslug extends ElectricTrain
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:ceeslug")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_113", "marker_body_114")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_347", "front_numberboard_body_348", "numberboard_body_301",
            "numberboard_body_302")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricCEESlug;
    }

    public ElectricCEEslug(World world) {
        super(world);
        InsertTexture(0, "NEP SUB-4", LockoutGroup.CUBED);
        InsertTexture(1, "FNCC S111, S112, & S114", LockoutGroup.FNCC);
        InsertTexture(2, "FNCC S113", LockoutGroup.FNCC);
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "");
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }
    
    @Override
    public String getInventoryName() {
        return "CEE rebuilt slug (U23B core)";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
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
