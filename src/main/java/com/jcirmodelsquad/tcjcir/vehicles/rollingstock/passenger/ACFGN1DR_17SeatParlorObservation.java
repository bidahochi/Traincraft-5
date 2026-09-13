package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class ACFGN1DR_17SeatParlorObservation extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:acfgn1dr_17seatparlor_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_amtk_body_655", "marker_amtk_body_657", "marker_body_203",
            "marker_body_206")
        .build();


	public ACFGN1DR_17SeatParlorObservation(World world) {
		super(world);
		InsertTexture(0, "GN Internationals");
		InsertTexture(1, "GN Internationals (Late)");
		InsertTexture(2, "AMTK (Abraham Lincoln)");
		InsertTexture(3, "AMTK");
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
		return "1950";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}