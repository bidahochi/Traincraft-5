package train.client.render.lighting;

/**
 * Frame-local conservative reach volumes used to skip unnecessary stock-geometry capture.
 *
 * <p>A target is retained when it owns a projected light or when its bounding sphere overlaps a
 * beam's conservative reach sphere. Unknown reach is used while fixture metadata is unresolved;
 * it intentionally disables this optimization rather than risking missing occlusion geometry.
 */
final class BeamOcclusionDemand
{
    private static final int INITIAL_CAPACITY = 8;
    private static final int CAPACITY_GROWTH_FACTOR = 2;

    /**
     * Parallel reach records. Array position {@code i} identifies one emitting entity's aggregate
     * conservative reach volume: {@code ownerIds[i]} is the emitting rolling-stock entity ID,
     * {@code centerX/Y/Z[i]} its world-space sphere center, and {@code reachRadius[i]} its radius.
     */
    private int[] ownerIds = new int[INITIAL_CAPACITY];
    private double[] centerX = new double[INITIAL_CAPACITY];
    private double[] centerY = new double[INITIAL_CAPACITY];
    private double[] centerZ = new double[INITIAL_CAPACITY];
    private float[] reachRadius = new float[INITIAL_CAPACITY];
    private int size;
    private boolean unknownReach;

    /** Clears logical entries while retaining primitive-array capacity for the next frame. */
    void reset()
    {
        size = 0;
        unknownReach = false;
    }

    /** Conservatively requests all stock geometry until cold fixture discovery has completed. */
    void includeUnknownReach()
    {
        unknownReach = true;
    }

    /**
     * Adds one emitting entity's allocation-free aggregate conservative beam reach volume.
     *
     * @param ownerId emitting rolling-stock entity ID
     * @param centerX world-space sphere center x
     * @param centerY world-space sphere center y
     * @param centerZ world-space sphere center z
     * @param radius aggregate beam reach plus the emitting stock's bounds radius
     */
    void add(int ownerId, double centerX, double centerY, double centerZ, float radius)
    {
        if (radius <= 0.0F)
        {
            return;
        }
        ensureCapacity(size + 1);
        ownerIds[size] = ownerId;
        this.centerX[size] = centerX;
        this.centerY[size] = centerY;
        this.centerZ[size] = centerZ;
        reachRadius[size] = radius;
        size++;
    }

    /** @return whether this frame can require any rolling-stock occlusion geometry */
    boolean any()
    {
        return unknownReach || size != 0;
    }

    /**
     * Tests whether a stock bounds sphere can affect any requested beam.
     * Owning stock always qualifies so its visible pixels retain the correct owner code in the
     * screen-space mask instead of being mislabeled as farther foreign stock.
     *
     * @return whether exact geometry capture should remain enabled for the target stock
     */
    boolean reaches(
        int targetOwnerId, double targetX, double targetY, double targetZ, float targetRadius)
    {
        if (unknownReach)
        {
            return true;
        }
        float safeTargetRadius = Math.max(0.0F, targetRadius);
        for (int index = 0; index < size; index++)
        {
            if (ownerIds[index] == targetOwnerId)
            {
                return true;
            }
            double deltaX = targetX - centerX[index];
            double deltaY = targetY - centerY[index];
            double deltaZ = targetZ - centerZ[index];
            double combinedRadius = reachRadius[index] + safeTargetRadius;
            if (deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ
                    <= combinedRadius * combinedRadius)
            {
                return true;
            }
        }
        return false;
    }

    /** Expands every parallel reach-record array while preserving existing entries. */
    private void ensureCapacity(int required)
    {
        if (required <= ownerIds.length)
        {
            return;
        }
        int capacity = Math.max(required, ownerIds.length * CAPACITY_GROWTH_FACTOR);
        ownerIds = copy(ownerIds, capacity);
        centerX = copy(centerX, capacity);
        centerY = copy(centerY, capacity);
        centerZ = copy(centerZ, capacity);
        reachRadius = copy(reachRadius, capacity);
    }

    /** Copies an integer array into a newly allocated array of the requested size. */
    private static int[] copy(int[] source, int size)
    {
        int[] result = new int[size];
        System.arraycopy(source, 0, result, 0, source.length);
        return result;
    }

    /** Copies a double array into a newly allocated array of the requested size. */
    private static double[] copy(double[] source, int size)
    {
        double[] result = new double[size];
        System.arraycopy(source, 0, result, 0, source.length);
        return result;
    }

    /** Copies a float array into a newly allocated array of the requested size. */
    private static float[] copy(float[] source, int size)
    {
        float[] result = new float[size];
        System.arraycopy(source, 0, result, 0, source.length);
        return result;
    }
}
