package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
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
	public float transportMetricHorsePower()
	{
		return 1286;
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.3, 0.0, -0.45); }

	@Override
	public String getInventoryName() {
		return "NS 3700 Class";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}

	@Override
	public int getWaterConsumption()
	{
		return 100;
	}

	@Override
	public int getTankCapacity()
	{
		return 4000;
	}
}