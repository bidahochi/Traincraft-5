package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACF_LN_KCS60SeatDividedCoach extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:acf_ln_kcs60seatdividedcoach")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_two_body_579", "marker_two_body_583")
        .build();

	public ACF_LN_KCS60SeatDividedCoach(World world) {
		super(world);
		InsertTexture(0, "L&N");
		InsertTexture(1, "L&N (Late)");
		InsertTexture(2, "KCS");
		InsertTexture(3, "AMTK (ex L&N)");
		InsertTexture(4, "AMTK (ex L&N, alternate interior)");
		InsertTexture(5, "LIRR (ex KCS)");
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.97F;
	}

	@Override
	public String transportYear() {
		return "1955-1956";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}