package train.common.entity.rollingStock.diesel;

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
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45F, posZ);
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

	@Override
	public float transportMetricHorsePower()
	{
		return 1058;
	}

	@Override
	public int getTankCapacity()
	{
		return 8000;
	}

	
}