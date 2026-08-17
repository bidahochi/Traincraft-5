package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDash839B extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dash839b")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_261", "marker_body_262", "marker_crl_body_348",
            "marker_crl_body_349", "marker_sou_body_350", "marker_sou_body_351")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_256", "numberboard_body_257", "numberboard_body_326",
            "numberboard_body_327")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash839B;
    }
    public DieselDash839B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Southern Pacific");
        InsertTexture(1, "LMX (1990s)");
        InsertTexture(2, "Western Pacific (Early)");
        InsertTexture(3, "Western Pacific (Late)");
        InsertTexture(4, "Western Pacific (OLS)");
        InsertTexture(5, "Blandsville & Blankerston");
        InsertTexture(6, "North Fox (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(7, "North Fox (KIT-80)", LockoutGroup.FNCC);
        InsertTexture(8, "CEEX 90s Lease Scheme");
        InsertTexture(9, "Coyote & Fort Woods (Ex CEEX Leaser) (Bida Freelance)");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.7, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String transportYear() {
        return "1984-1988";
    }

    @Override
    public String getInventoryName() {
        return "GE B39-8";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
