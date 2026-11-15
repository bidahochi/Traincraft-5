package train.common.entity.rollingStock.diesel;

import train.common.seats.SeatDefinition;
import train.common.seats.SeatRole;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselKof_DB extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselKof_DB;
	}

	public EntityLocoDieselKof_DB(World world) {
		super(world, LiquidManager.dieselFilter());

	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.875F, -0.1F, 0.0221F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "Kof";
	}
	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.6F);
	}

}