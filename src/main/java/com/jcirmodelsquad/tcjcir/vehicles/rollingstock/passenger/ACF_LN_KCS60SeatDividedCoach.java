package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACF_LN_KCS60SeatDividedCoach extends AbstractPassengerCar
{

	public ACF_LN_KCS60SeatDividedCoach(World world) {
		super(world);
		InsertTexture(0, "L&N");
		InsertTexture(1, "L&N (Late)");
		InsertTexture(2, "KCS");
		InsertTexture(3, "AMTK (ex L&N)");
		InsertTexture(4, "AMTK (ex L&N, alternate interior)");
		InsertTexture(5, "LIRR (ex KCS)");
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
		return "1955-1956";
	}

}