package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamVBShay extends SteamTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamVBShay;
	}

	public EntityLocoSteamVBShay(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.2812F, 0.65F, 0F, SeatRole.DRIVER)
		};
	}
	@Override
	public boolean shouldRiderSit(){return false;}
@Override
	public String getInventoryName() {
		return "Vertical Boiler Shay";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.275F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 32;
	}
}