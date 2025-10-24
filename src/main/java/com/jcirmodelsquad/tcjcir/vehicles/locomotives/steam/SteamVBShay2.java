package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class SteamVBShay2 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamVBShay2;
	}

	public SteamVBShay2(World world) {
		super(world, EnumTrains.VBShay.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	

	public SteamVBShay2(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.4F, posZ);// default
	}

@Override
	public String getInventoryName() {
		return "2 Truck Vertical Boiler Shay";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	
}