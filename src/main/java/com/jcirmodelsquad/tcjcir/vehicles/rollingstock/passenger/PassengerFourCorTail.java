package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import com.jcirmodelsquad.tcjcir.models.passengerparts.ModelFourCorHeadboard;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class PassengerFourCorTail extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public PassengerFourCorTail(World world)
    {
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
    public float getOptimalLinkingDistance()
    {
        return 2.91F;
    }
}