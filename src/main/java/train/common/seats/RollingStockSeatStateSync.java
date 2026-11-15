package train.common.seats;

import net.minecraft.world.WorldServer;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.PacketSeatSelection;

/** Broadcasts seat-control state only when one of its synchronized values changes. */
public final class RollingStockSeatStateSync
{
	private final EntityRollingStock rollingStock;
	private final RollingStockSeatManager seatManager;
	private int synchronizedDirectSeatIndex = -1;
	private int synchronizedActiveControlSeatIndex = -1;
	private String synchronizedActiveControlStationId = "";
	private boolean synchronizedEmergencyBrakeApplied;

	public RollingStockSeatStateSync(EntityRollingStock rollingStock, RollingStockSeatManager seatManager)
	{
		this.rollingStock = rollingStock;
		this.seatManager = seatManager;
	}

	public void synchronizeIfChanged()
	{
		if (rollingStock.worldObj.isRemote)
		{
			return;
		}
		int directSeatIndex = seatManager.getDirectSeatIndex();
		int activeSeatIndex = seatManager.getActiveControlSeatIndex();
		String activeStationId = seatManager.getActiveControlStationId();
		boolean emergencyBrake = seatManager.isEmergencyBrakeApplied();
		if (synchronizedDirectSeatIndex == directSeatIndex
				&& synchronizedActiveControlSeatIndex == activeSeatIndex
				&& synchronizedActiveControlStationId.equals(activeStationId)
				&& synchronizedEmergencyBrakeApplied == emergencyBrake)
		{
			return;
		}
		WorldServer serverWorld = (WorldServer) rollingStock.worldObj;
		serverWorld.getEntityTracker().func_151248_b(rollingStock,
				Traincraft.modChannel.getPacketFrom(PacketSeatSelection.syncControlState(rollingStock)));
		recordCurrentState();
	}

	/** Records loaded or spawn-synchronized state without emitting a redundant packet. */
	public void recordCurrentState()
	{
		synchronizedDirectSeatIndex = seatManager.getDirectSeatIndex();
		synchronizedActiveControlSeatIndex = seatManager.getActiveControlSeatIndex();
		synchronizedActiveControlStationId = seatManager.getActiveControlStationId();
		synchronizedEmergencyBrakeApplied = seatManager.isEmergencyBrakeApplied();
	}
}
