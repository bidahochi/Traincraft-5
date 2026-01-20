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

public class DieselDash944CW extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDash9C44W;
    }
    public DieselDash944CW(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Norfolk Southern");
        InsertTexture(1, "Norfolk Southern (9634)");
        InsertTexture(2, "Blandsvill & Blankerston");
        InsertTexture(3, "Fox Union Rail Resources (FURRX)");
        InsertTexture(4, "BNSF (H1)");
        InsertTexture(5, "Southern Pacific");
        InsertTexture(6, "Southern Pacific (UP Patch)");
        InsertTexture(7, "Chicago Northwestern");
        InsertTexture(8, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(9, "Avanste Northeastern", LockoutGroup.ANE);
        InsertTexture(10, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(11, "CSLX (EX CSWR)");
        InsertTexture(12, "ATSF");
        InsertTexture(13, "ATSF (BNSF Patch)");
        InsertTexture(14, "Plainview");
        InsertTexture(15, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM);
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                13, 6, 4, EnumOverlayFonts.BapSansMid, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(104, 72), new Point(191, 72) }
        ));
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.9, 0.4, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportYear() {
        return "1993-2004";
    }

    @Override
    public String getInventoryName() {
        return "GE Dash 9-44CW";
    }

}
