package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;


public class DieselSD38 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselSD38;
    }
    public DieselSD38(World world) {
        super(world, LiquidManager.dieselFilter());

        //when the
        InsertTexture(0, "Yankee(with no brim)town Dock Corporation");
        InsertTexture(1, "McCloud River Railroad");
        InsertTexture(2, "Conrail");
        InsertTexture(3, "LLPX");
        InsertTexture(4, "Masaou");
        InsertTexture(5, "FURRX");
        InsertTexture(6, "FURRX");
        InsertTexture(7, "NSCC");
        InsertTexture(8, "SPB");
        InsertTexture(9, "CSXT (Yn2)");
        InsertTexture(10, "CSXT (Yn3)");
        InsertTexture(11, "Seaboard System");
        InsertTexture(12, "GLC (EX SPB)");
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
            new SeatDefinition("driver", 1.4875F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.3F; }

    @Override
    public String transportYear() {
        return "1967-1971";
    }

    @Override
    public String getInventoryName() {
        return "EMD SD38";
    }


}