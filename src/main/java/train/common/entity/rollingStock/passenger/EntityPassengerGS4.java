package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelGS4Passenger;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.library.Info;

public class EntityPassengerGS4 extends AbstractPassengerCar
{

	public EntityPassengerGS4(World world) {
		super(world);
		InsertTexture(13, "GS4-liner (PH2)");
		InsertTexture(14, "GS4-liner (PH2)");
		InsertTexture(15, "GS4-liner (PH2)");
		InsertTexture(16, "GS4-liner (PH3)");
		InsertTexture(17, "GS4-liner (PH3)");
		InsertTexture(18, "GS4-liner (PH3)");
		InsertTexture(19, "GS4-liner (PH4)");
		InsertTexture(20, "GS4-liner (PH5)");
		InsertTexture(21, "GS4-liner (PH6)");
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.1F;
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerGS4.class, new ModelGS4Passenger(),
				"GS4_Passenger_",
				new float[] { 0.0F, 0.03F, 0F },
				new float[] { 0F, 180F, 180F },
				new float[]{0.8f,1f,0.8f}));
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("passenger_1", -0.17f, 0.26f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", 0.28f, 0.26f, -0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", -0.63f, 0.26f, -0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_4", 0.72f, 0.26f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_5", -1.08f, 0.26f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_6", 1.18f, 0.26f, -0.3f, SeatRole.PASSENGER)
		};
	}

}
