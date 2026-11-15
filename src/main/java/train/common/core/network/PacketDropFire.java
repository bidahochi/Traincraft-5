package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.api.EntityRollingStock;
import train.common.seats.RollingStockSeatManager;
import train.common.api.SteamTrain;

public class PacketDropFire implements IMessage {

    /** The key that was pressed. */
    //Boolean LocoOn;
    int	entityID;
    public PacketDropFire() {}

    public PacketDropFire(int trainEntity) {

        //this.LocoOn = LocoOn;
        this.entityID = trainEntity;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {

        //this.LocoOn = bbuf.readBoolean();
        this.entityID = bbuf.readInt();
    }

    @Override
    public void toBytes(ByteBuf bbuf) {

        //bbuf.writeBoolean(this.LocoOn);
        bbuf.writeInt(this.entityID);
    }

    public static class Handler implements IMessageHandler<PacketDropFire, IMessage> {

        @Override
        public IMessage onMessage(PacketDropFire message, MessageContext context)
        {

            EntityPlayerMP player = context.getServerHandler().playerEntity;
            EntityRollingStock stock = RollingStockSeatManager.getRidingStock(player);
            if ((stock instanceof SteamTrain) == false
                    || stock.canOperateControls(player) == false
                    || stock.getEntityId() != message.entityID)
            {
                return null;
            }
            ((SteamTrain) stock).fuelTrain = 0;

            return null;
        }
    }
}
