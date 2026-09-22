package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN59SeatCoach_Observation extends AbstractPassengerCar
{

	public BuddCN59SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "CN 302 (post coach observation conversion)");
		InsertTexture(1, "CN 302 (post coach observation conversion, marker lights off)");
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
		return "(Rebuilt) 1964";
	}

}
