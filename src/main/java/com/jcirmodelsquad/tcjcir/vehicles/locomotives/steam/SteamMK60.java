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

public class SteamMK60 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamMK60;
	}
	public SteamMK60(World world) {
		super(world, EnumTrains.MK60.getTankCapacity(), LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "Blank");
		InsertTexture(1, "Spoof Texture");
		InsertTexture(2, "WP 320-326");
		InsertTexture(3, "WP 322-323");
		InsertTexture(4, "WP 327-329");
		InsertTexture(5, "WP 334 NEP-WP Condition");
		InsertTexture(6, "WP 334-335");
		InsertTexture(7, "DLMR 199");
		InsertTexture(8, "FMSR 560-574", LockoutGroup.FMSR);
		InsertTexture(9, "FMSR 575-579", LockoutGroup.FMSR);
	}

	

	public SteamMK60(World world, double d, double d1, double d2) {
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
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -1.2, 0.25, -0.45); }

@Override
	public String getInventoryName() {
		return "WP MK60-71 2-8-2";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.7F;
	}

	
}