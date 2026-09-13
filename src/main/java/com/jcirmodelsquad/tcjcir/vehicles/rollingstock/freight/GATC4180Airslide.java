package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class GATC4180Airslide extends AbstractStandardFreightCar
{
	public GATC4180Airslide(World world)
	{
		super(world);
	}
	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "GN (BSB)");
		InsertTexture(1, "NP");
		InsertTexture(2, "UP");
		InsertTexture(3, "BB (Phase 1B)");
		InsertTexture(4, "CBQ");
		InsertTexture(5, "MILW");
		InsertTexture(6, "BB (Phase 1A)");
		InsertTexture(7, "BN");
		InsertTexture(8, "DRGW");
		InsertTexture(9, "MILW");
		InsertTexture(10, "BM");
		InsertTexture(11, "CSX");
		InsertTexture(12, "CNW");
		InsertTexture(13, "BB (Phase 2)");
		InsertTexture(14, "WP");
		InsertTexture(15, "ATSF");
		InsertTexture(16, "RI");
		InsertTexture(17, "ROCK");
		InsertTexture(18, "GN Grey");
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public String getInventoryName() {
		return "GATC 4180 Cu Ft Airslide Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}

	@Override
	public String transportYear() {
		return "1963-1980";
	}
}