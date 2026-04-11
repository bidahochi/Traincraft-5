package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamEr_Ussr extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamEr_USSR;
	}
	public EntityLocoSteamEr_Ussr(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.5F, posZ);
	}@Override
	public String getInventoryName() {
		return "USSR 0-5-0";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.53F;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 800;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
}