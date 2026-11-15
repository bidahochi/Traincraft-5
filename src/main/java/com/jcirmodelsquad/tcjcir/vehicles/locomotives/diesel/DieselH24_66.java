package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class DieselH24_66 extends DieselTrain {

    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.DieselH24_66;
    }
    public DieselH24_66(World world) {
        super(world, LiquidManager.dieselFilter());

        InsertTexture(0, "FM Demo");
        InsertTexture(1, "Virginian");
        InsertTexture(2, "Illinois Central (Semi-Fictional)");
        InsertTexture(3, "Reading");
        InsertTexture(4, "Southern Pacific");
        InsertTexture(5, "Erie Lackawanna");
        InsertTexture(6, "West Creek Pacific");
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
            new SeatDefinition("driver", 1.6145F, 0.15F, 0F, SeatRole.DRIVER)
        };
    }




    



    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.1F;
    }

    

    @Override
    public String getInventoryName() {
        return "FM H24-66";
    }





}
