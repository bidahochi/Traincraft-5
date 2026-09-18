package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN68SeatCoach_Observation extends AbstractPassengerCar
{

	public BuddCN68SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "CN 304 (early)");
		InsertTexture(1, "CN 304 (early, marker lights off)");
		InsertTexture(2, "CN 304");
		InsertTexture(3, "CN 304 (marker lights off)");
		InsertTexture(4, "CN 304 (late)");
		InsertTexture(5, "CN 304 (late, marker lights off)");
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
