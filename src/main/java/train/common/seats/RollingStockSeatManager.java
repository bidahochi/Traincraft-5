package train.common.seats;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import train.common.api.EntityRollingStock;
import train.common.Traincraft;
import train.common.entity.EntityPassengerSeat;

/** Owns transient seat mounts and mutually related rolling-stock control state. */
public final class RollingStockSeatManager
{
	public static final int LIVESTOCK_UNLOADING_WATCHER = 8;
	private static final int PROTECTION_DURATION_TICKS = 20;
	private static final int PROTECTION_REFRESH_TICKS = 5;
	private static final int PROTECTION_AMPLIFIER = 5;
	private final EntityRollingStock rollingStock;
	private final Map<Integer, EntityPassengerSeat> passengerSeats =
			new HashMap<Integer, EntityPassengerSeat>();
	private int directSeatIndex = -1;
	private int activeControlSeatIndex = -1;
	private String activeControlStationId = "";
	private boolean emergencyBrakeApplied;

	public RollingStockSeatManager(EntityRollingStock rollingStock)
	{
		this.rollingStock = rollingStock;
	}

	public boolean isOccupied(int seatIndex)
	{
		return getOccupant(seatIndex) != null;
	}

	/** Resolves direct mounts and seat proxies without granting control authority. */
	public static EntityRollingStock getRidingStock(Entity rider)
	{
		if (rider == null || rider.ridingEntity == null || rider.ridingEntity.isDead)
		{
			return null;
		}
		Entity mount = rider.ridingEntity;
		EntityRollingStock stock = mount instanceof EntityRollingStock ? (EntityRollingStock) mount
				: mount instanceof EntityPassengerSeat ? ((EntityPassengerSeat) mount).getParentRollingStock() : null;
		return stock == null || stock.isDead || stock.worldObj != rider.worldObj ? null : stock;
	}

	public Entity getOccupant(int seatIndex)
	{
		if (rollingStock.riddenByEntity != null && getDirectSeatIndex() == seatIndex)
		{
			return rollingStock.riddenByEntity;
		}
		EntityPassengerSeat passengerSeat = passengerSeats.get(seatIndex);
		return passengerSeat == null || passengerSeat.isDead ? null : passengerSeat.riddenByEntity;
	}

	public int getSeatIndex(Entity entity)
	{
		if (entity != null && entity == rollingStock.riddenByEntity)
		{
			return getDirectSeatIndex();
		}
		if (entity != null && entity.ridingEntity instanceof EntityPassengerSeat)
		{
			EntityPassengerSeat passengerSeat = (EntityPassengerSeat) entity.ridingEntity;
			return passengerSeat.getParentRollingStock() == rollingStock ? passengerSeat.getSeatIndex() : -1;
		}
		return -1;
	}

	public boolean containsPassenger(Entity entity)
	{
		return getSeatIndex(entity) >= 0;
	}

	public int getPassengerCount()
	{
		int passengerCount = rollingStock.riddenByEntity == null ? 0 : 1;
		for (EntityPassengerSeat passengerSeat : passengerSeats.values())
		{
			if (passengerSeat.isDead == false && passengerSeat.riddenByEntity != null)
			{
				passengerCount++;
			}
		}
		return passengerCount;
	}

	/** Creates and registers an empty proxy, or returns {@code null} if spawning fails. */
	EntityPassengerSeat createProxy(int seatIndex)
	{
		EntityPassengerSeat previousSeat = passengerSeats.get(seatIndex);
		if (previousSeat != null)
		{
			previousSeat.setDead();
		}
		EntityPassengerSeat passengerSeat = new EntityPassengerSeat(rollingStock, seatIndex);
		rollingStock.updatePassengerSeatPosition(passengerSeat);
		passengerSeats.put(seatIndex, passengerSeat);
		if (rollingStock.worldObj.spawnEntityInWorld(passengerSeat) == false)
		{
			passengerSeats.remove(seatIndex);
			passengerSeat.setDead();
			return null;
		}
		return passengerSeat;
	}

	/** Accepts a proxy received from entity tracking when its index is valid and free. */
	public boolean attachProxy(EntityPassengerSeat passengerSeat)
	{
		if (passengerSeat == null || passengerSeat.getParentRollingStock() != rollingStock)
		{
			return false;
		}
		int seatIndex = passengerSeat.getSeatIndex();
		if (seatIndex < 0 || seatIndex >= rollingStock.getSeatCount())
		{
			return false;
		}
		EntityPassengerSeat existingSeat = passengerSeats.get(seatIndex);
		if (existingSeat != null && existingSeat != passengerSeat && existingSeat.isDead == false)
		{
			if (rollingStock.worldObj.isRemote == false)
			{
				return false;
			}
			existingSeat.setDead();
		}
		passengerSeats.put(seatIndex, passengerSeat);
		return true;
	}

	public void detachProxy(EntityPassengerSeat passengerSeat)
	{
		if (passengerSeat != null && passengerSeats.get(passengerSeat.getSeatIndex()) == passengerSeat)
		{
			passengerSeats.remove(passengerSeat.getSeatIndex());
		}
	}

	/** Destroys every transient proxy before its parent leaves the world. */
	public void clearProxies()
	{
		for (EntityPassengerSeat passengerSeat : new ArrayList<EntityPassengerSeat>(passengerSeats.values()))
		{
			passengerSeat.setDead();
		}
		passengerSeats.clear();
	}

	/** Keep riders by stable ID, but never carry old control authority into a new arrangement. */
	public void remapPassengers(RollingStockSeatLayout previous, RollingStockSeatLayout next)
	{
		activeControlSeatIndex = -1;
		activeControlStationId = "";
		SeatDefinition directSeat = previous.getDefinition(directSeatIndex);
		directSeatIndex = directSeat == null ? -1 : next.findSeatIndex(directSeat.getSeatId());
		if (directSeatIndex < 0 && rollingStock.riddenByEntity != null)
		{
			rollingStock.riddenByEntity.mountEntity(null);
		}
		Map<Integer, Entity> movedPassengers = new HashMap<Integer, Entity>();
		for (EntityPassengerSeat proxy : new ArrayList<EntityPassengerSeat>(passengerSeats.values()))
		{
			SeatDefinition oldSeat = previous.getDefinition(proxy.getSeatIndex());
			int targetIndex = oldSeat == null ? -1 : next.findSeatIndex(oldSeat.getSeatId());
			if (targetIndex >= 0 && targetIndex == proxy.getSeatIndex())
			{
				rollingStock.updatePassengerSeatPosition(proxy);
				continue;
			}
			if (targetIndex >= 0 && proxy.riddenByEntity != null)
			{
				movedPassengers.put(targetIndex, proxy.riddenByEntity);
			}
			proxy.setDead();
		}
		// Remove old indices first so reordered seats cannot overwrite each other's proxies.
		for (Map.Entry<Integer, Entity> moved : movedPassengers.entrySet())
		{
			EntityPassengerSeat proxy = createProxy(moved.getKey());
			if (proxy == null)
			{
				Traincraft.tcLog.warn("[Seats] Could not remount seat " + moved.getKey() + " after skin change");
				continue;
			}
			moved.getValue().mountEntity(proxy);
			if (moved.getValue().ridingEntity != proxy)
			{
				proxy.setDead();
				Traincraft.tcLog.warn("[Seats] Rider could not remount seat " + moved.getKey() + " after skin change");
			}
		}
	}

	/** Refreshes collision protection only when an occupied seat needs it. */
	public void protectPassengers()
	{
		if (rollingStock.worldObj.isRemote)
		{
			return;
		}
		refreshProtection(rollingStock.riddenByEntity);
		for (EntityPassengerSeat passengerSeat : passengerSeats.values())
		{
			refreshProtection(passengerSeat.riddenByEntity);
		}
	}

	private static void refreshProtection(Entity passenger)
	{
		if ((passenger instanceof EntityPlayer) == false)
		{
			return;
		}
		EntityPlayer player = (EntityPlayer) passenger;
		PotionEffect currentEffect = player.getActivePotionEffect(Potion.resistance);
		boolean weakerEffect = currentEffect != null && currentEffect.getAmplifier() < PROTECTION_AMPLIFIER;
		boolean expiringEffect = currentEffect != null && currentEffect.getAmplifier() == PROTECTION_AMPLIFIER
				&& currentEffect.getDuration() <= PROTECTION_REFRESH_TICKS;
		if (currentEffect == null || weakerEffect || expiringEffect)
		{
			player.addPotionEffect(new PotionEffect(Potion.resistance.id,
					PROTECTION_DURATION_TICKS, PROTECTION_AMPLIFIER, true));
		}
	}

	public int getDirectSeatIndex()
	{
		// Vanilla restores a saved mob's direct mount without passing through our boarding method.
		if (directSeatIndex < 0 && rollingStock.riddenByEntity instanceof EntityLiving)
		{
			for (int index = 0; index < rollingStock.getSeatCount(); index++)
			{
				if (rollingStock.getSeatDefinition(index).getRole() == SeatRole.LIVESTOCK)
				{
					directSeatIndex = index;
					break;
				}
			}
		}
		return directSeatIndex;
	}

	public boolean isLivestockUnloading()
	{
		return rollingStock.getDataWatcher().getWatchableObjectByte(LIVESTOCK_UNLOADING_WATCHER) != 0;
	}

	public void setLivestockUnloading(boolean unloading)
	{
		if (rollingStock.worldObj.isRemote)
		{
			return;
		}
		rollingStock.getDataWatcher().updateObject(LIVESTOCK_UNLOADING_WATCHER, (byte) (unloading ? 1 : 0));
		if (unloading)
		{
			unloadPassengers(true);
		}
	}

	/** The GUI unloads livestock animals only; disembark tracks unload every seat. */
	public boolean unloadPassengers(boolean animalsOnly)
	{
		if (rollingStock.worldObj.isRemote)
		{
			return false;
		}
		boolean unloaded = false;
		for (int index = 0; index < rollingStock.getSeatCount(); index++)
		{
			Entity occupant = getOccupant(index);
			if (occupant == null || (animalsOnly && (rollingStock.getSeatDefinition(index).getRole() != SeatRole.LIVESTOCK
					|| (occupant instanceof EntityAnimal) == false)))
			{
				continue;
			}
			Entity mount = occupant.ridingEntity;
			occupant.mountEntity(null);
			if (activeControlSeatIndex == index)
			{
				clearActiveControlSeat();
				rollingStock.clearTransientControlInput();
			}
			if (mount instanceof EntityPassengerSeat)
			{
				mount.setDead();
			}
			else
			{
				directSeatIndex = -1;
			}
			unloaded = true;
		}
		return unloaded;
	}

	public void setDirectSeatIndex(int directSeatIndex)
	{
		this.directSeatIndex = directSeatIndex;
	}

	public int getActiveControlSeatIndex()
	{
		return activeControlSeatIndex;
	}

	/** Changes the active driver's stable seat index without changing the latched cab. */
	void setActiveControlSeatIndex(int activeControlSeatIndex)
	{
		this.activeControlSeatIndex = activeControlSeatIndex;
	}

	public String getActiveControlStationId()
	{
		return activeControlStationId;
	}

	/** Changes the cab identifier selected for control recovery. */
	void setActiveControlStationId(String activeControlStationId)
	{
		this.activeControlStationId = activeControlStationId == null ? "" : activeControlStationId;
	}

	/** Changes the active driver and its cab as one related state transition. */
	void setActiveControlSeat(int seatIndex, String stationId)
	{
		activeControlSeatIndex = seatIndex;
		setActiveControlStationId(stationId);
	}

	/** Clears the active driver while retaining the cab selected for recovery. */
	public void clearActiveControlSeat()
	{
		activeControlSeatIndex = -1;
	}

	public boolean isEmergencyBrakeApplied()
	{
		return emergencyBrakeApplied;
	}

	public void setEmergencyBrakeApplied(boolean emergencyBrakeApplied)
	{
		this.emergencyBrakeApplied = emergencyBrakeApplied;
	}

	/** Applies a complete transient state update received by a tracking client. */
	public void setClientControlState(int directSeatIndex, int activeControlSeatIndex,
			String activeControlStationId, boolean emergencyBrakeApplied)
	{
		this.directSeatIndex = directSeatIndex;
		this.activeControlSeatIndex = activeControlSeatIndex;
		setActiveControlStationId(activeControlStationId);
		this.emergencyBrakeApplied = emergencyBrakeApplied;
	}
}
