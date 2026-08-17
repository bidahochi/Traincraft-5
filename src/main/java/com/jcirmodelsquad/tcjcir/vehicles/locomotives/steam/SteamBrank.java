package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamBrank extends SteamTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:brank")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_133", "numberboard_body_256")
        .build();

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamBrank;
	}
	public SteamBrank(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "pregnant man railroad company", LockoutGroup.CDCS);
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.28, -0.23, -0.45); }

	@Override
	public String getInventoryName() {
		return "2-6-2T Branch Tank \"Brank\"";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
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

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}