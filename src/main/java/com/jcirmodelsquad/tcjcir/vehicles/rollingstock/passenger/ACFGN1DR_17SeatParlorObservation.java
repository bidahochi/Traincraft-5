package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGN1DR_17SeatParlorObservation extends AbstractPassengerCar
{


	public ACFGN1DR_17SeatParlorObservation(World world) {
		super(world);
		InsertTexture(0, "GN Internationals");
		InsertTexture(1, "GN Internationals (Late)");
		InsertTexture(2, "AMTK (Abraham Lincoln)");
		InsertTexture(3, "AMTK");
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