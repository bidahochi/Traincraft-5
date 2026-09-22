package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class TenderPETender extends Tender  {


	public TenderPETender(World world) {
		super(world,  LiquidManager.WATER_FILTER);
		
	}

	@Override
	public String getInventoryName() {
		return "Polar Express Tender";
	}

	@Override
	public boolean canBeRidden() {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.0F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

}
