package train.common.entity.rollingStock.diesel;

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
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() - 0.1F, posZ);
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