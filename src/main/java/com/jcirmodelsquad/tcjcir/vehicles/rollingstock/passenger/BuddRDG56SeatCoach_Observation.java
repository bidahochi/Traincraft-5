package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddRDG56SeatCoach_Observation extends AbstractPassengerCar
{

	public BuddRDG56SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "RDG 1");
		InsertTexture(1, "RDG 1 (marker lights off)");
		InsertTexture(2, "RDG 5");
		InsertTexture(3, "RDG 5 (marker lights off)");
		InsertTexture(4, "RDG 1 and 5 (post 1953 refurbishment)");
		InsertTexture(5, "RDG 1 and 5 (post 1953 refurbishment, marker lights off)");
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
		return "1937";
	}

}
