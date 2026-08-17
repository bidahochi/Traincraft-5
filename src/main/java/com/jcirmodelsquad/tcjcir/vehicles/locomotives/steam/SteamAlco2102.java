package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamAlco2102 extends SteamTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:alco2102")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_330", "marker_body_332", "marker_body_335",
            "marker_box")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_114", "numberboard_body_260", "numberboard_body_261")
        .build();

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
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}