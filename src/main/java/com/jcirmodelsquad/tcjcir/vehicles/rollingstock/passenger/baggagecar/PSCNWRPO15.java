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

public class PSCNWRPO15 extends AbstractStandardFixedFreightCar
{
	public PSCNWRPO15(World world) {
		super(world);
	}

	public PSCNWRPO15(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{

	}


	@Override
	public String getInventoryName() {
		return "Pullman Standard CNW RPO(15')";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.85F;
	}

	
}