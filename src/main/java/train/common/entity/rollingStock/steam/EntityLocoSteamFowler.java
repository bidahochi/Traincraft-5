package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamFowler extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamFowler;
	}

	public EntityLocoSteamFowler(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	




	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, -0.25, 0.25);
	}
@Override
	public String getInventoryName() {
		return "Fowler 4F";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.5F;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 980;
	}

	@Override
	public int getTankCapacity()
	{
		return 10000;
	}
	
}