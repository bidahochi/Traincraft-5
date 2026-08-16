package train.client.render;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/** Access-ordered set used for bounded log-once diagnostics. */
final class BoundedSet<T> {
    private static final Boolean PRESENT = Boolean.TRUE;
    private final int maximumSize;
    private final LinkedHashMap<T, Boolean> values =
            new LinkedHashMap<T, Boolean>(16, 0.75F, true);

    BoundedSet(int maximumSize) {
        this.maximumSize = maximumSize;
    }

    synchronized boolean add(T value) {
        boolean added = values.put(value, PRESENT) == null;
        while (values.size() > maximumSize) {
            Iterator<Map.Entry<T, Boolean>> iterator = values.entrySet().iterator();
            iterator.next();
            iterator.remove();
        }
        return added;
    }

    synchronized void clear() {
        values.clear();
    }
}
