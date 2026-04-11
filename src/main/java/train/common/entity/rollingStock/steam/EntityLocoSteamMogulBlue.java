package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamMogulBlue extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamMogulBlue;
	}
	public EntityLocoSteamMogulBlue(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	


	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45, posZ);// default
	}
@Override
	public String getInventoryName() {
		return "Mogul";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 65;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 500;
	}

	@Override
	public int getTankCapacity()
	{
		return 5000;
	}
}