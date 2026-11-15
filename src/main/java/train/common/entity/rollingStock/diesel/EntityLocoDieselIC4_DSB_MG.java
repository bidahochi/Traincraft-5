package train.common.entity.rollingStock.diesel;

import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import train.common.seats.SeatRole;

public class EntityLocoDieselIC4_DSB_MG extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricIC4_DSB_MG;
	}
	public EntityLocoDieselIC4_DSB_MG(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	
	@Override
	public String getInventoryName() {
		return "IC4MG";
	}
	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.1f);
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 2.85f, 0.28f, 0f, SeatRole.DRIVER),
			new SeatDefinition("passenger_2", 1.92f, 0.28f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", 1.36f, 0.28f, -0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_4", 0.73f, 0.28f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_5", 0.11f, 0.28f, -0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_6", -1.77f, 0.28f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_7", -2.39f, 0.28f, -0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_8", -3.02f, 0.28f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_9", -3.64f, 0.28f, -0.3f, SeatRole.PASSENGER)
		};
	}

}
