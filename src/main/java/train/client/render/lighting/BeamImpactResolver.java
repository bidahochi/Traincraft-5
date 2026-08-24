package train.client.render.lighting;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import tmt.ModelRendererTurbo;

/**
 * Exact center-ray intersection against rolling-stock geometry captured in the current frame.
 *
 * <p>Bounds are transformed eagerly once per stock, while part hierarchies and immutable triangle
 * hierarchies remain lazy until a center ray reaches the unexpanded stock bounds. Candidate stocks
 * are processed nearest-first so an early exact hit tightens later traversal limits. This class is
 * render-thread-only; its static vectors and candidate arrays intentionally avoid per-beam garbage.
 * Every three-element geometry array in this class uses {@code [0] = x}, {@code [1] = y}, and
 * {@code [2] = z}. Every 16-element transform uses OpenGL column-major order: indices
 * {@code [0, 1, 2, 3]} are column 0, {@code [4, 5, 6, 7]} column 1,
 * {@code [8, 9, 10, 11]} column 2, and {@code [12, 13, 14, 15]} the translation/homogeneous
 * column.
 */
final class BeamImpactResolver
{
    private static final float EPSILON = 1.0E-6F;
    private static final int INITIAL_CANDIDATE_CAPACITY = 32;
    private static final int CAPACITY_GROWTH_FACTOR = 2;
    /** Reusable {@code [x, y, z]} ray, triangle-vertex, and bounds vectors. */
    private static final float[] RAY_ORIGIN = new float[3];
    private static final float[] RAY_DIRECTION = new float[3];
    private static final float[] TRIANGLE_FIRST = new float[3];
    private static final float[] TRIANGLE_SECOND = new float[3];
    private static final float[] TRIANGLE_THIRD = new float[3];
    private static final float[] BOUNDS_MINIMUM = new float[3];
    private static final float[] BOUNDS_MAXIMUM = new float[3];
    private static final List<CachedEntry> FRAME_CACHE = new ArrayList<CachedEntry>();
    private static final IdentityHashMap<ModelRendererTurbo, ModelTriangleBvh> MODEL_BVHS =
        new IdentityHashMap<ModelRendererTurbo, ModelTriangleBvh>();
    private static final IdentityHashMap<RollingStockLightOcclusion.Entry, StockPartBvh> PART_BVHS =
        new IdentityHashMap<RollingStockLightOcclusion.Entry, StockPartBvh>();
    private static final int MAXIMUM_PART_BVHS = 256;
    /**
     * Parallel nearest-first candidate records. At candidate slot {@code i},
     * {@code candidateIndices[i]} selects {@link #FRAME_CACHE} and
     * {@code candidateDistances[i]} is that stock's ray-entry distance.
     */
    private static int[] candidateIndices = new int[INITIAL_CANDIDATE_CAPACITY];
    private static float[] candidateDistances = new float[INITIAL_CANDIDATE_CAPACITY];
    private static int preparedEntries;
    private static boolean framePrepared;
    private static long frameSequence;

    /** Prevents construction of the frame-local resolver utility. */
    private BeamImpactResolver() {}

    /** Builds the cheap per-stock bounds cache. Triangle data remains lazy until a center-ray hit. */
    static void beginFrame()
    {
        frameSequence++;
        if (frameSequence == 0)
        {
            frameSequence = 1;
        }
        List<RollingStockLightOcclusion.Entry> entries = RollingStockLightOcclusion.entries();
        while (FRAME_CACHE.size() < entries.size())
        {
            FRAME_CACHE.add(new CachedEntry());
        }
        preparedEntries = entries.size();
        for (int index = 0; index < preparedEntries; index++)
        {
            FRAME_CACHE.get(index).prepare(entries.get(index));
        }
        framePrepared = true;
    }

    /** Releases frame-owned entry references while retaining all reusable hierarchy storage. */
    static void clearFrame()
    {
        for (int index = 0; index < preparedEntries; index++)
        {
            FRAME_CACHE.get(index).release();
        }
        preparedEntries = 0;
        framePrepared = false;
    }

    /** Clears frame state and bounded model/stock hierarchy caches during world/resource cleanup. */
    static void clearAll()
    {
        clearFrame();
        MODEL_BVHS.clear();
        PART_BVHS.clear();
    }

    static int cachedModelCount()
    {
        return MODEL_BVHS.size();
    }

    /**
     * Resolves exact center termination and conservative wide-beam fallback distance.
     * The emitting stock is excluded by owner id.
     */
    static BeamImpactResolution resolveStock(
        LightEffectSubmission submission, float maximumDistance, float beamWidth)
    {
        if (maximumDistance <= EPSILON)
        {
            return BeamImpactResolution.NONE;
        }
        BeamSurfacePlacement.Point localOrigin =
            BeamSurfacePlacement.rayOrigin(
                submission.x, submission.y, submission.z,
                submission.dx, submission.dy, submission.dz);
        submission.eyePoint(localOrigin.x(), localOrigin.y(), localOrigin.z(), RAY_ORIGIN);
        submission.eyeDirection(submission.dx, submission.dy, submission.dz, RAY_DIRECTION);
        normalize(RAY_DIRECTION);

        BeamImpact nearest = null;
        float conservativeDistance = Float.POSITIVE_INFINITY;
        List<RollingStockLightOcclusion.Entry> entries = RollingStockLightOcclusion.entries();
        ensureFrame(entries);
        ensureCandidateCapacity(entries.size());
        int candidateCount = 0;
        for (int entryIndex = 0; entryIndex < entries.size(); entryIndex++)
        {
            RollingStockLightOcclusion.Entry entry = entries.get(entryIndex);
            if (entry.ownerId == submission.ownerId)
            {
                continue;
            }
            CachedEntry cached = FRAME_CACHE.get(entryIndex);
            float wideBoundary = intersectBounds(
                cached, RAY_ORIGIN, RAY_DIRECTION, maximumDistance, beamWidth);
            if (wideBoundary == Float.POSITIVE_INFINITY)
            {
                continue;
            }
            conservativeDistance = Math.min(conservativeDistance, wideBoundary);

            // Edge-only overlap is handled by the shadow path. Do not scan the complete model
            // unless the center path can actually enter the stock's unexpanded bounds.
            float exactBoundary = intersectBounds(
                cached, RAY_ORIGIN, RAY_DIRECTION, maximumDistance, 0.0F);
            if (exactBoundary == Float.POSITIVE_INFINITY)
            {
                continue;
            }
            // Keep candidates ordered by entry distance. A near exact hit then eliminates every
            // remaining stock whose bounds begin beyond it, regardless of world render order.
            int insertion = candidateCount;
            while (insertion > 0 && candidateDistances[insertion - 1] > exactBoundary)
            {
                candidateDistances[insertion] = candidateDistances[insertion - 1];
                candidateIndices[insertion] = candidateIndices[insertion - 1];
                insertion--;
            }
            candidateDistances[insertion] = exactBoundary;
            candidateIndices[insertion] = entryIndex;
            candidateCount++;
        }

        float exactLimit = maximumDistance;
        RollingStockLightOcclusion.PartPose winningPose = null;
        ModelTriangleBvh winningMesh = null;
        int winningTriangleOffset = -1;
        int winningOwner = Integer.MIN_VALUE;
        for (int candidateIndex = 0; candidateIndex < candidateCount; candidateIndex++)
        {
            if (candidateDistances[candidateIndex] > exactLimit)
            {
                break;
            }
            CachedEntry cached = FRAME_CACHE.get(candidateIndices[candidateIndex]);
            if (cached.inverseValid == false)
            {
                continue;
            }
            StockPartBvh.Hit partHit = partBvhFor(cached.source).intersect(
                cached.source.parts,
                frameSequence,
                cached.stockFromEye,
                RAY_ORIGIN,
                RAY_DIRECTION,
                exactLimit);
            if (partHit.pose != null && partHit.distance < exactLimit)
            {
                exactLimit = partHit.distance;
                winningPose = partHit.pose;
                winningMesh = partHit.mesh;
                winningTriangleOffset = partHit.triangleOffset;
                winningOwner = cached.source.ownerId;
            }
        }
        if (winningPose != null)
        {
            if (RollingStockLightOcclusion.ensurePartMatrices(winningPose))
            {
                nearest = createImpact(
                    exactLimit, winningOwner, winningPose, winningMesh, winningTriangleOffset);
            }
        }
        return nearest == null && conservativeDistance == Float.POSITIVE_INFINITY
               ? BeamImpactResolution.NONE
               : new BeamImpactResolution(nearest, conservativeDistance);
    }

    /**
     * Intersects a double-sided triangle and orients its normal against the incoming ray.
     * This allocation-producing form is retained for focused geometry tests; frame rendering uses
     * {@link ModelTriangleBvh} and caller-owned hit workspaces.
     */
    static BeamImpact intersectTriangle(
        float[] origin, float[] direction,
        float[] firstVertex, float[] secondVertex, float[] thirdVertex, float maximumDistance)
    {
        float edge1X = secondVertex[0] - firstVertex[0];
        float edge1Y = secondVertex[1] - firstVertex[1];
        float edge1Z = secondVertex[2] - firstVertex[2];
        float edge2X = thirdVertex[0] - firstVertex[0];
        float edge2Y = thirdVertex[1] - firstVertex[1];
        float edge2Z = thirdVertex[2] - firstVertex[2];
        float directionCrossSecondEdgeX = direction[1] * edge2Z - direction[2] * edge2Y;
        float directionCrossSecondEdgeY = direction[2] * edge2X - direction[0] * edge2Z;
        float directionCrossSecondEdgeZ = direction[0] * edge2Y - direction[1] * edge2X;
        float determinant =
            edge1X * directionCrossSecondEdgeX
            + edge1Y * directionCrossSecondEdgeY
            + edge1Z * directionCrossSecondEdgeZ;
        if (Math.abs(determinant) <= EPSILON)
        {
            return null;
        }
        float inverseDeterminant = 1.0F / determinant;
        float originOffsetX = origin[0] - firstVertex[0];
        float originOffsetY = origin[1] - firstVertex[1];
        float originOffsetZ = origin[2] - firstVertex[2];
        float firstBarycentricCoordinate =
            (originOffsetX * directionCrossSecondEdgeX
             + originOffsetY * directionCrossSecondEdgeY
             + originOffsetZ * directionCrossSecondEdgeZ)
            * inverseDeterminant;
        if (firstBarycentricCoordinate < -EPSILON
                || firstBarycentricCoordinate > 1.0F + EPSILON)
        {
            return null;
        }
        float originOffsetCrossFirstEdgeX = originOffsetY * edge1Z - originOffsetZ * edge1Y;
        float originOffsetCrossFirstEdgeY = originOffsetZ * edge1X - originOffsetX * edge1Z;
        float originOffsetCrossFirstEdgeZ = originOffsetX * edge1Y - originOffsetY * edge1X;
        float secondBarycentricCoordinate =
            (direction[0] * originOffsetCrossFirstEdgeX
             + direction[1] * originOffsetCrossFirstEdgeY
             + direction[2] * originOffsetCrossFirstEdgeZ)
            * inverseDeterminant;
        if (secondBarycentricCoordinate < -EPSILON
                || firstBarycentricCoordinate + secondBarycentricCoordinate > 1.0F + EPSILON)
        {
            return null;
        }
        float distance =
            (edge2X * originOffsetCrossFirstEdgeX
             + edge2Y * originOffsetCrossFirstEdgeY
             + edge2Z * originOffsetCrossFirstEdgeZ)
            * inverseDeterminant;
        if (distance <= EPSILON || distance > maximumDistance)
        {
            return null;
        }
        float normalX = edge1Y * edge2Z - edge1Z * edge2Y;
        float normalY = edge1Z * edge2X - edge1X * edge2Z;
        float normalZ = edge1X * edge2Y - edge1Y * edge2X;
        float normalLength = length(normalX, normalY, normalZ);
        if (normalLength <= EPSILON)
        {
            return null;
        }
        normalX /= normalLength;
        normalY /= normalLength;
        normalZ /= normalLength;
        if (normalX * direction[0] + normalY * direction[1] + normalZ * direction[2] > 0.0F)
        {
            normalX = -normalX;
            normalY = -normalY;
            normalZ = -normalZ;
        }
        return new BeamImpact(
            BeamImpact.Target.ROLLING_STOCK,
            distance,
            origin[0] + direction[0] * distance,
            origin[1] + direction[1] * distance,
            origin[2] + direction[2] * distance,
            normalX, normalY, normalZ);
    }

    /** Returns slab entry distance for an axis-aligned bound, or positive infinity on a miss. */
    static float intersectAxisAlignedBounds(
        float[] origin, float[] direction, float[] minimum, float[] maximum, float limit)
    {
        float nearDistance = 0.0F;
        float farDistance = limit;
        for (int axis = 0; axis < 3; axis++)
        {
            if (Math.abs(direction[axis]) <= EPSILON)
            {
                if (origin[axis] < minimum[axis] || origin[axis] > maximum[axis])
                {
                    return Float.POSITIVE_INFINITY;
                }
                continue;
            }
            float firstDistance = (minimum[axis] - origin[axis]) / direction[axis];
            float secondDistance = (maximum[axis] - origin[axis]) / direction[axis];
            if (firstDistance > secondDistance)
            {
                float swap = firstDistance;
                firstDistance = secondDistance;
                secondDistance = swap;
            }
            nearDistance = Math.max(nearDistance, firstDistance);
            farDistance = Math.min(farDistance, secondDistance);
            if (farDistance < nearDistance)
            {
                return Float.POSITIVE_INFINITY;
            }
        }
        return nearDistance <= limit && farDistance >= 0.0F
               ? Math.max(0.0F, nearDistance)
               : Float.POSITIVE_INFINITY;
    }

    /** Intersects the current ray with one cached stock AABB expanded by the beam radius. */
    private static float intersectBounds(
        CachedEntry entry,
        float[] origin, float[] direction, float maximumDistance, float expansion)
    {
        float[] minimum = BOUNDS_MINIMUM;
        float[] maximum = BOUNDS_MAXIMUM;
        for (int axis = 0; axis < 3; axis++)
        {
            minimum[axis] = entry.minimum[axis] - expansion;
            maximum[axis] = entry.maximum[axis] + expansion;
        }
        return intersectAxisAlignedBounds(origin, direction, minimum, maximum, maximumDistance);
    }

    /** Rebuilds frame bounds when the captured-entry set no longer matches the prepared cache. */
    private static void ensureFrame(List<RollingStockLightOcclusion.Entry> entries)
    {
        if (framePrepared == false || preparedEntries != entries.size())
        {
            beginFrame();
            return;
        }
        for (int index = 0; index < preparedEntries; index++)
        {
            if (FRAME_CACHE.get(index).source != entries.get(index))
            {
                beginFrame();
                return;
            }
        }
    }

    /** Expands the parallel nearest-first candidate arrays when capacity is insufficient. */
    private static void ensureCandidateCapacity(int required)
    {
        if (candidateIndices.length >= required)
        {
            return;
        }
        int capacity = Math.max(required, candidateIndices.length * CAPACITY_GROWTH_FACTOR);
        candidateIndices = new int[capacity];
        candidateDistances = new float[capacity];
    }

    /** Returns immutable triangle geometry shared by every instance of the model part. */
    static ModelTriangleBvh meshFor(ModelRendererTurbo part)
    {
        ModelTriangleBvh mesh = MODEL_BVHS.get(part);
        if (mesh == null)
        {
            mesh = ModelTriangleBvh.build(part);
            MODEL_BVHS.put(part, mesh);
        }
        return mesh;
    }

    /** Returns the reusable animated-part BVH associated with one captured stock entry. */
    private static StockPartBvh partBvhFor(RollingStockLightOcclusion.Entry entry)
    {
        StockPartBvh bvh = PART_BVHS.get(entry);
        if (bvh != null)
        {
            return bvh;
        }
        if (PART_BVHS.size() >= MAXIMUM_PART_BVHS)
        {
            PART_BVHS.clear();
        }
        bvh = new StockPartBvh();
        PART_BVHS.put(entry, bvh);
        return bvh;
    }

    /** Creates an eye-space stock impact from the exact triangle hit and incoming ray. */
    private static BeamImpact createImpact(
        float distance,
        int ownerId,
        RollingStockLightOcclusion.PartPose pose,
        ModelTriangleBvh mesh,
        int triangleOffset)
    {
        mesh.copyTriangle(
            triangleOffset, TRIANGLE_FIRST, TRIANGLE_SECOND, TRIANGLE_THIRD);
        transformPoint(pose.eyeFromLocal, TRIANGLE_FIRST, TRIANGLE_FIRST);
        transformPoint(pose.eyeFromLocal, TRIANGLE_SECOND, TRIANGLE_SECOND);
        transformPoint(pose.eyeFromLocal, TRIANGLE_THIRD, TRIANGLE_THIRD);
        float edge1X = TRIANGLE_SECOND[0] - TRIANGLE_FIRST[0];
        float edge1Y = TRIANGLE_SECOND[1] - TRIANGLE_FIRST[1];
        float edge1Z = TRIANGLE_SECOND[2] - TRIANGLE_FIRST[2];
        float edge2X = TRIANGLE_THIRD[0] - TRIANGLE_FIRST[0];
        float edge2Y = TRIANGLE_THIRD[1] - TRIANGLE_FIRST[1];
        float edge2Z = TRIANGLE_THIRD[2] - TRIANGLE_FIRST[2];
        float normalX = edge1Y * edge2Z - edge1Z * edge2Y;
        float normalY = edge1Z * edge2X - edge1X * edge2Z;
        float normalZ = edge1X * edge2Y - edge1Y * edge2X;
        float normalLength = length(normalX, normalY, normalZ);
        if (normalLength <= EPSILON)
        {
            return null;
        }
        normalX /= normalLength;
        normalY /= normalLength;
        normalZ /= normalLength;
        if (normalX * RAY_DIRECTION[0]
                + normalY * RAY_DIRECTION[1]
                + normalZ * RAY_DIRECTION[2] > 0.0F)
        {
            normalX = -normalX;
            normalY = -normalY;
            normalZ = -normalZ;
        }
        return new BeamImpact(
            BeamImpact.Target.ROLLING_STOCK,
            distance,
            RAY_ORIGIN[0] + RAY_DIRECTION[0] * distance,
            RAY_ORIGIN[1] + RAY_DIRECTION[1] * distance,
            RAY_ORIGIN[2] + RAY_DIRECTION[2] * distance,
            normalX, normalY, normalZ,
            ownerId);
    }

    /** Transforms one three-component point by an OpenGL column-major affine matrix. */
    private static void transformPoint(float[] matrix, float[] input, float[] output)
    {
        float x = input[0];
        float y = input[1];
        float z = input[2];
        output[0] = transformX(matrix, x, y, z);
        output[1] = transformY(matrix, x, y, z);
        output[2] = transformZ(matrix, x, y, z);
    }

    /** Calculates the transformed x component of one affine point. */
    private static float transformX(float[] matrix, float x, float y, float z)
    {
        return matrix[0] * x + matrix[4] * y + matrix[8] * z + matrix[12];
    }

    /** Calculates the transformed y component of one affine point. */
    private static float transformY(float[] matrix, float x, float y, float z)
    {
        return matrix[1] * x + matrix[5] * y + matrix[9] * z + matrix[13];
    }

    /** Calculates the transformed z component of one affine point. */
    private static float transformZ(float[] matrix, float x, float y, float z)
    {
        return matrix[2] * x + matrix[6] * y + matrix[10] * z + matrix[14];
    }

    /** Normalizes a three-component vector in place, using forward for a degenerate vector. */
    private static void normalize(float[] vector)
    {
        float magnitude = length(vector[0], vector[1], vector[2]);
        if (magnitude <= EPSILON)
        {
            vector[0] = 0.0F;
            vector[1] = 0.0F;
            vector[2] = 1.0F;
            return;
        }
        vector[0] /= magnitude;
        vector[1] /= magnitude;
        vector[2] /= magnitude;
    }
    /** Returns the Euclidean length of a three-component vector. */
    private static float length(float x, float y, float z)
    {
        return (float)Math.sqrt(x * x + y * y + z * z);
    }

    /** Reusable per-stock bounds transformed once for the current frame. */
    private static final class CachedEntry
    {
        RollingStockLightOcclusion.Entry source;
        /** Stock eye-space AABB: each array is {@code [x, y, z]}. */
        final float[] minimum = new float[3];
        final float[] maximum = new float[3];
        /** Eye-to-stock affine transform in the class-level 16-slot column-major layout. */
        final float[] stockFromEye = new float[16];
        boolean inverseValid;

        void prepare(RollingStockLightOcclusion.Entry entry)
        {
            source = entry;
            inverseValid =
                entry != null && StockPartBvh.invert(entry.eyeFromStock, stockFromEye);
            for (int axis = 0; axis < 3; axis++)
            {
                minimum[axis] = Float.POSITIVE_INFINITY;
                maximum[axis] = Float.NEGATIVE_INFINITY;
            }
            if (entry == null || entry.bounds == null)
            {
                return;
            }
            for (int corner = 0; corner < 8; corner++)
            {
                float x = (corner & 1) == 0
                          ? entry.bounds.minimumX : entry.bounds.maximumX;
                float y = (corner & 2) == 0
                          ? entry.bounds.minimumY : entry.bounds.maximumY;
                float z = (corner & 4) == 0
                          ? entry.bounds.minimumZ : entry.bounds.maximumZ;
                float eyeX = transformX(entry.eyeFromStock, x, y, z);
                float eyeY = transformY(entry.eyeFromStock, x, y, z);
                float eyeZ = transformZ(entry.eyeFromStock, x, y, z);
                minimum[0] = Math.min(minimum[0], eyeX);
                minimum[1] = Math.min(minimum[1], eyeY);
                minimum[2] = Math.min(minimum[2], eyeZ);
                maximum[0] = Math.max(maximum[0], eyeX);
                maximum[1] = Math.max(maximum[1], eyeY);
                maximum[2] = Math.max(maximum[2], eyeZ);
            }
        }

        void release()
        {
            source = null;
            inverseValid = false;
        }
    }
}
