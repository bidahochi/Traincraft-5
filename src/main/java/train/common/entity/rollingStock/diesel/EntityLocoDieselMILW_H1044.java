package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselMILW_H1044 extends DieselTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return null;
	}

	public EntityLocoDieselMILW_H1044(World world) {
		super(world, LiquidManager.dieselFilter());
	}
	

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.45F, posZ);
	}
	
	@Override
	public String getInventoryName() {
		return "MILW H10-44";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (0.8F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 1618;
	}

	@Override
	public int getTankCapacity()
	{
		return 8000;
	}

	
}