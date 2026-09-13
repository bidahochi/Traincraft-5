package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF4650 extends AbstractStandardFreightCar
{
	public ACF4650(World world) {
		super(world);
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "BN");
		InsertTexture(1, "BN (ex FWD)");
		InsertTexture(2, "BN (ex GN/NP)");
		InsertTexture(3, "ACFX (Blue Swaws)");
		InsertTexture(4, "BB (1964-1965)");
		InsertTexture(5, "BB (1966-1970)");
		InsertTexture(6, "BB (1970+)");
		InsertTexture(7, "LRR");
		InsertTexture(8, "WP (Early)");
		InsertTexture(9, "GN (Early)");
		InsertTexture(10, "GN (BSB)");
		InsertTexture(11, "Far-Mar CO-OP");
		InsertTexture(12, "SP (H-100-12)");
		InsertTexture(13, "SP (H-100-18)");
		InsertTexture(14, "SP (H-100-39)");
		InsertTexture(15, "MRL");
		InsertTexture(16, "NS");
		InsertTexture(17, "SNEEDY");
		InsertTexture(18, "SOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOup");
		InsertTexture(19, "Washington Grain Train");
		InsertTexture(20, "Washington Grain Train (Stale)");
		InsertTexture(21, "AD&N");
		InsertTexture(22, "Cornhub");
		InsertTexture(23, "NP");
		InsertTexture(24, "NYC");
		InsertTexture(25, "GLNT");
	}

	@Override
	public String getInventoryName() {
		return "AC&F 4650 Cu Ft 3-Bay Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.6F;
	}

	@Override
	public String transportYear() {
		return "1966-1982";
	}
}