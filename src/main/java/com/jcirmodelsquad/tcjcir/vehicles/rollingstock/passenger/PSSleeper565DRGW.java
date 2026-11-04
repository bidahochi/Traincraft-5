package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.enums.LockoutGroup;

public class PSSleeper565DRGW extends AbstractPassengerCar
{

	public PSSleeper565DRGW(World world) {
		super(world);
		InsertTexture(0, "D&RGW");
		InsertTexture(1, "FMSR", LockoutGroup.FMSR);
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
