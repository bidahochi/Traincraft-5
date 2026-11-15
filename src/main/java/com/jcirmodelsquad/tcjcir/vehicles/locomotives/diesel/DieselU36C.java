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

public class DieselU36C extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU36C;
    }
    public DieselU36C(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Erie Lackawana");
        InsertTexture(1, "ATSF (Pinstripe)");
        InsertTexture(2, "ATSF (Kodachrome)");
        InsertTexture(3, "ATSF (Freightbonet)");
        InsertTexture(4, "Milwaukee Road");
        InsertTexture(5, "FNCC 19", LockoutGroup.FNCC);// one of a kind Super 7-36CXE
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 7, 4, EnumOverlayFonts.BapSansMid, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(37, 13), new Point(56, 29) }
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
            new SeatDefinition("driver", 1.8284F, 0.3F, 0.0003F, SeatRole.DRIVER)
        };
    }


    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.375F;
    }

    @Override
    public String transportYear() {
        return "1971-1975";
    }

    @Override
    public String getInventoryName() {
        return "GE U36C";
    }


    



}