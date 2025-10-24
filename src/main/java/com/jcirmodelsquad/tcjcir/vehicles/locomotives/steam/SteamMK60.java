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
	public void updateRiderPosition() {
		if (riddenByEntity == null) {return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = -1.2; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
		double distanceLR = -0.45; //how far left/right on the entity you ride; left > 0; right < 0;
		double yOffset = 0.25;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		float rotationCosLR1 = (float) Math.cos(Math.toRadians(this.renderYaw));
		float rotationSinLR1 = (float) Math.sin(Math.toRadians((this.renderYaw)));
		if(side.isServer()){
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
			rotationCosLR1 = (float) Math.cos(Math.toRadians(this.serverRealRotation));
			rotationSinLR1 = (float) Math.sin(Math.toRadians((this.serverRealRotation)));
			anglePitchClient = serverRealPitch*60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance) + (rotationCosLR1 * distanceLR));
		double bogieZ1 = (this.posZ + (rotationSin1* distance) + (rotationSinLR1 * distanceLR));
		//System.out.println(rotationCos1+" "+rotationSin1);
		if(anglePitchClient>20 && rotationCos1 == 1){
			bogieX1-=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == 1){
			bogieZ1-=pitchRads*2 + 1;
			pitch-=pitchRads*1.2;
		}
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1 -0.0);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1 +0.0);
		}
	}

@Override
	public String getInventoryName() {
		return "WP MK60-71 2-8-2";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.7F;
	}

	
}