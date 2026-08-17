package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
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

public class DieselU23C extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:u23c")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_136", "marker_body_137", "marker_body_148",
            "marker_body_149", "marker_body_93", "marker_body_94",
            "marker_highhood_bit_body_268", "marker_highhood_bit_body_269")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_127", "numberboard_body_128", "numberboard_body_158",
            "numberboard_body_159", "numberboard_high_hood_body_271", "numberboard_high_hood_body_272")
        .build();

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23C;
    }
    public DieselU23C(World world) {
        super(world, LiquidManager.dieselFilter());//its like magic guys trust me

        InsertTexture(0, "Consolidate DeeZ NUTS");
        InsertTexture(1, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "ATSF Pinstripe");
        InsertTexture(4, "ATSF Freightbonnet");
        InsertTexture(5, "");
        InsertTexture(6, "");
        InsertTexture(7, "");
        initOverlayTextures();
        Map<TextAttribute, Object> fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 16f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(0, -1)));
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 7, 4, EnumOverlayFonts.BapSansSmall, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(44, 16), new Point(74, 16) }
        ));
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }
    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.6, 0.3, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.65F;
    }

    @Override
    public String transportYear() {
        return "1968-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U23C";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}
