package train.common.entity.rollingStock.electric;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricClass85 extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricClass85;
	}

	public EntityLocoElectricClass85(World world) {
		super(world);
	}

	


	
	@Override
	public String getInventoryName() {
		return "Class 85";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.56F;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("front_driver", 4.7375F, 0.5f, 0F, SeatRole.DRIVER, "front_cab"),
			new SeatDefinition("rear_driver", 0.1375F, 0.5f, 0F, SeatRole.DRIVER, "rear_cab")
		};
	}

}
