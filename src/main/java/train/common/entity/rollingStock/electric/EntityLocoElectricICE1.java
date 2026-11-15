package train.common.entity.rollingStock.electric;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.ElectricTrain;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoElectricICE1 extends ElectricTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoElectricICE1;
	}

	public EntityLocoElectricICE1(World world) {
		super(world);
	}

	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 2.0125F, 0F, 0.025F, SeatRole.DRIVER)
		};
	}

	
	@Override
	public String getInventoryName() {
		return "ICB 1";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.56F;
	}
	
}