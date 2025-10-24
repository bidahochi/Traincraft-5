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
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class SteamAlco0_6_0T extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamAlco0_6_0T;
	}
	public SteamAlco0_6_0T(World world) {
		super(world, EnumTrains.Alco0_6_0T.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Generic");
		InsertTexture(1, "CDCS");
		InsertTexture(2, "SPR");
	}

	

	public SteamAlco0_6_0T(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.33, -0.23, -0.45); }

	

	@Override
	public String getInventoryName() {
		return "Alco 0-6-0T";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.15F;
	}

	
}