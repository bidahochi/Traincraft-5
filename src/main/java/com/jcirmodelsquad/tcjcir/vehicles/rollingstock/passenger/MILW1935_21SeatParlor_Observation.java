package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class MILW1935_21SeatParlor_Observation extends AbstractPassengerCar {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:milw1935_21seatparlor_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_541", "marker_body_543", "marker_body_546",
            "marker_body_547", "marker_body_548", "marker_body_551",
            "marker_body_552")
        .build();


	public MILW1935_21SeatParlor_Observation(World world)
	{
		super(world);
		InsertTexture(0, "MILW (As built)");
		InsertTexture(1, "MILW (New marker lights)");
		InsertTexture(2, "MILW (1938 Scheme)");
		InsertTexture(3, "MILW (1942 Renovation)");
		InsertTexture(4, "MILW (Early postwar)");
		InsertTexture(5, "MILW (Early postwar, removed handrails)");
	}

	

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.81F;
	}

	@Override
	public String transportYear() {
		return "(Rebuilt) 1935";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}