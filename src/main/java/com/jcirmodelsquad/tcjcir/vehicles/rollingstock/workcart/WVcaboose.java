package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class WVcaboose extends AbstractWorkCart
{

    public WVcaboose(World world) {
        super(world);
        InsertTexture(0, "ATSF");
        InsertTexture(1, "BN");
        InsertTexture(2, "MT&S");
        InsertTexture(3, "OWO");
        InsertTexture(4, "SOO");
        InsertTexture(5, "Generic Green");
        InsertTexture(6, "Magnolia");
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public double getAdditionalYOffset()
    {
        return 0.3125F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 1.9375F;
    }
}
