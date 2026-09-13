package train.client.render.lighting;

import java.util.List;
import tmt.ModelRendererTurbo;
import tmt.TexturedPolygon;
import tmt.TexturedVertex;

/**
 * Immutable model-local triangles arranged in a binary bounding-volume hierarchy.
 *
 * <p>Polygons are triangulated once as a fan and reordered by centroid while the hierarchy is
 * built. Runtime queries traverse the nearer child first and write into a caller-owned result,
 * avoiding allocations while multiple beams test the same model part during a frame.
 * Ray arrays use {@code [0] = x}, {@code [1] = y}, and {@code [2] = z}.
 */
final class ModelTriangleBvh
{
    private static final float EPSILON = 1.0E-6F;
    private static final int LEAF_TRIANGLES = 8;
    private static final int TRIANGLE_VERTEX_COUNT = 3;
    private static final int TRIANGLE_COMPONENT_COUNT = 9;
    private static final int MAXIMUM_NODE_FACTOR = 2;
    static final ModelTriangleBvh EMPTY = new ModelTriangleBvh();

    /**
     * Flat triangle records with nine floats per triangle:
     * {@code [0..2] = vertex A x/y/z}, {@code [3..5] = vertex B x/y/z}, and
     * {@code [6..8] = vertex C x/y/z}, repeated from each triangle's base offset.
     */
    private final float[] triangles;
    /** Parallel node AABBs; position {@code i} is the named minimum/maximum axis for node i. */
    private final float[] minimumX, minimumY, minimumZ;
    private final float[] maximumX, maximumY, maximumZ;
    /**
     * Parallel node topology. For node {@code i}, left/right select child nodes; leaf nodes use
     * {@code firstTriangle[i]} and {@code triangleCountByNode[i]} as their triangle range.
     */
    private final int[] leftChild, rightChild, firstTriangle, triangleCountByNode;
    private int nodeCount;

    /** Creates the shared empty mesh used when a model part has no usable triangles. */
    private ModelTriangleBvh()
    {
        triangles = new float[0];
        minimumX = new float[0];
        minimumY = new float[0];
        minimumZ = new float[0];
        maximumX = new float[0];
        maximumY = new float[0];
        maximumZ = new float[0];
        leftChild = new int[0];
        rightChild = new int[0];
        firstTriangle = new int[0];
        triangleCountByNode = new int[0];
    }

    /** Builds immutable BVH node storage around one packed triangle array. */
    private ModelTriangleBvh(float[] triangleData, int triangleCount)
    {
        triangles = triangleData;
        int maximumNodes = Math.max(1, triangleCount * MAXIMUM_NODE_FACTOR);
        minimumX = new float[maximumNodes];
        minimumY = new float[maximumNodes];
        minimumZ = new float[maximumNodes];
        maximumX = new float[maximumNodes];
        maximumY = new float[maximumNodes];
        maximumZ = new float[maximumNodes];
        leftChild = new int[maximumNodes];
        rightChild = new int[maximumNodes];
        firstTriangle = new int[maximumNodes];
        triangleCountByNode = new int[maximumNodes];
        buildNode(0, triangleCount);
    }

    /** Builds immutable triangle data for one shared TMT model part. */
    static ModelTriangleBvh build(ModelRendererTurbo part)
    {
        List<TexturedPolygon> faces = part == null ? null : part.faces;
        if (faces == null)
        {
            return EMPTY;
        }
        int triangleCount = 0;
        for (TexturedPolygon polygon : faces)
        {
            TexturedVertex[] vertices = polygon == null ? null : polygon.vertices;
            if (vertices == null || vertices.length < 3 || usable(vertices[0]) == false)
            {
                continue;
            }
            for (int index = 1; index + 1 < vertices.length; index++)
            {
                if (usable(vertices[index]) && usable(vertices[index + 1]))
                {
                    triangleCount++;
                }
            }
        }
        if (triangleCount == 0)
        {
            return EMPTY;
        }
        float[] triangleData = new float[triangleCount * TRIANGLE_COMPONENT_COUNT];
        int outputOffset = 0;
        for (TexturedPolygon polygon : faces)
        {
            TexturedVertex[] vertices = polygon == null ? null : polygon.vertices;
            if (vertices == null || vertices.length < 3 || usable(vertices[0]) == false)
            {
                continue;
            }
            for (int index = 1; index + 1 < vertices.length; index++)
            {
                if (usable(vertices[index]) == false || usable(vertices[index + 1]) == false)
                {
                    continue;
                }
                outputOffset = copyVertex(triangleData, outputOffset, vertices[0]);
                outputOffset = copyVertex(triangleData, outputOffset, vertices[index]);
                outputOffset = copyVertex(triangleData, outputOffset, vertices[index + 1]);
            }
        }
        return new ModelTriangleBvh(triangleData, triangleCount);
    }

    boolean empty()
    {
        return triangles.length == 0;
    }

    float minimumX()
    {
        return empty() ? 0.0F : minimumX[0];
    }

    float minimumY()
    {
        return empty() ? 0.0F : minimumY[0];
    }

    float minimumZ()
    {
        return empty() ? 0.0F : minimumZ[0];
    }

    float maximumX()
    {
        return empty() ? 0.0F : maximumX[0];
    }

    float maximumY()
    {
        return empty() ? 0.0F : maximumY[0];
    }

    float maximumZ()
    {
        return empty() ? 0.0F : maximumZ[0];
    }

    /** Intersects a model-local ray and updates {@code hit} when a nearer triangle is found. */
    void intersect(float[] origin, float[] direction, float limit, Hit hit)
    {
        if (empty() || rayBounds(0, origin, direction, limit) == Float.POSITIVE_INFINITY)
        {
            return;
        }
        intersectNode(0, origin, direction, hit);
    }

    /** Copies one packed triangle into caller-owned vertex workspaces. */
    void copyTriangle(
        int offset, float[] firstVertex, float[] secondVertex, float[] thirdVertex)
    {
        firstVertex[0] = triangles[offset];
        firstVertex[1] = triangles[offset + 1];
        firstVertex[2] = triangles[offset + 2];
        secondVertex[0] = triangles[offset + 3];
        secondVertex[1] = triangles[offset + 4];
        secondVertex[2] = triangles[offset + 5];
        thirdVertex[0] = triangles[offset + 6];
        thirdVertex[1] = triangles[offset + 7];
        thirdVertex[2] = triangles[offset + 8];
    }

    /** Recursively partitions one triangle range and returns its new node index. */
    private int buildNode(int triangleFirst, int triangleCount)
    {
        int nodeIndex = nodeCount++;
        computeBounds(nodeIndex, triangleFirst, triangleCount);
        if (triangleCount <= LEAF_TRIANGLES)
        {
            leftChild[nodeIndex] = -1;
            rightChild[nodeIndex] = -1;
            firstTriangle[nodeIndex] = triangleFirst;
            triangleCountByNode[nodeIndex] = triangleCount;
            return nodeIndex;
        }
        float extentX = maximumX[nodeIndex] - minimumX[nodeIndex];
        float extentY = maximumY[nodeIndex] - minimumY[nodeIndex];
        float extentZ = maximumZ[nodeIndex] - minimumZ[nodeIndex];
        int axis;
        if (extentX >= extentY && extentX >= extentZ)
        {
            axis = 0;
        }
        else
        {
            axis = extentY >= extentZ ? 1 : 2;
        }
        sortTriangles(triangleFirst, triangleFirst + triangleCount - 1, axis);
        int leftCount = triangleCount / 2;
        leftChild[nodeIndex] = buildNode(triangleFirst, leftCount);
        rightChild[nodeIndex] = buildNode(
            triangleFirst + leftCount, triangleCount - leftCount);
        firstTriangle[nodeIndex] = 0;
        triangleCountByNode[nodeIndex] = 0;
        return nodeIndex;
    }

    /** Computes one node's bounds from its ordered packed-triangle range. */
    private void computeBounds(int nodeIndex, int triangleFirst, int triangleCount)
    {
        float boundsMinimumX = Float.POSITIVE_INFINITY;
        float boundsMinimumY = Float.POSITIVE_INFINITY;
        float boundsMinimumZ = Float.POSITIVE_INFINITY;
        float boundsMaximumX = Float.NEGATIVE_INFINITY;
        float boundsMaximumY = Float.NEGATIVE_INFINITY;
        float boundsMaximumZ = Float.NEGATIVE_INFINITY;
        int end = (triangleFirst + triangleCount) * TRIANGLE_COMPONENT_COUNT;
        for (int offset = triangleFirst * TRIANGLE_COMPONENT_COUNT;
                offset < end;
                offset += TRIANGLE_VERTEX_COUNT)
        {
            float x = triangles[offset];
            float y = triangles[offset + 1];
            float z = triangles[offset + 2];
            boundsMinimumX = Math.min(boundsMinimumX, x);
            boundsMinimumY = Math.min(boundsMinimumY, y);
            boundsMinimumZ = Math.min(boundsMinimumZ, z);
            boundsMaximumX = Math.max(boundsMaximumX, x);
            boundsMaximumY = Math.max(boundsMaximumY, y);
            boundsMaximumZ = Math.max(boundsMaximumZ, z);
        }
        minimumX[nodeIndex] = boundsMinimumX;
        minimumY[nodeIndex] = boundsMinimumY;
        minimumZ[nodeIndex] = boundsMinimumZ;
        maximumX[nodeIndex] = boundsMaximumX;
        maximumY[nodeIndex] = boundsMaximumY;
        maximumZ[nodeIndex] = boundsMaximumZ;
    }

    /** Sorts a triangle range in place by centroid along the selected split axis. */
    private void sortTriangles(int low, int high, int axis)
    {
        int firstIndex = low;
        int secondIndex = high;
        float pivot = centroid((low + high) >>> 1, axis);
        while (firstIndex <= secondIndex)
        {
            while (centroid(firstIndex, axis) < pivot)
            {
                firstIndex++;
            }
            while (centroid(secondIndex, axis) > pivot)
            {
                secondIndex--;
            }
            if (firstIndex <= secondIndex)
            {
                swapTriangles(firstIndex, secondIndex);
                firstIndex++;
                secondIndex--;
            }
        }
        if (low < secondIndex)
        {
            sortTriangles(low, secondIndex, axis);
        }
        if (firstIndex < high)
        {
            sortTriangles(firstIndex, high, axis);
        }
    }

    /** Returns one packed triangle's centroid coordinate on the requested axis. */
    private float centroid(int triangle, int axis)
    {
        int offset = triangle * TRIANGLE_COMPONENT_COUNT + axis;
        return (triangles[offset] + triangles[offset + 3] + triangles[offset + 6]) / 3.0F;
    }

    /** Exchanges two complete nine-component triangles in packed storage. */
    private void swapTriangles(int firstTriangle, int secondTriangle)
    {
        if (firstTriangle == secondTriangle)
        {
            return;
        }
        int firstOffset = firstTriangle * TRIANGLE_COMPONENT_COUNT;
        int secondOffset = secondTriangle * TRIANGLE_COMPONENT_COUNT;
        for (int index = 0; index < TRIANGLE_COMPONENT_COUNT; index++)
        {
            float swap = triangles[firstOffset + index];
            triangles[firstOffset + index] = triangles[secondOffset + index];
            triangles[secondOffset + index] = swap;
        }
    }

    /** Traverses nearer child bounds first so the hit distance prunes the farther branch. */
    private void intersectNode(int nodeIndex, float[] origin, float[] direction, Hit hit)
    {
        if (triangleCountByNode[nodeIndex] > 0)
        {
            int end = firstTriangle[nodeIndex] + triangleCountByNode[nodeIndex];
            for (int triangle = firstTriangle[nodeIndex]; triangle < end; triangle++)
            {
                hit.testedTriangles++;
                float distance = intersectTriangle(
                    origin, direction, triangle * TRIANGLE_COMPONENT_COUNT, hit.distance);
                if (distance < hit.distance)
                {
                    hit.distance = distance;
                    hit.triangleOffset = triangle * TRIANGLE_COMPONENT_COUNT;
                }
            }
            return;
        }
        int leftNode = leftChild[nodeIndex];
        int rightNode = rightChild[nodeIndex];
        float leftDistance = rayBounds(leftNode, origin, direction, hit.distance);
        float rightDistance = rayBounds(rightNode, origin, direction, hit.distance);
        if (leftDistance <= rightDistance)
        {
            if (leftDistance < Float.POSITIVE_INFINITY)
            {
                intersectNode(leftNode, origin, direction, hit);
            }
            if (rightDistance <= hit.distance)
            {
                intersectNode(rightNode, origin, direction, hit);
            }
        }
        else
        {
            if (rightDistance < Float.POSITIVE_INFINITY)
            {
                intersectNode(rightNode, origin, direction, hit);
            }
            if (leftDistance <= hit.distance)
            {
                intersectNode(leftNode, origin, direction, hit);
            }
        }
    }

    /** Returns the ray's entry distance into one node bound, or positive infinity on a miss. */
    private float rayBounds(int nodeIndex, float[] origin, float[] direction, float limit)
    {
        float nearDistance = 0.0F;
        float farDistance = limit;
        for (int axis = 0; axis < 3; axis++)
        {
            float minimum = axis == 0
                            ? minimumX[nodeIndex]
                            : axis == 1 ? minimumY[nodeIndex] : minimumZ[nodeIndex];
            float maximum = axis == 0
                            ? maximumX[nodeIndex]
                            : axis == 1 ? maximumY[nodeIndex] : maximumZ[nodeIndex];
            if (Math.abs(direction[axis]) <= EPSILON)
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

    /** Double-sided Moller-Trumbore intersection against one packed triangle. */
    private float intersectTriangle(float[] origin, float[] direction, int offset, float limit)
    {
        float firstX = triangles[offset];
        float firstY = triangles[offset + 1];
        float firstZ = triangles[offset + 2];
        float firstEdgeX = triangles[offset + 3] - firstX;
        float firstEdgeY = triangles[offset + 4] - firstY;
        float firstEdgeZ = triangles[offset + 5] - firstZ;
        float secondEdgeX = triangles[offset + 6] - firstX;
        float secondEdgeY = triangles[offset + 7] - firstY;
        float secondEdgeZ = triangles[offset + 8] - firstZ;
        float directionCrossX = direction[1] * secondEdgeZ - direction[2] * secondEdgeY;
        float directionCrossY = direction[2] * secondEdgeX - direction[0] * secondEdgeZ;
        float directionCrossZ = direction[0] * secondEdgeY - direction[1] * secondEdgeX;
        float determinant =
            firstEdgeX * directionCrossX
            + firstEdgeY * directionCrossY
            + firstEdgeZ * directionCrossZ;
        if (Math.abs(determinant) <= EPSILON)
        {
            return Float.POSITIVE_INFINITY;
        }
        float inverseDeterminant = 1.0F / determinant;
        float originOffsetX = origin[0] - firstX;
        float originOffsetY = origin[1] - firstY;
        float originOffsetZ = origin[2] - firstZ;
        float firstBarycentric =
            (originOffsetX * directionCrossX
             + originOffsetY * directionCrossY
             + originOffsetZ * directionCrossZ)
            * inverseDeterminant;
        if (firstBarycentric < -EPSILON || firstBarycentric > 1.0F + EPSILON)
        {
            return Float.POSITIVE_INFINITY;
        }
        float originCrossX = originOffsetY * firstEdgeZ - originOffsetZ * firstEdgeY;
        float originCrossY = originOffsetZ * firstEdgeX - originOffsetX * firstEdgeZ;
        float originCrossZ = originOffsetX * firstEdgeY - originOffsetY * firstEdgeX;
        float secondBarycentric =
            (direction[0] * originCrossX
             + direction[1] * originCrossY
             + direction[2] * originCrossZ)
            * inverseDeterminant;
        if (secondBarycentric < -EPSILON
                || firstBarycentric + secondBarycentric > 1.0F + EPSILON)
        {
            return Float.POSITIVE_INFINITY;
        }
        float distance =
            (secondEdgeX * originCrossX
             + secondEdgeY * originCrossY
             + secondEdgeZ * originCrossZ)
            * inverseDeterminant;
        return distance > EPSILON && distance <= limit ? distance : Float.POSITIVE_INFINITY;
    }

    /** Copies one finite model vertex into packed triangle storage and returns the next offset. */
    private static int copyVertex(float[] destination, int offset, TexturedVertex vertex)
    {
        destination[offset++] = vertex.vector3F.xCoord;
        destination[offset++] = vertex.vector3F.yCoord;
        destination[offset++] = vertex.vector3F.zCoord;
        return offset;
    }

    /** Reports whether a model vertex contains a finite three-dimensional position. */
    private static boolean usable(TexturedVertex vertex)
    {
        return vertex != null && vertex.vector3F != null;
    }

    /** Mutable query result retained by the caller to avoid allocations between ray tests. */
    static final class Hit
    {
        float distance;
        int triangleOffset;
        int testedTriangles;

        void reset(float limit)
        {
            distance = limit;
            triangleOffset = -1;
            testedTriangles = 0;
        }
    }
}
