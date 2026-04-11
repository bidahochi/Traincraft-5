package train.common.entity.rollingStock.diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;

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
	public void updateRiderPosition() {
		TraincraftUtil.updateRider(this, 4, 0.35f);
	}


	@Override
	public String getInventoryName() {
		return "FOL M1";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1F);
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 5000;
	}

	@Override
	public int getTankCapacity()
	{
		return 15000;
	}
	
}