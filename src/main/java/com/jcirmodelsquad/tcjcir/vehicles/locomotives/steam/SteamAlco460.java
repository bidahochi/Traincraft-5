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

public class SteamAlco460 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamAlco460;
	}
	public SteamAlco460(World world) {
		super(world, EnumTrains.Alco460.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Blank");
		InsertTexture(1, "CDC&S");
		InsertTexture(2, "RI");
		InsertTexture(3, "%Lemo");
		InsertTexture(4, "GCM 67");
		InsertTexture(5, "GCM 60");
	}

	

	public SteamAlco460(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.6, 0.1, -0.45); }

	

	@Override
	public String getInventoryName() {
		return "ALCo 4-6-0";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.2F;
	}

	
}