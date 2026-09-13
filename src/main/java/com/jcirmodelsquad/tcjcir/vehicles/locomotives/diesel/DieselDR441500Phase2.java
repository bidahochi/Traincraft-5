package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselDR441500Phase2 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:dr441500phase2")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_483", "marker_body_484", "marker_l_type_1",
            "marker_r_type_1")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_left_body_460", "numberboard_left_body_468", "rear_numberboard_right_body_461",
            "rear_numberboard_right_body_466")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500APhase2;
    }
    public DieselDR441500Phase2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Missouri Pacific (As delivered)");
        InsertTexture(1, "Missouri Pacific");
        InsertTexture(2, "New York Central (As delivered)");
        InsertTexture(3, "New York Central");
        InsertTexture(4, "New York Central (3800, footboards)");
        InsertTexture(5, "New York Central (Dynamics removed)");
        InsertTexture(6, "New York Central (Cigarband)");
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(9, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(10, "Fox, Marble & Seaboard Ry", LockoutGroup.FMSR);
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }
    

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.1, -0.37); }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.12F;
    }

    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500 (Phase 2)";
    }

    
    


    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
