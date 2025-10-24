package com.jcirmodelsquad.tcjcir.vehicles.rollingstock.tender;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fluids.FluidRegistry;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class TenderLima2_8_0 extends Tender  {

	
	

	public TenderLima2_8_0(World world) {
		super(world, FluidRegistry.WATER, 0, EnumTrains.TenderLima2_8_0.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Generic");
		InsertTexture(1, "CDCS");
		InsertTexture(2, "A&WRR");
		InsertTexture(3, "CRIP");
	}

	

	public TenderLima2_8_0(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	
	@Override
	public String getInventoryName() {
		return "Lima 2-8-0 Tender";
	}

	

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}

	
}