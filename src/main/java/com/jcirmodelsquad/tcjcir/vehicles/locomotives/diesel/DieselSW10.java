package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselSW10 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:sw10")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_double_body_257", "front_numberboard_double_body_258", "rear_numberboard_double_body_259",
            "rear_numberboard_double_body_260")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSW10;
    }
    public DieselSW10(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "UP");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(3, "FNCC (DAR80)", LockoutGroup.FNCC);
        InsertTexture(4, "TIR 1248 & 1253");
        InsertTexture(5, "TIR 1269");
        InsertTexture(6, "Glonch Rayroa");
        InsertTexture(7, "Anning my Arbor so good rn");
        InsertTexture(8, "KTR (ex FNCC 282)");

    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.08, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String transportYear() {
        return "1980-1999";
    }

    @Override
    public String getInventoryName() {
        return "EMD/UP SW10";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
