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

public class PSSOUBaggage extends AbstractStandardFixedFreightCar
{
	public PSSOUBaggage(World world) {
		super(world);
	}

	public PSSOUBaggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "SOU (early)");
		InsertTexture(1, "SOU (early, without mail poles");
		InsertTexture(2, "SOU");
		InsertTexture(3, "SOU (without mail poles");
		InsertTexture(4, "SOU (late)");
		InsertTexture(5, "SOU (late, without mail poles)");
	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard SOU Baggage";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}

	
}