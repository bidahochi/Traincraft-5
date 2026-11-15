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

public class EntityLocoDieselFOLM1 extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselFOLM1;
	}
	public EntityLocoDieselFOLM1(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	@Override
	public String transportCountry()
	{
		return "CZ";
	}

	@Override
	public boolean isFictional()
	{
		return true;
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 2.0984F, 0.35F, 0.025F, SeatRole.DRIVER)
		};
	}


	@Override
	public String getInventoryName() {
		return "FOL M1";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1F);
	}
	
}