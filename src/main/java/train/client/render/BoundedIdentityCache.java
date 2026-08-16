package train.client.render;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/** Small access-ordered identity cache with deterministic strong-reference bounds. */
public final class BoundedIdentityCache<K, V> {
    private final int maximumSize;
    private final LinkedHashMap<IdentityKey<K>, V> values =
            new LinkedHashMap<IdentityKey<K>, V>(16, 0.75F, true);

    public BoundedIdentityCache(int maximumSize) {
        if (maximumSize <= 0) {
            throw new IllegalArgumentException("maximumSize must be positive");
        }
        this.maximumSize = maximumSize;
    }

    public synchronized V get(K key) {
        return values.get(new IdentityKey<K>(key));
    }

    public synchronized void put(K key, V value) {
        values.put(new IdentityKey<K>(key), value);
        while (values.size() > maximumSize) {
            Iterator<Map.Entry<IdentityKey<K>, V>> iterator = values.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
    }

    public synchronized void clear() {
        values.clear();
    }

    public synchronized int size() {
        return values.size();
    }

    private static final class IdentityKey<K> {
        private final K value;
        private final int hash;

        IdentityKey(K value) {
            this.value = value;
            hash = System.identityHashCode(value);
        }

        @Override
        public boolean equals(Object other) {
            return other instanceof IdentityKey && ((IdentityKey<?>) other).value == value;
        }

        @Override
        public int hashCode() {
            return hash;
        }
    }
}
