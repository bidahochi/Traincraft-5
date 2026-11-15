package train.common.api;

import train.common.seats.SeatRole;
import train.common.seats.SeatDefinition;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.entity.CargoManager;
import train.common.enums.CargoItemFilter;
import train.common.library.ItemIDs;

public abstract class AbstractPassengerCombineCar extends AbstractStandardFreightCar implements IPassenger
{
    public AbstractPassengerCombineCar(World world)
    {
        super(world);
        cargoFilterCategory = CargoItemFilter.DEFAULT;
    }

    @Override
    public final CargoManager setupCargoManager()
    {
        return null;
    }

    public double getAdditionalYOffset()
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
    public boolean interactFirst(EntityPlayer entityplayer)
    {
        if ((super.interactFirst(entityplayer)))
        {
            return false;
        }

        if (worldObj.isRemote == false)
        {
            ItemStack itemstack = entityplayer.inventory.getCurrentItem();
            if(lockThisCart(itemstack, entityplayer))
            {
                return true;
            }

            if (worldObj.isRemote == false && entityplayer.isSneaking() == false && (itemstack == null || itemstack.getItem() != ItemIDs.stake.item && itemstack.getItem() != ItemIDs.padlock.item))
            {
				return mountPassenger(entityplayer);
            }
        }

        return true;
    }

    @Override
    public boolean canBeRidden()
    {
        return true;
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

    @Override
    public String getInventoryName()
    {
        return this.trainName;
    }
}
