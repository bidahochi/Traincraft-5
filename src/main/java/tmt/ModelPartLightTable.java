package tmt;

/**
 * Reusable allocation-free, draw-scoped lookup from model-part key to lighting policy.
 * The open-addressed table retains storage across {@link #reset(int)} calls and clamps stored
 * intensities to {@code [0,1]}; it is mutable, not thread-safe, and owned by one render context.
 */
public final class ModelPartLightTable
{
    private static final int MINIMUM_CAPACITY = 4;
    private String[] keys = new String[0];
    private float[] intensities = new float[0];
    private Mode[] modes = new Mode[0];
    private int[] occupiedSlots = new int[0];
    private int occupiedCount;

    /** Clears entries and ensures capacity for the expected number of keys. */
    public void reset(int expectedKeys)
    {
        clear();
        ensureCapacity(expectedKeys);
    }

    /** Inserts or replaces a valid key with a normalized intensity and draw policy. */
    public void put(String key, float intensity, Mode mode)
    {
        if (key == null || key.trim().isEmpty() || mode == null)
        {
            return;
        }
        ensureCapacity(occupiedCount + 1);
        int slot = slot(key);
        if (keys[slot] == null)
        {
            keys[slot] = key;
            occupiedSlots[occupiedCount++] = slot;
        }
        intensities[slot] = clamp(intensity);
        modes[slot] = mode;
    }

    /** Returns an immutable value snapshot for {@code key}, or null when absent. */
    public Entry entry(String key)
    {
        int slot = find(key);
        return slot < 0 ? null : new Entry(intensities[slot], modes[slot]);
    }

    public float intensity(String key)
    {
        int slot = find(key);
        return slot < 0 ? 0.0F : intensities[slot];
    }

    public Mode mode(String key)
    {
        int slot = find(key);
        return slot < 0 ? null : modes[slot];
    }

    /** Removes entries without releasing the reusable backing arrays. */
    public void clear()
    {
        for (int index = 0; index < occupiedCount; index++)
        {
            int slot = occupiedSlots[index];
            keys[slot] = null;
            modes[slot] = null;
            intensities[slot] = 0.0F;
        }
        occupiedCount = 0;
    }

    int occupiedCount()
    {
        return occupiedCount;
    }
    int capacity()
    {
        return keys.length;
    }
    Object keyStorage()
    {
        return keys;
    }

    private void ensureCapacity(int expectedKeys)
    {
        int required = MINIMUM_CAPACITY;
        while (required < expectedKeys * 2)
        {
            required <<= 1;
        }
        if (keys.length >= required)
        {
            return;
        }
        String[] oldKeys = keys;
        float[] oldIntensities = intensities;
        Mode[] oldModes = modes;
        keys = new String[required];
        intensities = new float[required];
        modes = new Mode[required];
        occupiedSlots = new int[required];
        occupiedCount = 0;
        for (int index = 0; index < oldKeys.length; index++)
        {
            if (oldKeys[index] != null)
            {
                put(oldKeys[index], oldIntensities[index], oldModes[index]);
            }
        }
    }

    private int slot(String key)
    {
        int mask = keys.length - 1;
        int slot = spread(key.hashCode()) & mask;
        while (keys[slot] != null && keys[slot].equals(key) == false)
        {
            slot = slot + 1 & mask;
        }
        return slot;
    }

    private int find(String key)
    {
        if (key == null || keys.length == 0)
        {
            return -1;
        }
        int mask = keys.length - 1;
        int slot = spread(key.hashCode()) & mask;
        while (keys[slot] != null)
        {
            if (keys[slot].equals(key))
            {
                return slot;
            }
            slot = slot + 1 & mask;
        }
        return -1;
    }

    private static float clamp(float value)
    {
        return Float.isNaN(value) == false && Float.isInfinite(value) == false
               ? Math.max(0.0F, Math.min(1.0F, value)) : 0.0F;
    }

    private static int spread(int hash)
    {
        return hash ^ hash >>> 16;
    }

    /** Selects how a part combines ambient packed light with authored emission. */
    public enum Mode { AMBIENT, FULL_BRIGHT, EMISSION_INTENSITY, LIGHT_FLOOR }

    /** Immutable lookup result detached from later table mutations. */
    public static final class Entry
    {
        private final float intensity;
        private final Mode mode;
        Entry(float intensity, Mode mode)
        {
            this.intensity = intensity;
            this.mode = mode;
        }
        public float intensity()
        {
            return intensity;
        }
        public Mode mode()
        {
            return mode;
        }
    }
}
