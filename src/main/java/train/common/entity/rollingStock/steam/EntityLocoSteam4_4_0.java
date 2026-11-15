package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteam4_4_0 extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteam4_4_0;
	}
	public EntityLocoSteam4_4_0(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.8162F, 0.45F, 0F, SeatRole.DRIVER)
		};
	}
	@Override
	public String getInventoryName() {
		return "4-4-0 (US)";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	public float transportMetricHorsePower()
	{
		return 400;
	}
}