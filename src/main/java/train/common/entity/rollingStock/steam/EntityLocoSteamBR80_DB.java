package train.common.entity.rollingStock.steam;

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
import train.common.library.EnumHeritageTrainsLegacy;
import train.common.library.EnumSounds;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBR80_DB extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBR80_DB;
	}
	public EntityLocoSteamBR80_DB(World world) {
		super(world, EnumHeritageTrainsLegacy.locoSteamBR80.getTankCapacity(), LiquidManager.WATER_FILTER);
		
	}

	
	public EntityLocoSteamBR80_DB(World world, double d, double d1, double d2) {
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
		double distance = -0.1;
		double pitchRads = this.anglePitchClient * 3.141592653589793D / 180.0D;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + 0.35);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
		
		if(anglePitchClient>20 && rotationCos1 == 1){
			bogieX1-=pitchRads*0.9;
			pitch-=pitchRads*0.3;
		}
		if(anglePitchClient>20 && rotationSin1 == 1){
			bogieZ1-=pitchRads*0.9;
			pitch-=pitchRads*0.3;
		}
		riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		
		//riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45, posZ);
	}



	

	@Override
	public String getInventoryName() {
		return "BR80";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.1F;
	}

	
}