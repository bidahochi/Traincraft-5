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

public class PS85Baggage extends AbstractStandardFixedFreightCar
{
	public PS85Baggage(World world) {
		super(world);
	}

	public PS85Baggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "D&RGW");
		InsertTexture(1, "C&O (Semi-Fictional)");
		InsertTexture(2, "DLMR");
	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard 85' Baggage";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}

	
}