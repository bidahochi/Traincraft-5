package train.common.core.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;
import train.common.tile.TileTCRail;
import train.common.track.attachment.TrackAttachment;
import train.common.track.attachment.TrackAttachmentPlacement;
import train.common.track.attachment.TrackAttachmentType;
import train.common.track.attachment.TrackAttachmentTypes;

import java.util.ArrayList;
import java.util.List;

/** Synchronizes a rail owner's generic attachment collection without reloading unrelated tile state. */
public final class PacketTrackAttachmentState implements IMessage
{
	private int ownerX;
	private int ownerY;
	private int ownerZ;
	private final List<TrackAttachment> attachments = new ArrayList<TrackAttachment>();

	/** Required empty packet constructor. */
	public PacketTrackAttachmentState()
	{
	}

	/** Captures the attachment state owned by the supplied rail tile. */
	public PacketTrackAttachmentState(TileTCRail owner)
	{
		ownerX = owner.xCoord;
		ownerY = owner.yCoord;
		ownerZ = owner.zCoord;
		attachments.addAll(owner.getTrackAttachments());
	}

	@Override
	public void fromBytes(ByteBuf buffer)
	{
		ownerX = buffer.readInt();
		ownerY = buffer.readInt();
		ownerZ = buffer.readInt();
		int attachmentCount = buffer.readUnsignedShort();
		attachments.clear();
		for (int index = 0; index < attachmentCount; index++)
		{
			TrackAttachmentType type = TrackAttachmentTypes.byId(ByteBufUtils.readUTF8String(buffer));
			TrackAttachmentPlacement placement = new TrackAttachmentPlacement(
					ByteBufUtils.readUTF8String(buffer), buffer.readFloat());
			attachments.add(new TrackAttachment(type, placement,
					buffer.readInt(), buffer.readInt(), buffer.readInt()));
		}
	}

	@Override
	public void toBytes(ByteBuf buffer)
	{
		buffer.writeInt(ownerX);
		buffer.writeInt(ownerY);
		buffer.writeInt(ownerZ);
		buffer.writeShort(attachments.size());
		for (TrackAttachment attachment : attachments)
		{
			ByteBufUtils.writeUTF8String(buffer, attachment.getType().getId());
			ByteBufUtils.writeUTF8String(buffer, attachment.getSlotId());
			buffer.writeFloat(attachment.getYawDegrees());
			buffer.writeInt(attachment.getOffsetX());
			buffer.writeInt(attachment.getOffsetY());
			buffer.writeInt(attachment.getOffsetZ());
		}
	}

	/** Delegates attachment-only updates through the sided proxy. */
	public static final class Handler implements IMessageHandler<PacketTrackAttachmentState, IMessage>
	{
		@Override
		public IMessage onMessage(PacketTrackAttachmentState packet, MessageContext context)
		{
			Traincraft.proxy.applyTrackAttachmentState(packet.ownerX, packet.ownerY, packet.ownerZ,
					packet.attachments);
			return null;
		}
	}
}
