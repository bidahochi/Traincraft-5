package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamNS3700Class extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamNS3700Class;
	}
	public EntityLocoSteamNS3700Class(World world) {
		super(world, LiquidManager.WATER_FILTER);

		InsertTexture(0, "NS 3737");
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.5375F, 0F, 0.45F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "NS 3700 Class";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}
}