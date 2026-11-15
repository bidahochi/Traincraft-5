package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamMacky extends SteamTrain {
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.SteamWCPMacky;
    }
    public SteamMacky(World world) {
        super(world, LiquidManager.WATER_FILTER);
        
    }

    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", -1.9781F, 0.2F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public boolean isFictional() {
        return true;
    }

    @Override
    public String getInventoryName() {
        return "WCP Macky 0-10-2";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.4F;
    }

    @Override
    public String transportCountry()
    {
        return "US";
    }

}