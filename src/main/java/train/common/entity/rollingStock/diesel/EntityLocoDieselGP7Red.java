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

public class EntityLocoDieselGP7Red extends DieselTrain
{
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDieselGP7Red;
	}

	public EntityLocoDieselGP7Red(World world) {
		super(world, LiquidManager.dieselFilter());
	}

	@Override
	public String transportCountry()
	{
		return "US";
	}

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 0.5F, 0.15F, 0.067F, SeatRole.DRIVER)
		};
	}

	
	@Override
	public String getInventoryName() {
		return "GP7";
	}
	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.14F);
	}
}