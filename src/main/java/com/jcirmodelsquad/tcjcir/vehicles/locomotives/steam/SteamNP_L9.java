package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamNP_L9 extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamNP_L9;
	}
	public SteamNP_L9(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.3503F, 0.1F, 0.45F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "NP L9 Class 0-6-0";
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.0F;
	}



}