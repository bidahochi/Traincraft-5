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

public class PSSOURPO_30 extends AbstractStandardFixedFreightCar
{
	public PSSOURPO_30(World world) {
		super(world);
	}

	public PSSOURPO_30(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "SOU (early)");
		InsertTexture(1, "SOU");
		InsertTexture(2, "SOU 1725 \"Lenoir City\" (late)");
		InsertTexture(3, "SOU 1726 \"Athens\" (late)");
	}

	@Override
	public String getInventoryName() {
		return "Pullman Standard SOU RPO (30' mail section)";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.97F;
	}
}