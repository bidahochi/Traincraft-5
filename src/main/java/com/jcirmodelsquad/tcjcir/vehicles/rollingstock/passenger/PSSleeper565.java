package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSSleeper565 extends AbstractPassengerCar
{

	public PSSleeper565(World world) {
		super(world);
		InsertTexture(0, "C&O");
		InsertTexture(1, "NKP");
		InsertTexture(2, "IC");
		InsertTexture(3, "IC (City of Miami)");
		InsertTexture(4, "B&O");
		InsertTexture(5, "B&O (ex-C&O)");
		InsertTexture(6, "D&RGW (As Delivered)");
		InsertTexture(7, "C&O (PM Scheme) (Semi-Fictional)");
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
		return "1950";
	}
}
