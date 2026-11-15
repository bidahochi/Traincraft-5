package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselF45 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselF45;
    }
    public DieselF45(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "Great Northern");
        InsertTexture(1, "Burlington Northern");
        InsertTexture(2, "ATSF (Pinstripe)");
        InsertTexture(3, "ATSF (Freightbonnet)");
        InsertTexture(4, "ATSF (Kodachrome)");
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
            new SeatDefinition("driver", 1.6188F, 0.3F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.35F;
    }

    @Override
    public String transportYear() {
        return "1968-1971";
    }

    @Override
    public String getInventoryName() {
        return "EMD F45";
    }

    
    



}
