package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.Traincraft;
import train.common.core.network.PacketSyncBannedItems;

public class PlayerSyncHandler
{
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
    {
        if ((event.player instanceof EntityPlayerMP) == false)
        {
            return;
        }

        EntityPlayerMP player = (EntityPlayerMP) event.player;

        Traincraft.BannedItems_CHANNEL.sendTo(
                new PacketSyncBannedItems(ItemHandler.BANNED_ITEMS, ItemHandler.getNonemptyBannedItems(),
                        ItemHandler.getContainerContentsRules()),
                player
        );
    }
}
