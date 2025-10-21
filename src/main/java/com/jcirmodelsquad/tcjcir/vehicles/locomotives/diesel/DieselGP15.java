package com.jcirmodelsquad.tcjcir.vehicles.locomotives.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.enums.LockoutGroup;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class DieselGP15 extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.DieselGP15;
	}
	public DieselGP15(World world) {
		super(world, EnumTrains.GP15.getTankCapacity(), LiquidManager.dieselFilter());
		initLoco();
		InsertTexture(0, "UPY");
		InsertTexture(1, "FURRX"); // (old nasty ass texture if i see this in game somewhjer i will kill you)
		InsertTexture(2, "Lisha & Watson", LockoutGroup.LW);
		InsertTexture(3, "Atlas & Red Sands Railroad");
		InsertTexture(4, "Southern Port Belt");
		InsertTexture(5, "GLC (Ex SPB)");
		InsertTexture(6, "CSXT (Yn3)");
		InsertTexture(7, "CSXT (Ex-Conrail)");
		InsertTexture(8, "Conrail (As Delivered)");
		InsertTexture(9, "Conrail (Post-93)");
		InsertTexture(10, "Conrail (OLS)");
		InsertTexture(11, "Conrail (Just Do It Boston Marathon Unit");
	}

	public void initLoco() {
		fuelTrain = 0;
		locoInvent = new ItemStack[inventorySize];
	}

	public DieselGP15(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 2.5;
		double yOffset = 0.2;
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
		if(anglePitchClient>20 && rotationCos1 == 1){
			bogieX1 -= pitchRads * 2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == 1){
			bogieZ1 -= pitchRads * 2;
			pitch-=pitchRads*1.2;
		}
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		}
	}



	

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			return;
		}
		checkInvent(locoInvent[0]);
	}

	

	

	
	@Override
	public String getInventoryName() {
		return "EMD GP15-1";
	}
	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.0F);
	}

	
}