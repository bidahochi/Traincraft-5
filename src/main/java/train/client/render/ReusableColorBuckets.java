package train.client.render;

import java.util.ArrayList;
import java.util.List;

/** Exact-color buckets whose lists and backing arrays survive frame clears. */
final class ReusableColorBuckets<T> {
    private int[] colors = new int[0];
    private ArrayList<T>[] buckets = emptyBuckets();
    private int size;

    void add(int color, T value) {
        for (int index = 0; index < size; index++) {
            if (colors[index] == color) {
                buckets[index].add(value);
                return;
            }
        }
        ensureCapacity(size + 1);
        colors[size] = color;
        if (buckets[size] == null) {
            buckets[size] = new ArrayList<T>();
        }
        buckets[size].add(value);
        size++;
    }

    int size() {
        return size;
    }

    int color(int index) {
        return colors[index];
    }

    List<T> values(int index) {
        return buckets[index];
    }

    int capacity() {
        return colors.length;
    }

    Object bucketStorage(int index) {
        return buckets[index];
    }

    void clear() {
        for (int index = 0; index < size; index++) {
            buckets[index].clear();
        }
        size = 0;
    }

    void release() {
        for (ArrayList<T> bucket : buckets) {
            if (bucket != null) {
                bucket.clear();
            }
        }
        colors = new int[0];
        buckets = emptyBuckets();
        size = 0;
    }

    private void ensureCapacity(int required) {
        if (colors.length >= required) {
            return;
        }
        int capacity = Math.max(4, colors.length);
        while (capacity < required) {
            capacity <<= 1;
        }
        int[] grownColors = new int[capacity];
        System.arraycopy(colors, 0, grownColors, 0, size);
        ArrayList<T>[] grownBuckets = newBuckets(capacity);
        System.arraycopy(buckets, 0, grownBuckets, 0, buckets.length);
        colors = grownColors;
        buckets = grownBuckets;
    }

    @SuppressWarnings("unchecked")
    private static <T> ArrayList<T>[] emptyBuckets() {
        return (ArrayList<T>[]) new ArrayList<?>[0];
    }

    @SuppressWarnings("unchecked")
    private static <T> ArrayList<T>[] newBuckets(int capacity) {
        return (ArrayList<T>[]) new ArrayList<?>[capacity];
    }
}
