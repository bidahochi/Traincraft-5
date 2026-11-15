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

public class SteamAlco460 extends SteamTrain {


	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamAlco460;
	}
	public SteamAlco460(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Blank");
		InsertTexture(1, "CDC&S", LockoutGroup.CDCS);
		InsertTexture(2, "RI");
		InsertTexture(3, "%Lemo");
		InsertTexture(4, "GCM 67", LockoutGroup.GCM);
		InsertTexture(5, "GCM 60", LockoutGroup.GCM);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.5F, 0.1F, 0.45F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "ALCo 4-6-0";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.2F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}


}