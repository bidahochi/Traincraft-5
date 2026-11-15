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

public class EntityLocoDieselWLs40 extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselWLs40;
	}

	public EntityLocoDieselWLs40(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -1.5781F, 0.5F, 0F, SeatRole.DRIVER)
		};
	}

	@Override
	public String getInventoryName() {
		return "WLs40";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1F);
	}
	
}