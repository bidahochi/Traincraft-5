package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamPMNandN1 extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamPMNandN1;
	}
	public SteamPMNandN1(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Pere Marquette N Class");
		InsertTexture(1, "C&O N Class");
		InsertTexture(2, "Pere Marquette N-1 Class");
		InsertTexture(3, "C&O N-1 Class");
		InsertTexture(4, "Polar Express");
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 3000;
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.75, 0.15, -0.5); }

	@Override
	public String getInventoryName() {
		return "Pere Marquette N and N-1";
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

	@Override
	public int getWaterConsumption()
	{
		return 80;
	}

	@Override
	public int getTankCapacity()
	{
		return 6000;
	}
}