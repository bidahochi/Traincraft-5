package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCNWBaggage_LC_Diner extends AbstractPassengerCar {


	public PSCNWBaggage_LC_Diner(World world)
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
		return "1950";
	}

}