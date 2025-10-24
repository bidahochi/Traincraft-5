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

public class SteamP01a extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamF01;
	}

	public SteamP01a(World world) {
		super(world, EnumTrains.P01a.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "WRX 10", LockoutGroup.BIDA);
		InsertTexture(1, "WRX 12", LockoutGroup.BIDA);
		InsertTexture(2, "CDC&S 7");
	}

	

	public SteamP01a(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.9, 0.1, -0.4); }

@Override
	public String getInventoryName() {
		return "P01a 2-6-2 Prairie";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.05F;
	}

	
}