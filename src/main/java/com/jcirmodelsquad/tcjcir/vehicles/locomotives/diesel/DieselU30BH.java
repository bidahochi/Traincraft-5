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

public class DieselU30BH extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU30BH;
    }
    public DieselU30BH(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "Northern Cascades Transit Authority (NOCTA)", LockoutGroup.BIDA);
        InsertTexture(1, "Blandsville Area Rapid Transporation (BlART)");
        InsertTexture(2, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(3, "CRL (70s-80s)");
        InsertTexture(4, "CRL (80s-2006)");
        InsertTexture(5, "CRL (2006-onwards)");
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
            new SeatDefinition("driver", 1.675F, 0.25F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.315F; }

    @Override
    public String transportYear() {
        return "1976-1977";
    }

    @Override
    public String getInventoryName() {
        return "CEE U30B(H)";
    }

    @Override
    public boolean isFictional() {
        return true;
    }
}
