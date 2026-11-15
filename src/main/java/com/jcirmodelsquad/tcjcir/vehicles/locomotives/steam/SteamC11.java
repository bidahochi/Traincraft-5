package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamC11 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamC11;
	}
	public SteamC11(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1F, 0.2F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "JNR C411";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.9F;
	}

	@Override
	public String transportCountry()
	{
		return "JP";
	}
}