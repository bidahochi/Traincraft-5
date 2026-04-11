package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamShay extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamShay;
	}
	public EntityLocoSteamShay(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}
	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.4F, posZ);// default
	}@Override
	public String getInventoryName() {
		return "Shay";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 50;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 250;
	}

	@Override
	public int getTankCapacity()
	{
		return 4000;
	}
}