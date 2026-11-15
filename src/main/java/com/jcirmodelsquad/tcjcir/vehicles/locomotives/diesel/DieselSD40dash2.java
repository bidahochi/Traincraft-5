package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;


public class DieselSD40dash2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40dash2;
    }
    public DieselSD40dash2(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "LLPX");
        InsertTexture(1, "Burlington Northern");
        InsertTexture(2, "Avanste Northeastern (Yard Service) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(3, "Avanste Northeastern (Road Service) (Bida Fictional)"/*, LockoutGroup.ANE*/);
        InsertTexture(4, "Union Pacific");
        InsertTexture(5, "BNSF");
        InsertTexture(6, "BNSF");
        InsertTexture(7, "Milwaukee Road");
        InsertTexture(8, "Milwaukee Road (Icebreakers)");
        InsertTexture(9, "Milwaukee Road (Bicentennial)");
        InsertTexture(10, "Rock Island");
        InsertTexture(11, "NdeM");
        InsertTexture(12, "Norfolk Southern");
        InsertTexture(13, "Norfolk Southern (Ex-N&W)");
        InsertTexture(14, "Norfolk Southern (Ex-SOU)");
        InsertTexture(15, "Blandsville & Blankerston");
        InsertTexture(16, "CSLX");
        InsertTexture(17, "CSX (Yn3 RCO)");
        InsertTexture(18, "Fort Worth Western Railroad");
        InsertTexture(19, "FURRX");
        InsertTexture(20, "FURRX");
        InsertTexture(21, "CSLX (EX CSWR)");
        InsertTexture(22, "ATSF (Freightbonnet)");
        InsertTexture(23, "ATSF (Freightbonnet)");
        InsertTexture(24, "Morristown Tenneva and Southern");
        InsertTexture(25, "Morristown Tenneva and Southern (High Hood)");
        InsertTexture(26, "Kansas City Southern");
        InsertTexture(27, "Florida East Coast");
        InsertTexture(28, "CSXT (YN2)");
        InsertTexture(29, "Great Lakes & Northern Territories");
        InsertTexture(30, "Plainview");
        InsertTexture(31, "FURRX");
        InsertTexture(32, "Wesser Valley");
        InsertTexture(33, "CSX (Yn3 Non-RCO)");
        InsertTexture(34, "Chicago and North Western");
        InsertTexture(35, "Seaboard System");
        InsertTexture(36, "Southern");
        InsertTexture(37, "Chessie System");
        InsertTexture(38, "CWL", LockoutGroup.CWL);
        InsertTexture(39, "CWL (High short hood)", LockoutGroup.CWL);

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
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.4F, 0.2F, -0.0003F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F; }

    @Override
    public String transportYear() {
        return "1972-1989";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD40-2";
    }



}
