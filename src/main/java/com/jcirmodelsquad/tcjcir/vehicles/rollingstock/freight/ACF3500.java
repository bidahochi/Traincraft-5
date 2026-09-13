package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF3500 extends AbstractStandardFreightCar
{
	public ACF3500(World world)
	{
		super(world);
	}
	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "CB&Q");
		InsertTexture(1, "Chessie System");
		InsertTexture(2, "CNJ");
		InsertTexture(3, "CSX");
		InsertTexture(4, "CSX (with placard holder)");
		InsertTexture(5, "EL");
		InsertTexture(6, "SP (BLCX)");
		InsertTexture(7, "TPW");
		InsertTexture(8, "UP");
		InsertTexture(9, "Blandsville & Blankerston");
		InsertTexture(10, "ARR (ph4)");
		InsertTexture(11, "MP (ph4)");
		InsertTexture(12, "MP/KOG (ph4)");
		InsertTexture(13, "Blandsville & Blankerston (ph4)");
	}

	@Override
	public CargoManager setupCargoManager()
	{
		return null;
	}

	@Override
	public String getInventoryName() {
		return "AC&F 3500 Cu Ft Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}

	@Override
	public String transportYear() {
		return "1961-1966";
	}
}