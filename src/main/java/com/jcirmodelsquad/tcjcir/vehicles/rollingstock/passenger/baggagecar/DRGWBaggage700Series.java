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

public class DRGWBaggage700Series extends AbstractStandardFixedFreightCar
{
	public DRGWBaggage700Series(World world) {
		super(world);
	}

	public DRGWBaggage700Series(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RG (As Delivered)");
		InsertTexture(1, "D&RGW");
		InsertTexture(2, "D&RGW (Roof Vents)");
		InsertTexture(3, "D&RGW (717 Ski Train)");
		InsertTexture(4, "D&RGW (4 stripe, Messenger)");
		InsertTexture(5, "D&RGW (4 stripe, Alternate Messenger)");
		InsertTexture(6, "D&RGW (4 stripe)");
		InsertTexture(7, "D&RGW (4 stripe, Large Doors, Messenger)");
		InsertTexture(8, "D&RGW (4 stripe, Large Doors)");
		InsertTexture(9, "D&RGW (4 stripe, 715 Ski Train)");
		InsertTexture(10, "WP");
	}

	@Override
	public String getInventoryName() {
		return "DRGW 700 Series Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) { return 2.81F; }
}