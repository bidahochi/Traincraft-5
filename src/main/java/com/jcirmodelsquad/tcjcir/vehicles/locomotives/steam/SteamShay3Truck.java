package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;

import train.common.library.sounds.SoundRecord;

public class SteamShay3Truck extends SteamTrain {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:shay3truck")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_317", "marker_body_318")
        .build();

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Steam3Truck;
	}
	public SteamShay3Truck(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, +0.1, 0.0, -0.35); }

	/*@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX-0.35F, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.0F, posZ+0.1F);// default
	}*/

	@Override
	public String getInventoryName() {
		return "Class 3-PC-13 3-Truck Shay";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
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