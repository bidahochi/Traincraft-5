package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamVBShay2 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamVBShay2;
	}

	public SteamVBShay2(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public boolean shouldRiderSit(){return false;}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.4F, 0.5F, 0.35F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "2 Truck Vertical Boiler Shay";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}
}