package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselMP15DCW9 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselMP15DCW9;
    }
    public DieselMP15DCW9(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, ""); // buttsecks poopyhead dead rayroad boner ;)
        InsertTexture(1, "WFR but AWESOME");
        InsertTexture(2, "SST but AWESOMER");
        //when the
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
            new SeatDefinition("driver", 0.7875F, 0.4F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.9F;
    }

    @Override
    public String getInventoryName() {
        return "WFLW MP15DCW-9";
    }

    @Override
    public boolean isFictional() {
        return true;
    }


}
