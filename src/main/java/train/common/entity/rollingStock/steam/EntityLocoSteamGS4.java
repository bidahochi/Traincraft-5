package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamGS4 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamGS4;
	}
	public EntityLocoSteamGS4(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	
	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -3.0875F, 0.5F, 0F, SeatRole.DRIVER)
		};
	}
@Override
	public String getInventoryName() {
		return "Daylight";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.62F;
	}
}