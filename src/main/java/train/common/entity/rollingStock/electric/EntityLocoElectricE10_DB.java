package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricE10_DB extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricE10_DB;
	}

	public EntityLocoElectricE10_DB(World world) {
		super(world);
	}

	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 1.8813F, 0.05F, 0F, SeatRole.DRIVER)
		};
	}

	
	@Override
	public String getInventoryName() {
		return "E10 (DB)";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1F;
	}
	
}