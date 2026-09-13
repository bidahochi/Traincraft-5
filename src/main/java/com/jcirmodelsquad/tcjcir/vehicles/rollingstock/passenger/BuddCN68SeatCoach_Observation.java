package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN68SeatCoach_Observation extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:buddcn68seatcoach_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_green_body_448", "marker_green_body_450", "marker_red_body_104",
            "marker_red_body_415", "marker_red_body_421", "marker_red_body_424")
        .color(
            train.common.api.RollingStockLightColors.GREEN,
            "marker_green_body_448", "marker_green_body_450")
        .color(
            train.common.api.RollingStockLightColors.RED,
            "marker_red_body_104", "marker_red_body_415",
            "marker_red_body_421", "marker_red_body_424")
        .build();

	public BuddCN68SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "CN 304 (early)");
		InsertTexture(1, "CN 304 (early, marker lights off)");
		InsertTexture(2, "CN 304");
		InsertTexture(3, "CN 304 (marker lights off)");
		InsertTexture(4, "CN 304 (late)");
		InsertTexture(5, "CN 304 (late, marker lights off)");
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
