package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class ICC_Bobber extends AbstractWorkCart
{

    public ICC_Bobber(World world) {
        super(world);
        InsertTexture(0, "McCloud, As Modified");
        InsertTexture(1, "McCloud, As Delivered");
        InsertTexture(2, "Blank");
        InsertTexture(3, "Magnolia Acres; Coffeeville");
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
        return 1.625F;
    }


    /**
     * Returns the name of the inventory
     */
    @Override
    public String getInventoryName()
    {
        return "ICC Bobber Wide Vision";
    }
}
