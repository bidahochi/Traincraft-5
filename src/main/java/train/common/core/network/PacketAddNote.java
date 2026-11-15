package train.common.core.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import train.common.api.AbstractControlCar;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;

import java.nio.charset.StandardCharsets;

public class PacketAddNote implements IMessage {
    private int entity;
    private String note;

    public PacketAddNote() {
    }

    public PacketAddNote(int entity, String note) {
        this.entity = entity;
        this.note = note;
    }

    public void toBytes(ByteBuf bbuf)
    {
        bbuf.writeInt(entity);
        byte[] bytes = note.getBytes(StandardCharsets.UTF_8);
        bbuf.writeInt(bytes.length);
        bbuf.writeBytes(bytes);


    }

    public void fromBytes(ByteBuf bbuf)
    {
        note = null;
        if (bbuf.readableBytes() < 8)
        {
            return;
        }
        entity = bbuf.readInt();
        int length = bbuf.readInt();
        if (length < 0 || length > 32767 || length > bbuf.readableBytes())
        {
            return;
        }
        note = bbuf.toString(bbuf.readerIndex(), length, StandardCharsets.UTF_8);
        bbuf.skipBytes(length);


    }

    public static class Handler implements IMessageHandler<PacketAddNote, IMessage> {

        @Override
        public IMessage onMessage(PacketAddNote message, MessageContext context)
        {

            if (message.note == null)
            {
                return null;
            }
            EntityPlayer player = context.getServerHandler().playerEntity;
            Entity entity = player.worldObj.getEntityByID(message.entity);
            if ((entity instanceof EntityRollingStock) == false || entity.isDead)
            {
                return null;
            }
            EntityRollingStock stock = (EntityRollingStock) entity;
            if (stock.isProtectedControlAuthorized(player) == false)
            {
                return null;
            }
            if (stock instanceof Locomotive)
            {
                if (stock.isActiveDriver(player) == false)
                {
                    return null;
                }
            }
            else if (stock instanceof AbstractControlCar)
            {
                if (player.ridingEntity != stock || stock.riddenByEntity != player)
                {
                    return null;
                }
            }
            else
            {
                if (player.getDistanceSqToEntity(stock) > 64 || player.openContainer == null)
                {
                    return null;
                }
                // Freight notes belong to the inventory the server actually opened.
                boolean hasStockInventory = false;
                for (Object entry : player.openContainer.inventorySlots)
                {
                    if (((Slot) entry).inventory == stock)
                    {
                        hasStockInventory = true;
                        break;
                    }
                }
                if (hasStockInventory == false)
                {
                    return null;
                }
            }
            stock.getDataWatcher().updateObject(31, message.note);
            stock.trainNote = message.note;
            return null;
        }
    }
}
