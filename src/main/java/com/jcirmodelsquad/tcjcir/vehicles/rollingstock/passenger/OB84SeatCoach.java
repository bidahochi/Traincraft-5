package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class OB84SeatCoach extends AbstractPassengerCar
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:ob84seatcoach")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_two_body_676", "marker_two_body_678")
        .build();


	public OB84SeatCoach(World world) {
		super(world);
		InsertTexture(0, "NH (As Delivered)");
		InsertTexture(1, "NH");
		InsertTexture(2, "NH (Late)");
		InsertTexture(3, "NH (Black Knight Scheme)");
		InsertTexture(4, "PC");
		InsertTexture(5, "B&M B&M (As Delivered, 1935 Batch)");
		InsertTexture(6, "B&M Interior Scheme 1 (As Delivered, 1937 Batch)");
		InsertTexture(7, "B&M Interior Scheme 2 (As Delivered, 1937 Batch)");
		InsertTexture(8, "B&M (1935 Batch)");
		InsertTexture(9, "B&M Interior Scheme 1 (1937 Batch)");
		InsertTexture(10, "B&M Interior Scheme 2 (1937 Batch)");
		InsertTexture(11, "BAR (As Delivered)");
		InsertTexture(12, "BAR");
		InsertTexture(13, "East Wind (New Haven)");
		InsertTexture(14, "East Wind (B&M, Interior Scheme 1)");
		InsertTexture(15, "East Wind (B&M, Interior Scheme 2)");
		InsertTexture(16, "LIRR (Early)");
		InsertTexture(17, "LIRR");
		InsertTexture(18, "LIRR (Late)");
		InsertTexture(19, "LIRR (MTBA Scheme)");
		InsertTexture(20, "NH (64 Seat Coach-Lounge)");
		InsertTexture(21, "NH (64 Seat Coach-Lounge, Late)");
		InsertTexture(22, "NH (64 Seat Coach-Lounge, Black Knight Scheme)");
		InsertTexture(23, "PC (64 Seat Coach-Lounge, Alternate Scheme)");
		InsertTexture(24, "PC (64 Seat Coach-Lounge)");
		InsertTexture(25, "NH (68 Seat Coach-Lounge)");
		InsertTexture(26, "PC (68 Seat Coach-Lounge, Late)");
		InsertTexture(27, "PC (68 Seat Coach-Lounge)");
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
		return "1935-1938";
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }
}