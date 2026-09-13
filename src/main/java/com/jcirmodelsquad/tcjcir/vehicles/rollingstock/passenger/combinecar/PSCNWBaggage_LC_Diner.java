package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCNWBaggage_LC_Diner extends AbstractPassengerCar {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:pscnwbaggage_lc_diner")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_555", "marker_body_556", "marker_body_560",
            "marker_body_561")
        .build();


	public PSCNWBaggage_LC_Diner(World world)
	{
		super(world);
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
		return "1950";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}