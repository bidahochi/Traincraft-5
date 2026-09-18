package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCNW1DR_22SeatParlor extends AbstractPassengerCar
{


	public PSCNW1DR_22SeatParlor(World world)
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
		return 3.85F;
	}

	@Override
	public String transportYear() {
		return "1939, 1941, 1949";
	}

}