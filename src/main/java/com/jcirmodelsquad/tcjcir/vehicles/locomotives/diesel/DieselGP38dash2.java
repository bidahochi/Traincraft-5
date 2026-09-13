package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.awt.font.TransformAttribute;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.Map;

public class DieselGP38dash2 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp38dash2")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_10", "marker_body_11", "marker_body_444",
            "marker_body_445", "marker_two_body_440", "marker_two_body_442",
            "marker_two_body_446")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_73", "front_numberboard_body_74", "numberboard_body_379",
            "numberboard_body_380", "rear_numberboard_body_536", "rear_numberboard_body_537",
            "rear_numberboard_body_95", "rear_numberboard_body_96")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP38dash2;
    }
    public DieselGP38dash2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Butte, Anaconda & Pacific");
        InsertTexture(1, "MKT (Stripes)");
        InsertTexture(2, "MKT (Solids)");
        InsertTexture(3, "Norfolk Southern (Ex-Sou)");
        InsertTexture(4, "Norfolk Southern");
        InsertTexture(5, "Southern Port Belt");
        InsertTexture(6, "Southern Port Belt (NS Patch)");
        InsertTexture(7, "Milwaukee Road");
        InsertTexture(8, "Milwaukee Road (Billboard)");
        InsertTexture(9, "GLC (Cigar Band)");
        InsertTexture(10, "GLC (Ex SPB)");
        InsertTexture(11, "GLC (Ex NS)");
        InsertTexture(12, "CSXT (Yn3)");
        InsertTexture(13, "CSXT (Yn2)");
        InsertTexture(14, "Seaboard System");
        InsertTexture(15, "");
        InsertTexture(16, "");
        InsertTexture(17, "");
        InsertTexture(18, "");
        InsertTexture(19, "");
        InsertTexture(20, "");

        initOverlayTextures();
        Map<TextAttribute, Object> fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 16f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(1, -1)));

        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number", 12, 6, 6, EnumOverlayFonts.BapSansSmall, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(30, 14), new Point(89, 14) }
        ));
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.15, -0.325); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F; }

    @Override
    public String transportYear() {
        return "1972-1986";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP38-2";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}