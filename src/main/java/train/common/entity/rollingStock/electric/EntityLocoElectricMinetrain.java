package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricMinetrain extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricMineTrain;
	}

	public EntityLocoElectricMinetrain(World world) {
		super(world);
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.5812F, 0.1F, 0.1847F, SeatRole.DRIVER)
		};
	}

	

	@Override
	public String getInventoryName() {
		return "Cart hauler";
	}

	
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.53F;
	}
	
}