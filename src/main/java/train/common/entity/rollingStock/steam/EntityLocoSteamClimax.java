package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamClimax extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamClimax;
	}
	public EntityLocoSteamClimax(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	

	@Override
	public boolean shouldRiderSit(){return false;}
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.8227F, 0.6F, 0F, SeatRole.DRIVER)
		};
	}@Override
	public String getInventoryName() {
		return "4-0-4 Climax";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 45;
	}
}