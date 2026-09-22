package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddATSF34SeatParlor_Observation extends AbstractPassengerCar
{


	public BuddATSF34SeatParlor_Observation(World world)
	{
		super(world);
	}



	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.73F;
	}

	@Override
	public String transportYear() {
		return "1938";
	}

}