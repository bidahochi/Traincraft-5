package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCNW16_1_3Sleeper extends AbstractPassengerCar {

	public PSCNW16_1_3Sleeper(World world)
	{
		super(world);
	}



	/** Enables the onboard sleep menu for this sleeper car. */
	@Override
	public boolean hasSleepingBunk()
	{
		return true;
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}

	@Override
	public String transportYear() {
		return "1948";
	}
}
