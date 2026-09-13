package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSB23E extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sb23e")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_189", "marker_body_190", "marker_body_215",
            "marker_body_216")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_176", "numberboard_body_177", "numberboard_body_187",
            "numberboard_body_188", "numberboard_body_241", "numberboard_body_242")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSB23E;
    }
    public DieselSB23E(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Western Pacific (Early)");
        InsertTexture(1, "Western Pacific (Late)");
        InsertTexture(2, "FNCC (Dar80)", LockoutGroup.FNCC);
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "CSXT");
        InsertTexture(5, "Morristown Tenneva & Southern", LockoutGroup.MTS);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, 0.35); }

    @Override
    public String transportYear() {
        return "1981-1989";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String getInventoryName() {
        return "CEE SB23E";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
