package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselNRE3gs21b extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselNRE3gs21b;
    }
    public DieselNRE3gs21b(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Union Pacific");
        InsertTexture(1, "BNSF");
        InsertTexture(2, "FURRX");
        InsertTexture(3, "FURRX (W/ Plow)");
        InsertTexture(4, "Southern Port Belt");
        InsertTexture(5, "CSXT (Yn3)");
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
            new SeatDefinition("driver", 1.3875F, 0.35F, 0F, SeatRole.DRIVER)
        };
    }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    

    @Override
    public String getInventoryName() {
        return "NRE 3GS21B Genset";
    }

    
    



}
