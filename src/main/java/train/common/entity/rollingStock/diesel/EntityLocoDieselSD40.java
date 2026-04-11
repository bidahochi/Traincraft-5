package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselSD40 extends DieselTrain
{
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselSD40;
	}

	public EntityLocoDieselSD40(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	@Override
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 2.3, 0.3);
	}
	

	@Override
	public String getInventoryName() {
		return "SD40-2";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.2F);
	}
}
