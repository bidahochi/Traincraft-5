package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamBKno2b extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamBKno2b;
	}
	public SteamBKno2b(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 1.5219F, 0.15F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "Booth-Kelly Lumber Co. No2";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.75F;
	}
}