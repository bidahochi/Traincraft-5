package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricW_A11 extends ElectricTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricW_A11;
    }
    public ElectricW_A11(World world) {
        super(world);
        InsertTexture(0, "Generic");
        InsertTexture(1, "Cornwall City Railway");
        InsertTexture(2, "Temporarily Named Spawn Railroad");
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 1.55F, -0.3F, -0.4F, SeatRole.DRIVER)
        };
    }

    

    





    @Override
    public String getInventoryName() {
        return "SEC W-A11";
    }

    
    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }

    
    


}
