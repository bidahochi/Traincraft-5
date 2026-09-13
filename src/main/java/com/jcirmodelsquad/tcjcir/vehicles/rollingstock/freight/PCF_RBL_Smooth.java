package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class PCF_RBL_Smooth extends AbstractStandardFreightCar
{
    public PCF_RBL_Smooth(World world) {
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
        InsertTexture(0, "MKT");
        InsertTexture(1, "SP");
        InsertTexture(2, "SP (Ex EFCX)");
        InsertTexture(3, "SP (Ex EFCX)");
        InsertTexture(4, "WP");
        InsertTexture(5, "EFCX");
        InsertTexture(6, "GN");
        InsertTexture(7, "GN");
        InsertTexture(8, "BN");
        InsertTexture(9, "BN");
        InsertTexture(10, "BN");
        InsertTexture(11, "BN");
        InsertTexture(12, "RBBN");
        InsertTexture(13, "WFE");
        InsertTexture(14, "SLSF");
        InsertTexture(15, "SLSF");
        InsertTexture(16, "BB (Plug Door Early)");
        InsertTexture(17, "BB (Plug Door)");
        InsertTexture(18, "BB (Youngstown Door)");
    }

    @Override
    public String getInventoryName() {
        return "PC&F RBL Smoothside Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.85F;
    }

    @Override
    public String transportYear() {
        return "1965-1977";
    }
}
