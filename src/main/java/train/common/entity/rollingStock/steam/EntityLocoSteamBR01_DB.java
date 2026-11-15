package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBR01_DB extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBR01_DB;
	}
	public EntityLocoSteamBR01_DB(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.9062F, 0.5F, 0.0434F, SeatRole.DRIVER)
		};
	}



	

	
@Override
	public String getInventoryName() {
		return "BR01";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.4F;
	}

	@Override
	public String transportCountry()
	{
		return "de";
	}
}