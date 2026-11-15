package train.common.entity.rollingStock.diesel;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;

import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDiesel44TonSwitcher extends DieselTrain
{
	@Override
	public SoundRecord getSoundRecord()
	{
		return EnumSounds.locoDiesel44TonSwitcher;
	}

	public EntityLocoDiesel44TonSwitcher(World world) {
		super(world, LiquidManager.dieselFilter());
	}




	@Override
	public String getInventoryName() {
		return "GE 44 Ton Switcher";
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return (1.0F);
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("driver", 1.4375F, 0.7f, -0.35F, SeatRole.DRIVER),
			new SeatDefinition("crew_1", 1.4375F, 0.7f, 0.35F, SeatRole.CREW)
		};
	}

}
