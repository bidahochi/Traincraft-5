package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamBR80_DB extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamBR80_DB;
	}
	public EntityLocoSteamBR80_DB(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	
	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.7562F, 0.35F, 0.038F, SeatRole.DRIVER)
		};
	}



	

	@Override
	public String getInventoryName() {
		return "BR80";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.1F;
	}
}