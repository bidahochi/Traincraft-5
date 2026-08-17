package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddCN39SeatParlor_Observation extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:buddcn39seatparlor_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_green_body_388", "marker_green_body_390", "marker_red_body_104",
            "marker_red_body_355", "marker_red_body_361", "marker_red_body_364")
        .color(
            train.common.api.RollingStockLightColors.GREEN,
            "marker_green_body_388", "marker_green_body_390")
        .color(
            train.common.api.RollingStockLightColors.RED,
            "marker_red_body_104", "marker_red_body_355",
            "marker_red_body_361", "marker_red_body_364")
        .build();

	public BuddCN39SeatParlor_Observation(World world)
	{
		super(world);
		InsertTexture(0, "CN 302 (early)");
		InsertTexture(1, "CN 302 (early, marker lights off)");
		InsertTexture(2, "CN 302");
		InsertTexture(3, "CN 302 (marker lights off)");
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
