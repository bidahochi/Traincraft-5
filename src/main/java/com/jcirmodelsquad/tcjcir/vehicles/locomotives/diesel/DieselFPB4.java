package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselFPB4 extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFPB4;
    }
    public DieselFPB4(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "VIA Rail");
        InsertTexture(1, "Canadian National (Old)");
        InsertTexture(2, "Canadian National (Stripes)");
        InsertTexture(3, "Whatcom & Fraser Railroad");
        InsertTexture(4, "COW (Calf)");
        InsertTexture(7, "Canadian National (Old 2)");
        InsertTexture(8, "Canadian National (Stripes 2)");
        InsertTexture(1, "VIA Rail");

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
            new SeatDefinition("driver", 1.45F, -0.08F, 0F, SeatRole.DRIVER)
        };
    }


    

    

    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.96F;
    }

    

    @Override
    public String getInventoryName() {
        return "MLW FPB-4";
    }




}
