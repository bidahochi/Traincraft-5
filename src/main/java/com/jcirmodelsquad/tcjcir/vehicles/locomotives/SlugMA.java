package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractTankSlug;
import train.common.enums.LockoutGroup;


public class SlugMA extends AbstractTankSlug
{

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


}