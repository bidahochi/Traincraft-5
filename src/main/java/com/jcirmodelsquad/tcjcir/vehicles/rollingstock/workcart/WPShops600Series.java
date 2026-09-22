package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class WPShops600Series extends AbstractWorkCart
{

    public WPShops600Series(World world) {
        super(world);
        InsertTexture(0, "WP");
        InsertTexture(1, "WP");
        InsertTexture(2, "WP MOW");
        InsertTexture(3, "SN");
    }


    @Override
    public String transportCountry()
    {
        return "US";
    }

    @Override
    public double getAdditionalYOffset()
    {
        return -0.1F;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return 2.125F;
    }
}
