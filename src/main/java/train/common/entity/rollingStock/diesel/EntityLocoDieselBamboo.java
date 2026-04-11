package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;

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
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 1.3, 0);
	}

	@Override
	public String getInventoryName() {
		return "Bamboo Flatcar With Engine";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.3F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 30;
	}

	@Override
	public int getTankCapacity()
	{
		return 3000;
	}
	
}