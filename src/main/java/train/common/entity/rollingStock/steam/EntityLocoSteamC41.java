package train.common.entity.rollingStock.steam;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamC41 extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamC41;
	}
	public EntityLocoSteamC41(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	



	

	@Override
	public String getInventoryName() {
		return "C41";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.4188F, 0.5f, 0.37F, SeatRole.DRIVER),
			new SeatDefinition("crew_1", -0.4188F, 0.5f, -0.37F, SeatRole.CREW)
		};
	}

}
