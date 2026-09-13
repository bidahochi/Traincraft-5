package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamAlco0_6_0T extends SteamTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:alco0_6_0t")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_275", "numberboard_body_309", "numberboard_body_74")
        .build();

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamAlco0_6_0T;
	}
	public SteamAlco0_6_0T(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Generic");
		InsertTexture(1, "CDCS", LockoutGroup.CDCS);
		InsertTexture(2, "SPR", LockoutGroup.SPR);
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.33, -0.23, -0.45); }

	@Override
	public String getInventoryName() {
		return "Alco 0-6-0T";
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
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}