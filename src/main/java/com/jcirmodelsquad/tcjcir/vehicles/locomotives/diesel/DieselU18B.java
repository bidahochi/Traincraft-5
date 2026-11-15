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

public class DieselU18B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU18B;
    }
    public DieselU18B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "MEC 405");
        InsertTexture(1, "MEC 402");
        InsertTexture(2, "PW 1801 (As Delivered)");
        InsertTexture(3, "PW 1801 (Early)");
        InsertTexture(4, "Blandsville & Blankerston");
        InsertTexture(5, "Pickens Railway");
        InsertTexture(6, "CSXT MOW");
        InsertTexture(7, "Carbondale & Pine Valley", LockoutGroup.CPV);
        InsertTexture(8, "West Creek Pacific");
        InsertTexture(9, "Seaboard Coast Line");
        InsertTexture(10, "Seaboard System");
        InsertTexture(11, "Seaboard System (Family Lines)");
        InsertTexture(12, "SCL Blank");
        InsertTexture(13, "Texas Utilities");
        InsertTexture(14, "Texas Utilities (RCO Gear)");
        //InsertTexture(16, "NEP");
        InsertTexture(16, "NDEM (Red & Olive)");
        InsertTexture(17, "FMN (Two Tone Blue)");
        InsertTexture(18, "CSXT");
        InsertTexture(19, "CSXT");
        InsertTexture(20, "CSXT");
        InsertTexture(21, "CSXT");
        InsertTexture(22, "CSXT");
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
            new SeatDefinition("driver", 1.2531F, 0.2F, -0.0003F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.2F;
    }

    @Override
    public String transportYear() {
        return "1973-1976";
    }

    @Override
    public String getInventoryName() {
        return "GE U18B";
    }


}
