package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamVBShay2 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamVBShay2;
	}

	public SteamVBShay2(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public boolean shouldRiderSit(){return false;}

	@Override
	public float transportMetricHorsePower()
	{
		return 630;
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0, 0.5, -0.35); }

	@Override
	public String getInventoryName() {
		return "2 Truck Vertical Boiler Shay";
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
		return 6000;
	}
}