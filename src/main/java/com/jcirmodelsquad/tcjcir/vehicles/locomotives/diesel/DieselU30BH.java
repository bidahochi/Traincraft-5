package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.api.RollingStockLightFunction;
import train.common.api.RollingStockLightColors;
import train.common.api.RollingStockSkinLightingProfiles;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselU30BH extends DieselTrain {
    static final RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        RollingStockSkinLightingProfiles.builder("bap:u30bh")
        .defaults()
        .gyralite("front_center")
        .color(RollingStockLightColors.WARM_WHITE, "front_center")
        .setSkin("purple")
        .alternatingDitch(
            0,
            RollingStockLightFunction.LampResponse.INCANDESCENT,
            "front_left_lower",
            "front_left_upper",
            "rear_left_lower",
            "rear_left_upper")
        .alternatingDitch(
            1,
            RollingStockLightFunction.LampResponse.INCANDESCENT,
            "front_right_lower",
            "front_right_upper",
            "rear_right_lower",
            "rear_right_upper")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU30BH;
    }
    public DieselU30BH(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Northern Cascades Transit Authority (NOCTA)", LockoutGroup.BIDA);
        InsertTexture(1, "Blandsville Area Rapid Transporation (BlART)");
        InsertTexture(2, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(3, "CRL (70s-80s)");
        InsertTexture(4, "CRL (80s-2006)");
        InsertTexture(5, "CRL (2006-onwards)");
    }


    @Override
    protected RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String getInventoryName() {
        return "CEE U30B(H)";
    }

    @Override
    public boolean isFictional() {
        return true;
    }
}
