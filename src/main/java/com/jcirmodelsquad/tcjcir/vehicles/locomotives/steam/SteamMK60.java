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

public class SteamMK60 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamMK60;
	}
	public SteamMK60(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Blank");
		InsertTexture(1, "Spoof Texture");
		InsertTexture(2, "WP 320-326");
		InsertTexture(3, "WP 322-323");
		InsertTexture(4, "WP 327-329");
		InsertTexture(5, "WP 334 NEP-WP Condition", LockoutGroup.CUBED);
		InsertTexture(6, "WP 334-335");
		InsertTexture(7, "DLMR 199", LockoutGroup.DLMR);
		InsertTexture(8, "FMSR 560-574", LockoutGroup.FMSR);
		InsertTexture(9, "FMSR 575-579", LockoutGroup.FMSR);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 2765;
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1.2, 0.25, -0.45); }

	@Override
	public String getInventoryName() {
		return "WP MK60-71 2-8-2";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.7F;
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