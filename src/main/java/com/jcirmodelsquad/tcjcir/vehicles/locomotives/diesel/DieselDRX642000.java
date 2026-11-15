package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;


public class DieselDRX642000 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselDRX642000;
    }
    public DieselDRX642000(World world) {
        super(world, LiquidManager.dieselFilter());
        
        InsertTexture(0, "CNJ");
        InsertTexture(1, "CNJ (late)");
        InsertTexture(2, "CNJ (late, #2004)");
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
            new SeatDefinition("driver", 2.84F, 0.18F, 0.35F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.98F; }

    @Override
    public String transportYear() {
        return "1948";
    }

    @Override
    public String getInventoryName() {
        return "BLW DRX-6-4-2000";
    }



}
