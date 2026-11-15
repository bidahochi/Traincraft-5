package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricE103 extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricE103;
	}

	public EntityLocoElectricE103(World world) {
		super(world);
	}



	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 1.9031F, 0.05F, 0F, SeatRole.DRIVER)
		};
	}

	
	@Override
	public String getInventoryName() {
		return "E103";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.995F;
	}
	
}