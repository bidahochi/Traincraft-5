package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamNP_L9 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamNP_L9;
	}
	public SteamNP_L9(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.6, 0.1, -0.45); }

	@Override
	public float transportMetricHorsePower()
	{
		return 1200;
	}

	@Override
	public String getInventoryName() {
		return "NP L9 Class 0-6-0";
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

	@Override
	public int getWaterConsumption()
	{
		return 180;
	}

	@Override
	public int getTankCapacity()
	{
		return 3000;
	}

}