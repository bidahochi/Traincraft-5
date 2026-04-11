package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamGS4 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamGS4;
	}
	public EntityLocoSteamGS4(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	
	

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5F, posZ);
	}
@Override
	public String getInventoryName() {
		return "Daylight";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.62F;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 2653;
	}

	@Override
	public int getTankCapacity()
	{
		return 8800;
	}
}