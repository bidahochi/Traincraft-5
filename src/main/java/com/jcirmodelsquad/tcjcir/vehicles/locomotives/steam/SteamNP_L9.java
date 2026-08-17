package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamNP_L9 extends SteamTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:np_l9")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_276", "numberboard_body_277", "numberboard_body_278",
            "numberboard_body_286", "numberboard_body_288")
        .build();

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
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}