package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamClimaxNew extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamClimaxNew;
	}
	public SteamClimaxNew(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 680;
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.0, 0.25, -0.35); }

	@Override
	public String getInventoryName() {
		return "2 Truck Climax";
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

	@Override
	public int getWaterConsumption()
	{
		return 160;
	}

	@Override
	public int getTankCapacity()
	{
		return 8000;
	}
}