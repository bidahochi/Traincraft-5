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

public class SteamAlco0_6_0T extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamAlco0_6_0T;
	}
	public SteamAlco0_6_0T(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Generic");
		InsertTexture(1, "CDCS", LockoutGroup.CDCS);
		InsertTexture(2, "SPR", LockoutGroup.SPR);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.8256F, -0.23F, 0.45F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "Alco 0-6-0T";
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.15F;
	}



}