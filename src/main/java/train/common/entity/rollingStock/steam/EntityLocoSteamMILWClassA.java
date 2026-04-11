package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamMILWClassA extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamMILWClassA;
	}

	public EntityLocoSteamMILWClassA(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	

	@Override
	public void updateRiderPosition() {
		
		/*double rads = this.renderYaw * 3.141592653589793D / 180.0D;
		double pitchRads = this.renderPitch * 3.141592653589793D / 180.0D;
		riddenByEntity.setPosition(posX - Math.cos(rads)*3, posY + (Math.tan(pitchRads)*-3F)+( getMountedYOffset() + riddenByEntity.getYOffset() + 0.55F), posZ - Math.sin(rads)*3);
		*/
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);
	}
@Override
	public String getInventoryName() {
		return "MILW Class A";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.8F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 1228;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
}