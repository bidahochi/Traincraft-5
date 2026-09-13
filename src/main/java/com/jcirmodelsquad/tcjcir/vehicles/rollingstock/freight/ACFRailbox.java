package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACFRailbox extends AbstractStandardFreightCar
{
    public ACFRailbox(World world) {
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
        InsertTexture(0, "Railbox (XAF-10)");
        InsertTexture(1, "Railbox (XAF-11)");
        InsertTexture(2, "Railbox (XAF-20)");
        InsertTexture(3, "Railbox (XAF-20a)");
        InsertTexture(4, "Railbox (XAF-20b)");
        InsertTexture(5, "Railbox (XAF-20c)");
        InsertTexture(6, "Railbox (XAF-20, modern)");
        InsertTexture(7, "Railbox (XAF-20a, modern)");
        InsertTexture(8, "Railbox (XAF-20b & XAF-20c, modern)");
        InsertTexture(9, "MNS");
        InsertTexture(10, "Blandsville & Blankerston");
    }

    @Override
    public String getInventoryName() {
        return "ACF Railbox Boxcar";
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {
        return 2.75F;
    }

    @Override
    public String transportYear() {
        return "1974-1980";
    }
}
