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

import static com.sun.awt.SecurityWarning.setPosition;

public class DRGWBaggage740Series extends AbstractStandardFixedFreightCar
{
	public DRGWBaggage740Series(World world) {
		super(world);
	}

	public DRGWBaggage740Series(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RGW (740)");
		InsertTexture(1, "D&RGW (741)");
		InsertTexture(2, "D&RGW (742)");
		InsertTexture(3, "D&RGW (743)");
		InsertTexture(4, "D&RGW (740, 4 stripe)");
		InsertTexture(5, "D&RGW (741, 4 stripe)");
		InsertTexture(6, "D&RGW (742, Late)");
		InsertTexture(7, "D&RGW (743, 4 stripe)");
		InsertTexture(8, "D&RGW (743, 4 stripe, Late)");
	}

	@Override
	public String getInventoryName() {
		return "DRGW 740 Series Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.25F;
	}
}