package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;


public class DieselSD40R extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD40R;
    }
    public DieselSD40R(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "Southern Pacific (Early)");
        InsertTexture(1, "Southern Pacific (Late)");
        InsertTexture(2, "Blandsville & Blankerston");
        InsertTexture(3, "CSLX");
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
    public String getInventoryName() {
        return "EMD SD40R";
    }

    
    



}
