package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class MILW1935Tap_Dinette extends AbstractPassengerCar {

	public MILW1935Tap_Dinette(World world)
	{
		super(world);
		InsertTexture(0, "MILW (As built)");
		InsertTexture(1, "MILW (1938 Scheme)");
		InsertTexture(2, "MILW (1942 Renovation)");
		InsertTexture(3, "MILW (5252, 1945 Renovation)");
		InsertTexture(4, "MILW (5251, 1946 Renovation)");
		InsertTexture(5, "MILW (5251, Postwar)");
		InsertTexture(6, "MILW (5252, Postwar)");
		InsertTexture(7, "MILW (5251, Postwar, ribbed)");
	}

	public MILW1935Tap_Dinette(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.38F;
	}
}