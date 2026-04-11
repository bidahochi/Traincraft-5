package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBerk765 extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBerk765;
	}
	public EntityLocoSteamBerk765(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -1.125, 0.375);
	}



	

	
@Override
	public String getInventoryName() {
		return "Berkshire 1225";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.375F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 2563;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
	
}