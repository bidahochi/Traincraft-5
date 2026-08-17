package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselAC4400C extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:ac4400c")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_310")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_246", "numberboard_body_247", "numberboard_body_278",
            "numberboard_body_279")
        .build();


    @Override
    public SoundRecord getSoundRecord() { return EnumSounds.DieselAC4400C; }

    public DieselAC4400C(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Western Pacific");
        InsertTexture(1, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(2, "North Fox (KIT-80)", LockoutGroup.FNCC);
        InsertTexture(3, "CEFX");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "NEP", LockoutGroup.CUBED);
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public String getInventoryName() { return "GE AC4400C"; }

    /*@Override
    public String transportYear() {
        return "1981-1989";
    }*/

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
