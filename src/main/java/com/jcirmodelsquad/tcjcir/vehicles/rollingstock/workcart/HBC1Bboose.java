package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;

public class HBC1Bboose extends AbstractWorkCart
{

    public HBC1Bboose(World world) {
        super(world);
        InsertTexture(0, "Ann Arbor");
        InsertTexture(1, "WV");
        InsertTexture(2, "GCN");
        InsertTexture(3, "GCM", train.common.enums.LockoutGroup.GCM);
        InsertTexture(4, "TIRY");
        InsertTexture(5, "TIRY");
        InsertTexture(6, "CRL");
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
        return 2.23F;
    }
}
