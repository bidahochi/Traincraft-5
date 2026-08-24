package train.client.render.lighting;

import java.util.List;

/** Reusable insertion-ordered frame table keyed by owner id and stable fixture id. */
final class FrameFixtureQueue<T>
{
    private static final int INITIAL_CAPACITY = 16;

    /**
     * Open-addressed fixture records and their insertion order. At hash-table slot {@code i},
     * {@code owners[i]}, {@code fixtureIds[i]}, and {@code values[i]} describe the same fixture.
     * At logical queue position {@code j}, {@code insertionOrder[j]} stores the occupied hash-table
     * slot used to recover that fixture in insertion order.
     */
    private int[] owners = new int[INITIAL_CAPACITY];
    private String[] fixtureIds = new String[INITIAL_CAPACITY];
    private Object[] values = new Object[INITIAL_CAPACITY];
    private int[] insertionOrder = new int[INITIAL_CAPACITY];
    private int size;

    T get(int ownerId, String fixtureId)
    {
        int slot = find(ownerId, fixtureId);
        return slot < 0 ? null : value(slot);
    }

    T put(int ownerId, String fixtureId, T value)
    {
        if (fixtureId == null)
        {
            throw new IllegalArgumentException("fixtureId cannot be null");
        }
        if (value == null)
        {
            throw new IllegalArgumentException("value cannot be null");
        }
        if ((size + 1) * 3 >= values.length * 2)
        {
            grow();
        }
        int mask = values.length - 1;
        int slot = hash(ownerId, fixtureId) & mask;
        while (values[slot] != null)
        {
            if (owners[slot] == ownerId && fixtureIds[slot].equals(fixtureId))
            {
                T previous = value(slot);
                values[slot] = value;
                return previous;
            }
            slot = (slot + 1) & mask;
        }
        owners[slot] = ownerId;
        fixtureIds[slot] = fixtureId;
        values[slot] = value;
        insertionOrder[size++] = slot;
        return null;
    }

    boolean isEmpty()
    {
        return size == 0;
    }

    int size()
    {
        return size;
    }

    void addValuesTo(List<T> destination)
    {
        for (int index = 0; index < size; index++)
        {
            destination.add(value(insertionOrder[index]));
        }
    }

    void clear()
    {
        for (int index = 0; index < size; index++)
        {
            int slot = insertionOrder[index];
            fixtureIds[slot] = null;
            values[slot] = null;
        }
        size = 0;
    }

    private int find(int ownerId, String fixtureId)
    {
        if (fixtureId == null)
        {
            return -1;
        }
        int mask = values.length - 1;
        int slot = hash(ownerId, fixtureId) & mask;
        while (values[slot] != null)
        {
            if (owners[slot] == ownerId && fixtureIds[slot].equals(fixtureId))
            {
                return slot;
            }
            slot = (slot + 1) & mask;
        }
        return -1;
    }

    private void grow()
    {
        int[] oldOwners = owners;
        String[] oldFixtureIds = fixtureIds;
        Object[] oldValues = values;
        int[] oldInsertionOrder = insertionOrder;
        int oldSize = size;
        int capacity = values.length << 1;
        owners = new int[capacity];
        fixtureIds = new String[capacity];
        values = new Object[capacity];
        insertionOrder = new int[capacity];
        size = 0;
        for (int index = 0; index < oldSize; index++)
        {
            int slot = oldInsertionOrder[index];
            put(oldOwners[slot], oldFixtureIds[slot], valueFrom(oldValues, slot));
        }
    }

    @SuppressWarnings("unchecked")
    private T value(int slot)
    {
        return (T) values[slot];
    }

    @SuppressWarnings("unchecked")
    private T valueFrom(Object[] source, int slot)
    {
        return (T) source[slot];
    }

    private static int hash(int ownerId, String fixtureId)
    {
        int value = 31 * ownerId + fixtureId.hashCode();
        value ^= value >>> 16;
        return value;
    }
}
