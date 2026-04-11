package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamVBShay extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamVBShay;
	}

	public EntityLocoSteamVBShay(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.65, posZ);// default
	}
	@Override
	public boolean shouldRiderSit(){return false;}
@Override
	public String getInventoryName() {
		return "Vertical Boiler Shay";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.275F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 32;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 250;
	}

	@Override
	public int getTankCapacity()
	{
		return 3000;
	}
}