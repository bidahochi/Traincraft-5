package train.common.entity;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;

/**
 * Invisible mount used for proxy-mounted rolling-stock occupants. Minecraft
 * 1.7.10 supports only one rider per entity, so each of these entities owns one
 * vanilla mount relationship while following a stable seat index on its parent.
 */
public final class EntityPassengerSeat extends Entity implements IEntityAdditionalSpawnData
{
	private static final int PARENT_RESOLUTION_TIMEOUT_TICKS = 100;

	private EntityRollingStock parentRollingStock;
	private int parentEntityId = -1;
	private int seatIndex = -1;
	private int parentResolutionTicks;

	public EntityPassengerSeat(World world)
	{
		super(world);
		setSize(0.25F, 0.25F);
		yOffset = 0.0F;
		noClip = true;
	}

	public EntityPassengerSeat(EntityRollingStock parentRollingStock, int seatIndex)
	{
		this(parentRollingStock.worldObj);
		this.parentRollingStock = parentRollingStock;
		this.parentEntityId = parentRollingStock.getEntityId();
		this.seatIndex = seatIndex;
	}

	@Override
	protected void entityInit()
	{
	}

	public EntityRollingStock getParentRollingStock()
	{
		return parentRollingStock;
	}

	public int getSeatIndex()
	{
		return seatIndex;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		resolveParent();

		if (parentRollingStock == null)
		{
			parentResolutionTicks++;
			if (parentResolutionTicks > PARENT_RESOLUTION_TIMEOUT_TICKS)
			{
				setDead();
			}
			return;
		}

		if (parentRollingStock.isDead || parentRollingStock.attachPassengerSeat(this) == false)
		{
			setDead();
			return;
		}

		parentRollingStock.updatePassengerSeatPosition(this);
		if (worldObj.isRemote == false && riddenByEntity == null)
		{
			setDead();
		}
	}

	private void resolveParent()
	{
		if (parentRollingStock != null || parentEntityId < 0)
		{
			return;
		}

		Entity candidate = worldObj.getEntityByID(parentEntityId);
		if (candidate instanceof EntityRollingStock)
		{
			parentRollingStock = (EntityRollingStock) candidate;
			parentResolutionTicks = 0;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int increments)
	{
		// The parent supplies this seat's position and history; tracker corrections would fight it.
	}

	@Override
	public void updateRiderPosition()
	{
		if (riddenByEntity == null)
		{
			return;
		}

		double riderYOffset = riddenByEntity.getYOffset();
		riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPosX;
		riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPosY + riderYOffset;
		riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPosZ;
		riddenByEntity.setPosition(posX, posY + riderYOffset, posZ);
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return false;
	}

	@Override
	public boolean canBePushed()
	{
		return false;
	}

	@Override
	public double getMountedYOffset()
	{
		return 0.0D;
	}

	@Override
	public void applyEntityCollision(Entity entity)
	{
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tagCompound)
	{
		// A seat has no independent persistent state; discard stale loaded seats.
		setDead();
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tagCompound)
	{
	}

	@Override
	public void writeSpawnData(ByteBuf buffer)
	{
		buffer.writeInt(parentRollingStock == null ? parentEntityId : parentRollingStock.getEntityId());
		buffer.writeInt(seatIndex);
	}

	@Override
	public void readSpawnData(ByteBuf buffer)
	{
		parentEntityId = buffer.readInt();
		seatIndex = buffer.readInt();
	}

	@Override
	public void setDead()
	{
		Entity passenger = riddenByEntity;
		if (passenger != null)
		{
			passenger.mountEntity(null);
			riddenByEntity = null;
		}

		EntityRollingStock previousParent = parentRollingStock;
		parentRollingStock = null;
		if (previousParent != null)
		{
			previousParent.detachPassengerSeat(this);
		}
		super.setDead();
	}
}
