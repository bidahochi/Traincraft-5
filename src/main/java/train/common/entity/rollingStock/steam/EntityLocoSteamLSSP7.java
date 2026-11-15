package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamLSSP7 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamLSSP7;
	}
	public EntityLocoSteamLSSP7(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.6406F, 0F, -0.0125F, SeatRole.DRIVER)
		};
	}
@Override
	public String getInventoryName() {
		return "LSSP 7";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
			return 0.5f;
	}
}