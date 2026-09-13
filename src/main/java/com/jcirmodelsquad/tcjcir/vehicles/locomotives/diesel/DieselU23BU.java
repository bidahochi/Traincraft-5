package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU23BU extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:u23bu")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_140", "marker_body_141", "marker_body_149",
            "marker_body_150", "marker_body_228", "marker_body_229",
            "marker_body_305", "marker_body_306")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_324", "numberboard_body_325", "numberboard_body_326",
            "numberboard_body_327", "numberboard_body_401", "numberboard_body_402")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23BU;
    }
    public DieselU23BU(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "FNCC (1st Order)", LockoutGroup.FNCC);//type b
        InsertTexture(1, "FNCC (2nd Order)", LockoutGroup.FNCC);//fb2
        InsertTexture(2, "FNCC (3rd Order)", LockoutGroup.FNCC);//type b
        InsertTexture(3, "FNCC 100 (American Bicentennial Commemorative Unit)", LockoutGroup.FNCC);//type b
        InsertTexture(4, "FNCC (Ex ATSF, Upgraded)", LockoutGroup.FNCC);// type b
        InsertTexture(5, "FNCC (Ex ATSF Patch)", LockoutGroup.FNCC);// type  b
        InsertTexture(6, "FNCC (Ex UP, Upgraded)", LockoutGroup.FNCC);//fb2
        InsertTexture(7, "FNCC (Ex UP Patch)", LockoutGroup.FNCC);//fb2
        InsertTexture(8, "FNCC (Ex CSX (C&O), Upgraded)", LockoutGroup.FNCC);//blomb
        InsertTexture(9, "FNCC (Ex CSX Patch (3275))", LockoutGroup.FNCC);//fb2
        InsertTexture(10, "FNCC (Ex CSX Patch (3317))", LockoutGroup.FNCC);//fb2
        InsertTexture(11, "FMSR 101-104 (First Batch)", LockoutGroup.FMSR);//type b

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String getInventoryName() {
        return "CEE U23B(U)";
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}