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

public class DieselU36B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU36B;
    }
    public DieselU36B(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "auto-train Corp");
        InsertTexture(1, "Transkentucky Transportation Ind");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "CSXT (YN2)");
        InsertTexture(4, "CSXT (YN1)");
        InsertTexture(5, "CSXT (Stealth)");
        InsertTexture(6, "CSXT (Bluedown)");
        InsertTexture(7, "Seaboard");
        InsertTexture(8, "she consolodate on my rail till i coperation");
        InsertTexture(9, "Western Pacific");
        InsertTexture(10, "Drexel Co", LockoutGroup.DRXL);
        InsertTexture(11, "Deadwood & La Mesa", LockoutGroup.DLMR);
        initOverlayTextures();
        getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic(
                "Engine Number",
                11, 7, 4, EnumOverlayFonts.BapSansMid, 7f, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL,
                new Point[]{ new Point(44, 16), new Point(74, 16) }
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
            new SeatDefinition("driver", 1.675F, 0.25F, -0.0003F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F;
    }

    @Override
    public String transportYear() {
        return "1969-1974";
    }

    @Override
    public String getInventoryName() {
        return "GE U36B";
    }


}
