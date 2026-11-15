package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselVO1000 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselVO1000;
    }
    public DieselVO1000(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Spokane Portland & Seattle");
        InsertTexture(1, "LC&BC 9");
        InsertTexture(2, "ATSF (Pinstripe)");
        InsertTexture(3, "Bigj Stupid Thing");
        InsertTexture(4, "Dee Dee Valley");

    }
    

    

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", -1.5F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }

    

    



    @Override
    public String getInventoryName() {
        return "Baldwin VO 1000";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return (1.05F);
    }
    






}