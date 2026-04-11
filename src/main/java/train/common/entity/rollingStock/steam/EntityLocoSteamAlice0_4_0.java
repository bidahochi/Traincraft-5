package train.common.entity.rollingStock.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoSteamAlice0_4_0 extends SteamTrain {
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoSteamAlice0_4_0;
	}

	public EntityLocoSteamAlice0_4_0(World world) {
		super(world, LiquidManager.WATER_FILTER);
		
	}

	

	

	@Override
	public void updateRiderPosition() {
		riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + 0.65, posZ);// default
	}
	@Override
	public boolean shouldRiderSit(){return false;}
@Override
	public String getInventoryName() {
		return "0-4-0 Alice";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.9F;
	}

	@Override
	public float transportTopSpeed()
	{
		return 32;
	}

	@Override
	public float transportMetricHorsePower()
	{
		return 200;
	}

	@Override
	public int getTankCapacity()
	{
		return 3750;
	}
}