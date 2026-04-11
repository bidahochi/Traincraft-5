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

public class DieselU23B extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU23B;
    }
    public DieselU23B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "Fox Union Rail Resources (FURRX)");
        InsertTexture(2, "Conrail");
        InsertTexture(3, "Blandsville & Blankerston");
        InsertTexture(4, "Deep Rock Railroad", LockoutGroup.BIDA);
        InsertTexture(5, "Deep Rock Railroad (C&PV Patch)", LockoutGroup.CPV);
        InsertTexture(6, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(7, "ATSF (Pinstripe)");
        InsertTexture(8, "ATSF (Freightbonnet)");
        InsertTexture(9, "Deleware & Hudson");
        InsertTexture(10, "Southern");
        InsertTexture(11, "MoPac");
        InsertTexture(12, "Western Pacific");
        InsertTexture(13, "Western Pacific");
        InsertTexture(14, "Deadwood & La Mesa", LockoutGroup.DLMR);
        InsertTexture(15, "Penn Central");
        InsertTexture(16, "Seaboard System");
        InsertTexture(17, "CFW 558", LockoutGroup.BIDA);
        InsertTexture(18, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(19, "Milwaukee Road");
        InsertTexture(20, "Nomansi & Eastern Pacific", LockoutGroup.CUBED);
        InsertTexture(21, "ADT", LockoutGroup.ADT);
        InsertTexture(22, "ADT (Ex UP)", LockoutGroup.ADT);
        InsertTexture(23, "Suffern Hoboken Interstate Transfer 211");
        InsertTexture(24, "Detroit Export System", LockoutGroup.DES);
        InsertTexture(25, "Magnolia Properties", LockoutGroup.MAG);
        InsertTexture(26, "AGW", LockoutGroup.AGW);
        InsertTexture(27, "CNRC 5001 & 5002", LockoutGroup.CNRC);
        InsertTexture(28, "CSXT (Bluedown)");
        InsertTexture(29, "CSXT (Stealth)");
        InsertTexture(30, "CSXT (YN1)");
        InsertTexture(31, "CSXT (YN2)");
        InsertTexture(32, "Chessie System");
        InsertTexture(33, "Monon");
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 7, 4, EnumOverlayFonts.BapSansMid, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(44, 16), new Point(74, 16) }
        ));
    }

    @Override
    public float transportMetricHorsePower()
    {
        return 2250;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.2, 0.25, -0.35); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String transportYear() {
        return "1968-1977";
    }

    @Override
    public String getInventoryName() {
        return "GE U23B";
    }

    @Override
    public int getTankCapacity()
    {
        return 20000;
    }

}
