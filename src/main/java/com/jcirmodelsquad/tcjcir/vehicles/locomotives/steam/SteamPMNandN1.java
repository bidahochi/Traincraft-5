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

public class SteamPMNandN1 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamPMNandN1;
	}
	public SteamPMNandN1(World world) {
		super(world, EnumTrains.PMNandN1.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Pere Marquette N Class");
		InsertTexture(1, "C&O N Class");
		InsertTexture(2, "Pere Marquette N-1 Class");
		InsertTexture(3, "C&O N-1 Class");
		InsertTexture(4, "Polar Express");
	}

	

	public SteamPMNandN1(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.75, 0.15, -0.5); }

@Override
	public String getInventoryName() {
		return "Pere Marquette N and N-1";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.15F;
	}

	
}