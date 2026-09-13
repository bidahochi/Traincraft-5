package train.common.core.network;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.entity.player.EntityPlayerMP;
import train.common.api.IRollingStockLightControls;

/** Moves SimpleImpl callbacks from Netty onto the authoritative server thread. */
public final class ServerLightActionQueue
{
    public static final ServerLightActionQueue INSTANCE = new ServerLightActionQueue();
    private static final Queue<Pending> QUEUE = new ConcurrentLinkedQueue<Pending>();

    private ServerLightActionQueue() {}

    /** Queues an untrusted Netty request for resolution and authorization on the server tick. */
    public static void enqueue(EntityPlayerMP player, int entityId, Action action)
    {
        if (player != null && action != null)
        {
            QUEUE.add(new Pending(player, entityId, action));
        }
    }

    @SubscribeEvent
    public void serverTick(TickEvent.ServerTickEvent event)
    {
        if (event.phase != TickEvent.Phase.START)
        {
            return;
        }
        Pending pending;
        while ((pending = QUEUE.poll()) != null)
        {
            IRollingStockLightControls controls =
                RollingStockLightPacketAccess.resolve(pending.player, pending.entityId);
            if (controls != null)
            {
                pending.action.apply(controls);
            }
        }
    }

    /** Server-thread mutation applied only after the player may control the target stock. */
    public interface Action
    {
        void apply(IRollingStockLightControls controls);
    }

    private static final class Pending
    {
        final EntityPlayerMP player;
        final int entityId;
        final Action action;

        Pending(EntityPlayerMP p, int id, Action a)
        {
            player = p;
            entityId = id;
            action = a;
        }
    }
}
