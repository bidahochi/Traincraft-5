package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.api.EntityRollingStock;
import train.common.core.network.SeatPacketRequestHandler.Action;

public final class PacketSeatSelection implements IMessage
{
	private Action action;
	private int rollingStockEntityId;
	private int seatIndex;
	private int activeSeatIndex = -1;
	private String activeStation = "";
	private boolean emergencyBrake;

	public PacketSeatSelection()
	{
	}

	private PacketSeatSelection(Action action, int rollingStockEntityId, int seatIndex)
	{
		this.action = action;
		this.rollingStockEntityId = rollingStockEntityId;
		this.seatIndex = seatIndex;
	}

	private PacketSeatSelection(Action action, EntityRollingStock rollingStock)
	{
		this(action, rollingStock.getEntityId(), rollingStock.getDirectSeatIndex());
		activeSeatIndex = rollingStock.getActiveControlSeatIndex();
		activeStation = rollingStock.getActiveControlStationId();
		emergencyBrake = rollingStock.isEmergencyBrakeApplied();
	}

	public static PacketSeatSelection open(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.OPEN, rollingStock.getEntityId(), -1);
	}

	public static PacketSeatSelection select(EntityRollingStock rollingStock, int seatIndex)
	{
		return new PacketSeatSelection(Action.SELECT, rollingStock.getEntityId(), seatIndex);
	}

	public static PacketSeatSelection auto(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.AUTO, rollingStock.getEntityId(), -1);
	}

	public static PacketSeatSelection move(EntityRollingStock rollingStock, int seatIndex)
	{
		return new PacketSeatSelection(Action.MOVE, rollingStock.getEntityId(), seatIndex);
	}

	public static PacketSeatSelection transfer(EntityRollingStock rollingStock, int seatIndex)
	{
		return new PacketSeatSelection(Action.TRANSFER, rollingStock.getEntityId(), seatIndex);
	}

	public static PacketSeatSelection applyEmergency(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.EMERGENCY_APPLY, rollingStock.getEntityId(), -1);
	}

	public static PacketSeatSelection resetEmergency(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.EMERGENCY_RESET, rollingStock.getEntityId(), -1);
	}

	public static PacketSeatSelection applyParking(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.PARKING_APPLY, rollingStock.getEntityId(), -1);
	}

	public static PacketSeatSelection setLivestockBoarding(EntityRollingStock rollingStock, boolean enabled)
	{
		return new PacketSeatSelection(Action.LIVESTOCK_BOARDING, rollingStock.getEntityId(), enabled ? 1 : 0);
	}

	public static PacketSeatSelection reopenRollingStockGui(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.REOPEN_ROLLING_STOCK_GUI, rollingStock.getEntityId(), -1);
	}

	public static PacketSeatSelection syncControlState(EntityRollingStock rollingStock)
	{
		return new PacketSeatSelection(Action.SYNC_CONTROL_STATE, rollingStock);
	}

	@Override
	public void fromBytes(ByteBuf buffer)
	{
		action = Action.fromWireId(buffer.readByte());
		rollingStockEntityId = buffer.readInt();
		seatIndex = buffer.readInt();
		if (action == Action.SYNC_CONTROL_STATE)
		{
			activeSeatIndex = buffer.readInt();
			activeStation = ByteBufUtils.readUTF8String(buffer);
			emergencyBrake = buffer.readBoolean();
		}
	}

	@Override
	public void toBytes(ByteBuf buffer)
	{
		buffer.writeByte(action.getWireId());
		buffer.writeInt(rollingStockEntityId);
		buffer.writeInt(seatIndex);
		if (action == Action.SYNC_CONTROL_STATE)
		{
			buffer.writeInt(activeSeatIndex);
			ByteBufUtils.writeUTF8String(buffer, activeStation);
			buffer.writeBoolean(emergencyBrake);
		}
	}

	public static final class Handler implements IMessageHandler<PacketSeatSelection, IMessage>
	{
		@Override
		public IMessage onMessage(PacketSeatSelection message, MessageContext context)
		{
			if (message.action == null)
			{
				return null;
			}
			if (context.side == Side.SERVER)
			{
				EntityPlayerMP player = context.getServerHandler().playerEntity;
				SeatPacketRequestHandler.handleServer(player, message.rollingStockEntityId,
						message.seatIndex, message.action);
			}
			else
			{
				SeatPacketRequestHandler.handleClient(message.rollingStockEntityId, message.seatIndex,
						message.activeSeatIndex, message.activeStation, message.emergencyBrake, message.action);
			}
			return null;
		}
	}
}
