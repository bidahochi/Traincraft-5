package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class SteamOnion extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamOnion;
	}
	public SteamOnion(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		//InsertTexture(4, "MISSINGNO BUTTSECKS RAILROAD NUMBER 1");
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.725F, 0F, 0.0003F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "Onion";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.3F;
	}

	@Override
	public String transportCountry()
	{
		return "Moon";
	}


}