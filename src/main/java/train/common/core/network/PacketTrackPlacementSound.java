package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;

/** Notifies nearby clients of a successful track placement. */
public class PacketTrackPlacementSound implements IMessage
{
	private double x;
	private double y;
	private double z;

	/** Creates an empty packet for Forge decoding. */
	public PacketTrackPlacementSound()
	{
	}

	/**
	 * Creates a placement-sound request at one world position.
	 *
	 * @param x world X coordinate
	 * @param y world Y coordinate
	 * @param z world Z coordinate
	 */
	public PacketTrackPlacementSound(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void fromBytes(ByteBuf buffer)
	{
		x = buffer.readDouble();
		y = buffer.readDouble();
		z = buffer.readDouble();
	}

	@Override
	public void toBytes(ByteBuf buffer)
	{
		buffer.writeDouble(x);
		buffer.writeDouble(y);
		buffer.writeDouble(z);
	}

	/** Delegates placement-sound playback through the sided proxy. */
	public static final class Handler implements IMessageHandler<PacketTrackPlacementSound, IMessage>
	{
		@Override
		public IMessage onMessage(PacketTrackPlacementSound message, MessageContext context)
		{
			Traincraft.proxy.playTrackPlacementSound(message.x, message.y, message.z);
			return null;
		}
	}
}
