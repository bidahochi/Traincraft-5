package train.common.core.network.lockout;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import train.common.api.EntityRollingStock;


public class PacketPaintBrushClientSideUpdate implements IMessage
{
    int paintbrushColor;
    int	entityID;
    public PacketPaintBrushClientSideUpdate() {}
    public PacketPaintBrushClientSideUpdate(int paintbrushColor, int trainEntity) {
        this.paintbrushColor = paintbrushColor;
        this.entityID = trainEntity;
    }
    @Override
    public void fromBytes(ByteBuf bbuf) {
        this.paintbrushColor = bbuf.readInt();
        this.entityID = bbuf.readInt();
    }
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(this.paintbrushColor);
        bbuf.writeInt(this.entityID);
    }
    public static class Handler implements IMessageHandler<PacketPaintBrushClientSideUpdate, IMessage> {
        @Override
        public IMessage onMessage(PacketPaintBrushClientSideUpdate message, MessageContext context) {
            Entity entity = Minecraft.getMinecraft().thePlayer.worldObj.getEntityByID(message.entityID);
            if (entity instanceof EntityRollingStock) {
                EntityRollingStock rollingStockEntity = (EntityRollingStock) entity;
                if (rollingStockEntity.acceptsOverlayTextures())
                    rollingStockEntity.getOverlayTextureContainer().markForUpdate();
                rollingStockEntity.setColor(message.paintbrushColor);
            }
            return null;
        }
    }
}
