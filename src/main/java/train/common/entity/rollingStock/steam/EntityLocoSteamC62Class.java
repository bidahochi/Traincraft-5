package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamC62Class extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamC62;
	}
	public EntityLocoSteamC62Class(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	

	@Override
	public void updateRiderPosition() {
		
		/*double rads = this.renderYaw * 3.141592653589793D / 180.0D;
		double pitchRads = this.renderPitch * 3.141592653589793D / 180.0D;
		riddenByEntity.setPosition(posX - Math.cos(rads)*3, posY + (Math.tan(pitchRads)*-3F)+( getMountedYOffset() + riddenByEntity.getYOffset() + 0.55F), posZ - Math.sin(rads)*3);
		*/
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45F, posZ);
	}
@Override
	public String getInventoryName() {
		return "C62 Class [JNR]";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.5F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 1223;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
}