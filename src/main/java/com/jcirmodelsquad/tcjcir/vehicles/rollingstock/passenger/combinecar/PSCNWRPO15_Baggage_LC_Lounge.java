package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.combinecar;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCombineCar;

public class PSCNWRPO15_Baggage_LC_Lounge extends AbstractPassengerCombineCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:pscnwrpo15_baggage_lc_lounge")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_lf", "marker_lr_body_214", "marker_lr_body_217",
            "marker_rf")
        .build();


	public PSCNWRPO15_Baggage_LC_Lounge(World world)
	{
		super(world);
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public void setupTextureDescription()
	{

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
		return "1941";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}