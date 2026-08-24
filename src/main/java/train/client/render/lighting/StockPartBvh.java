package train.client.render.lighting;

import java.util.List;
import tmt.ModelRendererTurbo;

/**
 * Two-level acceleration structure for exact ray tests against one captured vehicle.
 *
 * <p>The outer hierarchy stores stock-local bounds for model parts. Each leaf references an
 * immutable {@link ModelTriangleBvh} containing that part's model-local triangles. Root-part
 * transforms are reused while unchanged; animated or nested parts are updated and the outer
 * hierarchy is refitted at most once per frame. All traversal workspaces are retained on this
 * object so resolving multiple beams does not allocate in the render hot path.
 * Three-element geometry arrays use {@code [0] = x}, {@code [1] = y}, and {@code [2] = z}.
 * Sixteen-element transforms use OpenGL column-major order: {@code [0..3]} are column 0,
 * {@code [4..7]} column 1, {@code [8..11]} column 2, and {@code [12..15]} the
 * translation/homogeneous column.
 */
final class StockPartBvh
{
    private static final float RAY_EPSILON = 1.0E-6F;
    private static final float MATRIX_DETERMINANT_EPSILON = 1.0E-8F;
    private static final int PARTS_PER_LEAF = 4;
    private static final int MAXIMUM_NODE_FACTOR = 2;

    /** Complete source-part identity list, including parts without usable triangles. */
    private ModelRendererTurbo[] sourcePartLayout = new ModelRendererTurbo[0];
    /** Maps compact hierarchy part indices back to positions in {@link #sourcePartLayout}. */
    private int[] sourcePoseIndices = new int[0];
    /** Position {@code i} is the compact part index stored at BVH ordering slot i. */
    private int[] partOrder = new int[0];
    private RollingStockLightOcclusion.PartPose[] partPoses =
        new RollingStockLightOcclusion.PartPose[0];
    private ModelTriangleBvh[] partMeshes = new ModelTriangleBvh[0];
    /** Per-compact-part transforms; outer position i matches the other compact-part arrays. */
    private float[][] stockFromLocalTransforms = new float[0][];
    private float[][] localFromStockTransforms = new float[0][];

    /**
     * Parallel cached pose state. Position {@code i} describes compact part i; the separate named
     * arrays store root status, rotation order, scale, pivot x/y/z, and rotation x/y/z.
     */
    private boolean[] rootParts = new boolean[0];
    private boolean[] savedRotationOrders = new boolean[0];
    private float[] savedScales = new float[0];
    private float[] savedPivotX = new float[0];
    private float[] savedPivotY = new float[0];
    private float[] savedPivotZ = new float[0];
    private float[] savedRotationX = new float[0];
    private float[] savedRotationY = new float[0];
    private float[] savedRotationZ = new float[0];

    /** Parallel stock-local AABBs; position {@code i} stores the named bound for compact part i. */
    private float[] partMinimumX = new float[0];
    private float[] partMinimumY = new float[0];
    private float[] partMinimumZ = new float[0];
    private float[] partMaximumX = new float[0];
    private float[] partMaximumY = new float[0];
    private float[] partMaximumZ = new float[0];

    /** Parallel stock-local AABBs; position {@code i} stores the named bound for BVH node i. */
    private float[] nodeMinimumX = new float[0];
    private float[] nodeMinimumY = new float[0];
    private float[] nodeMinimumZ = new float[0];
    private float[] nodeMaximumX = new float[0];
    private float[] nodeMaximumY = new float[0];
    private float[] nodeMaximumZ = new float[0];
    /**
     * Parallel BVH topology. Node {@code i} uses left/right child indices, or for a leaf uses
     * {@code firstPart[i]} plus {@code partsInNode[i]} as its range in {@link #partOrder}.
     */
    private int[] leftChild = new int[0];
    private int[] rightChild = new int[0];
    private int[] firstPart = new int[0];
    private int[] partsInNode = new int[0];

    private int partCount;
    private int nodeCount;
    private long topologyRevision;
    private long preparedFrame = Long.MIN_VALUE;

    /** Reusable {@code [x, y, z]} ray vectors in stock-local and part-local space. */
    private final float[] stockOrigin = new float[3];
    private final float[] stockDirection = new float[3];
    private final float[] partOrigin = new float[3];
    private final float[] partDirection = new float[3];
    private final ModelTriangleBvh.Hit triangleHit = new ModelTriangleBvh.Hit();
    private final Hit hit = new Hit();

    /**
     * Intersects an eye-space ray with this stock's captured parts.
     *
     * @param parts current captured part poses in stable render order
     * @param frame monotonically increasing frame sequence
     * @param stockFromEye inverse transform from eye space into stock-local space
     * @param eyeOrigin ray origin in eye space
     * @param eyeDirection normalized ray direction in eye space
     * @param limit maximum accepted ray distance
     * @return reusable hit record valid until the next call on this object
     */
    Hit intersect(
        List<RollingStockLightOcclusion.PartPose> parts,
        long frame,
        float[] stockFromEye,
        float[] eyeOrigin,
        float[] eyeDirection,
        float limit)
    {
        int updatedPartCount = prepare(parts, stockFromEye, frame);
        hit.reset(limit, topologyRevision);
        hit.updatedParts = updatedPartCount;
        if (partCount == 0 || nodeCount == 0 || stockFromEye == null)
        {
            return hit;
        }

        transformPoint(stockFromEye, eyeOrigin, stockOrigin);
        transformDirection(stockFromEye, eyeDirection, stockDirection);
        if (nodeDistance(0, stockOrigin, stockDirection, limit) < Float.POSITIVE_INFINITY)
        {
            intersectNode(0, stockOrigin, stockDirection, hit);
        }
        return hit;
    }

    /** Rebuilds topology when identities change; otherwise refits animated parts once per frame. */
    private int prepare(
        List<RollingStockLightOcclusion.PartPose> parts,
        float[] stockFromEye,
        long frame)
    {
        if (matchesTopology(parts) == false)
        {
            rebuildTopology(parts, stockFromEye);
            preparedFrame = frame;
            return partCount;
        }
        if (preparedFrame == frame)
        {
            return 0;
        }

        int updatedPartCount = 0;
        for (int partIndex = 0; partIndex < partCount; partIndex++)
        {
            partPoses[partIndex] = parts.get(sourcePoseIndices[partIndex]);
            if (updatePartTransform(partIndex, stockFromEye, false))
            {
                updatedPartCount++;
            }
        }
        if (updatedPartCount != 0)
        {
            refitNodeBounds();
        }
        preparedFrame = frame;
        return updatedPartCount;
    }

    /** Reports whether captured parts retain the identities and order used by the current topology. */
    private boolean matchesTopology(List<RollingStockLightOcclusion.PartPose> parts)
    {
        if (parts == null || parts.size() != sourcePartLayout.length)
        {
            return false;
        }
        for (int sourceIndex = 0; sourceIndex < sourcePartLayout.length; sourceIndex++)
        {
            RollingStockLightOcclusion.PartPose pose = parts.get(sourceIndex);
            ModelRendererTurbo part = pose == null ? null : pose.part;
            if (part != sourcePartLayout[sourceIndex])
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Compacts triangle-bearing parts and builds the outer hierarchy.
     *
     * <p>The unfiltered identity layout is retained separately so a model topology change is
     * detected even when it only affects a part that currently has no triangles.
     */
    private void rebuildTopology(
        List<RollingStockLightOcclusion.PartPose> parts, float[] stockFromEye)
    {
        int sourceCount = parts == null ? 0 : parts.size();
        int usablePartCount = 0;
        sourcePartLayout = new ModelRendererTurbo[sourceCount];
        for (int sourceIndex = 0; sourceIndex < sourceCount; sourceIndex++)
        {
            RollingStockLightOcclusion.PartPose pose = parts.get(sourceIndex);
            ModelRendererTurbo part = pose == null ? null : pose.part;
            sourcePartLayout[sourceIndex] = part;
            if (pose != null && BeamImpactResolver.meshFor(part).empty() == false)
            {
                usablePartCount++;
            }
        }

        partCount = usablePartCount;
        allocatePartState(usablePartCount);
        int compactIndex = 0;
        for (int sourceIndex = 0; sourceIndex < sourceCount; sourceIndex++)
        {
            RollingStockLightOcclusion.PartPose pose = parts.get(sourceIndex);
            ModelTriangleBvh mesh =
                BeamImpactResolver.meshFor(pose == null ? null : pose.part);
            if (pose == null || mesh.empty())
            {
                continue;
            }

            sourcePoseIndices[compactIndex] = sourceIndex;
            partOrder[compactIndex] = compactIndex;
            partPoses[compactIndex] = pose;
            partMeshes[compactIndex] = mesh;
            stockFromLocalTransforms[compactIndex] = new float[16];
            localFromStockTransforms[compactIndex] = new float[16];
            updatePartTransform(compactIndex, stockFromEye, true);
            compactIndex++;
        }

        allocateNodeState(Math.max(1, usablePartCount * MAXIMUM_NODE_FACTOR));
        nodeCount = 0;
        if (usablePartCount != 0)
        {
            buildNode(0, usablePartCount);
        }
        topologyRevision++;
        preparedFrame = Long.MIN_VALUE;
    }

    /** Allocates parallel per-part pose, transform, mesh, and bounds storage. */
    private void allocatePartState(int size)
    {
        sourcePoseIndices = new int[size];
        partOrder = new int[size];
        partPoses = new RollingStockLightOcclusion.PartPose[size];
        partMeshes = new ModelTriangleBvh[size];
        stockFromLocalTransforms = new float[size][];
        localFromStockTransforms = new float[size][];
        rootParts = new boolean[size];
        savedRotationOrders = new boolean[size];
        savedScales = new float[size];
        savedPivotX = new float[size];
        savedPivotY = new float[size];
        savedPivotZ = new float[size];
        savedRotationX = new float[size];
        savedRotationY = new float[size];
        savedRotationZ = new float[size];
        partMinimumX = new float[size];
        partMinimumY = new float[size];
        partMinimumZ = new float[size];
        partMaximumX = new float[size];
        partMaximumY = new float[size];
        partMaximumZ = new float[size];
    }

    /** Allocates parallel BVH-node topology and bounds storage. */
    private void allocateNodeState(int size)
    {
        nodeMinimumX = new float[size];
        nodeMinimumY = new float[size];
        nodeMinimumZ = new float[size];
        nodeMaximumX = new float[size];
        nodeMaximumY = new float[size];
        nodeMaximumZ = new float[size];
        leftChild = new int[size];
        rightChild = new int[size];
        firstPart = new int[size];
        partsInNode = new int[size];
    }

    /** Returns whether this part's bounds changed and therefore require an outer-tree refit. */
    private boolean updatePartTransform(
        int partIndex, float[] stockFromEye, boolean forceUpdate)
    {
        RollingStockLightOcclusion.PartPose pose = partPoses[partIndex];
        boolean rootPart = pose != null && pose.stockRootParent;

        // A root pose depends only on its saved local transform. Nested parts also inherit parent
        // animation captured in eyeFromLocal, so they must be recomposed once every frame.
        if (forceUpdate == false
                && rootPart
                && rootParts[partIndex]
                && hasSameSavedPose(partIndex, pose))
        {
            return false;
        }

        boolean validTransform;
        if (rootPart)
        {
            validTransform = RollingStockLightOcclusion.populateRootPartMatrix(
                pose, stockFromLocalTransforms[partIndex]);
        }
        else
        {
            validTransform =
                stockFromEye != null && RollingStockLightOcclusion.ensurePartMatrices(pose);
            if (validTransform)
            {
                multiplyAffine(
                    stockFromEye, pose.eyeFromLocal, stockFromLocalTransforms[partIndex]);
            }
        }

        rootParts[partIndex] = rootPart;
        savePose(partIndex, pose);
        if (validTransform == false
                || invert(stockFromLocalTransforms[partIndex], localFromStockTransforms[partIndex])
                    == false)
        {
            markPartEmpty(partIndex);
        }
        else
        {
            calculatePartBounds(partIndex);
        }
        return true;
    }

    /** Reports whether one captured part still matches its saved animated pose fields. */
    private boolean hasSameSavedPose(
        int partIndex, RollingStockLightOcclusion.PartPose pose)
    {
        return savedRotationOrders[partIndex] == pose.rotationOrder
            && sameBits(savedScales[partIndex], pose.scale)
            && sameBits(savedPivotX[partIndex], pose.rotationPointX)
            && sameBits(savedPivotY[partIndex], pose.rotationPointY)
            && sameBits(savedPivotZ[partIndex], pose.rotationPointZ)
            && sameBits(savedRotationX[partIndex], pose.rotateAngleX)
            && sameBits(savedRotationY[partIndex], pose.rotateAngleY)
            && sameBits(savedRotationZ[partIndex], pose.rotateAngleZ);
    }

    /** Copies the animation fields used for change detection into per-part storage. */
    private void savePose(int partIndex, RollingStockLightOcclusion.PartPose pose)
    {
        if (pose == null)
        {
            return;
        }
        savedRotationOrders[partIndex] = pose.rotationOrder;
        savedScales[partIndex] = pose.scale;
        savedPivotX[partIndex] = pose.rotationPointX;
        savedPivotY[partIndex] = pose.rotationPointY;
        savedPivotZ[partIndex] = pose.rotationPointZ;
        savedRotationX[partIndex] = pose.rotateAngleX;
        savedRotationY[partIndex] = pose.rotateAngleY;
        savedRotationZ[partIndex] = pose.rotateAngleZ;
    }

    /** Compares float bit patterns so pose caching handles all exact values deterministically. */
    private static boolean sameBits(float first, float second)
    {
        return Float.floatToIntBits(first) == Float.floatToIntBits(second);
    }

    /** Transforms a mesh AABB by center/extents, avoiding eight temporary corner vectors. */
    private void calculatePartBounds(int partIndex)
    {
        ModelTriangleBvh mesh = partMeshes[partIndex];
        float[] transform = stockFromLocalTransforms[partIndex];
        float centerX = (mesh.minimumX() + mesh.maximumX()) * 0.5F;
        float centerY = (mesh.minimumY() + mesh.maximumY()) * 0.5F;
        float centerZ = (mesh.minimumZ() + mesh.maximumZ()) * 0.5F;
        float extentX = (mesh.maximumX() - mesh.minimumX()) * 0.5F;
        float extentY = (mesh.maximumY() - mesh.minimumY()) * 0.5F;
        float extentZ = (mesh.maximumZ() - mesh.minimumZ()) * 0.5F;

        float transformedCenterX = transformX(transform, centerX, centerY, centerZ);
        float transformedCenterY = transformY(transform, centerX, centerY, centerZ);
        float transformedCenterZ = transformZ(transform, centerX, centerY, centerZ);
        float transformedExtentX =
            Math.abs(transform[0]) * extentX
            + Math.abs(transform[4]) * extentY
            + Math.abs(transform[8]) * extentZ;
        float transformedExtentY =
            Math.abs(transform[1]) * extentX
            + Math.abs(transform[5]) * extentY
            + Math.abs(transform[9]) * extentZ;
        float transformedExtentZ =
            Math.abs(transform[2]) * extentX
            + Math.abs(transform[6]) * extentY
            + Math.abs(transform[10]) * extentZ;

        partMinimumX[partIndex] = transformedCenterX - transformedExtentX;
        partMaximumX[partIndex] = transformedCenterX + transformedExtentX;
        partMinimumY[partIndex] = transformedCenterY - transformedExtentY;
        partMaximumY[partIndex] = transformedCenterY + transformedExtentY;
        partMinimumZ[partIndex] = transformedCenterZ - transformedExtentZ;
        partMaximumZ[partIndex] = transformedCenterZ + transformedExtentZ;
    }

    /** Assigns inverted bounds so an unusable part cannot intersect a ray. */
    private void markPartEmpty(int partIndex)
    {
        partMinimumX[partIndex] = Float.POSITIVE_INFINITY;
        partMinimumY[partIndex] = Float.POSITIVE_INFINITY;
        partMinimumZ[partIndex] = Float.POSITIVE_INFINITY;
        partMaximumX[partIndex] = Float.NEGATIVE_INFINITY;
        partMaximumY[partIndex] = Float.NEGATIVE_INFINITY;
        partMaximumZ[partIndex] = Float.NEGATIVE_INFINITY;
    }

    /** Recursively partitions one ordered part range and returns its new node index. */
    private int buildNode(int orderedStart, int orderedCount)
    {
        int nodeIndex = nodeCount++;
        computeNodeBounds(nodeIndex, orderedStart, orderedCount);
        if (orderedCount <= PARTS_PER_LEAF)
        {
            leftChild[nodeIndex] = -1;
            rightChild[nodeIndex] = -1;
            firstPart[nodeIndex] = orderedStart;
            partsInNode[nodeIndex] = orderedCount;
            return nodeIndex;
        }

        float extentX = nodeMaximumX[nodeIndex] - nodeMinimumX[nodeIndex];
        float extentY = nodeMaximumY[nodeIndex] - nodeMinimumY[nodeIndex];
        float extentZ = nodeMaximumZ[nodeIndex] - nodeMinimumZ[nodeIndex];
        int splitAxis = extentX >= extentY && extentX >= extentZ
            ? 0
            : extentY >= extentZ ? 1 : 2;
        sortParts(orderedStart, orderedStart + orderedCount - 1, splitAxis);
        int leftCount = orderedCount / 2;
        leftChild[nodeIndex] = buildNode(orderedStart, leftCount);
        rightChild[nodeIndex] =
            buildNode(orderedStart + leftCount, orderedCount - leftCount);
        return nodeIndex;
    }

    /** Recomputes leaves and then parents in reverse construction order. */
    private void refitNodeBounds()
    {
        for (int nodeIndex = nodeCount - 1; nodeIndex >= 0; nodeIndex--)
        {
            if (partsInNode[nodeIndex] > 0)
            {
                computeNodeBounds(
                    nodeIndex, firstPart[nodeIndex], partsInNode[nodeIndex]);
                continue;
            }
            int leftIndex = leftChild[nodeIndex];
            int rightIndex = rightChild[nodeIndex];
            nodeMinimumX[nodeIndex] =
                Math.min(nodeMinimumX[leftIndex], nodeMinimumX[rightIndex]);
            nodeMinimumY[nodeIndex] =
                Math.min(nodeMinimumY[leftIndex], nodeMinimumY[rightIndex]);
            nodeMinimumZ[nodeIndex] =
                Math.min(nodeMinimumZ[leftIndex], nodeMinimumZ[rightIndex]);
            nodeMaximumX[nodeIndex] =
                Math.max(nodeMaximumX[leftIndex], nodeMaximumX[rightIndex]);
            nodeMaximumY[nodeIndex] =
                Math.max(nodeMaximumY[leftIndex], nodeMaximumY[rightIndex]);
            nodeMaximumZ[nodeIndex] =
                Math.max(nodeMaximumZ[leftIndex], nodeMaximumZ[rightIndex]);
        }
    }

    /** Computes one node's aggregate bounds from its ordered part range. */
    private void computeNodeBounds(int nodeIndex, int orderedStart, int orderedCount)
    {
        float minimumX = Float.POSITIVE_INFINITY;
        float minimumY = Float.POSITIVE_INFINITY;
        float minimumZ = Float.POSITIVE_INFINITY;
        float maximumX = Float.NEGATIVE_INFINITY;
        float maximumY = Float.NEGATIVE_INFINITY;
        float maximumZ = Float.NEGATIVE_INFINITY;
        int orderedEnd = orderedStart + orderedCount;
        for (int orderedIndex = orderedStart; orderedIndex < orderedEnd; orderedIndex++)
        {
            int partIndex = partOrder[orderedIndex];
            minimumX = Math.min(minimumX, partMinimumX[partIndex]);
            minimumY = Math.min(minimumY, partMinimumY[partIndex]);
            minimumZ = Math.min(minimumZ, partMinimumZ[partIndex]);
            maximumX = Math.max(maximumX, partMaximumX[partIndex]);
            maximumY = Math.max(maximumY, partMaximumY[partIndex]);
            maximumZ = Math.max(maximumZ, partMaximumZ[partIndex]);
        }
        nodeMinimumX[nodeIndex] = minimumX;
        nodeMinimumY[nodeIndex] = minimumY;
        nodeMinimumZ[nodeIndex] = minimumZ;
        nodeMaximumX[nodeIndex] = maximumX;
        nodeMaximumY[nodeIndex] = maximumY;
        nodeMaximumZ[nodeIndex] = maximumZ;
    }

    /** Sorts an ordered part range in place by bounds center along the split axis. */
    private void sortParts(int low, int high, int axis)
    {
        int lowerIndex = low;
        int upperIndex = high;
        float pivot = partCenter(partOrder[(low + high) >>> 1], axis);
        while (lowerIndex <= upperIndex)
        {
            while (partCenter(partOrder[lowerIndex], axis) < pivot)
            {
                lowerIndex++;
            }
            while (partCenter(partOrder[upperIndex], axis) > pivot)
            {
                upperIndex--;
            }
            if (lowerIndex <= upperIndex)
            {
                int swap = partOrder[lowerIndex];
                partOrder[lowerIndex++] = partOrder[upperIndex];
                partOrder[upperIndex--] = swap;
            }
        }
        if (low < upperIndex)
        {
            sortParts(low, upperIndex, axis);
        }
        if (lowerIndex < high)
        {
            sortParts(lowerIndex, high, axis);
        }
    }

    /** Returns one transformed part bound's center coordinate on the requested axis. */
    private float partCenter(int partIndex, int axis)
    {
        if (axis == 0)
        {
            return (partMinimumX[partIndex] + partMaximumX[partIndex]) * 0.5F;
        }
        if (axis == 1)
        {
            return (partMinimumY[partIndex] + partMaximumY[partIndex]) * 0.5F;
        }
        return (partMinimumZ[partIndex] + partMaximumZ[partIndex]) * 0.5F;
    }

    /** Traverses nearer child bounds first so an exact hit tightens the remaining limit early. */
    private void intersectNode(
        int nodeIndex, float[] origin, float[] direction, Hit result)
    {
        if (partsInNode[nodeIndex] > 0)
        {
            int orderedEnd = firstPart[nodeIndex] + partsInNode[nodeIndex];
            for (int orderedIndex = firstPart[nodeIndex];
                 orderedIndex < orderedEnd;
                 orderedIndex++)
            {
                int partIndex = partOrder[orderedIndex];
                if (partDistance(partIndex, origin, direction, result.distance)
                        == Float.POSITIVE_INFINITY)
                {
                    continue;
                }
                result.testedParts++;
                transformPoint(
                    localFromStockTransforms[partIndex], origin, partOrigin);
                transformDirection(
                    localFromStockTransforms[partIndex], direction, partDirection);
                triangleHit.reset(result.distance);
                partMeshes[partIndex].intersect(
                    partOrigin, partDirection, result.distance, triangleHit);
                result.testedTriangles += triangleHit.testedTriangles;
                if (triangleHit.triangleOffset >= 0
                        && triangleHit.distance < result.distance)
                {
                    result.distance = triangleHit.distance;
                    result.pose = partPoses[partIndex];
                    result.mesh = partMeshes[partIndex];
                    result.triangleOffset = triangleHit.triangleOffset;
                }
            }
            return;
        }

        int leftIndex = leftChild[nodeIndex];
        int rightIndex = rightChild[nodeIndex];
        float leftDistance = nodeDistance(leftIndex, origin, direction, result.distance);
        float rightDistance = nodeDistance(rightIndex, origin, direction, result.distance);
        if (leftDistance <= rightDistance)
        {
            if (leftDistance < Float.POSITIVE_INFINITY)
            {
                intersectNode(leftIndex, origin, direction, result);
            }
            if (rightDistance <= result.distance)
            {
                intersectNode(rightIndex, origin, direction, result);
            }
        }
        else
        {
            if (rightDistance < Float.POSITIVE_INFINITY)
            {
                intersectNode(rightIndex, origin, direction, result);
            }
            if (leftDistance <= result.distance)
            {
                intersectNode(leftIndex, origin, direction, result);
            }
        }
    }

    /** Returns the ray-entry distance for one transformed part bound. */
    private float partDistance(
        int partIndex, float[] origin, float[] direction, float limit)
    {
        return rayBounds(
            partMinimumX[partIndex], partMinimumY[partIndex], partMinimumZ[partIndex],
            partMaximumX[partIndex], partMaximumY[partIndex], partMaximumZ[partIndex],
            origin, direction, limit);
    }

    /** Returns the ray-entry distance for one aggregate BVH-node bound. */
    private float nodeDistance(
        int nodeIndex, float[] origin, float[] direction, float limit)
    {
        return rayBounds(
            nodeMinimumX[nodeIndex], nodeMinimumY[nodeIndex], nodeMinimumZ[nodeIndex],
            nodeMaximumX[nodeIndex], nodeMaximumY[nodeIndex], nodeMaximumZ[nodeIndex],
            origin, direction, limit);
    }

    /** Slab intersection returning the entry distance or positive infinity for a miss. */
    private static float rayBounds(
        float minimumX,
        float minimumY,
        float minimumZ,
        float maximumX,
        float maximumY,
        float maximumZ,
        float[] origin,
        float[] direction,
        float limit)
    {
        float nearDistance = 0.0F;
        float farDistance = limit;
        for (int axis = 0; axis < 3; axis++)
        {
            float minimum = axis == 0 ? minimumX : axis == 1 ? minimumY : minimumZ;
            float maximum = axis == 0 ? maximumX : axis == 1 ? maximumY : maximumZ;
            if (Math.abs(direction[axis]) <= RAY_EPSILON)
            {
                if (origin[axis] < minimum || origin[axis] > maximum)
                {
                    return Float.POSITIVE_INFINITY;
                }
                continue;
            }

            float firstDistance = (minimum - origin[axis]) / direction[axis];
            float secondDistance = (maximum - origin[axis]) / direction[axis];
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

    /** Multiplies column-major affine transforms without allocating a general matrix object. */
    private static void multiplyAffine(float[] first, float[] second, float[] result)
    {
        for (int column = 0; column < 3; column++)
        {
            int offset = column * 4;
            float x = second[offset];
            float y = second[offset + 1];
            float z = second[offset + 2];
            result[offset] = first[0] * x + first[4] * y + first[8] * z;
            result[offset + 1] = first[1] * x + first[5] * y + first[9] * z;
            result[offset + 2] = first[2] * x + first[6] * y + first[10] * z;
            result[offset + 3] = 0.0F;
        }
        result[12] = transformX(first, second[12], second[13], second[14]);
        result[13] = transformY(first, second[12], second[13], second[14]);
        result[14] = transformZ(first, second[12], second[13], second[14]);
        result[15] = 1.0F;
    }

    /**
     * Inverts the affine upper 3x3 and translation of a column-major transform.
     *
     * @return false when the transform is singular and cannot safely transform a ray
     */
    static boolean invert(float[] matrix, float[] inverse)
    {
        float m00 = matrix[0];
        float m01 = matrix[4];
        float m02 = matrix[8];
        float m10 = matrix[1];
        float m11 = matrix[5];
        float m12 = matrix[9];
        float m20 = matrix[2];
        float m21 = matrix[6];
        float m22 = matrix[10];
        float determinant =
            m00 * (m11 * m22 - m12 * m21)
            - m01 * (m10 * m22 - m12 * m20)
            + m02 * (m10 * m21 - m11 * m20);
        if (Math.abs(determinant) <= MATRIX_DETERMINANT_EPSILON)
        {
            return false;
        }

        float inverseDeterminant = 1.0F / determinant;
        float i00 = (m11 * m22 - m12 * m21) * inverseDeterminant;
        float i01 = (m02 * m21 - m01 * m22) * inverseDeterminant;
        float i02 = (m01 * m12 - m02 * m11) * inverseDeterminant;
        float i10 = (m12 * m20 - m10 * m22) * inverseDeterminant;
        float i11 = (m00 * m22 - m02 * m20) * inverseDeterminant;
        float i12 = (m02 * m10 - m00 * m12) * inverseDeterminant;
        float i20 = (m10 * m21 - m11 * m20) * inverseDeterminant;
        float i21 = (m01 * m20 - m00 * m21) * inverseDeterminant;
        float i22 = (m00 * m11 - m01 * m10) * inverseDeterminant;

        inverse[0] = i00;
        inverse[4] = i01;
        inverse[8] = i02;
        inverse[1] = i10;
        inverse[5] = i11;
        inverse[9] = i12;
        inverse[2] = i20;
        inverse[6] = i21;
        inverse[10] = i22;
        inverse[3] = 0.0F;
        inverse[7] = 0.0F;
        inverse[11] = 0.0F;
        inverse[12] = -(i00 * matrix[12] + i01 * matrix[13] + i02 * matrix[14]);
        inverse[13] = -(i10 * matrix[12] + i11 * matrix[13] + i12 * matrix[14]);
        inverse[14] = -(i20 * matrix[12] + i21 * matrix[13] + i22 * matrix[14]);
        inverse[15] = 1.0F;
        return true;
    }

    /** Transforms one three-component point by a column-major affine matrix. */
    private static void transformPoint(float[] matrix, float[] input, float[] output)
    {
        output[0] = transformX(matrix, input[0], input[1], input[2]);
        output[1] = transformY(matrix, input[0], input[1], input[2]);
        output[2] = transformZ(matrix, input[0], input[1], input[2]);
    }

    /** Transforms one direction by the linear portion of a column-major affine matrix. */
    private static void transformDirection(float[] matrix, float[] input, float[] output)
    {
        float x = input[0];
        float y = input[1];
        float z = input[2];
        output[0] = matrix[0] * x + matrix[4] * y + matrix[8] * z;
        output[1] = matrix[1] * x + matrix[5] * y + matrix[9] * z;
        output[2] = matrix[2] * x + matrix[6] * y + matrix[10] * z;
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

    /** Mutable result reused to expose traversal diagnostics without allocating per ray. */
    static final class Hit
    {
        float distance;
        RollingStockLightOcclusion.PartPose pose;
        ModelTriangleBvh mesh;
        int triangleOffset;
        int testedParts;
        int testedTriangles;
        int updatedParts;
        long topologyRevision;

        void reset(float limit, long revision)
        {
            distance = limit;
            pose = null;
            mesh = null;
            triangleOffset = -1;
            testedParts = 0;
            testedTriangles = 0;
            updatedParts = 0;
            topologyRevision = revision;
        }
    }
}
