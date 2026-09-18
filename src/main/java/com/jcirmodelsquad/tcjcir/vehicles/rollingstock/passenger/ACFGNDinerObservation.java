package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGNDinerObservation extends AbstractPassengerCar
{


	public ACFGNDinerObservation(World world) {
		super(world);
		InsertTexture(0, "GN Red River");
		InsertTexture(1, "GN Red River (Late)");
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
		return "1950";
	}

}