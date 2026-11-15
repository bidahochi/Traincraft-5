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

public class DieselU25B extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselU25B;
    }
    public DieselU25B(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "New Haven");
        InsertTexture(1, "Blandsville & Blankerston");
        InsertTexture(2, "FNCC (KIT-L)", LockoutGroup.FNCC);
        InsertTexture(3, "Great Northern (BSB)");
        InsertTexture(4, "Great Northern (EB Simp)");
        InsertTexture(5, "the Milwaukee Road");
        InsertTexture(6, "Burlington Northern");
        InsertTexture(7, "Deadwood & La Mesa (hamburger helper rayroad)", LockoutGroup.DLMR);
        InsertTexture(8, "Burlington");
        InsertTexture(9, "Nautilus", LockoutGroup.CUBED);
        InsertTexture(10, "New York Central (Early 60s)");
        InsertTexture(11, "New York Central (Very Late 60s)");
        InsertTexture(12, "Galesburg Clinton & Midland", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(13, "Detroit Export System (Bida Fictional)"/*, LockoutGroup.DES*/);
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
            new SeatDefinition("driver", 1.55F, 0.15F, -0.0078F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F; }

    @Override
    public String transportYear() {
        return "1959-1966";
    }

    @Override
    public String getInventoryName() {
        return "GE U25B Phase 2-4";
    }


}
