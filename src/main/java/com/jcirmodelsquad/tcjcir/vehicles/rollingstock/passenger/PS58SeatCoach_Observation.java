package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PS58SeatCoach_Observation extends AbstractPassengerCar {
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:ps58seatcoach_observation")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_lense_lf", "marker_lense_lr_body_279", "marker_lense_lr_body_282",
            "marker_lense_rf")
        .build();


	public PS58SeatCoach_Observation(World world)
	{
		super(world);
		InsertTexture(0, "PM (conductor's desk)");
		InsertTexture(1, "PM (conductor's desk, rear light off)");
		InsertTexture(2, "PM");
		InsertTexture(3, "PM (rear light off)");
		InsertTexture(4, "C&EI (conductor's desk)");
		InsertTexture(5, "C&EI (conductor's desk, rear light off)");
		InsertTexture(6, "C&EI");
		InsertTexture(7, "C&EI (L&N paint, rear light off)");
		InsertTexture(8, "C&EI (L&N paint, conductor's desk)");
		InsertTexture(9, "C&EI (L&N paint, conductor's desk, rear light off)");
		InsertTexture(10, "C&EI (L&N paint)");
		InsertTexture(11, "C&EI (L&N paint, rear light off)");
		InsertTexture(12, "C&EI (renovated, conductor's desk)");
		InsertTexture(13, "C&EI (renovated)");
		InsertTexture(14, "C&EI (renovated, back roof, conductor's desk)");
		InsertTexture(15, "C&EI (renovated, black roof)");
		InsertTexture(16, "DLMR (fictional)");
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