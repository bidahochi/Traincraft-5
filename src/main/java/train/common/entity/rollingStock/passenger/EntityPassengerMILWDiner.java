package train.common.entity.rollingStock.passenger;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class EntityPassengerMILWDiner extends AbstractPassengerCar
{

	public EntityPassengerMILWDiner(World world) {
		super(world);
	}

	@Override
	protected double getAdditionalYOffset()
	{
		return 0.2D;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 3.1F;
	}
}
