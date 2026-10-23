package train.common.api;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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
    public void setDead()
    {
        super.setDead();
        isDead = true;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer)
    {
        playerEntity = entityplayer;
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

            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer)
            {
                return true;
            }

            boardPlayer(entityplayer);
        }

        return true;
    }

    @Override
    public boolean canBeRidden()
    {
        return true;
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
