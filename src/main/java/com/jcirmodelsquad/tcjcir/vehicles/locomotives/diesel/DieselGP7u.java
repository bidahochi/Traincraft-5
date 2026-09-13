package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselGP7u extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp7u")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_305", "marker_body_306", "marker_two_body_399",
            "marker_two_body_401")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_346", "numberboard_body_347", "rear_numberboard_body_177",
            "rear_numberboard_body_178")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP7u;
    }
    public DieselGP7u(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "ATSF (Kodachrome)");
        InsertTexture(1, "ATSF (Freightbonnet)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Avanste Northeastern (Radio Equipped) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(4, "Avanste Northeastern (Yard) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(5, "Fox Union Rail Resources (FURRX)");
        InsertTexture(6, "OC&G 15", LockoutGroup.CUBED);
        InsertTexture(7, "FNCC 210-213 (GP9(U) group e)", LockoutGroup.FNCC);
        InsertTexture(8, "FNCC 235-240 (ex FMSR units)", LockoutGroup.FNCC);

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.55, 0.1, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    @Override
    public String transportYear() {
        return "1972-1981";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP7u";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}