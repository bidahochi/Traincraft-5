package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricW_A55 extends ElectricTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricW_A55;
    }
    public ElectricW_A55(World world) {
        super(world);
        InsertTexture(0, "Generic");
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.02F, -0.3F, -0.4F, SeatRole.DRIVER)
        };
    }

    

    





    @Override
    public String getInventoryName() {
        return "SEC W-A55";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.52F;
    }

    
    


}
