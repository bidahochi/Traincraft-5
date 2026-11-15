package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricTwoBil extends ElectricTrain {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricTwoBil;
    }
    public ElectricTwoBil(World world) {
        super(world);
        InsertTexture(0, "SR");
        InsertTexture(1, "BR (Green)");
        InsertTexture(2, "BR (Green, Small Warning Panel)");
        InsertTexture(3, "BR (Green, Full Yellow Front)");
        InsertTexture(4, "BR (Blue, Small Warning Panel)");
        InsertTexture(5, "BR (Blue, Full Yellow Front)");
        InsertTexture(6, "CCRL (South Eastern Green)");
        InsertTexture(7, "CCRL");
    }

    @Override
    public String transportCountry()
    {
        return "UK";
    }

    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.33F, 0F, -0.41F, SeatRole.DRIVER)
        };
    }


    
    @Override
    public String getInventoryName() {
        return "2-Bil Locomotive";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.2F;
    }


    
}