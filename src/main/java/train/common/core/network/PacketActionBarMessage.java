package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;

/** Transfers a short action-bar message from the server to one client. */
public final class PacketActionBarMessage implements IMessage
{
	private String message;
	private int durationTicks;

	public PacketActionBarMessage()
	{
	}

	/**
	 * Creates an action-bar message packet.
	 *
	 * @param message message text, including any Minecraft formatting codes
	 * @param durationTicks display duration in client ticks
	 */
	public PacketActionBarMessage(String message, int durationTicks)
	{
		this.message = message;
		this.durationTicks = durationTicks;
	}

	@Override
	public void fromBytes(ByteBuf buffer)
	{
		message = ByteBufUtils.readUTF8String(buffer);
		durationTicks = buffer.readUnsignedShort();
	}

	@Override
	public void toBytes(ByteBuf buffer)
	{
		ByteBufUtils.writeUTF8String(buffer, message);
		buffer.writeShort(durationTicks);
	}

	/** Delegates action-bar display through the sided proxy. */
	public static final class Handler implements IMessageHandler<PacketActionBarMessage, IMessage>
	{
		@Override
		public IMessage onMessage(PacketActionBarMessage packet, MessageContext context)
		{
			Traincraft.proxy.displayActionBarMessage(packet.message, packet.durationTicks);
			return null;
		}
	}
}
