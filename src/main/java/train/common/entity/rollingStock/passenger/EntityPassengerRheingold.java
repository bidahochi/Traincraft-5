package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelRheingoldPassenger;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;

public class EntityPassengerRheingold extends AbstractPassengerCar {

	public EntityPassengerRheingold(World world) {
		super(world);
	}


	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.94F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerRheingold.class, new ModelRheingoldPassenger(),
				"Rheingold_passenger_",
				new float[] { 1.55F, 0.15F, -0.6F },
				new float[] { 0F, 180F, 180F },
				new float[] {0.9f,1f,0.9f}));
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("passenger_1", 0f, 0.17f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", 1.3f, 0.17f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", -1.3f, 0.17f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_4", 2.6f, 0.17f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_5", -2.6f, 0.17f, 0f, SeatRole.PASSENGER)
		};
	}

}
