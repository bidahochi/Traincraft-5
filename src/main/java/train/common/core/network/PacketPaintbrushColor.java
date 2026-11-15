package train.common.core.network;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.EntityRollingStock;
import train.common.api.SteamTrain;
import train.common.core.network.lockout.PacketPaintBrushClientSideUpdate;
import train.common.items.ItemPaintbrushThing;
import train.common.utils.lockout.ILockoutGroup;

public class PacketPaintbrushColor implements IMessage {

    private static final double FIRING_CHANGE_REACH_SQUARED = 16.0D * 16.0D;

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
    public static class Handler implements IMessageHandler<PacketPaintbrushColor, IMessage>
    {
        @Override
        public IMessage onMessage(PacketPaintbrushColor message, MessageContext context)
        {
            NetHandlerPlayServer connection = context.getServerHandler();
            EntityPlayerMP player = connection.playerEntity;
            World world = player.worldObj;
            int entityId = message.entityID;
            int color = message.paintbrushColor;
            Entity entity = world.getEntityByID(entityId);
            if ((entity instanceof EntityRollingStock) == false)
            {
                return null;
            }
            if (entity instanceof SteamTrain)
            {
                SteamTrain locomotive = (SteamTrain) entity;
                // Its current firing mode and service slots are only checked on the server thread.
                Runnable repaint = () -> applyFiringRepaint(connection, player, world, entityId, locomotive, color);
                boolean deferred = locomotive.deferFiringRepaint(repaint);
                if (deferred)
                {
                    return null;
                }
            }
            applyPaint(player, (EntityRollingStock) entity, color);
            return null;
        }

        private static void applyFiringRepaint(NetHandlerPlayServer connection, EntityPlayerMP player, World world,
                                               int entityId, SteamTrain locomotive, int color)
        {
            if (connection.playerEntity != player || connection.netManager.isChannelOpen() == false
                    || player.isDead || player.worldObj != world || locomotive.worldObj != world
                    || locomotive.isDead || world.getEntityByID(entityId) != locomotive)
            {
                return;
            }
            int colorIndex = locomotive.acceptedColors.indexOf(color);
            if (colorIndex < 0 && locomotive.acceptedColors.isEmpty() == false)
            {
                return;
            }
            if (canPaintLivery(player, locomotive, colorIndex) == false)
            {
                return;
            }
            if (locomotive.supportsFiringType(color, locomotive.firingType()) == false)
            {
                ItemStack heldItem = player.getHeldItem();
                if (heldItem == null || (heldItem.getItem() instanceof ItemPaintbrushThing) == false
                        || player.getDistanceSqToEntity(locomotive) > FIRING_CHANGE_REACH_SQUARED)
                {
                    return;
                }
            }
            boolean repainted = locomotive.repaint(player, color);
            if (repainted)
            {
                broadcastPaint(locomotive, locomotive.getColor());
            }
        }

        private static void applyPaint(EntityPlayerMP player, EntityRollingStock stock, int color)
        {
            if (canPaintLivery(player, stock, stock.acceptedColors.indexOf(color)))
            {
                stock.setColor(color);
                broadcastPaint(stock, color);
            }
        }

        private static boolean canPaintLivery(EntityPlayerMP player, EntityRollingStock stock, int colorIndex)
        {
            ILockoutGroup lockoutGroup = stock.lockoutMap.get(colorIndex);
            if (lockoutGroup == null
                    || Traincraft.lockoutPermissionsUtil.IsUserMemberOfGroup(player.getUniqueID(), lockoutGroup.name()))
            {
                return true;
            }
            player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "Lockout:"
                    + EnumChatFormatting.GRAY + " You must be a member of [" + lockoutGroup.name() + "]"));
            return false;
        }

        private static void broadcastPaint(EntityRollingStock stock, int color)
        {
            if (stock.acceptsOverlayTextures())
            {
                stock.getOverlayTextureContainer().markForUpdate();
            }
            Traincraft.paintbrushColorChannel.sendToAllAround(
                    new PacketPaintBrushClientSideUpdate(color, stock.getEntityId()),
                    new NetworkRegistry.TargetPoint(stock.dimension, stock.posX, stock.posY, stock.posZ, 16D));
        }
    }

}
