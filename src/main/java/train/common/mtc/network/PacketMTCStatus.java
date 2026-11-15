package train.common.mtc.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.Traincraft;
import train.common.api.Locomotive;

public class PacketMTCStatus implements IMessage {
    private int entityId;
    private int mtcStatus, mtcType, atoStatus;
    private boolean mtcOverride, overspeedOverride;

    public PacketMTCStatus() {
    }

    public PacketMTCStatus(Locomotive locomotive, int mtcStatus, int mtcType)
    {
        entityId = locomotive.getEntityId();
        this.mtcStatus = mtcStatus;
        this.mtcType = mtcType;
        atoStatus = locomotive.atoStatus;
        mtcOverride = locomotive.mtcOverridePressed;
        overspeedOverride = locomotive.overspeedOveridePressed;
    }

    @Override
    public void fromBytes(ByteBuf buffer)
    {
        entityId = buffer.readInt();
        mtcStatus = buffer.readInt();
        mtcType = buffer.readInt();
        atoStatus = buffer.readInt();
        mtcOverride = buffer.readBoolean();
        overspeedOverride = buffer.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf buffer)
    {
        buffer.writeInt(entityId);
        buffer.writeInt(mtcStatus);
        buffer.writeInt(mtcType);
        buffer.writeInt(atoStatus);
        buffer.writeBoolean(mtcOverride);
        buffer.writeBoolean(overspeedOverride);
    }

    public static class Handler implements IMessageHandler<PacketMTCStatus, IMessage>
    {
        @Override
        public IMessage onMessage(PacketMTCStatus message, MessageContext context)
        {
            Traincraft.proxy.syncMtcState(message.entityId, message.mtcStatus, message.mtcType,
                    message.atoStatus, message.mtcOverride, message.overspeedOverride);
            return null;
        }
    }
}
