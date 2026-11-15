package com.jcirmodelsquad.tcjcir.vehicles.locomotives.eletric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import com.jcirmodelsquad.tcjcir.models.passengerparts.ModelFourCorHeadboard;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class ElectricFourCor extends ElectricTrain {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);
    @Override
    public SoundRecord getSoundRecord()
    {
        return EnumSounds.ElectricFourCor;
    }
    public ElectricFourCor(World world) {
        super(world);
        InsertTexture(0, "SR");
        InsertTexture(1, "SR (Unlined)");
        InsertTexture(2, "BR (Green)");
        InsertTexture(3, "BR (Green, Small Warning Panel)");
        InsertTexture(4, "BR (Green, Full Yellow Front)");
        InsertTexture(5, "BR (Blue, Small Warning Panel)");
        InsertTexture(6, "BR (Blue, Full Yellow Front)");
        InsertTexture(7, "CCRL (South Eastern Green)");
        InsertTexture(8, "CCRL");

        setCargoManager(new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(ModelFourCorHeadboard.class, "loads/4cor_Headboard",
                        "Headboards", 0, 3, 0)},

        }));
    }

    
    @Override
    protected SeatDefinition[] getSeatDefinitions()
    {
        return new SeatDefinition[]
        {
            new SeatDefinition("driver", 2.46F, 0F, -0.46F, SeatRole.DRIVER)
        };
    }


    
    @Override
    public String getInventoryName() {
        return "4-Cor Locomotive";
    }


    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 1.1F;
    }


    
}