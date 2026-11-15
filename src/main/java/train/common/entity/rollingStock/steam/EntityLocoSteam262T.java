package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteam262T extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteam262T;
	}

	public EntityLocoSteam262T(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.4625F, 0.45F, 0F, SeatRole.DRIVER)
		};
	}
	@Override
	public boolean shouldRiderSit(){return false;}



	

	
@Override
	public String getInventoryName() {
		return "2-6-2T";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.6F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 70;
	}
}