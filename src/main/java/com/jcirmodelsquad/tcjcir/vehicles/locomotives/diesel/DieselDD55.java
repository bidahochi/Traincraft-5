package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselDD55 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dd55")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_115")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDD55;
    }
    public DieselDD55(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "West Creek Pacific");
        InsertTexture(1, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(2, "LA Switcher Company Primer");
        InsertTexture(3, "CSX (but awesome)");
        InsertTexture(4, "CSX (but awesome)");

    }

    @Override
    public String transportCountry()
    {
        return "DEATH";
    }

    @Override
    public boolean isFictional(){
        return true;
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.75, 0.125, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String getInventoryName() {
        return "LASC DD55";
    }


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
