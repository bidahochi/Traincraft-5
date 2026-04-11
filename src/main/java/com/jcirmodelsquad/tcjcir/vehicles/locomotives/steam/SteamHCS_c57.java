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

public class SteamHCS_c57 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamHCS_c57;
	}
	public SteamHCS_c57(World world) {
		super(world, LiquidManager.WATER_FILTER);

		InsertTexture(0, "SP C9 2799");
		InsertTexture(1, "SP C9 2759");
		InsertTexture(2, "SP C9 2560/2567");
		InsertTexture(3, "SP C9 2579");
		InsertTexture(4, "SP C9 2590/2599");
		InsertTexture(5, "SP C9 2564/2567");
		InsertTexture(6, "C57 C9 Blank");
		InsertTexture(7, "WPSR CO-04B \"Pine Class\" (Post FMSR Merger)", LockoutGroup.FMSR);
		InsertTexture(8, "UP C57 Blank");
		InsertTexture(9, "UP C57 (General 1920s Condition)");
		InsertTexture(10, "UP C57 374/376 (w/ Snowplow)");
		InsertTexture(11, "UP C57 6046/6053 (1950s re-number)");
		InsertTexture(12, "Herber Valley 618");
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.9, 0.2, -0.45); }

	@Override
	public float transportMetricHorsePower()
	{
		return 1753;
	}

	@Override
	public String getInventoryName() {
		return "UP-SP C57 2-8-0";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.15F;
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
		return 2000;
	}
}