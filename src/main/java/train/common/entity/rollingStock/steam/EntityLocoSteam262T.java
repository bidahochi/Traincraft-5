package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteam262T extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteam262T;
	}

	public EntityLocoSteam262T(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45, posZ);// default
	}
	@Override
	public boolean shouldRiderSit(){return false;}



	

	
@Override
	public String getInventoryName() {
		return "2-6-2T";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 70;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 300;
	}

	@Override
	public int getTankCapacity()
	{
		return 4250;
	}
}