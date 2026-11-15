package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.client.render.models.ModelTramNY;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.api.EntityRollingStock;
import train.common.api.IPassenger;
import train.common.library.Info;

public class EntityPassengerTramNY extends AbstractPassengerCar {

	public EntityPassengerTramNY(World world) {
		super(world);
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.2F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerTramNY.class, new ModelTramNY(),
				"locoTramNY_",
				new float[] { 0F, -0.44F, 0.0F },
				null,
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
			new SeatDefinition("passenger_1", 0.9f, 0.35f, 0.3f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", -0.7f, 0.35f, -0.3f, SeatRole.PASSENGER)
		};
	}

}
