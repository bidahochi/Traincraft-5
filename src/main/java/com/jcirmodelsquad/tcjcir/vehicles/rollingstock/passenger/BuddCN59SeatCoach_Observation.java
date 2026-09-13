package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN59SeatCoach_Observation extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:buddcn59seatcoach_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_green_body_408", "marker_green_body_410", "marker_red_body_104",
            "marker_red_body_375", "marker_red_body_381", "marker_red_body_384")
        .color(
            train.common.api.RollingStockLightColors.GREEN,
            "marker_green_body_408", "marker_green_body_410")
        .color(
            train.common.api.RollingStockLightColors.RED,
            "marker_red_body_104", "marker_red_body_375",
            "marker_red_body_381", "marker_red_body_384")
        .build();

	public BuddCN59SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "CN 302 (post coach observation conversion)");
		InsertTexture(1, "CN 302 (post coach observation conversion, marker lights off)");
	}

	

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.85F;
	}

	@Override
	public String transportYear() {
		return "(Rebuilt) 1964";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
