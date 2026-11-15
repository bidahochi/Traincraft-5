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

public class EntityLocoDieselV60_DB extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselV60_DB;
	}

	public EntityLocoDieselV60_DB(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", -0.5F, 0.45F, 0.0422F, SeatRole.DRIVER)
		};
	}@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote) {
			return;
		}
		checkInvent(locoInvent[0]);
	}

	
	@Override
	public String getInventoryName() {
		return "V60";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.5F);
	}

	
}