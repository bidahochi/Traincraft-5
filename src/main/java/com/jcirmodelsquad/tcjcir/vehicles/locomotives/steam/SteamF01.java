package com.jcirmodelsquad.tcjcir.vehicles.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.sounds.SoundRecord;

public class SteamF01 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.SteamF01;
	}
	public SteamF01(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
		InsertTexture(0, "CDC&S 4");
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0.25, 0.15, -0.35); }

	/*@Override
	public void updateRiderPosition() {
		if (riddenByEntity == null) {return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 0.25;
		double yOffset = 0.15;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		if(side.isServer()){
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
			anglePitchClient = serverRealPitch*60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
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
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		}
	}*/

	@Override
	public float transportMetricHorsePower()
	{
		return 450;
	}

	@Override
	public String getInventoryName() {
		return "F-01 Class 2-4-4 Forney";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}

	@Override
	public boolean isFictional() {
		return true;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public int getWaterConsumption()
	{
		return 160;
	}

	@Override
	public int getTankCapacity()
	{
		return 9000;
	}
}