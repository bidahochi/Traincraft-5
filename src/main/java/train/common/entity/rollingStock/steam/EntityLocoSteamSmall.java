package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamSmall extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamSmall;
	}

	public EntityLocoSteamSmall(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}
	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset(), posZ);// default
	}



	

	
@Override
	public String getInventoryName() {
		return "Small steam Locomotive";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.2F;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 250;
	}

	@Override
	public int getTankCapacity()
	{
		return 5000;
	}
}