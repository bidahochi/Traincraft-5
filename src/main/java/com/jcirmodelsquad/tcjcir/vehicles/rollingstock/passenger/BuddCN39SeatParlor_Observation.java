package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN39SeatParlor_Observation extends AbstractPassengerCar
{

	public BuddCN39SeatParlor_Observation(World world)
	{
		super(world);
		InsertTexture(0, "CN 302 (early)");
		InsertTexture(1, "CN 302 (early, marker lights off)");
		InsertTexture(2, "CN 302");
		InsertTexture(3, "CN 302 (marker lights off)");
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
