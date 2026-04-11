package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamAlco2102 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Steam2102;
	}
	public SteamAlco2102(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Blandsville Forest Products, Inc");
		InsertTexture(1, "Sugar Pine Lumber");
		InsertTexture(2, "Consolidated Builders Inc");
		InsertTexture(3, "Kaiser Steel");
		InsertTexture(4, "Oil Clusters & Garden", LockoutGroup.CUBED);
		InsertTexture(5, "Washaska Resources \" The HOUND \"", LockoutGroup.BIDA);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 1613;
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.5, 0.1, -0.45); }

	@Override
	public String getInventoryName() {
		return "Alco 2-10-2ST";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.45F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public int getWaterConsumption()
	{
		return 75;
	}

	@Override
	public int getTankCapacity()
	{
		return 17000;
	}
}