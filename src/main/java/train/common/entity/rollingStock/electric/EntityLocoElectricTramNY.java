package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.models.ModelTramNY;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;
import train.common.seats.SeatRole;

public class EntityLocoElectricTramNY extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricTramNY;
	}
	public EntityLocoElectricTramNY(World world) {
		super(world);
	}

	


	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Info.modID,
				EntityLocoElectricTramNY.class, new ModelTramNY(),
				"locoTramNY_",
				new float[] { -1.5F, -0.44F, 0.0F },
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
			new SeatDefinition("driver", 3.4F, 0.55f, -0.4696F, SeatRole.DRIVER),
			new SeatDefinition("passenger_2", 2.2F, 0.55f, 0.2804F, SeatRole.PASSENGER),
			new SeatDefinition("passenger_3", 0.6F, 0.55f, -0.3196F, SeatRole.PASSENGER)
		};
	}

}
