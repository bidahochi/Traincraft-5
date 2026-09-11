package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselF3B extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:f3b")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_307", "numberboard_body_308")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF3B;
    }
    public DieselF3B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Phase 2 Early");
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
        InsertTexture(2, "FNCC (Ex FMSR)", LockoutGroup.FNCC);
        InsertTexture(3, "DES (Bida Fictional)"/*, LockoutGroup.DES*/);
        InsertTexture(4, "DRGW (Black with yellow stripes)");
        InsertTexture(5, "DRGW (4 stripe)");
        InsertTexture(6, "DRGW (4 stripe, late)");
        InsertTexture(7, "DRGW (1 stripe)");
        InsertTexture(8, "MON (freight scheme)");
        InsertTexture(9, "MON (freight scheme, late)");
        InsertTexture(10, "Amtrak (Ex NP)");
        InsertTexture(11, "ATSF (As Delivered)");
        InsertTexture(12, "ATSF (Early)");
        InsertTexture(13, "ATSF (Late)");
        InsertTexture(14, "EMD Freight Demo");
        InsertTexture(15, "NYC (Early)");
        InsertTexture(16, "NYC (Grey)");
        InsertTexture(17, "NYC (Late)");
        InsertTexture(18, "EMD Passenger Demo");
        InsertTexture(19, "SP Black Widow");
        InsertTexture(20, "EP&N");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.4, 0.19, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.87F; }

    @Override
    public String transportYear() {
        return "1946-1949";
    }

    @Override
    public String getInventoryName() {
        return "EMD F3b";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}