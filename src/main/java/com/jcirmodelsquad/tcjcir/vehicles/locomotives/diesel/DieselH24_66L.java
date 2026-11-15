package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselH24_66L extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselH24_66L;
    }
    public DieselH24_66L(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Wabash");
        InsertTexture(1, "Southern");
    }
    

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.65F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }
    

    



    

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }



    @Override
    public String getInventoryName() {
        return "FM H24-66";
    }





}
