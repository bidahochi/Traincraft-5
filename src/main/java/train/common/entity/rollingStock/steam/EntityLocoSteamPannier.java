package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamPannier extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamPannier;
	}

	public EntityLocoSteamPannier(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	



	@Override
	public boolean shouldRiderSit(){return false;}
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.5094F, 0.3F, -0.0003F, SeatRole.DRIVER)
		};
	}@Override
	public String getInventoryName() {
		return "0-6-0 Pannier";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.3F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 80;
	}
}