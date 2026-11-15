package train.common.core.network;

import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

/** Validates and executes seat packets on Forge 1.7.10's game-thread callback. */
public final class SeatPacketRequestHandler
{
	private static final double MAX_BOARDING_DISTANCE_SQUARED = 64.0D;
	private static final int MOVEMENT_INTERVAL_TICKS = 4;
	private static final int GUI_INTERVAL_TICKS = 10;
	private static final Map<EntityPlayerMP, AdmissionState> ADMISSION_STATES =
			new WeakHashMap<EntityPlayerMP, AdmissionState>();

	/** Stable wire actions supported by the shared seat packet. */
	public enum Action
	{
		OPEN(0, false),
		SELECT(1, true),
		AUTO(3, true),
		MOVE(4, true),
		TRANSFER(5, true),
		EMERGENCY_APPLY(6, true),
		EMERGENCY_RESET(7, true),
		PARKING_APPLY(8, true),
		SYNC_CONTROL_STATE(9, false),
		REOPEN_ROLLING_STOCK_GUI(10, true),
		LIVESTOCK_BOARDING(11, true);

		private final byte wireId;
		private final boolean serverRequest;

		private Action(int wireId, boolean serverRequest)
		{
			this.wireId = (byte) wireId;
			this.serverRequest = serverRequest;
		}

		public byte getWireId()
		{
			return wireId;
		}

		public boolean isServerRequest()
		{
			return serverRequest;
		}

		/** Resolves a stable wire ID, returning {@code null} for unsupported input. */
		public static Action fromWireId(byte wireId)
		{
			for (Action action : values())
			{
				if (action.wireId == wireId)
				{
					return action;
				}
			}
			return null;
		}
	}

	private SeatPacketRequestHandler()
	{
	}

	public static void handleServer(EntityPlayerMP player, int rollingStockEntityId, int seatIndex, Action action)
	{
		if (player == null || player.isDead || player.worldObj == null || action == null
				|| action.isServerRequest() == false || admit(player, action) == false)
		{
			return;
		}
		Entity entity = player.worldObj.getEntityByID(rollingStockEntityId);
		if ((entity instanceof EntityRollingStock) == false)
		{
			return;
		}
		EntityRollingStock rollingStock = (EntityRollingStock) entity;
		boolean onboard = rollingStock.isPassengerOfThis(player);
		switch (action)
		{
			case LIVESTOCK_BOARDING:
				if (seatIndex == 0 || seatIndex == 1)
				{
					rollingStock.setLivestockBoardingEnabled(player, seatIndex == 1);
				}
				break;
			case SELECT:
				if (onboard == false && player.getDistanceSqToEntity(entity) <= MAX_BOARDING_DISTANCE_SQUARED)
				{
					rollingStock.mountPassengerAt(player, seatIndex);
				}
				break;
			case AUTO:
				if (onboard)
				{
					rollingStock.movePassengerToNearestSeat(player);
				}
				else if (player.getDistanceSqToEntity(entity) <= MAX_BOARDING_DISTANCE_SQUARED)
				{
					rollingStock.mountNearestPassenger(player);
				}
				break;
			case MOVE:
				if (onboard)
				{
					rollingStock.movePassengerToSeat(player, seatIndex);
				}
				break;
			case TRANSFER:
				if (onboard)
				{
					rollingStock.transferControls(player, seatIndex);
				}
				break;
			case EMERGENCY_APPLY:
				if (onboard)
				{
					rollingStock.applyEmergencyBrake(player);
				}
				break;
			case EMERGENCY_RESET:
				if (onboard)
				{
					rollingStock.resetEmergencyBrake(player);
				}
				break;
			case PARKING_APPLY:
				if (onboard)
				{
					rollingStock.applyParkingBrakeFromSeat(player);
				}
				break;
			case REOPEN_ROLLING_STOCK_GUI:
				if (onboard && rollingStock.isActiveDriver(player))
				{
					if (rollingStock instanceof Locomotive)
					{
						((Locomotive) rollingStock).keyHandlerFromPacket(7, player);
						break;
					}
					rollingStock.keyHandlerFromPacket(7);
				}
				break;
			default:
				break;
		}
	}

	public static void handleClient(int rollingStockEntityId, int directSeatIndex, int activeSeatIndex,
			String activeStation, boolean emergencyBrake, Action action)
	{
		if (action == null || action.isServerRequest())
		{
			return;
		}
		switch (action)
		{
			case OPEN:
				Traincraft.proxy.openSeatSelection(rollingStockEntityId);
				break;
			case SYNC_CONTROL_STATE:
				Traincraft.proxy.syncSeatControlState(rollingStockEntityId, directSeatIndex,
						activeSeatIndex, activeStation, emergencyBrake);
				break;
			default:
				break;
		}
	}

	private static boolean admit(EntityPlayerMP player, Action action)
	{
		long currentTick = player.worldObj.getTotalWorldTime();
		AdmissionState state = ADMISSION_STATES.get(player);
		if (state == null)
		{
			state = new AdmissionState();
			ADMISSION_STATES.put(player, state);
		}
		switch (action)
		{
			case SELECT:
			case AUTO:
			case MOVE:
			case TRANSFER:
				if (hasIntervalElapsed(currentTick, state.lastMovementTick, MOVEMENT_INTERVAL_TICKS) == false)
				{
					return false;
				}
				state.lastMovementTick = currentTick;
				return true;
			case REOPEN_ROLLING_STOCK_GUI:
				if (hasIntervalElapsed(currentTick, state.lastGuiTick, GUI_INTERVAL_TICKS) == false)
				{
					return false;
				}
				state.lastGuiTick = currentTick;
				return true;
			default:
				return true;
		}
	}

	private static boolean hasIntervalElapsed(long currentTick, long previousTick, int interval)
	{
		return previousTick == Long.MIN_VALUE || currentTick < previousTick || currentTick - previousTick >= interval;
	}

	private static final class AdmissionState
	{
		private long lastMovementTick = Long.MIN_VALUE;
		private long lastGuiTick = Long.MIN_VALUE;
	}
}
