package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamC41T extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoSteamC41T(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -2.0281F, 0.3F, 0.009F, SeatRole.DRIVER)
		};
	}@Override
	public String getInventoryName() {
		return "C41T";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}
}