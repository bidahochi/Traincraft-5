package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamCherepanov extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamCherepanov;
	}
	public EntityLocoSteamCherepanov(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.154, posZ);
	}


	@Override
	public void onUpdate() {
		super.onUpdate();
		checkInvent(locoInvent[0], locoInvent[1], this);
	}

	

	@Override
	public String getInventoryName() {
		return "Cherepanov";
	}
	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.5F;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 60;
	}

	@Override
	public int getTankCapacity()
	{
		return 3000;
	}

}