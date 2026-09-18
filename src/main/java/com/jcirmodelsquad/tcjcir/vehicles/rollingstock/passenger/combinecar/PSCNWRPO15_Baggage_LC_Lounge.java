package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class PSCNWRPO15_Baggage_LC_Lounge extends AbstractPassengerCombineCar
{


	public PSCNWRPO15_Baggage_LC_Lounge(World world)
	{
		super(world);
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public void setupTextureDescription()
	{

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
		return "1941";
	}

}