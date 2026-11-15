package train.common.entity.rollingStock.passenger;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelDRGCombo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCombineCar;
import train.common.library.Info;

public class EntityPassengerDenverRioGrandeCombo extends AbstractPassengerCombineCar
{

	public EntityPassengerDenverRioGrandeCombo(World world) {
		super(world);
	}

	@Override
	public void setupTextureDescription()
	{
		InsertTexture(0, "DRGW");
		InsertTexture(1, "Noctua Poopy Brown");
		InsertTexture(2, "Green");
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}


	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.15F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityPassengerDenverRioGrandeCombo.class, new ModelDRGCombo(),
				"drg_combo_",
				new float[] { 0.0F, 0.14F, 0F },
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
			new SeatDefinition("passenger_1", -0.22f, 0.4f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_2", 0.79f, 0.4f, 0f, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", 1.8f, 0.4f, 0f, SeatRole.PASSENGER)
		};
	}

}
