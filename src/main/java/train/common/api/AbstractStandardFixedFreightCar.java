package train.common.api;

import net.minecraft.world.World;
import train.common.entity.CargoManager;

public abstract class AbstractStandardFixedFreightCar extends AbstractStandardFreightCar
{
    public AbstractStandardFixedFreightCar(World world)
    {
        super(world);
    }

    public AbstractStandardFixedFreightCar(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }

    @Override
    public final CargoManager setupCargoManager()
    {
        return null;
    }
}
