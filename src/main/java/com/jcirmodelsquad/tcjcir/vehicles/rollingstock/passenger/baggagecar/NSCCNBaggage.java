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

public class NSCCNBaggage extends AbstractStandardFixedFreightCar
{
	public NSCCNBaggage(World world)
	{
		super(world);
	}

	public NSCCNBaggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "CN 9031-9080 (early)");
		InsertTexture(1, "CN 9031-9080");
		InsertTexture(2, "CN 9059 (1960 experimental scheme)");
		InsertTexture(3, "CN 9031-9080 (noodle)");
		InsertTexture(4, "CN 9085-9202 (early)");
		InsertTexture(5, "CN 9085-9202");
		InsertTexture(6, "CN 9085-9202 (noodle)");
		InsertTexture(7, "CN 9203-9227, 9233-9302");
		InsertTexture(8, "CN 9203-9227, 9233-9302 (noodle)");
		InsertTexture(9, "CN 9646 (Champlain)");
		InsertTexture(10, "CN 9228-9232 (end door)");
		InsertTexture(11, "CN 9228-9232 (end door, noodle)");
		InsertTexture(12, "VIA CN (6 wheel trucks)");
		InsertTexture(13, "VIA (6 wheel trucks");
		InsertTexture(14, "VIA CN");
		InsertTexture(15, "VIA");
		InsertTexture(16, "VIA CN (end door)");
		InsertTexture(17, "VIA (end door)");
		InsertTexture(18, "ONT 410-412");
		InsertTexture(19, "ONT 410, 412 (late)");
		InsertTexture(20, "AC 308-309 (end door)");
	}


	@Override
	public String getInventoryName() {
		return "National Car Company 76' Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.49F;
	}
}