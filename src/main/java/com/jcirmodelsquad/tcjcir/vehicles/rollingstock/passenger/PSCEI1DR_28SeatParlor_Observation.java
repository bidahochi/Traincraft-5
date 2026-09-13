package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;
import train.common.enums.LockoutGroup;

public class PSCEI1DR_28SeatParlor_Observation extends AbstractPassengerCar {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:pscei1dr_28seatparlor_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_lense_lf", "marker_lense_lr", "marker_lense_rf",
            "marker_lense_rr")
        .build();


	public PSCEI1DR_28SeatParlor_Observation(World world)
	{
		super(world);
		InsertTexture(0, "C&EI (As Delivered)");
		InsertTexture(1, "C&EI");
		InsertTexture(2, "GCM", LockoutGroup.GCM);
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
		return "1946";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}