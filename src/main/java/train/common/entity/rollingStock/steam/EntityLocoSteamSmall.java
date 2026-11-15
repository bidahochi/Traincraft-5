package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamSmall extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamSmall;
	}

	public EntityLocoSteamSmall(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.99F, 0F, 0F, SeatRole.DRIVER)
		};
	}



	

	
@Override
	public String getInventoryName() {
		return "Small steam Locomotive";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.2F;
	}
}