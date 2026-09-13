package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class ACF3960 extends AbstractStandardFreightCar
{
	public ACF3960(World world) {
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
		InsertTexture(0, "BN (Silver)");
		InsertTexture(1, "BN (Green)");
		InsertTexture(2, "GN (White)");
		InsertTexture(3, "GN (Silver)");
		InsertTexture(4, "the P in SP stands for PISS LETTERING");
		InsertTexture(5, "WABussy");
		InsertTexture(6, "BNB");
	}

	@Override
	public String getInventoryName() {
		return "AC&F 3960 Cu Ft Hopper";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.5F;
	}

	@Override
	public String transportYear() {
		return "1962-1964";
	}
}