package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import train.common.api.IRollingStockLightControls;
import train.common.api.RollingStockHeadlightLevel;
import train.common.api.RollingStockLightChannel;

/**
 * Client-to-server request to change one rolling-stock lighting control.
 * The wire format is an entity id followed by a control byte and value byte. Front/rear
 * values are headlight ordinals {@code 0..2}; named circuits accept {@code 0} or {@code 1}.
 * The server validates ranges, resolves interaction authority through
 * {@link ServerLightActionQueue}, and applies the mutation on the server thread.
 */
public class PacketRollingStockLightState implements IMessage
{
    /** Stable wire identifiers; changing their numeric values breaks protocol compatibility. */
    public static final byte FRONT = 0, REAR = 1, AUX = 2, GYRA = 3, DITCH = 4, BEACON = 5;
    private int entityId;
    private byte control, value;

    /** Required by the network decoder before {@link #fromBytes(ByteBuf)} populates fields. */
    public PacketRollingStockLightState() {}

    /** Creates a validated-on-receipt control request for the target entity. */
    public PacketRollingStockLightState(int entityId, byte control, byte value)
    {
        this.entityId = entityId;
        this.control = control;
        this.value = value;
    }

    @Override
    public void fromBytes(ByteBuf b)
    {
        entityId = b.readInt();
        control = b.readByte();
        value = b.readByte();
    }

    @Override
    public void toBytes(ByteBuf b)
    {
        b.writeInt(entityId);
        b.writeByte(control);
        b.writeByte(value);
    }

    /** Validates untrusted payloads and queues authorized server-thread mutations. */
    public static class Handler implements IMessageHandler<PacketRollingStockLightState, IMessage>
    {
        @Override
        public IMessage onMessage(PacketRollingStockLightState m, MessageContext c)
        {
            if ((m.control == FRONT || m.control == REAR) && (m.value < 0 || m.value > 2))
            {
                return null;
            }
            if (m.control < FRONT || m.control > BEACON)
            {
                return null;
            }
            if (m.control >= AUX && (m.value < 0 || m.value > 1))
            {
                return null;
            }
            final byte control = m.control, value = m.value;
            ServerLightActionQueue.enqueue(
                c.getServerHandler().playerEntity,
                m.entityId,
                new ServerLightActionQueue.Action()
            {
                public void apply(IRollingStockLightControls lights)
                {
                    if (control == FRONT || control == REAR)
                    {
                        RollingStockHeadlightLevel level =
                            RollingStockHeadlightLevel.fromOrdinal(value);
                        if (control == FRONT)
                        {
                            lights.setFrontHeadlightLevel(level);
                        }
                        else
                        {
                            lights.setRearHeadlightLevel(level);
                        }
                        return;
                    }
                    RollingStockLightChannel channel =
                        control == AUX
                        ? RollingStockLightChannel.AUX
                        : control == GYRA
                        ? RollingStockLightChannel.GYRA
                        : control == DITCH
                        ? RollingStockLightChannel.DITCH
                        : RollingStockLightChannel.BEACON;
                    lights.setLightChannelEnabled(channel, value != 0);
                }
            });
            return null;
        }
    }
}
