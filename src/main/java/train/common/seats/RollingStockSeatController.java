package train.common.seats;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketSeatSelection;
import train.common.entity.EntityPassengerSeat;

/**
 * Performs server-authoritative boarding, seat movement, cab transfer, and cab safety actions for
 * one rolling-stock entity.
 */
public final class RollingStockSeatController
{
	private static final double EMERGENCY_RESET_SPEED_LIMIT = 0.1D;
	private static final double PARKING_BRAKE_SPEED_LIMIT = 10.0D;
	private final EntityRollingStock rollingStock;
	private final RollingStockSeatManager seatManager;
	private final RollingStockSeatPositioner seatPositioner;
	private final RollingStockSeatStateSync stateSync;

	public RollingStockSeatController(EntityRollingStock rollingStock, RollingStockSeatManager seatManager,
			RollingStockSeatPositioner seatPositioner, RollingStockSeatStateSync stateSync)
	{
		this.rollingStock = rollingStock;
		this.seatManager = seatManager;
		this.seatPositioner = seatPositioner;
		this.stateSync = stateSync;
	}

	/** Handles ordinary nearest-seat boarding and deliberate sneak-use seat selection. */
	public boolean mountPassenger(EntityPlayer player)
	{
		if (player == null)
		{
			return false;
		}
		if (rollingStock.worldObj.isRemote)
		{
			return true;
		}
		if (player.isSneaking())
		{
			if (player instanceof EntityPlayerMP)
			{
				Traincraft.modChannel.sendTo(PacketSeatSelection.open(rollingStock), (EntityPlayerMP) player);
			}
			return true;
		}
		if (player.ridingEntity != null)
		{
			return seatManager.containsPassenger(player);
		}
		if (rollingStock.getSeatCount() == 0)
		{
			return false;
		}
		return mountNearestPassenger(player);
	}

	public boolean mountNearestPassenger(EntityPlayer player)
	{
		return player != null && rollingStock.worldObj.isRemote == false
				&& mountPassengerAt(player, seatPositioner.findNearestFreeSeat(player));
	}

	public boolean movePassengerToNearestSeat(EntityPlayer player)
	{
		return player != null && rollingStock.worldObj.isRemote == false
				&& seatManager.containsPassenger(player)
				&& movePassengerToSeat(player, seatPositioner.findNearestFreeSeat(player));
	}

	/** Finds a livestock seat; exact-seat boarding owns the shared admission checks. */
	public boolean mountLivestock(Entity rider)
	{
		if ((rider instanceof EntityLiving) == false || rollingStock.canBeRidden() == false)
		{
			return false;
		}
		for (int index = 0; index < rollingStock.getSeatCount(); index++)
		{
			if (rollingStock.getSeatDefinition(index).getRole() == SeatRole.LIVESTOCK && mountPassengerAt(rider, index))
			{
				return true;
			}
		}
		return false;
	}

	public void setLivestockBoardingEnabled(EntityPlayer player, boolean enabled)
	{
		if (rollingStock.worldObj.isRemote || rollingStock.isDead || player == null || player.isDead
				|| player.worldObj != rollingStock.worldObj || rollingStock.getSeatLayoutForRuntime().hasLivestockSeats() == false
				|| isProtectedControlAuthorized(player) == false
				|| (seatManager.containsPassenger(player) == false && player.getDistanceSqToEntity(rollingStock) > 64.0D))
		{
			return;
		}
		seatManager.setLivestockUnloading(enabled == false);
		stateSync.synchronizeIfChanged();
	}

	/** Performs exact-seat boarding after revalidating occupancy and lock authority. */
	public boolean mountPassengerAt(Entity rider, int seatIndex)
	{
		if (rider == null || rollingStock.worldObj.isRemote || rider.isDead || rider.ridingEntity != null
				|| rollingStock.isDead || rider.worldObj != rollingStock.worldObj || isSeatAvailable(seatIndex) == false)
		{
			return false;
		}

		SeatDefinition definition = rollingStock.getSeatDefinition(seatIndex);
		EntityPlayer player = rider instanceof EntityPlayer ? (EntityPlayer) rider : null;
		if (player != null)
		{
			if (canPlayerBoard(player) == false || rollingStock.canBoardWithInventory(player) == false)
			{
				return false;
			}
		}
		else if ((rider instanceof EntityLiving) == false
				|| definition.getRole() != SeatRole.LIVESTOCK
				|| (rider instanceof EntityAnimal && seatManager.isLivestockUnloading()))
		{
			return false;
		}
		boolean activateDriver = player != null && isProtectedControlAuthorized(player) && shouldActivateDriver(definition);
		if (rollingStock.riddenByEntity == null && (activateDriver || hasControllingSeat() == false))
		{
			int previousDirectSeatIndex = seatManager.getDirectSeatIndex();
			seatManager.setDirectSeatIndex(seatIndex);
			rider.mountEntity(rollingStock);
			if (rider.ridingEntity != rollingStock)
			{
				seatManager.setDirectSeatIndex(previousDirectSeatIndex);
				return false;
			}
		}
		else
		{
			EntityPassengerSeat passengerSeat = seatManager.createProxy(seatIndex);
			if (passengerSeat == null)
			{
				return false;
			}
			rider.mountEntity(passengerSeat);
			if (rider.ridingEntity != passengerSeat)
			{
				passengerSeat.setDead();
				return false;
			}
		}
		if (activateDriver)
		{
			seatManager.setActiveControlSeat(seatIndex, definition.getControlStationId());
		}
		stateSync.synchronizeIfChanged();
		return true;
	}

	public boolean isSeatAvailable(int seatIndex)
	{
		return seatIndex >= 0 && seatIndex < rollingStock.getSeatCount()
				&& seatManager.isOccupied(seatIndex) == false;
	}

	/** Moves an existing occupant transactionally, restoring the prior mount when remounting fails. */
	public boolean movePassengerToSeat(EntityPlayer player, int targetSeatIndex)
	{
		if (player == null || rollingStock.worldObj.isRemote || seatManager.containsPassenger(player) == false
				|| isSeatAvailable(targetSeatIndex) == false)
		{
			return false;
		}
		int previousSeatIndex = seatManager.getSeatIndex(player);
		if (previousSeatIndex < 0 || previousSeatIndex == targetSeatIndex)
		{
			return false;
		}

		boolean wasActiveDriver = rollingStock.isActiveDriver(player);
		int previousActiveSeatIndex = seatManager.getActiveControlSeatIndex();
		String previousActiveStationId = seatManager.getActiveControlStationId();
		EntityPassengerSeat oldProxy = player.ridingEntity instanceof EntityPassengerSeat
				? (EntityPassengerSeat) player.ridingEntity : null;
		player.mountEntity(null);
		if (wasActiveDriver)
		{
			seatManager.clearActiveControlSeat();
			rollingStock.clearTransientControlInput();
		}
		if (oldProxy == null)
		{
			seatManager.setDirectSeatIndex(-1);
		}

		if (mountPassengerAt(player, targetSeatIndex))
		{
			SeatDefinition targetDefinition = rollingStock.getSeatDefinition(targetSeatIndex);
			// Moving the current driver preserves authority across cab stations.
			if (wasActiveDriver && targetDefinition.hasFunction(SeatFunction.DRIVE)
					&& isProtectedControlAuthorized(player))
			{
				seatManager.setActiveControlSeat(targetSeatIndex, targetDefinition.getControlStationId());
			}
			if (oldProxy != null)
			{
				oldProxy.setDead();
			}
			stateSync.synchronizeIfChanged();
			return true;
		}

		boolean restored;
		if (oldProxy == null)
		{
			seatManager.setDirectSeatIndex(previousSeatIndex);
			player.mountEntity(rollingStock);
			restored = player.ridingEntity == rollingStock;
		}
		else
		{
			player.mountEntity(oldProxy);
			restored = player.ridingEntity == oldProxy;
		}
		if (restored)
		{
			seatManager.setActiveControlSeat(previousActiveSeatIndex, previousActiveStationId);
		}
		else if (oldProxy == null)
		{
			seatManager.setDirectSeatIndex(-1);
			if (wasActiveDriver)
			{
				seatManager.clearActiveControlSeat();
			}
		}
		else
		{
			oldProxy.setDead();
		}
		stateSync.synchronizeIfChanged();
		return false;
	}

	/** Hands controls to another driver or lets a proxy-mounted driver take an eligible cab. */
	public boolean transferControls(EntityPlayer requester, int targetSeatIndex)
	{
		if (requester == null || rollingStock.worldObj.isRemote
				|| seatManager.containsPassenger(requester) == false || isProtectedControlAuthorized(requester) == false)
		{
			return false;
		}
		SeatDefinition targetDefinition = rollingStock.getSeatDefinition(targetSeatIndex);
		Entity targetOccupant = seatManager.getOccupant(targetSeatIndex);
		if ((targetOccupant instanceof EntityPlayer) == false || targetDefinition == null
				|| targetDefinition.hasFunction(SeatFunction.DRIVE) == false || targetOccupant.isDead
				|| seatManager.getSeatIndex(targetOccupant) != targetSeatIndex)
		{
			return false;
		}
		if (rollingStock.isProtectedControlAuthorized((EntityPlayer) targetOccupant) == false)
		{
			return false;
		}

		boolean requesterIsActiveDriver = rollingStock.isActiveDriver(requester);
		boolean handingOver = requesterIsActiveDriver && targetOccupant != requester;
		boolean takingControls = requesterIsActiveDriver == false && targetOccupant == requester;
		if (handingOver == false && takingControls == false)
		{
			return false;
		}

		boolean activeDriverPresent = rollingStock.getActiveDriver() != null;
		String targetStation = targetDefinition.getControlStationId();
		boolean changingCab = seatManager.getActiveControlStationId().length() > 0
				&& seatManager.getActiveControlStationId().equals(targetStation) == false;
		if (((handingOver && changingCab) || (takingControls && (activeDriverPresent || changingCab)))
				&& rollingStock.parkingBrake == false)
		{
			return false;
		}

		rollingStock.clearTransientControlInput();
		seatManager.setActiveControlSeat(targetSeatIndex, targetStation);
		stateSync.synchronizeIfChanged();
		return true;
	}

	/** Applies the emergency latch from any occupied seat carrying that function. */
	public boolean applyEmergencyBrake(EntityPlayer player)
	{
		SeatDefinition definition = rollingStock.getSeatDefinition(seatManager.getSeatIndex(player));
		if (rollingStock.worldObj.isRemote || seatManager.isEmergencyBrakeApplied() || definition == null
				|| definition.hasFunction(SeatFunction.EMERGENCY_BRAKE) == false)
		{
			return false;
		}
		seatManager.setEmergencyBrakeApplied(true);
		stateSync.synchronizeIfChanged();
		return true;
	}

	/** Resets the emergency latch only at a stop and with current control authority. */
	public boolean resetEmergencyBrake(EntityPlayer player)
	{
		SeatDefinition definition = rollingStock.getSeatDefinition(seatManager.getSeatIndex(player));
		boolean permitted = isProtectedControlAuthorized(player)
				&& (rollingStock.isActiveDriver(player) || (definition != null && definition.isCabSeat()));
		if (rollingStock.worldObj.isRemote || seatManager.isEmergencyBrakeApplied() == false
				|| Math.abs(rollingStock.getSpeed()) >= EMERGENCY_RESET_SPEED_LIMIT || permitted == false)
		{
			return false;
		}
		seatManager.setEmergencyBrakeApplied(false);
		stateSync.synchronizeIfChanged();
		return true;
	}

	/** Lets authorized backup cab crew secure an uncontrolled train below the established speed limit. */
	public boolean applyParkingBrakeFromSeat(EntityPlayer player)
	{
		SeatDefinition definition = rollingStock.getSeatDefinition(seatManager.getSeatIndex(player));
		if (rollingStock.worldObj.isRemote || rollingStock.parkingBrake
				|| seatManager.getActiveControlSeatIndex() >= 0 || definition == null
				|| definition.isCabSeat() == false
				|| isProtectedControlAuthorized(player) == false
				|| Math.abs(rollingStock.getSpeed()) >= PARKING_BRAKE_SPEED_LIMIT)
		{
			return false;
		}
		rollingStock.parkingBrake = true;
		rollingStock.isBraking = true;
		rollingStock.getDataWatcher().updateObject(30, "true");
		return true;
	}

	public boolean isProtectedControlAuthorized(EntityPlayer player)
	{
		if (player == null || rollingStock.getTrainLockedFromPacket() == false)
		{
			return player != null;
		}
		String playerName = player.getDisplayName();
		return playerName.equalsIgnoreCase(rollingStock.getTransportOwner())
				|| rollingStock.isPlayerTrusted(playerName);
	}

	private boolean shouldActivateDriver(SeatDefinition definition)
	{
		if (definition == null || definition.hasFunction(SeatFunction.DRIVE) == false
				|| rollingStock.getActiveDriver() != null)
		{
			return false;
		}
		String station = definition.getControlStationId();
		return seatManager.getActiveControlStationId().length() == 0
				|| seatManager.getActiveControlStationId().equals(station) || rollingStock.parkingBrake;
	}

	private boolean canPlayerBoard(EntityPlayer player)
	{
		if (rollingStock.getTrainLockedFromPacket() == false
				|| rollingStock.canSeatPassengerBoardWhileLocked())
		{
			return true;
		}
		return isProtectedControlAuthorized(player);
	}

	private boolean hasControllingSeat()
	{
		for (int seatIndex = 0; seatIndex < rollingStock.getSeatCount(); seatIndex++)
		{
			SeatDefinition definition = rollingStock.getSeatDefinition(seatIndex);
			if (definition != null && definition.hasFunction(SeatFunction.DRIVE))
			{
				return true;
			}
		}
		return false;
	}

}
