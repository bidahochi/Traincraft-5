package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamBrank extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamBrank;
	}
	public SteamBrank(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "pregnant man railroad company", LockoutGroup.CDCS);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.7175F, -0.23F, 0.45F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "2-6-2T Branch Tank \"Brank\"";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}

	@Override
	public boolean isFictional() {
		return true;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}


}