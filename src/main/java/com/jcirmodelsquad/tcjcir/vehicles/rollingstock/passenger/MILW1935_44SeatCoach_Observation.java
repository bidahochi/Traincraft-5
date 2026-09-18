package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class MILW1935_44SeatCoach_Observation extends AbstractPassengerCar {


	public MILW1935_44SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "MILW (Coach observation 4449-4450 were built in this form but were modified into parlor dinettes before being placed into service)");
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

	@Override
	public String transportYear() {
		return "1935";
	}

}