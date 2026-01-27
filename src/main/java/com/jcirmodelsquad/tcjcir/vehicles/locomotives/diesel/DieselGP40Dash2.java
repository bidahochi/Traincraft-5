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

public class DieselGP40Dash2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselGP40Dash2;
    }
    public DieselGP40Dash2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Florida East Coast");
        InsertTexture(1, "Paradox Rail");
        InsertTexture(2, "Western Pacific");
        InsertTexture(3, "Western Pacific");
        InsertTexture(4, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(5, "Avanste Northeastern", LockoutGroup.ANE);
        InsertTexture(6, "Avanste Northeastern (Snow Service)", LockoutGroup.ANE);
        InsertTexture(7, "Amtrak (PH III)");
        InsertTexture(8, "Norfolk Southern");
        InsertTexture(9, "Athearn RTR GP40 (Avanste Northeastern)");
        InsertTexture(10, "DRGW (big logo)");
        InsertTexture(11, "Seaboard System");
        InsertTexture(12, "CSXT (YN3)");
        InsertTexture(13, "CSXT (YN2)");
        InsertTexture(14, "JRN");
        InsertTexture(15, "Chessie System");
        InsertTexture(16, "");
        InsertTexture(17, "");
        InsertTexture(18, "");
        InsertTexture(19, "");
        InsertTexture(20, "");
        InsertTexture(21, "");
        InsertTexture(22, "");
        InsertTexture(23, "");
        InsertTexture(24, "");
        InsertTexture(25, "");
        InsertTexture(26, "");
        InsertTexture(27, "");
        InsertTexture(28, "");
        InsertTexture(29, "");
        InsertTexture(30, "");
        InsertTexture(31, "");

        initOverlayTextures();
        Map<TextAttribute, Object> fontAttributes = new HashMap<>(2);
        fontAttributes.put(TextAttribute.SIZE, 16f);
        fontAttributes.put(TextAttribute.TRANSFORM, new TransformAttribute(AffineTransform.getTranslateInstance(1, -1)));

        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number", 11, 6, 6, EnumOverlayFonts.BapSansSmall, fontAttributes, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
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
        return "EMD GP40";
    }
}