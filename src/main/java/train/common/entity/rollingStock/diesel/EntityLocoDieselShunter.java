package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselShunter extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselShunter;
	}

	public EntityLocoDieselShunter(World world) {
		super(world, LiquidManager.dieselFilter());
	}


	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.4F, posZ);
	}

	
	@Override
	public String getInventoryName() {
		return "Class 08 Shunter";
	}
	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.6F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 354;
	}

	@Override
	public int getTankCapacity()
	{
		return 8000;
	}

	
}