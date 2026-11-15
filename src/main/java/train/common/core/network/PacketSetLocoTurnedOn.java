package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.api.EntityRollingStock;
import train.common.seats.RollingStockSeatManager;
import train.common.api.Locomotive;

public class PacketSetLocoTurnedOn implements IMessage {

    /** The key that was pressed. */
    Boolean LocoOn;
    public PacketSetLocoTurnedOn() {}

    public PacketSetLocoTurnedOn(Boolean LocoOn) {

        this.LocoOn = LocoOn;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        this.LocoOn = bbuf.readBoolean();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        bbuf.writeBoolean(this.LocoOn);
    }

    public static class Handler implements IMessageHandler<PacketSetLocoTurnedOn, IMessage> {

        @Override
        public IMessage onMessage(PacketSetLocoTurnedOn message, MessageContext context)
        {

            EntityPlayerMP player = context.getServerHandler().playerEntity;
            EntityRollingStock stock = RollingStockSeatManager.getRidingStock(player);
            if ((stock instanceof Locomotive) == false
                    || stock.canOperateControls(player) == false)
            {
                return null;
            }
            ((Locomotive) stock).setLocoTurnedOnFromPacket(message.LocoOn);

            return null;
        }
    }
}
