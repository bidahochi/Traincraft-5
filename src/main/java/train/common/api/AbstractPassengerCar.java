package train.common.api;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class AbstractPassengerCar extends EntityRollingStock implements IPassenger
{
    /** Constructor used when attempting to retreive
     *
     * Must be implemented in each AbstractPassengerCar
     * @param world
     */
    public AbstractPassengerCar(World world)
    {
        super(world);
    }

    protected double getAdditionalYOffset()
    {
        return 0D;
    }

	@Override
	protected SeatDefinition[] getSeatDefinitions()
	{
		return new SeatDefinition[]
		{
			new SeatDefinition("passenger_1", 0.0F, (float) getAdditionalYOffset(), 0.0F, SeatRole.PASSENGER)
		};
	}

    /** Returns the distance that the RollingStockCar Entity
     *  should be from the other RollingStockCar Entity being coupled to
     */
    protected float getOptimalLinkingDistance()
    {
        return 0F;
    }

    @Override
    public boolean interactFirst(EntityPlayer player)
    {
        if (super.interactFirst(player))
        {
            return true;
        }
        if (worldObj.isRemote)
        {
            return true;
        }
        return mountPassenger(player);
    }

    @Override
    public boolean canBeRidden()
    {
        return true;
    }

    /** Reports whether a passenger can use the onboard sleep menu. */
    public boolean hasSleepingBunk()
    {
        return false;
    }

    @Override
    public boolean isStorageCart()
    {
        return false;
    }

    @Override
    public boolean isPoweredCart()
    {
        return false;
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart)
    {
        return getOptimalLinkingDistance();
    }
}
