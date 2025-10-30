package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import com.jcirmodelsquad.tcjcir.models.passengerparts.ModelFourCorHeadboard;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class PassengerFourCorTrailerSecond extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public PassengerFourCorTrailerSecond(World world)
    {
        super(world);
        InsertTexture(0, "SR");
        InsertTexture(1, "SR (Unlined)");
        InsertTexture(2, "BR (Green)");
        InsertTexture(3, "BR (Blue)");
        InsertTexture(4, "CCRL (South Eastern Green)");
        InsertTexture(5, "CCRL");

        setCargoManager(new CargoManager(new CargoSpecification[][] {
                { new CargoSpecification(ModelFourCorHeadboard.class, "loads/4cor_Headboard",
                        "Headboards", 0, 3, 0)},

        }));
    }

    

    @Override
    public float getOptimalLinkingDistance()
    {
        return 2.91F;
    }
}