package train.common.core.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.core.network.lockout.PacketPaintBrushClientSideUpdate;
import train.common.utils.lockout.ILockoutGroup;

public class PacketPaintbrushColor implements IMessage {

    int paintbrushColor;
    int	entityID;
    public PacketPaintbrushColor() {} // DO NOT REMOVE THE BLANK CONSTRUCTOR. Forge will get EXTREMELY angry.
    public PacketPaintbrushColor(int paintbrushColor, int trainEntity) {
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
    public static class Handler implements IMessageHandler<PacketPaintbrushColor, IMessage> {
        @Override
        public IMessage onMessage(PacketPaintbrushColor message, MessageContext context) {
            Entity rollingStockEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
            if (rollingStockEntity instanceof EntityRollingStock)
            {
                int convertedColor = ((EntityRollingStock) rollingStockEntity).acceptedColors.indexOf(message.paintbrushColor);
                ILockoutGroup lockoutGroup = ((EntityRollingStock) rollingStockEntity).lockoutMap.get(convertedColor);

                if (lockoutGroup == null || Traincraft.lockoutPermissionsUtil.IsUserMemberOfGroup(context.getServerHandler().playerEntity.getUniqueID(), lockoutGroup.name()))
                {

                    ((EntityRollingStock) rollingStockEntity).setColor(message.paintbrushColor);
                    // Send message to all players within 16 chunks of the rolling stock entity.
                    Traincraft.paintbrushColorChannel.sendToAllAround(new PacketPaintBrushClientSideUpdate(message.paintbrushColor, rollingStockEntity.getEntityId()), new NetworkRegistry.TargetPoint(rollingStockEntity.dimension, rollingStockEntity.posX, rollingStockEntity.posY, rollingStockEntity.posZ, 16D));
                }
                else
                {
                    context.getServerHandler().playerEntity.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Lockout:" + EnumChatFormatting.GRAY + " You must be a member of [" + lockoutGroup.name() + "]"));
                }
            }
            return null;
        }
    }
}