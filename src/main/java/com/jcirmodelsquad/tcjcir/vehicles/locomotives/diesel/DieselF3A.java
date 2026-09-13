package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselF3A extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:f3a")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_273", "marker_body_281", "marker_early_body_267",
            "marker_early_body_270")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_272", "numberboard_body_280", "numberboard_early_body_268",
            "numberboard_early_body_269")

                .setSkin("Skin31")//fncc
                .gyralite("HL_L1A", "HL_L1B")
                .setSkin("Cyan")//fmsr
                .gyralite("HL_L1A", "HL_L1B")
                .setSkin("Skin34")//ep&n
                .gyralite("HL_L1A", "HL_L1B")

        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF3A;
    }
    public DieselF3A(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Phase 2 Early");
        InsertTexture(1, "FMSR", LockoutGroup.FMSR);
        InsertTexture(2, "FNCC (Ex FMSR)", LockoutGroup.FNCC);
        InsertTexture(3, "DES (Bida Fictional)"/*, LockoutGroup.DES*/);
        InsertTexture(4, "CDC&S", LockoutGroup.CDCS);
        InsertTexture(5, "OC&G 25A, 26B", LockoutGroup.CUBED);
        InsertTexture(6, "BAR 49");
        InsertTexture(7, "DRGW (Black with yellow stripes)");
        InsertTexture(8, "DRGW (4 stripe)");
        InsertTexture(9, "DRGW (4 stripe, late)");
        InsertTexture(10, "DRGW (1 stripe)");
        InsertTexture(11, "MON (passenger scheme, early)");
        InsertTexture(12, "MON (passenger scheme)");
        InsertTexture(13, "MON (freight scheme, passenger)");
        InsertTexture(14, "MON (freight scheme, passenger, 203)");
        InsertTexture(15, "MON (freight scheme)");
        InsertTexture(16, "MON (freight scheme, late)");
        InsertTexture(17, "Amtrak (Ex NP)");
        InsertTexture(18, "ATSF (As Delivered)");
        InsertTexture(19, "ATSF (Early)");
        InsertTexture(20, "ATSF (Rebuilt)");
        InsertTexture(21, "ATSF Late)");
        InsertTexture(22, "EMD Freight Demo");
        InsertTexture(23, "NYC (Early)");
        InsertTexture(24, "NYC (Grey)");
        InsertTexture(25, "NYC (Late)");
        InsertTexture(26, "EMD Passenger Demo");
        InsertTexture(27, "WM (Speed Lettering)");
        InsertTexture(28, "WM (Circus)");
        InsertTexture(29, "WM (Fireball)");
        InsertTexture(30, "SP Black Widow");
        InsertTexture(31, "KTR (scrap heap, formerly FNCC 625A)"/*, LockoutGroup.BIDA*/);
        InsertTexture(32, "EP&N");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.4, 0.19, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.91F; }

    @Override
    public String transportYear() {
        return "1946-1949";
    }

    @Override
    public String getInventoryName() {
        return "EMD F3a";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}