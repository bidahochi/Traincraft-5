package train.client.render.lighting;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import train.common.api.EntityRollingStock;
import train.common.api.IRollingStockLightControls;
import train.common.api.RollingStockHeadlightLevel;

/**
 * Collects transient client-side headlight source cells without changing block light data.
 * Every second client tick it selects air cells ahead of nearby eligible stock, resolves
 * collisions deterministically, and reuses primitive tables to avoid per-tick allocation.
 * All state is world-owned and cleared when the observed client world changes.
 */
public final class ClientDynamicHeadlightManager
{
    static final double RANGE_SQUARED = 64.0D * 64.0D;
    static final double BODY_CLEARANCE = 2.5D;
    static final int DIM_LEVEL = 8;
    static final int BRIGHT_LEVEL = 14;
    private static final long NO_CELL = Long.MIN_VALUE;
    private static final ReusableCoordinateTable REQUESTED = new ReusableCoordinateTable();
    private static final ReusableCoordinateTable REQUESTED_DIRECTION_X =
        new ReusableCoordinateTable();
    private static final ReusableCoordinateTable REQUESTED_DIRECTION_Z =
        new ReusableCoordinateTable();
    private static final ReusableCoordinateTable SOURCES = new ReusableCoordinateTable();
    private static final ReusableCoordinateTable SOURCE_DIRECTION_X =
        new ReusableCoordinateTable();
    private static final ReusableCoordinateTable SOURCE_DIRECTION_Z =
        new ReusableCoordinateTable();
    private static long[] orderedKeys = new long[32];
    private static World activeWorld;

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event)
    {
        if (event.phase != TickEvent.Phase.END)
        {
            return;
        }
        Minecraft minecraft = Minecraft.getMinecraft();
        World world = minecraft.theWorld;
        LightingClientLifecycle.observe(world);
        if (world != activeWorld)
        {
            clearAll();
            activeWorld = world;
        }
        if (world == null || minecraft.thePlayer == null)
        {
            SOURCES.clear();
            return;
        }
        if ((world.getTotalWorldTime() & 1L) != 0L || minecraft.isGamePaused())
        {
            return;
        }

        REQUESTED.clear();
        REQUESTED_DIRECTION_X.clear();
        REQUESTED_DIRECTION_Z.clear();
        EntityPlayer player = minecraft.thePlayer;
        for (Object value : world.loadedEntityList)
        {
            if ((value instanceof EntityRollingStock) == false
                    || (value instanceof IRollingStockLightControls) == false)
            {
                continue;
            }
            EntityRollingStock stock = (EntityRollingStock) value;
            IRollingStockLightControls controls = (IRollingStockLightControls) value;
            if (stock.isDead || stock.getDistanceSqToEntity(player) > RANGE_SQUARED)
            {
                continue;
            }
            collect(stock, 1, controls.getFrontHeadlightLevel(), REQUESTED);
            collect(stock, -1, controls.getRearHeadlightLevel(), REQUESTED);
        }
        selectSources(world, REQUESTED, SOURCES);
    }

    private static void collect(
        EntityRollingStock stock,
        int directionSign,
        RollingStockHeadlightLevel brightness,
        ReusableCoordinateTable requested)
    {
        if (brightness == RollingStockHeadlightLevel.OFF
                || ClientRollingStockLighting.hasProjectorFacing(stock, directionSign) == false)
        {
            return;
        }
        int level = brightness == RollingStockHeadlightLevel.BRIGHT ? BRIGHT_LEVEL : DIM_LEVEL;
        double yaw = headingRadians(stock);
        float directionX = (float)(Math.cos(yaw) * directionSign);
        float directionZ = (float)(Math.sin(yaw) * directionSign);
        putRequest(
            requested,
            position(stock, sourceDistance(stock), directionSign),
            level,
            directionX,
            directionZ);
    }

    private static void putRequest(
        ReusableCoordinateTable requested,
        long position,
        int level,
        float directionX,
        float directionZ)
    {
        int existing = requested.get(position);
        requested.putMaximum(position, level);
        if (existing <= level)
        {
            REQUESTED_DIRECTION_X.put(position, Float.floatToIntBits(directionX));
            REQUESTED_DIRECTION_Z.put(position, Float.floatToIntBits(directionZ));
        }
    }

    private static long position(EntityRollingStock stock, double distance, int directionSign)
    {
        double yaw = headingRadians(stock);
        return pack(
                   MathHelper.floor_double(stock.posX + Math.cos(yaw) * distance * directionSign),
                   MathHelper.floor_double(stock.posY + 1.0D),
                   MathHelper.floor_double(stock.posZ + Math.sin(yaw) * distance * directionSign));
    }

    private static double sourceDistance(EntityRollingStock stock)
    {
        double bogieExtent = stock.getTrainSpec() == null
                             ? 0.0D
                             : Math.abs(stock.getTrainSpec().getBogieLocoPosition());
        return bogieExtent + BODY_CLEARANCE;
    }

    private static double headingRadians(EntityRollingStock stock)
    {
        return Math.toRadians(stock.rotationYaw + 90.0F);
    }

    private static void selectSources(
        World world, ReusableCoordinateTable requests, ReusableCoordinateTable sources)
    {
        sources.clear();
        SOURCE_DIRECTION_X.clear();
        SOURCE_DIRECTION_Z.clear();
        orderedKeys = ensureCapacity(orderedKeys, requests.size());
        int count = requests.copyKeys(orderedKeys);
        sortCoordinates(orderedKeys, count);
        for (int index = 0; index < count; index++)
        {
            long request = orderedKeys[index];
            long target = selectTarget(world, request, sources);
            if (target != NO_CELL)
            {
                int requestedLevel = requests.get(request);
                int existingLevel = sources.get(target);
                sources.putMaximum(target, requestedLevel);
                if (existingLevel <= requestedLevel)
                {
                    SOURCE_DIRECTION_X.put(target, REQUESTED_DIRECTION_X.get(request));
                    SOURCE_DIRECTION_Z.put(target, REQUESTED_DIRECTION_Z.get(request));
                }
            }
        }
    }

    private static long selectTarget(
        World world, long base, ReusableCoordinateTable selected)
    {
        if (world.blockExists(x(base), y(base), z(base)) == false)
        {
            return NO_CELL;
        }
        if (selectable(world, base, selected))
        {
            return base;
        }
        long raised = pack(x(base), y(base) + 1, z(base));
        return selectable(world, raised, selected) ? raised : NO_CELL;
    }

    private static boolean selectable(
        World world, long cell, ReusableCoordinateTable selected)
    {
        int x = x(cell);
        int y = y(cell);
        int z = z(cell);
        return world.blockExists(x, y, z)
               && (world.isAirBlock(x, y, z) || selected.contains(cell));
    }

    static boolean hasSources()
    {
        return SOURCES.size() > 0;
    }

    static int sourceCapacity()
    {
        return SOURCES.capacity();
    }

    static boolean sourceUsed(int slot)
    {
        return SOURCES.isUsed(slot);
    }

    static double sourceX(int slot)
    {
        return x(SOURCES.keyAt(slot)) + 0.5D;
    }

    static double sourceY(int slot)
    {
        return y(SOURCES.keyAt(slot)) + 0.5D;
    }

    static double sourceZ(int slot)
    {
        return z(SOURCES.keyAt(slot)) + 0.5D;
    }

    static int sourceLevel(int slot)
    {
        return SOURCES.valueAt(slot);
    }

    static float sourceDirectionX(int slot)
    {
        return Float.intBitsToFloat(SOURCE_DIRECTION_X.get(SOURCES.keyAt(slot)));
    }

    static float sourceDirectionZ(int slot)
    {
        return Float.intBitsToFloat(SOURCE_DIRECTION_Z.get(SOURCES.keyAt(slot)));
    }

    /** Releases every source/request table and its active-world association. */
    public static void clearAll()
    {
        REQUESTED.clear();
        REQUESTED_DIRECTION_X.clear();
        REQUESTED_DIRECTION_Z.clear();
        SOURCES.clear();
        SOURCE_DIRECTION_X.clear();
        SOURCE_DIRECTION_Z.clear();
        activeWorld = null;
    }

    static int activeCount()
    {
        return SOURCES.size();
    }

    static int reusableTableCapacityForTest(int cells)
    {
        REQUESTED.clear();
        for (int index = 0; index < cells; index++)
        {
            REQUESTED.put(pack(index, 64, index), index & 15);
        }
        return REQUESTED.capacity();
    }

    private static long[] ensureCapacity(long[] values, int capacity)
    {
        if (values.length >= capacity)
        {
            return values;
        }
        int length = values.length;
        while (length < capacity)
        {
            length *= 2;
        }
        return new long[length];
    }

    private static void sortCoordinates(long[] values, int count)
    {
        for (int index = 1; index < count; index++)
        {
            long value = values[index];
            int insertion = index;
            while (insertion > 0 && compareCoordinates(values[insertion - 1], value) > 0)
            {
                values[insertion] = values[insertion - 1];
                insertion--;
            }
            values[insertion] = value;
        }
    }

    private static int compareCoordinates(long first, long second)
    {
        int compared = Integer.compare(x(first), x(second));
        if (compared != 0)
        {
            return compared;
        }
        compared = Integer.compare(y(first), y(second));
        return compared != 0 ? compared : Integer.compare(z(first), z(second));
    }

    private static long pack(int x, int y, int z)
    {
        return ((long) x & 0x3FFFFFFL) << 38
               | ((long) z & 0x3FFFFFFL) << 12
               | ((long) y & 0xFFFL);
    }

    private static int x(long cell)
    {
        return (int)(cell >> 38);
    }

    private static int y(long cell)
    {
        return (int)(cell << 52 >> 52);
    }

    private static int z(long cell)
    {
        return (int)(cell << 26 >> 38);
    }

    private static final class ReusableCoordinateTable
    {
        private long[] keys = new long[32];
        private int[] values = new int[32];
        private boolean[] used = new boolean[32];
        private int size;

        int size()
        {
            return size;
        }

        int capacity()
        {
            return keys.length;
        }

        boolean isUsed(int slot)
        {
            return used[slot];
        }

        long keyAt(int slot)
        {
            return keys[slot];
        }

        int valueAt(int slot)
        {
            return values[slot];
        }

        boolean contains(long key)
        {
            return find(key) >= 0;
        }

        int get(long key)
        {
            int slot = find(key);
            return slot < 0 ? -1 : values[slot];
        }

        void putMaximum(long key, int value)
        {
            int slot = find(key);
            if (slot >= 0)
            {
                if (values[slot] < value)
                {
                    values[slot] = value;
                }
                return;
            }
            put(key, value);
        }

        void put(long key, int value)
        {
            if ((size + 1) * 10 >= keys.length * 6)
            {
                grow();
            }
            int slot = insertionSlot(key);
            if (used[slot])
            {
                values[slot] = value;
                return;
            }
            used[slot] = true;
            keys[slot] = key;
            values[slot] = value;
            size++;
        }

        int copyKeys(long[] destination)
        {
            int index = 0;
            for (int slot = 0; slot < keys.length; slot++)
            {
                if (used[slot])
                {
                    destination[index++] = keys[slot];
                }
            }
            return index;
        }

        void clear()
        {
            Arrays.fill(used, false);
            size = 0;
        }

        private int find(long key)
        {
            int slot = hash(key) & (keys.length - 1);
            while (used[slot])
            {
                if (keys[slot] == key)
                {
                    return slot;
                }
                slot = (slot + 1) & (keys.length - 1);
            }
            return -1;
        }

        private int insertionSlot(long key)
        {
            int slot = hash(key) & (keys.length - 1);
            while (used[slot] && keys[slot] != key)
            {
                slot = (slot + 1) & (keys.length - 1);
            }
            return slot;
        }

        private void grow()
        {
            long[] oldKeys = keys;
            int[] oldValues = values;
            boolean[] oldUsed = used;
            keys = new long[oldKeys.length * 2];
            values = new int[keys.length];
            used = new boolean[keys.length];
            size = 0;
            for (int slot = 0; slot < oldKeys.length; slot++)
            {
                if (oldUsed[slot])
                {
                    put(oldKeys[slot], oldValues[slot]);
                }
            }
        }

        private static int hash(long value)
        {
            value ^= value >>> 33;
            value *= 0xff51afd7ed558ccdL;
            value ^= value >>> 33;
            return (int) value;
        }
    }
}
