package train.client.render.lighting;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Small synchronized, access-ordered LRU cache whose keys compare by object identity.
 * Keys and values are held strongly until eviction or {@link #clear()}; the deterministic
 * maximum exists to bound long-lived model/resource references.
 */
public final class BoundedIdentityCache<K, V>
{
    private final int maximumSize;
    private final LinkedHashMap<IdentityKey<K>, V> values =
        new LinkedHashMap<IdentityKey<K>, V>(16, 0.75F, true);

    /** Creates a cache with a positive hard entry limit. */
    public BoundedIdentityCache(int maximumSize)
    {
        if (maximumSize <= 0)
        {
            throw new IllegalArgumentException("maximumSize must be positive");
        }
        this.maximumSize = maximumSize;
    }

    public synchronized V get(K key)
    {
        return values.get(new IdentityKey<K>(key));
    }

    /** Inserts a value and immediately evicts least-recently-used identities over the limit. */
    public synchronized void put(K key, V value)
    {
        values.put(new IdentityKey<K>(key), value);
        while (values.size() > maximumSize)
        {
            Iterator<Map.Entry<IdentityKey<K>, V >> iterator = values.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
    }

    public synchronized void clear()
    {
        values.clear();
    }

    public synchronized int size()
    {
        return values.size();
    }

    private static final class IdentityKey<K>
    {
        private final K value;
        private final int hash;

        IdentityKey(K value)
        {
            this.value = value;
            hash = System.identityHashCode(value);
        }

        @Override
        public boolean equals(Object other)
        {
            return other instanceof IdentityKey && ((IdentityKey<?>) other).value == value;
        }

        @Override
        public int hashCode()
        {
            return hash;
        }
    }
}
