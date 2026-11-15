package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.api.control.SteamFiringType;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class SteamP01a extends SteamTrain
{
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamP01a;
	}

	public SteamP01a(World world)
	{
		super(world, LiquidManager.WATER_FILTER);

		InsertTexture(0, "WRX 10", LockoutGroup.BIDA);
		InsertTexture(1, "WRX 12", LockoutGroup.BIDA);
		InsertTexture(2, "CDC&S 7", LockoutGroup.CDCS);
	}

	@Override
	public SteamFiringType defaultFiringTypeForSkin(int skin)
	{
		return SteamFiringType.OIL;
	}

	@Override
	protected int liquidFuelCapacity()
	{
		return getTrainSpec().getSecondaryTankCapacity();
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.6719F, 0.1F, 0.3844F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "P01a 2-6-2 Prairie";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.05F;
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
