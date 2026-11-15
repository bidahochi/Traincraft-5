package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelBambooTrainPassenger;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.Info;

public class EntityPassengerBamboo extends AbstractPassengerCar
{

	public EntityPassengerBamboo(World world) {
		super(world);
	}


	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.55F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerBamboo.class, new ModelBambooTrainPassenger(),
				"passenger_bamboo_",
				new float[] { 0.1F, 0F, 0F },
				new float[] { 0F, 180F, 180F },
				null));
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("passenger_1", -0.5f, 0.65f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", 0.5f, 0.65f, 0f, SeatRole.PASSENGER)
		};
	}

}
