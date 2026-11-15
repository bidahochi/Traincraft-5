package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselM630 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselM630D;
    }
    public DieselM630(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Pacific Great Eastern");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(3, "Great Lakes & Northern Territories");
        InsertTexture(4, "Latrans Range Railroad (Bida Fictional)"/*, LockoutGroup.LRR*/);

    }

    @Override
    public String transportCountry()
    {
        return "CA";
    }
    

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.0691F, 0.25F, 0.4F, SeatRole.DRIVER)
        };
    }








    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.525F;
    }



    @Override
    public String getInventoryName() {
        return "MLW M630 (Divot End)";
    }

    




}
