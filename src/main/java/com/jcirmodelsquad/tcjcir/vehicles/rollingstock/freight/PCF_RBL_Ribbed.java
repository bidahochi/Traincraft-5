package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF_RBL_Ribbed extends AbstractStandardFreightCar
{
    public PCF_RBL_Ribbed(World world) {
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
        InsertTexture(0, "PC");
        InsertTexture(1, "CR");
        InsertTexture(2, "ATSF (As Delivered)");
        InsertTexture(3, "ATSF");
        InsertTexture(4, "SLSF");
        InsertTexture(5, "SLSF");
        InsertTexture(6, "BN (Ex SLSF)");
        InsertTexture(7, "DRGW");
        InsertTexture(8, "MP");
        InsertTexture(9, "T&P");
        InsertTexture(10, "UP");
        InsertTexture(11, "Generic Brown");
        InsertTexture(12, "BB (Youngstown Door)");
    }

    @Override
    public String getInventoryName() {
        return "PC&F RBL Ribbedside Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }

    @Override
    public String transportYear() {
        return "1968-1977";
    }
}
