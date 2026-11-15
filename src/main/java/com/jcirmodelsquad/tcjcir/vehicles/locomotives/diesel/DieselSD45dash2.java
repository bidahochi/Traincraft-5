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


public class DieselSD45dash2 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD45dash2;
    }
    public DieselSD45dash2(World world) {
        super(world, LiquidManager.dieselFilter());
        
        //when the
        InsertTexture(0, "Great Northern (Big Sky)");
        InsertTexture(1, "Great Northern (Empire Simplified");
        InsertTexture(2, "Burlington Northern");
        InsertTexture(3, "Northern Pacific");
        InsertTexture(4, "Southern Pacific (Early)");
        InsertTexture(5, "Penn Central");
        InsertTexture(6, "Denver & Rio Grande Western");
        InsertTexture(7, "Denver & Rio Grande Western");
        InsertTexture(8, "THE MILWAUKEE ROAD");
        InsertTexture(9, "THE MILWAUKEE ROAD");
        InsertTexture(10, "Chicago Northwestern");
        InsertTexture(11, "Chicago Northwestern (Zito Yellow)");
        InsertTexture(12, "Frisco");
        InsertTexture(13, "ATSF 5691 (Freightbonnet");
        InsertTexture(14, "ATSF 5712 (Freightbonnet)");
        InsertTexture(15, "ATSF (Bicentennial)");
        InsertTexture(16, "BNSF (Ex-ATSF Patched)");
        InsertTexture(17, "BNSF (H1)");
        InsertTexture(18, "BNSF (H3)");
        InsertTexture(19, "Blandsville & Blankerston (Flared Radiator)");
        InsertTexture(20, "Blandsville & Blankerston");
        InsertTexture(22, "CSXT (Yn3)");
        InsertTexture(23, "Morristown Tenneva & Southern", LockoutGroup.MTS);
        InsertTexture(24, "Glitter like the golden beautiful betch you are");
        InsertTexture(25, "GLC (Cigar Band)");
        InsertTexture(26, "AA (Fog)");

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
            new SeatDefinition("driver", 1.6688F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.45F;
    }

    @Override
    public String transportYear() {
        return "1972-1974";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD45";
    }


    



}
