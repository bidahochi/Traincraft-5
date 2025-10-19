package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.workcart;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractWorkCart;
import train.common.enums.LockoutGroup;

public class HBC1Cboose extends AbstractWorkCart
{
    public HBC1Cboose(World world) {
        super(world);
        InsertTexture(0, "Western Pacific");
        InsertTexture(1, "Steampunk Rail", LockoutGroup.SPR);
        InsertTexture(2, "Great Lakes & Northern Territories"); // Great Lakes & Nice Tiddies
        InsertTexture(3, "CRL");
        InsertTexture(4, "CRL (MOW)");
    }

    public HBC1Cboose(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
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