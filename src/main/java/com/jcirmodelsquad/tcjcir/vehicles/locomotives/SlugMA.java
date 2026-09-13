package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.enums.LockoutGroup;


public class SlugMA extends AbstractTankSlug
{
    private static final train.common.api.RollingStockSkinLightingProfiles LIGHTING_PROFILES =
        train.common.api.RollingStockSkinLightingProfiles.builder("bap:slugma")
        .defaults()
        .fixtureType(
            train.common.api.LightFixtureType.MARKER_LIGHT,
            "marker_body_157", "marker_body_158", "marker_body_159",
            "marker_body_160")
        .fixtureType(
            train.common.api.LightFixtureType.NUMBERBOARD,
            "front_numberboard_body_161", "front_numberboard_body_162", "rear_numberboard_body_155",
            "rear_numberboard_body_156")
        .build();

	public SlugMA(World world) {
		super(world);
		InsertTexture(0, "ANE SMA-1 (Bida Fictional)"/*, LockoutGroup.ANE*/);
		InsertTexture(1, "ANE SMA-2 (Bida Fictional)"/*, LockoutGroup.ANE*/);
		InsertTexture(2, "Magnolia", LockoutGroup.MAG);
		InsertTexture(3, "CSXT");
		InsertTexture(4, "ATSF");
		InsertTexture(5, "CWL", LockoutGroup.CWL);
	}

	@Override
	public String getInventoryName() {
		return "Slug";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}

    @Override
    protected train.common.api.RollingStockSkinLightingProfiles getSkinLightingProfiles()
    {
        return LIGHTING_PROFILES;
    }

}