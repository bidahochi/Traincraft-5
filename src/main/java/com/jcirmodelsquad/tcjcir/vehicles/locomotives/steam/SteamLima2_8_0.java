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

public class SteamLima2_8_0 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamLima2_8_0;
	}
	public SteamLima2_8_0(World world) {
		super(world, EnumTrains.Lima2_8_0.getTankCapacity(), LiquidManager.WATER_FILTER);
		initLocoSteam();
		InsertTexture(0, "Generic");
		InsertTexture(1, "CDCS 20");
		InsertTexture(2, "CDCS 21");
		InsertTexture(3, "CDCS 22");
		InsertTexture(4, "A&WRR");
		InsertTexture(5, "CRIP");
	}

	public void initLocoSteam() {
		fuelTrain = 0;
		locoInvent = new ItemStack[inventorySize];
	}

	public SteamLima2_8_0(World world, double d, double d1, double d2) {
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
		double distance = -0.72; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
		double distanceLR = -0.45; //how far left/right on the entity you ride; left > 0; right < 0;
		double yOffset = 0.05;
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
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			return;
		}
		checkInvent(locoInvent[0], locoInvent[1], this);
	}

	

	

	

	@Override
	public String getInventoryName() {
		return "Lima 2-8-0";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.17F;
	}

	
}