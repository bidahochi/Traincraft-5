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
import train.common.core.util.TraincraftUtil;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class SteamAlco2102 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.Steam2102;
	}
	public SteamAlco2102(World world) {
		super(world, EnumTrains.Alco2102.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Blandsville Forest Products, Inc");
		InsertTexture(1, "Sugar Pine Lumber");
		InsertTexture(2, "Consolidated Builders Inc");
		InsertTexture(3, "Kaiser Steel");
		InsertTexture(4, "Oil Clusters & Garden");
		InsertTexture(5, "Washaska Resources", LockoutGroup.BIDA);
	}

	

	public SteamAlco2102(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.5, 0.1, -0.45); }

@Override
	public String getInventoryName() {
		return "Alco 2-10-2ST";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.45F;
	}

	
}