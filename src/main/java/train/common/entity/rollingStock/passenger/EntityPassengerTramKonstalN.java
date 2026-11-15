package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class EntityPassengerTramKonstalN extends AbstractPassengerCar
{

	public EntityPassengerTramKonstalN(World world) {
		super(world);
	}

	@Override
	protected double getAdditionalYOffset()
	{
		return 0.1F;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.2F;
	}
}
