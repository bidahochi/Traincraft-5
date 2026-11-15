package train.common.entity.rollingStock.electric;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricCD151 extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselCD151;
	}

	public EntityLocoElectricCD151(World world) {
		super(world);
	}

	



	@Override
	public String getInventoryName() {
		return "CD 151";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.475F;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("front_driver", 3.6019F, 0.48f, -0.3F, SeatRole.DRIVER, "front_cab"),
			new SeatDefinition("rear_driver", 0.3419F, 0.48f, -0.3F, SeatRole.DRIVER, "rear_cab")
		};
	}

}
