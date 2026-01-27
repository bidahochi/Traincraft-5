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


public class DieselSD40T2 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40T2;
    }
    public DieselSD40T2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Denver and Rio Grande Western");
        InsertTexture(1, "Southern Pacific 8491 (Early)");
        InsertTexture(2, "Southern Pacific 8251 (Early)");
        InsertTexture(3, "Southern Pacific 8491 (Late)");
        InsertTexture(4, "Union Pacific (Ex-SP Patched)");
        InsertTexture(5, "Northern Railroad");
        InsertTexture(6, "EMD Demo/Lease");
        InsertTexture(7, "Blandsville & Blankerston");
        InsertTexture(8, "NEP", LockoutGroup.CUBED);
        InsertTexture(9, "Magnolia Acres", LockoutGroup.MAG);
        InsertTexture(10, "Run 8 & Western");
        InsertTexture(11, "Paradox Rail");
        InsertTexture(12, "Avanste Northeastern", LockoutGroup.ANE);
        InsertTexture(13, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(14, "FNCC (KIT-80)", LockoutGroup.FNCC);
        InsertTexture(15, "Southern Port Belt");
        InsertTexture(16, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(17, "CRL");
        InsertTexture(18, "CRL (Phase 1)");
        InsertTexture(19, "CRL (Phase 2)");
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 8, 3, EnumOverlayFonts.BapSansMid, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(31, 13), new Point(90, 13) }
        ));
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.25, 0.2, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.55F; }

    @Override
    public String transportYear() {
        return "1974-1980";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD40T-2";
    }

}