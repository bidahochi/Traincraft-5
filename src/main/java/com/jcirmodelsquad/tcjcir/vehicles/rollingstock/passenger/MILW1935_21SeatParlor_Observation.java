package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class MILW1935_21SeatParlor_Observation extends AbstractPassengerCar {

	public MILW1935_21SeatParlor_Observation(World world)
	{
		super(world);
		InsertTexture(0, "MILW (As built)");
		InsertTexture(1, "MILW (New marker lights)");
		InsertTexture(2, "MILW (1938 Scheme)");
		InsertTexture(3, "MILW (1942 Renovation)");
		InsertTexture(4, "MILW (Early postwar)");
		InsertTexture(5, "MILW (Early postwar, removed handrails)");
	}

	public MILW1935_21SeatParlor_Observation(World world, double posX, double posY, double posZ)
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
		return 3.81F;
	}
}