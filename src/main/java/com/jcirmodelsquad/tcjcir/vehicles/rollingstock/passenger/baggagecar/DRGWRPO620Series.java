package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.passenger.baggagecar;

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

public class DRGWRPO620Series extends AbstractStandardFixedFreightCar
{
	public DRGWRPO620Series(World world) {
		super(world);
	}

	public DRGWRPO620Series(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RG (As Delivered)");
		InsertTexture(1, "D&RGW");
		InsertTexture(2, "D&RGW (624, Late)");
		InsertTexture(3, "D&RGW (627, Late)");
		InsertTexture(4, "WP (As Delivered)");
		InsertTexture(5, "WP");
	}

	@Override
	public String getInventoryName() {
		return "DRGW 620 Series RPO(30')";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.23F;
	}
}