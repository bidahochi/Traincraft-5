package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselES44 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:es44")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_aussy_body_214", "marker_aussy_body_215", "marker_body_120",
            "marker_body_121")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_135", "numberboard_body_136", "numberboard_body_52",
            "numberboard_body_54", "numberboard_upper_body_105", "numberboard_upper_body_203")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselES44;
    }
    public DieselES44(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //i think i need a scooby doo tie-fighter now
        InsertTexture(0, "Evolution Series Demonstrator");
        InsertTexture(1, "BNSF (H2)");
        InsertTexture(2, "BNSF (H3)");
        InsertTexture(3, "Canadian Pacific");
        InsertTexture(4, "Union Pacific");
        InsertTexture(5, "Savatrans");
        InsertTexture(6, "CitiRail");
        InsertTexture(7, "Canadian National (CN)");
        InsertTexture(8, "Norfolk Southern (NS)");
        InsertTexture(9, "Blandsville & Blankerston");
        InsertTexture(10, "CSXT");
        InsertTexture(11, "Kansas City Southern");
        InsertTexture(12, "Cemex");
        InsertTexture(13, "Ferromex");
        InsertTexture(14, "LMX");
        InsertTexture(15, "LMX");
        InsertTexture(16, "IAIS");
        InsertTexture(17, "GLNT");
        InsertTexture(18, "Ann Arbor");
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public String transportYear() {
        return "2003-Present";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.4, -0.35); }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F;
    }

    

    @Override
    public String getInventoryName() {
        return "GE ES44";
    }




    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
