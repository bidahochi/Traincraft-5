package train.common.entity.rollingStock.diesel;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselClass66 extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselClass66;
	}
	public EntityLocoDieselClass66(World world) {
		super(world, LiquidManager.dieselFilter());
	}


	
	@Override
	public String getInventoryName() {
		return "Class 66";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1F);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("front_driver", 5.5656F, 0.51f, 0.15F, SeatRole.DRIVER, "front_cab"),
			new SeatDefinition("rear_driver", -0.0344F, 0.51f, -0.2F, SeatRole.DRIVER, "rear_cab")
		};
	}

}
