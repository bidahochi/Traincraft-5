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

public class EntityLocoDieselBamboo extends DieselTrain {

	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselBamboo;
	}

	public EntityLocoDieselBamboo(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 0.3F, 0F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "Bamboo Flatcar With Engine";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.3F);
	}
	
}