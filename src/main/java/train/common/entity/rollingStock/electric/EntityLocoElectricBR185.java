package train.common.entity.rollingStock.electric;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricBR185 extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricBR185;
	}
	public EntityLocoElectricBR185(World world) {
		super(world);
	}

	


	
	@Override
	public String getInventoryName() {
		return "BR 185";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("front_driver", 4.7625F, 0.53f, -0.3F, SeatRole.DRIVER, "front_cab"),
			new SeatDefinition("rear_driver", 0.3625F, 0.53f, 0.3F, SeatRole.DRIVER, "rear_cab")
		};
	}

}
