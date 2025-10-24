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
	public void updateRiderPosition() {
		if (riddenByEntity == null) {return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = -0.75; //how far forward/backwards on the entity you ride; forward > 0; backwards < 0;
		double distanceLR = -0.5; //how far left/right on the entity you ride; left > 0; right < 0;
		double yOffset = 0.15;
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
		return "Pere Marquette N and N-1";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.15F;
	}

	
}