package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBR01_DB extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBR01_DB;
	}
	public EntityLocoSteamBR01_DB(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5F, posZ);
	}



	

	
@Override
	public String getInventoryName() {
		return "BR01";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.4F;
	}

	@Override
	public String transportCountry()
	{
		return "de";
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 2120;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
}