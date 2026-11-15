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

public class SteamClimaxB extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamClimaxB;
	}
	public SteamClimaxB(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Hillcrest Lumber Co #9");
		InsertTexture(1, "Washaska Resources #6", LockoutGroup.BIDA);
		InsertTexture(2, "Washaska Resources #7", LockoutGroup.BIDA);
		InsertTexture(3, "Clarks Milling & Lumber Co", LockoutGroup.CDCS);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.5613F, 0F, 0.4F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "50 Ton Class B Climax";
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