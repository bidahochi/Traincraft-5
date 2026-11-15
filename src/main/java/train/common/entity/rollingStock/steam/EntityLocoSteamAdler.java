package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamAdler extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamAdler;
	}
	public EntityLocoSteamAdler(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	
	
	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.9563F, 0.15F, 0F, SeatRole.DRIVER)
		};
	}@Override
	public String getInventoryName() {
		return "Adler";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.5F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 65;
	}
}