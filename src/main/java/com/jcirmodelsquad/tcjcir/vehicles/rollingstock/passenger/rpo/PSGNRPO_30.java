package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.rpo;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.api.Freight;
import train.common.library.GuiIDs;

public class PSGNRPO_30 extends AbstractStandardFixedFreightCar
{
	public PSGNRPO_30(World world) {
		super(world);
	}

	public PSGNRPO_30(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "GN Empire Builder (as delivered)");
		InsertTexture(1, "GN Empire Builder");
		InsertTexture(2, "GN Winnipeg Limited");
		InsertTexture(3, "GN Winnipeg Limited (late)");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard GN RPO (30' mail section)";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}
}