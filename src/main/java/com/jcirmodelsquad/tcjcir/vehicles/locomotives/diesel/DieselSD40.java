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

public class DieselSD40 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40;
    }
    public DieselSD40(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "ATSF (Pinstripe)");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "FURRX");
        InsertTexture(3, "Wisconsin & Southern");
        InsertTexture(4, "Flatiron Northwestern");
        InsertTexture(5, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(6, "Pennsylvania Railroad");
        InsertTexture(7, "CSXT (YN1)");
        InsertTexture(8, "DLMR");
        InsertTexture(9, "GLC (Cigar Band)");
        InsertTexture(10, "AA (Fog)");
        InsertTexture(11, "Seaboard System");
        InsertTexture(12, "Honex Lines (HNXR)", LockoutGroup.BIDA);
        InsertTexture(13, "Chessie System");
        InsertTexture(14, "WM (Speed Lettering)");
        InsertTexture(15, "WM (Circus)");
        InsertTexture(16, "C&O");
        InsertTexture(17, "C&O (Blue Dip)");

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
    public float getOptimalDistance(EntityMinecart cart) { return 1.4F;
    }

    @Override
    public String transportYear() {
        return "1966-1972";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD40";
    }


}