package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteam040VB extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteam040VB;
	}
	public EntityLocoSteam040VB(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public boolean shouldRiderSit(){return false;}
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.6188F, 0.65F, 0F, SeatRole.DRIVER)
		};
	}



	

	@Override
	public String getInventoryName() {
		return "0-4-0 Vertical Boiler";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.75F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 32;
	}
}