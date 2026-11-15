package train.common.entity.rollingStock.diesel;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselDeltic extends DieselTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselDeltic;
	}

	public EntityLocoDieselDeltic(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	


	
	@Override
	public String getInventoryName() {
		return "Deltic";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("front_driver", 5.35F, 0.8f, 0.0078F, SeatRole.DRIVER, "front_cab"),
			new SeatDefinition("rear_driver", 0.15F, 0.8f, 0.0078F, SeatRole.DRIVER, "rear_cab")
		};
	}

}
