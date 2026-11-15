package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricHighSpeedZeroED extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricHighSpeedZeroED;
	}

	public EntityLocoElectricHighSpeedZeroED(World world) {
		super(world);
	}

	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 0.5998F, 0.43F, 0F, SeatRole.DRIVER)
		};
	}

	
	@Override
	public String getInventoryName() {
		return "High Speed";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.56F;
	}
	
}