package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamAdler extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamAdler;
	}
	public EntityLocoSteamAdler(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	
	
	

	@Override
	public void updateRiderPosition() {
		double distance = -0.1;
		double pitchRads = this.anglePitchClient * 3.141592653589793D / 180.0D;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + 0.15);
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
	}@Override
	public String getInventoryName() {
		return "Adler";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.5F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 65;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 200;
	}
	@Override
	public int getTankCapacity()
	{
		return 3000;
	}
}