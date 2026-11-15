package train.common.entity.rollingStock.steam;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamAlice0_4_0 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamAlice0_4_0;
	}

	public EntityLocoSteamAlice0_4_0(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.125F, 0.65F, 0F, SeatRole.DRIVER)
		};
	}
	@Override
	public boolean shouldRiderSit(){return false;}
@Override
	public String getInventoryName() {
		return "0-4-0 Alice";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.9F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 32;
	}
}