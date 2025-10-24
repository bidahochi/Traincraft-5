package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class MILW1935Baggage_Dinette extends AbstractPassengerCombineCar
{

	public MILW1935Baggage_Dinette(World world)
	{
		super(world);

	}

	public MILW1935Baggage_Dinette(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "MILW (Tap-dinettes 5251-5252 were built in this form but were modified into tap-dinettes before being placed into service");
	}

	@Override
	public String getInventoryName()
	{
		return "MILW 1935 Baggage-Dinette";
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.38F;
	}
}