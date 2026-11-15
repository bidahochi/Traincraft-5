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


public class DieselSD40A extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40A;
    }
    public DieselSD40A(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "NEP (Later)", LockoutGroup.CUBED);
        InsertTexture(1, "NEP (Early)", LockoutGroup.CUBED);
        InsertTexture(2, "Illinois Central 6009 (Death Star)");
        InsertTexture(3, "Illinois Central 6009 (Operation Lifesaver)");
        InsertTexture(4, "Illinois Central (1970's)");
        InsertTexture(5, "Blandsville & Blankerston");
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
            new SeatDefinition("driver", 1.5F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }
    





    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.6F;
    }

    @Override
    public String transportYear() {
        return "1969-1970";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD40A";
    }


    



}
