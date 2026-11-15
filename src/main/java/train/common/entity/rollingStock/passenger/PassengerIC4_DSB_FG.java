package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PassengerIC4_DSB_FG extends AbstractPassengerCar
{

	public PassengerIC4_DSB_FG(World world) {
		super(world);
	}








	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.65F;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("passenger_1", 0.84f, 0.42f, 0.37f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", -1.03f, 0.42f, -0.38f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", 1.47f, 0.42f, -0.38f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_4", -1.66f, 0.42f, 0.37f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_5", 2.09f, 0.42f, 0.37f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_6", -2.28f, 0.42f, -0.38f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_7", 2.66f, 0.42f, -0.38f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_8", -2.91f, 0.42f, 0.37f, SeatRole.PASSENGER)
		};
	}
}
