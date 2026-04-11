package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;

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
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 0, 0.5f);
	}

	@Override
	public String getInventoryName() {
		return "WLs40";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 60;
	}

	@Override
	public int getTankCapacity()
	{
		return 3000;
	}
	
}