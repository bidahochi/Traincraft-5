package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import train.common.tile.TileCrafterTierAbstract;

public class PacketUpdateTCBenchPage implements IMessage {

    private int page;
    private int x, y, z;

    public PacketUpdateTCBenchPage() {}

    public PacketUpdateTCBenchPage(int page, TileEntity tile) {
        this.page = page;
        this.x = tile.xCoord;
        this.y = tile.yCoord;
        this.z = tile.zCoord;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(page);
        buf.writeInt(x);
        buf.writeInt(y);
        buf.writeInt(z);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        page = buf.readInt();
        x = buf.readInt();
        y = buf.readInt();
        z = buf.readInt();
    }

    public static class Handler implements IMessageHandler<PacketUpdateTCBenchPage, IMessage> {

        @Override
        public IMessage onMessage(PacketUpdateTCBenchPage message, MessageContext ctx) {

            EntityPlayerMP player = ctx.getServerHandler().playerEntity;

            TileEntity tile = player.worldObj.getTileEntity(
                    message.x, message.y, message.z);

            if (tile instanceof TileCrafterTierAbstract) {
                ((TileCrafterTierAbstract) tile).setPageNumber(message.page);
            }

            return null;
        }
    }

}
