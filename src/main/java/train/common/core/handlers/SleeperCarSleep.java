package train.common.core.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.network.PacketSleeperCar;
import train.common.core.network.PacketSleeperCar.Status;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Owns transient bunk sessions and counts them alongside vanilla bed sleepers.
 * Only the request queue is shared with the network thread. The server thread
 * validates requests, updates sessions, and clears state on shutdown.
 */
public final class SleeperCarSleep
{
    /** The server tick and packet handler share this listener. */
    public static final SleeperCarSleep INSTANCE = new SleeperCarSleep();
    private static final int OVERWORLD_DIMENSION_ID = 0;
    private static final int SLEEP_TICKS = 100;
    private static final long DAY_TICKS = 24000L;

    private final Queue<Runnable> requests = new ConcurrentLinkedQueue<>();
    private final Map<EntityPlayerMP, Session> sessions = new HashMap<>();

    private SleeperCarSleep()
    {
    }

    /** Queues a sleep or wake request for validation against the player's live mount. */
    public void enqueue(EntityPlayerMP player, int carId, int requestId, boolean sleep)
    {
        requests.add(() -> handleRequest(player, carId, requestId, sleep));
    }

    /** Processes inbound requests before the server checks the world for sleepers. */
    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event)
    {
        if (event.phase != TickEvent.Phase.START)
        {
            return;
        }
        Runnable request = requests.poll();
        while (request != null)
        {
            request.run();
            request = requests.poll();
        }
    }

    /**
     * Authorizes a new bunk session or removes the session identified by a wake request.
     * Repeated starts for the same request leave the original timer running.
     */
    private void handleRequest(EntityPlayerMP player, int carId, int requestId, boolean sleep)
    {
        Session session = sessions.get(player);
        boolean matchingRequest = session != null
                && session.car.getEntityId() == carId && session.requestId == requestId;
        if (sleep == false)
        {
            if (matchingRequest)
            {
                sessions.remove(player);
            }
            return;
        }

        World world = player.worldObj;
        if (matchingRequest || world.playerEntities.contains(player) == false)
        {
            return;
        }

        Entity riddenTransport = player.ridingEntity;
        if (session != null || player.isPlayerSleeping() || world.provider.dimensionId != OVERWORLD_DIMENSION_ID
                || (riddenTransport instanceof AbstractPassengerCar) == false
                || riddenTransport.getEntityId() != carId)
        {
            sendState(player, carId, requestId, Status.UNAVAILABLE);
            return;
        }
        AbstractPassengerCar sleeperCar = (AbstractPassengerCar) riddenTransport;
        if (sleeperCar.hasSleepingBunk() == false || isRidingInWorld(player, sleeperCar, world) == false)
        {
            sendState(player, carId, requestId, Status.UNAVAILABLE);
            return;
        }
        if (world.isDaytime())
        {
            sendState(player, carId, requestId, Status.DAYTIME);
            return;
        }

        sessions.put(player, new Session(sleeperCar, requestId, world.getTotalWorldTime()));
        sendState(player, carId, requestId, Status.SLEEPING);
    }

    /** Checks that both sides of the mount relationship still point to live entities in this world. */
    private static boolean isRidingInWorld(EntityPlayerMP player, AbstractPassengerCar sleeperCar, World world)
    {
        return player.isEntityAlive() && player.worldObj == world && player.ridingEntity == sleeperCar
                && sleeperCar.isDead == false && sleeperCar.worldObj == world && sleeperCar.riddenByEntity == player
                && world.getEntityByID(sleeperCar.getEntityId()) == sleeperCar;
    }

    /** Clears expired sessions and checks the Overworld for a mix of bunk and bed sleepers. */
    @SubscribeEvent
    public void onWorldTick(TickEvent.WorldTickEvent event)
    {
        if (event.phase != TickEvent.Phase.END || sessions.isEmpty()
                || (event.world instanceof WorldServer) == false
                || event.world.provider.dimensionId != OVERWORLD_DIMENSION_ID)
        {
            return;
        }

        WorldServer world = (WorldServer) event.world;
        boolean daytime = world.isDaytime();
        Iterator<Map.Entry<EntityPlayerMP, Session>> iterator = sessions.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<EntityPlayerMP, Session> entry = iterator.next();
            EntityPlayerMP player = entry.getKey();
            Session session = entry.getValue();
            if (daytime || isRidingInWorld(player, session.car, world) == false
                    || world.playerEntities.contains(player) == false)
            {
                iterator.remove();
                sendState(player, session.car.getEntityId(), session.requestId, Status.AWAKE);
            }
        }

        if (sessions.isEmpty())
        {
            return;
        }
        long currentTick = world.getTotalWorldTime();
        for (Object entry : world.playerEntities)
        {
            EntityPlayer player = (EntityPlayer) entry;
            if (player.isPlayerFullyAsleep())
            {
                continue;
            }
            Session session = sessions.get(player);
            if (session == null || currentTick - session.startedAtTick < SLEEP_TICKS)
            {
                return;
            }
        }
        finishNight(world);
    }

    /**
     * Mirrors Forge 1.7.10's successful bed sleep for the world clock, beds, and weather.
     * Bunk sleepers wake by ending their sessions, which preserves their mounts and spawn points.
     */
    private void finishNight(WorldServer world)
    {
        if (world.getGameRules().getGameRuleBooleanValue("doDaylightCycle"))
        {
            long followingDay = world.getWorldTime() + DAY_TICKS;
            long dawn = followingDay - followingDay % DAY_TICKS;
            world.setWorldTime(dawn);
        }
        for (Object entry : world.playerEntities)
        {
            EntityPlayer player = (EntityPlayer) entry;
            if (player.isPlayerSleeping())
            {
                player.wakeUpPlayer(false, false, true);
            }
        }
        world.updateAllPlayersSleepingFlag();
        world.provider.resetRainAndThunder();
        for (Map.Entry<EntityPlayerMP, Session> entry : sessions.entrySet())
        {
            Session session = entry.getValue();
            sendState(entry.getKey(), session.car.getEntityId(), session.requestId, Status.AWAKE);
        }
        sessions.clear();
    }

    /** Removes the departing rider's session before the next sleep check. */
    @SubscribeEvent
    public void onLogout(PlayerEvent.PlayerLoggedOutEvent event)
    {
        sessions.remove(event.player);
    }

    /** Releases transient sessions and queued requests when the server shuts down. */
    public void clear()
    {
        requests.clear();
        sessions.clear();
    }

    private static void sendState(EntityPlayerMP player, int carId, int requestId, Status status)
    {
        Traincraft.modChannel.sendTo(new PacketSleeperCar.State(carId, requestId, status), player);
    }

    private static final class Session
    {
        private final AbstractPassengerCar car;
        private final int requestId;
        private final long startedAtTick;

        private Session(AbstractPassengerCar car, int requestId, long startedAtTick)
        {
            this.car = car;
            this.requestId = requestId;
            this.startedAtTick = startedAtTick;
        }
    }
}
