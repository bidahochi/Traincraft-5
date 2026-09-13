package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddRDG56SeatCoach_Observation extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:buddrdg56seatcoach_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_green_body_616", "marker_green_body_618", "marker_red_body_104",
            "marker_red_body_575", "marker_red_body_581", "marker_red_body_584")
        .color(
            train.common.api.RollingStockLightColors.GREEN,
            "marker_green_body_616", "marker_green_body_618")
        .color(
            train.common.api.RollingStockLightColors.RED,
            "marker_red_body_104", "marker_red_body_575",
            "marker_red_body_581", "marker_red_body_584")
        .build();

	public BuddRDG56SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "RDG 1");
		InsertTexture(1, "RDG 1 (marker lights off)");
		InsertTexture(2, "RDG 5");
		InsertTexture(3, "RDG 5 (marker lights off)");
		InsertTexture(4, "RDG 1 and 5 (post 1953 refurbishment)");
		InsertTexture(5, "RDG 1 and 5 (post 1953 refurbishment, marker lights off)");
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
		return "1937";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}
