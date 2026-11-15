package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselFPA4 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFPA4;
    }
    public DieselFPA4(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "VIA Rail");
        InsertTexture(1, "VIA Rail");
        InsertTexture(2, "Canadian National (Old)");
        InsertTexture(3, "Canadian National (Stripes)");
        InsertTexture(4, "Canadian National (VIA)");
        InsertTexture(5, "Whatcom & Fraser Railroad");
        InsertTexture(6, "COW");
        InsertTexture(7, "Canadian National (Old 2)");
        InsertTexture(8, "Canadian National (Stripes 2)");
        InsertTexture(9, "VIA Rail");
        InsertTexture(10, "VIA Rail");
        InsertTexture(11, "VIA Rail");
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
            new SeatDefinition("driver", 1.2766F, 0.14F, 0F, SeatRole.DRIVER)
        };
    }
    

    





    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.93F;
    }



    @Override
    public String getInventoryName() {
        return "MLW FPA-4";
    }

    




}
