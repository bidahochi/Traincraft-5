package train.common.entity.rollingStock.steam;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
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
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.375F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -3.2812F, 0.3f, 0.35f, SeatRole.DRIVER),
			new SeatDefinition("crew_1", -3.2812F, 0.3f, -0.35f, SeatRole.CREW)
		};
	}

}
