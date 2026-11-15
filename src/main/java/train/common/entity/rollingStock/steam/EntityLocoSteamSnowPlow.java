package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardSteamPoweredRotarySnowPlow;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamSnowPlow extends AbstractStandardSteamPoweredRotarySnowPlow {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamSnowPlow;
	}

	public EntityLocoSteamSnowPlow(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.3625F, 0.3F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "Steam Snow Plow";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.7F);
	}

	@Override
	public float transportTopSpeed()
	{
		return 20;
	}
}