package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PassengerIC4_DSB_FH extends AbstractPassengerCar
{

	public PassengerIC4_DSB_FH(World world) {
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
			new SeatDefinition("passenger_1", 1.53f, 0.10f, 0.50f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", 1.53f, 0.10f, -0.50f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", -2.28f, 0.22f, 0.37f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_4", -2.78f, 0.22f, -0.38f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_5", -2.78f, 0.22f, 0.37f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_6", -3.28f, 0.22f, -0.38f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_7", -3.28f, 0.22f, 0.37f, SeatRole.PASSENGER)
		};
	}
}
