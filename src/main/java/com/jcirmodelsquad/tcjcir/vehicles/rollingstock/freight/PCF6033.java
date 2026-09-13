package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF6033 extends AbstractStandardFreightCar
{
    public PCF6033(World world) {
        super(world);
    }



    @Override
    public CargoManager setupCargoManager()
    {
        return null;
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "SP");
        InsertTexture(1, "SSW");
        InsertTexture(2, "Generic Brown");
        InsertTexture(3, "ARR");
        InsertTexture(4, "ATSF (Early)");
        InsertTexture(5, "ATSF");
        InsertTexture(6, "UP");
        InsertTexture(7, "WC");
        InsertTexture(8, "WRX");
        InsertTexture(9, "WRX (Tree Logo)");
        InsertTexture(10, "WRX (Washaska Text)");
        InsertTexture(11, "BNBX");
        InsertTexture(12, "GCM", train.common.enums.LockoutGroup.GCM); 
        InsertTexture(13, "SP (Paper Service)");
        InsertTexture(14, "WP");
        InsertTexture(15, "");
        InsertTexture(16, "");
    }

    @Override
    public String getInventoryName() {
        return "PC&F 6033 Cu Ft High Rectangular Prism";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }

    @Override
    public String transportYear() {
        return "1966-1967";
    }
}
