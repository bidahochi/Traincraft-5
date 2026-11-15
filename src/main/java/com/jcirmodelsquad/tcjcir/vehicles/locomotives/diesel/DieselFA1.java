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


public class DieselFA1 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselFA1;
    }
    public DieselFA1(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "New Haven");
        InsertTexture(1, "New Haven 2");
        InsertTexture(2, "Lehigh Valley");
        InsertTexture(3, "Reading");
        InsertTexture(4, "Great Northern");
        InsertTexture(5, "Great Northern (Solid)");
        InsertTexture(6, "Lehigh & New England");
        InsertTexture(7, "Lehigh & New England (late)");
        InsertTexture(8, "Deadwood & La Mesa", LockoutGroup.DLMR);
        InsertTexture(9, "Deadwood & La Mesa", LockoutGroup.DLMR);
        InsertTexture(10, "LIRR (Experimental)");
        InsertTexture(11, "LIRR (MTA Scheme #1 Grills)");
        InsertTexture(12, "LIRR (MTA Scheme #1 No Grills)");
        InsertTexture(13, "LIRR (MTA Scheme #1 Alt NBoards Grills)");
        InsertTexture(14, "LIRR (MTA Scheme #1 Alt NBoards No Grills)");
        InsertTexture(15, "LIRR (MTA Scheme #2)");
        InsertTexture(16, "LIRR (MTA Scheme #3)");
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
            new SeatDefinition("driver", 1.2766F, 0.14F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.93F;
    }

    

    @Override
    public String getInventoryName() {
        return "Alco FA-1";
    }

    




}
