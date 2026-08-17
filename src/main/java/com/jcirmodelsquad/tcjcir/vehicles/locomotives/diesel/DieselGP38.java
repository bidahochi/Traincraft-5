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

public class DieselGP38 extends DieselTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:gp38")
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
        return EnumSounds.DieselGP38;
    }
    public DieselGP38(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Fox Union Rail Resources (FURRX)");
        InsertTexture(1, "FNCC (GP38ac, Kit-L)", LockoutGroup.FNCC);
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "Nomansi & Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(4, "Nomansi & Eastern Pacific (GP38R)", LockoutGroup.CUBED);
        InsertTexture(5, "ATSF (Pinstripe)");
        InsertTexture(6, "ATSF (Freightbonnet)");
        InsertTexture(7, "ATSF (Kodachrome)");
        InsertTexture(8, "Penn Central");
        InsertTexture(9, "Great Lakes & Northern Territories");
        InsertTexture(10, "SNCT 301 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(11, "SNCT 302 (Protolance)", LockoutGroup.SNCT);
        InsertTexture(12, "GLNT JCIR 6 years");
        InsertTexture(13, "ANW", LockoutGroup.ANW);
        InsertTexture(14, "ANW (Chevrons)", LockoutGroup.ANW);
        InsertTexture(15, "Georgia Northeastern");
        InsertTexture(16, "Monongahela (Early)");
        InsertTexture(17, "Monongahela (Late)");
        InsertTexture(18, "AA (Fog)");
        InsertTexture(19, "CSXT (Yn1)");
        InsertTexture(20, "CSXT (Stealth)");
        InsertTexture(21, "CSXT (Bluedown)");
        InsertTexture(22, "Seaboard System");
        InsertTexture(23, "Chessie System");
        InsertTexture(24, "CWL", LockoutGroup.CWL);
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
        return "1966-1971";
    }

    @Override
    public String getInventoryName() {
        return "EMD GP38";
    }

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}