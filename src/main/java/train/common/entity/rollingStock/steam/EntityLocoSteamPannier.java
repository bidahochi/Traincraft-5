package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamPannier extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamPannier;
	}

	public EntityLocoSteamPannier(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public boolean shouldRiderSit(){return false;}
	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset()+0.3F, posZ);// default
	}@Override
	public String getInventoryName() {
		return "0-6-0 Pannier";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 80;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 903;
	}

	@Override
	public int getTankCapacity()
	{
		return 8000;
	}
}