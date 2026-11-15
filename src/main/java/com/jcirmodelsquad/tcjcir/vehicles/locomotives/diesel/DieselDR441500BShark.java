package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselDR441500BShark extends DieselTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDR441500BShark;
    }
    public DieselDR441500BShark(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "Demonstrator");
        InsertTexture(1, "Elgin, Joliet & Eastern");
        InsertTexture(2, "Baltimore & Ohio");
        InsertTexture(3, "Baltimore & Ohio (Late)");
        InsertTexture(4, "Blandsville & Blankerston");

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
            new SeatDefinition("driver", 1.8F, -0.08F, 0.47F, SeatRole.DRIVER)
        };
    }
    



    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.08F;
    }

    @Override
    public String getInventoryName() {
        return "BLW DR-4-4-1500B (Phase 3)";
    }

    
    

}
