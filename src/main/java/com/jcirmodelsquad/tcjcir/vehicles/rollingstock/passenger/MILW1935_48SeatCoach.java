package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class MILW1935_48SeatCoach extends AbstractPassengerCar {

	public MILW1935_48SeatCoach(World world)
	{
		super(world);
		InsertTexture(0, "MILW (As built)");
		InsertTexture(1, "MILW (Air conditioned)");
		InsertTexture(2, "MILW (Hiawatha)");
		InsertTexture(3, "MILW (1938 Scheme)");
		InsertTexture(4, "MILW (Early postwar)");
		InsertTexture(5, "MILW (Postwar)");
		InsertTexture(6, "MILW (Postwar, ribbed)");
		InsertTexture(7, "MILW (UP scheme)");
		InsertTexture(8, "MILW (UP scheme, ribbed)");
		InsertTexture(9, "CGW");
		InsertTexture(10, "CGW (MARS light)");
	}

	public MILW1935_48SeatCoach(World world, double posX, double posY, double posZ)
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
		return 3.85F;
	}
}