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

public class MILWPrewarBaggage extends AbstractStandardFixedFreightCar
{
	public MILWPrewarBaggage(World world) {
		super(world);
	}

	public MILWPrewarBaggage(World world, double x, double y, double z)
	{
		super(world, x, y, z);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "MILW (1935, As built)");
		InsertTexture(1, "MILW (1935, Hiawatha)");
		InsertTexture(2, "MILW (1935, 1938 Scheme)");
		InsertTexture(3, "MILW (1935, 1942 Scheme)");
		InsertTexture(4, "MILW (1935, Early postwar scheme, skirted)");
		InsertTexture(5, "MILW (1935, Early postwar scheme)");
		InsertTexture(6, "MILW (1935, Postwar scheme)");
		InsertTexture(7, "MILW (1935, Postwar scheme, ribbed)");
		InsertTexture(8, "MILW (1935, UP scheme, UP grey trucks)");
		InsertTexture(9, "MILW (1935, UP scheme, UP grey trucks, ribbed)");
		InsertTexture(10, "MILW (1935, UP scheme)");
		InsertTexture(11, "MILW (1935, UP scheme, flat doors, ribbed)");
		InsertTexture(12, "MILW (1935, UP scheme, new doors, skirted)");
		InsertTexture(13, "MILW (1935, UP scheme, new doors, ribbed)");
		InsertTexture(14, "MILW (Baggage 1123 (rebuild of tap-dinette 5251), postwar scheme)");
		InsertTexture(15, "MILW (Baggage 1123 (rebuild of tap-dinette 5251), UP scheme)");
		InsertTexture(16, "MILW (Mail Storage 2000 (rebuild of tap-dinette 5252), postwar scheme)");
		InsertTexture(17, "MILW (Mail Storage 2000 (rebuild of tap-dinette 5252), UP scheme)");
		InsertTexture(18, "MILW (1936, As built)");
		InsertTexture(19, "MILW (1936, Early postwar scheme)");
		InsertTexture(20, "MILW (1936, Postwar scheme)");
		InsertTexture(21, "MILW (1936, Postwar scheme, ribbed)");
		InsertTexture(22, "MILW (1936, UP scheme, UP grey trucks)");
		InsertTexture(23, "MILW (1936, UP scheme, UP grey trucks, ribbed)");
		InsertTexture(24, "MILW (1936, UP scheme)");
		InsertTexture(25, "MILW (1936, UP scheme, ribbed)");
		InsertTexture(26, "MILW (1938, As built)");
		InsertTexture(27, "MILW (1938, Early postwar scheme)");
		InsertTexture(28, "MILW (1938, Postwar scheme)");
		InsertTexture(29, "MILW (1938, UP scheme, UP grey trucks)");
		InsertTexture(30, "MILW (1935, UP scheme, new doors)");
	}

	@Override
	public String getInventoryName() {
		return "Milwaukee Road Prewar Baggage";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.38F;
	}
}