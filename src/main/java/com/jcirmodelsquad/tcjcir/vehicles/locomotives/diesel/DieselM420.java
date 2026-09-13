package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselM420 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:m420")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_281", "marker_body_282")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_102", "numberboard_body_103", "numberboard_body_272",
            "numberboard_body_273")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM420;
    }
    public DieselM420(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "BCOL (Zig Zag)");
        InsertTexture(1, "COW (Moo)");
        InsertTexture(2, "FNCC (KIT-L, Non Canon)", LockoutGroup.FNCC);
        InsertTexture(3, "the demon of babylon disguises himself as the righteous");
        InsertTexture(4, "SPR (M424)", LockoutGroup.SPR);
    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.8, 0.3, -0.3); }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW M420";
    }





    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
