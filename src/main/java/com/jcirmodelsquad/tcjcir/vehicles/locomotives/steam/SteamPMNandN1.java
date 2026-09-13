package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamPMNandN1 extends SteamTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:pmnandn1")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "numberboard_body_448", "numberboard_body_449", "numberboard_body_493",
            "numberboard_body_494")
        .build();


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
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}