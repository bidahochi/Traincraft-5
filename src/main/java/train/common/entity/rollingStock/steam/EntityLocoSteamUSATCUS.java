package train.common.entity.rollingStock.steam;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamUSATCUS extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamSATCUS;
	}
	public EntityLocoSteamUSATCUS(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.65F;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.5625F, 0.07f, 0.2806F, SeatRole.DRIVER),
			new SeatDefinition("crew_1", -0.5625F, 0.07f, -0.2194F, SeatRole.CREW)
		};
	}

}
