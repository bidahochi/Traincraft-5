package train.common.api;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import train.common.entity.CargoManager;
import train.common.items.ItemPadlock;
import train.common.library.ItemIDs;

public abstract class AbstractPassengerCombineCar extends AbstractStandardFreightCar implements IPassenger
{
    public AbstractPassengerCombineCar(World world)
    {
        super(world);
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

    /** Returns the distance that the RollingStockCar Entity
     *  should be from the other RollingStockCar Entity being coupled to
     */
    protected float getOptimalLinkingDistance()
    {
        return 0F;
    }

    @Override
    public void updateRiderPosition()
    {
        if(riddenByEntity != null)
        {
            riddenByEntity.setPosition(posX, posY + getMountedYOffset() + riddenByEntity.getYOffset() + getAdditionalYOffset(), posZ);
        }
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer)
    {
        if ((super.interactFirst(entityplayer)) && entityplayer.isSneaking())
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

            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer)
            {
                return true;
            }

            if (worldObj.isRemote == false && entityplayer.isSneaking() == false
                    && (itemstack == null || ((itemstack.getItem() == ItemIDs.padlock.item) == false && (itemstack.getItem() == ItemIDs.stake.item) == false)))
            {
                entityplayer.mountEntity(this);
            }
        }

        if ((super.interactFirst(entityplayer)))
        {
            return false;
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
